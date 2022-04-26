import java.io.*;
import org.antlr.v4.runtime.*;

public class Principal {
    public static void main(String[] args) {
        try{

            CharStream input = CharStreams.fromFileName(args[0]);

            System.out.println("<!dOCtYPE html>\n <html>");
            System.out.println("<head>");
            System.out.println("<title>"+args[0]+"</title>");
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

            anasint.prg();

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