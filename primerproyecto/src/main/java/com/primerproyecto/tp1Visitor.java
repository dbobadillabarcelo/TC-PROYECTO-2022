// Generated from c:\Facultad\Tecnicas de Compilacion\primerproyecto\src\main\java\com\primerproyecto\tp1.g4 by ANTLR 4.8

package com.primerproyecto;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link tp1Parser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface tp1Visitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link tp1Parser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(tp1Parser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#instrucciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrucciones(tp1Parser.InstruccionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#instruccion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstruccion(tp1Parser.InstruccionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#asignacion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAsignacion(tp1Parser.AsignacionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#definicion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion(tp1Parser.DefinicionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#declaraciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaraciones(tp1Parser.DeclaracionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#tipo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTipo(tp1Parser.TipoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#secuencia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecuencia(tp1Parser.SecuenciaContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#bloque}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBloque(tp1Parser.BloqueContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#iwhile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIwhile(tp1Parser.IwhileContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#iif}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIif(tp1Parser.IifContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#ifor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfor(tp1Parser.IforContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#operIncremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperIncremento(tp1Parser.OperIncrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#operDecremento}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOperDecremento(tp1Parser.OperDecrementoContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#declaracion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeclaracion_funcion(tp1Parser.Declaracion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#definicion_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinicion_funcion(tp1Parser.Definicion_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#parametros}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParametros(tp1Parser.ParametrosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#param}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParam(tp1Parser.ParamContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#llamada_funcion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLlamada_funcion(tp1Parser.Llamada_funcionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#argumentos}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArgumentos(tp1Parser.ArgumentosContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#opal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpal(tp1Parser.OpalContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#disyuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisyuncion(tp1Parser.DisyuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#disy}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDisy(tp1Parser.DisyContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#conjuncion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConjuncion(tp1Parser.ConjuncionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#conj}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConj(tp1Parser.ConjContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#comparaciones}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparaciones(tp1Parser.ComparacionesContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#comp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComp(tp1Parser.CompContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#comparadores}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparadores(tp1Parser.ComparadoresContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#expresion}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpresion(tp1Parser.ExpresionContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#exp}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExp(tp1Parser.ExpContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#term}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTerm(tp1Parser.TermContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#t}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitT(tp1Parser.TContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#factor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFactor(tp1Parser.FactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link tp1Parser#f}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitF(tp1Parser.FContext ctx);
}