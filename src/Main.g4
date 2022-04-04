grammar Main;

//ANALISIS SEMANTICO PARTE OBLIGATORIA

prg : 'PROGRAM' IDENTIFIER ';' blq '.';
blq : dcllist 'BEGIN' sentlist 'END';
dcllist : dcl dcllist | ; //Expresion ʎ  //Cambio para arreglar la recursividad izquierda
sentlist : sent sentlistFactor;  //Cambio para arreglar recursividad izquierda
sentlistFactor : sentlist | ;  //Cambio para factorizar, expresion ʎ

dcl : defcte | defvar | defproc | deffun;
defcte : 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';' ctelistFactor; //Cambio para arreglar reccursividad izquierda
ctelistFactor : | ctelist; //Factorizado
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST
    | STRING_CONST;
defvar : 'VAR' defvarlist ';';
defvarlist : varlist ':' tbas  defvarlistFactor;     //Cambio para arreglar la recursividad izquierda
defvarlistFactor : | ';' defvarlist;           //Factorizado
varlist : IDENTIFIER  varlistFactor;           //Factorizado
varlistFactor :  |',' varlist;
defproc : 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';';
deffun : 'FUNCTION' IDENTIFIER formal_paramlist ':' tbas ';' blq ';';
formal_paramlist : '(' formal_param ')' | ; //Expresion ʎ
formal_param : varlist ':' tbas formal_paramFactor;
formal_paramFactor: ';' formal_param | ; //Factorización
tbas : 'integer' | 'real';

sent : IDENTIFIER sentFactor ';' | 'IF' expcond 'THEN' blq 'ELSE' blq | 'WHILE' expcond 'DO' blq |
    'REPEAT' blq 'UNTIL' expcond ';' | 'FOR' IDENTIFIER ':=' exp inc exp 'DO' blq;
sentFactor: subpparamlist | ':=' exp; //Factorización
asig : IDENTIFIER ':=' exp;
exp : factor expFactor;  //Cambio para arreglar la recursividad izquierda
expFactor : | op exp; //Factorizacion
op : '+' | '-' | '*' | 'DIV' | 'MOD';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist : '(' explist ')' | ; //Expresion ʎ
explist : exp explistFactor ; //Cambio para arreglar la factorización
explistFactor:',' explist | ; //Factorización
proc_call : IDENTIFIER subpparamlist ;



//ANALISIS SINTACTICO PARTE OPCIONAL

//Las añadidas a sent estan en la de arriba
inc: 'TO' | 'DOWNTO';
expcond : factorcond expcondFactor ;
expcondFactor : oplog expcond | ;
oplog : 'OR' | 'AND';
factorcond : exp opcomp exp | '(' expcond ')' | 'NOT' factorcond
    | 'TRUE' | 'FALSE';
opcomp : '<' | '>'| '<=' | '>=' |'=';

//ANALISIS LEXICO PARTE OBLIGATORIA Y OPCIONAL

NUMERIC_INTEGER_CONST: ('+' | '-')? INT {System.out.println(getText()+" -> Entero");};  //Las constantes numéricas enteras son una ristra de dígitos, opcionalmente precedida de un signo “+” o “-”.
NUMERIC_REAL_CONST: ('+' | '-')? INT ('.'INT)? (('e'|'E')('+' | '-')? INT)? {System.out.println(getText()+" -> Real");};
//STRING_CONST: ('\''~[(\r\n)']*'\'') | ('"' ~[(\r\n)"]*'"') | ('”' ~[(\r\n)”]*'”')  {System.out.println(getText() + " -> String const");};
//STRING_CONST: '\'' LETTER* '\'' {System.out.println(getText() + " -> String const");};
STRING_CONST: (('\'' ('\'\'' | ~['])* '\'') | ('"' ('""' | ~["])* '"')) {System.out.println(getText() + " -> String const");};

COMMENT_LINE: '{' ~[\r\n]+ '}'-> skip;
COMMENT_BLOCK: '(*' (~[*] | '*' ~[)])* '*'+ ')'-> skip;

IDENTIFIER: ('_'|LETTER) ('_' | DIG | LETTER)* {System.out.println(getText()+" -> Identificador");}; //Ristras de símbolos compuestas por letras del alfabeto inglés, dígitos y guiones bajos "_". No empiezan por numero.


IGNORE : (' '|'\r'|'\n'|'\t') -> skip;

fragment
CHAR:;
LETTER: [A-Za-z]; //Caracteres del alfabeto ingles en mayusculas y minusculas
DIG:[0-9];  //Un unico digito del 0 al 9
INT:DIG+;  //Numero entero

// Para la memoria:
// - Aceptamos comentario vacío

// Pensar:
// - ¿qué debería pasar cuando algo tiene una ñ? A día de hoy da un token recognition error.