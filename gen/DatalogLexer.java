// Generated from C:/Users/nish/projects/antlr4-datalog\Datalog.g4 by ANTLR 4.7
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
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		NUMBER=1, LPAREN=2, RPAREN=3, PERIOD=4, IF=5, COMMA=6, Q_START=7, ATOM=8, 
		VAR=9, WS=10;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"VALID_ATOM_START", "VALID_ATOM_CHAR", "VALID_VAR_START", "VALID_VAR_CHAR", 
		"NUMBER", "LPAREN", "RPAREN", "PERIOD", "IF", "COMMA", "Q_START", "ATOM", 
		"VAR", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, null, "'('", "')'", "'.'", "':-'", "','", "'?-'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, "NUMBER", "LPAREN", "RPAREN", "PERIOD", "IF", "COMMA", "Q_START", 
		"ATOM", "VAR", "WS"
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2\fR\b\1\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\3\2\3\2\3\3\3\3\5\3$\n\3\3\4\5"+
		"\4\'\n\4\3\5\3\5\3\6\6\6,\n\6\r\6\16\6-\3\7\3\7\3\b\3\b\3\t\3\t\3\n\3"+
		"\n\3\n\3\13\3\13\3\f\3\f\3\f\3\r\3\r\7\r@\n\r\f\r\16\rC\13\r\3\16\3\16"+
		"\7\16G\n\16\f\16\16\16J\13\16\3\17\6\17M\n\17\r\17\16\17N\3\17\3\17\2"+
		"\2\20\3\2\5\2\7\2\t\2\13\3\r\4\17\5\21\6\23\7\25\b\27\t\31\n\33\13\35"+
		"\f\3\2\5\4\2\62;C\\\4\2C\\aa\5\2\13\f\17\17\"\"\2R\2\13\3\2\2\2\2\r\3"+
		"\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2"+
		"\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\3\37\3\2\2\2\5#\3\2\2\2\7&\3"+
		"\2\2\2\t(\3\2\2\2\13+\3\2\2\2\r/\3\2\2\2\17\61\3\2\2\2\21\63\3\2\2\2\23"+
		"\65\3\2\2\2\258\3\2\2\2\27:\3\2\2\2\31=\3\2\2\2\33D\3\2\2\2\35L\3\2\2"+
		"\2\37 \4c|\2 \4\3\2\2\2!$\5\3\2\2\"$\t\2\2\2#!\3\2\2\2#\"\3\2\2\2$\6\3"+
		"\2\2\2%\'\t\3\2\2&%\3\2\2\2\'\b\3\2\2\2()\5\5\3\2)\n\3\2\2\2*,\4\62;\2"+
		"+*\3\2\2\2,-\3\2\2\2-+\3\2\2\2-.\3\2\2\2.\f\3\2\2\2/\60\7*\2\2\60\16\3"+
		"\2\2\2\61\62\7+\2\2\62\20\3\2\2\2\63\64\7\60\2\2\64\22\3\2\2\2\65\66\7"+
		"<\2\2\66\67\7/\2\2\67\24\3\2\2\289\7.\2\29\26\3\2\2\2:;\7A\2\2;<\7/\2"+
		"\2<\30\3\2\2\2=A\5\3\2\2>@\5\5\3\2?>\3\2\2\2@C\3\2\2\2A?\3\2\2\2AB\3\2"+
		"\2\2B\32\3\2\2\2CA\3\2\2\2DH\5\7\4\2EG\5\t\5\2FE\3\2\2\2GJ\3\2\2\2HF\3"+
		"\2\2\2HI\3\2\2\2I\34\3\2\2\2JH\3\2\2\2KM\t\4\2\2LK\3\2\2\2MN\3\2\2\2N"+
		"L\3\2\2\2NO\3\2\2\2OP\3\2\2\2PQ\b\17\2\2Q\36\3\2\2\2\t\2#&-AHN\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}