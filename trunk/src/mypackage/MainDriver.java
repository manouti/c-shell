package mypackage;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class MainDriver {

    public static void main(String args[]) throws Exception {
        GuoliceLexer lex = new GuoliceLexer(new ANTLRFileStream("C:\\Users\\Mahmoud\\Documents\\University Files\\FALL 10-11\\EECE 637 (Advanced Programming Practices)\\Assignments\\Grammar\\output\\__Test___input.txt", "UTF8"));
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