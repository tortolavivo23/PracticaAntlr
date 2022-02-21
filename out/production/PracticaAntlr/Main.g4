grammar Main;

r: (LSS | GRT | EQL | LSSQ | GRTQ |
    IF | THEN | ELSE | WHILE | DO | REPEAT | FOR| ASIG | TO | DOWNTO |
    OR | AND | SEMICOLON |
    OPEN_PAR | CLOSE_PAR |TRUE | FALSE | NOT | TRUE | FALSE |
    IDENTIFIER | NUMERIC_INTEGER_CONST | NUMERIC_REAL_CONST | COMMENT_LINE | COMMENT_BLOCK |STRING_CONST)+;

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