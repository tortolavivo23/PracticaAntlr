

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
    }

    public String formatear(String cadenaUnica, String cadenaBloque, Map<String,String> identificadores) {
        if(!identificadores.containsKey(cadenaUnica)){
            return "<SPAN CLASS=\"ctesindeclarar\">"+cadenaBloque+"</SPAN>";
        }
        return "<SPAN CLASS=\""+identificadores.get(cadenaUnica)+"\"> <a href=\"#"+cadenaUnica+"\">"+cadenaBloque+"</a></SPAN>";
    }
}


prg:
    'PROGRAM' IDENTIFIER {
            System.out.println("<a NAME=\"inicioPrograma\"><H1> Programa: "+$IDENTIFIER.text+"</H1></a>");
        }
    ';' {
            System.out.println("<UL>");
            HashMap<String,String> map = new HashMap<String,String>();
            String nombreBloque = "0main"; // aprovechamos que no se pueden declarar variables que empiecen por un número
        }
    blq [map, nombreBloque] {
            // Lista de cabeceras de procedimientos y funciones
            System.out.println($blq.procYFunc+"</UL>\n<HR/>");

            // Código de todas las funciones y procedimientos
            System.out.println($blq.codigoProc);
            System.out.println($blq.codigoFunc);

            // Declaraciones y sentencias del programa principal
            System.out.println("<a NAME=\"inicioMain\"><HR/> \n <H2> Programa principal </H2></a>");
                // Mostramos primero constantes y variables
            //System.out.println($blq.constantes);
            //System.out.println($blq.variables);
                // Mostrar el código principal
            System.out.println($blq.codigo + ".");
            System.out.println("<div class=\"moverse\"><a href=\"#inicioPrograma\">Al principio de la página</a></div>");
            System.out.println("<div class=\"moverse\"><a href=\"#inicioMain\">Al principio del programa principal</a></div>");
        }
    '.';

blq [Map<String,String> map, String nombreBloque] returns [String procYFunc, String codigo, String constantes, String variables, String codigoProc, String codigoFunc]:
    {
        Map<String,String> dcllistMap = new HashMap<>();
        dcllistMap.putAll($map);
    }
    dcllist[dcllistMap, nombreBloque] {
            $procYFunc = $dcllist.procYFunc;
            $codigo = $dcllist.codigo;
            $constantes = $dcllist.constantes;
            $variables = $dcllist.variables;
            $codigoProc = $dcllist.codigoProc;
            $codigoFunc = $dcllist.codigoFunc;
    }
    'BEGIN' sentlist[dcllistMap, nombreBloque] 'END'{
        $codigo += $dcllist.variables + $dcllist.constantes;
        $codigo += formatearReservada("BEGIN") + "<div style=\"margin-left:1cm\">" +
                                    $sentlist.codigo +
                                    "</div>"+ formatearReservada("END");
    } ;

dcllist [Map<String, String> map, String nombreBloque] returns [String procYFunc, String codigo, String constantes, String variables, String codigoProc, String codigoFunc] :
    {
        $procYFunc = "";
        $codigo = "";
        $constantes = "";
        $variables = "";
        $codigoProc = "";
        $codigoFunc = "";
    }|
    dcl[$map, $nombreBloque] dcllist[$map, $nombreBloque] {
        $procYFunc = $dcl.procYFunc+$dcllist.procYFunc;
        $codigo = $dcl.codigo+$dcllist.codigo;
        $constantes = $dcl.constantes + $dcllist.constantes;
        $variables = $dcl.variables + $dcllist.variables;
        $codigoProc = $dcl.codigoProc + $dcllist.codigoProc;
        $codigoFunc = $dcl.codigoFunc + $dcllist.codigoFunc;
    };

sentlist[Map<String, String>map, String nombreBloque]  returns [String codigo]:
    sent[$map, $nombreBloque] sentlistFactor[$map, $nombreBloque]{
        $codigo = $sent.sentencia+$sentlistFactor.codigo;
    };


sentlistFactor[Map<String, String> map, String nombreBloque] returns [String codigo] :
  {
    $codigo = "";
  }|
   sentlist[$map, $nombreBloque]{
        $codigo = $sentlist.codigo;
   };

