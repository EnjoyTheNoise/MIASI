// $ANTLR 3.5.1 /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g 2020-03-03 21:16:19

import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.debug.*;
import java.io.IOException;
@SuppressWarnings("all")
public class bitwa1Parser extends DebugParser {
	public static final String[] tokenNames = new String[] {
		"<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMENT", "DIV", "ID", "INT", 
		"LP", "MINUS", "MUL", "NL", "PLUS", "RP", "WS"
	};
	public static final int EOF=-1;
	public static final int COMMENT=4;
	public static final int DIV=5;
	public static final int ID=6;
	public static final int INT=7;
	public static final int LP=8;
	public static final int MINUS=9;
	public static final int MUL=10;
	public static final int NL=11;
	public static final int PLUS=12;
	public static final int RP=13;
	public static final int WS=14;

	// delegates
	public Parser[] getDelegates() {
		return new Parser[] {};
	}

	// delegators


	public static final String[] ruleNames = new String[] {
		"invalidRule", "plik", "atom", "term", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false
	};

 
	public int ruleLevel = 0;
	public int getRuleLevel() { return ruleLevel; }
	public void incRuleLevel() { ruleLevel++; }
	public void decRuleLevel() { ruleLevel--; }
	public bitwa1Parser(TokenStream input) {
		this(input, DebugEventSocketProxy.DEFAULT_DEBUGGER_PORT, new RecognizerSharedState());
	}
	public bitwa1Parser(TokenStream input, int port, RecognizerSharedState state) {
		super(input, state);
		DebugEventSocketProxy proxy =
			new DebugEventSocketProxy(this, port, null);

		setDebugListener(proxy);
		try {
			proxy.handshake();
		}
		catch (IOException ioe) {
			reportError(ioe);
		}
	}

	public bitwa1Parser(TokenStream input, DebugEventListener dbg) {
		super(input, dbg, new RecognizerSharedState());
	}

	protected boolean evalPredicate(boolean result, String predicate) {
		dbg.semanticPredicate(result, predicate);
		return result;
	}

	@Override public String[] getTokenNames() { return bitwa1Parser.tokenNames; }
	@Override public String getGrammarFileName() { return "/home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g"; }


		class ZeroDivException extends RuntimeException {
			ZeroDivException(){
				System.out.println("Chłopie co ty robisz!!!");
			}
		}



