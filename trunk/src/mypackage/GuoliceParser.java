// $ANTLR 3.2 Sep 23, 2009 12:02:23 C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g 2010-11-05 21:14:47

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


    Node root = null;



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

              System.out.println("HELLO"); 
            	

            }

             System.out.println(root.toString());  
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:67:1: procedureDec : 'procedure' ':' ID '(' ( parameters )? ')' ( statement | exitStatement )* 'end' 'procedure' ;
    public final void procedureDec() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:2: ( 'procedure' ':' ID '(' ( parameters )? ')' ( statement | exitStatement )* 'end' 'procedure' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:4: 'procedure' ':' ID '(' ( parameters )? ')' ( statement | exitStatement )* 'end' 'procedure'
            {
            match(input,35,FOLLOW_35_in_procedureDec370); 
            match(input,36,FOLLOW_36_in_procedureDec372); 
            match(input,ID,FOLLOW_ID_in_procedureDec373); 
            match(input,37,FOLLOW_37_in_procedureDec376); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:27: ( parameters )?
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( ((LA2_0>=64 && LA2_0<=67)) ) {
                alt2=1;
            }
            switch (alt2) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:68:27: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_procedureDec378);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_procedureDec381); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:69:3: ( statement | exitStatement )*
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:69:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_procedureDec387);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:69:17: exitStatement
            	    {
            	    pushFollow(FOLLOW_exitStatement_in_procedureDec391);
            	    exitStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_procedureDec398); 
            match(input,35,FOLLOW_35_in_procedureDec400); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:73:1: functionDec : 'function' type ':' ID '(' ( parameters )? ')' ( statement | returnStatement )* 'end' 'function' ;
    public final void functionDec() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:75:2: ( 'function' type ':' ID '(' ( parameters )? ')' ( statement | returnStatement )* 'end' 'function' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:75:4: 'function' type ':' ID '(' ( parameters )? ')' ( statement | returnStatement )* 'end' 'function'
            {
            match(input,40,FOLLOW_40_in_functionDec412); 
            pushFollow(FOLLOW_type_in_functionDec414);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_functionDec416); 
            match(input,ID,FOLLOW_ID_in_functionDec418); 
            match(input,37,FOLLOW_37_in_functionDec421); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:75:32: ( parameters )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( ((LA4_0>=64 && LA4_0<=67)) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:75:32: parameters
                    {
                    pushFollow(FOLLOW_parameters_in_functionDec423);
                    parameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_functionDec426); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:77:3: ( statement | returnStatement )*
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:77:5: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_functionDec435);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:77:17: returnStatement
            	    {
            	    pushFollow(FOLLOW_returnStatement_in_functionDec439);
            	    returnStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_functionDec446); 
            match(input,40,FOLLOW_40_in_functionDec448); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:81:1: statement : ( assignmentStatement | constantDecStatement | variableDecStatement | ifStatement | whileStatement | procedureCallStatement | evntHabdleStatement );
    public final void statement() throws RecognitionException {
        Node assignmentStatement1 = null;


        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:82:2: ( assignmentStatement | constantDecStatement | variableDecStatement | ifStatement | whileStatement | procedureCallStatement | evntHabdleStatement )
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
                    pushFollow(FOLLOW_assignmentStatement_in_statement459);
                    assignmentStatement1=assignmentStatement();

                    state._fsp--;

                     System.out.println("assignment: " + assignmentStatement1.toString());
                    	root.addChild(assignmentStatement1); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:84:4: constantDecStatement
                    {
                    pushFollow(FOLLOW_constantDecStatement_in_statement466);
                    constantDecStatement();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:85:4: variableDecStatement
                    {
                    pushFollow(FOLLOW_variableDecStatement_in_statement472);
                    variableDecStatement();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:86:4: ifStatement
                    {
                    pushFollow(FOLLOW_ifStatement_in_statement477);
                    ifStatement();

                    state._fsp--;


                    }
                    break;
                case 5 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:87:4: whileStatement
                    {
                    pushFollow(FOLLOW_whileStatement_in_statement482);
                    whileStatement();

                    state._fsp--;


                    }
                    break;
                case 6 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:88:4: procedureCallStatement
                    {
                    pushFollow(FOLLOW_procedureCallStatement_in_statement487);
                    procedureCallStatement();

                    state._fsp--;


                    }
                    break;
                case 7 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:90:4: evntHabdleStatement
                    {
                    pushFollow(FOLLOW_evntHabdleStatement_in_statement493);
                    evntHabdleStatement();

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
    // $ANTLR end "statement"


    // $ANTLR start "guiType"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:93:1: guiType : ( box | circle | textBox );
    public final void guiType() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:94:2: ( box | circle | textBox )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:94:4: box
                    {
                    pushFollow(FOLLOW_box_in_guiType504);
                    box();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:95:4: circle
                    {
                    pushFollow(FOLLOW_circle_in_guiType510);
                    circle();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:97:4: textBox
                    {
                    pushFollow(FOLLOW_textBox_in_guiType517);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:102:1: guiCommonProperty : ( position | point | color | event );
    public final void guiCommonProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:103:2: ( position | point | color | event )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:103:4: position
                    {
                    pushFollow(FOLLOW_position_in_guiCommonProperty532);
                    position();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:104:4: point
                    {
                    pushFollow(FOLLOW_point_in_guiCommonProperty537);
                    point();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:105:4: color
                    {
                    pushFollow(FOLLOW_color_in_guiCommonProperty542);
                    color();

                    state._fsp--;


                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:106:4: event
                    {
                    pushFollow(FOLLOW_event_in_guiCommonProperty547);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:109:1: box : BOX ':' ID '(' ( boxProperty ( ',' boxProperty )* )? ')' ;
    public final void box() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:110:2: ( BOX ':' ID '(' ( boxProperty ( ',' boxProperty )* )? ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:110:4: BOX ':' ID '(' ( boxProperty ( ',' boxProperty )* )? ')'
            {
            match(input,BOX,FOLLOW_BOX_in_box560); 
            match(input,36,FOLLOW_36_in_box562); 
            match(input,ID,FOLLOW_ID_in_box564); 
            match(input,37,FOLLOW_37_in_box566); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:111:5: ( boxProperty ( ',' boxProperty )* )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==COLOR_AREA||LA10_0==EVENTTYPE||(LA10_0>=42 && LA10_0<=45)) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:111:6: boxProperty ( ',' boxProperty )*
                    {
                    pushFollow(FOLLOW_boxProperty_in_box573);
                    boxProperty();

                    state._fsp--;

                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:111:18: ( ',' boxProperty )*
                    loop9:
                    do {
                        int alt9=2;
                        int LA9_0 = input.LA(1);

                        if ( (LA9_0==41) ) {
                            alt9=1;
                        }


                        switch (alt9) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:111:19: ',' boxProperty
                    	    {
                    	    match(input,41,FOLLOW_41_in_box576); 
                    	    pushFollow(FOLLOW_boxProperty_in_box577);
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

            match(input,38,FOLLOW_38_in_box584); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:115:1: boxProperty : ( guiCommonProperty | width | height );
    public final void boxProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:116:2: ( guiCommonProperty | width | height )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:116:4: guiCommonProperty
                    {
                    pushFollow(FOLLOW_guiCommonProperty_in_boxProperty595);
                    guiCommonProperty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:117:4: width
                    {
                    pushFollow(FOLLOW_width_in_boxProperty600);
                    width();

                    state._fsp--;


                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:118:4: height
                    {
                    pushFollow(FOLLOW_height_in_boxProperty605);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:122:1: circle : CIRCLE ':' ID '(' ( circleProperty ( ',' circleProperty )* )? ')' ;
    public final void circle() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:123:2: ( CIRCLE ':' ID '(' ( circleProperty ( ',' circleProperty )* )? ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:123:4: CIRCLE ':' ID '(' ( circleProperty ( ',' circleProperty )* )? ')'
            {
            match(input,CIRCLE,FOLLOW_CIRCLE_in_circle619); 
            match(input,36,FOLLOW_36_in_circle621); 
            match(input,ID,FOLLOW_ID_in_circle622); 
            match(input,37,FOLLOW_37_in_circle625); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:124:5: ( circleProperty ( ',' circleProperty )* )?
            int alt13=2;
            int LA13_0 = input.LA(1);

            if ( (LA13_0==COLOR_AREA||LA13_0==EVENTTYPE||(LA13_0>=42 && LA13_0<=43)||LA13_0==46) ) {
                alt13=1;
            }
            switch (alt13) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:124:6: circleProperty ( ',' circleProperty )*
                    {
                    pushFollow(FOLLOW_circleProperty_in_circle633);
                    circleProperty();

                    state._fsp--;

                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:124:21: ( ',' circleProperty )*
                    loop12:
                    do {
                        int alt12=2;
                        int LA12_0 = input.LA(1);

                        if ( (LA12_0==41) ) {
                            alt12=1;
                        }


                        switch (alt12) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:124:22: ',' circleProperty
                    	    {
                    	    match(input,41,FOLLOW_41_in_circle636); 
                    	    pushFollow(FOLLOW_circleProperty_in_circle637);
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

            match(input,38,FOLLOW_38_in_circle649); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:128:1: circleProperty : ( guiCommonProperty | radius );
    public final void circleProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:129:2: ( guiCommonProperty | radius )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:129:4: guiCommonProperty
                    {
                    pushFollow(FOLLOW_guiCommonProperty_in_circleProperty661);
                    guiCommonProperty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:130:4: radius
                    {
                    pushFollow(FOLLOW_radius_in_circleProperty666);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:133:1: textBox : ( TEXTBOX | BUTTON ) ':' ID '(' ( textBoxProperty ( ',' textBoxProperty )* )? ')' ;
    public final void textBox() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:134:2: ( ( TEXTBOX | BUTTON ) ':' ID '(' ( textBoxProperty ( ',' textBoxProperty )* )? ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:134:4: ( TEXTBOX | BUTTON ) ':' ID '(' ( textBoxProperty ( ',' textBoxProperty )* )? ')'
            {
            if ( (input.LA(1)>=TEXTBOX && input.LA(1)<=BUTTON) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,36,FOLLOW_36_in_textBox685); 
            match(input,ID,FOLLOW_ID_in_textBox687); 
            match(input,37,FOLLOW_37_in_textBox689); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:135:5: ( textBoxProperty ( ',' textBoxProperty )* )?
            int alt16=2;
            int LA16_0 = input.LA(1);

            if ( (LA16_0==COLOR_AREA||LA16_0==EVENTTYPE||(LA16_0>=42 && LA16_0<=45)||LA16_0==47) ) {
                alt16=1;
            }
            switch (alt16) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:135:6: textBoxProperty ( ',' textBoxProperty )*
                    {
                    pushFollow(FOLLOW_textBoxProperty_in_textBox703);
                    textBoxProperty();

                    state._fsp--;

                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:135:22: ( ',' textBoxProperty )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( (LA15_0==41) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:135:23: ',' textBoxProperty
                    	    {
                    	    match(input,41,FOLLOW_41_in_textBox706); 
                    	    pushFollow(FOLLOW_textBoxProperty_in_textBox708);
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

            match(input,38,FOLLOW_38_in_textBox715); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:139:1: textBoxProperty : ( boxProperty | textProperty );
    public final void textBoxProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:140:2: ( boxProperty | textProperty )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:140:5: boxProperty
                    {
                    pushFollow(FOLLOW_boxProperty_in_textBoxProperty729);
                    boxProperty();

                    state._fsp--;


                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:141:5: textProperty
                    {
                    pushFollow(FOLLOW_textProperty_in_textBoxProperty735);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:144:1: position : 'Position' ':' POSITION_KEYWORD ( ID | guiType ) ;
    public final void position() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:145:2: ( 'Position' ':' POSITION_KEYWORD ( ID | guiType ) )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:145:4: 'Position' ':' POSITION_KEYWORD ( ID | guiType )
            {
            match(input,42,FOLLOW_42_in_position746); 
            match(input,36,FOLLOW_36_in_position747); 
            match(input,POSITION_KEYWORD,FOLLOW_POSITION_KEYWORD_in_position748); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:145:34: ( ID | guiType )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:145:35: ID
                    {
                    match(input,ID,FOLLOW_ID_in_position751); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:145:40: guiType
                    {
                    pushFollow(FOLLOW_guiType_in_position755);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:148:1: point : 'StartPoint' ':' '(' number ',' number ')' ;
    public final void point() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:149:2: ( 'StartPoint' ':' '(' number ',' number ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:149:4: 'StartPoint' ':' '(' number ',' number ')'
            {
            match(input,43,FOLLOW_43_in_point768); 
            match(input,36,FOLLOW_36_in_point769); 
            match(input,37,FOLLOW_37_in_point771); 
            pushFollow(FOLLOW_number_in_point772);
            number();

            state._fsp--;

            match(input,41,FOLLOW_41_in_point774); 
            pushFollow(FOLLOW_number_in_point776);
            number();

            state._fsp--;

            match(input,38,FOLLOW_38_in_point778); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:152:1: width : 'Width' ':' number ;
    public final void width() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:153:2: ( 'Width' ':' number )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:153:4: 'Width' ':' number
            {
            match(input,44,FOLLOW_44_in_width790); 
            match(input,36,FOLLOW_36_in_width792); 
            pushFollow(FOLLOW_number_in_width794);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:156:1: height : 'Height' ':' number ;
    public final void height() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:157:2: ( 'Height' ':' number )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:157:4: 'Height' ':' number
            {
            match(input,45,FOLLOW_45_in_height806); 
            match(input,36,FOLLOW_36_in_height808); 
            pushFollow(FOLLOW_number_in_height810);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:160:1: color : COLOR_AREA ':' '(' INTEGER ',' INTEGER ',' INTEGER ')' ;
    public final void color() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:161:2: ( COLOR_AREA ':' '(' INTEGER ',' INTEGER ',' INTEGER ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:161:5: COLOR_AREA ':' '(' INTEGER ',' INTEGER ',' INTEGER ')'
            {
            match(input,COLOR_AREA,FOLLOW_COLOR_AREA_in_color825); 
            match(input,36,FOLLOW_36_in_color827); 
            match(input,37,FOLLOW_37_in_color829); 
            match(input,INTEGER,FOLLOW_INTEGER_in_color831); 
            match(input,41,FOLLOW_41_in_color833); 
            match(input,INTEGER,FOLLOW_INTEGER_in_color834); 
            match(input,41,FOLLOW_41_in_color836); 
            match(input,INTEGER,FOLLOW_INTEGER_in_color838); 
            match(input,38,FOLLOW_38_in_color840); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:164:1: radius : 'R' ':' number ;
    public final void radius() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:165:2: ( 'R' ':' number )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:165:4: 'R' ':' number
            {
            match(input,46,FOLLOW_46_in_radius851); 
            match(input,36,FOLLOW_36_in_radius852); 
            pushFollow(FOLLOW_number_in_radius854);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:168:1: textProperty : 'Text' ':' string ;
    public final void textProperty() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:169:2: ( 'Text' ':' string )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:169:4: 'Text' ':' string
            {
            match(input,47,FOLLOW_47_in_textProperty867); 
            match(input,36,FOLLOW_36_in_textProperty869); 
            pushFollow(FOLLOW_string_in_textProperty871);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:172:1: event : EVENTTYPE '(' ')' ;
    public final void event() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:173:2: ( EVENTTYPE '(' ')' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:173:4: EVENTTYPE '(' ')'
            {
            match(input,EVENTTYPE,FOLLOW_EVENTTYPE_in_event885); 
            match(input,37,FOLLOW_37_in_event887); 
            match(input,38,FOLLOW_38_in_event893); 

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


    // $ANTLR start "evntHabdleStatement"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:178:1: evntHabdleStatement : ID '.' EVENTTYPE '(' ( statement | guiType )* ')' ';' ;
    public final void evntHabdleStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:179:2: ( ID '.' EVENTTYPE '(' ( statement | guiType )* ')' ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:179:4: ID '.' EVENTTYPE '(' ( statement | guiType )* ')' ';'
            {
            match(input,ID,FOLLOW_ID_in_evntHabdleStatement906); 
            match(input,48,FOLLOW_48_in_evntHabdleStatement908); 
            match(input,EVENTTYPE,FOLLOW_EVENTTYPE_in_evntHabdleStatement910); 
            match(input,37,FOLLOW_37_in_evntHabdleStatement912); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:180:2: ( statement | guiType )*
            loop19:
            do {
                int alt19=3;
                alt19 = dfa19.predict(input);
                switch (alt19) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:180:4: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_evntHabdleStatement917);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:180:16: guiType
            	    {
            	    pushFollow(FOLLOW_guiType_in_evntHabdleStatement921);
            	    guiType();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);

            match(input,38,FOLLOW_38_in_evntHabdleStatement927); 
            match(input,49,FOLLOW_49_in_evntHabdleStatement929); 

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
    // $ANTLR end "evntHabdleStatement"


    // $ANTLR start "parameters"
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:206:1: parameters : type ':' term ( ',' type ':' term )* ;
    public final void parameters() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:207:2: ( type ':' term ( ',' type ':' term )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:207:4: type ':' term ( ',' type ':' term )*
            {
            pushFollow(FOLLOW_type_in_parameters947);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_parameters950); 
            pushFollow(FOLLOW_term_in_parameters952);
            term();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:207:19: ( ',' type ':' term )*
            loop20:
            do {
                int alt20=2;
                int LA20_0 = input.LA(1);

                if ( (LA20_0==41) ) {
                    alt20=1;
                }


                switch (alt20) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:207:21: ',' type ':' term
            	    {
            	    match(input,41,FOLLOW_41_in_parameters956); 
            	    pushFollow(FOLLOW_type_in_parameters958);
            	    type();

            	    state._fsp--;

            	    match(input,36,FOLLOW_36_in_parameters961); 
            	    pushFollow(FOLLOW_term_in_parameters963);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:211:1: assignmentStatement returns [Node node] : ID ':=' expression ';' ;
    public final Node assignmentStatement() throws RecognitionException {
        Node node = null;

        Token ID2=null;
        Node expression3 = null;


        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:212:2: ( ID ':=' expression ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:212:4: ID ':=' expression ';'
            {
            ID2=(Token)match(input,ID,FOLLOW_ID_in_assignmentStatement982); 
            match(input,50,FOLLOW_50_in_assignmentStatement984); 
            pushFollow(FOLLOW_expression_in_assignmentStatement986);
            expression3=expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_assignmentStatement988); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:224:1: constantDecStatement : 'constant' type ':' ID ':=' expression ';' ;
    public final void constantDecStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:226:2: ( 'constant' type ':' ID ':=' expression ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:226:4: 'constant' type ':' ID ':=' expression ';'
            {
            match(input,51,FOLLOW_51_in_constantDecStatement1004); 
            pushFollow(FOLLOW_type_in_constantDecStatement1006);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_constantDecStatement1008); 
            match(input,ID,FOLLOW_ID_in_constantDecStatement1010); 
            match(input,50,FOLLOW_50_in_constantDecStatement1013); 
            pushFollow(FOLLOW_expression_in_constantDecStatement1015);
            expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_constantDecStatement1017); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:229:1: variableDecStatement : 'var' type ':' ID ( ':=' expression )? ( ',' ID ( ':=' expression )? )* ';' ;
    public final void variableDecStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:2: ( 'var' type ':' ID ( ':=' expression )? ( ',' ID ( ':=' expression )? )* ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:4: 'var' type ':' ID ( ':=' expression )? ( ',' ID ( ':=' expression )? )* ';'
            {
            match(input,52,FOLLOW_52_in_variableDecStatement1029); 
            pushFollow(FOLLOW_type_in_variableDecStatement1031);
            type();

            state._fsp--;

            match(input,36,FOLLOW_36_in_variableDecStatement1033); 
            match(input,ID,FOLLOW_ID_in_variableDecStatement1035); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:22: ( ':=' expression )?
            int alt21=2;
            int LA21_0 = input.LA(1);

            if ( (LA21_0==50) ) {
                alt21=1;
            }
            switch (alt21) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:23: ':=' expression
                    {
                    match(input,50,FOLLOW_50_in_variableDecStatement1038); 
                    pushFollow(FOLLOW_expression_in_variableDecStatement1040);
                    expression();

                    state._fsp--;


                    }
                    break;

            }

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:40: ( ',' ID ( ':=' expression )? )*
            loop23:
            do {
                int alt23=2;
                int LA23_0 = input.LA(1);

                if ( (LA23_0==41) ) {
                    alt23=1;
                }


                switch (alt23) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:41: ',' ID ( ':=' expression )?
            	    {
            	    match(input,41,FOLLOW_41_in_variableDecStatement1044); 
            	    match(input,ID,FOLLOW_ID_in_variableDecStatement1045); 
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:47: ( ':=' expression )?
            	    int alt22=2;
            	    int LA22_0 = input.LA(1);

            	    if ( (LA22_0==50) ) {
            	        alt22=1;
            	    }
            	    switch (alt22) {
            	        case 1 :
            	            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:231:48: ':=' expression
            	            {
            	            match(input,50,FOLLOW_50_in_variableDecStatement1048); 
            	            pushFollow(FOLLOW_expression_in_variableDecStatement1050);
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

            match(input,49,FOLLOW_49_in_variableDecStatement1058); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:234:1: ifStatement : 'if' expression 'do' ( statement )* ( 'elseif' expression 'do' ( statement )* )* ( 'else' ( statement )* )? 'end' 'if' ;
    public final void ifStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:235:2: ( 'if' expression 'do' ( statement )* ( 'elseif' expression 'do' ( statement )* )* ( 'else' ( statement )* )? 'end' 'if' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:235:4: 'if' expression 'do' ( statement )* ( 'elseif' expression 'do' ( statement )* )* ( 'else' ( statement )* )? 'end' 'if'
            {
            match(input,53,FOLLOW_53_in_ifStatement1070); 
            pushFollow(FOLLOW_expression_in_ifStatement1072);
            expression();

            state._fsp--;

            match(input,54,FOLLOW_54_in_ifStatement1074); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:236:7: ( statement )*
            loop24:
            do {
                int alt24=2;
                int LA24_0 = input.LA(1);

                if ( (LA24_0==ID||(LA24_0>=51 && LA24_0<=53)||LA24_0==57) ) {
                    alt24=1;
                }


                switch (alt24) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:236:7: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_ifStatement1083);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop24;
                }
            } while (true);

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:237:4: ( 'elseif' expression 'do' ( statement )* )*
            loop26:
            do {
                int alt26=2;
                int LA26_0 = input.LA(1);

                if ( (LA26_0==55) ) {
                    alt26=1;
                }


                switch (alt26) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:237:6: 'elseif' expression 'do' ( statement )*
            	    {
            	    match(input,55,FOLLOW_55_in_ifStatement1091); 
            	    pushFollow(FOLLOW_expression_in_ifStatement1093);
            	    expression();

            	    state._fsp--;

            	    match(input,54,FOLLOW_54_in_ifStatement1095); 
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:238:5: ( statement )*
            	    loop25:
            	    do {
            	        int alt25=2;
            	        int LA25_0 = input.LA(1);

            	        if ( (LA25_0==ID||(LA25_0>=51 && LA25_0<=53)||LA25_0==57) ) {
            	            alt25=1;
            	        }


            	        switch (alt25) {
            	    	case 1 :
            	    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:238:5: statement
            	    	    {
            	    	    pushFollow(FOLLOW_statement_in_ifStatement1102);
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

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:239:4: ( 'else' ( statement )* )?
            int alt28=2;
            int LA28_0 = input.LA(1);

            if ( (LA28_0==56) ) {
                alt28=1;
            }
            switch (alt28) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:239:6: 'else' ( statement )*
                    {
                    match(input,56,FOLLOW_56_in_ifStatement1112); 
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:240:5: ( statement )*
                    loop27:
                    do {
                        int alt27=2;
                        int LA27_0 = input.LA(1);

                        if ( (LA27_0==ID||(LA27_0>=51 && LA27_0<=53)||LA27_0==57) ) {
                            alt27=1;
                        }


                        switch (alt27) {
                    	case 1 :
                    	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:240:5: statement
                    	    {
                    	    pushFollow(FOLLOW_statement_in_ifStatement1121);
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

            match(input,39,FOLLOW_39_in_ifStatement1129); 
            match(input,53,FOLLOW_53_in_ifStatement1131); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:244:1: whileStatement : 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' ;
    public final void whileStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:245:2: ( 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:245:4: 'while' expression 'loop' ( statement | exitStatement )* 'end' 'loop'
            {
            match(input,57,FOLLOW_57_in_whileStatement1143); 
            pushFollow(FOLLOW_expression_in_whileStatement1145);
            expression();

            state._fsp--;

            match(input,58,FOLLOW_58_in_whileStatement1147); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:246:4: ( statement | exitStatement )*
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:246:6: statement
            	    {
            	    pushFollow(FOLLOW_statement_in_whileStatement1154);
            	    statement();

            	    state._fsp--;


            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:246:18: exitStatement
            	    {
            	    pushFollow(FOLLOW_exitStatement_in_whileStatement1158);
            	    exitStatement();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop29;
                }
            } while (true);

            match(input,39,FOLLOW_39_in_whileStatement1165); 
            match(input,58,FOLLOW_58_in_whileStatement1167); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:251:1: procedureCallStatement : ID '(' ( actualParameters )? ')' ';' ;
    public final void procedureCallStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:252:2: ( ID '(' ( actualParameters )? ')' ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:252:4: ID '(' ( actualParameters )? ')' ';'
            {
            match(input,ID,FOLLOW_ID_in_procedureCallStatement1180); 
            match(input,37,FOLLOW_37_in_procedureCallStatement1182); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:252:11: ( actualParameters )?
            int alt30=2;
            int LA30_0 = input.LA(1);

            if ( ((LA30_0>=PLUS && LA30_0<=MINUS)||LA30_0==NOT_OP||LA30_0==ID||LA30_0==INTEGER||LA30_0==37||LA30_0==68) ) {
                alt30=1;
            }
            switch (alt30) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:252:11: actualParameters
                    {
                    pushFollow(FOLLOW_actualParameters_in_procedureCallStatement1184);
                    actualParameters();

                    state._fsp--;


                    }
                    break;

            }

            match(input,38,FOLLOW_38_in_procedureCallStatement1187); 
            match(input,49,FOLLOW_49_in_procedureCallStatement1189); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:255:1: actualParameters : expression ( ',' expression )* ;
    public final GuoliceParser.actualParameters_return actualParameters() throws RecognitionException {
        GuoliceParser.actualParameters_return retval = new GuoliceParser.actualParameters_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:256:2: ( expression ( ',' expression )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:256:4: expression ( ',' expression )*
            {
            pushFollow(FOLLOW_expression_in_actualParameters1200);
            expression();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:256:15: ( ',' expression )*
            loop31:
            do {
                int alt31=2;
                int LA31_0 = input.LA(1);

                if ( (LA31_0==41) ) {
                    alt31=1;
                }


                switch (alt31) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:256:16: ',' expression
            	    {
            	    match(input,41,FOLLOW_41_in_actualParameters1203); 
            	    pushFollow(FOLLOW_expression_in_actualParameters1205);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:259:1: exitStatement : ( 'exit' 'when' expression ';' | 'exit' 'now' ';' );
    public final void exitStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:260:2: ( 'exit' 'when' expression ';' | 'exit' 'now' ';' )
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:260:4: 'exit' 'when' expression ';'
                    {
                    match(input,59,FOLLOW_59_in_exitStatement1220); 
                    match(input,60,FOLLOW_60_in_exitStatement1221); 
                    pushFollow(FOLLOW_expression_in_exitStatement1223);
                    expression();

                    state._fsp--;

                    match(input,49,FOLLOW_49_in_exitStatement1225); 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:261:4: 'exit' 'now' ';'
                    {
                    match(input,59,FOLLOW_59_in_exitStatement1230); 
                    match(input,61,FOLLOW_61_in_exitStatement1231); 
                    match(input,49,FOLLOW_49_in_exitStatement1232); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:266:1: returnStatement : 'return' expression ';' ;
    public final void returnStatement() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:267:2: ( 'return' expression ';' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:267:4: 'return' expression ';'
            {
            match(input,62,FOLLOW_62_in_returnStatement1247); 
            pushFollow(FOLLOW_expression_in_returnStatement1249);
            expression();

            state._fsp--;

            match(input,49,FOLLOW_49_in_returnStatement1251); 

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:270:1: term returns [Node node] : ( number | '(' expression ')' | ID | ID '(' ( actualParameters )? ')' | string );
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
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:272:2: ( number | '(' expression ')' | ID | ID '(' ( actualParameters )? ')' | string )
            int alt34=5;
            alt34 = dfa34.predict(input);
            switch (alt34) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:272:4: number
                    {
                    pushFollow(FOLLOW_number_in_term1272);
                    number4=number();

                    state._fsp--;

                     node = number4; 

                    }
                    break;
                case 2 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:273:4: '(' expression ')'
                    {
                    match(input,37,FOLLOW_37_in_term1279); 
                    pushFollow(FOLLOW_expression_in_term1281);
                    expression5=expression();

                    state._fsp--;

                    match(input,38,FOLLOW_38_in_term1283); 
                     node = expression5; 

                    }
                    break;
                case 3 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:274:4: ID
                    {
                    ID6=(Token)match(input,ID,FOLLOW_ID_in_term1290); 
                     node = new Node((ID6!=null?ID6.getText():null)); 

                    }
                    break;
                case 4 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:275:4: ID '(' ( actualParameters )? ')'
                    {
                    ID8=(Token)match(input,ID,FOLLOW_ID_in_term1297); 
                    match(input,37,FOLLOW_37_in_term1299); 
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:275:11: ( actualParameters )?
                    int alt33=2;
                    int LA33_0 = input.LA(1);

                    if ( ((LA33_0>=PLUS && LA33_0<=MINUS)||LA33_0==NOT_OP||LA33_0==ID||LA33_0==INTEGER||LA33_0==37||LA33_0==68) ) {
                        alt33=1;
                    }
                    switch (alt33) {
                        case 1 :
                            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:275:12: actualParameters
                            {
                            pushFollow(FOLLOW_actualParameters_in_term1302);
                            actualParameters7=actualParameters();

                            state._fsp--;

                             nodeText = (actualParameters7!=null?input.toString(actualParameters7.start,actualParameters7.stop):null);

                            }
                            break;

                    }

                    match(input,38,FOLLOW_38_in_term1308); 

                    		node = new Node((ID8!=null?ID8.getText():null) + "(" + nodeText + ")");
                    	

                    }
                    break;
                case 5 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:279:4: string
                    {
                    pushFollow(FOLLOW_string_in_term1318);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:286:1: negation returns [Node node] : ( NOT_OP )* term ;
    public final Node negation() throws RecognitionException {
        Node node = null;

        Node term10 = null;


         int numberOfNots = 0; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:288:2: ( ( NOT_OP )* term )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:288:4: ( NOT_OP )* term
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:288:4: ( NOT_OP )*
            loop35:
            do {
                int alt35=2;
                int LA35_0 = input.LA(1);

                if ( (LA35_0==NOT_OP) ) {
                    alt35=1;
                }


                switch (alt35) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:288:6: NOT_OP
            	    {
            	    match(input,NOT_OP,FOLLOW_NOT_OP_in_negation1349); 
            	     numberOfNots++; 

            	    }
            	    break;

            	default :
            	    break loop35;
                }
            } while (true);

            pushFollow(FOLLOW_term_in_negation1356);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:302:1: sign returns [Node node] : ( PLUS | MINUS )* negation ;
    public final Node sign() throws RecognitionException {
        Node node = null;

        Node negation11 = null;


         int minuses = 0; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:304:2: ( ( PLUS | MINUS )* negation )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:304:4: ( PLUS | MINUS )* negation
            {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:304:4: ( PLUS | MINUS )*
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:304:6: PLUS
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_sign1381); 

            	    }
            	    break;
            	case 2 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:304:13: MINUS
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_sign1385); 
            	     minuses++; 

            	    }
            	    break;

            	default :
            	    break loop36;
                }
            } while (true);

            pushFollow(FOLLOW_negation_in_sign1391);
            negation11=negation();

            state._fsp--;


            		String sign = (minuses % 2 == 0)? "+" : "-";  // if number of minuses is even, the sign is +, otherwise the sign is -
            		node = new Node("" + sign + "" + negation11);
            	

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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:310:1: power returns [Node node] : s1= sign ( '^' s2= sign )* ;
    public final Node power() throws RecognitionException {
        Node node = null;

        Node s1 = null;

        Node s2 = null;


        boolean powerOpExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:314:2: (s1= sign ( '^' s2= sign )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:314:4: s1= sign ( '^' s2= sign )*
            {
            pushFollow(FOLLOW_sign_in_power1416);
            s1=sign();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:314:12: ( '^' s2= sign )*
            loop37:
            do {
                int alt37=2;
                alt37 = dfa37.predict(input);
                switch (alt37) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:314:13: '^' s2= sign
            	    {
            	    match(input,63,FOLLOW_63_in_power1419); 
            	    pushFollow(FOLLOW_sign_in_power1423);
            	    s2=sign();

            	    state._fsp--;


            	    		if(!powerOpExists) {
            	    			temp = s1;
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:331:1: multdiv returns [Node node] : p1= power ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )* ;
    public final Node multdiv() throws RecognitionException {
        Node node = null;

        Node p1 = null;

        Node p2 = null;


        boolean multExists = false;
               boolean divExists = false;
               boolean moduloExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:337:2: (p1= power ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:337:4: p1= power ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )*
            {
            pushFollow(FOLLOW_power_in_multdiv1452);
            p1=power();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:337:12: ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )*
            loop38:
            do {
                int alt38=4;
                alt38 = dfa38.predict(input);
                switch (alt38) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:337:14: ( MULT p2= power )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:337:14: ( MULT p2= power )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:337:16: MULT p2= power
            	    {
            	    match(input,MULT,FOLLOW_MULT_in_multdiv1457); 
            	    pushFollow(FOLLOW_power_in_multdiv1461);
            	    p2=power();

            	    state._fsp--;


            	    		if(!multExists && !divExists && !moduloExists) {
            	    			temp = p1;
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:349:4: ( DIV p2= power )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:349:4: ( DIV p2= power )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:349:6: DIV p2= power
            	    {
            	    match(input,DIV,FOLLOW_DIV_in_multdiv1470); 
            	    pushFollow(FOLLOW_power_in_multdiv1474);
            	    p2=power();

            	    state._fsp--;


            	    		if(!multExists && !divExists && !moduloExists) {
            	    			temp = p1;
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:361:4: ( MODULO p2= power )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:361:4: ( MODULO p2= power )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:361:6: MODULO p2= power
            	    {
            	    match(input,MODULO,FOLLOW_MODULO_in_multdiv1484); 
            	    pushFollow(FOLLOW_power_in_multdiv1488);
            	    p2=power();

            	    state._fsp--;


            	    		if(!multExists && !divExists && !moduloExists) {
            	    			temp = p1;
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:378:1: compare returns [Node node] : a1= addsub ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )? ;
    public final Node compare() throws RecognitionException {
        Node node = null;

        Node a1 = null;

        Node a2 = null;


        boolean comparatorExists = false;
        	Node comparatorNode = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:382:2: (a1= addsub ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )? )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:382:4: a1= addsub ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )?
            {
            pushFollow(FOLLOW_addsub_in_compare1520);
            a1=addsub();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:382:14: ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )?
            int alt39=7;
            alt39 = dfa39.predict(input);
            switch (alt39) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:382:16: ( EQUALS a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:382:16: ( EQUALS a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:382:18: EQUALS a2= addsub
                    {
                    match(input,EQUALS,FOLLOW_EQUALS_in_compare1526); 
                    pushFollow(FOLLOW_addsub_in_compare1530);
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:4: ( NOTEQUAL a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:4: ( NOTEQUAL a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:389:6: NOTEQUAL a2= addsub
                    {
                    match(input,NOTEQUAL,FOLLOW_NOTEQUAL_in_compare1542); 
                    pushFollow(FOLLOW_addsub_in_compare1546);
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:395:4: ( LESSTHAN a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:395:4: ( LESSTHAN a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:395:6: LESSTHAN a2= addsub
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_compare1557); 
                    pushFollow(FOLLOW_addsub_in_compare1561);
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:401:4: ( LESSTHAN EQUALS a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:401:4: ( LESSTHAN EQUALS a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:401:6: LESSTHAN EQUALS a2= addsub
                    {
                    match(input,LESSTHAN,FOLLOW_LESSTHAN_in_compare1571); 
                    match(input,EQUALS,FOLLOW_EQUALS_in_compare1573); 
                    pushFollow(FOLLOW_addsub_in_compare1577);
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:407:4: ( GRTRTHAN a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:407:4: ( GRTRTHAN a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:407:6: GRTRTHAN a2= addsub
                    {
                    match(input,GRTRTHAN,FOLLOW_GRTRTHAN_in_compare1587); 
                    pushFollow(FOLLOW_addsub_in_compare1591);
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
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:413:4: ( GRTRTHAN EQUALS a2= addsub )
                    {
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:413:4: ( GRTRTHAN EQUALS a2= addsub )
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:413:6: GRTRTHAN EQUALS a2= addsub
                    {
                    match(input,GRTRTHAN,FOLLOW_GRTRTHAN_in_compare1601); 
                    match(input,EQUALS,FOLLOW_EQUALS_in_compare1603); 
                    pushFollow(FOLLOW_addsub_in_compare1607);
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:430:1: expression returns [Node node] : c1= compare ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )* ;
    public final Node expression() throws RecognitionException {
        Node node = null;

        Node c1 = null;

        Node c2 = null;


        boolean andExists = false;
               boolean orExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:435:2: (c1= compare ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:435:4: c1= compare ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )*
            {
            pushFollow(FOLLOW_compare_in_expression1644);
            c1=compare();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:435:15: ( ( AND_OP c2= compare ) | ( OR_OP c2= compare ) )*
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:435:17: ( AND_OP c2= compare )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:435:17: ( AND_OP c2= compare )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:435:19: AND_OP c2= compare
            	    {
            	    match(input,AND_OP,FOLLOW_AND_OP_in_expression1650); 
            	    pushFollow(FOLLOW_compare_in_expression1654);
            	    c2=compare();

            	    state._fsp--;


            	    		if(!andExists && !orExists) {
            	    			temp = c1;
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:448:4: ( OR_OP c2= compare )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:448:4: ( OR_OP c2= compare )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:448:6: OR_OP c2= compare
            	    {
            	    match(input,OR_OP,FOLLOW_OR_OP_in_expression1667); 
            	    pushFollow(FOLLOW_compare_in_expression1671);
            	    c2=compare();

            	    state._fsp--;


            	    		if(!andExists && !orExists) {
            	    			temp = c1;
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:466:1: addsub returns [Node node] : m1= multdiv ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )* ;
    public final Node addsub() throws RecognitionException {
        Node node = null;

        Node m1 = null;

        Node m2 = null;


        boolean plusExists = false;
               boolean minusExists = false;
               Node temp = null;

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:471:2: (m1= multdiv ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )* )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:471:4: m1= multdiv ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )*
            {
            pushFollow(FOLLOW_multdiv_in_addsub1705);
            m1=multdiv();

            state._fsp--;

            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:471:15: ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )*
            loop41:
            do {
                int alt41=3;
                alt41 = dfa41.predict(input);
                switch (alt41) {
            	case 1 :
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:471:17: ( PLUS m2= multdiv )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:471:17: ( PLUS m2= multdiv )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:471:19: PLUS m2= multdiv
            	    {
            	    match(input,PLUS,FOLLOW_PLUS_in_addsub1711); 
            	    pushFollow(FOLLOW_multdiv_in_addsub1715);
            	    m2=multdiv();

            	    state._fsp--;


            	    		if(!plusExists && !minusExists) {
            	    			temp = m1;
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
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:483:4: ( MINUS m2= multdiv )
            	    {
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:483:4: ( MINUS m2= multdiv )
            	    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:483:6: MINUS m2= multdiv
            	    {
            	    match(input,MINUS,FOLLOW_MINUS_in_addsub1725); 
            	    pushFollow(FOLLOW_multdiv_in_addsub1729);
            	    m2=multdiv();

            	    state._fsp--;


            	    		if(!plusExists && !minusExists) {
            	    			temp = m1;
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:500:1: type : ( 'int' | 'float' | 'color' | 'string' );
    public final void type() throws RecognitionException {
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:501:2: ( 'int' | 'float' | 'color' | 'string' )
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:507:1: number returns [Node node] : i1= INTEGER ( '.' i2= INTEGER )? ;
    public final Node number() throws RecognitionException {
        Node node = null;

        Token i1=null;
        Token i2=null;

         String text = ""; 
        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:509:2: (i1= INTEGER ( '.' i2= INTEGER )? )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:509:4: i1= INTEGER ( '.' i2= INTEGER )?
            {
            i1=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1790); 
             text += (i1!=null?i1.getText():null); 
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:509:36: ( '.' i2= INTEGER )?
            int alt42=2;
            alt42 = dfa42.predict(input);
            switch (alt42) {
                case 1 :
                    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:509:37: '.' i2= INTEGER
                    {
                    match(input,48,FOLLOW_48_in_number1794); 
                    i2=(Token)match(input,INTEGER,FOLLOW_INTEGER_in_number1798); 
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
    // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:515:1: string : '\"' ~ ( '\"' | '\\n' | '\\r' ) '\"' ;
    public final GuoliceParser.string_return string() throws RecognitionException {
        GuoliceParser.string_return retval = new GuoliceParser.string_return();
        retval.start = input.LT(1);

        try {
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:515:8: ( '\"' ~ ( '\"' | '\\n' | '\\r' ) '\"' )
            // C:\\Users\\Mahmoud\\Documents\\EclipseWorkspace\\AntlrProject\\src\\mypackage\\Guolice.g:515:10: '\"' ~ ( '\"' | '\\n' | '\\r' ) '\"'
            {
            match(input,68,FOLLOW_68_in_string1817); 
            if ( (input.LA(1)>=PLUS && input.LA(1)<=67) ) {
                input.consume();
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }

            match(input,68,FOLLOW_68_in_string1837); 

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
            return "()* loopback of 180:2: ( statement | guiType )*";
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
            return "270:1: term returns [Node node] : ( number | '(' expression ')' | ID | ID '(' ( actualParameters )? ')' | string );";
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
            return "()* loopback of 314:12: ( '^' s2= sign )*";
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
            return "()* loopback of 337:12: ( ( MULT p2= power ) | ( DIV p2= power ) | ( MODULO p2= power ) )*";
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
            return "382:14: ( ( EQUALS a2= addsub ) | ( NOTEQUAL a2= addsub ) | ( LESSTHAN a2= addsub ) | ( LESSTHAN EQUALS a2= addsub ) | ( GRTRTHAN a2= addsub ) | ( GRTRTHAN EQUALS a2= addsub ) )?";
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
            return "()* loopback of 471:15: ( ( PLUS m2= multdiv ) | ( MINUS m2= multdiv ) )*";
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
            return "509:36: ( '.' i2= INTEGER )?";
        }
    }
 

    public static final BitSet FOLLOW_procedureDec_in_program344 = new BitSet(new long[]{0x0238010804000002L});
    public static final BitSet FOLLOW_functionDec_in_program348 = new BitSet(new long[]{0x0238010804000002L});
    public static final BitSet FOLLOW_statement_in_program352 = new BitSet(new long[]{0x0238010804000002L});
    public static final BitSet FOLLOW_35_in_procedureDec370 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_procedureDec372 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_procedureDec373 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_procedureDec376 = new BitSet(new long[]{0x0000004000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_parameters_in_procedureDec378 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureDec381 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_statement_in_procedureDec387 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_exitStatement_in_procedureDec391 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_39_in_procedureDec398 = new BitSet(new long[]{0x0000000800000000L});
    public static final BitSet FOLLOW_35_in_procedureDec400 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_40_in_functionDec412 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_functionDec414 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_functionDec416 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_functionDec418 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_functionDec421 = new BitSet(new long[]{0x0000004000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_parameters_in_functionDec423 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_functionDec426 = new BitSet(new long[]{0x4238018804000000L});
    public static final BitSet FOLLOW_statement_in_functionDec435 = new BitSet(new long[]{0x4238018804000000L});
    public static final BitSet FOLLOW_returnStatement_in_functionDec439 = new BitSet(new long[]{0x4238018804000000L});
    public static final BitSet FOLLOW_39_in_functionDec446 = new BitSet(new long[]{0x0000010000000000L});
    public static final BitSet FOLLOW_40_in_functionDec448 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_assignmentStatement_in_statement459 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_constantDecStatement_in_statement466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_variableDecStatement_in_statement472 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ifStatement_in_statement477 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_whileStatement_in_statement482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_procedureCallStatement_in_statement487 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_evntHabdleStatement_in_statement493 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_box_in_guiType504 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_circle_in_guiType510 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textBox_in_guiType517 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_position_in_guiCommonProperty532 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_point_in_guiCommonProperty537 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_color_in_guiCommonProperty542 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_event_in_guiCommonProperty547 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_BOX_in_box560 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_box562 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_box564 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_box566 = new BitSet(new long[]{0x00003C4050000000L});
    public static final BitSet FOLLOW_boxProperty_in_box573 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_box576 = new BitSet(new long[]{0x00003C0050000000L});
    public static final BitSet FOLLOW_boxProperty_in_box577 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_box584 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_guiCommonProperty_in_boxProperty595 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_width_in_boxProperty600 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_height_in_boxProperty605 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_CIRCLE_in_circle619 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_circle621 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_circle622 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_circle625 = new BitSet(new long[]{0x00004C4050000000L});
    public static final BitSet FOLLOW_circleProperty_in_circle633 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_circle636 = new BitSet(new long[]{0x00004C0050000000L});
    public static final BitSet FOLLOW_circleProperty_in_circle637 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_circle649 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_guiCommonProperty_in_circleProperty661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_radius_in_circleProperty666 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_set_in_textBox677 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_textBox685 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_textBox687 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_textBox689 = new BitSet(new long[]{0x0000BC4050000000L});
    public static final BitSet FOLLOW_textBoxProperty_in_textBox703 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_41_in_textBox706 = new BitSet(new long[]{0x0000BC0050000000L});
    public static final BitSet FOLLOW_textBoxProperty_in_textBox708 = new BitSet(new long[]{0x0000024000000000L});
    public static final BitSet FOLLOW_38_in_textBox715 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_boxProperty_in_textBoxProperty729 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_textProperty_in_textBoxProperty735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_42_in_position746 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_position747 = new BitSet(new long[]{0x0000000008000000L});
    public static final BitSet FOLLOW_POSITION_KEYWORD_in_position748 = new BitSet(new long[]{0x0000000007C00000L});
    public static final BitSet FOLLOW_ID_in_position751 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_guiType_in_position755 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_43_in_point768 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_point769 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_point771 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_point772 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_point774 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_point776 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_point778 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_44_in_width790 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_width792 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_width794 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_45_in_height806 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_height808 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_height810 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_COLOR_AREA_in_color825 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_color827 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_color829 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_color831 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_color833 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_color834 = new BitSet(new long[]{0x0000020000000000L});
    public static final BitSet FOLLOW_41_in_color836 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_color838 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_color840 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_46_in_radius851 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_radius852 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_number_in_radius854 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_47_in_textProperty867 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_textProperty869 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_string_in_textProperty871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_EVENTTYPE_in_event885 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_event887 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_event893 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_evntHabdleStatement906 = new BitSet(new long[]{0x0001000000000000L});
    public static final BitSet FOLLOW_48_in_evntHabdleStatement908 = new BitSet(new long[]{0x0000000040000000L});
    public static final BitSet FOLLOW_EVENTTYPE_in_evntHabdleStatement910 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_evntHabdleStatement912 = new BitSet(new long[]{0x0238014807C00000L});
    public static final BitSet FOLLOW_statement_in_evntHabdleStatement917 = new BitSet(new long[]{0x0238014807C00000L});
    public static final BitSet FOLLOW_guiType_in_evntHabdleStatement921 = new BitSet(new long[]{0x0238014807C00000L});
    public static final BitSet FOLLOW_38_in_evntHabdleStatement927 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_evntHabdleStatement929 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_parameters947 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parameters950 = new BitSet(new long[]{0x0000002024000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_parameters952 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_parameters956 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_parameters958 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_parameters961 = new BitSet(new long[]{0x0000002024000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_parameters963 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_ID_in_assignmentStatement982 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_assignmentStatement984 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_assignmentStatement986 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_assignmentStatement988 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_51_in_constantDecStatement1004 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_constantDecStatement1006 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_constantDecStatement1008 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_constantDecStatement1010 = new BitSet(new long[]{0x0004000000000000L});
    public static final BitSet FOLLOW_50_in_constantDecStatement1013 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_constantDecStatement1015 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_constantDecStatement1017 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_52_in_variableDecStatement1029 = new BitSet(new long[]{0x0000000000000000L,0x000000000000000FL});
    public static final BitSet FOLLOW_type_in_variableDecStatement1031 = new BitSet(new long[]{0x0000001000000000L});
    public static final BitSet FOLLOW_36_in_variableDecStatement1033 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_variableDecStatement1035 = new BitSet(new long[]{0x0006020000000000L});
    public static final BitSet FOLLOW_50_in_variableDecStatement1038 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_variableDecStatement1040 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_41_in_variableDecStatement1044 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_ID_in_variableDecStatement1045 = new BitSet(new long[]{0x0006020000000000L});
    public static final BitSet FOLLOW_50_in_variableDecStatement1048 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_variableDecStatement1050 = new BitSet(new long[]{0x0002020000000000L});
    public static final BitSet FOLLOW_49_in_variableDecStatement1058 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_53_in_ifStatement1070 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_ifStatement1072 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifStatement1074 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1083 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_55_in_ifStatement1091 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_ifStatement1093 = new BitSet(new long[]{0x0040000000000000L});
    public static final BitSet FOLLOW_54_in_ifStatement1095 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1102 = new BitSet(new long[]{0x03B8018804000000L});
    public static final BitSet FOLLOW_56_in_ifStatement1112 = new BitSet(new long[]{0x0238018804000000L});
    public static final BitSet FOLLOW_statement_in_ifStatement1121 = new BitSet(new long[]{0x0238018804000000L});
    public static final BitSet FOLLOW_39_in_ifStatement1129 = new BitSet(new long[]{0x0020000000000000L});
    public static final BitSet FOLLOW_53_in_ifStatement1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_57_in_whileStatement1143 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_whileStatement1145 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_whileStatement1147 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_statement_in_whileStatement1154 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_exitStatement_in_whileStatement1158 = new BitSet(new long[]{0x0A38018804000000L});
    public static final BitSet FOLLOW_39_in_whileStatement1165 = new BitSet(new long[]{0x0400000000000000L});
    public static final BitSet FOLLOW_58_in_whileStatement1167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_procedureCallStatement1180 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_procedureCallStatement1182 = new BitSet(new long[]{0x0000006024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualParameters_in_procedureCallStatement1184 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_procedureCallStatement1187 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_procedureCallStatement1189 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_expression_in_actualParameters1200 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_41_in_actualParameters1203 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_actualParameters1205 = new BitSet(new long[]{0x0000020000000002L});
    public static final BitSet FOLLOW_59_in_exitStatement1220 = new BitSet(new long[]{0x1000000000000000L});
    public static final BitSet FOLLOW_60_in_exitStatement1221 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_exitStatement1223 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exitStatement1225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_59_in_exitStatement1230 = new BitSet(new long[]{0x2000000000000000L});
    public static final BitSet FOLLOW_61_in_exitStatement1231 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_exitStatement1232 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_62_in_returnStatement1247 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_returnStatement1249 = new BitSet(new long[]{0x0002000000000000L});
    public static final BitSet FOLLOW_49_in_returnStatement1251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_number_in_term1272 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_37_in_term1279 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_expression_in_term1281 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_term1283 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1290 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_term1297 = new BitSet(new long[]{0x0000002000000000L});
    public static final BitSet FOLLOW_37_in_term1299 = new BitSet(new long[]{0x0000006024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_actualParameters_in_term1302 = new BitSet(new long[]{0x0000004000000000L});
    public static final BitSet FOLLOW_38_in_term1308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_string_in_term1318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOT_OP_in_negation1349 = new BitSet(new long[]{0x0000002024200000L,0x0000000000000010L});
    public static final BitSet FOLLOW_term_in_negation1356 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_PLUS_in_sign1381 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_MINUS_in_sign1385 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_negation_in_sign1391 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_sign_in_power1416 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_63_in_power1419 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_sign_in_power1423 = new BitSet(new long[]{0x8000000000000002L});
    public static final BitSet FOLLOW_power_in_multdiv1452 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_MULT_in_multdiv1457 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_power_in_multdiv1461 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_DIV_in_multdiv1470 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_power_in_multdiv1474 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_MODULO_in_multdiv1484 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_power_in_multdiv1488 = new BitSet(new long[]{0x00000000001000C2L});
    public static final BitSet FOLLOW_addsub_in_compare1520 = new BitSet(new long[]{0x000000000002C102L});
    public static final BitSet FOLLOW_EQUALS_in_compare1526 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1530 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_NOTEQUAL_in_compare1542 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1546 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_compare1557 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1561 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_LESSTHAN_in_compare1571 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_compare1573 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRTRTHAN_in_compare1587 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1591 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_GRTRTHAN_in_compare1601 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_EQUALS_in_compare1603 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_addsub_in_compare1607 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_compare_in_expression1644 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_AND_OP_in_expression1650 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_compare_in_expression1654 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_OR_OP_in_expression1667 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_compare_in_expression1671 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_multdiv_in_addsub1705 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_PLUS_in_addsub1711 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_multdiv_in_addsub1715 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_MINUS_in_addsub1725 = new BitSet(new long[]{0x0000002024200030L,0x0000000000000010L});
    public static final BitSet FOLLOW_multdiv_in_addsub1729 = new BitSet(new long[]{0x0000000000000032L});
    public static final BitSet FOLLOW_set_in_type0 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INTEGER_in_number1790 = new BitSet(new long[]{0x0001000000000002L});
    public static final BitSet FOLLOW_48_in_number1794 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_INTEGER_in_number1798 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_68_in_string1817 = new BitSet(new long[]{0xFFFFFFFFFFFFFFF0L,0x000000000000000FL});
    public static final BitSet FOLLOW_set_in_string1823 = new BitSet(new long[]{0x0000000000000000L,0x0000000000000010L});
    public static final BitSet FOLLOW_68_in_string1837 = new BitSet(new long[]{0x0000000000000002L});

}