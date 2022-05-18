// Generated from c:\Facultad\Tecnicas de Compilacion\primerproyecto\src\main\java\com\primerproyecto\tp1.g4 by ANTLR 4.8

package com.primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link tp1Parser}.
 */
public interface tp1Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link tp1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(tp1Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(tp1Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void enterInstrucciones(tp1Parser.InstruccionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#instrucciones}.
	 * @param ctx the parse tree
	 */
	void exitInstrucciones(tp1Parser.InstruccionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void enterInstruccion(tp1Parser.InstruccionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#instruccion}.
	 * @param ctx the parse tree
	 */
	void exitInstruccion(tp1Parser.InstruccionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void enterAsignacion(tp1Parser.AsignacionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 */
	void exitAsignacion(tp1Parser.AsignacionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion(tp1Parser.DefinicionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#definicion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion(tp1Parser.DefinicionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void enterDeclaraciones(tp1Parser.DeclaracionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#declaraciones}.
	 * @param ctx the parse tree
	 */
	void exitDeclaraciones(tp1Parser.DeclaracionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void enterTipo(tp1Parser.TipoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 */
	void exitTipo(tp1Parser.TipoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#secuencia}.
	 * @param ctx the parse tree
	 */
	void enterSecuencia(tp1Parser.SecuenciaContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#secuencia}.
	 * @param ctx the parse tree
	 */
	void exitSecuencia(tp1Parser.SecuenciaContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void enterBloque(tp1Parser.BloqueContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 */
	void exitBloque(tp1Parser.BloqueContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void enterIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 */
	void exitIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 */
	void enterIif(tp1Parser.IifContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 */
	void exitIif(tp1Parser.IifContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 */
	void enterIfor(tp1Parser.IforContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 */
	void exitIfor(tp1Parser.IforContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#operIncremento}.
	 * @param ctx the parse tree
	 */
	void enterOperIncremento(tp1Parser.OperIncrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#operIncremento}.
	 * @param ctx the parse tree
	 */
	void exitOperIncremento(tp1Parser.OperIncrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#operDecremento}.
	 * @param ctx the parse tree
	 */
	void enterOperDecremento(tp1Parser.OperDecrementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#operDecremento}.
	 * @param ctx the parse tree
	 */
	void exitOperDecremento(tp1Parser.OperDecrementoContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracion_funcion(tp1Parser.Declaracion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#declaracion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracion_funcion(tp1Parser.Declaracion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void enterDefinicion_funcion(tp1Parser.Definicion_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#definicion_funcion}.
	 * @param ctx the parse tree
	 */
	void exitDefinicion_funcion(tp1Parser.Definicion_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(tp1Parser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(tp1Parser.ParametrosContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#param}.
	 * @param ctx the parse tree
	 */
	void enterParam(tp1Parser.ParamContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#param}.
	 * @param ctx the parse tree
	 */
	void exitParam(tp1Parser.ParamContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void enterLlamada_funcion(tp1Parser.Llamada_funcionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#llamada_funcion}.
	 * @param ctx the parse tree
	 */
	void exitLlamada_funcion(tp1Parser.Llamada_funcionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void enterArgumentos(tp1Parser.ArgumentosContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#argumentos}.
	 * @param ctx the parse tree
	 */
	void exitArgumentos(tp1Parser.ArgumentosContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#opal}.
	 * @param ctx the parse tree
	 */
	void enterOpal(tp1Parser.OpalContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#opal}.
	 * @param ctx the parse tree
	 */
	void exitOpal(tp1Parser.OpalContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void enterDisyuncion(tp1Parser.DisyuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#disyuncion}.
	 * @param ctx the parse tree
	 */
	void exitDisyuncion(tp1Parser.DisyuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#disy}.
	 * @param ctx the parse tree
	 */
	void enterDisy(tp1Parser.DisyContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#disy}.
	 * @param ctx the parse tree
	 */
	void exitDisy(tp1Parser.DisyContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void enterConjuncion(tp1Parser.ConjuncionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#conjuncion}.
	 * @param ctx the parse tree
	 */
	void exitConjuncion(tp1Parser.ConjuncionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#conj}.
	 * @param ctx the parse tree
	 */
	void enterConj(tp1Parser.ConjContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#conj}.
	 * @param ctx the parse tree
	 */
	void exitConj(tp1Parser.ConjContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#comparaciones}.
	 * @param ctx the parse tree
	 */
	void enterComparaciones(tp1Parser.ComparacionesContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#comparaciones}.
	 * @param ctx the parse tree
	 */
	void exitComparaciones(tp1Parser.ComparacionesContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(tp1Parser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(tp1Parser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#comparadores}.
	 * @param ctx the parse tree
	 */
	void enterComparadores(tp1Parser.ComparadoresContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#comparadores}.
	 * @param ctx the parse tree
	 */
	void exitComparadores(tp1Parser.ComparadoresContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void enterExpresion(tp1Parser.ExpresionContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#expresion}.
	 * @param ctx the parse tree
	 */
	void exitExpresion(tp1Parser.ExpresionContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void enterExp(tp1Parser.ExpContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#exp}.
	 * @param ctx the parse tree
	 */
	void exitExp(tp1Parser.ExpContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(tp1Parser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(tp1Parser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#t}.
	 * @param ctx the parse tree
	 */
	void enterT(tp1Parser.TContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#t}.
	 * @param ctx the parse tree
	 */
	void exitT(tp1Parser.TContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(tp1Parser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(tp1Parser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link tp1Parser#f}.
	 * @param ctx the parse tree
	 */
	void enterF(tp1Parser.FContext ctx);
	/**
	 * Exit a parse tree produced by {@link tp1Parser#f}.
	 * @param ctx the parse tree
	 */
	void exitF(tp1Parser.FContext ctx);
}