	// $ANTLR start "plik"
	// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:13:1: plik : ( expr )* EOF ;
	public final void plik() throws RecognitionException {
		ParserRuleReturnScope expr1 =null;

		try { dbg.enterRule(getGrammarFileName(), "plik");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(13, 0);

		try {
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:13:6: ( ( expr )* EOF )
			dbg.enterAlt(1);

			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:13:8: ( expr )* EOF
			{
			dbg.location(13,8);
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:13:8: ( expr )*
			try { dbg.enterSubRule(1);

			loop1:
			while (true) {
				int alt1=2;
				try { dbg.enterDecision(1, decisionCanBacktrack[1]);

				int LA1_0 = input.LA(1);
				if ( ((LA1_0 >= INT && LA1_0 <= LP)) ) {
					alt1=1;
				}

				} finally {dbg.exitDecision(1);}

				switch (alt1) {
				case 1 :
					dbg.enterAlt(1);

					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:13:8: expr
					{
					dbg.location(13,8);
					pushFollow(FOLLOW_expr_in_plik17);
					expr1=expr();
					state._fsp--;

					}
					break;

				default :
					break loop1;
				}
			}
			} finally {dbg.exitSubRule(1);}
			dbg.location(13,14);
			match(input,EOF,FOLLOW_EOF_in_plik20); dbg.location(13,18);
			System.out.println("Result: " + (expr1!=null?input.toString(expr1.start,expr1.stop):null) + " = " + (expr1!=null?((bitwa1Parser.expr_return)expr1).value:0));
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(14, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plik");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plik"


	public static class expr_return extends ParserRuleReturnScope {
		public int value;
	};


	// $ANTLR start "expr"
	// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:16:1: expr returns [int value] : a= term ( ( PLUS b= term | MINUS b= term ) )* ;
	public final bitwa1Parser.expr_return expr() throws RecognitionException {
		bitwa1Parser.expr_return retval = new bitwa1Parser.expr_return();
		retval.start = input.LT(1);

		int a =0;
		int b =0;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(16, 0);

		try {
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:16:24: (a= term ( ( PLUS b= term | MINUS b= term ) )* )
			dbg.enterAlt(1);

			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:17:2: a= term ( ( PLUS b= term | MINUS b= term ) )*
			{
			dbg.location(17,4);
			pushFollow(FOLLOW_term_in_expr40);
			a=term();
			state._fsp--;
			dbg.location(17,11);
			retval.value = a;dbg.location(18,2);
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:18:2: ( ( PLUS b= term | MINUS b= term ) )*
			try { dbg.enterSubRule(3);

			loop3:
			while (true) {
				int alt3=2;
				try { dbg.enterDecision(3, decisionCanBacktrack[3]);

				int LA3_0 = input.LA(1);
				if ( (LA3_0==MINUS||LA3_0==PLUS) ) {
					alt3=1;
				}

				} finally {dbg.exitDecision(3);}

				switch (alt3) {
				case 1 :
					dbg.enterAlt(1);

					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:18:3: ( PLUS b= term | MINUS b= term )
					{
					dbg.location(18,3);
					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:18:3: ( PLUS b= term | MINUS b= term )
					int alt2=2;
					try { dbg.enterSubRule(2);
					try { dbg.enterDecision(2, decisionCanBacktrack[2]);

					int LA2_0 = input.LA(1);
					if ( (LA2_0==PLUS) ) {
						alt2=1;
					}
					else if ( (LA2_0==MINUS) ) {
						alt2=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 2, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(2);}

					switch (alt2) {
						case 1 :
							dbg.enterAlt(1);

							// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:18:4: PLUS b= term
							{
							dbg.location(18,4);
							match(input,PLUS,FOLLOW_PLUS_in_expr47); dbg.location(18,11);
							pushFollow(FOLLOW_term_in_expr53);
							b=term();
							state._fsp--;
							dbg.location(18,18);
							retval.value += b;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:19:4: MINUS b= term
							{
							dbg.location(19,4);
							match(input,MINUS,FOLLOW_MINUS_in_expr60); dbg.location(19,12);
							pushFollow(FOLLOW_term_in_expr66);
							b=term();
							state._fsp--;
							dbg.location(19,19);
							retval.value -= b;
							}
							break;

					}
					} finally {dbg.exitSubRule(2);}

					}
					break;

				default :
					break loop3;
				}
			}
			} finally {dbg.exitSubRule(3);}

			}

			retval.stop = input.LT(-1);

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(20, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "expr");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return retval;
	}
	// $ANTLR end "expr"



	// $ANTLR start "term"
	// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:22:1: term returns [int value] : a= atom ( ( MUL b= atom | DIV b= atom ) )* ;
	public final int term() throws RecognitionException {
		int value = 0;


		int a =0;
		int b =0;

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(22, 0);

		try {
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:22:24: (a= atom ( ( MUL b= atom | DIV b= atom ) )* )
			dbg.enterAlt(1);

			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:23:2: a= atom ( ( MUL b= atom | DIV b= atom ) )*
			{
			dbg.location(23,4);
			pushFollow(FOLLOW_atom_in_term89);
			a=atom();
			state._fsp--;
			dbg.location(23,11);
			value = a;dbg.location(24,2);
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:24:2: ( ( MUL b= atom | DIV b= atom ) )*
			try { dbg.enterSubRule(5);

			loop5:
			while (true) {
				int alt5=2;
				try { dbg.enterDecision(5, decisionCanBacktrack[5]);

				int LA5_0 = input.LA(1);
				if ( (LA5_0==DIV||LA5_0==MUL) ) {
					alt5=1;
				}

				} finally {dbg.exitDecision(5);}

				switch (alt5) {
				case 1 :
					dbg.enterAlt(1);

					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:24:3: ( MUL b= atom | DIV b= atom )
					{
					dbg.location(24,3);
					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:24:3: ( MUL b= atom | DIV b= atom )
					int alt4=2;
					try { dbg.enterSubRule(4);
					try { dbg.enterDecision(4, decisionCanBacktrack[4]);

					int LA4_0 = input.LA(1);
					if ( (LA4_0==MUL) ) {
						alt4=1;
					}
					else if ( (LA4_0==DIV) ) {
						alt4=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 4, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(4);}

					switch (alt4) {
						case 1 :
							dbg.enterAlt(1);

							// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:24:4: MUL b= atom
							{
							dbg.location(24,4);
							match(input,MUL,FOLLOW_MUL_in_term97); dbg.location(24,10);
							pushFollow(FOLLOW_atom_in_term103);
							b=atom();
							state._fsp--;
							dbg.location(24,17);
							value *= b;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:25:4: DIV b= atom
							{
							dbg.location(25,4);
							match(input,DIV,FOLLOW_DIV_in_term110); dbg.location(25,10);
							pushFollow(FOLLOW_atom_in_term116);
							b=atom();
							state._fsp--;
							dbg.location(25,17);
							 if(b == 0) 
											throw new ZeroDivException();  
										value /= b;
								
							}
							break;

					}
					} finally {dbg.exitSubRule(4);}

					}
					break;

				default :
					break loop5;
				}
			}
			} finally {dbg.exitSubRule(5);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(29, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "term"



	// $ANTLR start "atom"
	// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:31:1: atom returns [int value] : ( INT | LP expr RP );
	public final int atom() throws RecognitionException {
		int value = 0;


		Token INT2=null;
		ParserRuleReturnScope expr3 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(31, 0);

		try {
			// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:31:24: ( INT | LP expr RP )
			int alt6=2;
			try { dbg.enterDecision(6, decisionCanBacktrack[6]);

			int LA6_0 = input.LA(1);
			if ( (LA6_0==INT) ) {
				alt6=1;
			}
			else if ( (LA6_0==LP) ) {
				alt6=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 6, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(6);}

			switch (alt6) {
				case 1 :
					dbg.enterAlt(1);

					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:32:2: INT
					{
					dbg.location(32,2);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_atom135); dbg.location(32,6);
					value = Integer.parseInt((INT2!=null?INT2.getText():null));
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/student/Pulpit/MIASI/MIASI/lab1/bitwa1.g:33:4: LP expr RP
					{
					dbg.location(33,4);
					match(input,LP,FOLLOW_LP_in_atom143); dbg.location(33,7);
					pushFollow(FOLLOW_expr_in_atom145);
					expr3=expr();
					state._fsp--;
					dbg.location(33,12);
					match(input,RP,FOLLOW_RP_in_atom147); dbg.location(33,15);
					value = (expr3!=null?((bitwa1Parser.expr_return)expr3).value:0);
					}
					break;

			}
		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(34, 1);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return value;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_plik17 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_EOF_in_plik20 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr40 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_PLUS_in_expr47 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_term_in_expr53 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_MINUS_in_expr60 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_term_in_expr66 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_atom_in_term89 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_MUL_in_term97 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_term103 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_DIV_in_term110 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_term116 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_INT_in_atom135 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom143 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_expr_in_atom145 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom147 = new BitSet(new long[]{0x0000000000000002L});
}
