// $ANTLR 3.4 es/uca/webservices/testgen/spec/TestSpec.g 2012-08-11 20:09:43

package es.uca.webservices.testgen.spec;


import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

import org.antlr.runtime.tree.*;


@SuppressWarnings({"all", "warnings", "unchecked"})
public class TestSpecParser extends Parser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "COMMA", "COMMENT", "DECLARATION", "ESC_SEQ", "EXPONENT", "FLOAT", "HEX_DIGIT", "ID", "INT", "KEYVAL", "OCTAL_ESC", "RESTRICTIONS", "SPEC", "STRING", "TYPEDEF", "TYPE_DATE", "TYPE_DATETIME", "TYPE_DURATION", "TYPE_FLOAT", "TYPE_INT", "TYPE_LIST", "TYPE_STRING", "TYPE_TIME", "TYPE_TUPLE", "UNICODE_ESC", "WS", "'('", "')'", "','", "';'", "'='", "'{'", "'}'"
    };

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
    public Parser[] getDelegates() {
        return new Parser[] {};
    }

    // delegators


    public TestSpecParser(TokenStream input) {
        this(input, new RecognizerSharedState());
    }
    public TestSpecParser(TokenStream input, RecognizerSharedState state) {
        super(input, state);
    }

protected TreeAdaptor adaptor = new CommonTreeAdaptor();

