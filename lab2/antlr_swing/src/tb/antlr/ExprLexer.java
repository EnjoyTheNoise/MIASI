// $ANTLR 3.4 /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g 2020-03-04 14:53:58

package tb.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprLexer extends Lexer {
    public static final int EOF=-1;
    public static final int DIV=4;
    public static final int ID=5;
    public static final int INT=6;
    public static final int LP=7;
    public static final int MINUS=8;
    public static final int MUL=9;
    public static final int NL=10;
    public static final int PLUS=11;
    public static final int PODST=12;
    public static final int RP=13;
    public static final int VAR=14;
    public static final int WS=15;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public ExprLexer() {} 
    public ExprLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "/home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g"; }

    // $ANTLR start "VAR"
    public final void mVAR() throws RecognitionException {
        try {
            int _type = VAR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:49:5: ( 'var' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:49:6: 'var'
            {
            match("var"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "VAR"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:51:4: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:51:6: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:51:30: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= '0' && LA1_0 <= '9')||(LA1_0 >= 'A' && LA1_0 <= 'Z')||LA1_0=='_'||(LA1_0 >= 'a' && LA1_0 <= 'z')) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
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
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:53:5: ( ( '0' .. '9' )+ )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:53:7: ( '0' .. '9' )+
            {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:53:7: ( '0' .. '9' )+
            int cnt2=0;
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0 >= '0' && LA2_0 <= '9')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:
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
            	    if ( cnt2 >= 1 ) break loop2;
                        EarlyExitException eee =
                            new EarlyExitException(2, input);
                        throw eee;
                }
                cnt2++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "NL"
    public final void mNL() throws RecognitionException {
        try {
            int _type = NL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:55:4: ( ( '\\r' )? '\\n' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:55:6: ( '\\r' )? '\\n'
            {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:55:6: ( '\\r' )?
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='\r') ) {
                alt3=1;
            }
            switch (alt3) {
                case 1 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:55:6: '\\r'
                    {
                    match('\r'); 

                    }
                    break;

            }


            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "NL"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:57:4: ( ( ' ' | '\\t' )+ )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:57:6: ( ' ' | '\\t' )+
            {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:57:6: ( ' ' | '\\t' )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\t'||LA4_0==' ') ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:
            	    {
            	    if ( input.LA(1)=='\t'||input.LA(1)==' ' ) {
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
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);


            _channel = HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    // $ANTLR start "LP"
    public final void mLP() throws RecognitionException {
        try {
            int _type = LP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:61:2: ( '(' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:61:4: '('
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
    // $ANTLR end "LP"

    // $ANTLR start "RP"
    public final void mRP() throws RecognitionException {
        try {
            int _type = RP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:65:2: ( ')' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:65:4: ')'
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
    // $ANTLR end "RP"

    // $ANTLR start "PODST"
    public final void mPODST() throws RecognitionException {
        try {
            int _type = PODST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:69:2: ( '=' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:69:4: '='
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
    // $ANTLR end "PODST"

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:73:2: ( '+' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:73:4: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:77:2: ( '-' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:77:4: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MUL"
    public final void mMUL() throws RecognitionException {
        try {
            int _type = MUL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:81:2: ( '*' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:81:4: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "MUL"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:85:2: ( '/' )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:85:4: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "DIV"

    public void mTokens() throws RecognitionException {
        // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:8: ( VAR | ID | INT | NL | WS | LP | RP | PODST | PLUS | MINUS | MUL | DIV )
        int alt5=12;
        switch ( input.LA(1) ) {
        case 'v':
            {
            int LA5_1 = input.LA(2);

            if ( (LA5_1=='a') ) {
                int LA5_13 = input.LA(3);

                if ( (LA5_13=='r') ) {
                    int LA5_14 = input.LA(4);

                    if ( ((LA5_14 >= '0' && LA5_14 <= '9')||(LA5_14 >= 'A' && LA5_14 <= 'Z')||LA5_14=='_'||(LA5_14 >= 'a' && LA5_14 <= 'z')) ) {
                        alt5=2;
                    }
                    else {
                        alt5=1;
                    }
                }
                else {
                    alt5=2;
                }
            }
            else {
                alt5=2;
            }
            }
            break;
        case 'A':
        case 'B':
        case 'C':
        case 'D':
        case 'E':
        case 'F':
        case 'G':
        case 'H':
        case 'I':
        case 'J':
        case 'K':
        case 'L':
        case 'M':
        case 'N':
        case 'O':
        case 'P':
        case 'Q':
        case 'R':
        case 'S':
        case 'T':
        case 'U':
        case 'V':
        case 'W':
        case 'X':
        case 'Y':
        case 'Z':
        case '_':
        case 'a':
        case 'b':
        case 'c':
        case 'd':
        case 'e':
        case 'f':
        case 'g':
        case 'h':
        case 'i':
        case 'j':
        case 'k':
        case 'l':
        case 'm':
        case 'n':
        case 'o':
        case 'p':
        case 'q':
        case 'r':
        case 's':
        case 't':
        case 'u':
        case 'w':
        case 'x':
        case 'y':
        case 'z':
            {
            alt5=2;
            }
            break;
        case '0':
        case '1':
        case '2':
        case '3':
        case '4':
        case '5':
        case '6':
        case '7':
        case '8':
        case '9':
            {
            alt5=3;
            }
            break;
        case '\n':
        case '\r':
            {
            alt5=4;
            }
            break;
        case '\t':
        case ' ':
            {
            alt5=5;
            }
            break;
        case '(':
            {
            alt5=6;
            }
            break;
        case ')':
            {
            alt5=7;
            }
            break;
        case '=':
            {
            alt5=8;
            }
            break;
        case '+':
            {
            alt5=9;
            }
            break;
        case '-':
            {
            alt5=10;
            }
            break;
        case '*':
            {
            alt5=11;
            }
            break;
        case '/':
            {
            alt5=12;
            }
            break;
        default:
            NoViableAltException nvae =
                new NoViableAltException("", 5, 0, input);

            throw nvae;

        }

        switch (alt5) {
            case 1 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:10: VAR
                {
                mVAR(); 


                }
                break;
            case 2 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:14: ID
                {
                mID(); 


                }
                break;
            case 3 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:17: INT
                {
                mINT(); 


                }
                break;
            case 4 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:21: NL
                {
                mNL(); 


                }
                break;
            case 5 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:24: WS
                {
                mWS(); 


                }
                break;
            case 6 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:27: LP
                {
                mLP(); 


                }
                break;
            case 7 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:30: RP
                {
                mRP(); 


                }
                break;
            case 8 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:33: PODST
                {
                mPODST(); 


                }
                break;
            case 9 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:39: PLUS
                {
                mPLUS(); 


                }
                break;
            case 10 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:44: MINUS
                {
                mMINUS(); 


                }
                break;
            case 11 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:50: MUL
                {
                mMUL(); 


                }
                break;
            case 12 :
                // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:1:54: DIV
                {
                mDIV(); 


                }
                break;

        }

    }


 

}