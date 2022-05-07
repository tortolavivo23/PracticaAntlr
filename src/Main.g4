

grammar Main;

//ANALISIS SEMANTICO PARTE OBLIGATORIA
@header {
    import java.util.Arrays;
    import java.util.HashMap;
    import java.util.Map;
}

@members {
    public String formatearReservada(String cadena){
            return "<SPAN CLASS=\"palres\">"+cadena+"</SPAN>";
        return cadena;
    }

    public String formatear(String cadena, Map<String,String> identificadores) {
        if(!identificadores.containsKey(cadena)){
            return "<SPAN CLASS=\"ctesindeclarar\">"+cadena+"</SPAN>";
        }
        return "<SPAN CLASS=\""+identificadores.get(cadena)+"\">"+cadena+"</SPAN>";
    }
}


prg:
    'PROGRAM' IDENTIFIER {
            System.out.println("<H1> Programa: "+$IDENTIFIER.text+" </H1>");
        }
    ';' {
            System.out.println("<UL>");
        }
    blq {
            // Lista de cabeceras de procedimientos y funciones
            System.out.println($blq.procYFunc+"</UL>\n<HR/>");

            // Código de todas las funciones y procedimientos
            System.out.println($blq.codigoProc);
            System.out.println($blq.codigoFunc);

            // Declaraciones y sentencias del programa principal
            System.out.println("<HR/> \n <H2> Programa principal </H2>");
                // Mostramos primero constantes y variables
            System.out.println($blq.constantes);
            System.out.println($blq.variables);
                // Mostrar el código principal
            System.out.println($blq.codigo + ".");
        }
    '.';

blq  returns [String procYFunc, String codigo, String constantes, String variables, String codigoProc, String codigoFunc]:
    {HashMap<String, String> map = new HashMap<String, String>();}dcllist[map] {
            $procYFunc = $dcllist.procYFunc;
            $codigo = $dcllist.codigo;
            $constantes = $dcllist.constantes;
            $variables = $dcllist.variables;
            $codigoProc = $dcllist.codigoProc;
            $codigoFunc = $dcllist.codigoFunc;
    }
    'BEGIN' sentlist[map] 'END'{
        $codigo += formatearReservada("BEGIN") + "<div style=\"margin-left:1cm\">" +
                                    $sentlist.codigo +
                                    "</div>"+ formatearReservada("END");
    } ;

dcllist [Map<String, String> map] returns [String procYFunc, String codigo, String constantes, String variables, String codigoProc, String codigoFunc] :
    {
        $procYFunc = "";
        $codigo = "";
        $constantes = "";
        $variables = "";
        $codigoProc = "";
        $codigoFunc = "";
    }|
    dcl[$map] dcllist[$map] {
        $procYFunc = $dcl.procYFunc+$dcllist.procYFunc;
        $codigo = $dcl.codigo+$dcllist.codigo;
        $constantes = $dcl.constantes + $dcllist.constantes;
        $variables = $dcl.variables + $dcllist.variables;
        $codigoProc = $dcl.codigoProc + $dcllist.codigoProc;
        $codigoFunc = $dcl.codigoFunc + $dcllist.codigoFunc;
    };

sentlist[Map<String, String>map]  returns [String codigo]:
    sent[$map] sentlistFactor[$map]{
        $codigo = $sent.sentencia+$sentlistFactor.codigo;
    };


sentlistFactor[Map<String, String> map] returns [String codigo] :
  {
    $codigo = "";
  }|
   sentlist[$map]{
        $codigo = $sentlist.codigo;
   };

dcl [Map<String, String> map] returns [String procYFunc, String codigo, String constantes, String variables, String codigoProc, String codigoFunc] :
    defcte[$map] {
        $procYFunc = "";
        $codigo = "";
        $constantes = $defcte.defConstantes;
        $variables = "";
        $codigoProc = "";
        $codigoFunc = "";
    } |
    defvar[$map] {
        $procYFunc="";
        $codigo = "";
        $constantes = "";
        $variables = $defvar.defVariables;
        $codigoProc = "";
        $codigoFunc = "";
    }|
    defproc[$map] {
        $procYFunc = $defproc.procedimiento;
        $codigo = "";
        $constantes = "";
        $variables = "";
        $codigoProc = $defproc.codigo;
        $codigoFunc = "";
    }|
    deffun[$map]  {
        $procYFunc = $deffun.funcion;
        $codigo = "";
        $constantes = "";
        $variables = "";
        $codigoProc = "";
        $codigoFunc = $deffun.codigo;
    };

