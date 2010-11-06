package mypackage;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class MainDriver {

    public static void main(String args[]) throws Exception {
        GuoliceLexer lex = new GuoliceLexer(new ANTLRFileStream("__Test___input.txt", "UTF8"));  // modify the directory of the input file
        CommonTokenStream tokens = new CommonTokenStream(lex);

        //GuoliceParser g = new GuoliceParser(tokens, 49100, null);
        GuoliceParser g = new GuoliceParser(tokens);
        try {
            g.program();
        } catch (RecognitionException e) {
            e.printStackTrace();
        }
    }
}