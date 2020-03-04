// $ANTLR 3.4 /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g 2020-03-04 14:53:58

package tb.antlr.interpreter;


import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TExpr1 extends MyTreeParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "DIV", "ID", "INT", "LP", "MINUS", "MUL", "NL", "PLUS", "PODST", "RP", "VAR", "WS"
    };

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
    public MyTreeParser[] getDelegates() {
        return new MyTreeParser[] {};
    }

    // delegators


    public TExpr1(TreeNodeStream input) {
        this(input, new RecognizerSharedState());
    }
    public TExpr1(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    public String[] getTokenNames() { return TExpr1.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g"; }



    // $ANTLR start "prog"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:1: prog : (e= expr | dec )* ;
    public final void prog() throws RecognitionException {
        TExpr1.expr_return e =null;


        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:9: ( (e= expr | dec )* )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:11: (e= expr | dec )*
            {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:11: (e= expr | dec )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= DIV && LA1_0 <= INT)||(LA1_0 >= MINUS && LA1_0 <= MUL)||(LA1_0 >= PLUS && LA1_0 <= PODST)) ) {
                    alt1=1;
                }
                else if ( (LA1_0==VAR) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:14:12: e= expr
            	    {
            	    pushFollow(FOLLOW_expr_in_prog51);
            	    e=expr();

            	    state._fsp--;


            	    drukuj ((e!=null?(input.getTokenStream().toString(input.getTreeAdaptor().getTokenStartIndex(e.start),input.getTreeAdaptor().getTokenStopIndex(e.start))):null) + " = " + (e!=null?e.out:null).toString());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:15:13: dec
            	    {
            	    pushFollow(FOLLOW_dec_in_prog67);
            	    dec();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "prog"


    public static class expr_return extends TreeRuleReturnScope {
        public Integer out;
    };


    // $ANTLR start "expr"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:17:1: expr returns [Integer out] : ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | ID | INT );
    public final TExpr1.expr_return expr() throws RecognitionException {
        TExpr1.expr_return retval = new TExpr1.expr_return();
        retval.start = input.LT(1);


        CommonTree i1=null;
        CommonTree ID1=null;
        CommonTree INT2=null;
        TExpr1.expr_return e1 =null;

        TExpr1.expr_return e2 =null;


        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:18:8: ( ^( PLUS e1= expr e2= expr ) | ^( MINUS e1= expr e2= expr ) | ^( MUL e1= expr e2= expr ) | ^( DIV e1= expr e2= expr ) | ^( PODST i1= ID e2= expr ) | ID | INT )
            int alt2=7;
            switch ( input.LA(1) ) {
            case PLUS:
                {
                alt2=1;
                }
                break;
            case MINUS:
                {
                alt2=2;
                }
                break;
            case MUL:
                {
                alt2=3;
                }
                break;
            case DIV:
                {
                alt2=4;
                }
                break;
            case PODST:
                {
                alt2=5;
                }
                break;
            case ID:
                {
                alt2=6;
                }
                break;
            case INT:
                {
                alt2=7;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:18:10: ^( PLUS e1= expr e2= expr )
                    {
                    match(input,PLUS,FOLLOW_PLUS_in_expr91); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr96);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr100);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = add((e1!=null?e1.out:null), (e2!=null?e2.out:null));

                    }
                    break;
                case 2 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:19:11: ^( MINUS e1= expr e2= expr )
                    {
                    match(input,MINUS,FOLLOW_MINUS_in_expr116); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr120);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr124);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = sub((e1!=null?e1.out:null), (e2!=null?e2.out:null));

                    }
                    break;
                case 3 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:20:11: ^( MUL e1= expr e2= expr )
                    {
                    match(input,MUL,FOLLOW_MUL_in_expr140); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr146);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr150);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = mul((e1!=null?e1.out:null), (e2!=null?e2.out:null));

                    }
                    break;
                case 4 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:21:11: ^( DIV e1= expr e2= expr )
                    {
                    match(input,DIV,FOLLOW_DIV_in_expr166); 

                    match(input, Token.DOWN, null); 
                    pushFollow(FOLLOW_expr_in_expr172);
                    e1=expr();

                    state._fsp--;


                    pushFollow(FOLLOW_expr_in_expr176);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = div((e1!=null?e1.out:null), (e2!=null?e2.out:null));

                    }
                    break;
                case 5 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:22:11: ^( PODST i1= ID e2= expr )
                    {
                    match(input,PODST,FOLLOW_PODST_in_expr192); 

                    match(input, Token.DOWN, null); 
                    i1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr196); 

                    pushFollow(FOLLOW_expr_in_expr202);
                    e2=expr();

                    state._fsp--;


                    match(input, Token.UP, null); 


                    retval.out = setVariable((i1!=null?i1.getText():null), (e2!=null?e2.out:null));

                    }
                    break;
                case 6 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:23:11: ID
                    {
                    ID1=(CommonTree)match(input,ID,FOLLOW_ID_in_expr217); 

                    retval.out = getValue((ID1!=null?ID1.getText():null));

                    }
                    break;
                case 7 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:24:11: INT
                    {
                    INT2=(CommonTree)match(input,INT,FOLLOW_INT_in_expr253); 

                    retval.out = getInt((INT2!=null?INT2.getText():null));

                    }
                    break;

            }
        }
        catch (RuntimeException ex) {
            printEx(ex);
        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"



    // $ANTLR start "dec"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:27:1: dec : ^( VAR i1= ID ) ;
    public final void dec() throws RecognitionException {
        CommonTree i1=null;

        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:28:9: ( ^( VAR i1= ID ) )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/interpreter/TExpr1.g:28:11: ^( VAR i1= ID )
            {
            match(input,VAR,FOLLOW_VAR_in_dec315); 

            match(input, Token.DOWN, null); 
            i1=(CommonTree)match(input,ID,FOLLOW_ID_in_dec319); 

            match(input, Token.UP, null); 


             createVariable((i1!=null?i1.getText():null));

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }

        finally {
        	// do for sure before leaving
        }
        return ;
    }
    // $ANTLR end "dec"

    // Delegated rules


 

    public static final BitSet FOLLOW_expr_in_prog51 = new BitSet(new long[]{0x0000000000005B72L});
    public static final BitSet FOLLOW_dec_in_prog67 = new BitSet(new long[]{0x0000000000005B72L});
    public static final BitSet FOLLOW_PLUS_in_expr91 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr96 = new BitSet(new long[]{0x0000000000001B70L});
    public static final BitSet FOLLOW_expr_in_expr100 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MINUS_in_expr116 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr120 = new BitSet(new long[]{0x0000000000001B70L});
    public static final BitSet FOLLOW_expr_in_expr124 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_MUL_in_expr140 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr146 = new BitSet(new long[]{0x0000000000001B70L});
    public static final BitSet FOLLOW_expr_in_expr150 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_DIV_in_expr166 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_expr_in_expr172 = new BitSet(new long[]{0x0000000000001B70L});
    public static final BitSet FOLLOW_expr_in_expr176 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_PODST_in_expr192 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_expr196 = new BitSet(new long[]{0x0000000000001B70L});
    public static final BitSet FOLLOW_expr_in_expr202 = new BitSet(new long[]{0x0000000000000008L});
    public static final BitSet FOLLOW_ID_in_expr217 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_expr253 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_dec315 = new BitSet(new long[]{0x0000000000000004L});
    public static final BitSet FOLLOW_ID_in_dec319 = new BitSet(new long[]{0x0000000000000008L});

}