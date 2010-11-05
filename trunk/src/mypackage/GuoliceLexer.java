// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g 2010-11-05 21:14:47

package mypackage;

import mypackage.Node;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GuoliceLexer extends Lexer {
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LETTER=31;
    public static final int MULTEQUAL=13;
    public static final int BUTTON=24;
    public static final int EQUALS=8;
    public static final int T__61=61;
    public static final int ID=26;
    public static final int T__60=60;
    public static final int EOF=-1;
    public static final int PLUSEQUAL=11;
    public static final int NOTEQUAL=17;
    public static final int T__55=55;
    public static final int MINUSEQUAL=12;
    public static final int T__56=56;
    public static final int T__57=57;
    public static final int BOX=25;
    public static final int T__58=58;
    public static final int T__51=51;
    public static final int T__52=52;
    public static final int T__53=53;
    public static final int T__54=54;
    public static final int INCR=9;
    public static final int T__59=59;
    public static final int ISEQUAL=16;
    public static final int PLUS=4;
    public static final int DIGIT=32;
    public static final int COMMENT=33;
    public static final int T__50=50;
    public static final int NOT_OP=21;
    public static final int INTEGER=29;
    public static final int TEXTBOX=23;
    public static final int T__42=42;
    public static final int OR_OP=19;
    public static final int T__43=43;
    public static final int T__40=40;
    public static final int LESSTHAN=14;
    public static final int T__41=41;
    public static final int MODULO=20;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int EVENTTYPE=30;
    public static final int POSITION_KEYWORD=27;
    public static final int MULT=6;
    public static final int MINUS=5;
    public static final int GRTRTHAN=15;
    public static final int AND_OP=18;
    public static final int WS=34;
    public static final int T__35=35;
    public static final int T__70=70;
    public static final int T__36=36;
    public static final int T__37=37;
    public static final int CIRCLE=22;
    public static final int T__38=38;
    public static final int COLOR_AREA=28;
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:13:6: ( '+' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:13:8: '+'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:14:7: ( '-' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:14:9: '-'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:15:6: ( '*' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:15:8: '*'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:16:5: ( '/' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:16:7: '/'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:17:8: ( '=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:17:10: '='
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:18:6: ( '++' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:18:8: '++'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:19:6: ( '--' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:19:8: '--'
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

    // $ANTLR start "PLUSEQUAL"
    public final void mPLUSEQUAL() throws RecognitionException {
        try {
            int _type = PLUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:20:11: ( '+=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:20:13: '+='
            {
            match("+="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "PLUSEQUAL"

    // $ANTLR start "MINUSEQUAL"
    public final void mMINUSEQUAL() throws RecognitionException {
        try {
            int _type = MINUSEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:21:12: ( '-=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:21:14: '-='
            {
            match("-="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MINUSEQUAL"

    // $ANTLR start "MULTEQUAL"
    public final void mMULTEQUAL() throws RecognitionException {
        try {
            int _type = MULTEQUAL;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:22:11: ( '*=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:22:13: '*='
            {
            match("*="); 


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "MULTEQUAL"

    // $ANTLR start "LESSTHAN"
    public final void mLESSTHAN() throws RecognitionException {
        try {
            int _type = LESSTHAN;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:23:10: ( '<' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:23:12: '<'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:24:10: ( '>' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:24:12: '>'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:25:9: ( '==' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:25:11: '=='
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:26:10: ( '/=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:26:12: '/='
            {
            match("/="); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:27:8: ( 'AND' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:27:10: 'AND'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:28:7: ( 'OR' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:28:9: 'OR'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:29:8: ( 'MOD' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:29:10: 'MOD'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:30:8: ( 'NOT' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:30:10: 'NOT'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:31:8: ( 'CIRCLE' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:31:10: 'CIRCLE'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:32:9: ( 'TEXTBOX' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:32:11: 'TEXTBOX'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:33:8: ( 'BUTTON' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:33:10: 'BUTTON'
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:34:5: ( 'BOX' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:34:7: 'BOX'
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

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:35:7: ( 'procedure' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:35:9: 'procedure'
            {
            match("procedure"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:36:7: ( ':' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:36:9: ':'
            {
            match(':'); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:37:7: ( '(' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:37:9: '('
            {
            match('('); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:38:7: ( ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:38:9: ')'
            {
            match(')'); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:39:7: ( 'end' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:39:9: 'end'
            {
            match("end"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:40:7: ( 'function' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:40:9: 'function'
            {
            match("function"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:41:7: ( ',' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:41:9: ','
            {
            match(','); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:42:7: ( 'Position' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:42:9: 'Position'
            {
            match("Position"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:43:7: ( 'StartPoint' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:43:9: 'StartPoint'
            {
            match("StartPoint"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:44:7: ( 'Width' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:44:9: 'Width'
            {
            match("Width"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:45:7: ( 'Height' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:45:9: 'Height'
            {
            match("Height"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:46:7: ( 'R' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:46:9: 'R'
            {
            match('R'); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:47:7: ( 'Text' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:47:9: 'Text'
            {
            match("Text"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:48:7: ( '.' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:48:9: '.'
            {
            match('.'); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:49:7: ( ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:49:9: ';'
            {
            match(';'); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:50:7: ( ':=' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:50:9: ':='
            {
            match(":="); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:51:7: ( 'constant' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:51:9: 'constant'
            {
            match("constant"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:52:7: ( 'var' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:52:9: 'var'
            {
            match("var"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:53:7: ( 'if' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:53:9: 'if'
            {
            match("if"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:54:7: ( 'do' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:54:9: 'do'
            {
            match("do"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:55:7: ( 'elseif' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:55:9: 'elseif'
            {
            match("elseif"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:56:7: ( 'else' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:56:9: 'else'
            {
            match("else"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:57:7: ( 'while' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:57:9: 'while'
            {
            match("while"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:58:7: ( 'loop' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:58:9: 'loop'
            {
            match("loop"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:59:7: ( 'exit' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:59:9: 'exit'
            {
            match("exit"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:60:7: ( 'when' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:60:9: 'when'
            {
            match("when"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:61:7: ( 'now' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:61:9: 'now'
            {
            match("now"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:62:7: ( 'return' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:62:9: 'return'
            {
            match("return"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:7: ( '^' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:9: '^'
            {
            match('^'); 

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:64:7: ( 'int' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:64:9: 'int'
            {
            match("int"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:65:7: ( 'float' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:65:9: 'float'
            {
            match("float"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:66:7: ( 'color' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:66:9: 'color'
            {
            match("color"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:7: ( 'string' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:9: 'string'
            {
            match("string"); 


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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:7: ( '\"' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:9: '\"'
            {
            match('\"'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__68"

    // $ANTLR start "T__69"
    public final void mT__69() throws RecognitionException {
        try {
            int _type = T__69;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:69:7: ( '\\n' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:69:9: '\\n'
            {
            match('\n'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__69"

    // $ANTLR start "T__70"
    public final void mT__70() throws RecognitionException {
        try {
            int _type = T__70;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:70:7: ( '\\r' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:70:9: '\\r'
            {
            match('\r'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "T__70"

    // $ANTLR start "EVENTTYPE"
    public final void mEVENTTYPE() throws RecognitionException {
        try {
            int _type = EVENTTYPE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:525:11: ( 'OnClick' | 'KeyPress' )
            int alt1=2;
            int LA1_0 = input.LA(1);

            if ( (LA1_0=='O') ) {
                alt1=1;
            }
            else if ( (LA1_0=='K') ) {
                alt1=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }
            switch (alt1) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:525:13: 'OnClick'
                    {
                    match("OnClick"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:525:24: 'KeyPress'
                    {
                    match("KeyPress"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "EVENTTYPE"

    // $ANTLR start "POSITION_KEYWORD"
    public final void mPOSITION_KEYWORD() throws RecognitionException {
        try {
            int _type = POSITION_KEYWORD;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:528:2: ( 'leftOf' | 'rightOf' | 'above' | 'below' | 'inside' )
            int alt2=5;
            switch ( input.LA(1) ) {
            case 'l':
                {
                alt2=1;
                }
                break;
            case 'r':
                {
                alt2=2;
                }
                break;
            case 'a':
                {
                alt2=3;
                }
                break;
            case 'b':
                {
                alt2=4;
                }
                break;
            case 'i':
                {
                alt2=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:528:5: 'leftOf'
                    {
                    match("leftOf"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:528:17: 'rightOf'
                    {
                    match("rightOf"); 


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:528:30: 'above'
                    {
                    match("above"); 


                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:528:41: 'below'
                    {
                    match("below"); 


                    }
                    break;
                case 5 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:528:52: 'inside'
                    {
                    match("inside"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "POSITION_KEYWORD"

    // $ANTLR start "COLOR_AREA"
    public final void mCOLOR_AREA() throws RecognitionException {
        try {
            int _type = COLOR_AREA;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:530:12: ( 'backColor' | 'textColor' )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0=='b') ) {
                alt3=1;
            }
            else if ( (LA3_0=='t') ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:530:14: 'backColor'
                    {
                    match("backColor"); 


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:530:27: 'textColor'
                    {
                    match("textColor"); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        }
    }
    // $ANTLR end "COLOR_AREA"

    // $ANTLR start "LETTER"
    public final void mLETTER() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:533:8: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:533:10: ( 'a' .. 'z' | 'A' .. 'Z' | '_' )
            {
            if ( (input.LA(1)>='A' && input.LA(1)<='Z')||input.LA(1)=='_'||(input.LA(1)>='a' && input.LA(1)<='z') ) {
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:536:7: ( '0' .. '9' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:536:9: '0' .. '9'
            {
            matchRange('0','9'); 

            }

        }
        finally {
        }
    }
    // $ANTLR end "DIGIT"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:538:4: ( LETTER ( LETTER | DIGIT )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:538:6: LETTER ( LETTER | DIGIT )*
            {
            mLETTER(); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:538:13: ( LETTER | DIGIT )*
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( ((LA4_0>='0' && LA4_0<='9')||(LA4_0>='A' && LA4_0<='Z')||LA4_0=='_'||(LA4_0>='a' && LA4_0<='z')) ) {
                    alt4=1;
                }


                switch (alt4) {
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
            	    break loop4;
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:541:9: ( ( DIGIT )+ )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:541:11: ( DIGIT )+
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:541:11: ( DIGIT )+
            int cnt5=0;
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( ((LA5_0>='0' && LA5_0<='9')) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:541:11: DIGIT
            	    {
            	    mDIGIT(); 

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


            }

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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:543:9: ( '//' ( . )* ( '\\n' | '\\r' ) )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:543:11: '//' ( . )* ( '\\n' | '\\r' )
            {
            match("//"); 

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:543:16: ( . )*
            loop6:
            do {
                int alt6=2;
                int LA6_0 = input.LA(1);

                if ( (LA6_0=='\n'||LA6_0=='\r') ) {
                    alt6=2;
                }
                else if ( ((LA6_0>='\u0000' && LA6_0<='\t')||(LA6_0>='\u000B' && LA6_0<='\f')||(LA6_0>='\u000E' && LA6_0<='\uFFFF')) ) {
                    alt6=1;
                }


                switch (alt6) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:543:16: .
            	    {
            	    matchAny(); 

            	    }
            	    break;

            	default :
            	    break loop6;
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:545:9: ( ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+ )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:545:11: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:545:11: ( ' ' | '\\t' | '\\n' | '\\r' | '\\f' )+
            int cnt7=0;
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( ((LA7_0>='\t' && LA7_0<='\n')||(LA7_0>='\f' && LA7_0<='\r')||LA7_0==' ') ) {
                    alt7=1;
                }


                switch (alt7) {
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
            	    if ( cnt7 >= 1 ) break loop7;
                        EarlyExitException eee =
                            new EarlyExitException(7, input);
                        throw eee;
                }
                cnt7++;
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
        // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:8: ( PLUS | MINUS | MULT | DIV | EQUALS | INCR | DECR | PLUSEQUAL | MINUSEQUAL | MULTEQUAL | LESSTHAN | GRTRTHAN | ISEQUAL | NOTEQUAL | AND_OP | OR_OP | MODULO | NOT_OP | CIRCLE | TEXTBOX | BUTTON | BOX | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | EVENTTYPE | POSITION_KEYWORD | COLOR_AREA | ID | COMMENT | WS )
        int alt8=64;
        alt8 = dfa8.predict(input);
        switch (alt8) {
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
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:47: PLUSEQUAL
                {
                mPLUSEQUAL(); 

                }
                break;
            case 9 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:57: MINUSEQUAL
                {
                mMINUSEQUAL(); 

                }
                break;
            case 10 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:68: MULTEQUAL
                {
                mMULTEQUAL(); 

                }
                break;
            case 11 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:78: LESSTHAN
                {
                mLESSTHAN(); 

                }
                break;
            case 12 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:87: GRTRTHAN
                {
                mGRTRTHAN(); 

                }
                break;
            case 13 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:96: ISEQUAL
                {
                mISEQUAL(); 

                }
                break;
            case 14 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:104: NOTEQUAL
                {
                mNOTEQUAL(); 

                }
                break;
            case 15 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:113: AND_OP
                {
                mAND_OP(); 

                }
                break;
            case 16 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:120: OR_OP
                {
                mOR_OP(); 

                }
                break;
            case 17 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:126: MODULO
                {
                mMODULO(); 

                }
                break;
            case 18 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:133: NOT_OP
                {
                mNOT_OP(); 

                }
                break;
            case 19 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:140: CIRCLE
                {
                mCIRCLE(); 

                }
                break;
            case 20 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:147: TEXTBOX
                {
                mTEXTBOX(); 

                }
                break;
            case 21 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:155: BUTTON
                {
                mBUTTON(); 

                }
                break;
            case 22 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:162: BOX
                {
                mBOX(); 

                }
                break;
            case 23 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:166: T__35
                {
                mT__35(); 

                }
                break;
            case 24 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:172: T__36
                {
                mT__36(); 

                }
                break;
            case 25 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:178: T__37
                {
                mT__37(); 

                }
                break;
            case 26 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:184: T__38
                {
                mT__38(); 

                }
                break;
            case 27 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:190: T__39
                {
                mT__39(); 

                }
                break;
            case 28 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:196: T__40
                {
                mT__40(); 

                }
                break;
            case 29 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:202: T__41
                {
                mT__41(); 

                }
                break;
            case 30 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:208: T__42
                {
                mT__42(); 

                }
                break;
            case 31 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:214: T__43
                {
                mT__43(); 

                }
                break;
            case 32 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:220: T__44
                {
                mT__44(); 

                }
                break;
            case 33 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:226: T__45
                {
                mT__45(); 

                }
                break;
            case 34 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:232: T__46
                {
                mT__46(); 

                }
                break;
            case 35 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:238: T__47
                {
                mT__47(); 

                }
                break;
            case 36 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:244: T__48
                {
                mT__48(); 

                }
                break;
            case 37 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:250: T__49
                {
                mT__49(); 

                }
                break;
            case 38 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:256: T__50
                {
                mT__50(); 

                }
                break;
            case 39 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:262: T__51
                {
                mT__51(); 

                }
                break;
            case 40 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:268: T__52
                {
                mT__52(); 

                }
                break;
            case 41 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:274: T__53
                {
                mT__53(); 

                }
                break;
            case 42 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:280: T__54
                {
                mT__54(); 

                }
                break;
            case 43 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:286: T__55
                {
                mT__55(); 

                }
                break;
            case 44 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:292: T__56
                {
                mT__56(); 

                }
                break;
            case 45 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:298: T__57
                {
                mT__57(); 

                }
                break;
            case 46 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:304: T__58
                {
                mT__58(); 

                }
                break;
            case 47 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:310: T__59
                {
                mT__59(); 

                }
                break;
            case 48 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:316: T__60
                {
                mT__60(); 

                }
                break;
            case 49 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:322: T__61
                {
                mT__61(); 

                }
                break;
            case 50 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:328: T__62
                {
                mT__62(); 

                }
                break;
            case 51 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:334: T__63
                {
                mT__63(); 

                }
                break;
            case 52 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:340: T__64
                {
                mT__64(); 

                }
                break;
            case 53 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:346: T__65
                {
                mT__65(); 

                }
                break;
            case 54 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:352: T__66
                {
                mT__66(); 

                }
                break;
            case 55 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:358: T__67
                {
                mT__67(); 

                }
                break;
            case 56 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:364: T__68
                {
                mT__68(); 

                }
                break;
            case 57 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:370: T__69
                {
                mT__69(); 

                }
                break;
            case 58 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:376: T__70
                {
                mT__70(); 

                }
                break;
            case 59 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:382: EVENTTYPE
                {
                mEVENTTYPE(); 

                }
                break;
            case 60 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:392: POSITION_KEYWORD
                {
                mPOSITION_KEYWORD(); 

                }
                break;
            case 61 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:409: COLOR_AREA
                {
                mCOLOR_AREA(); 

                }
                break;
            case 62 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:420: ID
                {
                mID(); 

                }
                break;
            case 63 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:423: COMMENT
                {
                mCOMMENT(); 

                }
                break;
            case 64 :
                // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:1:431: WS
                {
                mWS(); 

                }
                break;

        }

    }


    protected DFA8 dfa8 = new DFA8(this);
    static final String DFA8_eotS =
        "\1\uffff\1\62\1\65\1\67\1\72\1\74\2\uffff\10\56\1\111\2\uffff\2"+
        "\56\1\uffff\4\56\1\123\2\uffff\10\56\1\uffff\1\56\1\uffff\1\140"+
        "\1\141\4\56\17\uffff\1\56\1\150\11\56\2\uffff\11\56\1\uffff\2\56"+
        "\1\176\1\56\1\u0081\7\56\2\uffff\5\56\1\u008f\1\uffff\1\56\1\u0091"+
        "\1\u0092\4\56\1\u0097\1\56\1\u0099\12\56\1\u00a4\1\uffff\1\u00a5"+
        "\1\56\1\uffff\4\56\1\u00ab\10\56\1\uffff\1\56\2\uffff\2\56\1\u00b7"+
        "\1\56\1\uffff\1\56\1\uffff\1\u00bb\1\u00bc\10\56\2\uffff\2\56\1"+
        "\u00c7\1\u00c8\1\56\1\uffff\13\56\1\uffff\3\56\2\uffff\1\56\1\u00d9"+
        "\2\56\1\u00dc\2\56\1\u00df\1\56\1\u00e1\2\uffff\5\56\2\u00e7\3\56"+
        "\1\u00eb\1\56\1\u00ed\1\56\1\u00ef\1\56\1\uffff\2\56\1\uffff\1\u00f3"+
        "\1\56\1\uffff\1\u00e7\1\uffff\1\u00e7\1\u00f5\1\56\1\u00f7\1\56"+
        "\1\uffff\2\56\1\u00fb\1\uffff\1\u00fc\1\uffff\1\56\1\uffff\3\56"+
        "\1\uffff\1\56\1\uffff\1\u00e7\1\uffff\3\56\2\uffff\1\56\1\u0106"+
        "\1\u0107\1\56\1\u0109\1\u00fb\2\56\1\u010c\2\uffff\1\56\1\uffff"+
        "\2\u010e\1\uffff\1\u010f\2\uffff";
    static final String DFA8_eofS =
        "\u0110\uffff";
    static final String DFA8_minS =
        "\1\11\1\53\1\55\1\75\1\57\1\75\2\uffff\1\116\1\122\2\117\1\111"+
        "\1\105\1\117\1\162\1\75\2\uffff\2\154\1\uffff\1\157\1\164\1\151"+
        "\1\145\1\60\2\uffff\1\157\1\141\1\146\1\157\1\150\1\145\1\157\1"+
        "\145\1\uffff\1\164\1\uffff\2\11\1\145\1\142\1\141\1\145\17\uffff"+
        "\1\104\1\60\1\103\1\104\1\124\1\122\1\130\1\170\1\124\1\130\1\157"+
        "\2\uffff\1\144\1\163\1\151\1\156\1\157\1\163\1\141\1\144\1\151\1"+
        "\uffff\1\154\1\162\1\60\1\163\1\60\1\145\1\157\1\146\1\167\1\164"+
        "\1\147\1\162\2\uffff\1\171\1\157\1\154\1\143\1\170\1\60\1\uffff"+
        "\1\154\2\60\1\103\1\124\1\164\1\124\1\60\1\143\1\60\1\145\1\164"+
        "\1\143\1\141\1\151\1\162\1\164\1\147\1\163\1\157\1\60\1\uffff\1"+
        "\60\1\151\1\uffff\1\154\1\156\1\160\1\164\1\60\1\165\1\150\1\151"+
        "\1\120\1\166\1\157\1\153\1\164\1\uffff\1\151\2\uffff\1\114\1\102"+
        "\1\60\1\117\1\uffff\1\145\1\uffff\2\60\4\164\2\150\1\164\1\162\2"+
        "\uffff\1\144\1\145\2\60\1\117\1\uffff\1\162\1\164\1\156\1\162\1"+
        "\145\1\167\2\103\1\143\1\105\1\117\1\uffff\1\116\1\144\1\146\2\uffff"+
        "\1\151\1\60\1\151\1\120\1\60\1\164\1\141\1\60\1\145\1\60\2\uffff"+
        "\1\146\1\156\1\117\1\147\1\145\2\60\2\157\1\153\1\60\1\130\1\60"+
        "\1\165\1\60\1\157\1\uffff\2\157\1\uffff\1\60\1\156\1\uffff\1\60"+
        "\1\uffff\2\60\1\146\1\60\1\163\1\uffff\2\154\1\60\1\uffff\1\60\1"+
        "\uffff\1\162\1\uffff\2\156\1\151\1\uffff\1\164\1\uffff\1\60\1\uffff"+
        "\1\163\2\157\2\uffff\1\145\2\60\1\156\2\60\2\162\1\60\2\uffff\1"+
        "\164\1\uffff\2\60\1\uffff\1\60\2\uffff";
    static final String DFA8_maxS =
        "\1\172\5\75\2\uffff\1\116\1\156\2\117\1\111\1\145\1\125\1\162\1"+
        "\75\2\uffff\1\170\1\165\1\uffff\1\157\1\164\1\151\1\145\1\172\2"+
        "\uffff\1\157\1\141\1\156\1\157\1\150\2\157\1\151\1\uffff\1\164\1"+
        "\uffff\2\40\1\145\1\142\2\145\17\uffff\1\104\1\172\1\103\1\104\1"+
        "\124\1\122\1\130\1\170\1\124\1\130\1\157\2\uffff\1\144\1\163\1\151"+
        "\1\156\1\157\1\163\1\141\1\144\1\151\1\uffff\1\156\1\162\1\172\1"+
        "\164\1\172\1\151\1\157\1\146\1\167\1\164\1\147\1\162\2\uffff\1\171"+
        "\1\157\1\154\1\143\1\170\1\172\1\uffff\1\154\2\172\1\103\1\124\1"+
        "\164\1\124\1\172\1\143\1\172\1\145\1\164\1\143\1\141\1\151\1\162"+
        "\1\164\1\147\1\163\1\157\1\172\1\uffff\1\172\1\151\1\uffff\1\154"+
        "\1\156\1\160\1\164\1\172\1\165\1\150\1\151\1\120\1\166\1\157\1\153"+
        "\1\164\1\uffff\1\151\2\uffff\1\114\1\102\1\172\1\117\1\uffff\1\145"+
        "\1\uffff\2\172\4\164\2\150\1\164\1\162\2\uffff\1\144\1\145\2\172"+
        "\1\117\1\uffff\1\162\1\164\1\156\1\162\1\145\1\167\2\103\1\143\1"+
        "\105\1\117\1\uffff\1\116\1\144\1\146\2\uffff\1\151\1\172\1\151\1"+
        "\120\1\172\1\164\1\141\1\172\1\145\1\172\2\uffff\1\146\1\156\1\117"+
        "\1\147\1\145\2\172\2\157\1\153\1\172\1\130\1\172\1\165\1\172\1\157"+
        "\1\uffff\2\157\1\uffff\1\172\1\156\1\uffff\1\172\1\uffff\2\172\1"+
        "\146\1\172\1\163\1\uffff\2\154\1\172\1\uffff\1\172\1\uffff\1\162"+
        "\1\uffff\2\156\1\151\1\uffff\1\164\1\uffff\1\172\1\uffff\1\163\2"+
        "\157\2\uffff\1\145\2\172\1\156\2\172\2\162\1\172\2\uffff\1\164\1"+
        "\uffff\2\172\1\uffff\1\172\2\uffff";
    static final String DFA8_acceptS =
        "\6\uffff\1\13\1\14\11\uffff\1\31\1\32\2\uffff\1\35\5\uffff\1\44"+
        "\1\45\10\uffff\1\63\1\uffff\1\70\6\uffff\1\76\1\100\1\6\1\10\1\1"+
        "\1\7\1\11\1\2\1\12\1\3\1\16\1\77\1\4\1\15\1\5\13\uffff\1\46\1\30"+
        "\11\uffff\1\42\14\uffff\1\71\1\72\6\uffff\1\20\25\uffff\1\51\2\uffff"+
        "\1\52\15\uffff\1\17\1\uffff\1\21\1\22\4\uffff\1\26\1\uffff\1\33"+
        "\12\uffff\1\50\1\64\5\uffff\1\61\13\uffff\1\43\3\uffff\1\54\1\57"+
        "\12\uffff\1\60\1\56\20\uffff\1\65\2\uffff\1\40\2\uffff\1\66\1\uffff"+
        "\1\55\5\uffff\1\74\3\uffff\1\23\1\uffff\1\25\1\uffff\1\53\3\uffff"+
        "\1\41\1\uffff\1\62\1\uffff\1\67\3\uffff\1\73\1\24\11\uffff\1\34"+
        "\1\36\1\uffff\1\47\2\uffff\1\27\1\uffff\1\75\1\37";
    static final String DFA8_specialS =
        "\u0110\uffff}>";
    static final String[] DFA8_transitionS = {
            "\1\57\1\50\1\uffff\1\57\1\51\22\uffff\1\57\1\uffff\1\47\5\uffff"+
            "\1\21\1\22\1\3\1\1\1\25\1\2\1\33\1\4\12\uffff\1\20\1\34\1\6"+
            "\1\5\1\7\2\uffff\1\10\1\16\1\14\4\56\1\31\2\56\1\52\1\56\1\12"+
            "\1\13\1\11\1\26\1\56\1\32\1\27\1\15\2\56\1\30\3\56\3\uffff\1"+
            "\45\1\56\1\uffff\1\53\1\54\1\35\1\40\1\23\1\24\2\56\1\37\2\56"+
            "\1\42\1\56\1\43\1\56\1\17\1\56\1\44\1\46\1\55\1\56\1\36\1\41"+
            "\3\56",
            "\1\60\21\uffff\1\61",
            "\1\63\17\uffff\1\64",
            "\1\66",
            "\1\71\15\uffff\1\70",
            "\1\73",
            "",
            "",
            "\1\75",
            "\1\76\33\uffff\1\77",
            "\1\100",
            "\1\101",
            "\1\102",
            "\1\103\37\uffff\1\104",
            "\1\106\5\uffff\1\105",
            "\1\107",
            "\1\110",
            "",
            "",
            "\1\113\1\uffff\1\112\11\uffff\1\114",
            "\1\116\10\uffff\1\115",
            "",
            "\1\117",
            "\1\120",
            "\1\121",
            "\1\122",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\124",
            "\1\125",
            "\1\126\7\uffff\1\127",
            "\1\130",
            "\1\131",
            "\1\133\11\uffff\1\132",
            "\1\134",
            "\1\135\3\uffff\1\136",
            "",
            "\1\137",
            "",
            "\2\57\1\uffff\2\57\22\uffff\1\57",
            "\2\57\1\uffff\2\57\22\uffff\1\57",
            "\1\142",
            "\1\143",
            "\1\145\3\uffff\1\144",
            "\1\146",
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
            "",
            "",
            "",
            "\1\147",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\151",
            "\1\152",
            "\1\153",
            "\1\154",
            "\1\155",
            "\1\156",
            "\1\157",
            "\1\160",
            "\1\161",
            "",
            "",
            "\1\162",
            "\1\163",
            "\1\164",
            "\1\165",
            "\1\166",
            "\1\167",
            "\1\170",
            "\1\171",
            "\1\172",
            "",
            "\1\174\1\uffff\1\173",
            "\1\175",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0080\1\177",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0083\3\uffff\1\u0082",
            "\1\u0084",
            "\1\u0085",
            "\1\u0086",
            "\1\u0087",
            "\1\u0088",
            "\1\u0089",
            "",
            "",
            "\1\u008a",
            "\1\u008b",
            "\1\u008c",
            "\1\u008d",
            "\1\u008e",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0090",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0093",
            "\1\u0094",
            "\1\u0095",
            "\1\u0096",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0098",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u009a",
            "\1\u009b",
            "\1\u009c",
            "\1\u009d",
            "\1\u009e",
            "\1\u009f",
            "\1\u00a0",
            "\1\u00a1",
            "\1\u00a2",
            "\1\u00a3",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00a6",
            "",
            "\1\u00a7",
            "\1\u00a8",
            "\1\u00a9",
            "\1\u00aa",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ac",
            "\1\u00ad",
            "\1\u00ae",
            "\1\u00af",
            "\1\u00b0",
            "\1\u00b1",
            "\1\u00b2",
            "\1\u00b3",
            "",
            "\1\u00b4",
            "",
            "",
            "\1\u00b5",
            "\1\u00b6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00b8",
            "",
            "\1\u00b9",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\10\56\1\u00ba\21"+
            "\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00bd",
            "\1\u00be",
            "\1\u00bf",
            "\1\u00c0",
            "\1\u00c1",
            "\1\u00c2",
            "\1\u00c3",
            "\1\u00c4",
            "",
            "",
            "\1\u00c5",
            "\1\u00c6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00c9",
            "",
            "\1\u00ca",
            "\1\u00cb",
            "\1\u00cc",
            "\1\u00cd",
            "\1\u00ce",
            "\1\u00cf",
            "\1\u00d0",
            "\1\u00d1",
            "\1\u00d2",
            "\1\u00d3",
            "\1\u00d4",
            "",
            "\1\u00d5",
            "\1\u00d6",
            "\1\u00d7",
            "",
            "",
            "\1\u00d8",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00da",
            "\1\u00db",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00dd",
            "\1\u00de",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e0",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u00e2",
            "\1\u00e3",
            "\1\u00e4",
            "\1\u00e5",
            "\1\u00e6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00e8",
            "\1\u00e9",
            "\1\u00ea",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ec",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00ee",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f0",
            "",
            "\1\u00f1",
            "\1\u00f2",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f4",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f6",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u00f8",
            "",
            "\1\u00f9",
            "\1\u00fa",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u00fd",
            "",
            "\1\u00fe",
            "\1\u00ff",
            "\1\u0100",
            "",
            "\1\u0101",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\1\u0102",
            "\1\u0103",
            "\1\u0104",
            "",
            "",
            "\1\u0105",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u0108",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\1\u010a",
            "\1\u010b",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "",
            "\1\u010d",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            "\12\56\7\uffff\32\56\4\uffff\1\56\1\uffff\32\56",
            "",
            ""
    };

    static final short[] DFA8_eot = DFA.unpackEncodedString(DFA8_eotS);
    static final short[] DFA8_eof = DFA.unpackEncodedString(DFA8_eofS);
    static final char[] DFA8_min = DFA.unpackEncodedStringToUnsignedChars(DFA8_minS);
    static final char[] DFA8_max = DFA.unpackEncodedStringToUnsignedChars(DFA8_maxS);
    static final short[] DFA8_accept = DFA.unpackEncodedString(DFA8_acceptS);
    static final short[] DFA8_special = DFA.unpackEncodedString(DFA8_specialS);
    static final short[][] DFA8_transition;

    static {
        int numStates = DFA8_transitionS.length;
        DFA8_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA8_transition[i] = DFA.unpackEncodedString(DFA8_transitionS[i]);
        }
    }

    class DFA8 extends DFA {

        public DFA8(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 8;
            this.eot = DFA8_eot;
            this.eof = DFA8_eof;
            this.min = DFA8_min;
            this.max = DFA8_max;
            this.accept = DFA8_accept;
            this.special = DFA8_special;
            this.transition = DFA8_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( PLUS | MINUS | MULT | DIV | EQUALS | INCR | DECR | PLUSEQUAL | MINUSEQUAL | MULTEQUAL | LESSTHAN | GRTRTHAN | ISEQUAL | NOTEQUAL | AND_OP | OR_OP | MODULO | NOT_OP | CIRCLE | TEXTBOX | BUTTON | BOX | T__35 | T__36 | T__37 | T__38 | T__39 | T__40 | T__41 | T__42 | T__43 | T__44 | T__45 | T__46 | T__47 | T__48 | T__49 | T__50 | T__51 | T__52 | T__53 | T__54 | T__55 | T__56 | T__57 | T__58 | T__59 | T__60 | T__61 | T__62 | T__63 | T__64 | T__65 | T__66 | T__67 | T__68 | T__69 | T__70 | EVENTTYPE | POSITION_KEYWORD | COLOR_AREA | ID | COMMENT | WS );";
        }
    }
 

}