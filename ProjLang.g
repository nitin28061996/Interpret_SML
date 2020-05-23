grammar ProjLang;
// Lexer specification
fragment LETTER 
: 'a'..'z' | 'A'..'Z';
fragment DIGIT 
: '0'..'9';
NUM : DIGIT+;
ADDOP : '+'|'-'|'|';
MULOP : '*'|'/'|'&';	
RELOP   : '<';
EQUAL	:	'=';
LPAR : '(';
RPAR : ')';
LF : '{';
RF : '}';
ASSIGN : ':=';
TRUE 	: 'true';
FALSE 	: 'false';
IF	: 'if';
ELSE 	: 'else';
SC: ';';
END:'end';
NOTEQ: '!';
WS : (' ' | '\t' | '\n' | '\r')+ { skip(); };
ID : LETTER (LETTER | DIGIT)*;
// Parser Specification
input  returns [Expr ex]: expr {$ex=$expr.ex;} SC
; 
expr returns [Expr ex] : IF ex1=expr 'then' ex2=expr ELSE ex3=expr{$ex=new IfExp($ex1.ex,$ex2.ex,$ex3.ex);}
        | 'let' 'val' string1=ID EQUAL ex4=expr 'in' ex5=expr END {$ex=new LetValExp($string1.text,$ex4.ex,$ex5.ex);}
    | 'let' 'fun' string2=ID LPAR string3=ID RPAR EQUAL ex6=expr 'in' ex7=expr END{$ex=new LetFunExp($string2.text,$string3.text,$ex6.ex,$ex7.ex);}
| 'while' ex8=expr 'do' ex9=expr {$ex=new WhileExp($ex8.ex,$ex9.ex);}
| LF ex10=expr  (SC ex11=expr{$ex=new SeqExp($ex10.ex,$ex11.ex);})* RF
| NOTEQ ex12=expr {$ex=new NotExp($ex12.ex);}
| string4=ID ASSIGN  ex13=expr {$ex=new AssnExp($string4.text,$ex13.ex);}
| ex14=relexpr{$ex=$ex14.ex;}
;
relexpr returns [Expr ex]: ex15=arithexpr{$ex=$ex15.ex;}((ex20=RELOP|ex20=EQUAL) ex16=arithexpr{if ($ex20.text.equals("=")) $ex=new BinExp(BinOp.EQUAL,$ex,$ex16.ex);
				else $ex=new BinExp(BinOp.LT,$ex,$ex16.ex);})?
;
arithexpr returns [Expr ex]: ex18=term{$ex=$ex18.ex;} (ADDOP ex19=term{if ($ADDOP.text.equals("+")) $ex=new BinExp(BinOp.ADD,$ex,$ex19.ex);
				else if($ADDOP.text.equals("-")) $ex=new BinExp(BinOp.SUB,$ex,$ex19.ex);
				else if($ADDOP.text.equals("|")) $ex=new BinExp(BinOp.OR,$ex,$ex19.ex);})*
;
term  returns [Expr ex]: ex22=factor{$ex=$ex22.ex;}(MULOP ex23=factor{if ($MULOP.text.equals("*")) $ex=new BinExp(BinOp.MUL,$ex,$ex23.ex);
				else if ($MULOP.text.equals("/")) $ex=new BinExp(BinOp.DIV,$ex,$ex23.ex);
				else if($MULOP.text.equals("&")) $ex=new BinExp(BinOp.AND,$ex,$ex23.ex);})*
;
factor returns [Expr ex]: NUM {$ex=new IntConst(Integer.parseInt($NUM.text));}
| TRUE {$ex=new BoolConst(Boolean.parseBoolean("true"));}
| FALSE {$ex=new BoolConst(Boolean.parseBoolean("false"));}
| string5=ID{$ex=new VarExp($string5.text);}
| string6=ID LPAR ex26=expr RPAR {$ex=new AppExp($string6.text,$ex26.ex);}
	|	LPAR e27=expr{$ex=$e27.ex;} RPAR
;