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
		REMOVE=1, TP=2, SET=3, LIST=4, LASTDEATH=5, LAST=6, ID=7, DOUBLE=8, WS=9;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REMOVE", "TP", "SET", "LIST", "LASTDEATH", "LAST", "ID", "DOUBLE", "INT", 
			"WS"
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
			null, "REMOVE", "TP", "SET", "LIST", "LASTDEATH", "LAST", "ID", "DOUBLE", 
			"WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\13e\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\5\2 \n\2\3\3\3\3\3\3\3\4\3\4\3\4\3"+
		"\4\3\5\3\5\3\5\3\5\3\5\3\5\5\5/\n\5\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3\6\3"+
		"\6\3\6\3\6\3\6\5\6=\n\6\3\7\3\7\3\7\3\7\3\7\5\7D\n\7\3\b\3\b\7\bH\n\b"+
		"\f\b\16\bK\13\b\3\t\5\tN\n\t\3\t\3\t\3\t\5\tS\n\t\3\n\3\n\3\n\7\nX\n\n"+
		"\f\n\16\n[\13\n\5\n]\n\n\3\13\6\13`\n\13\r\13\16\13a\3\13\3\13\2\2\f\3"+
		"\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\2\25\13\3\2\7\5\2C\\aac|\6\2\62;"+
		"C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2m\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3"+
		"\2\2\2\2\25\3\2\2\2\3\37\3\2\2\2\5!\3\2\2\2\7$\3\2\2\2\t.\3\2\2\2\13<"+
		"\3\2\2\2\rC\3\2\2\2\17E\3\2\2\2\21M\3\2\2\2\23\\\3\2\2\2\25_\3\2\2\2\27"+
		"\30\7t\2\2\30\31\7g\2\2\31\32\7o\2\2\32\33\7q\2\2\33\34\7x\2\2\34 \7g"+
		"\2\2\35\36\7t\2\2\36 \7o\2\2\37\27\3\2\2\2\37\35\3\2\2\2 \4\3\2\2\2!\""+
		"\7v\2\2\"#\7r\2\2#\6\3\2\2\2$%\7u\2\2%&\7g\2\2&\'\7v\2\2\'\b\3\2\2\2("+
		")\7n\2\2)*\7k\2\2*+\7u\2\2+/\7v\2\2,-\7n\2\2-/\7u\2\2.(\3\2\2\2.,\3\2"+
		"\2\2/\n\3\2\2\2\60\61\7n\2\2\61\62\7c\2\2\62\63\7u\2\2\63\64\7v\2\2\64"+
		"\65\7a\2\2\65\66\7f\2\2\66\67\7g\2\2\678\7c\2\289\7v\2\29=\7j\2\2:;\7"+
		"n\2\2;=\7f\2\2<\60\3\2\2\2<:\3\2\2\2=\f\3\2\2\2>?\7n\2\2?@\7c\2\2@A\7"+
		"u\2\2AD\7v\2\2BD\7n\2\2C>\3\2\2\2CB\3\2\2\2D\16\3\2\2\2EI\t\2\2\2FH\t"+
		"\3\2\2GF\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2J\20\3\2\2\2KI\3\2\2\2L"+
		"N\7/\2\2ML\3\2\2\2MN\3\2\2\2NO\3\2\2\2OR\5\23\n\2PQ\7\60\2\2QS\5\23\n"+
		"\2RP\3\2\2\2RS\3\2\2\2S\22\3\2\2\2T]\7\62\2\2UY\t\4\2\2VX\t\5\2\2WV\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\T\3\2\2\2\\"+
		"U\3\2\2\2]\24\3\2\2\2^`\t\6\2\2_^\3\2\2\2`a\3\2\2\2a_\3\2\2\2ab\3\2\2"+
		"\2bc\3\2\2\2cd\b\13\2\2d\26\3\2\2\2\r\2\37.<CIMRY\\a\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}