dcl [Map<String, String> map, String nombreBloque] returns [String procYFunc, String codigo, String constantes, String variables, String codigoProc, String codigoFunc] :
    defcte[$map, $nombreBloque] {
        $procYFunc = "";
        $codigo = "";
        $constantes = $defcte.defConstantes;
        $variables = "";
        $codigoProc = "";
        $codigoFunc = "";
    } |
    defvar[$map, $nombreBloque] {
        $procYFunc="";
        $codigo = "";
        $constantes = "";
        $variables = $defvar.defVariables;
        $codigoProc = "";
        $codigoFunc = "";
    }|
    defproc[$map, $nombreBloque] {
        $procYFunc = $defproc.procedimiento;
        $codigo = "";
        $constantes = "";
        $variables = "";
        $codigoProc = $defproc.codigo;
        $codigoFunc = "";
    }|
    deffun[$map, $nombreBloque]  {
        $procYFunc = $deffun.funcion;
        $codigo = "";
        $constantes = "";
        $variables = "";
        $codigoProc = "";
        $codigoFunc = $deffun.codigo;
    };

defcte[Map<String, String> map, String nombreBloque] returns [String defConstantes]: 'CONST' ctelist[$map, $nombreBloque] {$defConstantes = formatearReservada("CONST")+" <br>" + $ctelist.constantes + " <br>";};
ctelist[Map<String, String> map, String nombreBloque] returns [String constantes, String tipoId]:
    IDENTIFIER '=' simpvalue ';' ctelistFactor[$map, $nombreBloque]
        {
           String claveNombre = $nombreBloque + "::" + $IDENTIFIER.text;
           String nombre = $IDENTIFIER.text;
           while($map.containsKey(nombre)){
                nombre += "1";
                claveNombre += "1";
           }

           $constantes = "<a NAME=\""+claveNombre+"\">"+nombre+ "</a> = " + formatear($simpvalue.constante, $simpvalue.constante, $map) + ";" + $ctelistFactor.constantes;
           $map.put(claveNombre, "cte"); // añadimos al mapa después de la declaración para que se pinte correctamente en instrucciones sucesivas
        };

ctelistFactor[Map<String, String> map, String nombreBloque] returns [String constantes] : {$constantes = "";}| ctelist[$map,$nombreBloque] {$constantes = "<br>" + $ctelist.constantes;};

simpvalue returns [String constante] :
    NUMERIC_INTEGER_CONST {$constante = $NUMERIC_INTEGER_CONST.text;} |
    NUMERIC_REAL_CONST{$constante = $NUMERIC_REAL_CONST.text;}|
    STRING_CONST{$constante = $STRING_CONST.text;};
defvar[Map<String, String> map, String nombreBloque] returns [String defVariables] : 'VAR' defvarlist[$map, $nombreBloque] ';'
{
    $defVariables = formatearReservada("VAR")+" <br>" + $defvarlist.variables + ";<br>";
};
defvarlist[Map<String, String> map, String nombreBloque] returns [String variables] :
    varlist[$map, $nombreBloque]':' tbas  defvarlistFactor[$map, $nombreBloque]
    {
        $variables = $varlist.nombreVariables + ": " + $tbas.tipoDevuelto + $defvarlistFactor.variables;
    };     //Cambio para arreglar la recursividad izquierda
defvarlistFactor[Map<String, String> map, String nombreBloque] returns [String variables] :
    {$variables = "";} |
    ';' defvarlist[$map, $nombreBloque] {$variables = "; " + $defvarlist.variables;};           //Factorizado
varlist[Map<String, String> map, String nombreBloque] returns[String nombreVariables] :
    IDENTIFIER  varlistFactor[$map, $nombreBloque] {
        String claveNombre = $nombreBloque + "::" + $IDENTIFIER.text;
        String nombre = $IDENTIFIER.text;
        while($map.containsKey(claveNombre)){
            nombre += "1";
            claveNombre += "1";
        }
        $map.put(claveNombre, "var");
        //System.err.println("Declaracion de variable: " + claveNombre);
        $nombreVariables = "<a NAME=\""+claveNombre+"\">" + nombre + "</a>" + $varlistFactor.nombreVariables;
    };           //Factorizado
