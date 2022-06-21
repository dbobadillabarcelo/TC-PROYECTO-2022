package com.primerproyecto;

import com.primerproyecto.symbolsTable.Funcion;
import com.primerproyecto.symbolsTable.Id;
import com.primerproyecto.symbolsTable.TablaSimbolos;
import com.primerproyecto.symbolsTable.Variable;
import org.antlr.v4.runtime.tree.Trees;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.tree.ParseTree;

import com.primerproyecto.tp2Parser.*;
import java.util.Collection;
import java.util.List;
import java.util.ArrayList;
import com.primerproyecto.errors.CustomErrors;


public class MyListener extends tp2BaseListener {

    private TablaSimbolos simbolos = new TablaSimbolos();
    private CustomErrors errors = new CustomErrors();

    private String posicionDelToken(Token token){
        return "[" + token.getLine() + ":" + token.getCharPositionInLine() + "]";
    }

    private boolean coincideTipoDato(String tipoDato, String tipoDatoFactor) {
        if (tipoDato.equals(tipoDatoFactor))
            return true;
        else
            return false;
    }

    private String getTipoString(int type) {
        switch (type) {
            case tp2Lexer.INTEGER:
                return "int";
            case tp2Lexer.DECIMAL:
                return "double";
            case tp2Lexer.CHARACTER:
                return "char";
            default:
                return null;
        }
    }

    private Id getID(String id) { return simbolos.buscarIdGlobal(id); }

    private Id getIDLocal(String id){ return simbolos.buscarIdLocal(id); }

    private boolean esFuncion(Id id){ return id instanceof Funcion; }

    private Collection<ParseTree> encontrarFactoresSinArgumentos(ParseTree ctx){
        Collection<ParseTree> factores = Trees.findAllRuleNodes(ctx, tp2Parser.RULE_factor);
        Collection<ParseTree> llamadaFuncion = Trees.findAllRuleNodes(ctx, tp2Parser.RULE_llamadaFuncion);
        Collection<ParseTree> factoresLlamadaFuncion;
        for (ParseTree parseTree : llamadaFuncion) {
            factoresLlamadaFuncion = Trees.findAllRuleNodes(parseTree, tp2Parser.RULE_factor);
            factores.removeAll(factoresLlamadaFuncion);
        }
        return factores;
    }
    
    private boolean tieneParametros(List<Variable> parametros, String nameVar){
        return parametros.stream()
                         .filter(param -> param.getTokenNombre().equals(nameVar))
                         .findFirst()
                         .isPresent();
    }

    private List<Variable> getParametros(ParametrosContext ctx){
        List<Variable> params = new ArrayList<Variable>();
        Collection<ParseTree> parametros = Trees.findAllRuleNodes(ctx, tp2Parser.RULE_declaracion);
        for (ParseTree parseTree : parametros) {
            DeclaracionContext decl = (DeclaracionContext)parseTree;
            if(tieneParametros(params, decl.ID().getText())){
                errors. idRedefinido(posicionDelToken(ctx.getStart()), decl.ID().getText());
                return null;
            }
            Variable var = new Variable(true, false, decl.tipoDato().getText(), decl.ID().getText());
            params.add(var);
        }
        return params;
    }


    private boolean analisisFactores(Id caller, String tipoDato, Collection<ParseTree> factores) {
        FactorContext fc;
        boolean error = true;
        for (ParseTree parseTree : factores) {
            fc = (FactorContext) parseTree;
            
            if (fc.ID() != null){
                String idFactor = fc.ID().getText();
                Id id = getID(idFactor);
                if (id == null){
                    errors.idNoDeclarado(posicionDelToken(fc.getStart()), idFactor);
                    error = false;
                }else if(!id.isInicializado()){
                    errors.idNoInicializado(posicionDelToken(fc.getStart()), idFactor);
                    error = false;
                }else{
                    id.setUsado(true);
                    if (tipoDato != null  && !coincideTipoDato(tipoDato, id.getTipoDato())){
                        if(esFuncion(caller))
                            errors.idDiferenteTiposParamArgs(posicionDelToken(fc.getStart()), id.getTipoDato(), tipoDato, id.getTokenNombre());
                        else
                            errors.idDistintosTipos(posicionDelToken(fc.getStart()), id.getTipoDato(), tipoDato);
                    }
                }
            } else if(fc.llamadaFuncion() != null){
                procesarLlamadaFuncion(tipoDato, fc.llamadaFuncion());
            } else if (fc.INTEGER() != null || fc.DECIMAL() != null || fc.CHARACTER() != null) {
                if (tipoDato != null  && !coincideTipoDato(tipoDato, getTipoString(fc.getStop().getType()))){
                    if(esFuncion(caller))
                        errors.idDiferenteTiposParamArgs(posicionDelToken(fc.getStart()), getTipoString(fc.getStop().getType()), tipoDato, fc.getText());
                    else
                        errors.idDistintosTipos(posicionDelToken(fc.getStart()), getTipoString(fc.getStop().getType()), tipoDato);
                }
            }
        }
        return error;
    }

