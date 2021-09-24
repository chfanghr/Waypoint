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
		T__0=1, T__1=2, T__2=3, ID=4, DOUBLE=5, WS=6;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"T__0", "T__1", "T__2", "ID", "DOUBLE", "INT", "WS"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'set'", "'tp'", "'remove'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, null, null, "ID", "DOUBLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\b=\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\3\2\3\2\3\2\3\2\3\3\3\3"+
		"\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\5\6\5!\n\5\r\5\16\5\"\3\6\5\6&\n\6"+
		"\3\6\3\6\3\6\5\6+\n\6\3\7\3\7\3\7\7\7\60\n\7\f\7\16\7\63\13\7\5\7\65\n"+
		"\7\3\b\6\b8\n\b\r\b\16\b9\3\b\3\b\2\2\t\3\3\5\4\7\5\t\6\13\7\r\2\17\b"+
		"\3\2\6\6\2\62;C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2A\2\3\3\2\2"+
		"\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\17\3\2\2\2\3\21"+
		"\3\2\2\2\5\25\3\2\2\2\7\30\3\2\2\2\t \3\2\2\2\13%\3\2\2\2\r\64\3\2\2\2"+
		"\17\67\3\2\2\2\21\22\7u\2\2\22\23\7g\2\2\23\24\7v\2\2\24\4\3\2\2\2\25"+
		"\26\7v\2\2\26\27\7r\2\2\27\6\3\2\2\2\30\31\7t\2\2\31\32\7g\2\2\32\33\7"+
		"o\2\2\33\34\7q\2\2\34\35\7x\2\2\35\36\7g\2\2\36\b\3\2\2\2\37!\t\2\2\2"+
		" \37\3\2\2\2!\"\3\2\2\2\" \3\2\2\2\"#\3\2\2\2#\n\3\2\2\2$&\7/\2\2%$\3"+
		"\2\2\2%&\3\2\2\2&\'\3\2\2\2\'*\5\r\7\2()\7\60\2\2)+\5\r\7\2*(\3\2\2\2"+
		"*+\3\2\2\2+\f\3\2\2\2,\65\7\62\2\2-\61\t\3\2\2.\60\t\4\2\2/.\3\2\2\2\60"+
		"\63\3\2\2\2\61/\3\2\2\2\61\62\3\2\2\2\62\65\3\2\2\2\63\61\3\2\2\2\64,"+
		"\3\2\2\2\64-\3\2\2\2\65\16\3\2\2\2\668\t\5\2\2\67\66\3\2\2\289\3\2\2\2"+
		"9\67\3\2\2\29:\3\2\2\2:;\3\2\2\2;<\b\b\2\2<\20\3\2\2\2\t\2\"%*\61\649"+
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