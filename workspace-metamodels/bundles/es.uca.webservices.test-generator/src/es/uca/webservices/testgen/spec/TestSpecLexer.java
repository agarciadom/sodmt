// $ANTLR 3.4 es/uca/webservices/testgen/spec/TestSpec.g 2012-08-11 20:09:44

package es.uca.webservices.testgen.spec;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestSpecLexer extends Lexer {
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int T__32=32;
    public static final int T__33=33;
    public static final int T__34=34;
    public static final int T__35=35;
    public static final int T__36=36;
    public static final int COMMA=4;
    public static final int COMMENT=5;
    public static final int DECLARATION=6;
    public static final int ESC_SEQ=7;
    public static final int EXPONENT=8;
    public static final int FLOAT=9;
    public static final int HEX_DIGIT=10;
    public static final int ID=11;
    public static final int INT=12;
    public static final int KEYVAL=13;
    public static final int OCTAL_ESC=14;
    public static final int RESTRICTIONS=15;
    public static final int SPEC=16;
    public static final int STRING=17;
    public static final int TYPEDEF=18;
    public static final int TYPE_DATE=19;
    public static final int TYPE_DATETIME=20;
    public static final int TYPE_DURATION=21;
    public static final int TYPE_FLOAT=22;
    public static final int TYPE_INT=23;
    public static final int TYPE_LIST=24;
    public static final int TYPE_STRING=25;
    public static final int TYPE_TIME=26;
    public static final int TYPE_TUPLE=27;
    public static final int UNICODE_ESC=28;
    public static final int WS=29;

    // delegates
    // delegators
    public Lexer[] getDelegates() {
        return new Lexer[] {};
    }

    public TestSpecLexer() {} 
    public TestSpecLexer(CharStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestSpecLexer(CharStream input, RecognizerSharedState state) {
        super(input,state);
    }
    public String getGrammarFileName() { return "es/uca/webservices/testgen/spec/TestSpec.g"; }

    // $ANTLR start "T__30"
    public final void mT__30() throws RecognitionException {
        try {
            int _type = T__30;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:6:7: ( '(' )
            // es/uca/webservices/testgen/spec/TestSpec.g:6:9: '('
            {
            match('('); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__30"

    // $ANTLR start "T__31"
    public final void mT__31() throws RecognitionException {
        try {
            int _type = T__31;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:7:7: ( ')' )
            // es/uca/webservices/testgen/spec/TestSpec.g:7:9: ')'
            {
            match(')'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__31"

    // $ANTLR start "T__32"
    public final void mT__32() throws RecognitionException {
        try {
            int _type = T__32;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:8:7: ( ',' )
            // es/uca/webservices/testgen/spec/TestSpec.g:8:9: ','
            {
            match(','); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__32"

    // $ANTLR start "T__33"
    public final void mT__33() throws RecognitionException {
        try {
            int _type = T__33;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:9:7: ( ';' )
            // es/uca/webservices/testgen/spec/TestSpec.g:9:9: ';'
            {
            match(';'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__33"

    // $ANTLR start "T__34"
    public final void mT__34() throws RecognitionException {
        try {
            int _type = T__34;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:10:7: ( '=' )
            // es/uca/webservices/testgen/spec/TestSpec.g:10:9: '='
            {
            match('='); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__34"

    // $ANTLR start "T__35"
    public final void mT__35() throws RecognitionException {
        try {
            int _type = T__35;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:11:7: ( '{' )
            // es/uca/webservices/testgen/spec/TestSpec.g:11:9: '{'
            {
            match('{'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__35"

    // $ANTLR start "T__36"
    public final void mT__36() throws RecognitionException {
        try {
            int _type = T__36;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:12:7: ( '}' )
            // es/uca/webservices/testgen/spec/TestSpec.g:12:9: '}'
            {
            match('}'); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "T__36"

    // $ANTLR start "TYPEDEF"
    public final void mTYPEDEF() throws RecognitionException {
        try {
            int _type = TYPEDEF;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:59:10: ( 'typedef' )
            // es/uca/webservices/testgen/spec/TestSpec.g:59:12: 'typedef'
            {
            match("typedef"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPEDEF"

    // $ANTLR start "TYPE_INT"
    public final void mTYPE_INT() throws RecognitionException {
        try {
            int _type = TYPE_INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:60:10: ( 'int' )
            // es/uca/webservices/testgen/spec/TestSpec.g:60:12: 'int'
            {
            match("int"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_INT"

    // $ANTLR start "TYPE_TUPLE"
    public final void mTYPE_TUPLE() throws RecognitionException {
        try {
            int _type = TYPE_TUPLE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:61:12: ( 'tuple' )
            // es/uca/webservices/testgen/spec/TestSpec.g:61:14: 'tuple'
            {
            match("tuple"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_TUPLE"

    // $ANTLR start "TYPE_LIST"
    public final void mTYPE_LIST() throws RecognitionException {
        try {
            int _type = TYPE_LIST;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:62:11: ( 'list' )
            // es/uca/webservices/testgen/spec/TestSpec.g:62:13: 'list'
            {
            match("list"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_LIST"

    // $ANTLR start "TYPE_FLOAT"
    public final void mTYPE_FLOAT() throws RecognitionException {
        try {
            int _type = TYPE_FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:63:12: ( 'float' )
            // es/uca/webservices/testgen/spec/TestSpec.g:63:14: 'float'
            {
            match("float"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_FLOAT"

    // $ANTLR start "TYPE_STRING"
    public final void mTYPE_STRING() throws RecognitionException {
        try {
            int _type = TYPE_STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:64:13: ( 'string' )
            // es/uca/webservices/testgen/spec/TestSpec.g:64:15: 'string'
            {
            match("string"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_STRING"

    // $ANTLR start "TYPE_DATE"
    public final void mTYPE_DATE() throws RecognitionException {
        try {
            int _type = TYPE_DATE;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:65:11: ( 'date' )
            // es/uca/webservices/testgen/spec/TestSpec.g:65:13: 'date'
            {
            match("date"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_DATE"

    // $ANTLR start "TYPE_DATETIME"
    public final void mTYPE_DATETIME() throws RecognitionException {
        try {
            int _type = TYPE_DATETIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:66:15: ( 'dateTime' )
            // es/uca/webservices/testgen/spec/TestSpec.g:66:17: 'dateTime'
            {
            match("dateTime"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_DATETIME"

    // $ANTLR start "TYPE_TIME"
    public final void mTYPE_TIME() throws RecognitionException {
        try {
            int _type = TYPE_TIME;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:67:11: ( 'time' )
            // es/uca/webservices/testgen/spec/TestSpec.g:67:13: 'time'
            {
            match("time"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_TIME"

    // $ANTLR start "TYPE_DURATION"
    public final void mTYPE_DURATION() throws RecognitionException {
        try {
            int _type = TYPE_DURATION;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:68:15: ( 'duration' )
            // es/uca/webservices/testgen/spec/TestSpec.g:68:17: 'duration'
            {
            match("duration"); 



            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "TYPE_DURATION"

    // $ANTLR start "ID"
    public final void mID() throws RecognitionException {
        try {
            int _type = ID;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:70:5: ( ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )* )
            // es/uca/webservices/testgen/spec/TestSpec.g:70:7: ( 'a' .. 'z' | 'A' .. 'Z' | '_' ) ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            {
            if ( (input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // es/uca/webservices/testgen/spec/TestSpec.g:70:31: ( 'a' .. 'z' | 'A' .. 'Z' | '0' .. '9' | '_' )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                case 'A':
                case 'B':
                case 'C':
                case 'D':
                case 'E':
                case 'F':
                case 'G':
                case 'H':
                case 'I':
                case 'J':
                case 'K':
                case 'L':
                case 'M':
                case 'N':
                case 'O':
                case 'P':
                case 'Q':
                case 'R':
                case 'S':
                case 'T':
                case 'U':
                case 'V':
                case 'W':
                case 'X':
                case 'Y':
                case 'Z':
                case '_':
                case 'a':
                case 'b':
                case 'c':
                case 'd':
                case 'e':
                case 'f':
                case 'g':
                case 'h':
                case 'i':
                case 'j':
                case 'k':
                case 'l':
                case 'm':
                case 'n':
                case 'o':
                case 'p':
                case 'q':
                case 'r':
                case 's':
                case 't':
                case 'u':
                case 'v':
                case 'w':
                case 'x':
                case 'y':
                case 'z':
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // es/uca/webservices/testgen/spec/TestSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'Z')||input.LA(1)=='_'||(input.LA(1) >= 'a' && input.LA(1) <= 'z') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ID"

    // $ANTLR start "INT"
    public final void mINT() throws RecognitionException {
        try {
            int _type = INT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:73:5: ( ( '+' | '-' )? ( '0' .. '9' )+ )
            // es/uca/webservices/testgen/spec/TestSpec.g:73:7: ( '+' | '-' )? ( '0' .. '9' )+
            {
            // es/uca/webservices/testgen/spec/TestSpec.g:73:7: ( '+' | '-' )?
            int alt2=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt2=1;
                    }
                    break;
            }

            switch (alt2) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // es/uca/webservices/testgen/spec/TestSpec.g:73:17: ( '0' .. '9' )+
            int cnt3=0;
            loop3:
            do {
                int alt3=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt3=1;
                    }
                    break;

                }

                switch (alt3) {
            	case 1 :
            	    // es/uca/webservices/testgen/spec/TestSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


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
        	// do for sure before leaving
        }
    }
    // $ANTLR end "INT"

    // $ANTLR start "FLOAT"
    public final void mFLOAT() throws RecognitionException {
        try {
            int _type = FLOAT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:77:5: ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT )
            int alt12=3;
            alt12 = dfa12.predict(input);
            switch (alt12) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:77:9: ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )?
                    {
                    // es/uca/webservices/testgen/spec/TestSpec.g:77:9: ( '+' | '-' )?
                    int alt4=2;
                    switch ( input.LA(1) ) {
                        case '+':
                        case '-':
                            {
                            alt4=1;
                            }
                            break;
                    }

                    switch (alt4) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // es/uca/webservices/testgen/spec/TestSpec.g:77:19: ( '0' .. '9' )+
                    int cnt5=0;
                    loop5:
                    do {
                        int alt5=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt5=1;
                            }
                            break;

                        }

                        switch (alt5) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


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


                    match('.'); 

                    // es/uca/webservices/testgen/spec/TestSpec.g:77:35: ( '0' .. '9' )*
                    loop6:
                    do {
                        int alt6=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt6=1;
                            }
                            break;

                        }

                        switch (alt6) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop6;
                        }
                    } while (true);


                    // es/uca/webservices/testgen/spec/TestSpec.g:77:47: ( EXPONENT )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt7=1;
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:77:47: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:78:9: '.' ( '0' .. '9' )+ ( EXPONENT )?
                    {
                    match('.'); 

                    // es/uca/webservices/testgen/spec/TestSpec.g:78:13: ( '0' .. '9' )+
                    int cnt8=0;
                    loop8:
                    do {
                        int alt8=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt8=1;
                            }
                            break;

                        }

                        switch (alt8) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt8 >= 1 ) break loop8;
                                EarlyExitException eee =
                                    new EarlyExitException(8, input);
                                throw eee;
                        }
                        cnt8++;
                    } while (true);


                    // es/uca/webservices/testgen/spec/TestSpec.g:78:25: ( EXPONENT )?
                    int alt9=2;
                    switch ( input.LA(1) ) {
                        case 'E':
                        case 'e':
                            {
                            alt9=1;
                            }
                            break;
                    }

                    switch (alt9) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:78:25: EXPONENT
                            {
                            mEXPONENT(); 


                            }
                            break;

                    }


                    }
                    break;
                case 3 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:79:9: ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT
                    {
                    // es/uca/webservices/testgen/spec/TestSpec.g:79:9: ( '+' | '-' )?
                    int alt10=2;
                    switch ( input.LA(1) ) {
                        case '+':
                        case '-':
                            {
                            alt10=1;
                            }
                            break;
                    }

                    switch (alt10) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:
                            {
                            if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                                input.consume();
                            }
                            else {
                                MismatchedSetException mse = new MismatchedSetException(null,input);
                                recover(mse);
                                throw mse;
                            }


                            }
                            break;

                    }


                    // es/uca/webservices/testgen/spec/TestSpec.g:79:19: ( '0' .. '9' )+
                    int cnt11=0;
                    loop11:
                    do {
                        int alt11=2;
                        switch ( input.LA(1) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                        case '8':
                        case '9':
                            {
                            alt11=1;
                            }
                            break;

                        }

                        switch (alt11) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:
                    	    {
                    	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    if ( cnt11 >= 1 ) break loop11;
                                EarlyExitException eee =
                                    new EarlyExitException(11, input);
                                throw eee;
                        }
                        cnt11++;
                    } while (true);


                    mEXPONENT(); 


                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "FLOAT"

    // $ANTLR start "EXPONENT"
    public final void mEXPONENT() throws RecognitionException {
        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:84:10: ( ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+ )
            // es/uca/webservices/testgen/spec/TestSpec.g:84:12: ( 'e' | 'E' ) ( '+' | '-' )? ( '0' .. '9' )+
            {
            if ( input.LA(1)=='E'||input.LA(1)=='e' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            // es/uca/webservices/testgen/spec/TestSpec.g:84:22: ( '+' | '-' )?
            int alt13=2;
            switch ( input.LA(1) ) {
                case '+':
                case '-':
                    {
                    alt13=1;
                    }
                    break;
            }

            switch (alt13) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:
                    {
                    if ( input.LA(1)=='+'||input.LA(1)=='-' ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    }
                    break;

            }


            // es/uca/webservices/testgen/spec/TestSpec.g:84:33: ( '0' .. '9' )+
            int cnt14=0;
            loop14:
            do {
                int alt14=2;
                switch ( input.LA(1) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                case '8':
                case '9':
                    {
                    alt14=1;
                    }
                    break;

                }

                switch (alt14) {
            	case 1 :
            	    // es/uca/webservices/testgen/spec/TestSpec.g:
            	    {
            	    if ( (input.LA(1) >= '0' && input.LA(1) <= '9') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt14 >= 1 ) break loop14;
                        EarlyExitException eee =
                            new EarlyExitException(14, input);
                        throw eee;
                }
                cnt14++;
            } while (true);


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "EXPONENT"

    // $ANTLR start "COMMENT"
    public final void mCOMMENT() throws RecognitionException {
        try {
            int _type = COMMENT;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:86:5: ( '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n' | '/*' ( options {greedy=false; } : . )* '*/' )
            int alt18=2;
            switch ( input.LA(1) ) {
            case '/':
                {
                switch ( input.LA(2) ) {
                case '/':
                    {
                    alt18=1;
                    }
                    break;
                case '*':
                    {
                    alt18=2;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 18, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 18, 0, input);

                throw nvae;

            }

            switch (alt18) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:86:9: '//' (~ ( '\\n' | '\\r' ) )* ( '\\r' )? '\\n'
                    {
                    match("//"); 



                    // es/uca/webservices/testgen/spec/TestSpec.g:86:14: (~ ( '\\n' | '\\r' ) )*
                    loop15:
                    do {
                        int alt15=2;
                        int LA15_0 = input.LA(1);

                        if ( ((LA15_0 >= '\u0000' && LA15_0 <= '\t')||(LA15_0 >= '\u000B' && LA15_0 <= '\f')||(LA15_0 >= '\u000E' && LA15_0 <= '\uFFFF')) ) {
                            alt15=1;
                        }


                        switch (alt15) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:
                    	    {
                    	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '\t')||(input.LA(1) >= '\u000B' && input.LA(1) <= '\f')||(input.LA(1) >= '\u000E' && input.LA(1) <= '\uFFFF') ) {
                    	        input.consume();
                    	    }
                    	    else {
                    	        MismatchedSetException mse = new MismatchedSetException(null,input);
                    	        recover(mse);
                    	        throw mse;
                    	    }


                    	    }
                    	    break;

                    	default :
                    	    break loop15;
                        }
                    } while (true);


                    // es/uca/webservices/testgen/spec/TestSpec.g:86:28: ( '\\r' )?
                    int alt16=2;
                    switch ( input.LA(1) ) {
                        case '\r':
                            {
                            alt16=1;
                            }
                            break;
                    }

                    switch (alt16) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:86:28: '\\r'
                            {
                            match('\r'); 

                            }
                            break;

                    }


                    match('\n'); 

                    _channel=HIDDEN;

                    }
                    break;
                case 2 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:87:9: '/*' ( options {greedy=false; } : . )* '*/'
                    {
                    match("/*"); 



                    // es/uca/webservices/testgen/spec/TestSpec.g:87:14: ( options {greedy=false; } : . )*
                    loop17:
                    do {
                        int alt17=2;
                        int LA17_0 = input.LA(1);

                        if ( (LA17_0=='*') ) {
                            int LA17_1 = input.LA(2);

                            if ( (LA17_1=='/') ) {
                                alt17=2;
                            }
                            else if ( ((LA17_1 >= '\u0000' && LA17_1 <= '.')||(LA17_1 >= '0' && LA17_1 <= '\uFFFF')) ) {
                                alt17=1;
                            }


                        }
                        else if ( ((LA17_0 >= '\u0000' && LA17_0 <= ')')||(LA17_0 >= '+' && LA17_0 <= '\uFFFF')) ) {
                            alt17=1;
                        }


                        switch (alt17) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:87:42: .
                    	    {
                    	    matchAny(); 

                    	    }
                    	    break;

                    	default :
                    	    break loop17;
                        }
                    } while (true);


                    match("*/"); 



                    _channel=HIDDEN;

                    }
                    break;

            }
            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "COMMENT"

    // $ANTLR start "STRING"
    public final void mSTRING() throws RecognitionException {
        try {
            int _type = STRING;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            int normal;

             StringBuilder lbuf = new StringBuilder(); 
            // es/uca/webservices/testgen/spec/TestSpec.g:92:5: ( '\"' ( ESC_SEQ |normal=~ ( '\\\\' | '\"' ) )* '\"' )
            // es/uca/webservices/testgen/spec/TestSpec.g:92:9: '\"' ( ESC_SEQ |normal=~ ( '\\\\' | '\"' ) )* '\"'
            {
            match('\"'); 

            // es/uca/webservices/testgen/spec/TestSpec.g:93:6: ( ESC_SEQ |normal=~ ( '\\\\' | '\"' ) )*
            loop19:
            do {
                int alt19=3;
                int LA19_0 = input.LA(1);

                if ( (LA19_0=='\\') ) {
                    alt19=1;
                }
                else if ( ((LA19_0 >= '\u0000' && LA19_0 <= '!')||(LA19_0 >= '#' && LA19_0 <= '[')||(LA19_0 >= ']' && LA19_0 <= '\uFFFF')) ) {
                    alt19=2;
                }


                switch (alt19) {
            	case 1 :
            	    // es/uca/webservices/testgen/spec/TestSpec.g:93:8: ESC_SEQ
            	    {
            	    mESC_SEQ(); 


            	    lbuf.append(getText());

            	    }
            	    break;
            	case 2 :
            	    // es/uca/webservices/testgen/spec/TestSpec.g:94:8: normal=~ ( '\\\\' | '\"' )
            	    {
            	    normal= input.LA(1);

            	    if ( (input.LA(1) >= '\u0000' && input.LA(1) <= '!')||(input.LA(1) >= '#' && input.LA(1) <= '[')||(input.LA(1) >= ']' && input.LA(1) <= '\uFFFF') ) {
            	        input.consume();
            	    }
            	    else {
            	        MismatchedSetException mse = new MismatchedSetException(null,input);
            	        recover(mse);
            	        throw mse;
            	    }


            	     lbuf.appendCodePoint(normal); 

            	    }
            	    break;

            	default :
            	    break loop19;
                }
            } while (true);


            match('\"'); 

             setText(lbuf.toString()); 

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "STRING"

    // $ANTLR start "ESC_SEQ"
    public final void mESC_SEQ() throws RecognitionException {
        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:102:5: ( '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' ) | UNICODE_ESC | OCTAL_ESC )
            int alt21=3;
            switch ( input.LA(1) ) {
            case '\\':
                {
                switch ( input.LA(2) ) {
                case 'u':
                    {
                    alt21=2;
                    }
                    break;
                case '0':
                case '1':
                case '2':
                case '3':
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    alt21=3;
                    }
                    break;
                case '\"':
                case '\'':
                case '\\':
                case 'b':
                case 'f':
                case 'n':
                case 'r':
                case 't':
                    {
                    alt21=1;
                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 21, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 21, 0, input);

                throw nvae;

            }

            switch (alt21) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:102:9: '\\\\' ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    {
                    match('\\'); 

                    // es/uca/webservices/testgen/spec/TestSpec.g:102:14: ( 'b' | 't' | 'n' | 'f' | 'r' | '\"' | '\\'' | '\\\\' )
                    int alt20=8;
                    switch ( input.LA(1) ) {
                    case 'b':
                        {
                        alt20=1;
                        }
                        break;
                    case 't':
                        {
                        alt20=2;
                        }
                        break;
                    case 'n':
                        {
                        alt20=3;
                        }
                        break;
                    case 'f':
                        {
                        alt20=4;
                        }
                        break;
                    case 'r':
                        {
                        alt20=5;
                        }
                        break;
                    case '\"':
                        {
                        alt20=6;
                        }
                        break;
                    case '\'':
                        {
                        alt20=7;
                        }
                        break;
                    case '\\':
                        {
                        alt20=8;
                        }
                        break;
                    default:
                        NoViableAltException nvae =
                            new NoViableAltException("", 20, 0, input);

                        throw nvae;

                    }

                    switch (alt20) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:102:16: 'b'
                            {
                            match('b'); 

                             setText("\b"); 

                            }
                            break;
                        case 2 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:103:10: 't'
                            {
                            match('t'); 

                             setText("\r"); 

                            }
                            break;
                        case 3 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:104:10: 'n'
                            {
                            match('n'); 

                             setText("\n"); 

                            }
                            break;
                        case 4 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:105:10: 'f'
                            {
                            match('f'); 

                             setText("\f"); 

                            }
                            break;
                        case 5 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:106:10: 'r'
                            {
                            match('r'); 

                             setText("\r"); 

                            }
                            break;
                        case 6 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:107:10: '\"'
                            {
                            match('\"'); 

                             setText("\""); 

                            }
                            break;
                        case 7 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:108:10: '\\''
                            {
                            match('\''); 

                             setText("\'"); 

                            }
                            break;
                        case 8 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:109:10: '\\\\'
                            {
                            match('\\'); 

                             setText("\\"); 

                            }
                            break;

                    }


                    }
                    break;
                case 2 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:111:9: UNICODE_ESC
                    {
                    mUNICODE_ESC(); 


                    }
                    break;
                case 3 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:112:9: OCTAL_ESC
                    {
                    mOCTAL_ESC(); 


                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "ESC_SEQ"

    // $ANTLR start "UNICODE_ESC"
    public final void mUNICODE_ESC() throws RecognitionException {
        try {
            CommonToken i=null;
            CommonToken j=null;
            CommonToken k=null;
            CommonToken l=null;

            // es/uca/webservices/testgen/spec/TestSpec.g:117:5: ( '\\\\' 'u' i= HEX_DIGIT j= HEX_DIGIT k= HEX_DIGIT l= HEX_DIGIT )
            // es/uca/webservices/testgen/spec/TestSpec.g:117:9: '\\\\' 'u' i= HEX_DIGIT j= HEX_DIGIT k= HEX_DIGIT l= HEX_DIGIT
            {
            match('\\'); 

            match('u'); 

            int iStart616 = getCharIndex();
            int iStartLine616 = getLine();
            int iStartCharPos616 = getCharPositionInLine();
            mHEX_DIGIT(); 
            i = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, iStart616, getCharIndex()-1);
            i.setLine(iStartLine616);
            i.setCharPositionInLine(iStartCharPos616);


            int jStart620 = getCharIndex();
            int jStartLine620 = getLine();
            int jStartCharPos620 = getCharPositionInLine();
            mHEX_DIGIT(); 
            j = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, jStart620, getCharIndex()-1);
            j.setLine(jStartLine620);
            j.setCharPositionInLine(jStartCharPos620);


            int kStart624 = getCharIndex();
            int kStartLine624 = getLine();
            int kStartCharPos624 = getCharPositionInLine();
            mHEX_DIGIT(); 
            k = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, kStart624, getCharIndex()-1);
            k.setLine(kStartLine624);
            k.setCharPositionInLine(kStartCharPos624);


            int lStart628 = getCharIndex();
            int lStartLine628 = getLine();
            int lStartCharPos628 = getCharPositionInLine();
            mHEX_DIGIT(); 
            l = new CommonToken(input, Token.INVALID_TOKEN_TYPE, Token.DEFAULT_CHANNEL, lStart628, getCharIndex()-1);
            l.setLine(lStartLine628);
            l.setCharPositionInLine(lStartCharPos628);



                		final char unicodeChar = (char) Integer.parseInt(i.getText() + j.getText() + k.getText() + l.getText(), 16);
                		setText("" + unicodeChar);
                	

            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "UNICODE_ESC"

    // $ANTLR start "OCTAL_ESC"
    public final void mOCTAL_ESC() throws RecognitionException {
        try {
            int i;
            int j;
            int k;

            // es/uca/webservices/testgen/spec/TestSpec.g:125:5: ( '\\\\' i= ( '0' .. '3' ) j= ( '0' .. '7' ) k= ( '0' .. '7' ) | '\\\\' i= ( '0' .. '7' ) j= ( '0' .. '7' ) | '\\\\' i= ( '0' .. '7' ) )
            int alt22=3;
            switch ( input.LA(1) ) {
            case '\\':
                {
                switch ( input.LA(2) ) {
                case '0':
                case '1':
                case '2':
                case '3':
                    {
                    switch ( input.LA(3) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        switch ( input.LA(4) ) {
                        case '0':
                        case '1':
                        case '2':
                        case '3':
                        case '4':
                        case '5':
                        case '6':
                        case '7':
                            {
                            alt22=1;
                            }
                            break;
                        default:
                            alt22=2;
                        }

                        }
                        break;
                    default:
                        alt22=3;
                    }

                    }
                    break;
                case '4':
                case '5':
                case '6':
                case '7':
                    {
                    switch ( input.LA(3) ) {
                    case '0':
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                        {
                        alt22=2;
                        }
                        break;
                    default:
                        alt22=3;
                    }

                    }
                    break;
                default:
                    NoViableAltException nvae =
                        new NoViableAltException("", 22, 1, input);

                    throw nvae;

                }

                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 22, 0, input);

                throw nvae;

            }

            switch (alt22) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:125:9: '\\\\' i= ( '0' .. '3' ) j= ( '0' .. '7' ) k= ( '0' .. '7' )
                    {
                    match('\\'); 

                    i= input.LA(1);

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '3') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    j= input.LA(1);

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    k= input.LA(1);

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                     setText("" + (char)Integer.parseInt("" + (char)i + (char)j + (char)k, 8)); 

                    }
                    break;
                case 2 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:126:9: '\\\\' i= ( '0' .. '7' ) j= ( '0' .. '7' )
                    {
                    match('\\'); 

                    i= input.LA(1);

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                    j= input.LA(1);

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                     setText("" + (char)Integer.parseInt("" + (char)i + (char)j, 8)); 

                    }
                    break;
                case 3 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:127:9: '\\\\' i= ( '0' .. '7' )
                    {
                    match('\\'); 

                    i= input.LA(1);

                    if ( (input.LA(1) >= '0' && input.LA(1) <= '7') ) {
                        input.consume();
                    }
                    else {
                        MismatchedSetException mse = new MismatchedSetException(null,input);
                        recover(mse);
                        throw mse;
                    }


                     setText("" + (char)Integer.parseInt("" + (char)i, 8)); 

                    }
                    break;

            }

        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "OCTAL_ESC"

    // $ANTLR start "HEX_DIGIT"
    public final void mHEX_DIGIT() throws RecognitionException {
        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:131:11: ( ( '0' .. '9' | 'a' .. 'f' | 'A' .. 'F' ) )
            // es/uca/webservices/testgen/spec/TestSpec.g:
            {
            if ( (input.LA(1) >= '0' && input.LA(1) <= '9')||(input.LA(1) >= 'A' && input.LA(1) <= 'F')||(input.LA(1) >= 'a' && input.LA(1) <= 'f') ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            }


        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "HEX_DIGIT"

    // $ANTLR start "WS"
    public final void mWS() throws RecognitionException {
        try {
            int _type = WS;
            int _channel = DEFAULT_TOKEN_CHANNEL;
            // es/uca/webservices/testgen/spec/TestSpec.g:132:5: ( ( ' ' | '\\r' | '\\t' | '\\v' | '\\u000C' | '\\n' ) )
            // es/uca/webservices/testgen/spec/TestSpec.g:132:8: ( ' ' | '\\r' | '\\t' | '\\v' | '\\u000C' | '\\n' )
            {
            if ( (input.LA(1) >= '\t' && input.LA(1) <= '\n')||(input.LA(1) >= '\f' && input.LA(1) <= '\r')||input.LA(1)==' '||input.LA(1)=='v' ) {
                input.consume();
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                recover(mse);
                throw mse;
            }


            _channel=HIDDEN;

            }

            state.type = _type;
            state.channel = _channel;
        }
        finally {
        	// do for sure before leaving
        }
    }
    // $ANTLR end "WS"

    public void mTokens() throws RecognitionException {
        // es/uca/webservices/testgen/spec/TestSpec.g:1:8: ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | TYPEDEF | TYPE_INT | TYPE_TUPLE | TYPE_LIST | TYPE_FLOAT | TYPE_STRING | TYPE_DATE | TYPE_DATETIME | TYPE_TIME | TYPE_DURATION | ID | INT | FLOAT | COMMENT | STRING | WS )
        int alt23=23;
        alt23 = dfa23.predict(input);
        switch (alt23) {
            case 1 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:10: T__30
                {
                mT__30(); 


                }
                break;
            case 2 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:16: T__31
                {
                mT__31(); 


                }
                break;
            case 3 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:22: T__32
                {
                mT__32(); 


                }
                break;
            case 4 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:28: T__33
                {
                mT__33(); 


                }
                break;
            case 5 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:34: T__34
                {
                mT__34(); 


                }
                break;
            case 6 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:40: T__35
                {
                mT__35(); 


                }
                break;
            case 7 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:46: T__36
                {
                mT__36(); 


                }
                break;
            case 8 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:52: TYPEDEF
                {
                mTYPEDEF(); 


                }
                break;
            case 9 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:60: TYPE_INT
                {
                mTYPE_INT(); 


                }
                break;
            case 10 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:69: TYPE_TUPLE
                {
                mTYPE_TUPLE(); 


                }
                break;
            case 11 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:80: TYPE_LIST
                {
                mTYPE_LIST(); 


                }
                break;
            case 12 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:90: TYPE_FLOAT
                {
                mTYPE_FLOAT(); 


                }
                break;
            case 13 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:101: TYPE_STRING
                {
                mTYPE_STRING(); 


                }
                break;
            case 14 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:113: TYPE_DATE
                {
                mTYPE_DATE(); 


                }
                break;
            case 15 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:123: TYPE_DATETIME
                {
                mTYPE_DATETIME(); 


                }
                break;
            case 16 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:137: TYPE_TIME
                {
                mTYPE_TIME(); 


                }
                break;
            case 17 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:147: TYPE_DURATION
                {
                mTYPE_DURATION(); 


                }
                break;
            case 18 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:161: ID
                {
                mID(); 


                }
                break;
            case 19 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:164: INT
                {
                mINT(); 


                }
                break;
            case 20 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:168: FLOAT
                {
                mFLOAT(); 


                }
                break;
            case 21 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:174: COMMENT
                {
                mCOMMENT(); 


                }
                break;
            case 22 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:182: STRING
                {
                mSTRING(); 


                }
                break;
            case 23 :
                // es/uca/webservices/testgen/spec/TestSpec.g:1:189: WS
                {
                mWS(); 


                }
                break;

        }

    }


    protected DFA12 dfa12 = new DFA12(this);
    protected DFA23 dfa23 = new DFA23(this);
    static final String DFA12_eotS =
        "\6\uffff";
    static final String DFA12_eofS =
        "\6\uffff";
    static final String DFA12_minS =
        "\1\53\1\60\1\56\3\uffff";
    static final String DFA12_maxS =
        "\2\71\1\145\3\uffff";
    static final String DFA12_acceptS =
        "\3\uffff\1\2\1\1\1\3";
    static final String DFA12_specialS =
        "\6\uffff}>";
    static final String[] DFA12_transitionS = {
            "\1\1\1\uffff\1\1\1\3\1\uffff\12\2",
            "\12\2",
            "\1\4\1\uffff\12\2\13\uffff\1\5\37\uffff\1\5",
            "",
            "",
            ""
    };

    static final short[] DFA12_eot = DFA.unpackEncodedString(DFA12_eotS);
    static final short[] DFA12_eof = DFA.unpackEncodedString(DFA12_eofS);
    static final char[] DFA12_min = DFA.unpackEncodedStringToUnsignedChars(DFA12_minS);
    static final char[] DFA12_max = DFA.unpackEncodedStringToUnsignedChars(DFA12_maxS);
    static final short[] DFA12_accept = DFA.unpackEncodedString(DFA12_acceptS);
    static final short[] DFA12_special = DFA.unpackEncodedString(DFA12_specialS);
    static final short[][] DFA12_transition;

    static {
        int numStates = DFA12_transitionS.length;
        DFA12_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA12_transition[i] = DFA.unpackEncodedString(DFA12_transitionS[i]);
        }
    }

    class DFA12 extends DFA {

        public DFA12(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 12;
            this.eot = DFA12_eot;
            this.eof = DFA12_eof;
            this.min = DFA12_min;
            this.max = DFA12_max;
            this.accept = DFA12_accept;
            this.special = DFA12_special;
            this.transition = DFA12_transition;
        }
        public String getDescription() {
            return "76:1: FLOAT : ( ( '+' | '-' )? ( '0' .. '9' )+ '.' ( '0' .. '9' )* ( EXPONENT )? | '.' ( '0' .. '9' )+ ( EXPONENT )? | ( '+' | '-' )? ( '0' .. '9' )+ EXPONENT );";
        }
    }
    static final String DFA23_eotS =
        "\10\uffff\6\24\2\uffff\1\37\5\uffff\11\24\1\uffff\3\24\1\54\7\24"+
        "\1\64\1\uffff\1\65\2\24\1\71\2\24\1\74\2\uffff\1\75\2\24\1\uffff"+
        "\2\24\2\uffff\1\102\2\24\1\105\1\uffff\2\24\1\uffff\1\110\1\111"+
        "\2\uffff";
    static final String DFA23_eofS =
        "\112\uffff";
    static final String DFA23_minS =
        "\1\11\7\uffff\1\151\1\156\1\151\1\154\1\164\1\141\1\uffff\1\60\1"+
        "\56\5\uffff\2\160\1\155\1\164\1\163\1\157\1\162\1\164\1\162\1\uffff"+
        "\1\145\1\154\1\145\1\60\1\164\1\141\1\151\1\145\1\141\1\144\1\145"+
        "\1\60\1\uffff\1\60\1\164\1\156\1\60\1\164\1\145\1\60\2\uffff\1\60"+
        "\1\147\1\151\1\uffff\1\151\1\146\2\uffff\1\60\1\155\1\157\1\60\1"+
        "\uffff\1\145\1\156\1\uffff\2\60\2\uffff";
    static final String DFA23_maxS =
        "\1\175\7\uffff\1\171\1\156\1\151\1\154\1\164\1\165\1\uffff\1\71"+
        "\1\145\5\uffff\2\160\1\155\1\164\1\163\1\157\1\162\1\164\1\162\1"+
        "\uffff\1\145\1\154\1\145\1\172\1\164\1\141\1\151\1\145\1\141\1\144"+
        "\1\145\1\172\1\uffff\1\172\1\164\1\156\1\172\1\164\1\145\1\172\2"+
        "\uffff\1\172\1\147\1\151\1\uffff\1\151\1\146\2\uffff\1\172\1\155"+
        "\1\157\1\172\1\uffff\1\145\1\156\1\uffff\2\172\2\uffff";
    static final String DFA23_acceptS =
        "\1\uffff\1\1\1\2\1\3\1\4\1\5\1\6\1\7\6\uffff\1\22\2\uffff\1\24\1"+
        "\25\1\26\1\22\1\27\11\uffff\1\23\14\uffff\1\11\7\uffff\1\20\1\13"+
        "\3\uffff\1\16\2\uffff\1\12\1\14\4\uffff\1\15\2\uffff\1\10\2\uffff"+
        "\1\17\1\21";
    static final String DFA23_specialS =
        "\112\uffff}>";
    static final String[] DFA23_transitionS = {
            "\2\25\1\uffff\2\25\22\uffff\1\25\1\uffff\1\23\5\uffff\1\1\1"+
            "\2\1\uffff\1\17\1\3\1\17\1\21\1\22\12\20\1\uffff\1\4\1\uffff"+
            "\1\5\3\uffff\32\24\4\uffff\1\24\1\uffff\3\24\1\15\1\24\1\13"+
            "\2\24\1\11\2\24\1\12\6\24\1\14\1\10\1\24\1\16\4\24\1\6\1\uffff"+
            "\1\7",
            "",
            "",
            "",
            "",
            "",
            "",
            "",
            "\1\30\13\uffff\1\27\3\uffff\1\26",
            "\1\31",
            "\1\32",
            "\1\33",
            "\1\34",
            "\1\35\23\uffff\1\36",
            "",
            "\12\20",
            "\1\21\1\uffff\12\20\13\uffff\1\21\37\uffff\1\21",
            "",
            "",
            "",
            "",
            "",
            "\1\40",
            "\1\41",
            "\1\42",
            "\1\43",
            "\1\44",
            "\1\45",
            "\1\46",
            "\1\47",
            "\1\50",
            "",
            "\1\51",
            "\1\52",
            "\1\53",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\55",
            "\1\56",
            "\1\57",
            "\1\60",
            "\1\61",
            "\1\62",
            "\1\63",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\66",
            "\1\67",
            "\12\24\7\uffff\23\24\1\70\6\24\4\uffff\1\24\1\uffff\32\24",
            "\1\72",
            "\1\73",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\76",
            "\1\77",
            "",
            "\1\100",
            "\1\101",
            "",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\1\103",
            "\1\104",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            "\1\106",
            "\1\107",
            "",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "\12\24\7\uffff\32\24\4\uffff\1\24\1\uffff\32\24",
            "",
            ""
    };

    static final short[] DFA23_eot = DFA.unpackEncodedString(DFA23_eotS);
    static final short[] DFA23_eof = DFA.unpackEncodedString(DFA23_eofS);
    static final char[] DFA23_min = DFA.unpackEncodedStringToUnsignedChars(DFA23_minS);
    static final char[] DFA23_max = DFA.unpackEncodedStringToUnsignedChars(DFA23_maxS);
    static final short[] DFA23_accept = DFA.unpackEncodedString(DFA23_acceptS);
    static final short[] DFA23_special = DFA.unpackEncodedString(DFA23_specialS);
    static final short[][] DFA23_transition;

    static {
        int numStates = DFA23_transitionS.length;
        DFA23_transition = new short[numStates][];
        for (int i=0; i<numStates; i++) {
            DFA23_transition[i] = DFA.unpackEncodedString(DFA23_transitionS[i]);
        }
    }

    class DFA23 extends DFA {

        public DFA23(BaseRecognizer recognizer) {
            this.recognizer = recognizer;
            this.decisionNumber = 23;
            this.eot = DFA23_eot;
            this.eof = DFA23_eof;
            this.min = DFA23_min;
            this.max = DFA23_max;
            this.accept = DFA23_accept;
            this.special = DFA23_special;
            this.transition = DFA23_transition;
        }
        public String getDescription() {
            return "1:1: Tokens : ( T__30 | T__31 | T__32 | T__33 | T__34 | T__35 | T__36 | TYPEDEF | TYPE_INT | TYPE_TUPLE | TYPE_LIST | TYPE_FLOAT | TYPE_STRING | TYPE_DATE | TYPE_DATETIME | TYPE_TIME | TYPE_DURATION | ID | INT | FLOAT | COMMENT | STRING | WS );";
        }
    }
 

}