varlistFactor[Map<String, String> map, String nombreBloque] returns[String nombreVariables]:
    {$nombreVariables = "";} |
    ',' varlist[$map, $nombreBloque] {$nombreVariables = ", " + $varlist.nombreVariables;};

defproc[Map<String, String> map, String nombreBloque] returns [String procedimiento, String codigo]:
    {
        Map<String,String> mapConParams = new HashMap<>();
        mapConParams.putAll($map);
    }
    'PROCEDURE' IDENTIFIER
    {
        String claveNombre = $nombreBloque + "::" + $IDENTIFIER.text;
        String nombre = $IDENTIFIER.text;
        while($map.containsKey(claveNombre)){
            nombre += "1";
            claveNombre += "1";
        }
        $map.put(claveNombre, "procFunc");
        mapConParams.put(claveNombre, "procFunc");
        String nombreBloqueInterno = $nombreBloque + "::" + $IDENTIFIER.text;
    } formal_paramlist [mapConParams, nombreBloqueInterno] ';' blq [mapConParams, nombreBloqueInterno] ';'{
        $procedimiento ="<LI> <a href=\"#"+claveNombre+"\">"+claveNombre.substring(7)+" "+$formal_paramlist.variables+";</a></LI>\n";
        $procedimiento += $blq.procYFunc;
        $codigo = "<a NAME= \""+ claveNombre +"\" >"+ formatearReservada("PROCEDURE") + "  " + claveNombre.substring(7) + " " + $formal_paramlist.variables + ";</a> <br/>";
        // Propagamos hacia arriba posibles códigos de procedimientos y funciones que estuviesen anidados
        $codigo += "<div style=\"margin-left:1cm\">" + $blq.codigoFunc + $blq.codigoProc + "</div>";
        $codigo += $blq.codigo + ";<br>";
        $codigo += "<div class=\"moverse\"><a href=\"#inicioPrograma\">Al principio de la página</a></div>";
        $codigo += "<div class=\"moverse\"><a href=\"#"+claveNombre+"\">Al principio del procedimiento "+claveNombre.substring(7)+"</a></div><br>";
    };

deffun[Map<String, String> map, String nombreBloque] returns[String funcion, String codigo]:
    {
        Map<String,String> mapConParams = new HashMap<>();
        mapConParams.putAll($map);
    }
    'FUNCTION' IDENTIFIER
    {
        String claveNombre = $nombreBloque + "::" + $IDENTIFIER.text;
        String nombre = $IDENTIFIER.text;
        while($map.containsKey(claveNombre)){
            nombre += "1";
            claveNombre +="1";
        }

        $map.put(claveNombre, "procFunc");
        mapConParams.put(claveNombre, "procFunc");
        String nombreBloqueInterno = $nombreBloque + "::" + $IDENTIFIER.text;
    } formal_paramlist [mapConParams, nombreBloqueInterno] ':' tbas ';' blq[mapConParams, nombreBloqueInterno] ';'
    {
        $funcion = "<LI> <a href=\"#"+claveNombre+"\">"+claveNombre.substring(7)+" "+$formal_paramlist.variables+";</a></LI>\n";
        $funcion += $blq.procYFunc;
        $codigo = "<a NAME= \""+ claveNombre +"\" >"+ formatearReservada("FUNCTION") + "  " + claveNombre.substring(7) + " " + $formal_paramlist.variables + ";</a> <br/><br>";
        $codigo += "<div style=\"margin-left:1cm\">" + $blq.codigoFunc + $blq.codigoProc + "</div>";
        $codigo += $blq.codigo + ";<br>";
        $codigo += "<div class=\"moverse\"><a href=\"#inicioPrograma\">Al principio de la página</a></div>";
        $codigo += "<div class=\"moverse\"><a href=\"#"+claveNombre+"\">Al principio de la función "+claveNombre.substring(7)+"</a></div><br>";
    };
