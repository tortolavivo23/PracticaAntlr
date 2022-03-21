grammar Main;


r: (IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | COMMENT_LINE | COMMENT_BLOCK |STRING_CONST)+;

//ANALISIS SEMANTICO PARTE OBLIGATORIA

prg : 'PROGRAM' IDENTIFIER ';' blq '.';
blq : dcllist 'BEGIN' sentlist 'END';
dcllist : dcl dcllist | ; //Expresion ʎ  //Cambio para arreglar la recursividad izquierda
sentlist : sent | sent sentlist;  //Cambio para arreglar recursividad izquierda

dcl : defcte | defvar | defproc | deffun;
defcte : 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';'      //Cambio para arreglar la recursividad izquierda
    | IDENTIFIER '=' simpvalue ';' ctelist;
simpvalue : NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST
    | STRING_CONST;
defvar : 'VAR' defvarlist ';';
defvarlist : varlist ':' tbas       //Cambio para arreglar la recursividad izquierda
    | varlist ':' tbas ';' defvarlist;
varlist : IDENTIFIER | IDENTIFIER ',' varlist;
defproc : 'PROCEDURE' IDENTIFIER formal_paramlist ';' blq ';';
deffun : 'FUNCTION' IDENTIFIER formal_paramlist ':' tbas ';' blq ';';
formal_paramlist : '(' formal_param ')' | ; //Expresion ʎ
formal_param : varlist ':' tbas
    | varlist ':' tbas ';' formal_param;
tbas : 'integer' | 'real';

sent : asig ';' | proc_call ';';
asig : IDENTIFIER ':=' exp;
exp : factor op exp | factor;  //Cambio para arreglar la recursividad izquierda
op : '+' | '-' | '*' | 'DIV' | 'MOD';
factor : simpvalue | '(' exp ')' | IDENTIFIER subpparamlist;
subpparamlist : '(' explist ')' | ; //Expresion ʎ
explist : exp | exp ',' explist ;
proc_call : IDENTIFIER subpparamlist ;



//ANALISIS LEXICO PARTE OBLIGATORIA Y OPCIONAL

LSS: '<'{System.out.println(getText()+" -> <");};
GRT: '>'{System.out.println(getText()+" -> >");};
EQL: '='{System.out.println(getText()+" -> =");};
LSSQ: '<='{System.out.println(getText()+" -> <=");};
GRTQ: '>='{System.out.println(getText()+" -> >=");};



IF: 'IF'{System.out.println(getText()+" -> if");};
THEN: 'THEN'{System.out.println(getText()+" -> then");};
ELSE: 'ELSE'{System.out.println(getText()+" -> else");};
WHILE: 'WHILE' {System.out.println(getText()+" -> while");};
DO: 'DO' {System.out.println(getText()+" -> do");};
REPEAT: 'REPEAT' {System.out.println(getText()+" -> repeat");};
FOR: 'FOR'{System.out.println(getText()+" ->for ");};
ASIG: ':='{System.out.println(getText()+" -> asignación");};
TO: 'TO'{System.out.println(getText()+" -> to");};
DOWNTO: 'DOWNTO' {System.out.println(getText()+" -> downto");};
SEMICOLON: ';' {System.out.println(getText()+" -> ;");};

OR: 'OR' {System.out.println(getText() + " -> or ");};
AND: 'AND' {System.out.println(getText() + " -> and ");};
OPEN_PAR: '(' {System.out.println(getText() + " -> ( ");};
CLOSE_PAR: ')' {System.out.println(getText() + " -> ) ");};
TRUE: 'TRUE' {System.out.println(getText() + " -> TRUE ");};
FALSE: 'FALSE' {System.out.println(getText() + " -> FALSE ");};

NUMERIC_INTEGER_CONST: ('+' | '-')? INT {System.out.println(getText()+" -> Entero");};  //Las constantes numéricas enteras son una ristra de dígitos, opcionalmente precedida de un signo “+” o “-”.
NUMERIC_REAL_CONST: ('+' | '-')? INT ('.'INT)? (('e'|'E')('+' | '-')? INT)? {System.out.println(getText()+" -> Real");};
//STRING_CONST: ('\''~[(\r\n)']*'\'') | ('"' ~[(\r\n)"]*'"') | ('”' ~[(\r\n)”]*'”')  {System.out.println(getText() + " -> String const");};
//STRING_CONST: '\'' LETTER* '\'' {System.out.println(getText() + " -> String const");};
STRING_CONST: (('\'' ('\'\'' | ~['])* '\'') | ('"' ('""' | ~["])* '"')) {System.out.println(getText() + " -> String const");};

COMMENT_LINE: '{' ~[\r\n]+ '}';
COMMENT_BLOCK: '(*' (~[*] | '*' ~[)])* '*'+ ')';

IDENTIFIER: ('_'|LETTER) ('_' | DIG | LETTER)* {System.out.println(getText()+" -> Identificador");}; //Ristras de símbolos compuestas por letras del alfabeto inglés, dígitos y guiones bajos "_". No empiezan por numero.




IGNORE : (' '|'\r'|'\n') -> skip;

fragment
CHAR:;
LETTER: [A-Za-z]; //Caracteres del alfabeto ingles en mayusculas y minusculas
DIG:[0-9];  //Un unico digito del 0 al 9
INT:DIG+;  //Numero entero

// Para la memoria:
// - Aceptamos comentario vacío

// Pensar:
// - ¿qué debería pasar cuando algo tiene una ñ? A día de hoy da un token recognition error.