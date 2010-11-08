// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g 2010-11-07 18:46:36

package mypackage;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GuoliceLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LETTER=26;
    public static final int BUTTON=21;
    public static final int EQUALS=8;
    public static final int T__61=61;
    public static final int ID=23;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int NOTEQUAL=14;
    public static final int T__55=55;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int BOX=22;
    public static final int T__58=58;
    public static final int STRING_LITERAL=25;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int INCR=9;
    public static final int T__59=59;
    public static final int ISEQUAL=13;
    public static final int PLUS=4;
    public static final int DIGIT=27;
    public static final int COMMENT=28;
    public static final int T__50=50;
    public static final int NOT_OP=18;
    public static final int INTEGER=24;
    public static final int TEXTBOX=20;
    public static final int T__42=42;
    public static final int OR_OP=16;
    public static final int T__43=43;
    public static final int LESSTHAN=11;
    public static final int T__40=40;
    public static final int T__41=41;
    public static final int MODULO=17;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int GRTRTHAN=12;
    public static final int T__30=30;
    public static final int AND_OP=15;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int WS=29;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int CIRCLE=19;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int DECR=10;
    public static final int DIV=7;

    // delegates
    // delegators

    public GuoliceLexer() {;} 
    public GuoliceLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public GuoliceLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);

    }
    public String getGrammarFileName() { return "C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g"; }

    // $ANTLR start "PLUS"
    public final void mPLUS() throws RecognitionException {
        try {
            int _type = PLUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:11:6: ( '+' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:11:8: '+'
            {
            match('+'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUS"

    // $ANTLR start "MINUS"
    public final void mMINUS() throws RecognitionException {
        try {
            int _type = MINUS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:12:7: ( '-' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:12:9: '-'
            {
            match('-'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUS"

    // $ANTLR start "MULT"
    public final void mMULT() throws RecognitionException {
        try {
            int _type = MULT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:13:6: ( '*' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:13:8: '*'
            {
            match('*'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULT"

    // $ANTLR start "DIV"
    public final void mDIV() throws RecognitionException {
        try {
            int _type = DIV;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:14:5: ( '/' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:14:7: '/'
            {
            match('/'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DIV"

    // $ANTLR start "EQUALS"
    public final void mEQUALS() throws RecognitionException {
        try {
            int _type = EQUALS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:15:8: ( '=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:15:10: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EQUALS"

    // $ANTLR start "INCR"
    public final void mINCR() throws RecognitionException {
        try {
            int _type = INCR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:16:6: ( '++' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:16:8: '++'
            {
            match("++"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INCR"

    // $ANTLR start "DECR"
    public final void mDECR() throws RecognitionException {
        try {
            int _type = DECR;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:17:6: ( '--' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:17:8: '--'
            {
            match("--"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "DECR"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:18:10: ( '<' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:18:12: '<'
            {
            match('<'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "LESSTHAN"

    // $ANTLR start "GRTRTHAN"
    public final void mGRTRTHAN() throws RecognitionException {
        try {
            int _type = GRTRTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:19:10: ( '>' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:19:12: '>'
            {
            match('>'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "GRTRTHAN"

    // $ANTLR start "ISEQUAL"
    public final void mISEQUAL() throws RecognitionException {
        try {
            int _type = ISEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:20:9: ( '==' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:20:11: '=='
            {
            match("=="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ISEQUAL"

    // $ANTLR start "NOTEQUAL"
    public final void mNOTEQUAL() throws RecognitionException {
        try {
            int _type = NOTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:21:10: ( '!=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:21:12: '!='
            {
            match("!="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOTEQUAL"

    // $ANTLR start "AND_OP"
    public final void mAND_OP() throws RecognitionException {
        try {
            int _type = AND_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:22:8: ( 'AND' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:22:10: 'AND'
            {
            match("AND"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "AND_OP"

    // $ANTLR start "OR_OP"
    public final void mOR_OP() throws RecognitionException {
        try {
            int _type = OR_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:23:7: ( 'OR' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:23:9: 'OR'
            {
            match("OR"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "OR_OP"

    // $ANTLR start "MODULO"
    public final void mMODULO() throws RecognitionException {
        try {
            int _type = MODULO;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:24:8: ( 'MOD' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:24:10: 'MOD'
            {
            match("MOD"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MODULO"

    // $ANTLR start "NOT_OP"
    public final void mNOT_OP() throws RecognitionException {
        try {
            int _type = NOT_OP;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:25:8: ( 'NOT' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:25:10: 'NOT'
            {
            match("NOT"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "NOT_OP"

    // $ANTLR start "CIRCLE"
    public final void mCIRCLE() throws RecognitionException {
        try {
            int _type = CIRCLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:26:8: ( 'CIRCLE' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:26:10: 'CIRCLE'
            {
            match("CIRCLE"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "CIRCLE"

    // $ANTLR start "TEXTBOX"
    public final void mTEXTBOX() throws RecognitionException {
        try {
            int _type = TEXTBOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:27:9: ( 'TEXTBOX' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:27:11: 'TEXTBOX'
            {
            match("TEXTBOX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "TEXTBOX"

    // $ANTLR start "BUTTON"
    public final void mBUTTON() throws RecognitionException {
        try {
            int _type = BUTTON;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:28:8: ( 'BUTTON' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:28:10: 'BUTTON'
            {
            match("BUTTON"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BUTTON"

    // $ANTLR start "BOX"
    public final void mBOX() throws RecognitionException {
        try {
            int _type = BOX;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:29:5: ( 'BOX' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:29:7: 'BOX'
            {
            match("BOX"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "BOX"

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:30:7: ( 'procedure' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:30:9: 'procedure'
            {
            match("procedure"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:31:7: ( ':' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:31:9: ':'
            {
            match(':'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:32:7: ( '(' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:32:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:33:7: ( ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:33:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:34:7: ( 'end' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:34:9: 'end'
            {
            match("end"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:35:7: ( 'function' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:35:9: 'function'
            {
            match("function"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:36:7: ( ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:36:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "T__37"
    public final void mT__37() throws RecognitionException {
        try {
            int _type = T__37;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:37:7: ( ',' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:37:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__37"

    // $ANTLR start "T__38"
    public final void mT__38() throws RecognitionException {
        try {
            int _type = T__38;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:38:7: ( ':=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:38:9: ':='
            {
            match(":="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__38"

    // $ANTLR start "T__39"
    public final void mT__39() throws RecognitionException {
        try {
            int _type = T__39;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:39:7: ( 'constant' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:39:9: 'constant'
            {
            match("constant"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__39"

    // $ANTLR start "T__40"
    public final void mT__40() throws RecognitionException {
        try {
            int _type = T__40;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:40:7: ( 'var' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:40:9: 'var'
            {
            match("var"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__40"

    // $ANTLR start "T__41"
    public final void mT__41() throws RecognitionException {
        try {
            int _type = T__41;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:41:7: ( 'if' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:41:9: 'if'
            {
            match("if"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__41"

    // $ANTLR start "T__42"
    public final void mT__42() throws RecognitionException {
        try {
            int _type = T__42;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:42:7: ( 'then' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:42:9: 'then'
            {
            match("then"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__42"

    // $ANTLR start "T__43"
    public final void mT__43() throws RecognitionException {
        try {
            int _type = T__43;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:43:7: ( 'else' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:43:9: 'else'
            {
            match("else"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__43"

    // $ANTLR start "T__44"
    public final void mT__44() throws RecognitionException {
        try {
            int _type = T__44;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:44:7: ( 'while' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:44:9: 'while'
            {
            match("while"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__44"

    // $ANTLR start "T__45"
    public final void mT__45() throws RecognitionException {
        try {
            int _type = T__45;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:45:7: ( 'loop' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:45:9: 'loop'
            {
            match("loop"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__45"

    // $ANTLR start "T__46"
    public final void mT__46() throws RecognitionException {
        try {
            int _type = T__46;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:46:7: ( 'exit' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:46:9: 'exit'
            {
            match("exit"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__46"

    // $ANTLR start "T__47"
    public final void mT__47() throws RecognitionException {
        try {
            int _type = T__47;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:47:7: ( 'when' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:47:9: 'when'
            {
            match("when"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__47"

    // $ANTLR start "T__48"
    public final void mT__48() throws RecognitionException {
        try {
            int _type = T__48;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:48:7: ( 'now' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:48:9: 'now'
            {
            match("now"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__48"

    // $ANTLR start "T__49"
    public final void mT__49() throws RecognitionException {
        try {
            int _type = T__49;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:49:7: ( 'return' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:49:9: 'return'
            {
            match("return"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__49"

    // $ANTLR start "T__50"
    public final void mT__50() throws RecognitionException {
        try {
            int _type = T__50;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:50:7: ( 'int' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:50:9: 'int'
            {
            match("int"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__50"

    // $ANTLR start "T__51"
    public final void mT__51() throws RecognitionException {
        try {
            int _type = T__51;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:51:7: ( 'bool' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:51:9: 'bool'
            {
            match("bool"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__51"

    // $ANTLR start "T__52"
    public final void mT__52() throws RecognitionException {
        try {
            int _type = T__52;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:52:7: ( 'string' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:52:9: 'string'
            {
            match("string"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__52"

    // $ANTLR start "T__53"
    public final void mT__53() throws RecognitionException {
        try {
            int _type = T__53;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:53:7: ( '.' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:53:9: '.'
            {
            match('.'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__53"

    // $ANTLR start "T__54"
    public final void mT__54() throws RecognitionException {
        try {
            int _type = T__54;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:54:7: ( 'Box' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:54:9: 'Box'
            {
            match("Box"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__54"

    // $ANTLR start "T__55"
    public final void mT__55() throws RecognitionException {
        try {
            int _type = T__55;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:55:7: ( 'Circle' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:55:9: 'Circle'
            {
            match("Circle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__55"

    // $ANTLR start "T__56"
    public final void mT__56() throws RecognitionException {
        try {
            int _type = T__56;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:56:7: ( 'Triangle' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:56:9: 'Triangle'
            {
            match("Triangle"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__56"

    // $ANTLR start "T__57"
    public final void mT__57() throws RecognitionException {
        try {
            int _type = T__57;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:57:7: ( 'Label' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:57:9: 'Label'
            {
            match("Label"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__57"

    // $ANTLR start "T__58"
    public final void mT__58() throws RecognitionException {
        try {
            int _type = T__58;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:58:7: ( 'OnClick' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:58:9: 'OnClick'
            {
            match("OnClick"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__58"

    // $ANTLR start "T__59"
    public final void mT__59() throws RecognitionException {
        try {
            int _type = T__59;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:59:7: ( 'KeyPress' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:59:9: 'KeyPress'
            {
            match("KeyPress"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__59"

    // $ANTLR start "T__60"
    public final void mT__60() throws RecognitionException {
        try {
            int _type = T__60;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:60:7: ( 'LeftOf' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:60:9: 'LeftOf'
            {
            match("LeftOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__60"

    // $ANTLR start "T__61"
    public final void mT__61() throws RecognitionException {
        try {
            int _type = T__61;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:61:7: ( 'RightOf' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:61:9: 'RightOf'
            {
            match("RightOf"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__61"

    // $ANTLR start "T__62"
    public final void mT__62() throws RecognitionException {
        try {
            int _type = T__62;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:62:7: ( 'Above' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:62:9: 'Above'
            {
            match("Above"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__62"

    // $ANTLR start "T__63"
    public final void mT__63() throws RecognitionException {
        try {
            int _type = T__63;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:7: ( 'Below' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:9: 'Below'
            {
            match("Below"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__63"

    // $ANTLR start "T__64"
    public final void mT__64() throws RecognitionException {
        try {
            int _type = T__64;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:64:7: ( 'Contains' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:64:9: 'Contains'
            {
            match("Contains"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__64"

    // $ANTLR start "T__65"
    public final void mT__65() throws RecognitionException {
        try {
            int _type = T__65;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:65:7: ( 'Intersect' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:65:9: 'Intersect'
            {
            match("Intersect"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__65"

    // $ANTLR start "T__66"
    public final void mT__66() throws RecognitionException {
        try {
            int _type = T__66;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:66:7: ( 'SmallerThan' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:66:9: 'SmallerThan'
            {
            match("SmallerThan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__66"

    // $ANTLR start "T__67"
    public final void mT__67() throws RecognitionException {
        try {
            int _type = T__67;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:7: ( 'BiggerThan' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:9: 'BiggerThan'
            {
            match("BiggerThan"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__67"

    // $ANTLR start "T__68"
    public final void mT__68() throws RecognitionException {
        try {
            int _type = T__68;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:7: ( 'EqualTo' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:9: 'EqualTo'
            {
            match("EqualTo"); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:575:17: ( ( 'a' .. 'z' | 'A' .. 'Z' ) )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:575:19: ( 'a' .. 'z' | 'A' .. 'Z' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||(input.LA(1)>='a' && input.LA(1)<='z') ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}


            }

        }
        finally {
        }
    }
    // $ANTLR end "LETTER"

    // $ANTLR start "DIGIT"
    public final void mDIGIT() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:576:16: ( '0' .. '9' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:576:18: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "STRING_LITERAL"
    public final void mSTRING_LITERAL() throws RecognitionException {
        try {
            int _type = STRING_LITERAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:579:2: ( '\"' ( '\\\\' '\\\"' | ~ ( '\"' | '\\n' | '\\r' ) )* '\"' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:579:4: '\"' ( '\\\\' '\\\"' | ~ ( '\"' | '\\n' | '\\r' ) )* '\"'
            {
            match('\"'); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:580:4: ( '\\\\' '\\\"' | ~ ( '\"' | '\\n' | '\\r' ) )*
            loop1:
            do {
                int alt1=3;
                int LA1_0 = input.LA(1);

                if ( (LA1_0=='\\') ) {
                    int LA1_2 = input.LA(2);

                    if ( (LA1_2=='\"') ) {
                        int LA1_4 = input.LA(3);

                        if ( ((LA1_4>='\u0000' && LA1_4<='\t')||(LA1_4>='\u000B' && LA1_4<='\f')||(LA1_4>='\u000E' && LA1_4<='\uFFFF')) ) {
                            alt1=1;
                        }

                        else {
                            alt1=2;
                        }

                    }
                    else if ( ((LA1_2>='\u0000' && LA1_2<='\t')||(LA1_2>='\u000B' && LA1_2<='\f')||(LA1_2>='\u000E' && LA1_2<='!')||(LA1_2>='#' && LA1_2<='\uFFFF')) ) {
                        alt1=2;
                    }


                }
                else if ( ((LA1_0>='\u0000' && LA1_0<='\t')||(LA1_0>='\u000B' && LA1_0<='\f')||(LA1_0>='\u000E' && LA1_0<='!')||(LA1_0>='#' && LA1_0<='[')||(LA1_0>=']' && LA1_0<='\uFFFF')) ) {
                    alt1=2;
                }


                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:580:6: '\\\\' '\\\"'
            	    {
            	    match('\\'); 
            	    match('\"'); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:581:7: ~ ( '\"' | '\\n' | '\\r' )
            	    {
            	    if ( (input.LA(1)>='\u0000' && input.LA(1)<='\t')||(input.LA(1)>='\u000B' && input.LA(1)<='\f')||(input.LA(1)>='\u000E' && input.LA(1)<='!')||(input.LA(1)>='#' && input.LA(1)<='\uFFFF') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "STRING_LITERAL"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:585:4: ( LETTER ( LETTER | DIGIT | '_' )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:585:6: LETTER ( LETTER | DIGIT | '_' )*
            {
            mLETTER(); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:585:13: ( LETTER | DIGIT | '_' )*
            loop2:
            do {
                int alt2=2;
                int LA2_0 = input.LA(1);

                if ( ((LA2_0>='0' && LA2_0<='9')||(LA2_0>='A' && LA2_0<='Z')||LA2_0=='_'||(LA2_0>='a' && LA2_0<='z')) ) {
                    alt2=1;
                }


                switch (alt2) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:
            	    {
            	    if ( (input.LA(1)>='0' && input.LA(1)<='9')||(input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    break loop2;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INTEGER"
    public final void mINTEGER() throws RecognitionException {
        try {
            int _type = INTEGER;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:587:9: ( ( DIGIT )+ )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:587:11: ( DIGIT )+
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:587:11: ( DIGIT )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>='0' && LA3_0<='9')) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:587:11: DIGIT
            	    {
            	    mDIGIT(); 

            	    }
            	    break;

            	default :
            	    if ( cnt3 >= 1 ) break loop3;
                        EarlyExitException eee =
                            new EarlyExitException(3, input);
                        throw eee;
                }
                cnt3++;
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "INTEGER"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:589:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:589:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:589:16: ( . )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0=='\n'||LA4_0=='\r') ) {
                    alt4=2;
                }
                else if ( ((LA4_0>='\u0000' && LA4_0<='\t')||(LA4_0>='\u000B' && LA4_0<='\f')||(LA4_0>='\u000E' && LA4_0<='\uFFFF')) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:589:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop4;
                }
            } while (true);

            if ( input.LA(1)=='\n'||input.LA(1)=='\r' ) {
                input.consume();

            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;}

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:591:9: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:591:11: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:591:11: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='\t' && LA5_0<='\n')||(LA5_0>='\f' && LA5_0<='\r')||LA5_0==' ') ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:
            	    {
            	    if ( (input.LA(1)>='\t' && input.LA(1)<='\n')||(input.LA(1)>='\f' && input.LA(1)<='\r')||input.LA(1)==' ' ) {
            	        input.consume();

            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;}


            	    }
            	    break;

            	default :
            	    if ( cnt5 >= 1 ) break loop5;
                        EarlyExitException eee =
                            new EarlyExitException(5, input);
                        throw eee;
                }
                cnt5++;
            } while (true);

             _channel=HIDDEN; 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:8: ( PLUS | MINUS | MULT | DIV | EQUALS | INCR | DECR | LESSTHAN | GRTRTHAN | ISEQUAL | NOTEQUAL | AND_OP | OR_OP | MODULO | NOT_OP | CIRCLE | TEXTBOX | BUTTON | BOX | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | STRING_LITERAL | ID | INTEGER | COMMENT | WS )
        int alt6=63;
        alt6 = dfa6.predict(input);
        switch (alt6) {
            case 1 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:10: PLUS
                {
                mPLUS(); 

                }
                break;
            case 2 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:15: MINUS
                {
                mMINUS(); 

                }
                break;
            case 3 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:21: MULT
                {
                mMULT(); 

                }
                break;
            case 4 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:26: DIV
                {
                mDIV(); 

                }
                break;
            case 5 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:30: EQUALS
                {
                mEQUALS(); 

                }
                break;
            case 6 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:37: INCR
                {
                mINCR(); 

                }
                break;
            case 7 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:42: DECR
                {
                mDECR(); 

                }
                break;
            case 8 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:47: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 9 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:56: GRTRTHAN
                {
                mGRTRTHAN(); 

                }
                break;
            case 10 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:65: ISEQUAL
                {
                mISEQUAL(); 

                }
                break;
            case 11 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:73: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 12 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:82: AND_OP
                {
                mAND_OP(); 

                }
                break;
            case 13 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:89: OR_OP
                {
                mOR_OP(); 

                }
                break;
            case 14 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:95: MODULO
                {
                mMODULO(); 

                }
                break;
            case 15 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:102: NOT_OP
                {
                mNOT_OP(); 

                }
                break;
            case 16 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:109: CIRCLE
                {
                mCIRCLE(); 

                }
                break;
            case 17 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:116: TEXTBOX
                {
                mTEXTBOX(); 

                }
                break;
            case 18 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:124: BUTTON
                {
                mBUTTON(); 

                }
                break;
            case 19 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:131: BOX
                {
                mBOX(); 

                }
                break;
            case 20 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:135: T__30
                {
                mT__30(); 

                }
                break;
            case 21 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:141: T__31
                {
                mT__31(); 

                }
                break;
            case 22 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:147: T__32
                {
                mT__32(); 

                }
                break;
            case 23 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:153: T__33
                {
                mT__33(); 

                }
                break;
            case 24 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:159: T__34
                {
                mT__34(); 

                }
                break;
            case 25 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:165: T__35
                {
                mT__35(); 

                }
                break;
            case 26 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:171: T__36
                {
                mT__36(); 

                }
                break;
            case 27 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:177: T__37
                {
                mT__37(); 

                }
                break;
            case 28 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:183: T__38
                {
                mT__38(); 

                }
                break;
            case 29 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:189: T__39
                {
                mT__39(); 

                }
                break;
            case 30 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:195: T__40
                {
                mT__40(); 

                }
                break;
            case 31 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:201: T__41
                {
                mT__41(); 

                }
                break;
            case 32 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:207: T__42
                {
                mT__42(); 

                }
                break;
            case 33 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:213: T__43
                {
                mT__43(); 

                }
                break;
            case 34 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:219: T__44
                {
                mT__44(); 

                }
                break;
            case 35 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:225: T__45
                {
                mT__45(); 

                }
                break;
            case 36 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:231: T__46
                {
                mT__46(); 

                }
                break;
            case 37 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:237: T__47
                {
                mT__47(); 

                }
                break;
            case 38 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:243: T__48
                {
                mT__48(); 

                }
                break;
            case 39 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:249: T__49
                {
                mT__49(); 

                }
                break;
            case 40 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:255: T__50
                {
                mT__50(); 

                }
                break;
            case 41 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:261: T__51
                {
                mT__51(); 

                }
                break;
            case 42 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:267: T__52
                {
                mT__52(); 

                }
                break;
            case 43 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:273: T__53
                {
                mT__53(); 

                }
                break;
            case 44 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:279: T__54
                {
                mT__54(); 

                }
                break;
            case 45 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:285: T__55
                {
                mT__55(); 

                }
                break;
            case 46 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:291: T__56
                {
                mT__56(); 

                }
                break;
            case 47 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:297: T__57
                {
                mT__57(); 

                }
                break;
            case 48 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:303: T__58
                {
                mT__58(); 

                }
                break;
            case 49 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:309: T__59
                {
                mT__59(); 

                }
                break;
            case 50 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:315: T__60
                {
                mT__60(); 

                }
                break;
            case 51 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:321: T__61
                {
                mT__61(); 

                }
                break;
            case 52 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:327: T__62
                {
                mT__62(); 

                }
                break;
            case 53 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:333: T__63
                {
                mT__63(); 

                }
                break;
            case 54 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:339: T__64
                {
                mT__64(); 

                }
                break;
            case 55 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:345: T__65
                {
                mT__65(); 

                }
                break;
            case 56 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:351: T__66
                {
                mT__66(); 

                }
                break;
            case 57 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:357: T__67
                {
                mT__67(); 

                }
                break;
            case 58 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:363: T__68
                {
                mT__68(); 

                }
                break;
            case 59 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:369: STRING_LITERAL
                {
                mSTRING_LITERAL(); 

                }
                break;
            case 60 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:384: ID
                {
                mID(); 

                }
                break;
            case 61 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:387: INTEGER
                {
                mINTEGER(); 

                }
                break;
            case 62 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:395: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 63 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:403: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA6 dfa6 = new DFA6(this);
    static final String DFA6_eotS =
        "\1\uffff\1\56\1\60\1\uffff\1\62\1\64\3\uffff\10\52\1\107\2\uffff"+
        "\2\52\2\uffff\12\52\1\uffff\6\52\14\uffff\2\52\1\140\16\52\2\uffff"+
        "\6\52\1\165\17\52\1\u0086\1\52\1\uffff\1\52\1\u0089\1\u008a\6\52"+
        "\1\u0091\1\u0092\3\52\1\u0096\4\52\1\u009b\1\uffff\1\u009c\4\52"+
        "\1\u00a1\12\52\1\uffff\2\52\2\uffff\6\52\2\uffff\3\52\1\uffff\1"+
        "\u00b7\1\u00b8\2\52\2\uffff\1\u00bb\1\52\1\u00bd\1\u00be\1\uffff"+
        "\1\52\1\u00c0\10\52\1\u00c9\7\52\1\u00d1\2\52\2\uffff\2\52\1\uffff"+
        "\1\u00d6\2\uffff\1\52\1\uffff\1\52\1\u00d9\6\52\1\uffff\1\52\1\u00e1"+
        "\1\u00e2\3\52\1\u00e6\1\uffff\4\52\1\uffff\1\u00eb\1\u00ec\1\uffff"+
        "\1\u00ed\5\52\1\u00f3\2\uffff\1\52\1\u00f5\1\52\1\uffff\4\52\3\uffff"+
        "\1\52\1\u00fc\2\52\1\u00ff\1\uffff\1\u0100\1\uffff\1\u0101\2\52"+
        "\1\u0104\1\u0105\1\u0106\1\uffff\2\52\3\uffff\1\52\1\u010a\3\uffff"+
        "\1\u010b\1\52\1\u010d\2\uffff\1\52\1\uffff\1\u010f\1\uffff";
    static final String DFA6_eofS =
        "\u0110\uffff";
    static final String DFA6_minS =
        "\1\11\1\53\1\55\1\uffff\1\57\1\75\3\uffff\1\116\1\122\2\117\1\111"+
        "\1\105\1\117\1\162\1\75\2\uffff\1\154\1\165\2\uffff\1\157\1\141"+
        "\1\146\2\150\2\157\1\145\1\157\1\164\1\uffff\1\141\1\145\1\151\1"+
        "\156\1\155\1\161\14\uffff\1\104\1\157\1\60\1\103\1\104\1\124\1\122"+
        "\1\162\1\156\1\130\1\151\1\124\1\130\1\170\1\154\1\147\1\157\2\uffff"+
        "\1\144\1\163\1\151\2\156\1\162\1\60\1\164\2\145\1\157\1\167\1\164"+
        "\1\157\1\162\1\142\1\146\1\171\1\147\1\164\1\141\1\165\1\60\1\166"+
        "\1\uffff\1\154\2\60\1\103\1\143\1\164\1\124\1\141\1\124\2\60\1\157"+
        "\1\147\1\143\1\60\1\145\1\164\1\143\1\163\1\60\1\uffff\1\60\1\156"+
        "\1\154\1\156\1\160\1\60\1\165\1\154\1\151\1\145\1\164\1\120\1\150"+
        "\1\145\1\154\1\141\1\uffff\1\145\1\151\2\uffff\1\114\1\154\1\141"+
        "\1\102\1\156\1\117\2\uffff\1\167\2\145\1\uffff\2\60\2\164\2\uffff"+
        "\1\60\1\145\2\60\1\uffff\1\162\1\60\1\156\1\154\1\117\1\162\1\164"+
        "\1\162\2\154\1\60\1\143\1\105\1\145\1\151\1\117\1\147\1\116\1\60"+
        "\1\162\1\144\2\uffff\1\151\1\141\1\uffff\1\60\2\uffff\1\156\1\uffff"+
        "\1\147\1\60\1\146\1\145\1\117\1\163\1\145\1\124\1\uffff\1\153\2"+
        "\60\1\156\1\130\1\154\1\60\1\uffff\1\124\1\165\1\157\1\156\1\uffff"+
        "\2\60\1\uffff\1\60\1\163\1\146\1\145\1\162\1\157\1\60\2\uffff\1"+
        "\163\1\60\1\145\1\uffff\1\150\1\162\1\156\1\164\3\uffff\1\163\1"+
        "\60\1\143\1\124\1\60\1\uffff\1\60\1\uffff\1\60\1\141\1\145\3\60"+
        "\1\uffff\1\164\1\150\3\uffff\1\156\1\60\3\uffff\1\60\1\141\1\60"+
        "\2\uffff\1\156\1\uffff\1\60\1\uffff";
    static final String DFA6_maxS =
        "\1\172\1\53\1\55\1\uffff\1\57\1\75\3\uffff\1\142\1\156\2\117\1"+
        "\157\1\162\1\157\1\162\1\75\2\uffff\1\170\1\165\2\uffff\1\157\1"+
        "\141\1\156\2\150\2\157\1\145\1\157\1\164\1\uffff\2\145\1\151\1\156"+
        "\1\155\1\161\14\uffff\1\104\1\157\1\172\1\103\1\104\1\124\1\122"+
        "\1\162\1\156\1\130\1\151\1\124\1\130\1\170\1\154\1\147\1\157\2\uffff"+
        "\1\144\1\163\1\151\2\156\1\162\1\172\1\164\1\145\1\151\1\157\1\167"+
        "\1\164\1\157\1\162\1\142\1\146\1\171\1\147\1\164\1\141\1\165\1\172"+
        "\1\166\1\uffff\1\154\2\172\1\103\1\143\1\164\1\124\1\141\1\124\2"+
        "\172\1\157\1\147\1\143\1\172\1\145\1\164\1\143\1\163\1\172\1\uffff"+
        "\1\172\1\156\1\154\1\156\1\160\1\172\1\165\1\154\1\151\1\145\1\164"+
        "\1\120\1\150\1\145\1\154\1\141\1\uffff\1\145\1\151\2\uffff\1\114"+
        "\1\154\1\141\1\102\1\156\1\117\2\uffff\1\167\2\145\1\uffff\2\172"+
        "\2\164\2\uffff\1\172\1\145\2\172\1\uffff\1\162\1\172\1\156\1\154"+
        "\1\117\1\162\1\164\1\162\2\154\1\172\1\143\1\105\1\145\1\151\1\117"+
        "\1\147\1\116\1\172\1\162\1\144\2\uffff\1\151\1\141\1\uffff\1\172"+
        "\2\uffff\1\156\1\uffff\1\147\1\172\1\146\1\145\1\117\1\163\1\145"+
        "\1\124\1\uffff\1\153\2\172\1\156\1\130\1\154\1\172\1\uffff\1\124"+
        "\1\165\1\157\1\156\1\uffff\2\172\1\uffff\1\172\1\163\1\146\1\145"+
        "\1\162\1\157\1\172\2\uffff\1\163\1\172\1\145\1\uffff\1\150\1\162"+
        "\1\156\1\164\3\uffff\1\163\1\172\1\143\1\124\1\172\1\uffff\1\172"+
        "\1\uffff\1\172\1\141\1\145\3\172\1\uffff\1\164\1\150\3\uffff\1\156"+
        "\1\172\3\uffff\1\172\1\141\1\172\2\uffff\1\156\1\uffff\1\172\1\uffff";
    static final String DFA6_acceptS =
        "\3\uffff\1\3\2\uffff\1\10\1\11\1\13\11\uffff\1\26\1\27\2\uffff"+
        "\1\32\1\33\12\uffff\1\53\6\uffff\1\73\1\74\1\75\1\77\1\6\1\1\1\7"+
        "\1\2\1\76\1\4\1\12\1\5\21\uffff\1\34\1\25\30\uffff\1\15\24\uffff"+
        "\1\37\20\uffff\1\14\2\uffff\1\16\1\17\6\uffff\1\23\1\54\3\uffff"+
        "\1\30\4\uffff\1\36\1\50\4\uffff\1\46\25\uffff\1\41\1\44\2\uffff"+
        "\1\40\1\uffff\1\45\1\43\1\uffff\1\51\10\uffff\1\64\7\uffff\1\65"+
        "\4\uffff\1\42\2\uffff\1\57\7\uffff\1\20\1\55\3\uffff\1\22\4\uffff"+
        "\1\47\1\52\1\62\5\uffff\1\60\1\uffff\1\21\6\uffff\1\63\2\uffff\1"+
        "\72\1\66\1\56\2\uffff\1\31\1\35\1\61\3\uffff\1\24\1\67\1\uffff\1"+
        "\71\1\uffff\1\70";
    static final String DFA6_specialS =
        "\u0110\uffff}>";
    static final String[] DFA6_transitionS = {
            "\2\54\1\uffff\2\54\22\uffff\1\54\1\10\1\51\5\uffff\1\22\1\23"+
            "\1\3\1\1\1\27\1\2\1\42\1\4\12\53\1\21\1\26\1\6\1\5\1\7\2\uffff"+
            "\1\11\1\17\1\15\1\52\1\50\3\52\1\46\1\52\1\44\1\43\1\13\1\14"+
            "\1\12\2\52\1\45\1\47\1\16\6\52\6\uffff\1\52\1\40\1\30\1\52\1"+
            "\24\1\25\2\52\1\32\2\52\1\35\1\52\1\36\1\52\1\20\1\52\1\37\1"+
            "\41\1\33\1\52\1\31\1\34\3\52",
            "\1\55",
            "\1\57",
            "",
            "\1\61",
            "\1\63",
            "",
            "",
            "",
            "\1\65\23\uffff\1\66",
            "\1\67\33\uffff\1\70",
            "\1\71",
            "\1\72",
            "\1\73\37\uffff\1\74\5\uffff\1\75",
            "\1\76\54\uffff\1\77",
            "\1\101\5\uffff\1\100\17\uffff\1\103\3\uffff\1\104\5\uffff"+
            "\1\102",
            "\1\105",
            "\1\106",
            "",
            "",
            "\1\111\1\uffff\1\110\11\uffff\1\112",
            "\1\113",
            "",
            "",
            "\1\114",
            "\1\115",
            "\1\116\7\uffff\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\1\123",
            "\1\124",
            "\1\125",
            "\1\126",
            "",
            "\1\127\3\uffff\1\130",
            "\1\131",
            "\1\132",
            "\1\133",
            "\1\134",
            "\1\135",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\136",
            "\1\137",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\141",
            "\1\142",
            "\1\143",
            "\1\144",
            "\1\145",
            "\1\146",
            "\1\147",
            "\1\150",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "",
            "",
            "\1\157",
            "\1\160",
            "\1\161",
            "\1\162",
            "\1\163",
            "\1\164",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\166",
            "\1\167",
            "\1\171\3\uffff\1\170",
            "\1\172",
            "\1\173",
            "\1\174",
            "\1\175",
            "\1\176",
            "\1\177",
            "\1\u0080",
            "\1\u0081",
            "\1\u0082",
            "\1\u0083",
            "\1\u0084",
            "\1\u0085",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0087",
            "",
            "\1\u0088",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\1\u008f",
            "\1\u0090",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0097",
            "\1\u0098",
            "\1\u0099",
            "\1\u009a",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00a2",
            "\1\u00a3",
            "\1\u00a4",
            "\1\u00a5",
            "\1\u00a6",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\1\u00ab",
            "",
            "\1\u00ac",
            "\1\u00ad",
            "",
            "",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "",
            "\1\u00b4",
            "\1\u00b5",
            "\1\u00b6",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00b9",
            "\1\u00ba",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00bc",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00bf",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "\1\u00c5",
            "\1\u00c6",
            "\1\u00c7",
            "\1\u00c8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00d2",
            "\1\u00d3",
            "",
            "",
            "\1\u00d4",
            "\1\u00d5",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00d7",
            "",
            "\1\u00d8",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00da",
            "\1\u00db",
            "\1\u00dc",
            "\1\u00dd",
            "\1\u00de",
            "\1\u00df",
            "",
            "\1\u00e0",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u00e7",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00ee",
            "\1\u00ef",
            "\1\u00f0",
            "\1\u00f1",
            "\1\u00f2",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u00f4",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00f6",
            "",
            "\1\u00f7",
            "\1\u00f8",
            "\1\u00f9",
            "\1\u00fa",
            "",
            "",
            "",
            "\1\u00fb",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u00fd",
            "\1\u00fe",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u0102",
            "\1\u0103",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "\1\u0107",
            "\1\u0108",
            "",
            "",
            "",
            "\1\u0109",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "\1\u010c",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            "",
            "",
            "\1\u010e",
            "",
            "\12\52\7\uffff\32\52\4\uffff\1\52\1\uffff\32\52",
            ""
    };

    static final short[] DFA6_eot = DFA.unpackEncodedString(DFA6_eotS);
    static final short[] DFA6_eof = DFA.unpackEncodedString(DFA6_eofS);
    static final char[] DFA6_min = DFA.unpackEncodedStringToUnsignedChars(DFA6_minS);
    static final char[] DFA6_max = DFA.unpackEncodedStringToUnsignedChars(DFA6_maxS);
    static final short[] DFA6_accept = DFA.unpackEncodedString(DFA6_acceptS);
    static final short[] DFA6_special = DFA.unpackEncodedString(DFA6_specialS);
    static final short[][] DFA6_transition;

    static {
        int numStates = DFA6_transitionS.length;
        DFA6_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA6_transition[i] = DFA.unpackEncodedString(DFA6_transitionS[i]);
        }
    }

    class DFA6 extends DFA {

        public DFA6(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 6;
            this.eot = DFA6_eot;
            this.eof = DFA6_eof;
            this.min = DFA6_min;
            this.max = DFA6_max;
            this.accept = DFA6_accept;
            this.special = DFA6_special;
            this.transition = DFA6_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | EQUALS | INCR | DECR | LESSTHAN | GRTRTHAN | ISEQUAL | NOTEQUAL | AND_OP | OR_OP | MODULO | NOT_OP | CIRCLE | TEXTBOX | BUTTON | BOX | T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | STRING_LITERAL | ID | INTEGER | COMMENT | WS );";
        }
    }
 

}