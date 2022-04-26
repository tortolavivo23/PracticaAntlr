

grammar Main;

//ANALISIS SEMANTICO PARTE OBLIGATORIA

prg : 'PROGRAM' IDENTIFIER {System.out.println("<H1>"+$IDENTIFIER.text+"</H1>");} ';' {System.out.println("<UL>");} blq {System.out.println($blq.s+"</UL>");} '.';
blq returns [String s]: dcllist {$s = $dcllist.s;}  'BEGIN' sentlist 'END' ;
dcllist returns [String s] : {$s = "";}| dcl  dcllist {$s = $dcl.s+$dcllist.s;}  ; //Expresion ʎ  //Cambio para arreglar la recursividad izquierda
sentlist : sent sentlistFactor;  //Cambio para arreglar recursividad izquierda
sentlistFactor :  | sentlist  ;  //Cambio para factorizar, expresion ʎ

dcl returns [String s] : defcte {$s = "";} | defvar {$s="";}| defproc {$s = $defproc.s;}| deffun{$s = $deffun.s;};
defcte : 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';' ctelistFactor; //Cambio para arreglar reccursividad izquierda
ctelistFactor : | ctelist; //Factorizado
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | STRING_CONST;
defvar : 'VAR' defvarlist ';';
defvarlist : varlist ':' tbas  defvarlistFactor;     //Cambio para arreglar la recursividad izquierda
defvarlistFactor : | ';' defvarlist;           //Factorizado
varlist returns[String s] : IDENTIFIER  varlistFactor {$s = $IDENTIFIER.text +", "+ $varlistFactor.s;};           //Factorizado
varlistFactor returns[String s] : {$s = "";} |',' varlist {$s = $varlist.s;};
defproc returns [String s]: 'PROCEDURE' IDENTIFIER  formal_paramlist {$s ="<LI>"+$IDENTIFIER.text+" "+$formal_paramlist.s+"</LI>\n";}  ';' blq ';';
deffun returns[String s] : 'FUNCTION' IDENTIFIER   formal_paramlist {$s ="<LI>"+$IDENTIFIER.text+" "+$formal_paramlist.s+"</LI>\n";} ':' tbas ';' blq ';';
formal_paramlist returns[String s] : '(' formal_param ')' {$s = "("+$formal_param.s.substring(0,$formal_param.s.length()-2)+")";}| {$s = "";} ; //Expresion ʎ
formal_param returns[String s] : varlist ':' tbas  formal_paramFactor{$s = $tbas.s+": "+$varlist.s.substring(0,$varlist.s.length()-2)+"; "+$formal_paramFactor.s;};
formal_paramFactor returns[String s]: {$s = "";}| ';' formal_param {$s = $formal_param.s ;}  ; //Factorización
tbas returns[String s] : 'integer' {$s = "integer";} | 'real' {$s = "real";};

sent : IDENTIFIER sentFactor ';' | 'IF' expcond 'THEN' blq 'ELSE' blq | 'WHILE' expcond 'DO' blq |
    'REPEAT' blq 'UNTIL' expcond ';' | 'FOR' IDENTIFIER ':=' exp inc exp 'DO' blq;
sentFactor: subpparamlist | ':=' exp; //Factorización
asig : IDENTIFIER ':=' exp;
exp : factor expFactor;  //Cambio para arreglar la recursividad izquierda
expFactor : | op exp; //Factorizacion
op : '+' | '-' | '*' | 'DIV' | 'MOD';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist : | '(' explist ')'  ; //Expresion ʎ
explist : exp explistFactor ; //Cambio para arreglar la factorización
explistFactor: | ',' explist  ; //Factorización
proc_call : IDENTIFIER subpparamlist ;



//ANALISIS SINTACTICO PARTE OPCIONAL

//Las añadidas a sent estan en la de arriba
inc: 'TO' | 'DOWNTO';
expcond : factorcond expcondFactor ;
expcondFactor : | oplog expcond ;
oplog : 'OR' | 'AND';
factorcond : exp opcomp exp | '(' expcond ')' | 'NOT' factorcond | 'TRUE' | 'FALSE';
opcomp : '<' | '>'| '<=' | '>=' |'=';

//ANALISIS LEXICO PARTE OBLIGATORIA Y OPCIONAL


//Las constantes numéricas enteras son una ristra de dígitos, opcionalmente precedida de un signo “+” o “-”.
NUMERIC_INTEGER_CONST: ('+' | '-')? INT ;
NUMERIC_REAL_CONST: ('+' | '-')? INT ('.'INT)? (('e'|'E')('+' | '-')? INT)? ;
STRING_CONST: (('\'' ('\'\'' | ~['])* '\'') | ('"' ('""' | ~["])* '"')) ;

COMMENT_LINE: '{' ~[\r\n]+ '}'-> skip;
COMMENT_BLOCK: '(*' (~[*] | '*' ~[)])* '*'+ ')'-> skip;

//Ristras de símbolos compuestas por letras del alfabeto inglés, dígitos y guiones bajos "_". No empiezan por numero.
IDENTIFIER: ('_'|LETTER) ('_' | DIG | LETTER)* ;


IGNORE : (' '|'\r'|'\n'|'\t') -> skip;

fragment
LETTER: [A-Za-z]; //Caracteres del alfabeto ingles en mayusculas y minusculas
DIG:[0-9];  //Un unico digito del 0 al 9
INT:DIG+;  //Numero entero