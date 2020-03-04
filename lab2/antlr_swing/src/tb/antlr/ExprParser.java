// $ANTLR 3.4 /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g 2020-03-04 14:53:58

package tb.antlr;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class ExprParser extends Parser {
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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public ExprParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public ExprParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return ExprParser.tokenNames; }
    public String getGrammarFileName() { return "/home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g"; }


    public static class prog_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "prog"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:16:1: prog : ( stat )+ EOF !;
    public final ExprParser.prog_return prog() throws RecognitionException {
        ExprParser.prog_return retval = new ExprParser.prog_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token EOF2=null;
        ExprParser.stat_return stat1 =null;


        CommonTree EOF2_tree=null;

        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:17:5: ( ( stat )+ EOF !)
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:17:7: ( stat )+ EOF !
            {
            root_0 = (CommonTree)adaptor.nil();


            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:17:7: ( stat )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0 >= ID && LA1_0 <= LP)||LA1_0==NL||LA1_0==VAR) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:17:8: stat
            	    {
            	    pushFollow(FOLLOW_stat_in_prog49);
            	    stat1=stat();

            	    state._fsp--;

            	    adaptor.addChild(root_0, stat1.getTree());

            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);


            EOF2=(Token)match(input,EOF,FOLLOW_EOF_in_prog54); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "prog"


    public static class stat_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "stat"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:19:1: stat : ( expr NL -> expr | VAR ID NL -> ^( VAR ID ) | ID PODST expr NL -> ^( PODST ID expr ) | NL ->);
    public final ExprParser.stat_return stat() throws RecognitionException {
        ExprParser.stat_return retval = new ExprParser.stat_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token NL4=null;
        Token VAR5=null;
        Token ID6=null;
        Token NL7=null;
        Token ID8=null;
        Token PODST9=null;
        Token NL11=null;
        Token NL12=null;
        ExprParser.expr_return expr3 =null;

        ExprParser.expr_return expr10 =null;


        CommonTree NL4_tree=null;
        CommonTree VAR5_tree=null;
        CommonTree ID6_tree=null;
        CommonTree NL7_tree=null;
        CommonTree ID8_tree=null;
        CommonTree PODST9_tree=null;
        CommonTree NL11_tree=null;
        CommonTree NL12_tree=null;
        RewriteRuleTokenStream stream_VAR=new RewriteRuleTokenStream(adaptor,"token VAR");
        RewriteRuleTokenStream stream_PODST=new RewriteRuleTokenStream(adaptor,"token PODST");
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_NL=new RewriteRuleTokenStream(adaptor,"token NL");
        RewriteRuleSubtreeStream stream_expr=new RewriteRuleSubtreeStream(adaptor,"rule expr");
        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:20:5: ( expr NL -> expr | VAR ID NL -> ^( VAR ID ) | ID PODST expr NL -> ^( PODST ID expr ) | NL ->)
            int alt2=4;
            switch ( input.LA(1) ) {
            case INT:
            case LP:
                {
                alt2=1;
                }
                break;
            case ID:
                {
                int LA2_2 = input.LA(2);

                if ( (LA2_2==PODST) ) {
                    alt2=3;
                }
                else if ( (LA2_2==DIV||(LA2_2 >= MINUS && LA2_2 <= PLUS)) ) {
                    alt2=1;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 2, 2, input);

                    throw nvae;

                }
                }
                break;
            case VAR:
                {
                alt2=2;
                }
                break;
            case NL:
                {
                alt2=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:20:7: expr NL
                    {
                    pushFollow(FOLLOW_expr_in_stat67);
                    expr3=expr();

                    state._fsp--;

                    stream_expr.add(expr3.getTree());

                    NL4=(Token)match(input,NL,FOLLOW_NL_in_stat69);  
                    stream_NL.add(NL4);


                    // AST REWRITE
                    // elements: expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 20:15: -> expr
                    {
                        adaptor.addChild(root_0, stream_expr.nextTree());

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 2 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:23:7: VAR ID NL
                    {
                    VAR5=(Token)match(input,VAR,FOLLOW_VAR_in_stat83);  
                    stream_VAR.add(VAR5);


                    ID6=(Token)match(input,ID,FOLLOW_ID_in_stat85);  
                    stream_ID.add(ID6);


                    NL7=(Token)match(input,NL,FOLLOW_NL_in_stat87);  
                    stream_NL.add(NL7);


                    // AST REWRITE
                    // elements: VAR, ID
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 23:17: -> ^( VAR ID )
                    {
                        // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:23:20: ^( VAR ID )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_VAR.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 3 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:24:7: ID PODST expr NL
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_stat103);  
                    stream_ID.add(ID8);


                    PODST9=(Token)match(input,PODST,FOLLOW_PODST_in_stat105);  
                    stream_PODST.add(PODST9);


                    pushFollow(FOLLOW_expr_in_stat107);
                    expr10=expr();

                    state._fsp--;

                    stream_expr.add(expr10.getTree());

                    NL11=(Token)match(input,NL,FOLLOW_NL_in_stat109);  
                    stream_NL.add(NL11);


                    // AST REWRITE
                    // elements: PODST, ID, expr
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 24:24: -> ^( PODST ID expr )
                    {
                        // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:24:27: ^( PODST ID expr )
                        {
                        CommonTree root_1 = (CommonTree)adaptor.nil();
                        root_1 = (CommonTree)adaptor.becomeRoot(
                        stream_PODST.nextNode()
                        , root_1);

                        adaptor.addChild(root_1, 
                        stream_ID.nextNode()
                        );

                        adaptor.addChild(root_1, stream_expr.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;
                case 4 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:26:7: NL
                    {
                    NL12=(Token)match(input,NL,FOLLOW_NL_in_stat128);  
                    stream_NL.add(NL12);


                    // AST REWRITE
                    // elements: 
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (CommonTree)adaptor.nil();
                    // 26:10: ->
                    {
                        root_0 = null;
                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "stat"


    public static class expr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "expr"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:29:1: expr : multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* ;
    public final ExprParser.expr_return expr() throws RecognitionException {
        ExprParser.expr_return retval = new ExprParser.expr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token PLUS14=null;
        Token MINUS16=null;
        ExprParser.multExpr_return multExpr13 =null;

        ExprParser.multExpr_return multExpr15 =null;

        ExprParser.multExpr_return multExpr17 =null;


        CommonTree PLUS14_tree=null;
        CommonTree MINUS16_tree=null;

        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:30:5: ( multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )* )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:30:7: multExpr ( PLUS ^ multExpr | MINUS ^ multExpr )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_multExpr_in_expr147);
            multExpr13=multExpr();

            state._fsp--;

            adaptor.addChild(root_0, multExpr13.getTree());

            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:31:7: ( PLUS ^ multExpr | MINUS ^ multExpr )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==PLUS) ) {
                    alt3=1;
                }
                else if ( (LA3_0==MINUS) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:31:9: PLUS ^ multExpr
            	    {
            	    PLUS14=(Token)match(input,PLUS,FOLLOW_PLUS_in_expr157); 
            	    PLUS14_tree = 
            	    (CommonTree)adaptor.create(PLUS14)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(PLUS14_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr160);
            	    multExpr15=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr15.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:32:9: MINUS ^ multExpr
            	    {
            	    MINUS16=(Token)match(input,MINUS,FOLLOW_MINUS_in_expr170); 
            	    MINUS16_tree = 
            	    (CommonTree)adaptor.create(MINUS16)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MINUS16_tree, root_0);


            	    pushFollow(FOLLOW_multExpr_in_expr173);
            	    multExpr17=multExpr();

            	    state._fsp--;

            	    adaptor.addChild(root_0, multExpr17.getTree());

            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "expr"


    public static class multExpr_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "multExpr"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:36:1: multExpr : atom ( MUL ^ atom | DIV ^ atom )* ;
    public final ExprParser.multExpr_return multExpr() throws RecognitionException {
        ExprParser.multExpr_return retval = new ExprParser.multExpr_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token MUL19=null;
        Token DIV21=null;
        ExprParser.atom_return atom18 =null;

        ExprParser.atom_return atom20 =null;

        ExprParser.atom_return atom22 =null;


        CommonTree MUL19_tree=null;
        CommonTree DIV21_tree=null;

        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:37:5: ( atom ( MUL ^ atom | DIV ^ atom )* )
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:37:7: atom ( MUL ^ atom | DIV ^ atom )*
            {
            root_0 = (CommonTree)adaptor.nil();


            pushFollow(FOLLOW_atom_in_multExpr199);
            atom18=atom();

            state._fsp--;

            adaptor.addChild(root_0, atom18.getTree());

            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:38:7: ( MUL ^ atom | DIV ^ atom )*
            loop4:
            do {
                int alt4=3;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==MUL) ) {
                    alt4=1;
                }
                else if ( (LA4_0==DIV) ) {
                    alt4=2;
                }


                switch (alt4) {
            	case 1 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:38:9: MUL ^ atom
            	    {
            	    MUL19=(Token)match(input,MUL,FOLLOW_MUL_in_multExpr209); 
            	    MUL19_tree = 
            	    (CommonTree)adaptor.create(MUL19)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(MUL19_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr212);
            	    atom20=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom20.getTree());

            	    }
            	    break;
            	case 2 :
            	    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:39:9: DIV ^ atom
            	    {
            	    DIV21=(Token)match(input,DIV,FOLLOW_DIV_in_multExpr222); 
            	    DIV21_tree = 
            	    (CommonTree)adaptor.create(DIV21)
            	    ;
            	    root_0 = (CommonTree)adaptor.becomeRoot(DIV21_tree, root_0);


            	    pushFollow(FOLLOW_atom_in_multExpr225);
            	    atom22=atom();

            	    state._fsp--;

            	    adaptor.addChild(root_0, atom22.getTree());

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "multExpr"


    public static class atom_return extends ParserRuleReturnScope {
        CommonTree tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "atom"
    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:43:1: atom : ( INT | ID | LP ! expr RP !);
    public final ExprParser.atom_return atom() throws RecognitionException {
        ExprParser.atom_return retval = new ExprParser.atom_return();
        retval.start = input.LT(1);


        CommonTree root_0 = null;

        Token INT23=null;
        Token ID24=null;
        Token LP25=null;
        Token RP27=null;
        ExprParser.expr_return expr26 =null;


        CommonTree INT23_tree=null;
        CommonTree ID24_tree=null;
        CommonTree LP25_tree=null;
        CommonTree RP27_tree=null;

        try {
            // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:44:5: ( INT | ID | LP ! expr RP !)
            int alt5=3;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt5=1;
                }
                break;
            case ID:
                {
                alt5=2;
                }
                break;
            case LP:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;

            }

            switch (alt5) {
                case 1 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:44:7: INT
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    INT23=(Token)match(input,INT,FOLLOW_INT_in_atom251); 
                    INT23_tree = 
                    (CommonTree)adaptor.create(INT23)
                    ;
                    adaptor.addChild(root_0, INT23_tree);


                    }
                    break;
                case 2 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:45:7: ID
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    ID24=(Token)match(input,ID,FOLLOW_ID_in_atom259); 
                    ID24_tree = 
                    (CommonTree)adaptor.create(ID24)
                    ;
                    adaptor.addChild(root_0, ID24_tree);


                    }
                    break;
                case 3 :
                    // /home/uml/Dokumenty/235031/lab2imported/antlr_swing/antlr_swing/src/tb/antlr/Expr.g:46:7: LP ! expr RP !
                    {
                    root_0 = (CommonTree)adaptor.nil();


                    LP25=(Token)match(input,LP,FOLLOW_LP_in_atom267); 

                    pushFollow(FOLLOW_expr_in_atom270);
                    expr26=expr();

                    state._fsp--;

                    adaptor.addChild(root_0, expr26.getTree());

                    RP27=(Token)match(input,RP,FOLLOW_RP_in_atom272); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (CommonTree)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (CommonTree)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "atom"

    // Delegated rules


 

    public static final BitSet FOLLOW_stat_in_prog49 = new BitSet(new long[]{0x00000000000044E0L});
    public static final BitSet FOLLOW_EOF_in_prog54 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expr_in_stat67 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat69 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_VAR_in_stat83 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_ID_in_stat85 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat87 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_stat103 = new BitSet(new long[]{0x0000000000001000L});
    public static final BitSet FOLLOW_PODST_in_stat105 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_stat107 = new BitSet(new long[]{0x0000000000000400L});
    public static final BitSet FOLLOW_NL_in_stat109 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NL_in_stat128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_multExpr_in_expr147 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_PLUS_in_expr157 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr160 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_MINUS_in_expr170 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_multExpr_in_expr173 = new BitSet(new long[]{0x0000000000000902L});
    public static final BitSet FOLLOW_atom_in_multExpr199 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_MUL_in_multExpr209 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_atom_in_multExpr212 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_DIV_in_multExpr222 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_atom_in_multExpr225 = new BitSet(new long[]{0x0000000000000212L});
    public static final BitSet FOLLOW_INT_in_atom251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_atom259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LP_in_atom267 = new BitSet(new long[]{0x00000000000000E0L});
    public static final BitSet FOLLOW_expr_in_atom270 = new BitSet(new long[]{0x0000000000002000L});
    public static final BitSet FOLLOW_RP_in_atom272 = new BitSet(new long[]{0x0000000000000002L});

}