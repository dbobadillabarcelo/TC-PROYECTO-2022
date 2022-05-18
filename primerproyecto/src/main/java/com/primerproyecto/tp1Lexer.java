// Generated from c:\Facultad\Tecnicas de Compilacion\primerproyecto\src\main\java\com\primerproyecto\tp1.g4 by ANTLR 4.8

package com.primerproyecto;

import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class tp1Lexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.8", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		SUMA=1, RESTA=2, MULT=3, DIV=4, MOD=5, ASIGN=6, AND=7, OR=8, NOT=9, PA=10, 
		PC=11, CA=12, CC=13, LA=14, LC=15, WHILE=16, FOR=17, IF=18, IGUAL=19, 
		DISTINTO=20, MENOR=21, MAYOR=22, MENOR_IGUAL=23, MAYOR_IGUAL=24, PUNTOYCOMA=25, 
		COMA=26, INT=27, DOUBLE=28, VOID=29, NUMERO=30, ID=31, WS=32;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"DIGITO", "LETRA", "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIGN", "AND", 
			"OR", "NOT", "PA", "PC", "CA", "CC", "LA", "LC", "WHILE", "FOR", "IF", 
			"IGUAL", "DISTINTO", "MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", 
			"PUNTOYCOMA", "COMA", "INT", "DOUBLE", "VOID", "NUMERO", "ID", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'+'", "'-'", "'*'", "'/'", "'%'", "'='", "'&&'", "'||'", "'!'", 
			"'('", "')'", "'['", "']'", "'{'", "'}'", "'while'", "'for'", "'if'", 
			"'=='", "'!='", "'<'", "'>'", "'<='", "'>='", "';'", "','", "'int'", 
			"'double'", "'void'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "SUMA", "RESTA", "MULT", "DIV", "MOD", "ASIGN", "AND", "OR", "NOT", 
			"PA", "PC", "CA", "CC", "LA", "LC", "WHILE", "FOR", "IF", "IGUAL", "DISTINTO", 
			"MENOR", "MAYOR", "MENOR_IGUAL", "MAYOR_IGUAL", "PUNTOYCOMA", "COMA", 
			"INT", "DOUBLE", "VOID", "NUMERO", "ID", "WS"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}


	public tp1Lexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "tp1.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\"\u00b1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3\b"+
		"\3\b\3\t\3\t\3\n\3\n\3\n\3\13\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\17"+
		"\3\17\3\20\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\23\3\23\3\23\3\23\3\24"+
		"\3\24\3\24\3\24\3\25\3\25\3\25\3\26\3\26\3\26\3\27\3\27\3\27\3\30\3\30"+
		"\3\31\3\31\3\32\3\32\3\32\3\33\3\33\3\33\3\34\3\34\3\35\3\35\3\36\3\36"+
		"\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37\3\37\3 \3 \3 \3 \3 \3!\6!\u009e"+
		"\n!\r!\16!\u009f\3\"\3\"\5\"\u00a4\n\"\3\"\3\"\3\"\7\"\u00a9\n\"\f\"\16"+
		"\"\u00ac\13\"\3#\3#\3#\3#\2\2$\3\2\5\2\7\3\t\4\13\5\r\6\17\7\21\b\23\t"+
		"\25\n\27\13\31\f\33\r\35\16\37\17!\20#\21%\22\'\23)\24+\25-\26/\27\61"+
		"\30\63\31\65\32\67\339\34;\35=\36?\37A C!E\"\3\2\5\3\2\62;\4\2C\\c|\5"+
		"\2\13\f\17\17\"\"\2\u00b3\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\3G\3\2\2"+
		"\2\5I\3\2\2\2\7K\3\2\2\2\tM\3\2\2\2\13O\3\2\2\2\rQ\3\2\2\2\17S\3\2\2\2"+
		"\21U\3\2\2\2\23W\3\2\2\2\25Z\3\2\2\2\27]\3\2\2\2\31_\3\2\2\2\33a\3\2\2"+
		"\2\35c\3\2\2\2\37e\3\2\2\2!g\3\2\2\2#i\3\2\2\2%k\3\2\2\2\'q\3\2\2\2)u"+
		"\3\2\2\2+x\3\2\2\2-{\3\2\2\2/~\3\2\2\2\61\u0080\3\2\2\2\63\u0082\3\2\2"+
		"\2\65\u0085\3\2\2\2\67\u0088\3\2\2\29\u008a\3\2\2\2;\u008c\3\2\2\2=\u0090"+
		"\3\2\2\2?\u0097\3\2\2\2A\u009d\3\2\2\2C\u00a3\3\2\2\2E\u00ad\3\2\2\2G"+
		"H\t\2\2\2H\4\3\2\2\2IJ\t\3\2\2J\6\3\2\2\2KL\7-\2\2L\b\3\2\2\2MN\7/\2\2"+
		"N\n\3\2\2\2OP\7,\2\2P\f\3\2\2\2QR\7\61\2\2R\16\3\2\2\2ST\7\'\2\2T\20\3"+
		"\2\2\2UV\7?\2\2V\22\3\2\2\2WX\7(\2\2XY\7(\2\2Y\24\3\2\2\2Z[\7~\2\2[\\"+
		"\7~\2\2\\\26\3\2\2\2]^\7#\2\2^\30\3\2\2\2_`\7*\2\2`\32\3\2\2\2ab\7+\2"+
		"\2b\34\3\2\2\2cd\7]\2\2d\36\3\2\2\2ef\7_\2\2f \3\2\2\2gh\7}\2\2h\"\3\2"+
		"\2\2ij\7\177\2\2j$\3\2\2\2kl\7y\2\2lm\7j\2\2mn\7k\2\2no\7n\2\2op\7g\2"+
		"\2p&\3\2\2\2qr\7h\2\2rs\7q\2\2st\7t\2\2t(\3\2\2\2uv\7k\2\2vw\7h\2\2w*"+
		"\3\2\2\2xy\7?\2\2yz\7?\2\2z,\3\2\2\2{|\7#\2\2|}\7?\2\2}.\3\2\2\2~\177"+
		"\7>\2\2\177\60\3\2\2\2\u0080\u0081\7@\2\2\u0081\62\3\2\2\2\u0082\u0083"+
		"\7>\2\2\u0083\u0084\7?\2\2\u0084\64\3\2\2\2\u0085\u0086\7@\2\2\u0086\u0087"+
		"\7?\2\2\u0087\66\3\2\2\2\u0088\u0089\7=\2\2\u00898\3\2\2\2\u008a\u008b"+
		"\7.\2\2\u008b:\3\2\2\2\u008c\u008d\7k\2\2\u008d\u008e\7p\2\2\u008e\u008f"+
		"\7v\2\2\u008f<\3\2\2\2\u0090\u0091\7f\2\2\u0091\u0092\7q\2\2\u0092\u0093"+
		"\7w\2\2\u0093\u0094\7d\2\2\u0094\u0095\7n\2\2\u0095\u0096\7g\2\2\u0096"+
		">\3\2\2\2\u0097\u0098\7x\2\2\u0098\u0099\7q\2\2\u0099\u009a\7k\2\2\u009a"+
		"\u009b\7f\2\2\u009b@\3\2\2\2\u009c\u009e\5\3\2\2\u009d\u009c\3\2\2\2\u009e"+
		"\u009f\3\2\2\2\u009f\u009d\3\2\2\2\u009f\u00a0\3\2\2\2\u00a0B\3\2\2\2"+
		"\u00a1\u00a4\5\5\3\2\u00a2\u00a4\7a\2\2\u00a3\u00a1\3\2\2\2\u00a3\u00a2"+
		"\3\2\2\2\u00a4\u00aa\3\2\2\2\u00a5\u00a9\5\5\3\2\u00a6\u00a9\5\3\2\2\u00a7"+
		"\u00a9\7a\2\2\u00a8\u00a5\3\2\2\2\u00a8\u00a6\3\2\2\2\u00a8\u00a7\3\2"+
		"\2\2\u00a9\u00ac\3\2\2\2\u00aa\u00a8\3\2\2\2\u00aa\u00ab\3\2\2\2\u00ab"+
		"D\3\2\2\2\u00ac\u00aa\3\2\2\2\u00ad\u00ae\t\4\2\2\u00ae\u00af\3\2\2\2"+
		"\u00af\u00b0\b#\2\2\u00b0F\3\2\2\2\7\2\u009f\u00a3\u00a8\u00aa\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}