defcte[Map<String, String> map] returns [String defConstantes]: 'CONST' ctelist[$map] {$defConstantes = formatearReservada("CONST")+" <br>" + $ctelist.constantes + " <br>";};
ctelist[Map<String, String> map] returns [String constantes, String tipoId]:
    IDENTIFIER '=' simpvalue ';' ctelistFactor[$map]
        {
           String nombre = $IDENTIFIER.text;
           while($map.containsKey(nombre)){
                nombre += "1";
           }
           $map.put(nombre, "cte");
            $constantes = nombre + " = " + formatear($simpvalue.constante,$map) + ";" + $ctelistFactor.constantes;
        };

ctelistFactor[Map<String, String> map] returns [String constantes] : {$constantes = "";}| ctelist[$map] {$constantes = "<br>" + $ctelist.constantes;};

simpvalue returns [String constante] :
    NUMERIC_INTEGER_CONST {$constante = $NUMERIC_INTEGER_CONST.text;} |
    NUMERIC_REAL_CONST{$constante = $NUMERIC_REAL_CONST.text;}|
    STRING_CONST{$constante = $STRING_CONST.text;};
defvar[Map<String, String> map] returns [String defVariables] : 'VAR' defvarlist[$map] ';' {$defVariables = formatearReservada("VAR")+" <br>" + $defvarlist.variables + ";<br>";};
defvarlist[Map<String, String> map] returns [String variables] :
    varlist[$map]':' tbas  defvarlistFactor[$map] {$variables = $varlist.nombreVariables + ": " + $tbas.tipoDevuelto + $defvarlistFactor.variables;};     //Cambio para arreglar la recursividad izquierda
defvarlistFactor[Map<String, String> map] returns [String variables] :
    {$variables = "";} |
    ';' defvarlist[$map] {$variables = "; " + $defvarlist.variables;};           //Factorizado
varlist[Map<String, String> map] returns[String nombreVariables] :
    IDENTIFIER  varlistFactor[$map] {
        String nombre = $IDENTIFIER.text;
        while($map.containsKey(nombre)){
            nombre += "1";
        }
        $map.put(nombre, "var");
        $nombreVariables = nombre + $varlistFactor.nombreVariables;
    };           //Factorizado
varlistFactor[Map<String, String> map] returns[String nombreVariables]:
    {$nombreVariables = "";} |
    ',' varlist[$map] {$nombreVariables = ", " + $varlist.nombreVariables;};

defproc[Map<String, String> map] returns [String procedimiento, String codigo]:
    'PROCEDURE' IDENTIFIER  formal_paramlist ';' blq ';'{
        String nombre = $IDENTIFIER.text;
        while($map.containsKey(nombre)){
            nombre += "1";
        }
        $map.put(nombre, "procFunc");
        $procedimiento ="<LI> <a href=\"#"+nombre+"\">"+nombre+" "+$formal_paramlist.variables+";</a></LI>\n";
        $codigo ="<a NAME= \""+ nombre +"\" >"+ formatearReservada("PROCEDURE") + "  " + nombre + " " + $formal_paramlist.variables + ";</a> <br/>" + $blq.codigo+";<br>";
    };

deffun[Map<String, String> map] returns[String funcion, String codigo]:
    'FUNCTION' IDENTIFIER   formal_paramlist ':' tbas ';' blq ';'{
        String nombre = $IDENTIFIER.text;
        while($map.containsKey(nombre)){
            nombre += "1";
        }
        $map.put(nombre, "procFunc");
        $funcion ="<LI> <a href=\"#"+nombre+"\">"+nombre+" "+$formal_paramlist.variables+";</a></LI>\n";
        $codigo ="<a NAME= \""+ nombre +"\" >"+ formatearReservada("FUNCTION") + "  " + nombre + " " + $formal_paramlist.variables + ";</a> <br/>" + $blq.codigo+";<br>";
    };
formal_paramlist returns[String variables] : '(' formal_param ')' {$variables = "("+$formal_param.variables+")";}| {$variables = "";} ; //Expresion ʎ
formal_param returns[String variables] : varlist[new HashMap<String, String>()] ':' tbas  formal_paramFactor{$variables = $tbas.tipoDevuelto+": "+$varlist.nombreVariables+$formal_paramFactor.variables;};
formal_paramFactor returns[String variables]: {$variables = "";}| ';' formal_param {$variables = "; " + $formal_param.variables ;}  ; //Factorización
tbas returns[String tipoDevuelto] : 'integer' {$tipoDevuelto = formatear("integer");} | 'real' {$tipoDevuelto = formatear("real");};

