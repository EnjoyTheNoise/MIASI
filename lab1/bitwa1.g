grammar bitwa1;

@members{
	class ZeroDivException extends RuntimeException {
		ZeroDivException(){
			System.out.println("Chłopie co ty robisz!!!");
		}
	}
}

//PARSER RULES

plik	:	expr* EOF {System.out.println("Result: " + $expr.text + " = " + $expr.value);}
	;

expr returns[int value]:	
	a = term {$value = $a.value;}
	((PLUS b = term {$value += $b.value;}
	| MINUS b = term {$value -= $b.value;}))*
	;

term returns[int value]:	
	a = atom {$value = $a.value;} 
	((MUL b = atom {$value *= $b.value;}
	| DIV b = atom { if($b.value == 0) 
				throw new ZeroDivException();  
			$value /= $b.value;
	}))*
	;

atom returns[int value]:	
	INT {$value = Integer.parseInt($INT.text);} 
	| LP expr RP {$value = $expr.value;}
	;

// LEXER RULES

ID  :	('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'0'..'9'|'_')*
    ;

INT :	'0'..'9'+
    ;

COMMENT
    :   '//' ~('\n'|'\r')* '\r'? '\n' {$channel=HIDDEN;}
    |   '/*' ( options {greedy=false;} : . )* '*/' {$channel=HIDDEN;}
    ;

WS  :   ( ' '
        | '\t'
        | '\r'
        ) {$channel=HIDDEN;}
    ;

PLUS 	:	'+';
MINUS	:	'-';
MUL	:	'*';
DIV	:	'/';
NL	:	'\n';
LP	:	'(';
RP	:	')';