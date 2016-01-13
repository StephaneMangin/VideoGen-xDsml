package org.istic.idm.xtext.videogen.parser.antlr.internal; 

import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.xtext.parser.antlr.AbstractInternalAntlrParser;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.parser.antlr.AntlrDatatypeRuleToken;
import org.istic.idm.xtext.videogen.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalAntlrParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'VideoGen'", "'@Optional'", "'@Mandatory'", "'Alternatives'", "'@Probability('", "')'", "'Sequence'", "'url='", "'description='", "'length='", "'mimetype='", "'NONE'", "'MP4'", "'FLV'", "'MPEGTS'", "'MPEG'", "'WEBM'", "'WMV'", "'AVI'"
    };
    public static final int RULE_STRING=8;
    public static final int RULE_SL_COMMENT=10;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int RULE_RIGHT_BRACKET=5;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int T__30=30;
    public static final int T__31=31;
    public static final int RULE_ID=6;
    public static final int RULE_WS=11;
    public static final int RULE_LEFT_BRACKET=4;
    public static final int RULE_ANY_OTHER=12;
    public static final int T__26=26;
    public static final int T__27=27;
    public static final int T__28=28;
    public static final int RULE_INT=7;
    public static final int T__29=29;
    public static final int T__22=22;
    public static final int RULE_ML_COMMENT=9;
    public static final int T__23=23;
    public static final int T__24=24;
    public static final int T__25=25;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalVideoGenParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalVideoGenParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalVideoGenParser.tokenNames; }
    public String getGrammarFileName() { return "../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g"; }



     	private VideoGenGrammarAccess grammarAccess;
     	
        public InternalVideoGenParser(TokenStream input, VideoGenGrammarAccess grammarAccess) {
            this(input);
            this.grammarAccess = grammarAccess;
            registerRules(grammarAccess.getGrammar());
        }
        
        @Override
        protected String getFirstRuleName() {
        	return "VideoGen";	
       	}
       	
       	@Override
       	protected VideoGenGrammarAccess getGrammarAccess() {
       		return grammarAccess;
       	}



    // $ANTLR start "entryRuleVideoGen"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:68:1: entryRuleVideoGen returns [EObject current=null] : iv_ruleVideoGen= ruleVideoGen EOF ;
    public final EObject entryRuleVideoGen() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleVideoGen = null;


        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:69:2: (iv_ruleVideoGen= ruleVideoGen EOF )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:70:2: iv_ruleVideoGen= ruleVideoGen EOF
            {
             newCompositeNode(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen75);
            iv_ruleVideoGen=ruleVideoGen();

            state._fsp--;

             current =iv_ruleVideoGen; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen85); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:77:1: ruleVideoGen returns [EObject current=null] : (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_statements_2_0= ruleStatement ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleVideoGen() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token this_LEFT_BRACKET_1=null;
        Token this_RIGHT_BRACKET_3=null;
        EObject lv_statements_2_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:80:28: ( (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_statements_2_0= ruleStatement ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:81:1: (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_statements_2_0= ruleStatement ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:81:1: (otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_statements_2_0= ruleStatement ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:81:3: otherlv_0= 'VideoGen' this_LEFT_BRACKET_1= RULE_LEFT_BRACKET ( (lv_statements_2_0= ruleStatement ) )+ this_RIGHT_BRACKET_3= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,13,FOLLOW_13_in_ruleVideoGen122); 

                	newLeafNode(otherlv_0, grammarAccess.getVideoGenAccess().getVideoGenKeyword_0());
                
            this_LEFT_BRACKET_1=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleVideoGen133); 
             
                newLeafNode(this_LEFT_BRACKET_1, grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
                
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:89:1: ( (lv_statements_2_0= ruleStatement ) )+
            int cnt1=0;
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( ((LA1_0>=14 && LA1_0<=16)||LA1_0==19) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:90:1: (lv_statements_2_0= ruleStatement )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:90:1: (lv_statements_2_0= ruleStatement )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:91:3: lv_statements_2_0= ruleStatement
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleStatement_in_ruleVideoGen153);
            	    lv_statements_2_0=ruleStatement();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getVideoGenRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"statements",
            	            		lv_statements_2_0, 
            	            		"Statement");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt1 >= 1 ) break loop1;
                        EarlyExitException eee =
                            new EarlyExitException(1, input);
                        throw eee;
                }
                cnt1++;
            } while (true);

            this_RIGHT_BRACKET_3=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideoGen165); 
             
                newLeafNode(this_RIGHT_BRACKET_3, grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleStatement"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:119:1: entryRuleStatement returns [EObject current=null] : iv_ruleStatement= ruleStatement EOF ;
    public final EObject entryRuleStatement() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleStatement = null;


        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:120:2: (iv_ruleStatement= ruleStatement EOF )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:121:2: iv_ruleStatement= ruleStatement EOF
            {
             newCompositeNode(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement200);
            iv_ruleStatement=ruleStatement();

            state._fsp--;

             current =iv_ruleStatement; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement210); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:128:1: ruleStatement returns [EObject current=null] : ( (otherlv_0= '@Optional' this_Optional_1= ruleOptional ) | ( (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives ) ;
    public final EObject ruleStatement() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token otherlv_2=null;
        EObject this_Optional_1 = null;

        EObject this_Mandatory_3 = null;

        EObject this_Alternatives_4 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:131:28: ( ( (otherlv_0= '@Optional' this_Optional_1= ruleOptional ) | ( (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:132:1: ( (otherlv_0= '@Optional' this_Optional_1= ruleOptional ) | ( (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:132:1: ( (otherlv_0= '@Optional' this_Optional_1= ruleOptional ) | ( (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory ) | this_Alternatives_4= ruleAlternatives )
            int alt3=3;
            switch ( input.LA(1) ) {
            case 14:
                {
                alt3=1;
                }
                break;
            case 15:
            case 19:
                {
                alt3=2;
                }
                break;
            case 16:
                {
                alt3=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }

            switch (alt3) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:132:2: (otherlv_0= '@Optional' this_Optional_1= ruleOptional )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:132:2: (otherlv_0= '@Optional' this_Optional_1= ruleOptional )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:132:4: otherlv_0= '@Optional' this_Optional_1= ruleOptional
                    {
                    otherlv_0=(Token)match(input,14,FOLLOW_14_in_ruleStatement248); 

                        	newLeafNode(otherlv_0, grammarAccess.getStatementAccess().getOptionalKeyword_0_0());
                        
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
                        
                    pushFollow(FOLLOW_ruleOptional_in_ruleStatement270);
                    this_Optional_1=ruleOptional();

                    state._fsp--;

                     
                            current = this_Optional_1; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:146:6: ( (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:146:6: ( (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:146:7: (otherlv_2= '@Mandatory' )? this_Mandatory_3= ruleMandatory
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:146:7: (otherlv_2= '@Mandatory' )?
                    int alt2=2;
                    int LA2_0 = input.LA(1);

                    if ( (LA2_0==15) ) {
                        alt2=1;
                    }
                    switch (alt2) {
                        case 1 :
                            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:146:9: otherlv_2= '@Mandatory'
                            {
                            otherlv_2=(Token)match(input,15,FOLLOW_15_in_ruleStatement290); 

                                	newLeafNode(otherlv_2, grammarAccess.getStatementAccess().getMandatoryKeyword_1_0());
                                

                            }
                            break;

                    }

                     
                            newCompositeNode(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
                        
                    pushFollow(FOLLOW_ruleMandatory_in_ruleStatement314);
                    this_Mandatory_3=ruleMandatory();

                    state._fsp--;

                     
                            current = this_Mandatory_3; 
                            afterParserOrEnumRuleCall();
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:161:5: this_Alternatives_4= ruleAlternatives
                    {
                     
                            newCompositeNode(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                        
                    pushFollow(FOLLOW_ruleAlternatives_in_ruleStatement342);
                    this_Alternatives_4=ruleAlternatives();

                    state._fsp--;

                     
                            current = this_Alternatives_4; 
                            afterParserOrEnumRuleCall();
                        

                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAlternatives"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:177:1: entryRuleAlternatives returns [EObject current=null] : iv_ruleAlternatives= ruleAlternatives EOF ;
    public final EObject entryRuleAlternatives() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleAlternatives = null;


        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:178:2: (iv_ruleAlternatives= ruleAlternatives EOF )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:179:2: iv_ruleAlternatives= ruleAlternatives EOF
            {
             newCompositeNode(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives377);
            iv_ruleAlternatives=ruleAlternatives();

            state._fsp--;

             current =iv_ruleAlternatives; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives387); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:186:1: ruleAlternatives returns [EObject current=null] : (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_options_3_0= ruleOptional ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleAlternatives() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token this_RIGHT_BRACKET_4=null;
        EObject lv_options_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:189:28: ( (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_options_3_0= ruleOptional ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:190:1: (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_options_3_0= ruleOptional ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:190:1: (otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_options_3_0= ruleOptional ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:190:3: otherlv_0= 'Alternatives' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( (lv_options_3_0= ruleOptional ) )+ this_RIGHT_BRACKET_4= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,16,FOLLOW_16_in_ruleAlternatives424); 

                	newLeafNode(otherlv_0, grammarAccess.getAlternativesAccess().getAlternativesKeyword_0());
                
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:194:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:195:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:195:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:196:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleAlternatives441); 

            			newLeafNode(lv_name_1_0, grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getAlternativesRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleAlternatives457); 
             
                newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
                
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:216:1: ( (lv_options_3_0= ruleOptional ) )+
            int cnt4=0;
            loop4:
            do {
                int alt4=2;
                int LA4_0 = input.LA(1);

                if ( (LA4_0==17||LA4_0==19) ) {
                    alt4=1;
                }


                switch (alt4) {
            	case 1 :
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:217:1: (lv_options_3_0= ruleOptional )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:217:1: (lv_options_3_0= ruleOptional )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:218:3: lv_options_3_0= ruleOptional
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleOptional_in_ruleAlternatives477);
            	    lv_options_3_0=ruleOptional();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getAlternativesRule());
            	    	        }
            	           		add(
            	           			current, 
            	           			"options",
            	            		lv_options_3_0, 
            	            		"Optional");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }
            	    break;

            	default :
            	    if ( cnt4 >= 1 ) break loop4;
                        EarlyExitException eee =
                            new EarlyExitException(4, input);
                        throw eee;
                }
                cnt4++;
            } while (true);

            this_RIGHT_BRACKET_4=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleAlternatives489); 
             
                newLeafNode(this_RIGHT_BRACKET_4, grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleMandatory"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:246:1: entryRuleMandatory returns [EObject current=null] : iv_ruleMandatory= ruleMandatory EOF ;
    public final EObject entryRuleMandatory() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleMandatory = null;


        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:247:2: (iv_ruleMandatory= ruleMandatory EOF )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:248:2: iv_ruleMandatory= ruleMandatory EOF
            {
             newCompositeNode(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory524);
            iv_ruleMandatory=ruleMandatory();

            state._fsp--;

             current =iv_ruleMandatory; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory534); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:255:1: ruleMandatory returns [EObject current=null] : ( (lv_sequence_0_0= ruleSequence ) ) ;
    public final EObject ruleMandatory() throws RecognitionException {
        EObject current = null;

        EObject lv_sequence_0_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:258:28: ( ( (lv_sequence_0_0= ruleSequence ) ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:259:1: ( (lv_sequence_0_0= ruleSequence ) )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:259:1: ( (lv_sequence_0_0= ruleSequence ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:260:1: (lv_sequence_0_0= ruleSequence )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:260:1: (lv_sequence_0_0= ruleSequence )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:261:3: lv_sequence_0_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            	    
            pushFollow(FOLLOW_ruleSequence_in_ruleMandatory579);
            lv_sequence_0_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getMandatoryRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_0_0, 
                    		"Sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:285:1: entryRuleOptional returns [EObject current=null] : iv_ruleOptional= ruleOptional EOF ;
    public final EObject entryRuleOptional() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleOptional = null;


        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:286:2: (iv_ruleOptional= ruleOptional EOF )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:287:2: iv_ruleOptional= ruleOptional EOF
            {
             newCompositeNode(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional614);
            iv_ruleOptional=ruleOptional();

            state._fsp--;

             current =iv_ruleOptional; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional624); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:294:1: ruleOptional returns [EObject current=null] : ( (otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')' )? ( (lv_sequence_3_0= ruleSequence ) ) ) ;
    public final EObject ruleOptional() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_probability_1_0=null;
        Token otherlv_2=null;
        EObject lv_sequence_3_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:297:28: ( ( (otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')' )? ( (lv_sequence_3_0= ruleSequence ) ) ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:298:1: ( (otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')' )? ( (lv_sequence_3_0= ruleSequence ) ) )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:298:1: ( (otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')' )? ( (lv_sequence_3_0= ruleSequence ) ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:298:2: (otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')' )? ( (lv_sequence_3_0= ruleSequence ) )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:298:2: (otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')' )?
            int alt5=2;
            int LA5_0 = input.LA(1);

            if ( (LA5_0==17) ) {
                alt5=1;
            }
            switch (alt5) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:298:4: otherlv_0= '@Probability(' ( (lv_probability_1_0= RULE_INT ) ) otherlv_2= ')'
                    {
                    otherlv_0=(Token)match(input,17,FOLLOW_17_in_ruleOptional662); 

                        	newLeafNode(otherlv_0, grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0());
                        
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:302:1: ( (lv_probability_1_0= RULE_INT ) )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:303:1: (lv_probability_1_0= RULE_INT )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:303:1: (lv_probability_1_0= RULE_INT )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:304:3: lv_probability_1_0= RULE_INT
                    {
                    lv_probability_1_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleOptional679); 

                    			newLeafNode(lv_probability_1_0, grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
                    		

                    	        if (current==null) {
                    	            current = createModelElement(grammarAccess.getOptionalRule());
                    	        }
                           		setWithLastConsumed(
                           			current, 
                           			"probability",
                            		lv_probability_1_0, 
                            		"INT");
                    	    

                    }


                    }

                    otherlv_2=(Token)match(input,18,FOLLOW_18_in_ruleOptional696); 

                        	newLeafNode(otherlv_2, grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2());
                        

                    }
                    break;

            }

            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:324:3: ( (lv_sequence_3_0= ruleSequence ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:325:1: (lv_sequence_3_0= ruleSequence )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:325:1: (lv_sequence_3_0= ruleSequence )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:326:3: lv_sequence_3_0= ruleSequence
            {
             
            	        newCompositeNode(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            	    
            pushFollow(FOLLOW_ruleSequence_in_ruleOptional719);
            lv_sequence_3_0=ruleSequence();

            state._fsp--;


            	        if (current==null) {
            	            current = createModelElementForParent(grammarAccess.getOptionalRule());
            	        }
                   		set(
                   			current, 
                   			"sequence",
                    		lv_sequence_3_0, 
                    		"Sequence");
            	        afterParserOrEnumRuleCall();
            	    

            }


            }


            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleSequence"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:350:1: entryRuleSequence returns [EObject current=null] : iv_ruleSequence= ruleSequence EOF ;
    public final EObject entryRuleSequence() throws RecognitionException {
        EObject current = null;

        EObject iv_ruleSequence = null;


        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:351:2: (iv_ruleSequence= ruleSequence EOF )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:352:2: iv_ruleSequence= ruleSequence EOF
            {
             newCompositeNode(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence755);
            iv_ruleSequence=ruleSequence();

            state._fsp--;

             current =iv_ruleSequence; 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence765); 

            }

        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:359:1: ruleSequence returns [EObject current=null] : (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) ) ) this_RIGHT_BRACKET_12= RULE_RIGHT_BRACKET ) ;
    public final EObject ruleSequence() throws RecognitionException {
        EObject current = null;

        Token otherlv_0=null;
        Token lv_name_1_0=null;
        Token this_LEFT_BRACKET_2=null;
        Token otherlv_4=null;
        Token lv_url_5_0=null;
        Token otherlv_6=null;
        Token lv_description_7_0=null;
        Token otherlv_8=null;
        Token lv_length_9_0=null;
        Token otherlv_10=null;
        Token this_RIGHT_BRACKET_12=null;
        Enumerator lv_mimetype_11_0 = null;


         enterRule(); 
            
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:362:28: ( (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) ) ) this_RIGHT_BRACKET_12= RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:363:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) ) ) this_RIGHT_BRACKET_12= RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:363:1: (otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) ) ) this_RIGHT_BRACKET_12= RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:363:3: otherlv_0= 'Sequence' ( (lv_name_1_0= RULE_ID ) ) this_LEFT_BRACKET_2= RULE_LEFT_BRACKET ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) ) ) this_RIGHT_BRACKET_12= RULE_RIGHT_BRACKET
            {
            otherlv_0=(Token)match(input,19,FOLLOW_19_in_ruleSequence802); 

                	newLeafNode(otherlv_0, grammarAccess.getSequenceAccess().getSequenceKeyword_0());
                
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:367:1: ( (lv_name_1_0= RULE_ID ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:368:1: (lv_name_1_0= RULE_ID )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:368:1: (lv_name_1_0= RULE_ID )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:369:3: lv_name_1_0= RULE_ID
            {
            lv_name_1_0=(Token)match(input,RULE_ID,FOLLOW_RULE_ID_in_ruleSequence819); 

            			newLeafNode(lv_name_1_0, grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            		

            	        if (current==null) {
            	            current = createModelElement(grammarAccess.getSequenceRule());
            	        }
                   		setWithLastConsumed(
                   			current, 
                   			"name",
                    		lv_name_1_0, 
                    		"ID");
            	    

            }


            }

            this_LEFT_BRACKET_2=(Token)match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_ruleSequence835); 
             
                newLeafNode(this_LEFT_BRACKET_2, grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
                
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:389:1: ( ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:391:1: ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:391:1: ( ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:392:2: ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?)
            {
             
            	  getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:395:2: ( ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?)
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:396:3: ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+ {...}?
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:396:3: ( ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) ) | ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) ) | ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) ) )+
            int cnt8=0;
            loop8:
            do {
                int alt8=4;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==RULE_STRING||LA8_0==20) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                    alt8=1;
                }
                else if ( LA8_0 ==22 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                    alt8=2;
                }
                else if ( LA8_0 ==23 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                    alt8=3;
                }


                switch (alt8) {
            	case 1 :
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:398:4: ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:398:4: ({...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:399:5: {...}? => ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)");
            	    }
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:399:105: ( ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:400:6: ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
            	    	 				
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:6: ({...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:7: {...}? => ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:16: ( ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )? )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:17: ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) ) (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )?
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:17: ( (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:18: (otherlv_4= 'url=' )? ( (lv_url_5_0= RULE_STRING ) )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:18: (otherlv_4= 'url=' )?
            	    int alt6=2;
            	    int LA6_0 = input.LA(1);

            	    if ( (LA6_0==20) ) {
            	        alt6=1;
            	    }
            	    switch (alt6) {
            	        case 1 :
            	            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:403:20: otherlv_4= 'url='
            	            {
            	            otherlv_4=(Token)match(input,20,FOLLOW_20_in_ruleSequence894); 

            	                	newLeafNode(otherlv_4, grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0());
            	                

            	            }
            	            break;

            	    }

            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:407:3: ( (lv_url_5_0= RULE_STRING ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:408:1: (lv_url_5_0= RULE_STRING )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:408:1: (lv_url_5_0= RULE_STRING )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:409:3: lv_url_5_0= RULE_STRING
            	    {
            	    lv_url_5_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence913); 

            	    			newLeafNode(lv_url_5_0, grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"url",
            	            		lv_url_5_0, 
            	            		"STRING");
            	    	    

            	    }


            	    }


            	    }

            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:425:3: (otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) ) )?
            	    int alt7=2;
            	    int LA7_0 = input.LA(1);

            	    if ( (LA7_0==21) ) {
            	        alt7=1;
            	    }
            	    switch (alt7) {
            	        case 1 :
            	            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:425:5: otherlv_6= 'description=' ( (lv_description_7_0= RULE_STRING ) )
            	            {
            	            otherlv_6=(Token)match(input,21,FOLLOW_21_in_ruleSequence932); 

            	                	newLeafNode(otherlv_6, grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0());
            	                
            	            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:429:1: ( (lv_description_7_0= RULE_STRING ) )
            	            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:430:1: (lv_description_7_0= RULE_STRING )
            	            {
            	            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:430:1: (lv_description_7_0= RULE_STRING )
            	            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:431:3: lv_description_7_0= RULE_STRING
            	            {
            	            lv_description_7_0=(Token)match(input,RULE_STRING,FOLLOW_RULE_STRING_in_ruleSequence949); 

            	            			newLeafNode(lv_description_7_0, grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
            	            		

            	            	        if (current==null) {
            	            	            current = createModelElement(grammarAccess.getSequenceRule());
            	            	        }
            	                   		setWithLastConsumed(
            	                   			current, 
            	                   			"description",
            	                    		lv_description_7_0, 
            	                    		"STRING");
            	            	    

            	            }


            	            }


            	            }
            	            break;

            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 2 :
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:454:4: ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:454:4: ({...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:455:5: {...}? => ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)");
            	    }
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:455:105: ( ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:456:6: ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
            	    	 				
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:459:6: ({...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:459:7: {...}? => (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:459:16: (otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:459:18: otherlv_8= 'length=' ( (lv_length_9_0= RULE_INT ) )
            	    {
            	    otherlv_8=(Token)match(input,22,FOLLOW_22_in_ruleSequence1024); 

            	        	newLeafNode(otherlv_8, grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0());
            	        
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:463:1: ( (lv_length_9_0= RULE_INT ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:464:1: (lv_length_9_0= RULE_INT )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:464:1: (lv_length_9_0= RULE_INT )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:465:3: lv_length_9_0= RULE_INT
            	    {
            	    lv_length_9_0=(Token)match(input,RULE_INT,FOLLOW_RULE_INT_in_ruleSequence1041); 

            	    			newLeafNode(lv_length_9_0, grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
            	    		

            	    	        if (current==null) {
            	    	            current = createModelElement(grammarAccess.getSequenceRule());
            	    	        }
            	           		setWithLastConsumed(
            	           			current, 
            	           			"length",
            	            		lv_length_9_0, 
            	            		"INT");
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


            	    }


            	    }
            	    break;
            	case 3 :
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:488:4: ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:488:4: ({...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:489:5: {...}? => ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) )
            	    {
            	    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)");
            	    }
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:489:105: ( ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:490:6: ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) )
            	    {
            	     
            	    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
            	    	 				
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:493:6: ({...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:493:7: {...}? => (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) )
            	    {
            	    if ( !((true)) ) {
            	        throw new FailedPredicateException(input, "ruleSequence", "true");
            	    }
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:493:16: (otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:493:18: otherlv_10= 'mimetype=' ( (lv_mimetype_11_0= ruleMimetypes_Enum ) )
            	    {
            	    otherlv_10=(Token)match(input,23,FOLLOW_23_in_ruleSequence1114); 

            	        	newLeafNode(otherlv_10, grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0());
            	        
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:497:1: ( (lv_mimetype_11_0= ruleMimetypes_Enum ) )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:498:1: (lv_mimetype_11_0= ruleMimetypes_Enum )
            	    {
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:498:1: (lv_mimetype_11_0= ruleMimetypes_Enum )
            	    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:499:3: lv_mimetype_11_0= ruleMimetypes_Enum
            	    {
            	     
            	    	        newCompositeNode(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 
            	    	    
            	    pushFollow(FOLLOW_ruleMimetypes_Enum_in_ruleSequence1135);
            	    lv_mimetype_11_0=ruleMimetypes_Enum();

            	    state._fsp--;


            	    	        if (current==null) {
            	    	            current = createModelElementForParent(grammarAccess.getSequenceRule());
            	    	        }
            	           		set(
            	           			current, 
            	           			"mimetype",
            	            		lv_mimetype_11_0, 
            	            		"Mimetypes_Enum");
            	    	        afterParserOrEnumRuleCall();
            	    	    

            	    }


            	    }


            	    }


            	    }

            	     
            	    	 				  getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	    	 				

            	    }


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

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "ruleSequence", "getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3())");
            }

            }


            }

             
            	  getUnorderedGroupHelper().leave(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	

            }

            this_RIGHT_BRACKET_12=(Token)match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_ruleSequence1193); 
             
                newLeafNode(this_RIGHT_BRACKET_12, grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
                

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "ruleMimetypes_Enum"
    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:542:1: ruleMimetypes_Enum returns [Enumerator current=null] : ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MP4' ) | (enumLiteral_2= 'FLV' ) | (enumLiteral_3= 'MPEGTS' ) | (enumLiteral_4= 'MPEG' ) | (enumLiteral_5= 'WEBM' ) | (enumLiteral_6= 'WMV' ) | (enumLiteral_7= 'AVI' ) ) ;
    public final Enumerator ruleMimetypes_Enum() throws RecognitionException {
        Enumerator current = null;

        Token enumLiteral_0=null;
        Token enumLiteral_1=null;
        Token enumLiteral_2=null;
        Token enumLiteral_3=null;
        Token enumLiteral_4=null;
        Token enumLiteral_5=null;
        Token enumLiteral_6=null;
        Token enumLiteral_7=null;

         enterRule(); 
        try {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:544:28: ( ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MP4' ) | (enumLiteral_2= 'FLV' ) | (enumLiteral_3= 'MPEGTS' ) | (enumLiteral_4= 'MPEG' ) | (enumLiteral_5= 'WEBM' ) | (enumLiteral_6= 'WMV' ) | (enumLiteral_7= 'AVI' ) ) )
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:545:1: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MP4' ) | (enumLiteral_2= 'FLV' ) | (enumLiteral_3= 'MPEGTS' ) | (enumLiteral_4= 'MPEG' ) | (enumLiteral_5= 'WEBM' ) | (enumLiteral_6= 'WMV' ) | (enumLiteral_7= 'AVI' ) )
            {
            // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:545:1: ( (enumLiteral_0= 'NONE' ) | (enumLiteral_1= 'MP4' ) | (enumLiteral_2= 'FLV' ) | (enumLiteral_3= 'MPEGTS' ) | (enumLiteral_4= 'MPEG' ) | (enumLiteral_5= 'WEBM' ) | (enumLiteral_6= 'WMV' ) | (enumLiteral_7= 'AVI' ) )
            int alt9=8;
            switch ( input.LA(1) ) {
            case 24:
                {
                alt9=1;
                }
                break;
            case 25:
                {
                alt9=2;
                }
                break;
            case 26:
                {
                alt9=3;
                }
                break;
            case 27:
                {
                alt9=4;
                }
                break;
            case 28:
                {
                alt9=5;
                }
                break;
            case 29:
                {
                alt9=6;
                }
                break;
            case 30:
                {
                alt9=7;
                }
                break;
            case 31:
                {
                alt9=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }

            switch (alt9) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:545:2: (enumLiteral_0= 'NONE' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:545:2: (enumLiteral_0= 'NONE' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:545:4: enumLiteral_0= 'NONE'
                    {
                    enumLiteral_0=(Token)match(input,24,FOLLOW_24_in_ruleMimetypes_Enum1242); 

                            current = grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_0, grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0()); 
                        

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:551:6: (enumLiteral_1= 'MP4' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:551:6: (enumLiteral_1= 'MP4' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:551:8: enumLiteral_1= 'MP4'
                    {
                    enumLiteral_1=(Token)match(input,25,FOLLOW_25_in_ruleMimetypes_Enum1259); 

                            current = grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_1, grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1()); 
                        

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:557:6: (enumLiteral_2= 'FLV' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:557:6: (enumLiteral_2= 'FLV' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:557:8: enumLiteral_2= 'FLV'
                    {
                    enumLiteral_2=(Token)match(input,26,FOLLOW_26_in_ruleMimetypes_Enum1276); 

                            current = grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_2, grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2()); 
                        

                    }


                    }
                    break;
                case 4 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:563:6: (enumLiteral_3= 'MPEGTS' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:563:6: (enumLiteral_3= 'MPEGTS' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:563:8: enumLiteral_3= 'MPEGTS'
                    {
                    enumLiteral_3=(Token)match(input,27,FOLLOW_27_in_ruleMimetypes_Enum1293); 

                            current = grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_3, grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3()); 
                        

                    }


                    }
                    break;
                case 5 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:569:6: (enumLiteral_4= 'MPEG' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:569:6: (enumLiteral_4= 'MPEG' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:569:8: enumLiteral_4= 'MPEG'
                    {
                    enumLiteral_4=(Token)match(input,28,FOLLOW_28_in_ruleMimetypes_Enum1310); 

                            current = grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_4, grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4()); 
                        

                    }


                    }
                    break;
                case 6 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:575:6: (enumLiteral_5= 'WEBM' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:575:6: (enumLiteral_5= 'WEBM' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:575:8: enumLiteral_5= 'WEBM'
                    {
                    enumLiteral_5=(Token)match(input,29,FOLLOW_29_in_ruleMimetypes_Enum1327); 

                            current = grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_5, grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5()); 
                        

                    }


                    }
                    break;
                case 7 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:581:6: (enumLiteral_6= 'WMV' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:581:6: (enumLiteral_6= 'WMV' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:581:8: enumLiteral_6= 'WMV'
                    {
                    enumLiteral_6=(Token)match(input,30,FOLLOW_30_in_ruleMimetypes_Enum1344); 

                            current = grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_6, grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6()); 
                        

                    }


                    }
                    break;
                case 8 :
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:587:6: (enumLiteral_7= 'AVI' )
                    {
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:587:6: (enumLiteral_7= 'AVI' )
                    // ../org.istic.idm.xtext.videogen/src-gen/org/istic/idm/xtext/videogen/parser/antlr/internal/InternalVideoGen.g:587:8: enumLiteral_7= 'AVI'
                    {
                    enumLiteral_7=(Token)match(input,31,FOLLOW_31_in_ruleMimetypes_Enum1361); 

                            current = grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7().getEnumLiteral().getInstance();
                            newLeafNode(enumLiteral_7, grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7()); 
                        

                    }


                    }
                    break;

            }


            }

             leaveRule(); 
        }
         
            catch (RecognitionException re) { 
                recover(input,re); 
                appendSkippedTokens();
            } 
        finally {
        }
        return current;
    }
    // $ANTLR end "ruleMimetypes_Enum"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen75 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen85 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_ruleVideoGen122 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleVideoGen133 = new BitSet(new long[]{0x000000000009C000L});
    public static final BitSet FOLLOW_ruleStatement_in_ruleVideoGen153 = new BitSet(new long[]{0x000000000009C020L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleVideoGen165 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement200 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement210 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_ruleStatement248 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleStatement270 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_ruleStatement290 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_ruleMandatory_in_ruleStatement314 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_ruleStatement342 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives377 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives387 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_ruleAlternatives424 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleAlternatives441 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleAlternatives457 = new BitSet(new long[]{0x00000000000A8000L});
    public static final BitSet FOLLOW_ruleOptional_in_ruleAlternatives477 = new BitSet(new long[]{0x00000000000A8020L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleAlternatives489 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory524 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory534 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleMandatory579 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional614 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_ruleOptional662 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleOptional679 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_18_in_ruleOptional696 = new BitSet(new long[]{0x0000000000088000L});
    public static final BitSet FOLLOW_ruleSequence_in_ruleOptional719 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence755 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence765 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_ruleSequence802 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_RULE_ID_in_ruleSequence819 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_ruleSequence835 = new BitSet(new long[]{0x0000000000D00100L});
    public static final BitSet FOLLOW_20_in_ruleSequence894 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence913 = new BitSet(new long[]{0x0000000000F00120L});
    public static final BitSet FOLLOW_21_in_ruleSequence932 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_RULE_STRING_in_ruleSequence949 = new BitSet(new long[]{0x0000000000D00120L});
    public static final BitSet FOLLOW_22_in_ruleSequence1024 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_RULE_INT_in_ruleSequence1041 = new BitSet(new long[]{0x0000000000D00120L});
    public static final BitSet FOLLOW_23_in_ruleSequence1114 = new BitSet(new long[]{0x00000000FF000000L});
    public static final BitSet FOLLOW_ruleMimetypes_Enum_in_ruleSequence1135 = new BitSet(new long[]{0x0000000000D00120L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_ruleSequence1193 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_ruleMimetypes_Enum1242 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_ruleMimetypes_Enum1259 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_ruleMimetypes_Enum1276 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_ruleMimetypes_Enum1293 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_ruleMimetypes_Enum1310 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_ruleMimetypes_Enum1327 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_ruleMimetypes_Enum1344 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_ruleMimetypes_Enum1361 = new BitSet(new long[]{0x0000000000000002L});

}