formal_paramlist [Map<String,String> map, String nombreBloque] returns[String variables] :
    '(' formal_param[map, nombreBloque] ')' {$variables = "("+$formal_param.variables+")";} |
    {$variables = "";} ; //Expresion ʎ
formal_param[Map<String,String> map, String nombreBloque] returns[String variables] :
    varlist[map, nombreBloque] ':' tbas  formal_paramFactor[map, nombreBloque]
    {
        //map.put($varlist.nombreVariables, "var");
        $variables = $varlist.nombreVariables+": "+$tbas.tipoDevuelto+$formal_paramFactor.variables;
    };
formal_paramFactor[Map<String,String> map, String nombreBloque] returns[String variables]:
    {$variables = "";} |
    ';' formal_param[map, nombreBloque] {$variables = "; " + $formal_param.variables ;}  ; //Factorización
tbas returns[String tipoDevuelto] : 'integer' {$tipoDevuelto = formatearReservada("integer");} | 'real' {$tipoDevuelto = formatearReservada("real");};

sent[Map<String,String> map, String nombreBloque] returns[String sentencia] :
     IDENTIFIER sentFactor[$map, $nombreBloque, $IDENTIFIER.text] ';'{
        $sentencia = "<div>" + formatear($nombreBloque+"::"+$IDENTIFIER.text, $IDENTIFIER.text,$map) + $sentFactor.sentencia + ";</div>";
     } |
     'IF' expcond[$map,$nombreBloque] 'THEN'
     {
        Map<String,String> mapB1 = new HashMap<>();
        mapB1.putAll($map);
     }b1=blq [mapB1, $nombreBloque] 'ELSE'
     {
        Map<String,String> mapB2 = new HashMap<>();
        mapB2.putAll($map);
    } b2=blq [mapB2, $nombreBloque] {
        $sentencia = "<div> "+formatearReservada("IF")+" " + $expcond.condicion + " "+formatearReservada("THEN")+" </div> <div style=\"margin-left:1cm\">" + $b1.codigo + "</div> <div> "+formatearReservada("ELSE")+" </div> <div style=\"margin-left:1cm\"> " + $b2.codigo + "</div>";
     } |
     'WHILE' expcond[$map, $nombreBloque] 'DO'
     {
        Map<String,String> mapBlq = new HashMap<>();
        mapBlq.putAll($map);
     } blq [mapBlq, $nombreBloque]{
        $sentencia = "<div> "+formatearReservada("WHILE")+" " + $expcond.condicion + " "+formatearReservada("DO")+" <br> <div style=\"margin-left:1cm\">" + $blq.codigo + "</div></div>";
     } |
     'REPEAT'
     {
        Map<String,String> mapBlq = new HashMap<>();
        mapBlq.putAll($map);
     } blq [mapBlq, $nombreBloque] 'UNTIL' expcond[$map,$nombreBloque] ';' {
        $sentencia = "<div> "+formatearReservada("REPEAT")+" </div> <div style=\"margin-left:1cm\">" + $blq.codigo + "</div> "+formatearReservada("UNTIL")+" " + $expcond.condicion + ";";
     }|
     'FOR' IDENTIFIER ':=' exp[$map, $nombreBloque] inc exp[$map, $nombreBloque] 'DO'
     {
        Map<String,String> mapBlq = new HashMap<>();
        mapBlq.putAll($map);
     } blq [mapBlq, $nombreBloque] {
        $sentencia = "<div> "+formatearReservada("FOR")+" " + $IDENTIFIER.text + " := " + $exp.expresion + $inc.incremento + $exp.expresion + formatearReservada(" DO ") +" </div> <div style=\"margin-left:1cm\"> " + $blq.codigo + "</div>";
     };

sentFactor[Map<String, String> map, String nombreBloque, String proc_o_asignacion] returns[String sentencia]:
    proc_call[$map, $nombreBloque] {
        $sentencia = $proc_call.parametros;
        $map.put(nombreBloque+"::"+proc_o_asignacion,"procFunc");
    } |
    asig[$map, $nombreBloque]{
        $sentencia = $asig.asignacion;
    }; //Factorización

