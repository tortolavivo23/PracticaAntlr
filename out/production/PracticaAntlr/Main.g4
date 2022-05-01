

grammar Main;

//ANALISIS SEMANTICO PARTE OBLIGATORIA

prg:
    'PROGRAM' IDENTIFIER {
            System.out.println("<H1> Programa: "+$IDENTIFIER.text+" </H1>");
        }
    ';' {
            System.out.println("<UL>");
        }
    blq {
            System.out.println($blq.procYFunc+"</UL>\n<HR/>");
            System.out.println($blq.codigo);
        }
    '.';

blq  returns [String procYFunc, String codigo]:
    dcllist {
            $procYFunc = $dcllist.procYFunc;
            $codigo = "<div style=\"margin-left:1cm\">"+
                $dcllist.codigo + "</div>";
    }
    'BEGIN' sentlist 'END'{
        $codigo += "BEGIN<br/><div style=\"margin-left:1cm\">" +
                                    $sentlist.codigo +
                                    "<br/></div>END";
    } ;

dcllist  returns [String procYFunc, String codigo] :
    {
        $procYFunc = "";
        $codigo = "";
    }|
    dcl dcllist {
        $procYFunc = $dcl.procYFunc+$dcllist.procYFunc;
        $codigo = $dcl.codigo+"<br/>"+$dcllist.codigo;
    };

sentlist  returns [String codigo]:
    sent sentlistFactor{
        $codigo = $sent.sentencia+"<br/>"+$sentlistFactor.codigo;
    };


sentlistFactor returns [String codigo] :
  {
    $codigo = "";
  }|
   sentlist{
        $codigo = $sentlist.codigo;
   };

dcl  returns [String procYFunc, String codigo] :
    defcte {$procYFunc = "";} |
    defvar {$procYFunc="";}|
    defproc {
        $procYFunc = $defproc.procedimiento;
        $codigo = $defproc.codigo;
    }|
    deffun  {
        $procYFunc = $deffun.funcion;
        $codigo = $deffun.codigo;
    };

defcte : 'CONST' ctelist;
ctelist : IDENTIFIER '=' simpvalue ';' ctelistFactor;
ctelistFactor : | ctelist;
simpvalue returns [String constante] :
    NUMERIC_INTEGER_CONST {$constante = $NUMERIC_INTEGER_CONST.text;} |
    NUMERIC_REAL_CONST{$constante = $NUMERIC_REAL_CONST.text;}|
    STRING_CONST{$constante = $STRING_CONST.text;};
defvar : 'VAR' defvarlist ';';
defvarlist : varlist ':' tbas  defvarlistFactor;     //Cambio para arreglar la recursividad izquierda
defvarlistFactor : | ';' defvarlist;           //Factorizado
varlist returns[String nombreVariables] : IDENTIFIER  varlistFactor {$nombreVariables = $IDENTIFIER.text +", "+ $varlistFactor.nombreVariables;};           //Factorizado
varlistFactor returns[String nombreVariables] : {$nombreVariables = "";} |',' varlist {$nombreVariables = $varlist.nombreVariables;};

defproc returns [String procedimiento, String codigo]:
    'PROCEDURE' IDENTIFIER  formal_paramlist {
            $procedimiento ="<LI> <a href=\"#"+$IDENTIFIER.text+"\">"+$IDENTIFIER.text+" "+$formal_paramlist.variables+"</a></LI>\n";
        }
    ';' blq ';'{
        $codigo ="<a NAME= \""+ $IDENTIFIER.text +"\" > PROCEDURE " + $IDENTIFIER.text + " " + $formal_paramlist.variables + "</a> <br/>" + $blq.codigo+";";
    };

deffun returns[String funcion, String codigo]:
    'FUNCTION' IDENTIFIER   formal_paramlist {
            $funcion ="<LI><a href=\"#"+$IDENTIFIER.text+"\">"+$IDENTIFIER.text+" "+$formal_paramlist.variables+"</a></LI>\n";
        }
    ':' tbas ';' blq ';'{
        $codigo = "<a NAME=\""+$IDENTIFIER.text+"\"> FUNCTION "+ $IDENTIFIER.text + " "+$formal_paramlist.variables+":"+$tbas.tipoDevuelto+ ";<br/>"
                    +$blq.codigo+";";
    };
