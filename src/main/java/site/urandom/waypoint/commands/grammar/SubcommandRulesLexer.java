// Generated from SubcommandRules.g4 by ANTLR 4.9.2
package site.urandom.waypoint.commands.grammar;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SubcommandRulesLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REMOVE=1, TP=2, SET=3, LIST=4, LASTDEATH=5, ID=6, DOUBLE=7, WS=8;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REMOVE", "TP", "SET", "LIST", "LASTDEATH", "ID", "DOUBLE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, null, "'tp'", "'set'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "REMOVE", "TP", "SET", "LIST", "LASTDEATH", "ID", "DOUBLE", "WS"
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


	public SubcommandRulesLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "SubcommandRules.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\nZ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\3\2\3\2\5\2\36\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3"+
		"\5\3\5\3\5\3\5\3\5\5\5-\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\5\6;\n\6\3\7\6\7>\n\7\r\7\16\7?\3\b\5\bC\n\b\3\b\3\b\3\b\5\bH\n"+
		"\b\3\t\3\t\3\t\7\tM\n\t\f\t\16\tP\13\t\5\tR\n\t\3\n\6\nU\n\n\r\n\16\n"+
		"V\3\n\3\n\2\2\13\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\2\23\n\3\2\6\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2a\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\23\3"+
		"\2\2\2\3\35\3\2\2\2\5\37\3\2\2\2\7\"\3\2\2\2\t,\3\2\2\2\13:\3\2\2\2\r"+
		"=\3\2\2\2\17B\3\2\2\2\21Q\3\2\2\2\23T\3\2\2\2\25\26\7t\2\2\26\27\7g\2"+
		"\2\27\30\7o\2\2\30\31\7q\2\2\31\32\7x\2\2\32\36\7g\2\2\33\34\7t\2\2\34"+
		"\36\7o\2\2\35\25\3\2\2\2\35\33\3\2\2\2\36\4\3\2\2\2\37 \7v\2\2 !\7r\2"+
		"\2!\6\3\2\2\2\"#\7u\2\2#$\7g\2\2$%\7v\2\2%\b\3\2\2\2&\'\7n\2\2\'(\7k\2"+
		"\2()\7u\2\2)-\7v\2\2*+\7n\2\2+-\7u\2\2,&\3\2\2\2,*\3\2\2\2-\n\3\2\2\2"+
		"./\7n\2\2/\60\7c\2\2\60\61\7u\2\2\61\62\7v\2\2\62\63\7a\2\2\63\64\7f\2"+
		"\2\64\65\7g\2\2\65\66\7c\2\2\66\67\7v\2\2\67;\7j\2\289\7n\2\29;\7f\2\2"+
		":.\3\2\2\2:8\3\2\2\2;\f\3\2\2\2<>\t\2\2\2=<\3\2\2\2>?\3\2\2\2?=\3\2\2"+
		"\2?@\3\2\2\2@\16\3\2\2\2AC\7/\2\2BA\3\2\2\2BC\3\2\2\2CD\3\2\2\2DG\5\21"+
		"\t\2EF\7\60\2\2FH\5\21\t\2GE\3\2\2\2GH\3\2\2\2H\20\3\2\2\2IR\7\62\2\2"+
		"JN\t\3\2\2KM\t\4\2\2LK\3\2\2\2MP\3\2\2\2NL\3\2\2\2NO\3\2\2\2OR\3\2\2\2"+
		"PN\3\2\2\2QI\3\2\2\2QJ\3\2\2\2R\22\3\2\2\2SU\t\5\2\2TS\3\2\2\2UV\3\2\2"+
		"\2VT\3\2\2\2VW\3\2\2\2WX\3\2\2\2XY\b\n\2\2Y\24\3\2\2\2\f\2\35,:?BGNQV"+
		"\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}