asig [Map<String, String> map, String nombreBloque] returns[String asignacion] : ':=' exp[$map, $nombreBloque] {
    $asignacion = " := "+$exp.expresion;
    };

exp [Map<String, String> map, String nombreBloque] returns[String expresion]:
    factor[$map, $nombreBloque] expFactor[$map, $nombreBloque]
    {
        $expresion = $factor.variable+$expFactor.operacion;
    };  //Cambio para arreglar la recursividad izquierda

expFactor[Map<String,String> map, String nombreBloque] returns[String operacion] :
    {$operacion = "";}|
    op exp[$map, $nombreBloque]{
        $operacion = " " + $op.simbolo + " " + $exp.expresion;
    }; //Factorizacion

op returns[String simbolo]:
    '+' {$simbolo = " + ";} |
    '-' {$simbolo = " - ";}|
    '*' {$simbolo = " * ";} |
    'DIV' {$simbolo = formatearReservada(" DIV ");} |
    'MOD' {$simbolo = formatearReservada(" MOD ");};

factor[Map<String,String> map, String nombreBloque] returns[String variable] :
    simpvalue{
        $variable = formatear($nombreBloque+"::"+$simpvalue.constante, $simpvalue.constante,$map);
    } |
    '(' exp[$map, $nombreBloque] ')'{
        $variable = "("+$exp.expresion+")";
    } |
    IDENTIFIER subpparamlist[$map, $nombreBloque]{
        if(!$map.containsKey($nombreBloque+"::"+$IDENTIFIER.text)){
            $map.put($nombreBloque+"::"+$IDENTIFIER.text,"procFunc");
        }
        $variable = formatear($nombreBloque+"::"+$IDENTIFIER.text,$IDENTIFIER.text,$map) +" " + $subpparamlist.parametros;
    };
subpparamlist[Map<String,String> map, String nombreBloque] returns[String parametros]:
    {$parametros="";} |
    '(' explist[$map, $nombreBloque] ')' {$parametros = "("+$explist.expresiones+")";} ; //Expresion ʎ

explist[Map<String, String> map, String nombreBloque] returns[String expresiones]:
    exp[$map, $nombreBloque] explistFactor[$map,$nombreBloque] {
        $expresiones = $exp.expresion + $explistFactor.expresiones;
    } ; //Cambio para arreglar la factorización

explistFactor[Map<String,String> map, String nombreBloque] returns[String expresiones]:
    {$expresiones="";} |
     ',' explist[$map,$nombreBloque] {$expresiones = ", "+$explist.expresiones;}; //Factorización

proc_call[Map<String, String> map, String nombreBloque] returns[String parametros]:  subpparamlist[$map,$nombreBloque] {$parametros = $subpparamlist.parametros;} ;



//ANALISIS SINTACTICO PARTE OPCIONAL

//Las añadidas a sent estan en la de arriba
inc returns [String incremento]: 'TO' {$incremento = formatearReservada(" TO ");} | 'DOWNTO' {$incremento = formatearReservada(" DOWNTO ");};
expcond[Map<String,String> map, String nombreBloque] returns [String condicion] : factorcond[$map, $nombreBloque] expcondFactor[$map, $nombreBloque] {$condicion = $factorcond.condicion + $expcondFactor.condicion;};
expcondFactor[Map<String,String> map, String nombreBloque] returns[String condicion] : {$condicion = "";} | oplog expcond[$map, $nombreBloque] {$condicion = $oplog.bool + $expcond.condicion;};
oplog returns[String bool]: 'OR'{$bool= formatearReservada(" OR ");} | 'AND'{$bool = formatearReservada(" AND ");};
factorcond[Map<String,String> map, String nombreBloque] returns[String condicion]:
    e1=exp[$map, $nombreBloque] opcomp e2=exp[$map, $nombreBloque] {$condicion = $e1.expresion + $opcomp.comparador + $e2.expresion;} |
    '(' expcond[$map, $nombreBloque] ')' {$condicion = "(" + $expcond.condicion + ")";} |
    'NOT' factorcond[$map, $nombreBloque]  {$condicion=formatearReservada("NOT")+ " " + $factorcond.condicion;}|
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