sent returns[String sentencia] :
     IDENTIFIER sentFactor ';'{
        $sentencia = "<div>" + formatear($IDENTIFIER.text) + " " + $sentFactor.sentencia + ";</div>";
     } |
     'IF' expcond 'THEN' blq 'ELSE' blq {
        $sentencia = "<div> "+formatear("IF")+" " + $expcond.condicion + " "+formatear("THEN")+" </div> <div style=\"margin-left:1cm\">" + $blq.codigo + "</div> <div> "+formatear("ELSE")+" </div> <div style=\"margin-left:1cm\"> " + $blq.codigo + "</div>";
     } |
     'WHILE' expcond 'DO' blq{
        $sentencia = "<div> "+formatear("WHILE")+" " + $expcond.condicion + " "+formatear("DO")+" <br> <div style=\"margin-left:1cm\">" + $blq.codigo + "</div></div>";
     } |
     'REPEAT' blq 'UNTIL' expcond ';' {
        $sentencia = "<div> "+formatear("REPEAT")+" </div> <div style=\"margin-left:1cm\">" + $blq.codigo + "</div> "+formatear("UNTIL")+" " + $expcond.condicion + ";";
     }|
     'FOR' IDENTIFIER ':=' exp inc exp 'DO' blq {
        $sentencia = "<div> "+formatear("FOR")+" " + $IDENTIFIER.text + " := " + $exp.expresion + $inc.incremento + $exp.expresion + formatear("DO") +" </div> <div style=\"margin-left:1cm\"> " + $blq.codigo + "</div>";
     };

sentFactor[Map<String, String> map] returns[String sentencia]:
    proc_call[$map] {
        $sentencia = $proc_call.parametros;
    } |
    asig[$map]{
        $sentencia = $asig.asignacion;
    }; //Factorización

asig returns[String asignacion] : ':=' exp {
    $asignacion = " := "+$exp.expresion;
    };

exp [Map<String, String> map] returns[String expresion] : factor[$map] expFactor[$map] {$expresion = $factor.variable+$expFactor.operacion;};  //Cambio para arreglar la recursividad izquierda

expFactor returns[String operacion] :
    {$operacion = "";}|
    op exp{
        $operacion = " " + $op.simbolo + " " + $exp.expresion;
    }; //Factorizacion

op returns[String simbolo]:
    '+' {$simbolo = "+";} |
    '-' {$simbolo = "-";}|
    '*' {$simbolo = "*";} |
    'DIV' {$simbolo = formatear("DIV");} |
    'MOD' {$simbolo = formatear("MOD");};

factor returns[String variable] :
    simpvalue{
        $variable = cteSinDeclarar($simpvalue.constante);
    } |
    '(' exp ')'{
        $variable = "("+$exp.expresion+")";
    } |
    IDENTIFIER subpparamlist{
        $variable = formatear($IDENTIFIER.text) +" " + $subpparamlist.parametros;
    };
subpparamlist returns[String parametros]:
    {$parametros="";} |
    '(' explist ')' {$parametros = "("+$explist.expresiones+")";} ; //Expresion ʎ

explist[Map<String, String> map] returns[String expresiones]:
    exp[$map] explistFactor[$map] {
        $expresiones = $exp.expresion + $explistFactor.expresiones;
    } ; //Cambio para arreglar la factorización

explistFactor returns[String expresiones]:
    {$expresiones="";} |
     ',' explist {$expresiones = ", "+$explist.expresiones;}; //Factorización

proc_call[Map<String, String> map] returns[String parametros]:  subpparamlist[$map] {$parametros = $subpparamlist.parametros;} ;



//ANALISIS SINTACTICO PARTE OPCIONAL

//Las añadidas a sent estan en la de arriba
inc returns [String incremento]: 'TO' {$incremento = formatearReservada("TO");} | 'DOWNTO' {$incremento = formatearReservada("DOWNTO");};
expcond[Map<String,String> map] returns [String condicion] : factorcond[$map] expcondFactor[$map] {$condicion = $factorcond.condicion + $expcondFactor.condicion;};
expcondFactor[Map<String,String> map] returns[String condicion] : {$condicion = "";} | oplog expcond[$map] {$condicion = $oplog.bool + $expcond.condicion;};
oplog returns[String bool]: 'OR'{$bool= formatearReservada("OR");} | 'AND'{$bool = formatearReservada("AND");};
factorcond[Map<String,String> map] returns[String condicion]:
    e1=exp[$map] opcomp e2=exp[$map] {$condicion = $e1.expresion + $opcomp.comparador + $e2.expresion;} |
    '(' expcond[$map] ')' {$condicion = "(" + $expcond.condicion + ")";} |
    'NOT' factorcond[$map]  {$condicion=formatearReservada("NOT")+ " " + $factorcond.condicion;}|
    'TRUE' {$condicion=formatearReservada("TRUE");} |
    'FALSE' {$condicion=formatearReservada("FALSE");};
opcomp returns[String comparador] :
    '<' {$comparador = " < ";} |
    '>' {$comparador = " > ";} |
    '<=' {$comparador = " <= ";} |
    '>=' {$comparador = " >= ";} |
    '='{$comparador = " = ";};

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
