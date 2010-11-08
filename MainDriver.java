package mypackage;

import java.io.*;
import org.antlr.runtime.*;
import org.antlr.runtime.debug.DebugEventSocketProxy;


public class MainDriver {

    public static void main(String args[]) throws Exception {
        GuoliceLexer lex = new GuoliceLexer(new ANTLRFileStream("C:/Users/Mahmoud/Documents/EclipseWorkspace/AntlrProject/bin/mypackage/input", "UTF8"));
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