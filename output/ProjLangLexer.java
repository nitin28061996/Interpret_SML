// $ANTLR null C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g 2019-12-13 13:39:23

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class ProjLangLexer extends Lexer {
	public static final int EOF=-1;
	public static final int T__25=25;
	public static final int T__26=26;
	public static final int T__27=27;
	public static final int T__28=28;
	public static final int T__29=29;
	public static final int T__30=30;
	public static final int T__31=31;
	public static final int ADDOP=4;
	public static final int ASSIGN=5;
	public static final int DIGIT=6;
	public static final int ELSE=7;
	public static final int END=8;
	public static final int EQUAL=9;
	public static final int FALSE=10;
	public static final int ID=11;
	public static final int IF=12;
	public static final int LETTER=13;
	public static final int LF=14;
	public static final int LPAR=15;
	public static final int MULOP=16;
	public static final int NOTEQ=17;
	public static final int NUM=18;
	public static final int RELOP=19;
	public static final int RF=20;
	public static final int RPAR=21;
	public static final int SC=22;
	public static final int TRUE=23;
	public static final int WS=24;

	// delegates
	// delegators
	public Lexer[] getDelegates() {
		return new Lexer[] {};
	}

	public ProjLangLexer() {} 
	public ProjLangLexer(CharStream input) {
		this(input, new RecognizerSharedState());
	}
	public ProjLangLexer(CharStream input, RecognizerSharedState state) {
		super(input,state);
	}
	@Override public String getGrammarFileName() { return "C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g"; }

	// $ANTLR start "T__25"
	public final void mT__25() throws RecognitionException {
		try {
			int _type = T__25;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:2:7: ( 'do' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:2:9: 'do'
			{
			match("do"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__25"

	// $ANTLR start "T__26"
	public final void mT__26() throws RecognitionException {
		try {
			int _type = T__26;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:3:7: ( 'fun' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:3:9: 'fun'
			{
			match("fun"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__26"

	// $ANTLR start "T__27"
	public final void mT__27() throws RecognitionException {
		try {
			int _type = T__27;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:4:7: ( 'in' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:4:9: 'in'
			{
			match("in"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__27"

	// $ANTLR start "T__28"
	public final void mT__28() throws RecognitionException {
		try {
			int _type = T__28;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:5:7: ( 'let' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:5:9: 'let'
			{
			match("let"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__28"

	// $ANTLR start "T__29"
	public final void mT__29() throws RecognitionException {
		try {
			int _type = T__29;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:6:7: ( 'then' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:6:9: 'then'
			{
			match("then"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__29"

	// $ANTLR start "T__30"
	public final void mT__30() throws RecognitionException {
		try {
			int _type = T__30;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:7:7: ( 'val' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:7:9: 'val'
			{
			match("val"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__30"

	// $ANTLR start "T__31"
	public final void mT__31() throws RecognitionException {
		try {
			int _type = T__31;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:8:7: ( 'while' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:8:9: 'while'
			{
			match("while"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "T__31"

	// $ANTLR start "LETTER"
	public final void mLETTER() throws RecognitionException {
		try {
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:4:3: ( 'a' .. 'z' | 'A' .. 'Z' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
			{
			if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LETTER"

	// $ANTLR start "DIGIT"
	public final void mDIGIT() throws RecognitionException {
		try {
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:6:3: ( '0' .. '9' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
			{
			if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "DIGIT"

	// $ANTLR start "NUM"
	public final void mNUM() throws RecognitionException {
		try {
			int _type = NUM;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:7:5: ( ( DIGIT )+ )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:7:7: ( DIGIT )+
			{
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:7:7: ( DIGIT )+
			int cnt1=0;
			loop1:
			while (true) {
				int alt1=2;
				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= '0' && LA1_0 <= '9')) ) {
					alt1=1;
				}

				switch (alt1) {
				case 1 :
					// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt1 >= 1 ) break loop1;
					EarlyExitException eee = new EarlyExitException(1, input);
					throw eee;
				}
				cnt1++;
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NUM"

	// $ANTLR start "ADDOP"
	public final void mADDOP() throws RecognitionException {
		try {
			int _type = ADDOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:8:7: ( '+' | '-' | '|' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
			{
			if ( input.LA(1)=='+'||input.LA(1)=='-'||input.LA(1)=='|' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ADDOP"

	// $ANTLR start "MULOP"
	public final void mMULOP() throws RecognitionException {
		try {
			int _type = MULOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:9:7: ( '*' | '/' | '&' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
			{
			if ( input.LA(1)=='&'||input.LA(1)=='*'||input.LA(1)=='/' ) {
				input.consume();
			}
			else {
				MismatchedSetException mse = new MismatchedSetException(null,input);
				recover(mse);
				throw mse;
			}
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "MULOP"

	// $ANTLR start "RELOP"
	public final void mRELOP() throws RecognitionException {
		try {
			int _type = RELOP;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:10:9: ( '<' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:10:11: '<'
			{
			match('<'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RELOP"

	// $ANTLR start "EQUAL"
	public final void mEQUAL() throws RecognitionException {
		try {
			int _type = EQUAL;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:11:7: ( '=' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:11:9: '='
			{
			match('='); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "EQUAL"

	// $ANTLR start "LPAR"
	public final void mLPAR() throws RecognitionException {
		try {
			int _type = LPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:12:6: ( '(' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:12:8: '('
			{
			match('('); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LPAR"

	// $ANTLR start "RPAR"
	public final void mRPAR() throws RecognitionException {
		try {
			int _type = RPAR;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:13:6: ( ')' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:13:8: ')'
			{
			match(')'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RPAR"

	// $ANTLR start "LF"
	public final void mLF() throws RecognitionException {
		try {
			int _type = LF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:14:4: ( '{' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:14:6: '{'
			{
			match('{'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "LF"

	// $ANTLR start "RF"
	public final void mRF() throws RecognitionException {
		try {
			int _type = RF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:15:4: ( '}' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:15:6: '}'
			{
			match('}'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "RF"

	// $ANTLR start "ASSIGN"
	public final void mASSIGN() throws RecognitionException {
		try {
			int _type = ASSIGN;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:16:8: ( ':=' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:16:10: ':='
			{
			match(":="); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ASSIGN"

	// $ANTLR start "TRUE"
	public final void mTRUE() throws RecognitionException {
		try {
			int _type = TRUE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:17:7: ( 'true' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:17:9: 'true'
			{
			match("true"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "TRUE"

	// $ANTLR start "FALSE"
	public final void mFALSE() throws RecognitionException {
		try {
			int _type = FALSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:18:8: ( 'false' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:18:10: 'false'
			{
			match("false"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "FALSE"

	// $ANTLR start "IF"
	public final void mIF() throws RecognitionException {
		try {
			int _type = IF;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:19:4: ( 'if' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:19:6: 'if'
			{
			match("if"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "IF"

	// $ANTLR start "ELSE"
	public final void mELSE() throws RecognitionException {
		try {
			int _type = ELSE;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:20:7: ( 'else' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:20:9: 'else'
			{
			match("else"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ELSE"

	// $ANTLR start "SC"
	public final void mSC() throws RecognitionException {
		try {
			int _type = SC;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:21:3: ( ';' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:21:5: ';'
			{
			match(';'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "SC"

	// $ANTLR start "END"
	public final void mEND() throws RecognitionException {
		try {
			int _type = END;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:22:4: ( 'end' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:22:5: 'end'
			{
			match("end"); 

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "END"

	// $ANTLR start "NOTEQ"
	public final void mNOTEQ() throws RecognitionException {
		try {
			int _type = NOTEQ;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:23:6: ( '!' )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:23:8: '!'
			{
			match('!'); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "NOTEQ"

	// $ANTLR start "WS"
	public final void mWS() throws RecognitionException {
		try {
			int _type = WS;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:24:4: ( ( ' ' | '\\t' | '\\n' | '\\r' )+ )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:24:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			{
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:24:6: ( ' ' | '\\t' | '\\n' | '\\r' )+
			int cnt2=0;
			loop2:
			while (true) {
				int alt2=2;
				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= '\t' && LA2_0 <= '\n')||LA2_0=='\r'||LA2_0==' ') ) {
					alt2=1;
				}

				switch (alt2) {
				case 1 :
					// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
					{
					if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||input.LA(1)=='\r'||input.LA(1)==' ' ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					if ( cnt2 >= 1 ) break loop2;
					EarlyExitException eee = new EarlyExitException(2, input);
					throw eee;
				}
				cnt2++;
			}

			 skip(); 
			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "WS"

	// $ANTLR start "ID"
	public final void mID() throws RecognitionException {
		try {
			int _type = ID;
			int _channel = DEFAULT_TOKEN_CHANNEL;
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:25:4: ( LETTER ( LETTER | DIGIT )* )
			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:25:6: LETTER ( LETTER | DIGIT )*
			{
			mLETTER(); 

			// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:25:13: ( LETTER | DIGIT )*
			loop3:
			while (true) {
				int alt3=2;
				int LA3_0 = input.LA(1);
				if ( ((LA3_0 >= '0' && LA3_0 <= '9')||(LA3_0 >= 'A' && LA3_0 <= 'Z')||(LA3_0 >= 'a' && LA3_0 <= 'z')) ) {
					alt3=1;
				}

				switch (alt3) {
				case 1 :
					// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:
					{
					if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
						input.consume();
					}
					else {
						MismatchedSetException mse = new MismatchedSetException(null,input);
						recover(mse);
						throw mse;
					}
					}
					break;

				default :
					break loop3;
				}
			}

			}

			state.type = _type;
			state.channel = _channel;
		}
		finally {
			// do for sure before leaving
		}
	}
	// $ANTLR end "ID"

	@Override
	public void mTokens() throws RecognitionException {
		// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:8: ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | NUM | ADDOP | MULOP | RELOP | EQUAL | LPAR | RPAR | LF | RF | ASSIGN | TRUE | FALSE | IF | ELSE | SC | END | NOTEQ | WS | ID )
		int alt4=26;
		alt4 = dfa4.predict(input);
		switch (alt4) {
			case 1 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:10: T__25
				{
				mT__25(); 

				}
				break;
			case 2 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:16: T__26
				{
				mT__26(); 

				}
				break;
			case 3 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:22: T__27
				{
				mT__27(); 

				}
				break;
			case 4 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:28: T__28
				{
				mT__28(); 

				}
				break;
			case 5 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:34: T__29
				{
				mT__29(); 

				}
				break;
			case 6 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:40: T__30
				{
				mT__30(); 

				}
				break;
			case 7 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:46: T__31
				{
				mT__31(); 

				}
				break;
			case 8 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:52: NUM
				{
				mNUM(); 

				}
				break;
			case 9 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:56: ADDOP
				{
				mADDOP(); 

				}
				break;
			case 10 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:62: MULOP
				{
				mMULOP(); 

				}
				break;
			case 11 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:68: RELOP
				{
				mRELOP(); 

				}
				break;
			case 12 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:74: EQUAL
				{
				mEQUAL(); 

				}
				break;
			case 13 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:80: LPAR
				{
				mLPAR(); 

				}
				break;
			case 14 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:85: RPAR
				{
				mRPAR(); 

				}
				break;
			case 15 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:90: LF
				{
				mLF(); 

				}
				break;
			case 16 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:93: RF
				{
				mRF(); 

				}
				break;
			case 17 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:96: ASSIGN
				{
				mASSIGN(); 

				}
				break;
			case 18 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:103: TRUE
				{
				mTRUE(); 

				}
				break;
			case 19 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:108: FALSE
				{
				mFALSE(); 

				}
				break;
			case 20 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:114: IF
				{
				mIF(); 

				}
				break;
			case 21 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:117: ELSE
				{
				mELSE(); 

				}
				break;
			case 22 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:122: SC
				{
				mSC(); 

				}
				break;
			case 23 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:125: END
				{
				mEND(); 

				}
				break;
			case 24 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:129: NOTEQ
				{
				mNOTEQ(); 

				}
				break;
			case 25 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:135: WS
				{
				mWS(); 

				}
				break;
			case 26 :
				// C:\\Users\\nitin\\Desktop\\PL_Project2\\ProjLang.g:1:138: ID
				{
				mID(); 

				}
				break;

		}
	}


	protected DFA4 dfa4 = new DFA4(this);
	static final String DFA4_eotS =
		"\1\uffff\7\26\12\uffff\1\26\4\uffff\1\43\2\26\1\46\1\47\7\26\1\uffff\1"+
		"\57\1\26\2\uffff\1\61\2\26\1\64\2\26\1\67\1\uffff\1\26\1\uffff\1\71\1"+
		"\72\1\uffff\1\26\1\74\1\uffff\1\75\2\uffff\1\76\3\uffff";
	static final String DFA4_eofS =
		"\77\uffff";
	static final String DFA4_minS =
		"\1\11\1\157\1\141\1\146\1\145\1\150\1\141\1\150\12\uffff\1\154\4\uffff"+
		"\1\60\1\156\1\154\2\60\1\164\1\145\1\165\1\154\1\151\1\163\1\144\1\uffff"+
		"\1\60\1\163\2\uffff\1\60\1\156\1\145\1\60\1\154\1\145\1\60\1\uffff\1\145"+
		"\1\uffff\2\60\1\uffff\1\145\1\60\1\uffff\1\60\2\uffff\1\60\3\uffff";
	static final String DFA4_maxS =
		"\1\175\1\157\1\165\1\156\1\145\1\162\1\141\1\150\12\uffff\1\156\4\uffff"+
		"\1\172\1\156\1\154\2\172\1\164\1\145\1\165\1\154\1\151\1\163\1\144\1\uffff"+
		"\1\172\1\163\2\uffff\1\172\1\156\1\145\1\172\1\154\1\145\1\172\1\uffff"+
		"\1\145\1\uffff\2\172\1\uffff\1\145\1\172\1\uffff\1\172\2\uffff\1\172\3"+
		"\uffff";
	static final String DFA4_acceptS =
		"\10\uffff\1\10\1\11\1\12\1\13\1\14\1\15\1\16\1\17\1\20\1\21\1\uffff\1"+
		"\26\1\30\1\31\1\32\14\uffff\1\1\2\uffff\1\3\1\24\7\uffff\1\2\1\uffff\1"+
		"\4\2\uffff\1\6\2\uffff\1\27\1\uffff\1\5\1\22\1\uffff\1\25\1\23\1\7";
	static final String DFA4_specialS =
		"\77\uffff}>";
	static final String[] DFA4_transitionS = {
			"\2\25\2\uffff\1\25\22\uffff\1\25\1\24\4\uffff\1\12\1\uffff\1\15\1\16"+
			"\1\12\1\11\1\uffff\1\11\1\uffff\1\12\12\10\1\21\1\23\1\13\1\14\3\uffff"+
			"\32\26\6\uffff\3\26\1\1\1\22\1\2\2\26\1\3\2\26\1\4\7\26\1\5\1\26\1\6"+
			"\1\7\3\26\1\17\1\11\1\20",
			"\1\27",
			"\1\31\23\uffff\1\30",
			"\1\33\7\uffff\1\32",
			"\1\34",
			"\1\35\11\uffff\1\36",
			"\1\37",
			"\1\40",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"",
			"\1\41\1\uffff\1\42",
			"",
			"",
			"",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\44",
			"\1\45",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\50",
			"\1\51",
			"\1\52",
			"\1\53",
			"\1\54",
			"\1\55",
			"\1\56",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\60",
			"",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\62",
			"\1\63",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\1\65",
			"\1\66",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"\1\70",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"\1\73",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"",
			"\12\26\7\uffff\32\26\6\uffff\32\26",
			"",
			"",
			""
	};

	static final short[] DFA4_eot = DFA.unpackEncodedString(DFA4_eotS);
	static final short[] DFA4_eof = DFA.unpackEncodedString(DFA4_eofS);
	static final char[] DFA4_min = DFA.unpackEncodedStringToUnsignedChars(DFA4_minS);
	static final char[] DFA4_max = DFA.unpackEncodedStringToUnsignedChars(DFA4_maxS);
	static final short[] DFA4_accept = DFA.unpackEncodedString(DFA4_acceptS);
	static final short[] DFA4_special = DFA.unpackEncodedString(DFA4_specialS);
	static final short[][] DFA4_transition;

	static {
		int numStates = DFA4_transitionS.length;
		DFA4_transition = new short[numStates][];
		for (int i=0; i<numStates; i++) {
			DFA4_transition[i] = DFA.unpackEncodedString(DFA4_transitionS[i]);
		}
	}

	protected class DFA4 extends DFA {

		public DFA4(BaseRecognizer recognizer) {
			this.recognizer = recognizer;
			this.decisionNumber = 4;
			this.eot = DFA4_eot;
			this.eof = DFA4_eof;
			this.min = DFA4_min;
			this.max = DFA4_max;
			this.accept = DFA4_accept;
			this.special = DFA4_special;
			this.transition = DFA4_transition;
		}
		@Override
		public String getDescription() {
			return "1:1: Tokens : ( T__25 | T__26 | T__27 | T__28 | T__29 | T__30 | T__31 | NUM | ADDOP | MULOP | RELOP | EQUAL | LPAR | RPAR | LF | RF | ASSIGN | TRUE | FALSE | IF | ELSE | SC | END | NOTEQ | WS | ID );";
		}
	}

}
