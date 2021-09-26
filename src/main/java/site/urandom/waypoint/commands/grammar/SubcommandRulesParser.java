// Generated from SubcommandRules.g4 by ANTLR 4.9.2
package site.urandom.waypoint.commands.grammar;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SubcommandRulesParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.9.2", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		REMOVE=1, TP=2, SET=3, LIST=4, ID=5, DOUBLE=6, WS=7;
	public static final int
		RULE_set = 0, RULE_tp = 1, RULE_remove = 2, RULE_list = 3, RULE_subcommand = 4;
	private static String[] makeRuleNames() {
		return new String[] {
			"set", "tp", "remove", "list", "subcommand"
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

	@Override
	public String getGrammarFileName() { return "SubcommandRules.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SubcommandRulesParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	public static class SetContext extends ParserRuleContext {
		public SetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set; }
	 
		public SetContext() { }
		public void copyFrom(SetContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class SetWithCoordContext extends SetContext {
		public Token name;
		public Token x;
		public Token y;
		public Token z;
		public TerminalNode SET() { return getToken(SubcommandRulesParser.SET, 0); }
		public TerminalNode ID() { return getToken(SubcommandRulesParser.ID, 0); }
		public List<TerminalNode> DOUBLE() { return getTokens(SubcommandRulesParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(SubcommandRulesParser.DOUBLE, i);
		}
		public SetWithCoordContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterSetWithCoord(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitSetWithCoord(this);
		}
	}
	public static class SetWithCoordWorldContext extends SetContext {
		public Token name;
		public Token x;
		public Token y;
		public Token z;
		public Token world;
		public TerminalNode SET() { return getToken(SubcommandRulesParser.SET, 0); }
		public List<TerminalNode> ID() { return getTokens(SubcommandRulesParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(SubcommandRulesParser.ID, i);
		}
		public List<TerminalNode> DOUBLE() { return getTokens(SubcommandRulesParser.DOUBLE); }
		public TerminalNode DOUBLE(int i) {
			return getToken(SubcommandRulesParser.DOUBLE, i);
		}
		public SetWithCoordWorldContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterSetWithCoordWorld(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitSetWithCoordWorld(this);
		}
	}
	public static class SetNameOnlyContext extends SetContext {
		public Token name;
		public TerminalNode SET() { return getToken(SubcommandRulesParser.SET, 0); }
		public TerminalNode ID() { return getToken(SubcommandRulesParser.ID, 0); }
		public SetNameOnlyContext(SetContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterSetNameOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitSetNameOnly(this);
		}
	}

	public final SetContext set() throws RecognitionException {
		SetContext _localctx = new SetContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_set);
		try {
			setState(23);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				_localctx = new SetNameOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(10);
				match(SET);
				setState(11);
				((SetNameOnlyContext)_localctx).name = match(ID);
				}
				break;
			case 2:
				_localctx = new SetWithCoordContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(12);
				match(SET);
				setState(13);
				((SetWithCoordContext)_localctx).name = match(ID);
				setState(14);
				((SetWithCoordContext)_localctx).x = match(DOUBLE);
				setState(15);
				((SetWithCoordContext)_localctx).y = match(DOUBLE);
				setState(16);
				((SetWithCoordContext)_localctx).z = match(DOUBLE);
				}
				break;
			case 3:
				_localctx = new SetWithCoordWorldContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(17);
				match(SET);
				setState(18);
				((SetWithCoordWorldContext)_localctx).name = match(ID);
				setState(19);
				((SetWithCoordWorldContext)_localctx).x = match(DOUBLE);
				setState(20);
				((SetWithCoordWorldContext)_localctx).y = match(DOUBLE);
				setState(21);
				((SetWithCoordWorldContext)_localctx).z = match(DOUBLE);
				setState(22);
				((SetWithCoordWorldContext)_localctx).world = match(ID);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TpContext extends ParserRuleContext {
		public TpContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tp; }
	 
		public TpContext() { }
		public void copyFrom(TpContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class TpNameOnlyContext extends TpContext {
		public Token name;
		public TerminalNode TP() { return getToken(SubcommandRulesParser.TP, 0); }
		public TerminalNode ID() { return getToken(SubcommandRulesParser.ID, 0); }
		public TpNameOnlyContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterTpNameOnly(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitTpNameOnly(this);
		}
	}
	public static class TpShortcutContext extends TpContext {
		public Token name;
		public TerminalNode ID() { return getToken(SubcommandRulesParser.ID, 0); }
		public TpShortcutContext(TpContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterTpShortcut(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitTpShortcut(this);
		}
	}

	public final TpContext tp() throws RecognitionException {
		TpContext _localctx = new TpContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_tp);
		try {
			setState(28);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case TP:
				_localctx = new TpNameOnlyContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(25);
				match(TP);
				setState(26);
				((TpNameOnlyContext)_localctx).name = match(ID);
				}
				break;
			case ID:
				_localctx = new TpShortcutContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(27);
				((TpShortcutContext)_localctx).name = match(ID);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class RemoveContext extends ParserRuleContext {
		public Token name;
		public TerminalNode REMOVE() { return getToken(SubcommandRulesParser.REMOVE, 0); }
		public TerminalNode ID() { return getToken(SubcommandRulesParser.ID, 0); }
		public RemoveContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_remove; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterRemove(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitRemove(this);
		}
	}

	public final RemoveContext remove() throws RecognitionException {
		RemoveContext _localctx = new RemoveContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_remove);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(30);
			match(REMOVE);
			setState(31);
			((RemoveContext)_localctx).name = match(ID);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ListContext extends ParserRuleContext {
		public TerminalNode LIST() { return getToken(SubcommandRulesParser.LIST, 0); }
		public ListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_list; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitList(this);
		}
	}

	public final ListContext list() throws RecognitionException {
		ListContext _localctx = new ListContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_list);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(33);
			match(LIST);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SubcommandContext extends ParserRuleContext {
		public SetContext set() {
			return getRuleContext(SetContext.class,0);
		}
		public TpContext tp() {
			return getRuleContext(TpContext.class,0);
		}
		public RemoveContext remove() {
			return getRuleContext(RemoveContext.class,0);
		}
		public ListContext list() {
			return getRuleContext(ListContext.class,0);
		}
		public SubcommandContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subcommand; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).enterSubcommand(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof SubcommandRulesListener ) ((SubcommandRulesListener)listener).exitSubcommand(this);
		}
	}

	public final SubcommandContext subcommand() throws RecognitionException {
		SubcommandContext _localctx = new SubcommandContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_subcommand);
		try {
			setState(39);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SET:
				enterOuterAlt(_localctx, 1);
				{
				setState(35);
				set();
				}
				break;
			case TP:
			case ID:
				enterOuterAlt(_localctx, 2);
				{
				setState(36);
				tp();
				}
				break;
			case REMOVE:
				enterOuterAlt(_localctx, 3);
				{
				setState(37);
				remove();
				}
				break;
			case LIST:
				enterOuterAlt(_localctx, 4);
				{
				setState(38);
				list();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3\t,\4\2\t\2\4\3\t"+
		"\3\4\4\t\4\4\5\t\5\4\6\t\6\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2\3\2"+
		"\3\2\3\2\5\2\32\n\2\3\3\3\3\3\3\5\3\37\n\3\3\4\3\4\3\4\3\5\3\5\3\6\3\6"+
		"\3\6\3\6\5\6*\n\6\3\6\2\2\7\2\4\6\b\n\2\2\2,\2\31\3\2\2\2\4\36\3\2\2\2"+
		"\6 \3\2\2\2\b#\3\2\2\2\n)\3\2\2\2\f\r\7\5\2\2\r\32\7\7\2\2\16\17\7\5\2"+
		"\2\17\20\7\7\2\2\20\21\7\b\2\2\21\22\7\b\2\2\22\32\7\b\2\2\23\24\7\5\2"+
		"\2\24\25\7\7\2\2\25\26\7\b\2\2\26\27\7\b\2\2\27\30\7\b\2\2\30\32\7\7\2"+
		"\2\31\f\3\2\2\2\31\16\3\2\2\2\31\23\3\2\2\2\32\3\3\2\2\2\33\34\7\4\2\2"+
		"\34\37\7\7\2\2\35\37\7\7\2\2\36\33\3\2\2\2\36\35\3\2\2\2\37\5\3\2\2\2"+
		" !\7\3\2\2!\"\7\7\2\2\"\7\3\2\2\2#$\7\6\2\2$\t\3\2\2\2%*\5\2\2\2&*\5\4"+
		"\3\2\'*\5\6\4\2(*\5\b\5\2)%\3\2\2\2)&\3\2\2\2)\'\3\2\2\2)(\3\2\2\2*\13"+
		"\3\2\2\2\5\31\36)";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}