    private void procesarInstruccionAsignacion(AsignacionContext ctx) {
        Id id = getID(ctx.ID().getText());
        if (id != null) {
            Collection<ParseTree> factores = encontrarFactoresSinArgumentos(ctx);
            if(analisisFactores(null, id.getTipoDato(), factores))
                id.setInicializado(true);
        } else
            errors.idNoDeclarado(posicionDelToken(ctx.getStart()), ctx.ID().getText());
    }

    private void procesarDeclaracion(DeclaracionContext ctx) {
        Collection<ParseTree> factores = encontrarFactoresSinArgumentos(ctx);
        if (getIDLocal(ctx.ID().getText()) == null) {
            Id id = new Variable(false, false, ctx.tipoDato().getText(), ctx.ID().getText());
            simbolos.agregarEnContextoActual(ctx.ID().getText(), id);
            if (ctx.asign() != null) {
                if(analisisFactores(null, ctx.tipoDato().getText(), factores))
                    id.setInicializado(true);
            }
        } else{
            analisisFactores(null, ctx.tipoDato().getText(), factores);
            errors.idDeclarado(posicionDelToken(ctx.getStart()), ctx.ID().getText());
        }
    }

    private Id processFunction(DefinicionFuncionContext ctx){
        Id id = getIDLocal(ctx.ID().getText());
        if(id == null){
            List<Variable> parametros = getParametros(ctx.parametros());
            if(parametros != null){
                Id idFunction = new Funcion(true, false, ctx.tipoDato().getText(), ctx.ID().getText(), parametros);
                simbolos.agregarEnContextoActual(ctx.ID().getText(), idFunction);
                return idFunction;
            }
        }else if(!esFuncion(id)){
            errors.idDeclarado(posicionDelToken(ctx.getStart()), ctx.ID().getText());
        }else if(esFuncion(id) && id.isInicializado()){
            errors.idDeclarado(posicionDelToken(ctx.getStart()), ctx.ID().getText());
        }else if(esFuncion(id) && !id.isInicializado()){
            if(!((Funcion)id).areParametersEquals(getParametros(ctx.parametros())))
                errors.ordenPrototipo(posicionDelToken(ctx.getStart()));
            else
                id.setInicializado(true);
                return id;
        }
        return null;
    }

    private void procesarLlamadaFuncion(String tipoDato, LlamadaFuncionContext ctx){
        Id id = getID(ctx.ID().getText());
        Collection<ParseTree> operations = Trees.findAllRuleNodes(ctx, tp2Parser.RULE_operacion);
        Object[] oper = operations.toArray();
        Collection<ParseTree> factorCountFirstOperation = Trees.findAllRuleNodes((ParseTree)oper[0], tp2Parser.RULE_factor);

        if(id == null)
            errors.idNoDeclarado(posicionDelToken(ctx.getStart()), ctx.ID().getText());
        else if(esFuncion(id) && id.isInicializado()){
            List<Variable> parametros = ((Funcion)id).getParametros();
            Collection<ParseTree> factores;

            if(tipoDato != null && id.getTipoDato().equals("void"))
                errors.funcionVoid(posicionDelToken(ctx.getStart()), id.getTokenNombre());
            else if(factorCountFirstOperation.size() > 0 && ((Funcion)id).getParametros().size() != operations.size()){
                errors.cantidadParamArgsDistinta(posicionDelToken(ctx.getStart()));
            }
            else if(tipoDato != null && !coincideTipoDato(tipoDato, id.getTipoDato()))
                errors.idDistintosTipos(posicionDelToken(ctx.getStart()), id.getTipoDato(), tipoDato);
            
            id.setUsado(true);
            for(int i=0; i < parametros.size();  i++){
                if(i > (operations.size() - 1)) { break; }
                factores = Trees.findAllRuleNodes((ParseTree)oper[i], tp2Parser.RULE_factor);
                analisisFactores(id, parametros.get(i).getTipoDato(), factores);
            }
        }else if(esFuncion(id) && !id.isInicializado()){
            errors.funcionNoDeclarada(posicionDelToken(ctx.getStart()), id.getTokenNombre());
        }else if(!esFuncion(id))
            errors.declaradoComoVariable(posicionDelToken(ctx.getStart()), id.getTokenNombre());
    }

