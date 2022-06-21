package com.primerproyecto;
import com.primerproyecto.symbolsTable.ErrorsListener;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, Compilador!!!");
        System.out.println("TP2 Bobadilla - Genaro");
        // create a CharStream that reads from file
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/entrada.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/FechasHoras.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/parentesis.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/codigo.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/mate.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/tp1.txt");
        CharStream input = CharStreams.fromFileName("primerproyecto/input/tp2.txt");
        System.out.println(input.getSourceName());
        // create a lexer that feeds off of input CharStream
        //programaLexer lexer = new programaLexer(input);
        tp2Lexer lexer = new tp2Lexer(input);
        
        // create a buffer of tokens pulled from the lexer
        // Entra texto -> Salen tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        // El parser es el analizador sintáctico
        //programaParser parser = new programaParser(tokens);
        tp2Parser parser = new tp2Parser(tokens);
                
        ErrorsListener errorsListener = new ErrorsListener();
        parser.removeErrorListeners();
        parser.addErrorListener(errorsListener);
        // create Listener -> activar el listener una vez creado
        //construyendo un objeto MiListener
        // ExpRegBaseListener escucha = new Escucha();
        tp2BaseListener escucha = new MyListener();
        // Conecto el objeto con Listeners al parser
        // parser.addParseListener(escucha);
        parser.addParseListener(escucha);
        System.out.println("\n");
        // Solicito al parser que comience indicando una regla gramatical
        // En este caso la regla es el simbolo inicial
        parser.prog();
        // ParseTree tree =  parser.s();
        // Conectamos el visitor
        // Caminante visitor = new Caminante();
        // visitor.visit(tree);
        // System.out.println(visitor);
        // System.out.println(visitor.getErrorNodes());
        // Imprime el arbol obtenido
        // System.out.println(tree.toStringTree(parser));
        // System.out.println(escucha);
        
    }
}