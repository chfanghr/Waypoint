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
		REMOVE=1, TP=2, SET=3, LIST=4, ID=5, DOUBLE=6, WS=7;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"REMOVE", "TP", "SET", "LIST", "ID", "DOUBLE", "INT", "WS"
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
			null, "REMOVE", "TP", "SET", "LIST", "ID", "DOUBLE", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\tJ\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\3\2\3\2\5\2\34\n\2\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\5\3\5\3\5\3"+
		"\5\3\5\3\5\5\5+\n\5\3\6\6\6.\n\6\r\6\16\6/\3\7\5\7\63\n\7\3\7\3\7\3\7"+
		"\5\78\n\7\3\b\3\b\3\b\7\b=\n\b\f\b\16\b@\13\b\5\bB\n\b\3\t\6\tE\n\t\r"+
		"\t\16\tF\3\t\3\t\2\2\n\3\3\5\4\7\5\t\6\13\7\r\b\17\2\21\t\3\2\6\6\2\62"+
		";C\\aac|\3\2\63;\3\2\62;\5\2\13\f\17\17\"\"\2P\2\3\3\2\2\2\2\5\3\2\2\2"+
		"\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\21\3\2\2\2\3\33\3"+
		"\2\2\2\5\35\3\2\2\2\7 \3\2\2\2\t*\3\2\2\2\13-\3\2\2\2\r\62\3\2\2\2\17"+
		"A\3\2\2\2\21D\3\2\2\2\23\24\7t\2\2\24\25\7g\2\2\25\26\7o\2\2\26\27\7q"+
		"\2\2\27\30\7x\2\2\30\34\7g\2\2\31\32\7t\2\2\32\34\7o\2\2\33\23\3\2\2\2"+
		"\33\31\3\2\2\2\34\4\3\2\2\2\35\36\7v\2\2\36\37\7r\2\2\37\6\3\2\2\2 !\7"+
		"u\2\2!\"\7g\2\2\"#\7v\2\2#\b\3\2\2\2$%\7n\2\2%&\7k\2\2&\'\7u\2\2\'+\7"+
		"v\2\2()\7n\2\2)+\7u\2\2*$\3\2\2\2*(\3\2\2\2+\n\3\2\2\2,.\t\2\2\2-,\3\2"+
		"\2\2./\3\2\2\2/-\3\2\2\2/\60\3\2\2\2\60\f\3\2\2\2\61\63\7/\2\2\62\61\3"+
		"\2\2\2\62\63\3\2\2\2\63\64\3\2\2\2\64\67\5\17\b\2\65\66\7\60\2\2\668\5"+
		"\17\b\2\67\65\3\2\2\2\678\3\2\2\28\16\3\2\2\29B\7\62\2\2:>\t\3\2\2;=\t"+
		"\4\2\2<;\3\2\2\2=@\3\2\2\2><\3\2\2\2>?\3\2\2\2?B\3\2\2\2@>\3\2\2\2A9\3"+
		"\2\2\2A:\3\2\2\2B\20\3\2\2\2CE\t\5\2\2DC\3\2\2\2EF\3\2\2\2FD\3\2\2\2F"+
		"G\3\2\2\2GH\3\2\2\2HI\b\t\2\2I\22\3\2\2\2\13\2\33*/\62\67>AF\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}