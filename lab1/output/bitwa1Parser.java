// $ANTLR 3.5.1 /home/uml/Dokumenty/235031/lab1/bitwa1.g 2020-02-26 14:45:39

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
		"invalidRule", "term", "atom", "plik", "expr"
	};

	public static final boolean[] decisionCanBacktrack = new boolean[] {
		false, // invalid decision
		false, false, false, false, false, false, false, false
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
	@Override public String getGrammarFileName() { return "/home/uml/Dokumenty/235031/lab1/bitwa1.g"; }



	// $ANTLR start "plik"
	// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:1: plik : ( expr ( NL )+ )* EOF ;
	public final void plik() throws RecognitionException {
		ParserRuleReturnScope expr1 =null;

		try { dbg.enterRule(getGrammarFileName(), "plik");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(3, 0);

		try {
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:6: ( ( expr ( NL )+ )* EOF )
			dbg.enterAlt(1);

			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:8: ( expr ( NL )+ )* EOF
			{
			dbg.location(3,8);
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:8: ( expr ( NL )+ )*
			try { dbg.enterSubRule(2);

			loop2:
			while (true) {
				int alt2=2;
				try { dbg.enterDecision(2, decisionCanBacktrack[2]);

				int LA2_0 = input.LA(1);
				if ( ((LA2_0 >= INT && LA2_0 <= LP)) ) {
					alt2=1;
				}

				} finally {dbg.exitDecision(2);}

				switch (alt2) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:9: expr ( NL )+
					{
					dbg.location(3,9);
					pushFollow(FOLLOW_expr_in_plik11);
					expr1=expr();
					state._fsp--;
					dbg.location(3,14);
					System.out.println((expr1!=null?input.toString(expr1.start,expr1.stop):null) + " = " + (expr1!=null?((bitwa1Parser.expr_return)expr1).res:null));dbg.location(3,68);
					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:68: ( NL )+
					int cnt1=0;
					try { dbg.enterSubRule(1);

					loop1:
					while (true) {
						int alt1=2;
						try { dbg.enterDecision(1, decisionCanBacktrack[1]);

						int LA1_0 = input.LA(1);
						if ( (LA1_0==NL) ) {
							alt1=1;
						}

						} finally {dbg.exitDecision(1);}

						switch (alt1) {
						case 1 :
							dbg.enterAlt(1);

							// /home/uml/Dokumenty/235031/lab1/bitwa1.g:3:68: NL
							{
							dbg.location(3,68);
							match(input,NL,FOLLOW_NL_in_plik15); 
							}
							break;

						default :
							if ( cnt1 >= 1 ) break loop1;
							EarlyExitException eee = new EarlyExitException(1, input);
							dbg.recognitionException(eee);

							throw eee;
						}
						cnt1++;
					}
					} finally {dbg.exitSubRule(1);}

					}
					break;

				default :
					break loop2;
				}
			}
			} finally {dbg.exitSubRule(2);}
			dbg.location(3,74);
			match(input,EOF,FOLLOW_EOF_in_plik20); 
			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(3, 76);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "plik");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

	}
	// $ANTLR end "plik"


	public static class expr_return extends ParserRuleReturnScope {
		public Integer res;
	};


	// $ANTLR start "expr"
	// /home/uml/Dokumenty/235031/lab1/bitwa1.g:5:3: expr returns [Integer res] : t1= term ( ( PLUS t2= term | MINUS t2= term ) )* ;
	public final bitwa1Parser.expr_return expr() throws RecognitionException {
		bitwa1Parser.expr_return retval = new bitwa1Parser.expr_return();
		retval.start = input.LT(1);

		Integer t1 =null;
		Integer t2 =null;

		try { dbg.enterRule(getGrammarFileName(), "expr");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(5, 2);

		try {
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:5:29: (t1= term ( ( PLUS t2= term | MINUS t2= term ) )* )
			dbg.enterAlt(1);

			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:6:3: t1= term ( ( PLUS t2= term | MINUS t2= term ) )*
			{
			dbg.location(6,6);
			pushFollow(FOLLOW_term_in_expr40);
			t1=term();
			state._fsp--;
			dbg.location(6,13);
			retval.res =t1;dbg.location(7,3);
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:7:3: ( ( PLUS t2= term | MINUS t2= term ) )*
			try { dbg.enterSubRule(4);

			loop4:
			while (true) {
				int alt4=2;
				try { dbg.enterDecision(4, decisionCanBacktrack[4]);

				int LA4_0 = input.LA(1);
				if ( (LA4_0==MINUS||LA4_0==PLUS) ) {
					alt4=1;
				}

				} finally {dbg.exitDecision(4);}

				switch (alt4) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:7:4: ( PLUS t2= term | MINUS t2= term )
					{
					dbg.location(7,4);
					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:7:4: ( PLUS t2= term | MINUS t2= term )
					int alt3=2;
					try { dbg.enterSubRule(3);
					try { dbg.enterDecision(3, decisionCanBacktrack[3]);

					int LA3_0 = input.LA(1);
					if ( (LA3_0==PLUS) ) {
						alt3=1;
					}
					else if ( (LA3_0==MINUS) ) {
						alt3=2;
					}

					else {
						NoViableAltException nvae =
							new NoViableAltException("", 3, 0, input);
						dbg.recognitionException(nvae);
						throw nvae;
					}

					} finally {dbg.exitDecision(3);}

					switch (alt3) {
						case 1 :
							dbg.enterAlt(1);

							// /home/uml/Dokumenty/235031/lab1/bitwa1.g:7:5: PLUS t2= term
							{
							dbg.location(7,5);
							match(input,PLUS,FOLLOW_PLUS_in_expr49); dbg.location(7,13);
							pushFollow(FOLLOW_term_in_expr55);
							t2=term();
							state._fsp--;
							dbg.location(7,20);
							retval.res += t2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/uml/Dokumenty/235031/lab1/bitwa1.g:7:41: MINUS t2= term
							{
							dbg.location(7,41);
							match(input,MINUS,FOLLOW_MINUS_in_expr61); dbg.location(7,50);
							pushFollow(FOLLOW_term_in_expr67);
							t2=term();
							state._fsp--;
							dbg.location(7,57);
							retval.res -= t2;
							}
							break;

					}
					} finally {dbg.exitSubRule(3);}

					}
					break;

				default :
					break loop4;
				}
			}
			} finally {dbg.exitSubRule(4);}

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
		dbg.location(7, 77);

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
	// /home/uml/Dokumenty/235031/lab1/bitwa1.g:9:3: term returns [Integer res] : a1= atom ( ( MUL a2= atom | DIV a2= atom ({...}?|) ) )* ;
	public final Integer term() throws RecognitionException {
		Integer res = null;


		Integer a1 =null;
		Integer a2 =null;

		try { dbg.enterRule(getGrammarFileName(), "term");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(9, 2);

		try {
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:9:30: (a1= atom ( ( MUL a2= atom | DIV a2= atom ({...}?|) ) )* )
			dbg.enterAlt(1);

			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:10:3: a1= atom ( ( MUL a2= atom | DIV a2= atom ({...}?|) ) )*
			{
			dbg.location(10,6);
			pushFollow(FOLLOW_atom_in_term95);
			a1=atom();
			state._fsp--;
			dbg.location(10,13);
			res =a1;dbg.location(11,3);
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:11:3: ( ( MUL a2= atom | DIV a2= atom ({...}?|) ) )*
			try { dbg.enterSubRule(7);

			loop7:
			while (true) {
				int alt7=2;
				try { dbg.enterDecision(7, decisionCanBacktrack[7]);

				int LA7_0 = input.LA(1);
				if ( (LA7_0==DIV||LA7_0==MUL) ) {
					alt7=1;
				}

				} finally {dbg.exitDecision(7);}

				switch (alt7) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:11:4: ( MUL a2= atom | DIV a2= atom ({...}?|) )
					{
					dbg.location(11,4);
					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:11:4: ( MUL a2= atom | DIV a2= atom ({...}?|) )
					int alt6=2;
					try { dbg.enterSubRule(6);
					try { dbg.enterDecision(6, decisionCanBacktrack[6]);

					int LA6_0 = input.LA(1);
					if ( (LA6_0==MUL) ) {
						alt6=1;
					}
					else if ( (LA6_0==DIV) ) {
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

							// /home/uml/Dokumenty/235031/lab1/bitwa1.g:11:5: MUL a2= atom
							{
							dbg.location(11,5);
							match(input,MUL,FOLLOW_MUL_in_term104); dbg.location(11,12);
							pushFollow(FOLLOW_atom_in_term110);
							a2=atom();
							state._fsp--;
							dbg.location(11,19);
							res *= a2;
							}
							break;
						case 2 :
							dbg.enterAlt(2);

							// /home/uml/Dokumenty/235031/lab1/bitwa1.g:12:5: DIV a2= atom ({...}?|)
							{
							dbg.location(12,5);
							match(input,DIV,FOLLOW_DIV_in_term119); dbg.location(12,11);
							pushFollow(FOLLOW_atom_in_term124);
							a2=atom();
							state._fsp--;
							dbg.location(12,17);
							// /home/uml/Dokumenty/235031/lab1/bitwa1.g:12:17: ({...}?|)
							int alt5=2;
							try { dbg.enterSubRule(5);
							try { dbg.enterDecision(5, decisionCanBacktrack[5]);

							switch ( input.LA(1) ) {
							case PLUS:
								{
								int LA5_1 = input.LA(2);
								if ( (evalPredicate(a2 != 0,"a2 != 0")) ) {
									alt5=1;
								}
								else if ( (true) ) {
									alt5=2;
								}

								}
								break;
							case MINUS:
								{
								int LA5_2 = input.LA(2);
								if ( (evalPredicate(a2 != 0,"a2 != 0")) ) {
									alt5=1;
								}
								else if ( (true) ) {
									alt5=2;
								}

								}
								break;
							case NL:
								{
								int LA5_3 = input.LA(2);
								if ( (evalPredicate(a2 != 0,"a2 != 0")) ) {
									alt5=1;
								}
								else if ( (true) ) {
									alt5=2;
								}

								}
								break;
							case RP:
								{
								int LA5_4 = input.LA(2);
								if ( (evalPredicate(a2 != 0,"a2 != 0")) ) {
									alt5=1;
								}
								else if ( (true) ) {
									alt5=2;
								}

								}
								break;
							case MUL:
								{
								int LA5_5 = input.LA(2);
								if ( (evalPredicate(a2 != 0,"a2 != 0")) ) {
									alt5=1;
								}
								else if ( (true) ) {
									alt5=2;
								}

								}
								break;
							case DIV:
								{
								int LA5_6 = input.LA(2);
								if ( (evalPredicate(a2 != 0,"a2 != 0")) ) {
									alt5=1;
								}
								else if ( (true) ) {
									alt5=2;
								}

								}
								break;
							default:
								NoViableAltException nvae =
									new NoViableAltException("", 5, 0, input);
								dbg.recognitionException(nvae);
								throw nvae;
							}
							} finally {dbg.exitDecision(5);}

							switch (alt5) {
								case 1 :
									dbg.enterAlt(1);

									// /home/uml/Dokumenty/235031/lab1/bitwa1.g:13:4: {...}?
									{
									dbg.location(13,4);
									if ( !(evalPredicate(a2 != 0,"a2 != 0")) ) {
										throw new FailedPredicateException(input, "term", "a2 != 0");
									}dbg.location(14,4);
									res  /= a2;
									}
									break;
								case 2 :
									dbg.enterAlt(2);

									// /home/uml/Dokumenty/235031/lab1/bitwa1.g:15:6: 
									{
									dbg.location(15,6);
									System.out.println("test");
									}
									break;

							}
							} finally {dbg.exitSubRule(5);}

							}
							break;

					}
					} finally {dbg.exitSubRule(6);}

					}
					break;

				default :
					break loop7;
				}
			}
			} finally {dbg.exitSubRule(7);}

			}

		}
		catch (RecognitionException re) {
			reportError(re);
			recover(input,re);
		}
		finally {
			// do for sure before leaving
		}
		dbg.location(16, 7);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "term");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return res;
	}
	// $ANTLR end "term"



	// $ANTLR start "atom"
	// /home/uml/Dokumenty/235031/lab1/bitwa1.g:18:3: atom returns [Integer res] : ( INT | LP expr RP );
	public final Integer atom() throws RecognitionException {
		Integer res = null;


		Token INT2=null;
		ParserRuleReturnScope expr3 =null;

		try { dbg.enterRule(getGrammarFileName(), "atom");
		if ( getRuleLevel()==0 ) {dbg.commence();}
		incRuleLevel();
		dbg.location(18, 2);

		try {
			// /home/uml/Dokumenty/235031/lab1/bitwa1.g:18:29: ( INT | LP expr RP )
			int alt8=2;
			try { dbg.enterDecision(8, decisionCanBacktrack[8]);

			int LA8_0 = input.LA(1);
			if ( (LA8_0==INT) ) {
				alt8=1;
			}
			else if ( (LA8_0==LP) ) {
				alt8=2;
			}

			else {
				NoViableAltException nvae =
					new NoViableAltException("", 8, 0, input);
				dbg.recognitionException(nvae);
				throw nvae;
			}

			} finally {dbg.exitDecision(8);}

			switch (alt8) {
				case 1 :
					dbg.enterAlt(1);

					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:19:3: INT
					{
					dbg.location(19,3);
					INT2=(Token)match(input,INT,FOLLOW_INT_in_atom168); dbg.location(19,7);
					 res = Integer.parseInt((INT2!=null?INT2.getText():null));
					}
					break;
				case 2 :
					dbg.enterAlt(2);

					// /home/uml/Dokumenty/235031/lab1/bitwa1.g:20:5: LP expr RP
					{
					dbg.location(20,5);
					match(input,LP,FOLLOW_LP_in_atom177); dbg.location(20,8);
					pushFollow(FOLLOW_expr_in_atom179);
					expr3=expr();
					state._fsp--;
					dbg.location(20,13);
					match(input,RP,FOLLOW_RP_in_atom181); dbg.location(20,16);
					res = (expr3!=null?((bitwa1Parser.expr_return)expr3).res:null);
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
		dbg.location(21, 2);

		}
		finally {
			dbg.exitRule(getGrammarFileName(), "atom");
			decRuleLevel();
			if ( getRuleLevel()==0 ) {dbg.terminate();}
		}

		return res;
	}
	// $ANTLR end "atom"

	// Delegated rules



	public static final BitSet FOLLOW_expr_in_plik11 = new BitSet(new long[]{0x0000000000000800L});
	public static final BitSet FOLLOW_NL_in_plik15 = new BitSet(new long[]{0x0000000000000980L});
	public static final BitSet FOLLOW_EOF_in_plik20 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_term_in_expr40 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_PLUS_in_expr49 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_term_in_expr55 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_MINUS_in_expr61 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_term_in_expr67 = new BitSet(new long[]{0x0000000000001202L});
	public static final BitSet FOLLOW_atom_in_term95 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_MUL_in_term104 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_term110 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_DIV_in_term119 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_atom_in_term124 = new BitSet(new long[]{0x0000000000000422L});
	public static final BitSet FOLLOW_INT_in_atom168 = new BitSet(new long[]{0x0000000000000002L});
	public static final BitSet FOLLOW_LP_in_atom177 = new BitSet(new long[]{0x0000000000000180L});
	public static final BitSet FOLLOW_expr_in_atom179 = new BitSet(new long[]{0x0000000000002000L});
	public static final BitSet FOLLOW_RP_in_atom181 = new BitSet(new long[]{0x0000000000000002L});
}