formal_paramlist returns[String variables] : '(' formal_param ')' {$variables = "("+$formal_param.variables.substring(0,$formal_param.variables.length()-2)+")";}| {$variables = "";} ; //Expresion ʎ
formal_param returns[String variables] : varlist ':' tbas  formal_paramFactor{$variables = $tbas.tipoDevuelto+": "+$varlist.nombreVariables.substring(0,$varlist.nombreVariables.length()-2)+"; "+$formal_paramFactor.variables;};
formal_paramFactor returns[String variables]: {$variables = "";}| ';' formal_param {$variables = $formal_param.variables ;}  ; //Factorización
tbas returns[String tipoDevuelto] : 'integer' {$tipoDevuelto = "integer";} | 'real' {$tipoDevuelto = "real";};

sent returns[String sentencia] :
     IDENTIFIER sentFactor ';'{
        $sentencia = $IDENTIFIER.text + " " + $sentFactor.sentencia + "; <br/>";
     } |
     'IF' expcond 'THEN' blq 'ELSE' blq {
        $sentencia = "IF " + $expcond.condicion + "<br/> THEN "+ $blq.codigo + "<br/> ELSE " +$blq.codigo + ";<br/>";
     } |
     'WHILE' expcond 'DO' blq{
        $sentencia = "WHILE " + $expcond.condicion + "<br/>" + "DO " + $blq.codigo + ";<br/>";
     } |
     'REPEAT' blq 'UNTIL' expcond ';' {
        $sentencia = "REPEAT " + $blq.codigo + "<br/>" + "UNTIL" + $expcond.condicion + ";<br/>";
     }|
     'FOR' IDENTIFIER ':=' exp inc exp 'DO' blq {
        $sentencia = "FOR " + $IDENTIFIER.text + " := " + $exp.expresion + $inc.incremento + $exp.expresion + "DO " + $blq.codigo+ "<br/>";
     };

sentFactor returns[String sentencia]:
    proc_call {
        $sentencia = $proc_call.parametros;
    } |
    asig{
        $sentencia = $asig.asignacion;
    }; //Factorización

asig returns[String asignacion] : ':=' exp {
    $asignacion = " := "+$exp.expresion;
    };

exp returns[String expresion] : factor expFactor {$expresion = $factor.variable+$expFactor.operacion;};  //Cambio para arreglar la recursividad izquierda

expFactor returns[String operacion] :
    {$operacion = "";}|
    op exp{
        $operacion = " " + $op.simbolo + " " + $exp.expresion;
    }; //Factorizacion

op returns[String simbolo]:
    '+' {$simbolo = "+";} |
    '-' {$simbolo = "-";}|
    '*' {$simbolo = "*";} |
    'DIV' {$simbolo = "DIV";} |
    'MOD' {$simbolo = "MOD";};

factor returns[String variable] :
    simpvalue{
        $variable = $simpvalue.constante;
    } |
    '(' exp ')'{
        $variable = "("+$exp.expresion+")";
    } |
    IDENTIFIER subpparamlist{
        $variable = $IDENTIFIER.text +" " + $subpparamlist.parametros;
    };
subpparamlist returns[String parametros]:
    {$parametros="";} |
    '(' explist ')' {$parametros = "("+$explist.expresiones+")";} ; //Expresion ʎ

explist returns[String expresiones]:
    exp explistFactor {
        $expresiones = $exp.expresion + $explistFactor.expresiones;
    } ; //Cambio para arreglar la factorización

explistFactor returns[String expresiones]:
    {$expresiones="";} |
     ',' explist {$expresiones = " ,"+$explist.expresiones;}; //Factorización

proc_call returns[String parametros]:  subpparamlist {$parametros = $subpparamlist.parametros;} ;



//ANALISIS SINTACTICO PARTE OPCIONAL

//Las añadidas a sent estan en la de arriba
inc returns [String incremento]: 'TO' {$incremento = "TO";} | 'DOWNTO' {$incremento = "DOWNTO";};
expcond returns [String condicion] : factorcond expcondFactor ;
expcondFactor : | oplog expcond ;
oplog returns[String bool]: 'OR'{$bool= "OR";} | 'AND'{$bool = "AND";};
factorcond returns[String condicion]: exp opcomp exp {$condicion = $exp.expresion + $opcomp.comparador + $exp.expresion;} |
    '(' expcond ')' {$condicion = "(" + $expcond.condicion + ")";} |
    'NOT' factorcond  {$condicion="NOT " + $factorcond.condicion;}|
    'TRUE' {$condicion="TRUE";} |
    'FALSE' {$condicion="FALSE";};
opcomp returns[String comparador] :
    '<' {$comparador = "<";} |
    '>' {$comparador = ">";} |
    '<=' {$comparador = "<=";} |
    '>=' {$comparador = ">=";} |
    '='{$comparador = "=";};

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