public void setTreeAdaptor(TreeAdaptor adaptor) {
    this.adaptor = adaptor;
}
public TreeAdaptor getTreeAdaptor() {
    return adaptor;
}
    public String[] getTokenNames() { return TestSpecParser.tokenNames; }
    public String getGrammarFileName() { return "es/uca/webservices/testgen/spec/TestSpec.g"; }


    public static class spec_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "spec"
    // es/uca/webservices/testgen/spec/TestSpec.g:24:1: spec : ( line ';' )* -> ^( SPEC ( line )* ) ;
    public final TestSpecParser.spec_return spec() throws RecognitionException {
        TestSpecParser.spec_return retval = new TestSpecParser.spec_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal2=null;
        TestSpecParser.line_return line1 =null;


        Object char_literal2_tree=null;
        RewriteRuleTokenStream stream_33=new RewriteRuleTokenStream(adaptor,"token 33");
        RewriteRuleSubtreeStream stream_line=new RewriteRuleSubtreeStream(adaptor,"rule line");
        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:24:5: ( ( line ';' )* -> ^( SPEC ( line )* ) )
            // es/uca/webservices/testgen/spec/TestSpec.g:24:7: ( line ';' )*
            {
            // es/uca/webservices/testgen/spec/TestSpec.g:24:7: ( line ';' )*
            loop1:
            do {
                int alt1=2;
                switch ( input.LA(1) ) {
                case ID:
                case TYPEDEF:
                case TYPE_DATE:
                case TYPE_DATETIME:
                case TYPE_DURATION:
                case TYPE_FLOAT:
                case TYPE_INT:
                case TYPE_LIST:
                case TYPE_STRING:
                case TYPE_TIME:
                case TYPE_TUPLE:
                    {
                    alt1=1;
                    }
                    break;

                }

                switch (alt1) {
            	case 1 :
            	    // es/uca/webservices/testgen/spec/TestSpec.g:24:8: line ';'
            	    {
            	    pushFollow(FOLLOW_line_in_spec72);
            	    line1=line();

            	    state._fsp--;

            	    stream_line.add(line1.getTree());

            	    char_literal2=(Token)match(input,33,FOLLOW_33_in_spec74);  
            	    stream_33.add(char_literal2);


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);


            // AST REWRITE
            // elements: line
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 24:19: -> ^( SPEC ( line )* )
            {
                // es/uca/webservices/testgen/spec/TestSpec.g:24:22: ^( SPEC ( line )* )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(SPEC, "SPEC")
                , root_1);

                // es/uca/webservices/testgen/spec/TestSpec.g:24:29: ( line )*
                while ( stream_line.hasNext() ) {
                    adaptor.addChild(root_1, stream_line.nextTree());

                }
                stream_line.reset();

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "spec"


    public static class line_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "line"
    // es/uca/webservices/testgen/spec/TestSpec.g:27:1: line : ( typedef | declaration -> ^( DECLARATION declaration ) );
    public final TestSpecParser.line_return line() throws RecognitionException {
        TestSpecParser.line_return retval = new TestSpecParser.line_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        TestSpecParser.typedef_return typedef3 =null;

        TestSpecParser.declaration_return declaration4 =null;


        RewriteRuleSubtreeStream stream_declaration=new RewriteRuleSubtreeStream(adaptor,"rule declaration");
        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:27:5: ( typedef | declaration -> ^( DECLARATION declaration ) )
            int alt2=2;
            switch ( input.LA(1) ) {
            case TYPEDEF:
                {
                alt2=1;
                }
                break;
            case ID:
            case TYPE_DATE:
            case TYPE_DATETIME:
            case TYPE_DURATION:
            case TYPE_FLOAT:
            case TYPE_INT:
            case TYPE_LIST:
            case TYPE_STRING:
            case TYPE_TIME:
            case TYPE_TUPLE:
                {
                alt2=2;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;

            }

            switch (alt2) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:27:7: typedef
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_typedef_in_line95);
                    typedef3=typedef();

                    state._fsp--;

                    adaptor.addChild(root_0, typedef3.getTree());

                    }
                    break;
                case 2 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:28:4: declaration
                    {
                    pushFollow(FOLLOW_declaration_in_line100);
                    declaration4=declaration();

                    state._fsp--;

                    stream_declaration.add(declaration4.getTree());

                    // AST REWRITE
                    // elements: declaration
                    // token labels: 
                    // rule labels: retval
                    // token list labels: 
                    // rule list labels: 
                    // wildcard labels: 
                    retval.tree = root_0;
                    RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

                    root_0 = (Object)adaptor.nil();
                    // 28:16: -> ^( DECLARATION declaration )
                    {
                        // es/uca/webservices/testgen/spec/TestSpec.g:28:19: ^( DECLARATION declaration )
                        {
                        Object root_1 = (Object)adaptor.nil();
                        root_1 = (Object)adaptor.becomeRoot(
                        (Object)adaptor.create(DECLARATION, "DECLARATION")
                        , root_1);

                        adaptor.addChild(root_1, stream_declaration.nextTree());

                        adaptor.addChild(root_0, root_1);
                        }

                    }


                    retval.tree = root_0;

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "line"


    public static class typedef_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "typedef"
    // es/uca/webservices/testgen/spec/TestSpec.g:31:1: typedef : TYPEDEF ^ type ( restrictions )? ID ;
    public final TestSpecParser.typedef_return typedef() throws RecognitionException {
        TestSpecParser.typedef_return retval = new TestSpecParser.typedef_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token TYPEDEF5=null;
        Token ID8=null;
        TestSpecParser.type_return type6 =null;

        TestSpecParser.restrictions_return restrictions7 =null;


        Object TYPEDEF5_tree=null;
        Object ID8_tree=null;

        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:31:8: ( TYPEDEF ^ type ( restrictions )? ID )
            // es/uca/webservices/testgen/spec/TestSpec.g:31:10: TYPEDEF ^ type ( restrictions )? ID
            {
            root_0 = (Object)adaptor.nil();


            TYPEDEF5=(Token)match(input,TYPEDEF,FOLLOW_TYPEDEF_in_typedef117); 
            TYPEDEF5_tree = 
            (Object)adaptor.create(TYPEDEF5)
            ;
            root_0 = (Object)adaptor.becomeRoot(TYPEDEF5_tree, root_0);


            pushFollow(FOLLOW_type_in_typedef120);
            type6=type();

            state._fsp--;

            adaptor.addChild(root_0, type6.getTree());

            // es/uca/webservices/testgen/spec/TestSpec.g:31:24: ( restrictions )?
            int alt3=2;
            switch ( input.LA(1) ) {
                case 30:
                    {
                    alt3=1;
                    }
                    break;
            }

            switch (alt3) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:31:24: restrictions
                    {
                    pushFollow(FOLLOW_restrictions_in_typedef122);
                    restrictions7=restrictions();

                    state._fsp--;

                    adaptor.addChild(root_0, restrictions7.getTree());

                    }
                    break;

            }


            ID8=(Token)match(input,ID,FOLLOW_ID_in_typedef125); 
            ID8_tree = 
            (Object)adaptor.create(ID8)
            ;
            adaptor.addChild(root_0, ID8_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "typedef"


    public static class declaration_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "declaration"
    // es/uca/webservices/testgen/spec/TestSpec.g:32:1: declaration : type ID ;
    public final TestSpecParser.declaration_return declaration() throws RecognitionException {
        TestSpecParser.declaration_return retval = new TestSpecParser.declaration_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID10=null;
        TestSpecParser.type_return type9 =null;


        Object ID10_tree=null;

        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:32:12: ( type ID )
            // es/uca/webservices/testgen/spec/TestSpec.g:32:14: type ID
            {
            root_0 = (Object)adaptor.nil();


            pushFollow(FOLLOW_type_in_declaration131);
            type9=type();

            state._fsp--;

            adaptor.addChild(root_0, type9.getTree());

            ID10=(Token)match(input,ID,FOLLOW_ID_in_declaration133); 
            ID10_tree = 
            (Object)adaptor.create(ID10)
            ;
            adaptor.addChild(root_0, ID10_tree);


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "declaration"


    public static class type_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "type"
    // es/uca/webservices/testgen/spec/TestSpec.g:34:1: type : ( TYPE_INT | TYPE_TUPLE | TYPE_LIST | TYPE_FLOAT | TYPE_STRING | TYPE_DATE | TYPE_DATETIME | TYPE_TIME | TYPE_DURATION | ID );
    public final TestSpecParser.type_return type() throws RecognitionException {
        TestSpecParser.type_return retval = new TestSpecParser.type_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token set11=null;

        Object set11_tree=null;

        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:35:2: ( TYPE_INT | TYPE_TUPLE | TYPE_LIST | TYPE_FLOAT | TYPE_STRING | TYPE_DATE | TYPE_DATETIME | TYPE_TIME | TYPE_DURATION | ID )
            // es/uca/webservices/testgen/spec/TestSpec.g:
            {
            root_0 = (Object)adaptor.nil();


            set11=(Token)input.LT(1);

            if ( input.LA(1)==ID||(input.LA(1) >= TYPE_DATE && input.LA(1) <= TYPE_TUPLE) ) {
                input.consume();
                adaptor.addChild(root_0, 
                (Object)adaptor.create(set11)
                );
                state.errorRecovery=false;
            }
            else {
                MismatchedSetException mse = new MismatchedSetException(null,input);
                throw mse;
            }


            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "type"


    public static class restrictions_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "restrictions"
    // es/uca/webservices/testgen/spec/TestSpec.g:47:1: restrictions : '(' ! ( restriction ( ',' ! restriction )* )? ')' !;
    public final TestSpecParser.restrictions_return restrictions() throws RecognitionException {
        TestSpecParser.restrictions_return retval = new TestSpecParser.restrictions_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token char_literal12=null;
        Token char_literal14=null;
        Token char_literal16=null;
        TestSpecParser.restriction_return restriction13 =null;

        TestSpecParser.restriction_return restriction15 =null;


        Object char_literal12_tree=null;
        Object char_literal14_tree=null;
        Object char_literal16_tree=null;

        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:47:13: ( '(' ! ( restriction ( ',' ! restriction )* )? ')' !)
            // es/uca/webservices/testgen/spec/TestSpec.g:47:15: '(' ! ( restriction ( ',' ! restriction )* )? ')' !
            {
            root_0 = (Object)adaptor.nil();


            char_literal12=(Token)match(input,30,FOLLOW_30_in_restrictions196); 

            // es/uca/webservices/testgen/spec/TestSpec.g:47:20: ( restriction ( ',' ! restriction )* )?
            int alt5=2;
            switch ( input.LA(1) ) {
                case ID:
                    {
                    alt5=1;
                    }
                    break;
            }

            switch (alt5) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:47:21: restriction ( ',' ! restriction )*
                    {
                    pushFollow(FOLLOW_restriction_in_restrictions200);
                    restriction13=restriction();

                    state._fsp--;

                    adaptor.addChild(root_0, restriction13.getTree());

                    // es/uca/webservices/testgen/spec/TestSpec.g:47:33: ( ',' ! restriction )*
                    loop4:
                    do {
                        int alt4=2;
                        switch ( input.LA(1) ) {
                        case 32:
                            {
                            alt4=1;
                            }
                            break;

                        }

                        switch (alt4) {
                    	case 1 :
                    	    // es/uca/webservices/testgen/spec/TestSpec.g:47:34: ',' ! restriction
                    	    {
                    	    char_literal14=(Token)match(input,32,FOLLOW_32_in_restrictions203); 

                    	    pushFollow(FOLLOW_restriction_in_restrictions206);
                    	    restriction15=restriction();

                    	    state._fsp--;

                    	    adaptor.addChild(root_0, restriction15.getTree());

                    	    }
                    	    break;

                    	default :
                    	    break loop4;
                        }
                    } while (true);


                    }
                    break;

            }


            char_literal16=(Token)match(input,31,FOLLOW_31_in_restrictions213); 

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "restrictions"


    public static class restriction_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "restriction"
    // es/uca/webservices/testgen/spec/TestSpec.g:49:1: restriction : ID '=' restriction_value -> ^( KEYVAL ID restriction_value ) ;
    public final TestSpecParser.restriction_return restriction() throws RecognitionException {
        TestSpecParser.restriction_return retval = new TestSpecParser.restriction_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token ID17=null;
        Token char_literal18=null;
        TestSpecParser.restriction_value_return restriction_value19 =null;


        Object ID17_tree=null;
        Object char_literal18_tree=null;
        RewriteRuleTokenStream stream_ID=new RewriteRuleTokenStream(adaptor,"token ID");
        RewriteRuleTokenStream stream_34=new RewriteRuleTokenStream(adaptor,"token 34");
        RewriteRuleSubtreeStream stream_restriction_value=new RewriteRuleSubtreeStream(adaptor,"rule restriction_value");
        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:49:12: ( ID '=' restriction_value -> ^( KEYVAL ID restriction_value ) )
            // es/uca/webservices/testgen/spec/TestSpec.g:49:14: ID '=' restriction_value
            {
            ID17=(Token)match(input,ID,FOLLOW_ID_in_restriction221);  
            stream_ID.add(ID17);


            char_literal18=(Token)match(input,34,FOLLOW_34_in_restriction223);  
            stream_34.add(char_literal18);


            pushFollow(FOLLOW_restriction_value_in_restriction225);
            restriction_value19=restriction_value();

            state._fsp--;

            stream_restriction_value.add(restriction_value19.getTree());

            // AST REWRITE
            // elements: ID, restriction_value
            // token labels: 
            // rule labels: retval
            // token list labels: 
            // rule list labels: 
            // wildcard labels: 
            retval.tree = root_0;
            RewriteRuleSubtreeStream stream_retval=new RewriteRuleSubtreeStream(adaptor,"rule retval",retval!=null?retval.tree:null);

            root_0 = (Object)adaptor.nil();
            // 49:39: -> ^( KEYVAL ID restriction_value )
            {
                // es/uca/webservices/testgen/spec/TestSpec.g:49:42: ^( KEYVAL ID restriction_value )
                {
                Object root_1 = (Object)adaptor.nil();
                root_1 = (Object)adaptor.becomeRoot(
                (Object)adaptor.create(KEYVAL, "KEYVAL")
                , root_1);

                adaptor.addChild(root_1, 
                stream_ID.nextNode()
                );

                adaptor.addChild(root_1, stream_restriction_value.nextTree());

                adaptor.addChild(root_0, root_1);
                }

            }


            retval.tree = root_0;

            }

            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "restriction"


    public static class restriction_value_return extends ParserRuleReturnScope {
        Object tree;
        public Object getTree() { return tree; }
    };


    // $ANTLR start "restriction_value"
    // es/uca/webservices/testgen/spec/TestSpec.g:51:1: restriction_value : ( INT | STRING | FLOAT | type | '{' ! ( restriction_value ( ',' ! restriction_value )* )? '}' !);
    public final TestSpecParser.restriction_value_return restriction_value() throws RecognitionException {
        TestSpecParser.restriction_value_return retval = new TestSpecParser.restriction_value_return();
        retval.start = input.LT(1);


        Object root_0 = null;

        Token INT20=null;
        Token STRING21=null;
        Token FLOAT22=null;
        Token char_literal24=null;
        Token char_literal26=null;
        Token char_literal28=null;
        TestSpecParser.type_return type23 =null;

        TestSpecParser.restriction_value_return restriction_value25 =null;

        TestSpecParser.restriction_value_return restriction_value27 =null;


        Object INT20_tree=null;
        Object STRING21_tree=null;
        Object FLOAT22_tree=null;
        Object char_literal24_tree=null;
        Object char_literal26_tree=null;
        Object char_literal28_tree=null;

        try {
            // es/uca/webservices/testgen/spec/TestSpec.g:52:2: ( INT | STRING | FLOAT | type | '{' ! ( restriction_value ( ',' ! restriction_value )* )? '}' !)
            int alt8=5;
            switch ( input.LA(1) ) {
            case INT:
                {
                alt8=1;
                }
                break;
            case STRING:
                {
                alt8=2;
                }
                break;
            case FLOAT:
                {
                alt8=3;
                }
                break;
            case ID:
            case TYPE_DATE:
            case TYPE_DATETIME:
            case TYPE_DURATION:
            case TYPE_FLOAT:
            case TYPE_INT:
            case TYPE_LIST:
            case TYPE_STRING:
            case TYPE_TIME:
            case TYPE_TUPLE:
                {
                alt8=4;
                }
                break;
            case 35:
                {
                alt8=5;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 8, 0, input);

                throw nvae;

            }

            switch (alt8) {
                case 1 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:52:4: INT
                    {
                    root_0 = (Object)adaptor.nil();


                    INT20=(Token)match(input,INT,FOLLOW_INT_in_restriction_value244); 
                    INT20_tree = 
                    (Object)adaptor.create(INT20)
                    ;
                    adaptor.addChild(root_0, INT20_tree);


                    }
                    break;
                case 2 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:53:4: STRING
                    {
                    root_0 = (Object)adaptor.nil();


                    STRING21=(Token)match(input,STRING,FOLLOW_STRING_in_restriction_value250); 
                    STRING21_tree = 
                    (Object)adaptor.create(STRING21)
                    ;
                    adaptor.addChild(root_0, STRING21_tree);


                    }
                    break;
                case 3 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:54:4: FLOAT
                    {
                    root_0 = (Object)adaptor.nil();


                    FLOAT22=(Token)match(input,FLOAT,FOLLOW_FLOAT_in_restriction_value256); 
                    FLOAT22_tree = 
                    (Object)adaptor.create(FLOAT22)
                    ;
                    adaptor.addChild(root_0, FLOAT22_tree);


                    }
                    break;
                case 4 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:55:4: type
                    {
                    root_0 = (Object)adaptor.nil();


                    pushFollow(FOLLOW_type_in_restriction_value261);
                    type23=type();

                    state._fsp--;

                    adaptor.addChild(root_0, type23.getTree());

                    }
                    break;
                case 5 :
                    // es/uca/webservices/testgen/spec/TestSpec.g:56:4: '{' ! ( restriction_value ( ',' ! restriction_value )* )? '}' !
                    {
                    root_0 = (Object)adaptor.nil();


                    char_literal24=(Token)match(input,35,FOLLOW_35_in_restriction_value267); 

                    // es/uca/webservices/testgen/spec/TestSpec.g:56:9: ( restriction_value ( ',' ! restriction_value )* )?
                    int alt7=2;
                    switch ( input.LA(1) ) {
                        case FLOAT:
                        case ID:
                        case INT:
                        case STRING:
                        case TYPE_DATE:
                        case TYPE_DATETIME:
                        case TYPE_DURATION:
                        case TYPE_FLOAT:
                        case TYPE_INT:
                        case TYPE_LIST:
                        case TYPE_STRING:
                        case TYPE_TIME:
                        case TYPE_TUPLE:
                        case 35:
                            {
                            alt7=1;
                            }
                            break;
                    }

                    switch (alt7) {
                        case 1 :
                            // es/uca/webservices/testgen/spec/TestSpec.g:56:10: restriction_value ( ',' ! restriction_value )*
                            {
                            pushFollow(FOLLOW_restriction_value_in_restriction_value271);
                            restriction_value25=restriction_value();

                            state._fsp--;

                            adaptor.addChild(root_0, restriction_value25.getTree());

                            // es/uca/webservices/testgen/spec/TestSpec.g:56:28: ( ',' ! restriction_value )*
                            loop6:
                            do {
                                int alt6=2;
                                switch ( input.LA(1) ) {
                                case 32:
                                    {
                                    alt6=1;
                                    }
                                    break;

                                }

                                switch (alt6) {
                            	case 1 :
                            	    // es/uca/webservices/testgen/spec/TestSpec.g:56:29: ',' ! restriction_value
                            	    {
                            	    char_literal26=(Token)match(input,32,FOLLOW_32_in_restriction_value274); 

                            	    pushFollow(FOLLOW_restriction_value_in_restriction_value277);
                            	    restriction_value27=restriction_value();

                            	    state._fsp--;

                            	    adaptor.addChild(root_0, restriction_value27.getTree());

                            	    }
                            	    break;

                            	default :
                            	    break loop6;
                                }
                            } while (true);


                            }
                            break;

                    }


                    char_literal28=(Token)match(input,36,FOLLOW_36_in_restriction_value284); 

                    }
                    break;

            }
            retval.stop = input.LT(-1);


            retval.tree = (Object)adaptor.rulePostProcessing(root_0);
            adaptor.setTokenBoundaries(retval.tree, retval.start, retval.stop);

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
    	retval.tree = (Object)adaptor.errorNode(input, retval.start, input.LT(-1), re);

        }

        finally {
        	// do for sure before leaving
        }
        return retval;
    }
    // $ANTLR end "restriction_value"

    // Delegated rules


 

    public static final BitSet FOLLOW_line_in_spec72 = new BitSet(new long[]{0x0000000200000000L});
    public static final BitSet FOLLOW_33_in_spec74 = new BitSet(new long[]{0x000000000FFC0802L});
    public static final BitSet FOLLOW_typedef_in_line95 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_declaration_in_line100 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_TYPEDEF_in_typedef117 = new BitSet(new long[]{0x000000000FF80800L});
    public static final BitSet FOLLOW_type_in_typedef120 = new BitSet(new long[]{0x0000000040000800L});
    public static final BitSet FOLLOW_restrictions_in_typedef122 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_typedef125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_declaration131 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_ID_in_declaration133 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_restrictions196 = new BitSet(new long[]{0x0000000080000800L});
    public static final BitSet FOLLOW_restriction_in_restrictions200 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_32_in_restrictions203 = new BitSet(new long[]{0x0000000000000800L});
    public static final BitSet FOLLOW_restriction_in_restrictions206 = new BitSet(new long[]{0x0000000180000000L});
    public static final BitSet FOLLOW_31_in_restrictions213 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ID_in_restriction221 = new BitSet(new long[]{0x0000000400000000L});
    public static final BitSet FOLLOW_34_in_restriction223 = new BitSet(new long[]{0x000000080FFA1A00L});
    public static final BitSet FOLLOW_restriction_value_in_restriction225 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_INT_in_restriction_value244 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_STRING_in_restriction_value250 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_FLOAT_in_restriction_value256 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_type_in_restriction_value261 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_35_in_restriction_value267 = new BitSet(new long[]{0x000000180FFA1A00L});
    public static final BitSet FOLLOW_restriction_value_in_restriction_value271 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_32_in_restriction_value274 = new BitSet(new long[]{0x000000080FFA1A00L});
    public static final BitSet FOLLOW_restriction_value_in_restriction_value277 = new BitSet(new long[]{0x0000001100000000L});
    public static final BitSet FOLLOW_36_in_restriction_value284 = new BitSet(new long[]{0x0000000000000002L});

}