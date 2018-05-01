// Generated from Datalog.g4 by ANTLR 4.7.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class DatalogLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		EQUALS=1, NOTEQUALS=2, NUMBER=3, LPAREN=4, RPAREN=5, PERIOD=6, IF=7, TILDE=8, 
		COMMA=9, Q_MARK=10, ID=11, VAR=12, STR=13, WS=14;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VALID_ID_START", "VALID_ID_CHAR", "VALID_VAR_START", "VALID_VAR_CHAR", 
		"VALID_STR_CHAR", "QUOTE", "EQUALS", "NOTEQUALS", "NUMBER", "LPAREN", 
		"RPAREN", "PERIOD", "IF", "TILDE", "COMMA", "Q_MARK", "ID", "VAR", "STR", 
		"WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'='", "'!='", null, "'('", "')'", "'.'", "':-'", "'~'", "','", 
		"'?'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "EQUALS", "NOTEQUALS", "NUMBER", "LPAREN", "RPAREN", "PERIOD", "IF", 
		"TILDE", "COMMA", "Q_MARK", "ID", "VAR", "STR", "WS"
	};
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


	public DatalogLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Datalog.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\20s\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\3\2\3\2\3\3\3\3\5\3\60\n\3\3\4\5\4\63\n"+
		"\4\3\5\3\5\3\6\3\6\5\69\n\6\3\7\3\7\3\b\3\b\3\t\3\t\3\t\3\n\6\nC\n\n\r"+
		"\n\16\nD\3\13\3\13\3\f\3\f\3\r\3\r\3\16\3\16\3\16\3\17\3\17\3\20\3\20"+
		"\3\21\3\21\3\22\3\22\7\22X\n\22\f\22\16\22[\13\22\3\23\3\23\7\23_\n\23"+
		"\f\23\16\23b\13\23\3\24\3\24\7\24f\n\24\f\24\16\24i\13\24\3\24\3\24\3"+
		"\25\6\25n\n\25\r\25\16\25o\3\25\3\25\2\2\26\3\2\5\2\7\2\t\2\13\2\r\2\17"+
		"\3\21\4\23\5\25\6\27\7\31\b\33\t\35\n\37\13!\f#\r%\16\'\17)\20\3\2\5\5"+
		"\2//\62;C\\\4\2C\\aa\5\2\13\f\17\17\"\"\2s\2\17\3\2\2\2\2\21\3\2\2\2\2"+
		"\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3"+
		"\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3"+
		"\2\2\2\3+\3\2\2\2\5/\3\2\2\2\7\62\3\2\2\2\t\64\3\2\2\2\138\3\2\2\2\r:"+
		"\3\2\2\2\17<\3\2\2\2\21>\3\2\2\2\23B\3\2\2\2\25F\3\2\2\2\27H\3\2\2\2\31"+
		"J\3\2\2\2\33L\3\2\2\2\35O\3\2\2\2\37Q\3\2\2\2!S\3\2\2\2#U\3\2\2\2%\\\3"+
		"\2\2\2\'c\3\2\2\2)m\3\2\2\2+,\4c|\2,\4\3\2\2\2-\60\5\3\2\2.\60\t\2\2\2"+
		"/-\3\2\2\2/.\3\2\2\2\60\6\3\2\2\2\61\63\t\3\2\2\62\61\3\2\2\2\63\b\3\2"+
		"\2\2\64\65\3\2\2\2\65\n\3\2\2\2\669\5\5\3\2\679\7\"\2\28\66\3\2\2\28\67"+
		"\3\2\2\29\f\3\2\2\2:;\7$\2\2;\16\3\2\2\2<=\7?\2\2=\20\3\2\2\2>?\7#\2\2"+
		"?@\7?\2\2@\22\3\2\2\2AC\4\62;\2BA\3\2\2\2CD\3\2\2\2DB\3\2\2\2DE\3\2\2"+
		"\2E\24\3\2\2\2FG\7*\2\2G\26\3\2\2\2HI\7+\2\2I\30\3\2\2\2JK\7\60\2\2K\32"+
		"\3\2\2\2LM\7<\2\2MN\7/\2\2N\34\3\2\2\2OP\7\u0080\2\2P\36\3\2\2\2QR\7."+
		"\2\2R \3\2\2\2ST\7A\2\2T\"\3\2\2\2UY\5\3\2\2VX\5\5\3\2WV\3\2\2\2X[\3\2"+
		"\2\2YW\3\2\2\2YZ\3\2\2\2Z$\3\2\2\2[Y\3\2\2\2\\`\5\7\4\2]_\5\t\5\2^]\3"+
		"\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2a&\3\2\2\2b`\3\2\2\2cg\5\r\7\2df\5"+
		"\13\6\2ed\3\2\2\2fi\3\2\2\2ge\3\2\2\2gh\3\2\2\2hj\3\2\2\2ig\3\2\2\2jk"+
		"\5\r\7\2k(\3\2\2\2ln\t\4\2\2ml\3\2\2\2no\3\2\2\2om\3\2\2\2op\3\2\2\2p"+
		"q\3\2\2\2qr\b\25\2\2r*\3\2\2\2\13\2/\628DY`go\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}