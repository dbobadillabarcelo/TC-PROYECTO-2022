package com.primerproyecto;

import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

// Las diferentes entradas se explicaran oportunamente
public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, Compilador!!!");
        System.out.println("TP1 Bobadilla - Genaro");
        // create a CharStream that reads from file
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/entrada.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/FechasHoras.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/parentesis.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/codigo.txt");
        //CharStream input = CharStreams.fromFileName("primerproyecto/input/mate.txt");
        CharStream input = CharStreams.fromFileName("primerproyecto/input/tp1.txt");
        System.out.println(input.getSourceName());
        // create a lexer that feeds off of input CharStream
        //programaLexer lexer = new programaLexer(input);
        tp1Lexer lexer = new tp1Lexer(input);
        
        // create a buffer of tokens pulled from the lexer
        // Entra texto -> Salen tokens
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        
        // create a parser that feeds off the tokens buffer
        // El parser es el analizador sintáctico
        //programaParser parser = new programaParser(tokens);
        tp1Parser parser = new tp1Parser(tokens);
                
        // create Listener
        // ExpRegBaseListener escucha = new Escucha();

        // Conecto el objeto con Listeners al parser
        // parser.addParseListener(escucha);

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