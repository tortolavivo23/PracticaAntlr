grammar Main;

r: (IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | COMMENT_LINE | COMMENT_BLOCK |STRING_CONST)+;

IDENTIFIER: ('_'|LETTER) ('_' | DIG | LETTER)* {System.out.println(getText()+" -> Identificador");}; //Ristras de símbolos compuestas por letras del alfabeto inglés, dígitos y guiones bajos "_". No empiezan por numero.

NUMERIC_INTEGER_CONST: ('+' | '-')? INT {System.out.println(getText()+" -> Entero");};  //Las constantes numéricas enteras son una ristra de dígitos, opcionalmente precedida de un signo “+” o “-”.
NUMERIC_REAL_CONST: ('+' | '-')? INT ('.'INT)? (('e'|'E')('+' | '-')? INT)? {System.out.println(getText()+" -> Real");};
//STRING_CONST: ('\''~[(\r\n)']*'\'') | ('"' ~[(\r\n)"]*'"') | ('”' ~[(\r\n)”]*'”')  {System.out.println(getText() + " -> String const");};
STRING_CONST: '\'' LETTER* '\'' {System.out.println(getText() + " -> String const");};
CCOMMENT_LINE: '{' ~[\r\n]+ '}';
COMMENT_BLOCK: '(*' (~[*] | '*' ~[)])* '*'+ ')';

IGNORE : (' '|'\r\n') -> skip;

fragment
CHAR:;
LETTER: [A-Za-z]; //Caracteres del alfabeto ingles en mayusculas y minusculas
DIG:[0-9];  //Un unico digito del 0 al 9
INT:DIG+;  //Numero entero


// Para la memoria:
// - Aceptamos comentario vacío