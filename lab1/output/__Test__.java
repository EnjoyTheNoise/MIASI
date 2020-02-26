import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class __Test__ {

    public static void main(String args[]) throws Exception {
        bitwa1Lexer lex = new bitwa1Lexer(new ANTLRFileStream("/home/uml/Dokumenty/235031/lab1/output/__Test___input.txt", "UTF8"));
        CommonTokenStream tokens = new CommonTokenStream(lex);

        bitwa1Parser g = new bitwa1Parser(tokens, 49100, null);
        try {
            g.plik();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}