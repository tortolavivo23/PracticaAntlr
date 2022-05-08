import java.io.*;
import org.antlr.v4.runtime.*;

public class Principal {
    public static void main(String[] args) {
        try{

            CharStream input = CharStreams.fromFileName(args[0]);

            System.out.println("<!dOCtYPE html>\n <html>");
            System.out.println("<head>");
            System.out.println("<title>"+args[0]+"</title>");
            System.out.println("<style>");
            System.out.println("a {" +
                    "color: inherit;" +
                    "text-decoration: none;" +
                    "}");
            System.out.println("a:hover {" +
                    "background-color: lightgreen;" +
                    "}");
            System.out.println(".cte {" +
                    "color: blue;" +
                    "}");
            System.out.println(".ctesindeclarar {" +
                    "color:   #7a81d0;" +
                    "}");
            System.out.println(".palres {" +
                    "color:  #a3350a;" +
                    "}");
            System.out.println(".var {" +
                    "color:  #4b8562;" +
                    "}");
            System.out.println(".procFunc {" +
                    "color:  #986592;" +
                    "}");
            System.out.println("</style>");
            System.out.println("</head>");

            MainLexer analex = new MainLexer(input);


            CommonTokenStream tokens = new CommonTokenStream(analex);

            MainParser anasint = new MainParser(tokens);
/*
Si se quiere pasar al analizador algún objeto externo con el que trabajar,
este deberá ser de una clase del mismo paquete
Aquí se le llama "sintesis", pero puede ser cualquier nombre.
NumbersParser anasint = new NumbersParser(tokens, new sintesis());
*/
            System.out.println("<body>");


            anasint.prg();
            System.out.println("</body>");
            System.out.println("</html>");
        } catch (org.antlr.v4.runtime.RecognitionException e) {
//Fallo al reconocer la entrada
            System.err.println("REC " + e.getMessage());
        } catch (IOException e) {
//Fallo de entrada/salida
            System.err.println("IO " + e.getMessage());
        } catch (java.lang.RuntimeException e) {
//Cualquier otro fallo
            System.err.println("RUN " + e.getMessage());
        }
    }
}