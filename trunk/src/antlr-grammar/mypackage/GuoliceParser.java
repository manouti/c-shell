// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g 2010-11-06 12:35:33

package mypackage;

import mypackage.Node;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

public class GuoliceParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "PLUS", "MINUS", "MULT", "DIV", "EQUALS", "INCR", "DECR", "PLUSEQUAL", "MINUSEQUAL", "MULTEQUAL", "LESSTHAN", "GRTRTHAN", "ISEQUAL", "NOTEQUAL", "AND_OP", "OR_OP", "MODULO", "NOT_OP", "CIRCLE", "TEXTBOX", "BUTTON", "BOX", "ID", "POSITION_KEYWORD", "COLOR_AREA", "INTEGER", "EVENTTYPE", "LETTER", "DIGIT", "COMMENT", "WS", "'procedure'", "':'", "'('", "')'", "'end'", "'function'", "','", "'Position'", "'StartPoint'", "'Width'", "'Height'", "'R'", "'Text'", "'.'", "';'", "':='", "'constant'", "'var'", "'if'", "'do'", "'elseif'", "'else'", "'while'", "'loop'", "'exit'", "'when'", "'now'", "'return'", "'^'", "'int'", "'float'", "'color'", "'string'", "'\"'", "'\\n'", "'\\r'"
    };
    public static final int T__68=68;
    public static final int T__69=69;
    public static final int T__66=66;
    public static final int T__67=67;
    public static final int T__64=64;
    public static final int T__65=65;
    public static final int T__62=62;
    public static final int T__63=63;
    public static final int LETTER=31;
    public static final int BUTTON=24;
    public static final int MULTEQUAL=13;
    public static final int EQUALS=8;
    public static final int ID=26;
    public static final int T__61=61;
    public static final int EOF=-1;
    public static final int T__60=60;
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
    public static final int LESSTHAN=14;
    public static final int T__40=40;
    public static final int MODULO=20;
    public static final int T__41=41;
    public static final int T__46=46;
    public static final int T__47=47;
    public static final int T__44=44;
    public static final int T__45=45;
    public static final int T__48=48;
    public static final int T__49=49;
    public static final int EVENTTYPE=30;
    public static final int POSITION_KEYWORD=27;
    public static final int GRTRTHAN=15;
    public static final int MINUS=5;
    public static final int MULT=6;
    public static final int AND_OP=18;
    public static final int WS=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int T__70=70;
    public static final int CIRCLE=22;
    public static final int T__37=37;
    public static final int COLOR_AREA=28;
    public static final int T__38=38;
    public static final int T__39=39;
    public static final int DECR=10;
    public static final int DIV=7;

    // delegates
    // delegators


        public GuoliceParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public GuoliceParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return GuoliceParser.tokenNames; }
    public String getGrammarFileName() { return "C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g"; }


    public Node root = null;



    // $ANTLR start "program"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:60:1: program : ( procedureDec | functionDec | statement )* ;
    public final void program() throws RecognitionException {
         root = new Node("Program"); 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:2: ( ( procedureDec | functionDec | statement )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:4: ( procedureDec | functionDec | statement )*
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:4: ( procedureDec | functionDec | statement )*
            loop1:
            do {
                int alt1=4;
                switch ( input.LA(1) ) {
                case 35:
                    {
                    alt1=1;
                    }
                    break;
                case 40:
                    {
                    alt1=2;
                    }
                    break;
                case ID:
                case 51:
                case 52:
                case 53:
                case 57:
                    {
                    alt1=3;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:6: procedureDec
            	    {
            	    pushFollow(FOLLOW_procedureDec_in_program344);
            	    procedureDec();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:21: functionDec
            	    {
            	    pushFollow(FOLLOW_functionDec_in_program348);
            	    functionDec();

            	    state._fsp--;


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:63:35: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_program352);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

             System.out.println("The root node is: " + root.toString() + "\n");  
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "program"


    // $ANTLR start "procedureDec"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:66:1: procedureDec : 'procedure' ':' ID '(' ( parameters )? ')' ( statement | exitStatement )* 'end' 'procedure' ;
    public final void procedureDec() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:2: ( 'procedure' ':' ID '(' ( parameters )? ')' ( statement | exitStatement )* 'end' 'procedure' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:4: 'procedure' ':' ID '(' ( parameters )? ')' ( statement | exitStatement )* 'end' 'procedure'
            {
            match(input,35,FOLLOW_35_in_procedureDec368); 
            match(input,36,FOLLOW_36_in_procedureDec370); 
            match(input,ID,FOLLOW_ID_in_procedureDec371); 
            match(input,37,FOLLOW_37_in_procedureDec374); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:27: ( parameters )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=64 && LA2_0<=67)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:27: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_procedureDec376);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_procedureDec379); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:3: ( statement | exitStatement )*
            loop3:
            do {
                int alt3=3;
                int LA3_0 = input.LA(1);

                if ( (LA3_0==ID||(LA3_0>=51 && LA3_0<=53)||LA3_0==57) ) {
                    alt3=1;
                }
                else if ( (LA3_0==59) ) {
                    alt3=2;
                }


                switch (alt3) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_procedureDec385);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:17: exitStatement
            	    {
            	    pushFollow(FOLLOW_exitStatement_in_procedureDec389);
            	    exitStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_procedureDec396); 
            match(input,35,FOLLOW_35_in_procedureDec398); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedureDec"


    // $ANTLR start "functionDec"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:72:1: functionDec : 'function' type ':' ID '(' ( parameters )? ')' ( statement | returnStatement )* 'end' 'function' ;
    public final void functionDec() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:74:2: ( 'function' type ':' ID '(' ( parameters )? ')' ( statement | returnStatement )* 'end' 'function' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:74:4: 'function' type ':' ID '(' ( parameters )? ')' ( statement | returnStatement )* 'end' 'function'
            {
            match(input,40,FOLLOW_40_in_functionDec410); 
            pushFollow(FOLLOW_type_in_functionDec412);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_functionDec414); 
            match(input,ID,FOLLOW_ID_in_functionDec416); 
            match(input,37,FOLLOW_37_in_functionDec419); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:74:32: ( parameters )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=64 && LA4_0<=67)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:74:32: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_functionDec421);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_functionDec424); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:76:3: ( statement | returnStatement )*
            loop5:
            do {
                int alt5=3;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==ID||(LA5_0>=51 && LA5_0<=53)||LA5_0==57) ) {
                    alt5=1;
                }
                else if ( (LA5_0==62) ) {
                    alt5=2;
                }


                switch (alt5) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:76:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionDec433);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:76:17: returnStatement
            	    {
            	    pushFollow(FOLLOW_returnStatement_in_functionDec437);
            	    returnStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_functionDec444); 
            match(input,40,FOLLOW_40_in_functionDec446); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "functionDec"


    // $ANTLR start "statement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:80:1: statement returns [Node node] : ( assignmentStatement | constantDecStatement | variableDecStatement | ifStatement | whileStatement | procedureCallStatement | evntHandleStatement );
    public final Node statement() throws RecognitionException {
        Node node = null;

        Node assignmentStatement1 = null;


        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:82:2: ( assignmentStatement | constantDecStatement | variableDecStatement | ifStatement | whileStatement | procedureCallStatement | evntHandleStatement )
            int alt6=7;
            switch ( input.LA(1) ) {
            case ID:
                {
                switch ( input.LA(2) ) {
                case 50:
                    {
                    alt6=1;
                    }
                    break;
                case 37:
                    {
                    alt6=6;
                    }
                    break;
                case 48:
                    {
                    alt6=7;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 6, 1, input);

                    throw nvae;
                }

                }
                break;
            case 51:
                {
                alt6=2;
                }
                break;
            case 52:
                {
                alt6=3;
                }
                break;
            case 53:
                {
                alt6=4;
                }
                break;
            case 57:
                {
                alt6=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }

            switch (alt6) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:82:4: assignmentStatement
                    {
                    pushFollow(FOLLOW_assignmentStatement_in_statement466);
                    assignmentStatement1=assignmentStatement();

                    state._fsp--;

                     node = assignmentStatement1;
                    							root.addChild(assignmentStatement1);
                    	

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:85:4: constantDecStatement
                    {
                    pushFollow(FOLLOW_constantDecStatement_in_statement473);
                    constantDecStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:86:4: variableDecStatement
                    {
                    pushFollow(FOLLOW_variableDecStatement_in_statement479);
                    variableDecStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:87:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement484);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:88:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement489);
                    whileStatement();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:89:4: procedureCallStatement
                    {
                    pushFollow(FOLLOW_procedureCallStatement_in_statement494);
                    procedureCallStatement();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:91:4: evntHandleStatement
                    {
                    pushFollow(FOLLOW_evntHandleStatement_in_statement500);
                    evntHandleStatement();

                    state._fsp--;


                    }
                    break;

            }
            System.out.println("The assignment node is: " + node.toString() + "\n");
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "statement"


    // $ANTLR start "guiType"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:94:1: guiType : ( box | circle | textBox );
    public final void guiType() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:95:2: ( box | circle | textBox )
            int alt7=3;
            switch ( input.LA(1) ) {
            case BOX:
                {
                alt7=1;
                }
                break;
            case CIRCLE:
                {
                alt7=2;
                }
                break;
            case TEXTBOX:
            case BUTTON:
                {
                alt7=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 7, 0, input);

                throw nvae;
            }

            switch (alt7) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:95:4: box
                    {
                    pushFollow(FOLLOW_box_in_guiType511);
                    box();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:96:4: circle
                    {
                    pushFollow(FOLLOW_circle_in_guiType517);
                    circle();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:98:4: textBox
                    {
                    pushFollow(FOLLOW_textBox_in_guiType524);
                    textBox();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "guiType"


    // $ANTLR start "guiCommonProperty"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:103:1: guiCommonProperty : ( position | point | color | event );
    public final void guiCommonProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:104:2: ( position | point | color | event )
            int alt8=4;
            switch ( input.LA(1) ) {
            case 42:
                {
                alt8=1;
                }
                break;
            case 43:
                {
                alt8=2;
                }
                break;
            case COLOR_AREA:
                {
                alt8=3;
                }
                break;
            case EVENTTYPE:
                {
                alt8=4;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;
            }

            switch (alt8) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:104:4: position
                    {
                    pushFollow(FOLLOW_position_in_guiCommonProperty539);
                    position();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:105:4: point
                    {
                    pushFollow(FOLLOW_point_in_guiCommonProperty544);
                    point();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:106:4: color
                    {
                    pushFollow(FOLLOW_color_in_guiCommonProperty549);
                    color();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:107:4: event
                    {
                    pushFollow(FOLLOW_event_in_guiCommonProperty554);
                    event();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "guiCommonProperty"


    // $ANTLR start "box"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:110:1: box : BOX ':' ID '(' ( boxProperty ( ',' boxProperty )* )? ')' ;
    public final void box() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:111:2: ( BOX ':' ID '(' ( boxProperty ( ',' boxProperty )* )? ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:111:4: BOX ':' ID '(' ( boxProperty ( ',' boxProperty )* )? ')'
            {
            match(input,BOX,FOLLOW_BOX_in_box567); 
            match(input,36,FOLLOW_36_in_box569); 
            match(input,ID,FOLLOW_ID_in_box571); 
            match(input,37,FOLLOW_37_in_box573); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:112:5: ( boxProperty ( ',' boxProperty )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLOR_AREA||LA10_0==EVENTTYPE||(LA10_0>=42 && LA10_0<=45)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:112:6: boxProperty ( ',' boxProperty )*
                    {
                    pushFollow(FOLLOW_boxProperty_in_box580);
                    boxProperty();

                    state._fsp--;

                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:112:18: ( ',' boxProperty )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==41) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:112:19: ',' boxProperty
                    	    {
                    	    match(input,41,FOLLOW_41_in_box583); 
                    	    pushFollow(FOLLOW_boxProperty_in_box584);
                    	    boxProperty();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop9;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_box591); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "box"


    // $ANTLR start "boxProperty"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:116:1: boxProperty : ( guiCommonProperty | width | height );
    public final void boxProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:117:2: ( guiCommonProperty | width | height )
            int alt11=3;
            switch ( input.LA(1) ) {
            case COLOR_AREA:
            case EVENTTYPE:
            case 42:
            case 43:
                {
                alt11=1;
                }
                break;
            case 44:
                {
                alt11=2;
                }
                break;
            case 45:
                {
                alt11=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 11, 0, input);

                throw nvae;
            }

            switch (alt11) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:117:4: guiCommonProperty
                    {
                    pushFollow(FOLLOW_guiCommonProperty_in_boxProperty602);
                    guiCommonProperty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:118:4: width
                    {
                    pushFollow(FOLLOW_width_in_boxProperty607);
                    width();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:119:4: height
                    {
                    pushFollow(FOLLOW_height_in_boxProperty612);
                    height();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "boxProperty"


    // $ANTLR start "circle"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:123:1: circle : CIRCLE ':' ID '(' ( circleProperty ( ',' circleProperty )* )? ')' ;
    public final void circle() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:124:2: ( CIRCLE ':' ID '(' ( circleProperty ( ',' circleProperty )* )? ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:124:4: CIRCLE ':' ID '(' ( circleProperty ( ',' circleProperty )* )? ')'
            {
            match(input,CIRCLE,FOLLOW_CIRCLE_in_circle626); 
            match(input,36,FOLLOW_36_in_circle628); 
            match(input,ID,FOLLOW_ID_in_circle629); 
            match(input,37,FOLLOW_37_in_circle632); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:125:5: ( circleProperty ( ',' circleProperty )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLOR_AREA||LA13_0==EVENTTYPE||(LA13_0>=42 && LA13_0<=43)||LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:125:6: circleProperty ( ',' circleProperty )*
                    {
                    pushFollow(FOLLOW_circleProperty_in_circle640);
                    circleProperty();

                    state._fsp--;

                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:125:21: ( ',' circleProperty )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==41) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:125:22: ',' circleProperty
                    	    {
                    	    match(input,41,FOLLOW_41_in_circle643); 
                    	    pushFollow(FOLLOW_circleProperty_in_circle644);
                    	    circleProperty();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop12;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_circle656); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "circle"


    // $ANTLR start "circleProperty"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:129:1: circleProperty : ( guiCommonProperty | radius );
    public final void circleProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:130:2: ( guiCommonProperty | radius )
            int alt14=2;
            int LA14_0 = input.LA(1);

            if ( (LA14_0==COLOR_AREA||LA14_0==EVENTTYPE||(LA14_0>=42 && LA14_0<=43)) ) {
                alt14=1;
            }
            else if ( (LA14_0==46) ) {
                alt14=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 14, 0, input);

                throw nvae;
            }
            switch (alt14) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:130:4: guiCommonProperty
                    {
                    pushFollow(FOLLOW_guiCommonProperty_in_circleProperty668);
                    guiCommonProperty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:131:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_circleProperty673);
                    radius();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "circleProperty"


    // $ANTLR start "textBox"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:134:1: textBox : ( TEXTBOX | BUTTON ) ':' ID '(' ( textBoxProperty ( ',' textBoxProperty )* )? ')' ;
    public final void textBox() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:135:2: ( ( TEXTBOX | BUTTON ) ':' ID '(' ( textBoxProperty ( ',' textBoxProperty )* )? ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:135:4: ( TEXTBOX | BUTTON ) ':' ID '(' ( textBoxProperty ( ',' textBoxProperty )* )? ')'
            {
            if ( (input.LA(1)>=TEXTBOX && input.LA(1)<=BUTTON) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,36,FOLLOW_36_in_textBox692); 
            match(input,ID,FOLLOW_ID_in_textBox694); 
            match(input,37,FOLLOW_37_in_textBox696); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:136:5: ( textBoxProperty ( ',' textBoxProperty )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==COLOR_AREA||LA16_0==EVENTTYPE||(LA16_0>=42 && LA16_0<=45)||LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:136:6: textBoxProperty ( ',' textBoxProperty )*
                    {
                    pushFollow(FOLLOW_textBoxProperty_in_textBox710);
                    textBoxProperty();

                    state._fsp--;

                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:136:22: ( ',' textBoxProperty )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==41) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:136:23: ',' textBoxProperty
                    	    {
                    	    match(input,41,FOLLOW_41_in_textBox713); 
                    	    pushFollow(FOLLOW_textBoxProperty_in_textBox715);
                    	    textBoxProperty();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_textBox722); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "textBox"


    // $ANTLR start "textBoxProperty"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:140:1: textBoxProperty : ( boxProperty | textProperty );
    public final void textBoxProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:141:2: ( boxProperty | textProperty )
            int alt17=2;
            int LA17_0 = input.LA(1);

            if ( (LA17_0==COLOR_AREA||LA17_0==EVENTTYPE||(LA17_0>=42 && LA17_0<=45)) ) {
                alt17=1;
            }
            else if ( (LA17_0==47) ) {
                alt17=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 17, 0, input);

                throw nvae;
            }
            switch (alt17) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:141:5: boxProperty
                    {
                    pushFollow(FOLLOW_boxProperty_in_textBoxProperty736);
                    boxProperty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:142:5: textProperty
                    {
                    pushFollow(FOLLOW_textProperty_in_textBoxProperty742);
                    textProperty();

                    state._fsp--;


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "textBoxProperty"


    // $ANTLR start "position"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:145:1: position : 'Position' ':' POSITION_KEYWORD ( ID | guiType ) ;
    public final void position() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:146:2: ( 'Position' ':' POSITION_KEYWORD ( ID | guiType ) )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:146:4: 'Position' ':' POSITION_KEYWORD ( ID | guiType )
            {
            match(input,42,FOLLOW_42_in_position753); 
            match(input,36,FOLLOW_36_in_position754); 
            match(input,POSITION_KEYWORD,FOLLOW_POSITION_KEYWORD_in_position755); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:146:34: ( ID | guiType )
            int alt18=2;
            int LA18_0 = input.LA(1);

            if ( (LA18_0==ID) ) {
                alt18=1;
            }
            else if ( ((LA18_0>=CIRCLE && LA18_0<=BOX)) ) {
                alt18=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;
            }
            switch (alt18) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:146:35: ID
                    {
                    match(input,ID,FOLLOW_ID_in_position758); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:146:40: guiType
                    {
                    pushFollow(FOLLOW_guiType_in_position762);
                    guiType();

                    state._fsp--;


                    }
                    break;

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "position"


    // $ANTLR start "point"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:149:1: point : 'StartPoint' ':' '(' number ',' number ')' ;
    public final void point() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:150:2: ( 'StartPoint' ':' '(' number ',' number ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:150:4: 'StartPoint' ':' '(' number ',' number ')'
            {
            match(input,43,FOLLOW_43_in_point775); 
            match(input,36,FOLLOW_36_in_point776); 
            match(input,37,FOLLOW_37_in_point778); 
            pushFollow(FOLLOW_number_in_point779);
            number();

            state._fsp--;

            match(input,41,FOLLOW_41_in_point781); 
            pushFollow(FOLLOW_number_in_point783);
            number();

            state._fsp--;

            match(input,38,FOLLOW_38_in_point785); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "point"


    // $ANTLR start "width"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:153:1: width : 'Width' ':' number ;
    public final void width() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:154:2: ( 'Width' ':' number )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:154:4: 'Width' ':' number
            {
            match(input,44,FOLLOW_44_in_width797); 
            match(input,36,FOLLOW_36_in_width799); 
            pushFollow(FOLLOW_number_in_width801);
            number();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "width"


    // $ANTLR start "height"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:157:1: height : 'Height' ':' number ;
    public final void height() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:158:2: ( 'Height' ':' number )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:158:4: 'Height' ':' number
            {
            match(input,45,FOLLOW_45_in_height813); 
            match(input,36,FOLLOW_36_in_height815); 
            pushFollow(FOLLOW_number_in_height817);
            number();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "height"


    // $ANTLR start "color"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:161:1: color : COLOR_AREA ':' '(' INTEGER ',' INTEGER ',' INTEGER ')' ;
    public final void color() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:162:2: ( COLOR_AREA ':' '(' INTEGER ',' INTEGER ',' INTEGER ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:162:5: COLOR_AREA ':' '(' INTEGER ',' INTEGER ',' INTEGER ')'
            {
            match(input,COLOR_AREA,FOLLOW_COLOR_AREA_in_color832); 
            match(input,36,FOLLOW_36_in_color834); 
            match(input,37,FOLLOW_37_in_color836); 
            match(input,INTEGER,FOLLOW_INTEGER_in_color838); 
            match(input,41,FOLLOW_41_in_color840); 
            match(input,INTEGER,FOLLOW_INTEGER_in_color841); 
            match(input,41,FOLLOW_41_in_color843); 
            match(input,INTEGER,FOLLOW_INTEGER_in_color845); 
            match(input,38,FOLLOW_38_in_color847); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "color"


    // $ANTLR start "radius"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:165:1: radius : 'R' ':' number ;
    public final void radius() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:166:2: ( 'R' ':' number )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:166:4: 'R' ':' number
            {
            match(input,46,FOLLOW_46_in_radius858); 
            match(input,36,FOLLOW_36_in_radius859); 
            pushFollow(FOLLOW_number_in_radius861);
            number();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "radius"


    // $ANTLR start "textProperty"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:169:1: textProperty : 'Text' ':' string ;
    public final void textProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:170:2: ( 'Text' ':' string )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:170:4: 'Text' ':' string
            {
            match(input,47,FOLLOW_47_in_textProperty874); 
            match(input,36,FOLLOW_36_in_textProperty876); 
            pushFollow(FOLLOW_string_in_textProperty878);
            string();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "textProperty"


    // $ANTLR start "event"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:173:1: event : EVENTTYPE '(' ')' ;
    public final void event() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:174:2: ( EVENTTYPE '(' ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:174:4: EVENTTYPE '(' ')'
            {
            match(input,EVENTTYPE,FOLLOW_EVENTTYPE_in_event892); 
            match(input,37,FOLLOW_37_in_event894); 
            match(input,38,FOLLOW_38_in_event900); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "event"


    // $ANTLR start "evntHandleStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:179:1: evntHandleStatement : ID '.' EVENTTYPE '(' ( statement | guiType )* ')' ';' ;
    public final void evntHandleStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:180:2: ( ID '.' EVENTTYPE '(' ( statement | guiType )* ')' ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:180:4: ID '.' EVENTTYPE '(' ( statement | guiType )* ')' ';'
            {
            match(input,ID,FOLLOW_ID_in_evntHandleStatement913); 
            match(input,48,FOLLOW_48_in_evntHandleStatement915); 
            match(input,EVENTTYPE,FOLLOW_EVENTTYPE_in_evntHandleStatement917); 
            match(input,37,FOLLOW_37_in_evntHandleStatement919); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:181:2: ( statement | guiType )*
            loop19:
            do {
                int alt19=3;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:181:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_evntHandleStatement924);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:181:16: guiType
            	    {
            	    pushFollow(FOLLOW_guiType_in_evntHandleStatement928);
            	    guiType();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,38,FOLLOW_38_in_evntHandleStatement934); 
            match(input,49,FOLLOW_49_in_evntHandleStatement936); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "evntHandleStatement"


    // $ANTLR start "parameters"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:207:1: parameters : type ':' term ( ',' type ':' term )* ;
    public final void parameters() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:208:2: ( type ':' term ( ',' type ':' term )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:208:4: type ':' term ( ',' type ':' term )*
            {
            pushFollow(FOLLOW_type_in_parameters954);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_parameters957); 
            pushFollow(FOLLOW_term_in_parameters959);
            term();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:208:19: ( ',' type ':' term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:208:21: ',' type ':' term
            	    {
            	    match(input,41,FOLLOW_41_in_parameters963); 
            	    pushFollow(FOLLOW_type_in_parameters965);
            	    type();

            	    state._fsp--;

            	    match(input,36,FOLLOW_36_in_parameters968); 
            	    pushFollow(FOLLOW_term_in_parameters970);
            	    term();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop20;
                }
            } while (true);


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "parameters"


    // $ANTLR start "assignmentStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:212:1: assignmentStatement returns [Node node] : ID ':=' expression ';' ;
    public final Node assignmentStatement() throws RecognitionException {
        Node node = null;

        Token ID2=null;
        Node expression3 = null;


        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:213:2: ( ID ':=' expression ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:213:4: ID ':=' expression ';'
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_assignmentStatement989); 
            match(input,50,FOLLOW_50_in_assignmentStatement991); 
            pushFollow(FOLLOW_expression_in_assignmentStatement993);
            expression3=expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_assignmentStatement995); 

            		Node idNode = new Node((ID2!=null?ID2.getText():null));   // Create a node for the identifier
            		Node equalsNode = new Node(":=");   // Create a node for the assignment symbol
            		
            		// Now add the identifier node and the node returned by the expression rule to the assignment symbol node
            		equalsNode.addChild(idNode);
            		
            		equalsNode.addChild(expression3);
            		
            		node = equalsNode;   // Return the assignment symbol node
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "assignmentStatement"


    // $ANTLR start "constantDecStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:226:1: constantDecStatement : 'constant' type ':' ID ':=' expression ';' ;
    public final void constantDecStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:228:2: ( 'constant' type ':' ID ':=' expression ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:228:4: 'constant' type ':' ID ':=' expression ';'
            {
            match(input,51,FOLLOW_51_in_constantDecStatement1011); 
            pushFollow(FOLLOW_type_in_constantDecStatement1013);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_constantDecStatement1015); 
            match(input,ID,FOLLOW_ID_in_constantDecStatement1017); 
            match(input,50,FOLLOW_50_in_constantDecStatement1020); 
            pushFollow(FOLLOW_expression_in_constantDecStatement1022);
            expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_constantDecStatement1024); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "constantDecStatement"


    // $ANTLR start "variableDecStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:1: variableDecStatement : 'var' type ':' ID ( ':=' expression )? ( ',' ID ( ':=' expression )? )* ';' ;
    public final void variableDecStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:2: ( 'var' type ':' ID ( ':=' expression )? ( ',' ID ( ':=' expression )? )* ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:4: 'var' type ':' ID ( ':=' expression )? ( ',' ID ( ':=' expression )? )* ';'
            {
            match(input,52,FOLLOW_52_in_variableDecStatement1036); 
            pushFollow(FOLLOW_type_in_variableDecStatement1038);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_variableDecStatement1040); 
            match(input,ID,FOLLOW_ID_in_variableDecStatement1042); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:22: ( ':=' expression )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:23: ':=' expression
                    {
                    match(input,50,FOLLOW_50_in_variableDecStatement1045); 
                    pushFollow(FOLLOW_expression_in_variableDecStatement1047);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:40: ( ',' ID ( ':=' expression )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:41: ',' ID ( ':=' expression )?
            	    {
            	    match(input,41,FOLLOW_41_in_variableDecStatement1051); 
            	    match(input,ID,FOLLOW_ID_in_variableDecStatement1052); 
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:47: ( ':=' expression )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==50) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:233:48: ':=' expression
            	            {
            	            match(input,50,FOLLOW_50_in_variableDecStatement1055); 
            	            pushFollow(FOLLOW_expression_in_variableDecStatement1057);
            	            expression();

            	            state._fsp--;


            	            }
            	            break;

            	    }


            	    }
            	    break;

            	default :
            	    break loop23;
                }
            } while (true);

            match(input,49,FOLLOW_49_in_variableDecStatement1065); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "variableDecStatement"


    // $ANTLR start "ifStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:236:1: ifStatement : 'if' expression 'do' ( statement )* ( 'elseif' expression 'do' ( statement )* )* ( 'else' ( statement )* )? 'end' 'if' ;
    public final void ifStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:237:2: ( 'if' expression 'do' ( statement )* ( 'elseif' expression 'do' ( statement )* )* ( 'else' ( statement )* )? 'end' 'if' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:237:4: 'if' expression 'do' ( statement )* ( 'elseif' expression 'do' ( statement )* )* ( 'else' ( statement )* )? 'end' 'if'
            {
            match(input,53,FOLLOW_53_in_ifStatement1077); 
            pushFollow(FOLLOW_expression_in_ifStatement1079);
            expression();

            state._fsp--;

            match(input,54,FOLLOW_54_in_ifStatement1081); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:238:7: ( statement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||(LA24_0>=51 && LA24_0<=53)||LA24_0==57) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:238:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement1090);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:239:4: ( 'elseif' expression 'do' ( statement )* )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==55) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:239:6: 'elseif' expression 'do' ( statement )*
            	    {
            	    match(input,55,FOLLOW_55_in_ifStatement1098); 
            	    pushFollow(FOLLOW_expression_in_ifStatement1100);
            	    expression();

            	    state._fsp--;

            	    match(input,54,FOLLOW_54_in_ifStatement1102); 
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:240:5: ( statement )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==ID||(LA25_0>=51 && LA25_0<=53)||LA25_0==57) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:240:5: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_ifStatement1109);
            	    	    statement();

            	    	    state._fsp--;


            	    	    }
            	    	    break;

            	    	default :
            	    	    break loop25;
            	        }
            	    } while (true);


            	    }
            	    break;

            	default :
            	    break loop26;
                }
            } while (true);

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:241:4: ( 'else' ( statement )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:241:6: 'else' ( statement )*
                    {
                    match(input,56,FOLLOW_56_in_ifStatement1119); 
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:242:5: ( statement )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==ID||(LA27_0>=51 && LA27_0<=53)||LA27_0==57) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:242:5: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement1128);
                    	    statement();

                    	    state._fsp--;


                    	    }
                    	    break;

                    	default :
                    	    break loop27;
                        }
                    } while (true);


                    }
                    break;

            }

            match(input,39,FOLLOW_39_in_ifStatement1136); 
            match(input,53,FOLLOW_53_in_ifStatement1138); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "ifStatement"


    // $ANTLR start "whileStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:246:1: whileStatement : 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' ;
    public final void whileStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:247:2: ( 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:247:4: 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop'
            {
            match(input,57,FOLLOW_57_in_whileStatement1150); 
            pushFollow(FOLLOW_expression_in_whileStatement1152);
            expression();

            state._fsp--;

            match(input,58,FOLLOW_58_in_whileStatement1154); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:248:4: ( statement | exitStatement )*
            loop29:
            do {
                int alt29=3;
                int LA29_0 = input.LA(1);

                if ( (LA29_0==ID||(LA29_0>=51 && LA29_0<=53)||LA29_0==57) ) {
                    alt29=1;
                }
                else if ( (LA29_0==59) ) {
                    alt29=2;
                }


                switch (alt29) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:248:6: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement1161);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:248:18: exitStatement
            	    {
            	    pushFollow(FOLLOW_exitStatement_in_whileStatement1165);
            	    exitStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_whileStatement1172); 
            match(input,58,FOLLOW_58_in_whileStatement1174); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "whileStatement"


    // $ANTLR start "procedureCallStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:253:1: procedureCallStatement : ID '(' ( actualParameters )? ')' ';' ;
    public final void procedureCallStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:254:2: ( ID '(' ( actualParameters )? ')' ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:254:4: ID '(' ( actualParameters )? ')' ';'
            {
            match(input,ID,FOLLOW_ID_in_procedureCallStatement1187); 
            match(input,37,FOLLOW_37_in_procedureCallStatement1189); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:254:11: ( actualParameters )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==NOT_OP||LA30_0==ID||LA30_0==INTEGER||LA30_0==37||LA30_0==68) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:254:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCallStatement1191);
                    actualParameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_procedureCallStatement1194); 
            match(input,49,FOLLOW_49_in_procedureCallStatement1196); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "procedureCallStatement"

    public static class actualParameters_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "actualParameters"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:257:1: actualParameters : expression ( ',' expression )* ;
    public final GuoliceParser.actualParameters_return actualParameters() throws RecognitionException {
        GuoliceParser.actualParameters_return retval = new GuoliceParser.actualParameters_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:258:2: ( expression ( ',' expression )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:258:4: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_actualParameters1207);
            expression();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:258:15: ( ',' expression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:258:16: ',' expression
            	    {
            	    match(input,41,FOLLOW_41_in_actualParameters1210); 
            	    pushFollow(FOLLOW_expression_in_actualParameters1212);
            	    expression();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop31;
                }
            } while (true);


            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "actualParameters"


    // $ANTLR start "exitStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:261:1: exitStatement : ( 'exit' 'when' expression ';' | 'exit' 'now' ';' );
    public final void exitStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:262:2: ( 'exit' 'when' expression ';' | 'exit' 'now' ';' )
            int alt32=2;
            int LA32_0 = input.LA(1);

            if ( (LA32_0==59) ) {
                int LA32_1 = input.LA(2);

                if ( (LA32_1==60) ) {
                    alt32=1;
                }
                else if ( (LA32_1==61) ) {
                    alt32=2;
                }
                else {
                    NoViableAltException nvae =
                        new NoViableAltException("", 32, 1, input);

                    throw nvae;
                }
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 32, 0, input);

                throw nvae;
            }
            switch (alt32) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:262:4: 'exit' 'when' expression ';'
                    {
                    match(input,59,FOLLOW_59_in_exitStatement1227); 
                    match(input,60,FOLLOW_60_in_exitStatement1228); 
                    pushFollow(FOLLOW_expression_in_exitStatement1230);
                    expression();

                    state._fsp--;

                    match(input,49,FOLLOW_49_in_exitStatement1232); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:263:4: 'exit' 'now' ';'
                    {
                    match(input,59,FOLLOW_59_in_exitStatement1237); 
                    match(input,61,FOLLOW_61_in_exitStatement1238); 
                    match(input,49,FOLLOW_49_in_exitStatement1239); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "exitStatement"


    // $ANTLR start "returnStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:268:1: returnStatement : 'return' expression ';' ;
    public final void returnStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:269:2: ( 'return' expression ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:269:4: 'return' expression ';'
            {
            match(input,62,FOLLOW_62_in_returnStatement1254); 
            pushFollow(FOLLOW_expression_in_returnStatement1256);
            expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_returnStatement1258); 

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "returnStatement"


    // $ANTLR start "term"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:272:1: term returns [Node node] : ( number | '(' expression ')' | ID | ID '(' ( actualParameters )? ')' | string );
    public final Node term() throws RecognitionException {
        Node node = null;

        Token ID6=null;
        Token ID8=null;
        Node number4 = null;

        Node expression5 = null;

        GuoliceParser.actualParameters_return actualParameters7 = null;

        GuoliceParser.string_return string9 = null;


         String nodeText = ""; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:274:2: ( number | '(' expression ')' | ID | ID '(' ( actualParameters )? ')' | string )
            int alt34=5;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:274:4: number
                    {
                    pushFollow(FOLLOW_number_in_term1279);
                    number4=number();

                    state._fsp--;

                     node = number4; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:275:4: '(' expression ')'
                    {
                    match(input,37,FOLLOW_37_in_term1286); 
                    pushFollow(FOLLOW_expression_in_term1288);
                    expression5=expression();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_term1290); 
                     node = expression5; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:276:4: ID
                    {
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_term1297); 
                     node = new Node((ID6!=null?ID6.getText():null)); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:277:4: ID '(' ( actualParameters )? ')'
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_term1304); 
                    match(input,37,FOLLOW_37_in_term1306); 
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:277:11: ( actualParameters )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==NOT_OP||LA33_0==ID||LA33_0==INTEGER||LA33_0==37||LA33_0==68) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:277:12: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_term1309);
                            actualParameters7=actualParameters();

                            state._fsp--;

                             nodeText = (actualParameters7!=null?input.toString(actualParameters7.start,actualParameters7.stop):null);

                            }
                            break;

                    }

                    match(input,38,FOLLOW_38_in_term1315); 

                    		node = new Node((ID8!=null?ID8.getText():null) + "(" + nodeText + ")");
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:281:4: string
                    {
                    pushFollow(FOLLOW_string_in_term1325);
                    string9=string();

                    state._fsp--;

                     node = new Node((string9!=null?input.toString(string9.start,string9.stop):null)); 

                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "term"


    // $ANTLR start "negation"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:288:1: negation returns [Node node] : ( NOT_OP )* term ;
    public final Node negation() throws RecognitionException {
        Node node = null;

        Node term10 = null;


         int numberOfNots = 0; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:290:2: ( ( NOT_OP )* term )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:290:4: ( NOT_OP )* term
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:290:4: ( NOT_OP )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==NOT_OP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:290:6: NOT_OP
            	    {
            	    match(input,NOT_OP,FOLLOW_NOT_OP_in_negation1356); 
            	     numberOfNots++; 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_negation1363);
            term10=term();

            state._fsp--;


            		Node returnNode = term10;
            		
            		for(int i = 0; i < numberOfNots; i++) {
            			Node notNode = new Node("NOT");
            			notNode.addChild(returnNode);
            			
            			returnNode = notNode;
            		}
            		
            		node = returnNode;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "negation"


    // $ANTLR start "sign"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:305:1: sign returns [Node node] : ( PLUS | MINUS )* negation ;
    public final Node sign() throws RecognitionException {
        Node node = null;

        Node negation11 = null;


         int minuses = 0; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:307:2: ( ( PLUS | MINUS )* negation )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:307:4: ( PLUS | MINUS )* negation
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:307:4: ( PLUS | MINUS )*
            loop36:
            do {
                int alt36=3;
                int LA36_0 = input.LA(1);

                if ( (LA36_0==PLUS) ) {
                    alt36=1;
                }
                else if ( (LA36_0==MINUS) ) {
                    alt36=2;
                }


                switch (alt36) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:307:6: PLUS
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_sign1388); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:307:13: MINUS
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_sign1392); 
            	     minuses++; 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            pushFollow(FOLLOW_negation_in_sign1398);
            negation11=negation();

            state._fsp--;


            		String sign = (minuses % 2 == 0)? "+" : "-";  // if number of minuses is even, the sign is +, otherwise the sign is -
            		node = new Node("" + sign + "" + negation11.getValue());
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "sign"


    // $ANTLR start "power"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:313:1: power returns [Node node] : s1= sign ( '^' s2= sign )* ;
    public final Node power() throws RecognitionException {
        Node node = null;

        Node s1 = null;

        Node s2 = null;


        boolean powerOpExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:317:2: (s1= sign ( '^' s2= sign )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:317:4: s1= sign ( '^' s2= sign )*
            {
            pushFollow(FOLLOW_sign_in_power1423);
            s1=sign();

            state._fsp--;

             temp = s1; 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:317:32: ( '^' s2= sign )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:317:33: '^' s2= sign
            	    {
            	    match(input,63,FOLLOW_63_in_power1427); 
            	    pushFollow(FOLLOW_sign_in_power1431);
            	    s2=sign();

            	    state._fsp--;


            	    		if(!powerOpExists) {
            	    			powerOpExists = true;
            	    		}
            	    		
            	    	 	Node powerOpNode = new Node("^"); 
            	    	 	
            	    	 	powerOpNode.addChild(temp);
            	    	 	
            	    		powerOpNode.addChild(s2);
            	    		
            	    		temp = powerOpNode;
            	    	

            	    }
            	    break;

            	default :
            	    break loop37;
                }
            } while (true);

             
            		node = temp; 
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "power"


    // $ANTLR start "multdiv"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:335:1: multdiv returns [Node node] : p1= power ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )* ;
    public final Node multdiv() throws RecognitionException {
        Node node = null;

        Node p1 = null;

        Node p2 = null;


        boolean multExists = false;
               boolean divExists = false;
               boolean moduloExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:341:2: (p1= power ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:341:4: p1= power ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )*
            {
            pushFollow(FOLLOW_power_in_multdiv1460);
            p1=power();

            state._fsp--;

             temp = p1; 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:341:33: ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )*
            loop38:
            do {
                int alt38=4;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:341:35: ( MULT p2= power )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:341:35: ( MULT p2= power )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:341:37: MULT p2= power
            	    {
            	    match(input,MULT,FOLLOW_MULT_in_multdiv1467); 
            	    pushFollow(FOLLOW_power_in_multdiv1471);
            	    p2=power();

            	    state._fsp--;


            	    		if(!multExists && !divExists && !moduloExists) {
            	    			multExists = true;
            	    		}
            	    		
            	    	 	Node multNode = new Node("*"); 
            	    	 	
            	    	 	multNode.addChild(temp);
            	    	 	
            	    		multNode.addChild(p2);
            	    		
            	    		temp = multNode;
            	    	

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:354:4: ( DIV p2= power )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:354:4: ( DIV p2= power )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:354:6: DIV p2= power
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_multdiv1480); 
            	    pushFollow(FOLLOW_power_in_multdiv1484);
            	    p2=power();

            	    state._fsp--;


            	    		if(!multExists && !divExists && !moduloExists) {
            	    			divExists = true;
            	    		}
            	    		
            	    	 	Node divNode = new Node("/"); 
            	    	 	
            	    	 	divNode.addChild(temp);
            	    	 	
            	    		divNode.addChild(p2);
            	    		
            	    		temp = divNode;
            	    	

            	    }


            	    }
            	    break;
            	case 3 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:367:4: ( MODULO p2= power )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:367:4: ( MODULO p2= power )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:367:6: MODULO p2= power
            	    {
            	    match(input,MODULO,FOLLOW_MODULO_in_multdiv1494); 
            	    pushFollow(FOLLOW_power_in_multdiv1498);
            	    p2=power();

            	    state._fsp--;


            	    		if(!multExists && !divExists && !moduloExists) {
            	    			moduloExists = true;
            	    		}
            	    		
            	    	 	Node moduloNode = new Node("mod"); 
            	    	 	
            	    	 	moduloNode.addChild(temp);
            	    	 	
            	    		moduloNode.addChild(p2);
            	    		
            	    		temp = moduloNode;
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop38;
                }
            } while (true);

             
            		node = temp; 
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "multdiv"


    // $ANTLR start "compare"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:385:1: compare returns [Node node] : a1= addsub ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )? ;
    public final Node compare() throws RecognitionException {
        Node node = null;

        Node a1 = null;

        Node a2 = null;


        boolean comparatorExists = false;
        	Node comparatorNode = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:2: (a1= addsub ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )? )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:4: a1= addsub ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )?
            {
            pushFollow(FOLLOW_addsub_in_compare1530);
            a1=addsub();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:14: ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )?
            int alt39=7;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:16: ( EQUALS a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:16: ( EQUALS a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:18: EQUALS a2= addsub
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_compare1536); 
                    pushFollow(FOLLOW_addsub_in_compare1540);
                    a2=addsub();

                    state._fsp--;


                    		comparatorNode = new Node("=");
                    		comparatorNode.addChild(a1);
                    		
                    		comparatorNode.addChild(a2);
                    		
                    		comparatorExists = true;
                    	

                    }


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:398:4: ( NOTEQUAL a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:398:4: ( NOTEQUAL a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:398:6: NOTEQUAL a2= addsub
                    {
                    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_compare1552); 
                    pushFollow(FOLLOW_addsub_in_compare1556);
                    a2=addsub();

                    state._fsp--;


                    		comparatorNode = new Node("/=");
                    		comparatorNode.addChild(a1);
                    		
                    		comparatorNode.addChild(a2);
                    		
                    		comparatorExists = true;
                    	

                    }


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:406:4: ( LESSTHAN a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:406:4: ( LESSTHAN a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:406:6: LESSTHAN a2= addsub
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_compare1567); 
                    pushFollow(FOLLOW_addsub_in_compare1571);
                    a2=addsub();

                    state._fsp--;


                    		comparatorNode = new Node("<");
                    		comparatorNode.addChild(a1);
                    		
                    		comparatorNode.addChild(a2);
                    		
                    		comparatorExists = true;
                    	

                    }


                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:414:4: ( LESSTHAN EQUALS a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:414:4: ( LESSTHAN EQUALS a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:414:6: LESSTHAN EQUALS a2= addsub
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_compare1581); 
                    match(input,EQUALS,FOLLOW_EQUALS_in_compare1583); 
                    pushFollow(FOLLOW_addsub_in_compare1587);
                    a2=addsub();

                    state._fsp--;


                    		comparatorNode = new Node("<=");
                    		comparatorNode.addChild(a1);
                    		
                    		comparatorNode.addChild(a2);
                    		
                    		comparatorExists = true;
                    	

                    }


                    }
                    break;
                case 5 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:422:4: ( GRTRTHAN a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:422:4: ( GRTRTHAN a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:422:6: GRTRTHAN a2= addsub
                    {
                    match(input,GRTRTHAN,FOLLOW_GRTRTHAN_in_compare1597); 
                    pushFollow(FOLLOW_addsub_in_compare1601);
                    a2=addsub();

                    state._fsp--;


                    		comparatorNode = new Node(">");
                    		comparatorNode.addChild(a1);
                    		
                    		comparatorNode.addChild(a2);
                    		
                    		comparatorExists = true;
                    	

                    }


                    }
                    break;
                case 6 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:430:4: ( GRTRTHAN EQUALS a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:430:4: ( GRTRTHAN EQUALS a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:430:6: GRTRTHAN EQUALS a2= addsub
                    {
                    match(input,GRTRTHAN,FOLLOW_GRTRTHAN_in_compare1611); 
                    match(input,EQUALS,FOLLOW_EQUALS_in_compare1613); 
                    pushFollow(FOLLOW_addsub_in_compare1617);
                    a2=addsub();

                    state._fsp--;


                    		comparatorNode = new Node(">=");
                    		comparatorNode.addChild(a1);
                    		
                    		comparatorNode.addChild(a2);
                    		
                    		comparatorExists = true;
                    	

                    }


                    }
                    break;

            }


            		if(comparatorExists) {
            			node = comparatorNode;
            		}
            		else node = a1;
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "compare"


    // $ANTLR start "expression"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:449:1: expression returns [Node node] : c1= compare ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )* ;
    public final Node expression() throws RecognitionException {
        Node node = null;

        Node c1 = null;

        Node c2 = null;


        boolean andExists = false;
               boolean orExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:454:2: (c1= compare ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:454:4: c1= compare ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )*
            {
            pushFollow(FOLLOW_compare_in_expression1654);
            c1=compare();

            state._fsp--;

             temp = c1; 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:454:35: ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )*
            loop40:
            do {
                int alt40=3;
                int LA40_0 = input.LA(1);

                if ( (LA40_0==AND_OP) ) {
                    alt40=1;
                }
                else if ( (LA40_0==OR_OP) ) {
                    alt40=2;
                }


                switch (alt40) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:454:37: ( AND_OP c2= compare )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:454:37: ( AND_OP c2= compare )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:454:39: AND_OP c2= compare
            	    {
            	    match(input,AND_OP,FOLLOW_AND_OP_in_expression1661); 
            	    pushFollow(FOLLOW_compare_in_expression1665);
            	    c2=compare();

            	    state._fsp--;


            	    		if(!andExists && !orExists) {
            	    			andExists = true;
            	    		}
            	    		
            	    	 	Node andNode = new Node("&&"); 
            	    	 	
            	    	 	andNode.addChild(temp);
            	    	 	
            	    		andNode.addChild(c2);
            	    		
            	    		temp = andNode;
            	    	 

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:468:4: ( OR_OP c2= compare )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:468:4: ( OR_OP c2= compare )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:468:6: OR_OP c2= compare
            	    {
            	    match(input,OR_OP,FOLLOW_OR_OP_in_expression1678); 
            	    pushFollow(FOLLOW_compare_in_expression1682);
            	    c2=compare();

            	    state._fsp--;


            	    		if(!andExists && !orExists) {
            	    			orExists = true;
            	    		}
            	    		
            	    	 	Node orNode = new Node("||"); 
            	    	 	
            	    	 	orNode.addChild(temp);
            	    	 	
            	    		orNode.addChild(c2);
            	    		
            	    		temp = orNode;
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop40;
                }
            } while (true);

             
            		node = temp; 
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "expression"


    // $ANTLR start "addsub"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:487:1: addsub returns [Node node] : m1= multdiv ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )* ;
    public final Node addsub() throws RecognitionException {
        Node node = null;

        Node m1 = null;

        Node m2 = null;


        boolean plusExists = false;
               boolean minusExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:492:2: (m1= multdiv ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:492:4: m1= multdiv ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )*
            {
            pushFollow(FOLLOW_multdiv_in_addsub1716);
            m1=multdiv();

            state._fsp--;

             temp = m1; 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:492:35: ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:492:37: ( PLUS m2= multdiv )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:492:37: ( PLUS m2= multdiv )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:492:39: PLUS m2= multdiv
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_addsub1723); 
            	    pushFollow(FOLLOW_multdiv_in_addsub1727);
            	    m2=multdiv();

            	    state._fsp--;


            	    		if(!plusExists && !minusExists) {
            	    			plusExists = true;
            	    		}
            	    		
            	    	 	Node plusNode = new Node("+"); 
            	    	 	
            	    	 	plusNode.addChild(temp);
            	    	 	
            	    		plusNode.addChild(m2);
            	    		
            	    		temp = plusNode;
            	    	

            	    }


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:505:4: ( MINUS m2= multdiv )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:505:4: ( MINUS m2= multdiv )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:505:6: MINUS m2= multdiv
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_addsub1737); 
            	    pushFollow(FOLLOW_multdiv_in_addsub1741);
            	    m2=multdiv();

            	    state._fsp--;


            	    		if(!plusExists && !minusExists) {
            	    			minusExists = true;
            	    		}
            	    		
            	    	 	Node minusNode = new Node("-"); 
            	    	 	
            	    	 	minusNode.addChild(temp);
            	    	 	
            	    		minusNode.addChild(m2);
            	    		
            	    		temp = minusNode;
            	    	

            	    }


            	    }
            	    break;

            	default :
            	    break loop41;
                }
            } while (true);

             
            		node = temp; 
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "addsub"


    // $ANTLR start "type"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:523:1: type : ( 'int' | 'float' | 'color' | 'string' );
    public final void type() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:524:2: ( 'int' | 'float' | 'color' | 'string' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:
            {
            if ( (input.LA(1)>=64 && input.LA(1)<=67) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return ;
    }
    // $ANTLR end "type"


    // $ANTLR start "number"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:530:1: number returns [Node node] : i1= INTEGER ( '.' i2= INTEGER )? ;
    public final Node number() throws RecognitionException {
        Node node = null;

        Token i1=null;
        Token i2=null;

         String text = ""; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:532:2: (i1= INTEGER ( '.' i2= INTEGER )? )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:532:4: i1= INTEGER ( '.' i2= INTEGER )?
            {
            i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1802); 
             text += (i1!=null?i1.getText():null); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:532:36: ( '.' i2= INTEGER )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:532:37: '.' i2= INTEGER
                    {
                    match(input,48,FOLLOW_48_in_number1806); 
                    i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1810); 
                     text += "." + (i2!=null?i2.getText():null); 

                    }
                    break;

            }


            		node = new Node(text);
            	

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return node;
    }
    // $ANTLR end "number"

    public static class string_return extends ParserRuleReturnScope {
    };

    // $ANTLR start "string"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:538:1: string : '\"' ~ ( '\"' | '\\n' | '\\r' ) '\"' ;
    public final GuoliceParser.string_return string() throws RecognitionException {
        GuoliceParser.string_return retval = new GuoliceParser.string_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:538:8: ( '\"' ~ ( '\"' | '\\n' | '\\r' ) '\"' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:538:10: '\"' ~ ( '\"' | '\\n' | '\\r' ) '\"'
            {
            match(input,68,FOLLOW_68_in_string1829); 
            if ( (input.LA(1)>=PLUS && input.LA(1)<=67) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,68,FOLLOW_68_in_string1849); 

            }

            retval.stop = input.LT(-1);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {
        }
        return retval;
    }
    // $ANTLR end "string"

    // Delegated rules


    protected DFA19 dfa19 = new DFA19(this);
    protected DFA34 dfa34 = new DFA34(this);
    protected DFA37 dfa37 = new DFA37(this);
    protected DFA38 dfa38 = new DFA38(this);
    protected DFA39 dfa39 = new DFA39(this);
    protected DFA41 dfa41 = new DFA41(this);
    protected DFA42 dfa42 = new DFA42(this);
    static final String DFA19_eotS =
        "\12\uffff";
    static final String DFA19_eofS =
        "\12\uffff";
    static final String DFA19_minS =
        "\1\26\11\uffff";
    static final String DFA19_maxS =
        "\1\71\11\uffff";
    static final String DFA19_acceptS =
        "\1\uffff\1\3\1\1\4\uffff\1\2\2\uffff";
    static final String DFA19_specialS =
        "\12\uffff}>";
    static final String[] DFA19_transitionS = {
            "\4\7\1\2\13\uffff\1\1\14\uffff\3\2\3\uffff\1\2",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA19_eot = DFA.unpackEncodedString(DFA19_eotS);
    static final short[] DFA19_eof = DFA.unpackEncodedString(DFA19_eofS);
    static final char[] DFA19_min = DFA.unpackEncodedStringToUnsignedChars(DFA19_minS);
    static final char[] DFA19_max = DFA.unpackEncodedStringToUnsignedChars(DFA19_maxS);
    static final short[] DFA19_accept = DFA.unpackEncodedString(DFA19_acceptS);
    static final short[] DFA19_special = DFA.unpackEncodedString(DFA19_specialS);
    static final short[][] DFA19_transition;

    static {
        int numStates = DFA19_transitionS.length;
        DFA19_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA19_transition[i] = DFA.unpackEncodedString(DFA19_transitionS[i]);
        }
    }

    class DFA19 extends DFA {

        public DFA19(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 19;
            this.eot = DFA19_eot;
            this.eof = DFA19_eof;
            this.min = DFA19_min;
            this.max = DFA19_max;
            this.accept = DFA19_accept;
            this.special = DFA19_special;
            this.transition = DFA19_transition;
        }
        public String getDescription() {
            return "()* loopback of 181:2: ( statement | guiType )*";
        }
    }
    static final String DFA34_eotS =
        "\27\uffff";
    static final String DFA34_eofS =
        "\27\uffff";
    static final String DFA34_minS =
        "\1\32\2\uffff\1\4\23\uffff";
    static final String DFA34_maxS =
        "\1\104\2\uffff\1\77\23\uffff";
    static final String DFA34_acceptS =
        "\1\uffff\1\1\1\2\1\uffff\1\5\1\4\1\3\20\uffff";
    static final String DFA34_specialS =
        "\27\uffff}>";
    static final String[] DFA34_transitionS = {
            "\1\3\2\uffff\1\1\7\uffff\1\2\36\uffff\1\4",
            "",
            "",
            "\5\6\5\uffff\2\6\1\uffff\4\6\20\uffff\1\5\1\6\2\uffff\1\6"+
            "\7\uffff\1\6\4\uffff\1\6\3\uffff\1\6\4\uffff\1\6",
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
            "",
            "",
            "",
            ""
    };

    static final short[] DFA34_eot = DFA.unpackEncodedString(DFA34_eotS);
    static final short[] DFA34_eof = DFA.unpackEncodedString(DFA34_eofS);
    static final char[] DFA34_min = DFA.unpackEncodedStringToUnsignedChars(DFA34_minS);
    static final char[] DFA34_max = DFA.unpackEncodedStringToUnsignedChars(DFA34_maxS);
    static final short[] DFA34_accept = DFA.unpackEncodedString(DFA34_acceptS);
    static final short[] DFA34_special = DFA.unpackEncodedString(DFA34_specialS);
    static final short[][] DFA34_transition;

    static {
        int numStates = DFA34_transitionS.length;
        DFA34_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA34_transition[i] = DFA.unpackEncodedString(DFA34_transitionS[i]);
        }
    }

    class DFA34 extends DFA {

        public DFA34(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 34;
            this.eot = DFA34_eot;
            this.eof = DFA34_eof;
            this.min = DFA34_min;
            this.max = DFA34_max;
            this.accept = DFA34_accept;
            this.special = DFA34_special;
            this.transition = DFA34_transition;
        }
        public String getDescription() {
            return "272:1: term returns [Node node] : ( number | '(' expression ')' | ID | ID '(' ( actualParameters )? ')' | string );";
        }
    }
    static final String DFA37_eotS =
        "\22\uffff";
    static final String DFA37_eofS =
        "\22\uffff";
    static final String DFA37_minS =
        "\1\4\21\uffff";
    static final String DFA37_maxS =
        "\1\77\21\uffff";
    static final String DFA37_acceptS =
        "\1\uffff\1\2\17\uffff\1\1";
    static final String DFA37_specialS =
        "\22\uffff}>";
    static final String[] DFA37_transitionS = {
            "\5\1\5\uffff\2\1\1\uffff\4\1\21\uffff\1\1\2\uffff\1\1\7\uffff"+
            "\1\1\4\uffff\1\1\3\uffff\1\1\4\uffff\1\21",
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
            "",
            ""
    };

    static final short[] DFA37_eot = DFA.unpackEncodedString(DFA37_eotS);
    static final short[] DFA37_eof = DFA.unpackEncodedString(DFA37_eofS);
    static final char[] DFA37_min = DFA.unpackEncodedStringToUnsignedChars(DFA37_minS);
    static final char[] DFA37_max = DFA.unpackEncodedStringToUnsignedChars(DFA37_maxS);
    static final short[] DFA37_accept = DFA.unpackEncodedString(DFA37_acceptS);
    static final short[] DFA37_special = DFA.unpackEncodedString(DFA37_specialS);
    static final short[][] DFA37_transition;

    static {
        int numStates = DFA37_transitionS.length;
        DFA37_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA37_transition[i] = DFA.unpackEncodedString(DFA37_transitionS[i]);
        }
    }

    class DFA37 extends DFA {

        public DFA37(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 37;
            this.eot = DFA37_eot;
            this.eof = DFA37_eof;
            this.min = DFA37_min;
            this.max = DFA37_max;
            this.accept = DFA37_accept;
            this.special = DFA37_special;
            this.transition = DFA37_transition;
        }
        public String getDescription() {
            return "()* loopback of 317:32: ( '^' s2= sign )*";
        }
    }
    static final String DFA38_eotS =
        "\21\uffff";
    static final String DFA38_eofS =
        "\21\uffff";
    static final String DFA38_minS =
        "\1\4\20\uffff";
    static final String DFA38_maxS =
        "\1\72\20\uffff";
    static final String DFA38_acceptS =
        "\1\uffff\1\4\14\uffff\1\1\1\2\1\3";
    static final String DFA38_specialS =
        "\21\uffff}>";
    static final String[] DFA38_transitionS = {
            "\2\1\1\16\1\17\1\1\5\uffff\2\1\1\uffff\3\1\1\20\21\uffff\1"+
            "\1\2\uffff\1\1\7\uffff\1\1\4\uffff\1\1\3\uffff\1\1",
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
            ""
    };

    static final short[] DFA38_eot = DFA.unpackEncodedString(DFA38_eotS);
    static final short[] DFA38_eof = DFA.unpackEncodedString(DFA38_eofS);
    static final char[] DFA38_min = DFA.unpackEncodedStringToUnsignedChars(DFA38_minS);
    static final char[] DFA38_max = DFA.unpackEncodedStringToUnsignedChars(DFA38_maxS);
    static final short[] DFA38_accept = DFA.unpackEncodedString(DFA38_acceptS);
    static final short[] DFA38_special = DFA.unpackEncodedString(DFA38_specialS);
    static final short[][] DFA38_transition;

    static {
        int numStates = DFA38_transitionS.length;
        DFA38_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA38_transition[i] = DFA.unpackEncodedString(DFA38_transitionS[i]);
        }
    }

    class DFA38 extends DFA {

        public DFA38(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 38;
            this.eot = DFA38_eot;
            this.eof = DFA38_eof;
            this.min = DFA38_min;
            this.max = DFA38_max;
            this.accept = DFA38_accept;
            this.special = DFA38_special;
            this.transition = DFA38_transition;
        }
        public String getDescription() {
            return "()* loopback of 341:33: ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )*";
        }
    }
    static final String DFA39_eotS =
        "\34\uffff";
    static final String DFA39_eofS =
        "\34\uffff";
    static final String DFA39_minS =
        "\1\10\2\uffff\2\4\27\uffff";
    static final String DFA39_maxS =
        "\1\72\2\uffff\2\104\27\uffff";
    static final String DFA39_acceptS =
        "\1\uffff\1\1\1\2\2\uffff\1\7\6\uffff\1\4\1\3\6\uffff\1\6\1\5\6"+
        "\uffff";
    static final String DFA39_specialS =
        "\34\uffff}>";
    static final String[] DFA39_transitionS = {
            "\1\1\5\uffff\1\3\1\4\1\uffff\1\2\2\5\22\uffff\1\5\2\uffff\1"+
            "\5\7\uffff\1\5\4\uffff\1\5\3\uffff\1\5",
            "",
            "",
            "\2\15\2\uffff\1\14\14\uffff\1\15\4\uffff\1\15\2\uffff\1\15"+
            "\7\uffff\1\15\36\uffff\1\15",
            "\2\25\2\uffff\1\24\14\uffff\1\25\4\uffff\1\25\2\uffff\1\25"+
            "\7\uffff\1\25\36\uffff\1\25",
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
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            ""
    };

    static final short[] DFA39_eot = DFA.unpackEncodedString(DFA39_eotS);
    static final short[] DFA39_eof = DFA.unpackEncodedString(DFA39_eofS);
    static final char[] DFA39_min = DFA.unpackEncodedStringToUnsignedChars(DFA39_minS);
    static final char[] DFA39_max = DFA.unpackEncodedStringToUnsignedChars(DFA39_maxS);
    static final short[] DFA39_accept = DFA.unpackEncodedString(DFA39_acceptS);
    static final short[] DFA39_special = DFA.unpackEncodedString(DFA39_specialS);
    static final short[][] DFA39_transition;

    static {
        int numStates = DFA39_transitionS.length;
        DFA39_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA39_transition[i] = DFA.unpackEncodedString(DFA39_transitionS[i]);
        }
    }

    class DFA39 extends DFA {

        public DFA39(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 39;
            this.eot = DFA39_eot;
            this.eof = DFA39_eof;
            this.min = DFA39_min;
            this.max = DFA39_max;
            this.accept = DFA39_accept;
            this.special = DFA39_special;
            this.transition = DFA39_transition;
        }
        public String getDescription() {
            return "389:14: ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )?";
        }
    }
    static final String DFA41_eotS =
        "\16\uffff";
    static final String DFA41_eofS =
        "\16\uffff";
    static final String DFA41_minS =
        "\1\4\15\uffff";
    static final String DFA41_maxS =
        "\1\72\15\uffff";
    static final String DFA41_acceptS =
        "\1\uffff\1\3\12\uffff\1\1\1\2";
    static final String DFA41_specialS =
        "\16\uffff}>";
    static final String[] DFA41_transitionS = {
            "\1\14\1\15\2\uffff\1\1\5\uffff\2\1\1\uffff\3\1\22\uffff\1\1"+
            "\2\uffff\1\1\7\uffff\1\1\4\uffff\1\1\3\uffff\1\1",
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
            ""
    };

    static final short[] DFA41_eot = DFA.unpackEncodedString(DFA41_eotS);
    static final short[] DFA41_eof = DFA.unpackEncodedString(DFA41_eofS);
    static final char[] DFA41_min = DFA.unpackEncodedStringToUnsignedChars(DFA41_minS);
    static final char[] DFA41_max = DFA.unpackEncodedStringToUnsignedChars(DFA41_maxS);
    static final short[] DFA41_accept = DFA.unpackEncodedString(DFA41_acceptS);
    static final short[] DFA41_special = DFA.unpackEncodedString(DFA41_specialS);
    static final short[][] DFA41_transition;

    static {
        int numStates = DFA41_transitionS.length;
        DFA41_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA41_transition[i] = DFA.unpackEncodedString(DFA41_transitionS[i]);
        }
    }

    class DFA41 extends DFA {

        public DFA41(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 41;
            this.eot = DFA41_eot;
            this.eof = DFA41_eof;
            this.min = DFA41_min;
            this.max = DFA41_max;
            this.accept = DFA41_accept;
            this.special = DFA41_special;
            this.transition = DFA41_transition;
        }
        public String getDescription() {
            return "()* loopback of 492:35: ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )*";
        }
    }
    static final String DFA42_eotS =
        "\23\uffff";
    static final String DFA42_eofS =
        "\23\uffff";
    static final String DFA42_minS =
        "\1\4\22\uffff";
    static final String DFA42_maxS =
        "\1\77\22\uffff";
    static final String DFA42_acceptS =
        "\1\uffff\1\1\1\2\20\uffff";
    static final String DFA42_specialS =
        "\23\uffff}>";
    static final String[] DFA42_transitionS = {
            "\5\2\5\uffff\2\2\1\uffff\4\2\21\uffff\1\2\2\uffff\1\2\6\uffff"+
            "\1\1\1\2\4\uffff\1\2\3\uffff\1\2\4\uffff\1\2",
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
            "",
            "",
            ""
    };

    static final short[] DFA42_eot = DFA.unpackEncodedString(DFA42_eotS);
    static final short[] DFA42_eof = DFA.unpackEncodedString(DFA42_eofS);
    static final char[] DFA42_min = DFA.unpackEncodedStringToUnsignedChars(DFA42_minS);
    static final char[] DFA42_max = DFA.unpackEncodedStringToUnsignedChars(DFA42_maxS);
    static final short[] DFA42_accept = DFA.unpackEncodedString(DFA42_acceptS);
    static final short[] DFA42_special = DFA.unpackEncodedString(DFA42_specialS);
    static final short[][] DFA42_transition;

    static {
        int numStates = DFA42_transitionS.length;
        DFA42_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA42_transition[i] = DFA.unpackEncodedString(DFA42_transitionS[i]);
        }
    }

    class DFA42 extends DFA {

        public DFA42(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 42;
            this.eot = DFA42_eot;
            this.eof = DFA42_eof;
            this.min = DFA42_min;
            this.max = DFA42_max;
            this.accept = DFA42_accept;
            this.special = DFA42_special;
            this.transition = DFA42_transition;
        }
        public String getDescription() {
            return "532:36: ( '.' i2= INTEGER )?";
        }
    }
 

    public static final BitSet FOLLOW_procedureDec_in_program344 = new BitSet(new long[]{0x0238010804000002L});
    public static final BitSet FOLLOW_functionDec_in_program348 = new BitSet(new long[]{0x0238010804000002L});
    public static final BitSet FOLLOW_statement_in_program352 = new BitSet(new long[]{0x0238010804000002L});
    public static final BitSet FOLLOW_35_in_procedureDec368 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_procedureDec370 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_procedureDec371 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_procedureDec374 = new BitSet(new long[]{0x0000004000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_parameters_in_procedureDec376 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureDec379 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_statement_in_procedureDec385 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_exitStatement_in_procedureDec389 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_39_in_procedureDec396 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedureDec398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_functionDec410 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_functionDec412 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_functionDec414 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_functionDec416 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionDec419 = new BitSet(new long[]{0x0000004000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_parameters_in_functionDec421 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_functionDec424 = new BitSet(new long[]{0x4238018804000000L});
    public static final BitSet FOLLOW_statement_in_functionDec433 = new BitSet(new long[]{0x4238018804000000L});
    public static final BitSet FOLLOW_returnStatement_in_functionDec437 = new BitSet(new long[]{0x4238018804000000L});
    public static final BitSet FOLLOW_39_in_functionDec444 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_functionDec446 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDecStatement_in_statement473 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDecStatement_in_statement479 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCallStatement_in_statement494 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evntHandleStatement_in_statement500 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_box_in_guiType511 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_circle_in_guiType517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textBox_in_guiType524 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_guiCommonProperty539 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_in_guiCommonProperty544 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_in_guiCommonProperty549 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_in_guiCommonProperty554 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_box567 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_box569 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_box571 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_box573 = new BitSet(new long[]{0x00003C4050000000L});
    public static final BitSet FOLLOW_boxProperty_in_box580 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_box583 = new BitSet(new long[]{0x00003C0050000000L});
    public static final BitSet FOLLOW_boxProperty_in_box584 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_box591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_guiCommonProperty_in_boxProperty602 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_width_in_boxProperty607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_height_in_boxProperty612 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_circle626 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_circle628 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_circle629 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_circle632 = new BitSet(new long[]{0x00004C4050000000L});
    public static final BitSet FOLLOW_circleProperty_in_circle640 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_circle643 = new BitSet(new long[]{0x00004C0050000000L});
    public static final BitSet FOLLOW_circleProperty_in_circle644 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_circle656 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_guiCommonProperty_in_circleProperty668 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_circleProperty673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_textBox684 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_textBox692 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_textBox694 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_textBox696 = new BitSet(new long[]{0x0000BC4050000000L});
    public static final BitSet FOLLOW_textBoxProperty_in_textBox710 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_textBox713 = new BitSet(new long[]{0x0000BC0050000000L});
    public static final BitSet FOLLOW_textBoxProperty_in_textBox715 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_textBox722 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boxProperty_in_textBoxProperty736 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProperty_in_textBoxProperty742 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_position753 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_position754 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_POSITION_KEYWORD_in_position755 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_ID_in_position758 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_guiType_in_position762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_point775 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_point776 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_point778 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_point779 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_point781 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_point783 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_point785 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_width797 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_width799 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_width801 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_height813 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_height815 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_height817 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_AREA_in_color832 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_color834 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_color836 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_color838 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_color840 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_color841 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_color843 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_color845 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_color847 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_radius858 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_radius859 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_radius861 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_textProperty874 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_textProperty876 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_string_in_textProperty878 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENTTYPE_in_event892 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_event894 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_event900 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_evntHandleStatement913 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_evntHandleStatement915 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EVENTTYPE_in_evntHandleStatement917 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_evntHandleStatement919 = new BitSet(new long[]{0x0238014807C00000L});
    public static final BitSet FOLLOW_statement_in_evntHandleStatement924 = new BitSet(new long[]{0x0238014807C00000L});
    public static final BitSet FOLLOW_guiType_in_evntHandleStatement928 = new BitSet(new long[]{0x0238014807C00000L});
    public static final BitSet FOLLOW_38_in_evntHandleStatement934 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_evntHandleStatement936 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameters954 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parameters957 = new BitSet(new long[]{0x0000002024000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_parameters959 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_parameters963 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_parameters965 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parameters968 = new BitSet(new long[]{0x0000002024000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_parameters970 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStatement989 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_assignmentStatement991 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement993 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_assignmentStatement995 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_constantDecStatement1011 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_constantDecStatement1013 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_constantDecStatement1015 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_constantDecStatement1017 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_constantDecStatement1020 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_constantDecStatement1022 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_constantDecStatement1024 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_variableDecStatement1036 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_variableDecStatement1038 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_variableDecStatement1040 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_variableDecStatement1042 = new BitSet(new long[]{0x0006020000000000L});
    public static final BitSet FOLLOW_50_in_variableDecStatement1045 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_variableDecStatement1047 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_41_in_variableDecStatement1051 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_variableDecStatement1052 = new BitSet(new long[]{0x0006020000000000L});
    public static final BitSet FOLLOW_50_in_variableDecStatement1055 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_variableDecStatement1057 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_49_in_variableDecStatement1065 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ifStatement1077 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_ifStatement1079 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifStatement1081 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1090 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_55_in_ifStatement1098 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_ifStatement1100 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifStatement1102 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1109 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_56_in_ifStatement1119 = new BitSet(new long[]{0x0238018804000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1128 = new BitSet(new long[]{0x0238018804000000L});
    public static final BitSet FOLLOW_39_in_ifStatement1136 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ifStatement1138 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_whileStatement1150 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_whileStatement1152 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_whileStatement1154 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement1161 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_exitStatement_in_whileStatement1165 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_39_in_whileStatement1172 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_whileStatement1174 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCallStatement1187 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_procedureCallStatement1189 = new BitSet(new long[]{0x0000006024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCallStatement1191 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureCallStatement1194 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureCallStatement1196 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_actualParameters1207 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_actualParameters1210 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_actualParameters1212 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_59_in_exitStatement1227 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_exitStatement1228 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_exitStatement1230 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exitStatement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_exitStatement1237 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exitStatement1238 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exitStatement1239 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_returnStatement1254 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_returnStatement1256 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_returnStatement1258 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term1279 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_term1286 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_term1288 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_term1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1297 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1304 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_term1306 = new BitSet(new long[]{0x0000006024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualParameters_in_term1309 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_term1315 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term1325 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_OP_in_negation1356 = new BitSet(new long[]{0x0000002024200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_negation1363 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_sign1388 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_sign1392 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_negation_in_sign1398 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_power1423 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_power1427 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_sign_in_power1431 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_power_in_multdiv1460 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_MULT_in_multdiv1467 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_power_in_multdiv1471 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_DIV_in_multdiv1480 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_power_in_multdiv1484 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_MODULO_in_multdiv1494 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_power_in_multdiv1498 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_addsub_in_compare1530 = new BitSet(new long[]{0x000000000002C102L});
    public static final BitSet FOLLOW_EQUALS_in_compare1536 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1540 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_compare1552 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_compare1567 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1571 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_compare1581 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_compare1583 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1587 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRTRTHAN_in_compare1597 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1601 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRTRTHAN_in_compare1611 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_compare1613 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1617 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_expression1654 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_AND_OP_in_expression1661 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_compare_in_expression1665 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_OR_OP_in_expression1678 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_compare_in_expression1682 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_multdiv_in_addsub1716 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_PLUS_in_addsub1723 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_multdiv_in_addsub1727 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_MINUS_in_addsub1737 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_multdiv_in_addsub1741 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1802 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_number1806 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_number1810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_string1829 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_string1835 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_string1849 = new BitSet(new long[]{0x0000000000000002L});

}