    private void processReturn(DefinicionFuncionContext ctx){
        Collection<ParseTree> returns = Trees.findAllRuleNodes(ctx, tp2Parser.RULE_retorno);
        if(ctx.tipoDato().getText().equals("void") && returns.size() != 0)
            errors.retornoFuncionVoid(posicionDelToken(((RetornoContext)(returns.toArray()[0])).getStart()));
        else if(!ctx.tipoDato().getText().equals("void") && !ctx.ID().getText().equals("main") && returns.size() == 0)
            errors.noRetorno(posicionDelToken(ctx.getStart()));
        else if(!ctx.tipoDato().getText().equals("void") && returns.size() > 0){
            ParseTree ret = (ParseTree)(returns.toArray()[0]);
            Collection<ParseTree> factores = encontrarFactoresSinArgumentos(ret);
            analisisFactores(null, ctx.tipoDato().getText(), factores);
        }
    }

    @Override
    public void enterProg(tp2Parser.ProgContext ctx) {
        System.out.println("Comienza programa");
        simbolos.agregarContexto();
    }

    @Override
    public void exitProg(tp2Parser.ProgContext ctx) {
        errors.idNoUsado(simbolos.idSinUsar());
        simbolos.quitarContexto();
        
        System.out.println("Finaliza programa");
    }

    @Override
    public void exitAsignacion(AsignacionContext ctx) {
        procesarInstruccionAsignacion(ctx);
    }

    @Override 
    public void exitOperacion(OperacionContext ctx) { 
        if( !(ctx.getParent() instanceof AsignContext) &&
                !(ctx.getParent() instanceof ArgumentosContext) &&
                !(ctx.getParent() instanceof ArgsContext)){
            Collection<ParseTree> factores = encontrarFactoresSinArgumentos(ctx);
            analisisFactores(null, null, factores);
        }
    }

    @Override 
    public void exitDeclaracionFuncion(DeclaracionFuncionContext ctx) { 
        if(simbolos.getTablaSimbolos().size() == 1){
            Id id = getID(ctx.ID().getText()); 
            if(id == null){
                List<Variable> parametros = getParametros(ctx.parametros());
                if(parametros != null){
                    Id prototype = new Funcion(false, false, ctx.tipoDato().getText(), ctx.ID().getText(), parametros);
                    simbolos.agregarEnContextoActual(ctx.ID().getText(), prototype);
                }
            }else{
                errors.idDeclarado(posicionDelToken(ctx.getStart()), ctx.ID().getText());
            }
        }else{
            errors.prototipoContexto(posicionDelToken(ctx.getStart()));
        }
    }

    @Override 
    public void enterBloque(BloqueContext ctx) { 
        if(ctx.getParent() instanceof DefinicionFuncionContext){
            DefinicionFuncionContext funcionContext = (DefinicionFuncionContext)ctx.getParent();
            Id id = processFunction(funcionContext);
            simbolos.agregarContexto();
            if(id != null)
                ((Funcion)id).getParametros().stream().forEach(param -> simbolos.agregarEnContextoActual(param.getTokenNombre(), param));
            else
                getParametros(funcionContext.parametros()).stream().forEach(param -> simbolos.agregarEnContextoActual(param.getTokenNombre(), param));
        }else
            simbolos.agregarContexto();
    }

    @Override 
    public void exitBloque(BloqueContext ctx) {
        if(ctx.getParent() instanceof DefinicionFuncionContext)
            processReturn((DefinicionFuncionContext)ctx.getParent());
        errors.idNoUsado(simbolos.idSinUsar());
        simbolos.quitarContexto();
    }

    @Override 
    public void exitLlamadaFuncion(LlamadaFuncionContext ctx) {
        if(ctx.getParent() instanceof InstruccionContext){
            Id id = getID(ctx.ID().getText());
            if(id != null){
                getID(ctx.ID().getText()).setUsado(true);
                procesarLlamadaFuncion(null, ctx);
            }
        }
    }

    @Override 
    public void exitInstruccion(InstruccionContext ctx) { 
        if(ctx.declaracion() != null)
            procesarDeclaracion(ctx.declaracion());
        //System.out.println(simbolos);
    } 

}