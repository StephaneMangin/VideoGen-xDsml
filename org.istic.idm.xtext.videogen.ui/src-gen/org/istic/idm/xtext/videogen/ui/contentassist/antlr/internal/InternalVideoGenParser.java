package org.istic.idm.xtext.videogen.ui.contentassist.antlr.internal; 

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.DFA;
import org.istic.idm.xtext.videogen.services.VideoGenGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalVideoGenParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_LEFT_BRACKET", "RULE_RIGHT_BRACKET", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'NONE'", "'MP4'", "'FLV'", "'MPEGTS'", "'MPEG'", "'WEBM'", "'WMV'", "'AVI'", "'VideoGen'", "'@Optional'", "'@Mandatory'", "'Alternatives'", "'@Probability('", "')'", "'Sequence'", "'url='", "'description='", "'length='", "'mimetype='"
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
    public String getGrammarFileName() { return "../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g"; }


     
     	private VideoGenGrammarAccess grammarAccess;
     	
        public void setGrammarAccess(VideoGenGrammarAccess grammarAccess) {
        	this.grammarAccess = grammarAccess;
        }
        
        @Override
        protected Grammar getGrammar() {
        	return grammarAccess.getGrammar();
        }
        
        @Override
        protected String getValueForTokenName(String tokenName) {
        	return tokenName;
        }




    // $ANTLR start "entryRuleVideoGen"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:60:1: entryRuleVideoGen : ruleVideoGen EOF ;
    public final void entryRuleVideoGen() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:61:1: ( ruleVideoGen EOF )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:62:1: ruleVideoGen EOF
            {
             before(grammarAccess.getVideoGenRule()); 
            pushFollow(FOLLOW_ruleVideoGen_in_entryRuleVideoGen61);
            ruleVideoGen();

            state._fsp--;

             after(grammarAccess.getVideoGenRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleVideoGen68); 

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
    // $ANTLR end "entryRuleVideoGen"


    // $ANTLR start "ruleVideoGen"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:69:1: ruleVideoGen : ( ( rule__VideoGen__Group__0 ) ) ;
    public final void ruleVideoGen() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:73:2: ( ( ( rule__VideoGen__Group__0 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:74:1: ( ( rule__VideoGen__Group__0 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:75:1: ( rule__VideoGen__Group__0 )
            {
             before(grammarAccess.getVideoGenAccess().getGroup()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:76:1: ( rule__VideoGen__Group__0 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:76:2: rule__VideoGen__Group__0
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94);
            rule__VideoGen__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleVideoGen"


    // $ANTLR start "entryRuleStatement"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:88:1: entryRuleStatement : ruleStatement EOF ;
    public final void entryRuleStatement() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:89:1: ( ruleStatement EOF )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:90:1: ruleStatement EOF
            {
             before(grammarAccess.getStatementRule()); 
            pushFollow(FOLLOW_ruleStatement_in_entryRuleStatement121);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getStatementRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleStatement128); 

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
    // $ANTLR end "entryRuleStatement"


    // $ANTLR start "ruleStatement"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:97:1: ruleStatement : ( ( rule__Statement__Alternatives ) ) ;
    public final void ruleStatement() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:101:2: ( ( ( rule__Statement__Alternatives ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Statement__Alternatives ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:102:1: ( ( rule__Statement__Alternatives ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:103:1: ( rule__Statement__Alternatives )
            {
             before(grammarAccess.getStatementAccess().getAlternatives()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:104:1: ( rule__Statement__Alternatives )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:104:2: rule__Statement__Alternatives
            {
            pushFollow(FOLLOW_rule__Statement__Alternatives_in_ruleStatement154);
            rule__Statement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getStatementAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleStatement"


    // $ANTLR start "entryRuleAlternatives"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:116:1: entryRuleAlternatives : ruleAlternatives EOF ;
    public final void entryRuleAlternatives() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:117:1: ( ruleAlternatives EOF )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:118:1: ruleAlternatives EOF
            {
             before(grammarAccess.getAlternativesRule()); 
            pushFollow(FOLLOW_ruleAlternatives_in_entryRuleAlternatives181);
            ruleAlternatives();

            state._fsp--;

             after(grammarAccess.getAlternativesRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleAlternatives188); 

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
    // $ANTLR end "entryRuleAlternatives"


    // $ANTLR start "ruleAlternatives"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:125:1: ruleAlternatives : ( ( rule__Alternatives__Group__0 ) ) ;
    public final void ruleAlternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:129:2: ( ( ( rule__Alternatives__Group__0 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Alternatives__Group__0 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:130:1: ( ( rule__Alternatives__Group__0 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:131:1: ( rule__Alternatives__Group__0 )
            {
             before(grammarAccess.getAlternativesAccess().getGroup()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:132:1: ( rule__Alternatives__Group__0 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:132:2: rule__Alternatives__Group__0
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives214);
            rule__Alternatives__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleAlternatives"


    // $ANTLR start "entryRuleMandatory"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:144:1: entryRuleMandatory : ruleMandatory EOF ;
    public final void entryRuleMandatory() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:145:1: ( ruleMandatory EOF )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:146:1: ruleMandatory EOF
            {
             before(grammarAccess.getMandatoryRule()); 
            pushFollow(FOLLOW_ruleMandatory_in_entryRuleMandatory241);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getMandatoryRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleMandatory248); 

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
    // $ANTLR end "entryRuleMandatory"


    // $ANTLR start "ruleMandatory"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:153:1: ruleMandatory : ( ( rule__Mandatory__SequenceAssignment ) ) ;
    public final void ruleMandatory() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:157:2: ( ( ( rule__Mandatory__SequenceAssignment ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Mandatory__SequenceAssignment ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:158:1: ( ( rule__Mandatory__SequenceAssignment ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:159:1: ( rule__Mandatory__SequenceAssignment )
            {
             before(grammarAccess.getMandatoryAccess().getSequenceAssignment()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:160:1: ( rule__Mandatory__SequenceAssignment )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:160:2: rule__Mandatory__SequenceAssignment
            {
            pushFollow(FOLLOW_rule__Mandatory__SequenceAssignment_in_ruleMandatory274);
            rule__Mandatory__SequenceAssignment();

            state._fsp--;


            }

             after(grammarAccess.getMandatoryAccess().getSequenceAssignment()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMandatory"


    // $ANTLR start "entryRuleOptional"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:172:1: entryRuleOptional : ruleOptional EOF ;
    public final void entryRuleOptional() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:173:1: ( ruleOptional EOF )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:174:1: ruleOptional EOF
            {
             before(grammarAccess.getOptionalRule()); 
            pushFollow(FOLLOW_ruleOptional_in_entryRuleOptional301);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getOptionalRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleOptional308); 

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
    // $ANTLR end "entryRuleOptional"


    // $ANTLR start "ruleOptional"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:181:1: ruleOptional : ( ( rule__Optional__Group__0 ) ) ;
    public final void ruleOptional() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:185:2: ( ( ( rule__Optional__Group__0 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Optional__Group__0 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:186:1: ( ( rule__Optional__Group__0 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:187:1: ( rule__Optional__Group__0 )
            {
             before(grammarAccess.getOptionalAccess().getGroup()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:188:1: ( rule__Optional__Group__0 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:188:2: rule__Optional__Group__0
            {
            pushFollow(FOLLOW_rule__Optional__Group__0_in_ruleOptional334);
            rule__Optional__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleOptional"


    // $ANTLR start "entryRuleSequence"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:200:1: entryRuleSequence : ruleSequence EOF ;
    public final void entryRuleSequence() throws RecognitionException {
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:201:1: ( ruleSequence EOF )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:202:1: ruleSequence EOF
            {
             before(grammarAccess.getSequenceRule()); 
            pushFollow(FOLLOW_ruleSequence_in_entryRuleSequence361);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getSequenceRule()); 
            match(input,EOF,FOLLOW_EOF_in_entryRuleSequence368); 

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
    // $ANTLR end "entryRuleSequence"


    // $ANTLR start "ruleSequence"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:209:1: ruleSequence : ( ( rule__Sequence__Group__0 ) ) ;
    public final void ruleSequence() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:213:2: ( ( ( rule__Sequence__Group__0 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__Sequence__Group__0 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:214:1: ( ( rule__Sequence__Group__0 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:215:1: ( rule__Sequence__Group__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:216:1: ( rule__Sequence__Group__0 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:216:2: rule__Sequence__Group__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0_in_ruleSequence394);
            rule__Sequence__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleSequence"


    // $ANTLR start "ruleMimetypes_Enum"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:229:1: ruleMimetypes_Enum : ( ( rule__Mimetypes_Enum__Alternatives ) ) ;
    public final void ruleMimetypes_Enum() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:233:1: ( ( ( rule__Mimetypes_Enum__Alternatives ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ( ( rule__Mimetypes_Enum__Alternatives ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:234:1: ( ( rule__Mimetypes_Enum__Alternatives ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:235:1: ( rule__Mimetypes_Enum__Alternatives )
            {
             before(grammarAccess.getMimetypes_EnumAccess().getAlternatives()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:236:1: ( rule__Mimetypes_Enum__Alternatives )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:236:2: rule__Mimetypes_Enum__Alternatives
            {
            pushFollow(FOLLOW_rule__Mimetypes_Enum__Alternatives_in_ruleMimetypes_Enum431);
            rule__Mimetypes_Enum__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getMimetypes_EnumAccess().getAlternatives()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "ruleMimetypes_Enum"


    // $ANTLR start "rule__Statement__Alternatives"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:247:1: rule__Statement__Alternatives : ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) );
    public final void rule__Statement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:251:1: ( ( ( rule__Statement__Group_0__0 ) ) | ( ( rule__Statement__Group_1__0 ) ) | ( ruleAlternatives ) )
            int alt1=3;
            switch ( input.LA(1) ) {
            case 22:
                {
                alt1=1;
                }
                break;
            case 23:
            case 27:
                {
                alt1=2;
                }
                break;
            case 24:
                {
                alt1=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 1, 0, input);

                throw nvae;
            }

            switch (alt1) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:252:1: ( ( rule__Statement__Group_0__0 ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:252:1: ( ( rule__Statement__Group_0__0 ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:253:1: ( rule__Statement__Group_0__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_0()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:254:1: ( rule__Statement__Group_0__0 )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:254:2: rule__Statement__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives466);
                    rule__Statement__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:258:6: ( ( rule__Statement__Group_1__0 ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:258:6: ( ( rule__Statement__Group_1__0 ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:259:1: ( rule__Statement__Group_1__0 )
                    {
                     before(grammarAccess.getStatementAccess().getGroup_1()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:260:1: ( rule__Statement__Group_1__0 )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:260:2: rule__Statement__Group_1__0
                    {
                    pushFollow(FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives484);
                    rule__Statement__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getStatementAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:264:6: ( ruleAlternatives )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:264:6: ( ruleAlternatives )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:265:1: ruleAlternatives
                    {
                     before(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 
                    pushFollow(FOLLOW_ruleAlternatives_in_rule__Statement__Alternatives502);
                    ruleAlternatives();

                    state._fsp--;

                     after(grammarAccess.getStatementAccess().getAlternativesParserRuleCall_2()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Alternatives"


    // $ANTLR start "rule__Mimetypes_Enum__Alternatives"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:275:1: rule__Mimetypes_Enum__Alternatives : ( ( ( 'NONE' ) ) | ( ( 'MP4' ) ) | ( ( 'FLV' ) ) | ( ( 'MPEGTS' ) ) | ( ( 'MPEG' ) ) | ( ( 'WEBM' ) ) | ( ( 'WMV' ) ) | ( ( 'AVI' ) ) );
    public final void rule__Mimetypes_Enum__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:279:1: ( ( ( 'NONE' ) ) | ( ( 'MP4' ) ) | ( ( 'FLV' ) ) | ( ( 'MPEGTS' ) ) | ( ( 'MPEG' ) ) | ( ( 'WEBM' ) ) | ( ( 'WMV' ) ) | ( ( 'AVI' ) ) )
            int alt2=8;
            switch ( input.LA(1) ) {
            case 13:
                {
                alt2=1;
                }
                break;
            case 14:
                {
                alt2=2;
                }
                break;
            case 15:
                {
                alt2=3;
                }
                break;
            case 16:
                {
                alt2=4;
                }
                break;
            case 17:
                {
                alt2=5;
                }
                break;
            case 18:
                {
                alt2=6;
                }
                break;
            case 19:
                {
                alt2=7;
                }
                break;
            case 20:
                {
                alt2=8;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }

            switch (alt2) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:280:1: ( ( 'NONE' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:280:1: ( ( 'NONE' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:281:1: ( 'NONE' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:282:1: ( 'NONE' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:282:3: 'NONE'
                    {
                    match(input,13,FOLLOW_13_in_rule__Mimetypes_Enum__Alternatives535); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getNoneEnumLiteralDeclaration_0()); 

                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:287:6: ( ( 'MP4' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:287:6: ( ( 'MP4' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:288:1: ( 'MP4' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:289:1: ( 'MP4' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:289:3: 'MP4'
                    {
                    match(input,14,FOLLOW_14_in_rule__Mimetypes_Enum__Alternatives556); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMp4EnumLiteralDeclaration_1()); 

                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:294:6: ( ( 'FLV' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:294:6: ( ( 'FLV' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:295:1: ( 'FLV' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:296:1: ( 'FLV' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:296:3: 'FLV'
                    {
                    match(input,15,FOLLOW_15_in_rule__Mimetypes_Enum__Alternatives577); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getFlvEnumLiteralDeclaration_2()); 

                    }


                    }
                    break;
                case 4 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:301:6: ( ( 'MPEGTS' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:301:6: ( ( 'MPEGTS' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:302:1: ( 'MPEGTS' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:303:1: ( 'MPEGTS' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:303:3: 'MPEGTS'
                    {
                    match(input,16,FOLLOW_16_in_rule__Mimetypes_Enum__Alternatives598); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMpegtsEnumLiteralDeclaration_3()); 

                    }


                    }
                    break;
                case 5 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:308:6: ( ( 'MPEG' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:308:6: ( ( 'MPEG' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:309:1: ( 'MPEG' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:310:1: ( 'MPEG' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:310:3: 'MPEG'
                    {
                    match(input,17,FOLLOW_17_in_rule__Mimetypes_Enum__Alternatives619); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getMpegEnumLiteralDeclaration_4()); 

                    }


                    }
                    break;
                case 6 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:315:6: ( ( 'WEBM' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:315:6: ( ( 'WEBM' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:316:1: ( 'WEBM' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:317:1: ( 'WEBM' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:317:3: 'WEBM'
                    {
                    match(input,18,FOLLOW_18_in_rule__Mimetypes_Enum__Alternatives640); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getWebmEnumLiteralDeclaration_5()); 

                    }


                    }
                    break;
                case 7 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:322:6: ( ( 'WMV' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:322:6: ( ( 'WMV' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:323:1: ( 'WMV' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:324:1: ( 'WMV' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:324:3: 'WMV'
                    {
                    match(input,19,FOLLOW_19_in_rule__Mimetypes_Enum__Alternatives661); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getWmvEnumLiteralDeclaration_6()); 

                    }


                    }
                    break;
                case 8 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:329:6: ( ( 'AVI' ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:329:6: ( ( 'AVI' ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:330:1: ( 'AVI' )
                    {
                     before(grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:331:1: ( 'AVI' )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:331:3: 'AVI'
                    {
                    match(input,20,FOLLOW_20_in_rule__Mimetypes_Enum__Alternatives682); 

                    }

                     after(grammarAccess.getMimetypes_EnumAccess().getAviEnumLiteralDeclaration_7()); 

                    }


                    }
                    break;

            }
        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mimetypes_Enum__Alternatives"


    // $ANTLR start "rule__VideoGen__Group__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:343:1: rule__VideoGen__Group__0 : rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 ;
    public final void rule__VideoGen__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:347:1: ( rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:348:2: rule__VideoGen__Group__0__Impl rule__VideoGen__Group__1
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0715);
            rule__VideoGen__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0718);
            rule__VideoGen__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0"


    // $ANTLR start "rule__VideoGen__Group__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:355:1: rule__VideoGen__Group__0__Impl : ( 'VideoGen' ) ;
    public final void rule__VideoGen__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:359:1: ( ( 'VideoGen' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:360:1: ( 'VideoGen' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:360:1: ( 'VideoGen' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:361:1: 'VideoGen'
            {
             before(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 
            match(input,21,FOLLOW_21_in_rule__VideoGen__Group__0__Impl746); 
             after(grammarAccess.getVideoGenAccess().getVideoGenKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__0__Impl"


    // $ANTLR start "rule__VideoGen__Group__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:374:1: rule__VideoGen__Group__1 : rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 ;
    public final void rule__VideoGen__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:378:1: ( rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:379:2: rule__VideoGen__Group__1__Impl rule__VideoGen__Group__2
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1777);
            rule__VideoGen__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1780);
            rule__VideoGen__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1"


    // $ANTLR start "rule__VideoGen__Group__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:386:1: rule__VideoGen__Group__1__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__VideoGen__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:390:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:391:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:391:1: ( RULE_LEFT_BRACKET )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:392:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGen__Group__1__Impl807); 
             after(grammarAccess.getVideoGenAccess().getLEFT_BRACKETTerminalRuleCall_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__1__Impl"


    // $ANTLR start "rule__VideoGen__Group__2"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:403:1: rule__VideoGen__Group__2 : rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 ;
    public final void rule__VideoGen__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:407:1: ( rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:408:2: rule__VideoGen__Group__2__Impl rule__VideoGen__Group__3
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2836);
            rule__VideoGen__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2839);
            rule__VideoGen__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2"


    // $ANTLR start "rule__VideoGen__Group__2__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:415:1: rule__VideoGen__Group__2__Impl : ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) ;
    public final void rule__VideoGen__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:419:1: ( ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:420:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:420:1: ( ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:421:1: ( ( rule__VideoGen__StatementsAssignment_2 ) ) ( ( rule__VideoGen__StatementsAssignment_2 )* )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:421:1: ( ( rule__VideoGen__StatementsAssignment_2 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:422:1: ( rule__VideoGen__StatementsAssignment_2 )
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:423:1: ( rule__VideoGen__StatementsAssignment_2 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:423:2: rule__VideoGen__StatementsAssignment_2
            {
            pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl868);
            rule__VideoGen__StatementsAssignment_2();

            state._fsp--;


            }

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }

            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:426:1: ( ( rule__VideoGen__StatementsAssignment_2 )* )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:427:1: ( rule__VideoGen__StatementsAssignment_2 )*
            {
             before(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:428:1: ( rule__VideoGen__StatementsAssignment_2 )*
            loop3:
            do {
                int alt3=2;
                int LA3_0 = input.LA(1);

                if ( ((LA3_0>=22 && LA3_0<=24)||LA3_0==27) ) {
                    alt3=1;
                }


                switch (alt3) {
            	case 1 :
            	    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:428:2: rule__VideoGen__StatementsAssignment_2
            	    {
            	    pushFollow(FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl880);
            	    rule__VideoGen__StatementsAssignment_2();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop3;
                }
            } while (true);

             after(grammarAccess.getVideoGenAccess().getStatementsAssignment_2()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__2__Impl"


    // $ANTLR start "rule__VideoGen__Group__3"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:439:1: rule__VideoGen__Group__3 : rule__VideoGen__Group__3__Impl ;
    public final void rule__VideoGen__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:443:1: ( rule__VideoGen__Group__3__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:444:2: rule__VideoGen__Group__3__Impl
            {
            pushFollow(FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3913);
            rule__VideoGen__Group__3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3"


    // $ANTLR start "rule__VideoGen__Group__3__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:450:1: rule__VideoGen__Group__3__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__VideoGen__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:454:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:455:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:455:1: ( RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:456:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGen__Group__3__Impl940); 
             after(grammarAccess.getVideoGenAccess().getRIGHT_BRACKETTerminalRuleCall_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__Group__3__Impl"


    // $ANTLR start "rule__Statement__Group_0__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:475:1: rule__Statement__Group_0__0 : rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 ;
    public final void rule__Statement__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:479:1: ( rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:480:2: rule__Statement__Group_0__0__Impl rule__Statement__Group_0__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0977);
            rule__Statement__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0980);
            rule__Statement__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0"


    // $ANTLR start "rule__Statement__Group_0__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:487:1: rule__Statement__Group_0__0__Impl : ( '@Optional' ) ;
    public final void rule__Statement__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:491:1: ( ( '@Optional' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:492:1: ( '@Optional' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:492:1: ( '@Optional' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:493:1: '@Optional'
            {
             before(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 
            match(input,22,FOLLOW_22_in_rule__Statement__Group_0__0__Impl1008); 
             after(grammarAccess.getStatementAccess().getOptionalKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__0__Impl"


    // $ANTLR start "rule__Statement__Group_0__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:506:1: rule__Statement__Group_0__1 : rule__Statement__Group_0__1__Impl ;
    public final void rule__Statement__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:510:1: ( rule__Statement__Group_0__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:511:2: rule__Statement__Group_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11039);
            rule__Statement__Group_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1"


    // $ANTLR start "rule__Statement__Group_0__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:517:1: rule__Statement__Group_0__1__Impl : ( ruleOptional ) ;
    public final void rule__Statement__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:521:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:522:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:522:1: ( ruleOptional )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:523:1: ruleOptional
            {
             before(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl1066);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getOptionalParserRuleCall_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_0__1__Impl"


    // $ANTLR start "rule__Statement__Group_1__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:538:1: rule__Statement__Group_1__0 : rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 ;
    public final void rule__Statement__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:542:1: ( rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:543:2: rule__Statement__Group_1__0__Impl rule__Statement__Group_1__1
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01099);
            rule__Statement__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01102);
            rule__Statement__Group_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0"


    // $ANTLR start "rule__Statement__Group_1__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:550:1: rule__Statement__Group_1__0__Impl : ( ( '@Mandatory' )? ) ;
    public final void rule__Statement__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:554:1: ( ( ( '@Mandatory' )? ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:555:1: ( ( '@Mandatory' )? )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:555:1: ( ( '@Mandatory' )? )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:556:1: ( '@Mandatory' )?
            {
             before(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:557:1: ( '@Mandatory' )?
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==23) ) {
                alt4=1;
            }
            switch (alt4) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:558:2: '@Mandatory'
                    {
                    match(input,23,FOLLOW_23_in_rule__Statement__Group_1__0__Impl1131); 

                    }
                    break;

            }

             after(grammarAccess.getStatementAccess().getMandatoryKeyword_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__0__Impl"


    // $ANTLR start "rule__Statement__Group_1__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:569:1: rule__Statement__Group_1__1 : rule__Statement__Group_1__1__Impl ;
    public final void rule__Statement__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:573:1: ( rule__Statement__Group_1__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:574:2: rule__Statement__Group_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11164);
            rule__Statement__Group_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1"


    // $ANTLR start "rule__Statement__Group_1__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:580:1: rule__Statement__Group_1__1__Impl : ( ruleMandatory ) ;
    public final void rule__Statement__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:584:1: ( ( ruleMandatory ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:585:1: ( ruleMandatory )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:585:1: ( ruleMandatory )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:586:1: ruleMandatory
            {
             before(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 
            pushFollow(FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl1191);
            ruleMandatory();

            state._fsp--;

             after(grammarAccess.getStatementAccess().getMandatoryParserRuleCall_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Statement__Group_1__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:601:1: rule__Alternatives__Group__0 : rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 ;
    public final void rule__Alternatives__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:605:1: ( rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:606:2: rule__Alternatives__Group__0__Impl rule__Alternatives__Group__1
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01224);
            rule__Alternatives__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01227);
            rule__Alternatives__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0"


    // $ANTLR start "rule__Alternatives__Group__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:613:1: rule__Alternatives__Group__0__Impl : ( 'Alternatives' ) ;
    public final void rule__Alternatives__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:617:1: ( ( 'Alternatives' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:618:1: ( 'Alternatives' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:618:1: ( 'Alternatives' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:619:1: 'Alternatives'
            {
             before(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 
            match(input,24,FOLLOW_24_in_rule__Alternatives__Group__0__Impl1255); 
             after(grammarAccess.getAlternativesAccess().getAlternativesKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__0__Impl"


    // $ANTLR start "rule__Alternatives__Group__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:632:1: rule__Alternatives__Group__1 : rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 ;
    public final void rule__Alternatives__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:636:1: ( rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:637:2: rule__Alternatives__Group__1__Impl rule__Alternatives__Group__2
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11286);
            rule__Alternatives__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11289);
            rule__Alternatives__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1"


    // $ANTLR start "rule__Alternatives__Group__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:644:1: rule__Alternatives__Group__1__Impl : ( ( rule__Alternatives__NameAssignment_1 ) ) ;
    public final void rule__Alternatives__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:648:1: ( ( ( rule__Alternatives__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:649:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:649:1: ( ( rule__Alternatives__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:650:1: ( rule__Alternatives__NameAssignment_1 )
            {
             before(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:651:1: ( rule__Alternatives__NameAssignment_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:651:2: rule__Alternatives__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1316);
            rule__Alternatives__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__1__Impl"


    // $ANTLR start "rule__Alternatives__Group__2"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:661:1: rule__Alternatives__Group__2 : rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 ;
    public final void rule__Alternatives__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:665:1: ( rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:666:2: rule__Alternatives__Group__2__Impl rule__Alternatives__Group__3
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21346);
            rule__Alternatives__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21349);
            rule__Alternatives__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2"


    // $ANTLR start "rule__Alternatives__Group__2__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:673:1: rule__Alternatives__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Alternatives__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:677:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:678:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:678:1: ( RULE_LEFT_BRACKET )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:679:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Alternatives__Group__2__Impl1376); 
             after(grammarAccess.getAlternativesAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__2__Impl"


    // $ANTLR start "rule__Alternatives__Group__3"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:690:1: rule__Alternatives__Group__3 : rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 ;
    public final void rule__Alternatives__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:694:1: ( rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:695:2: rule__Alternatives__Group__3__Impl rule__Alternatives__Group__4
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31405);
            rule__Alternatives__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31408);
            rule__Alternatives__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3"


    // $ANTLR start "rule__Alternatives__Group__3__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:702:1: rule__Alternatives__Group__3__Impl : ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) ;
    public final void rule__Alternatives__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:706:1: ( ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:707:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:707:1: ( ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:708:1: ( ( rule__Alternatives__OptionsAssignment_3 ) ) ( ( rule__Alternatives__OptionsAssignment_3 )* )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:708:1: ( ( rule__Alternatives__OptionsAssignment_3 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:709:1: ( rule__Alternatives__OptionsAssignment_3 )
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:710:1: ( rule__Alternatives__OptionsAssignment_3 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:710:2: rule__Alternatives__OptionsAssignment_3
            {
            pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1437);
            rule__Alternatives__OptionsAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

            }

            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:713:1: ( ( rule__Alternatives__OptionsAssignment_3 )* )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:714:1: ( rule__Alternatives__OptionsAssignment_3 )*
            {
             before(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:715:1: ( rule__Alternatives__OptionsAssignment_3 )*
            loop5:
            do {
                int alt5=2;
                int LA5_0 = input.LA(1);

                if ( (LA5_0==25||LA5_0==27) ) {
                    alt5=1;
                }


                switch (alt5) {
            	case 1 :
            	    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:715:2: rule__Alternatives__OptionsAssignment_3
            	    {
            	    pushFollow(FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1449);
            	    rule__Alternatives__OptionsAssignment_3();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop5;
                }
            } while (true);

             after(grammarAccess.getAlternativesAccess().getOptionsAssignment_3()); 

            }


            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__3__Impl"


    // $ANTLR start "rule__Alternatives__Group__4"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:726:1: rule__Alternatives__Group__4 : rule__Alternatives__Group__4__Impl ;
    public final void rule__Alternatives__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:730:1: ( rule__Alternatives__Group__4__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:731:2: rule__Alternatives__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41482);
            rule__Alternatives__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4"


    // $ANTLR start "rule__Alternatives__Group__4__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:737:1: rule__Alternatives__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Alternatives__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:741:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:742:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:742:1: ( RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:743:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Alternatives__Group__4__Impl1509); 
             after(grammarAccess.getAlternativesAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__Group__4__Impl"


    // $ANTLR start "rule__Optional__Group__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:764:1: rule__Optional__Group__0 : rule__Optional__Group__0__Impl rule__Optional__Group__1 ;
    public final void rule__Optional__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:768:1: ( rule__Optional__Group__0__Impl rule__Optional__Group__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:769:2: rule__Optional__Group__0__Impl rule__Optional__Group__1
            {
            pushFollow(FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01548);
            rule__Optional__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01551);
            rule__Optional__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0"


    // $ANTLR start "rule__Optional__Group__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:776:1: rule__Optional__Group__0__Impl : ( ( rule__Optional__Group_0__0 )? ) ;
    public final void rule__Optional__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:780:1: ( ( ( rule__Optional__Group_0__0 )? ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:781:1: ( ( rule__Optional__Group_0__0 )? )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:781:1: ( ( rule__Optional__Group_0__0 )? )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:782:1: ( rule__Optional__Group_0__0 )?
            {
             before(grammarAccess.getOptionalAccess().getGroup_0()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:783:1: ( rule__Optional__Group_0__0 )?
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==25) ) {
                alt6=1;
            }
            switch (alt6) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:783:2: rule__Optional__Group_0__0
                    {
                    pushFollow(FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1578);
                    rule__Optional__Group_0__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getOptionalAccess().getGroup_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__0__Impl"


    // $ANTLR start "rule__Optional__Group__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:793:1: rule__Optional__Group__1 : rule__Optional__Group__1__Impl ;
    public final void rule__Optional__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:797:1: ( rule__Optional__Group__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:798:2: rule__Optional__Group__1__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11609);
            rule__Optional__Group__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1"


    // $ANTLR start "rule__Optional__Group__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:804:1: rule__Optional__Group__1__Impl : ( ( rule__Optional__SequenceAssignment_1 ) ) ;
    public final void rule__Optional__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:808:1: ( ( ( rule__Optional__SequenceAssignment_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:809:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:809:1: ( ( rule__Optional__SequenceAssignment_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:810:1: ( rule__Optional__SequenceAssignment_1 )
            {
             before(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:811:1: ( rule__Optional__SequenceAssignment_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:811:2: rule__Optional__SequenceAssignment_1
            {
            pushFollow(FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1636);
            rule__Optional__SequenceAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getSequenceAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group__1__Impl"


    // $ANTLR start "rule__Optional__Group_0__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:825:1: rule__Optional__Group_0__0 : rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 ;
    public final void rule__Optional__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:829:1: ( rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:830:2: rule__Optional__Group_0__0__Impl rule__Optional__Group_0__1
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01670);
            rule__Optional__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01673);
            rule__Optional__Group_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_0__0"


    // $ANTLR start "rule__Optional__Group_0__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:837:1: rule__Optional__Group_0__0__Impl : ( '@Probability(' ) ;
    public final void rule__Optional__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:841:1: ( ( '@Probability(' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:842:1: ( '@Probability(' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:842:1: ( '@Probability(' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:843:1: '@Probability('
            {
             before(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 
            match(input,25,FOLLOW_25_in_rule__Optional__Group_0__0__Impl1701); 
             after(grammarAccess.getOptionalAccess().getProbabilityKeyword_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_0__0__Impl"


    // $ANTLR start "rule__Optional__Group_0__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:856:1: rule__Optional__Group_0__1 : rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 ;
    public final void rule__Optional__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:860:1: ( rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:861:2: rule__Optional__Group_0__1__Impl rule__Optional__Group_0__2
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11732);
            rule__Optional__Group_0__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11735);
            rule__Optional__Group_0__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_0__1"


    // $ANTLR start "rule__Optional__Group_0__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:868:1: rule__Optional__Group_0__1__Impl : ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) ;
    public final void rule__Optional__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:872:1: ( ( ( rule__Optional__ProbabilityAssignment_0_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:873:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:873:1: ( ( rule__Optional__ProbabilityAssignment_0_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:874:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            {
             before(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:875:1: ( rule__Optional__ProbabilityAssignment_0_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:875:2: rule__Optional__ProbabilityAssignment_0_1
            {
            pushFollow(FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1762);
            rule__Optional__ProbabilityAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getOptionalAccess().getProbabilityAssignment_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_0__1__Impl"


    // $ANTLR start "rule__Optional__Group_0__2"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:885:1: rule__Optional__Group_0__2 : rule__Optional__Group_0__2__Impl ;
    public final void rule__Optional__Group_0__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:889:1: ( rule__Optional__Group_0__2__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:890:2: rule__Optional__Group_0__2__Impl
            {
            pushFollow(FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21792);
            rule__Optional__Group_0__2__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_0__2"


    // $ANTLR start "rule__Optional__Group_0__2__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:896:1: rule__Optional__Group_0__2__Impl : ( ')' ) ;
    public final void rule__Optional__Group_0__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:900:1: ( ( ')' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:901:1: ( ')' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:901:1: ( ')' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:902:1: ')'
            {
             before(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 
            match(input,26,FOLLOW_26_in_rule__Optional__Group_0__2__Impl1820); 
             after(grammarAccess.getOptionalAccess().getRightParenthesisKeyword_0_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__Group_0__2__Impl"


    // $ANTLR start "rule__Sequence__Group__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:921:1: rule__Sequence__Group__0 : rule__Sequence__Group__0__Impl rule__Sequence__Group__1 ;
    public final void rule__Sequence__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:925:1: ( rule__Sequence__Group__0__Impl rule__Sequence__Group__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:926:2: rule__Sequence__Group__0__Impl rule__Sequence__Group__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01857);
            rule__Sequence__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01860);
            rule__Sequence__Group__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0"


    // $ANTLR start "rule__Sequence__Group__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:933:1: rule__Sequence__Group__0__Impl : ( 'Sequence' ) ;
    public final void rule__Sequence__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:937:1: ( ( 'Sequence' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:938:1: ( 'Sequence' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:938:1: ( 'Sequence' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:939:1: 'Sequence'
            {
             before(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 
            match(input,27,FOLLOW_27_in_rule__Sequence__Group__0__Impl1888); 
             after(grammarAccess.getSequenceAccess().getSequenceKeyword_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__0__Impl"


    // $ANTLR start "rule__Sequence__Group__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:952:1: rule__Sequence__Group__1 : rule__Sequence__Group__1__Impl rule__Sequence__Group__2 ;
    public final void rule__Sequence__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:956:1: ( rule__Sequence__Group__1__Impl rule__Sequence__Group__2 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:957:2: rule__Sequence__Group__1__Impl rule__Sequence__Group__2
            {
            pushFollow(FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11919);
            rule__Sequence__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11922);
            rule__Sequence__Group__2();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1"


    // $ANTLR start "rule__Sequence__Group__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:964:1: rule__Sequence__Group__1__Impl : ( ( rule__Sequence__NameAssignment_1 ) ) ;
    public final void rule__Sequence__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:968:1: ( ( ( rule__Sequence__NameAssignment_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:969:1: ( ( rule__Sequence__NameAssignment_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:969:1: ( ( rule__Sequence__NameAssignment_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:970:1: ( rule__Sequence__NameAssignment_1 )
            {
             before(grammarAccess.getSequenceAccess().getNameAssignment_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:971:1: ( rule__Sequence__NameAssignment_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:971:2: rule__Sequence__NameAssignment_1
            {
            pushFollow(FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1949);
            rule__Sequence__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getNameAssignment_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__1__Impl"


    // $ANTLR start "rule__Sequence__Group__2"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:981:1: rule__Sequence__Group__2 : rule__Sequence__Group__2__Impl rule__Sequence__Group__3 ;
    public final void rule__Sequence__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:985:1: ( rule__Sequence__Group__2__Impl rule__Sequence__Group__3 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:986:2: rule__Sequence__Group__2__Impl rule__Sequence__Group__3
            {
            pushFollow(FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21979);
            rule__Sequence__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21982);
            rule__Sequence__Group__3();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2"


    // $ANTLR start "rule__Sequence__Group__2__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:993:1: rule__Sequence__Group__2__Impl : ( RULE_LEFT_BRACKET ) ;
    public final void rule__Sequence__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:997:1: ( ( RULE_LEFT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:998:1: ( RULE_LEFT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:998:1: ( RULE_LEFT_BRACKET )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:999:1: RULE_LEFT_BRACKET
            {
             before(grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 
            match(input,RULE_LEFT_BRACKET,FOLLOW_RULE_LEFT_BRACKET_in_rule__Sequence__Group__2__Impl2009); 
             after(grammarAccess.getSequenceAccess().getLEFT_BRACKETTerminalRuleCall_2()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__2__Impl"


    // $ANTLR start "rule__Sequence__Group__3"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1010:1: rule__Sequence__Group__3 : rule__Sequence__Group__3__Impl rule__Sequence__Group__4 ;
    public final void rule__Sequence__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1014:1: ( rule__Sequence__Group__3__Impl rule__Sequence__Group__4 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1015:2: rule__Sequence__Group__3__Impl rule__Sequence__Group__4
            {
            pushFollow(FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32038);
            rule__Sequence__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32041);
            rule__Sequence__Group__4();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3"


    // $ANTLR start "rule__Sequence__Group__3__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1022:1: rule__Sequence__Group__3__Impl : ( ( rule__Sequence__UnorderedGroup_3 ) ) ;
    public final void rule__Sequence__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1026:1: ( ( ( rule__Sequence__UnorderedGroup_3 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1027:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1027:1: ( ( rule__Sequence__UnorderedGroup_3 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1028:1: ( rule__Sequence__UnorderedGroup_3 )
            {
             before(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1029:1: ( rule__Sequence__UnorderedGroup_3 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1029:2: rule__Sequence__UnorderedGroup_3
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl2068);
            rule__Sequence__UnorderedGroup_3();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getUnorderedGroup_3()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__3__Impl"


    // $ANTLR start "rule__Sequence__Group__4"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1039:1: rule__Sequence__Group__4 : rule__Sequence__Group__4__Impl ;
    public final void rule__Sequence__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1043:1: ( rule__Sequence__Group__4__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1044:2: rule__Sequence__Group__4__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42098);
            rule__Sequence__Group__4__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4"


    // $ANTLR start "rule__Sequence__Group__4__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1050:1: rule__Sequence__Group__4__Impl : ( RULE_RIGHT_BRACKET ) ;
    public final void rule__Sequence__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1054:1: ( ( RULE_RIGHT_BRACKET ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1055:1: ( RULE_RIGHT_BRACKET )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1055:1: ( RULE_RIGHT_BRACKET )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1056:1: RULE_RIGHT_BRACKET
            {
             before(grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 
            match(input,RULE_RIGHT_BRACKET,FOLLOW_RULE_RIGHT_BRACKET_in_rule__Sequence__Group__4__Impl2125); 
             after(grammarAccess.getSequenceAccess().getRIGHT_BRACKETTerminalRuleCall_4()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group__4__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1077:1: rule__Sequence__Group_3_0__0 : rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 ;
    public final void rule__Sequence__Group_3_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1081:1: ( rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1082:2: rule__Sequence__Group_3_0__0__Impl rule__Sequence__Group_3_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__02164);
            rule__Sequence__Group_3_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__02167);
            rule__Sequence__Group_3_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0__0"


    // $ANTLR start "rule__Sequence__Group_3_0__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1089:1: rule__Sequence__Group_3_0__0__Impl : ( ( rule__Sequence__Group_3_0_0__0 ) ) ;
    public final void rule__Sequence__Group_3_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1093:1: ( ( ( rule__Sequence__Group_3_0_0__0 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1094:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1094:1: ( ( rule__Sequence__Group_3_0_0__0 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1095:1: ( rule__Sequence__Group_3_0_0__0 )
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1096:1: ( rule__Sequence__Group_3_0_0__0 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1096:2: rule__Sequence__Group_3_0_0__0
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl2194);
            rule__Sequence__Group_3_0_0__0();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getGroup_3_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1106:1: rule__Sequence__Group_3_0__1 : rule__Sequence__Group_3_0__1__Impl ;
    public final void rule__Sequence__Group_3_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1110:1: ( rule__Sequence__Group_3_0__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1111:2: rule__Sequence__Group_3_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12224);
            rule__Sequence__Group_3_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0__1"


    // $ANTLR start "rule__Sequence__Group_3_0__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1117:1: rule__Sequence__Group_3_0__1__Impl : ( ( rule__Sequence__Group_3_0_1__0 )? ) ;
    public final void rule__Sequence__Group_3_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1121:1: ( ( ( rule__Sequence__Group_3_0_1__0 )? ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1122:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1122:1: ( ( rule__Sequence__Group_3_0_1__0 )? )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1123:1: ( rule__Sequence__Group_3_0_1__0 )?
            {
             before(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1124:1: ( rule__Sequence__Group_3_0_1__0 )?
            int alt7=2;
            int LA7_0 = input.LA(1);

            if ( (LA7_0==29) ) {
                alt7=1;
            }
            switch (alt7) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1124:2: rule__Sequence__Group_3_0_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2251);
                    rule__Sequence__Group_3_0_1__0();

                    state._fsp--;


                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getGroup_3_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_0__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1138:1: rule__Sequence__Group_3_0_0__0 : rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 ;
    public final void rule__Sequence__Group_3_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1142:1: ( rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1143:2: rule__Sequence__Group_3_0_0__0__Impl rule__Sequence__Group_3_0_0__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02286);
            rule__Sequence__Group_3_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02289);
            rule__Sequence__Group_3_0_0__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_0__0"


    // $ANTLR start "rule__Sequence__Group_3_0_0__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1150:1: rule__Sequence__Group_3_0_0__0__Impl : ( ( 'url=' )? ) ;
    public final void rule__Sequence__Group_3_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1154:1: ( ( ( 'url=' )? ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1155:1: ( ( 'url=' )? )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1155:1: ( ( 'url=' )? )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1156:1: ( 'url=' )?
            {
             before(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1157:1: ( 'url=' )?
            int alt8=2;
            int LA8_0 = input.LA(1);

            if ( (LA8_0==28) ) {
                alt8=1;
            }
            switch (alt8) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1158:2: 'url='
                    {
                    match(input,28,FOLLOW_28_in_rule__Sequence__Group_3_0_0__0__Impl2318); 

                    }
                    break;

            }

             after(grammarAccess.getSequenceAccess().getUrlKeyword_3_0_0_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_0__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_0__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1169:1: rule__Sequence__Group_3_0_0__1 : rule__Sequence__Group_3_0_0__1__Impl ;
    public final void rule__Sequence__Group_3_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1173:1: ( rule__Sequence__Group_3_0_0__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1174:2: rule__Sequence__Group_3_0_0__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12351);
            rule__Sequence__Group_3_0_0__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_0__1"


    // $ANTLR start "rule__Sequence__Group_3_0_0__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1180:1: rule__Sequence__Group_3_0_0__1__Impl : ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) ;
    public final void rule__Sequence__Group_3_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1184:1: ( ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1185:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1185:1: ( ( rule__Sequence__UrlAssignment_3_0_0_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1186:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            {
             before(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1187:1: ( rule__Sequence__UrlAssignment_3_0_0_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1187:2: rule__Sequence__UrlAssignment_3_0_0_1
            {
            pushFollow(FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2378);
            rule__Sequence__UrlAssignment_3_0_0_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getUrlAssignment_3_0_0_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_0__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_1__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1201:1: rule__Sequence__Group_3_0_1__0 : rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 ;
    public final void rule__Sequence__Group_3_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1205:1: ( rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1206:2: rule__Sequence__Group_3_0_1__0__Impl rule__Sequence__Group_3_0_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02412);
            rule__Sequence__Group_3_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02415);
            rule__Sequence__Group_3_0_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_1__0"


    // $ANTLR start "rule__Sequence__Group_3_0_1__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1213:1: rule__Sequence__Group_3_0_1__0__Impl : ( 'description=' ) ;
    public final void rule__Sequence__Group_3_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1217:1: ( ( 'description=' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1218:1: ( 'description=' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1218:1: ( 'description=' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1219:1: 'description='
            {
             before(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 
            match(input,29,FOLLOW_29_in_rule__Sequence__Group_3_0_1__0__Impl2443); 
             after(grammarAccess.getSequenceAccess().getDescriptionKeyword_3_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_1__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_0_1__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1232:1: rule__Sequence__Group_3_0_1__1 : rule__Sequence__Group_3_0_1__1__Impl ;
    public final void rule__Sequence__Group_3_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1236:1: ( rule__Sequence__Group_3_0_1__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1237:2: rule__Sequence__Group_3_0_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12474);
            rule__Sequence__Group_3_0_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_1__1"


    // $ANTLR start "rule__Sequence__Group_3_0_1__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1243:1: rule__Sequence__Group_3_0_1__1__Impl : ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) ;
    public final void rule__Sequence__Group_3_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1247:1: ( ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1248:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1248:1: ( ( rule__Sequence__DescriptionAssignment_3_0_1_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1249:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1250:1: ( rule__Sequence__DescriptionAssignment_3_0_1_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1250:2: rule__Sequence__DescriptionAssignment_3_0_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2501);
            rule__Sequence__DescriptionAssignment_3_0_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getDescriptionAssignment_3_0_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_0_1__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_1__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1264:1: rule__Sequence__Group_3_1__0 : rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 ;
    public final void rule__Sequence__Group_3_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1268:1: ( rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1269:2: rule__Sequence__Group_3_1__0__Impl rule__Sequence__Group_3_1__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02535);
            rule__Sequence__Group_3_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02538);
            rule__Sequence__Group_3_1__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_1__0"


    // $ANTLR start "rule__Sequence__Group_3_1__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1276:1: rule__Sequence__Group_3_1__0__Impl : ( 'length=' ) ;
    public final void rule__Sequence__Group_3_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1280:1: ( ( 'length=' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1281:1: ( 'length=' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1281:1: ( 'length=' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1282:1: 'length='
            {
             before(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 
            match(input,30,FOLLOW_30_in_rule__Sequence__Group_3_1__0__Impl2566); 
             after(grammarAccess.getSequenceAccess().getLengthKeyword_3_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_1__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_1__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1295:1: rule__Sequence__Group_3_1__1 : rule__Sequence__Group_3_1__1__Impl ;
    public final void rule__Sequence__Group_3_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1299:1: ( rule__Sequence__Group_3_1__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1300:2: rule__Sequence__Group_3_1__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12597);
            rule__Sequence__Group_3_1__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_1__1"


    // $ANTLR start "rule__Sequence__Group_3_1__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1306:1: rule__Sequence__Group_3_1__1__Impl : ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) ;
    public final void rule__Sequence__Group_3_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1310:1: ( ( ( rule__Sequence__LengthAssignment_3_1_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1311:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1311:1: ( ( rule__Sequence__LengthAssignment_3_1_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1312:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            {
             before(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1313:1: ( rule__Sequence__LengthAssignment_3_1_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1313:2: rule__Sequence__LengthAssignment_3_1_1
            {
            pushFollow(FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2624);
            rule__Sequence__LengthAssignment_3_1_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getLengthAssignment_3_1_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_1__1__Impl"


    // $ANTLR start "rule__Sequence__Group_3_2__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1327:1: rule__Sequence__Group_3_2__0 : rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 ;
    public final void rule__Sequence__Group_3_2__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1331:1: ( rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1332:2: rule__Sequence__Group_3_2__0__Impl rule__Sequence__Group_3_2__1
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02658);
            rule__Sequence__Group_3_2__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02661);
            rule__Sequence__Group_3_2__1();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_2__0"


    // $ANTLR start "rule__Sequence__Group_3_2__0__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1339:1: rule__Sequence__Group_3_2__0__Impl : ( 'mimetype=' ) ;
    public final void rule__Sequence__Group_3_2__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1343:1: ( ( 'mimetype=' ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1344:1: ( 'mimetype=' )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1344:1: ( 'mimetype=' )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1345:1: 'mimetype='
            {
             before(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 
            match(input,31,FOLLOW_31_in_rule__Sequence__Group_3_2__0__Impl2689); 
             after(grammarAccess.getSequenceAccess().getMimetypeKeyword_3_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_2__0__Impl"


    // $ANTLR start "rule__Sequence__Group_3_2__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1358:1: rule__Sequence__Group_3_2__1 : rule__Sequence__Group_3_2__1__Impl ;
    public final void rule__Sequence__Group_3_2__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1362:1: ( rule__Sequence__Group_3_2__1__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1363:2: rule__Sequence__Group_3_2__1__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12720);
            rule__Sequence__Group_3_2__1__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_2__1"


    // $ANTLR start "rule__Sequence__Group_3_2__1__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1369:1: rule__Sequence__Group_3_2__1__Impl : ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) ;
    public final void rule__Sequence__Group_3_2__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1373:1: ( ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1374:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1374:1: ( ( rule__Sequence__MimetypeAssignment_3_2_1 ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1375:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            {
             before(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1376:1: ( rule__Sequence__MimetypeAssignment_3_2_1 )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1376:2: rule__Sequence__MimetypeAssignment_3_2_1
            {
            pushFollow(FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2747);
            rule__Sequence__MimetypeAssignment_3_2_1();

            state._fsp--;


            }

             after(grammarAccess.getSequenceAccess().getMimetypeAssignment_3_2_1()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__Group_3_2__1__Impl"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1391:1: rule__Sequence__UnorderedGroup_3 : rule__Sequence__UnorderedGroup_3__0 {...}?;
    public final void rule__Sequence__UnorderedGroup_3() throws RecognitionException {

            	int stackSize = keepStackSize();
        		getUnorderedGroupHelper().enter(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1396:1: ( rule__Sequence__UnorderedGroup_3__0 {...}?)
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1397:2: rule__Sequence__UnorderedGroup_3__0 {...}?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32782);
            rule__Sequence__UnorderedGroup_3__0();

            state._fsp--;

            if ( ! getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3()) ) {
                throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3", "getUnorderedGroupHelper().canLeave(grammarAccess.getSequenceAccess().getUnorderedGroup_3())");
            }

            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	getUnorderedGroupHelper().leave(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__Impl"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1408:1: rule__Sequence__UnorderedGroup_3__Impl : ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) ;
    public final void rule__Sequence__UnorderedGroup_3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        		boolean selected = false;
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1413:1: ( ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1414:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1414:3: ( ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) ) | ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) ) )
            int alt9=3;
            int LA9_0 = input.LA(1);

            if ( (LA9_0==RULE_STRING||LA9_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt9=1;
            }
            else if ( LA9_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt9=2;
            }
            else if ( LA9_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt9=3;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 9, 0, input);

                throw nvae;
            }
            switch (alt9) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1416:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1416:4: ({...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1417:5: {...}? => ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0)");
                    }
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1417:105: ( ( ( rule__Sequence__Group_3_0__0 ) ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1418:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1424:6: ( ( rule__Sequence__Group_3_0__0 ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1426:7: ( rule__Sequence__Group_3_0__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_0()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1427:7: ( rule__Sequence__Group_3_0__0 )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1427:8: rule__Sequence__Group_3_0__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2871);
                    rule__Sequence__Group_3_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getGroup_3_0()); 

                    }


                    }


                    }


                    }
                    break;
                case 2 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1433:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1433:4: ({...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1434:5: {...}? => ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1)");
                    }
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1434:105: ( ( ( rule__Sequence__Group_3_1__0 ) ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1435:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1441:6: ( ( rule__Sequence__Group_3_1__0 ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1443:7: ( rule__Sequence__Group_3_1__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_1()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1444:7: ( rule__Sequence__Group_3_1__0 )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1444:8: rule__Sequence__Group_3_1__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2962);
                    rule__Sequence__Group_3_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getGroup_3_1()); 

                    }


                    }


                    }


                    }
                    break;
                case 3 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1450:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    {
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1450:4: ({...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1451:5: {...}? => ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    {
                    if ( ! getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                        throw new FailedPredicateException(input, "rule__Sequence__UnorderedGroup_3__Impl", "getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2)");
                    }
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1451:105: ( ( ( rule__Sequence__Group_3_2__0 ) ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1452:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    {
                     
                    	 				  getUnorderedGroupHelper().select(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2);
                    	 				

                    	 				  selected = true;
                    	 				
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1458:6: ( ( rule__Sequence__Group_3_2__0 ) )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1460:7: ( rule__Sequence__Group_3_2__0 )
                    {
                     before(grammarAccess.getSequenceAccess().getGroup_3_2()); 
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1461:7: ( rule__Sequence__Group_3_2__0 )
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1461:8: rule__Sequence__Group_3_2__0
                    {
                    pushFollow(FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl3053);
                    rule__Sequence__Group_3_2__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getSequenceAccess().getGroup_3_2()); 

                    }


                    }


                    }


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

            	if (selected)
            		getUnorderedGroupHelper().returnFromSelection(grammarAccess.getSequenceAccess().getUnorderedGroup_3());
            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__Impl"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__0"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1476:1: rule__Sequence__UnorderedGroup_3__0 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? ;
    public final void rule__Sequence__UnorderedGroup_3__0() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1480:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )? )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1481:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__1 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__03112);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1482:2: ( rule__Sequence__UnorderedGroup_3__1 )?
            int alt10=2;
            int LA10_0 = input.LA(1);

            if ( (LA10_0==RULE_STRING||LA10_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt10=1;
            }
            else if ( LA10_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt10=1;
            }
            else if ( LA10_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt10=1;
            }
            switch (alt10) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1482:2: rule__Sequence__UnorderedGroup_3__1
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__03115);
                    rule__Sequence__UnorderedGroup_3__1();

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__0"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1489:1: rule__Sequence__UnorderedGroup_3__1 : rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? ;
    public final void rule__Sequence__UnorderedGroup_3__1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1493:1: ( rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )? )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1494:2: rule__Sequence__UnorderedGroup_3__Impl ( rule__Sequence__UnorderedGroup_3__2 )?
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__13140);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;

            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1495:2: ( rule__Sequence__UnorderedGroup_3__2 )?
            int alt11=2;
            int LA11_0 = input.LA(1);

            if ( (LA11_0==RULE_STRING||LA11_0==28) && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 0) ) {
                alt11=1;
            }
            else if ( LA11_0 ==30 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 1) ) {
                alt11=1;
            }
            else if ( LA11_0 ==31 && getUnorderedGroupHelper().canSelect(grammarAccess.getSequenceAccess().getUnorderedGroup_3(), 2) ) {
                alt11=1;
            }
            switch (alt11) {
                case 1 :
                    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1495:2: rule__Sequence__UnorderedGroup_3__2
                    {
                    pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__13143);
                    rule__Sequence__UnorderedGroup_3__2();

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

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__1"


    // $ANTLR start "rule__Sequence__UnorderedGroup_3__2"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1502:1: rule__Sequence__UnorderedGroup_3__2 : rule__Sequence__UnorderedGroup_3__Impl ;
    public final void rule__Sequence__UnorderedGroup_3__2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1506:1: ( rule__Sequence__UnorderedGroup_3__Impl )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1507:2: rule__Sequence__UnorderedGroup_3__Impl
            {
            pushFollow(FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__23168);
            rule__Sequence__UnorderedGroup_3__Impl();

            state._fsp--;


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UnorderedGroup_3__2"


    // $ANTLR start "rule__VideoGen__StatementsAssignment_2"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1520:1: rule__VideoGen__StatementsAssignment_2 : ( ruleStatement ) ;
    public final void rule__VideoGen__StatementsAssignment_2() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1524:1: ( ( ruleStatement ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1525:1: ( ruleStatement )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1525:1: ( ruleStatement )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1526:1: ruleStatement
            {
             before(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 
            pushFollow(FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23202);
            ruleStatement();

            state._fsp--;

             after(grammarAccess.getVideoGenAccess().getStatementsStatementParserRuleCall_2_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__VideoGen__StatementsAssignment_2"


    // $ANTLR start "rule__Alternatives__NameAssignment_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1535:1: rule__Alternatives__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Alternatives__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1539:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1540:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1540:1: ( RULE_ID )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1541:1: RULE_ID
            {
             before(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13233); 
             after(grammarAccess.getAlternativesAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__NameAssignment_1"


    // $ANTLR start "rule__Alternatives__OptionsAssignment_3"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1550:1: rule__Alternatives__OptionsAssignment_3 : ( ruleOptional ) ;
    public final void rule__Alternatives__OptionsAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1554:1: ( ( ruleOptional ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1555:1: ( ruleOptional )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1555:1: ( ruleOptional )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1556:1: ruleOptional
            {
             before(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 
            pushFollow(FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33264);
            ruleOptional();

            state._fsp--;

             after(grammarAccess.getAlternativesAccess().getOptionsOptionalParserRuleCall_3_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Alternatives__OptionsAssignment_3"


    // $ANTLR start "rule__Mandatory__SequenceAssignment"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1565:1: rule__Mandatory__SequenceAssignment : ( ruleSequence ) ;
    public final void rule__Mandatory__SequenceAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1569:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1570:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1570:1: ( ruleSequence )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1571:1: ruleSequence
            {
             before(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3295);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getMandatoryAccess().getSequenceSequenceParserRuleCall_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Mandatory__SequenceAssignment"


    // $ANTLR start "rule__Optional__ProbabilityAssignment_0_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1580:1: rule__Optional__ProbabilityAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Optional__ProbabilityAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1584:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1585:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1585:1: ( RULE_INT )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1586:1: RULE_INT
            {
             before(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13326); 
             after(grammarAccess.getOptionalAccess().getProbabilityINTTerminalRuleCall_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__ProbabilityAssignment_0_1"


    // $ANTLR start "rule__Optional__SequenceAssignment_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1595:1: rule__Optional__SequenceAssignment_1 : ( ruleSequence ) ;
    public final void rule__Optional__SequenceAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1599:1: ( ( ruleSequence ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1600:1: ( ruleSequence )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1600:1: ( ruleSequence )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1601:1: ruleSequence
            {
             before(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 
            pushFollow(FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13357);
            ruleSequence();

            state._fsp--;

             after(grammarAccess.getOptionalAccess().getSequenceSequenceParserRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Optional__SequenceAssignment_1"


    // $ANTLR start "rule__Sequence__NameAssignment_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1610:1: rule__Sequence__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Sequence__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1614:1: ( ( RULE_ID ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1615:1: ( RULE_ID )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1615:1: ( RULE_ID )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1616:1: RULE_ID
            {
             before(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13388); 
             after(grammarAccess.getSequenceAccess().getNameIDTerminalRuleCall_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__NameAssignment_1"


    // $ANTLR start "rule__Sequence__UrlAssignment_3_0_0_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1625:1: rule__Sequence__UrlAssignment_3_0_0_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__UrlAssignment_3_0_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1629:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1630:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1630:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1631:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13419); 
             after(grammarAccess.getSequenceAccess().getUrlSTRINGTerminalRuleCall_3_0_0_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__UrlAssignment_3_0_0_1"


    // $ANTLR start "rule__Sequence__DescriptionAssignment_3_0_1_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1640:1: rule__Sequence__DescriptionAssignment_3_0_1_1 : ( RULE_STRING ) ;
    public final void rule__Sequence__DescriptionAssignment_3_0_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1644:1: ( ( RULE_STRING ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1645:1: ( RULE_STRING )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1645:1: ( RULE_STRING )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1646:1: RULE_STRING
            {
             before(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 
            match(input,RULE_STRING,FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13450); 
             after(grammarAccess.getSequenceAccess().getDescriptionSTRINGTerminalRuleCall_3_0_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__DescriptionAssignment_3_0_1_1"


    // $ANTLR start "rule__Sequence__LengthAssignment_3_1_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1655:1: rule__Sequence__LengthAssignment_3_1_1 : ( RULE_INT ) ;
    public final void rule__Sequence__LengthAssignment_3_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1659:1: ( ( RULE_INT ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1660:1: ( RULE_INT )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1660:1: ( RULE_INT )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1661:1: RULE_INT
            {
             before(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 
            match(input,RULE_INT,FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13481); 
             after(grammarAccess.getSequenceAccess().getLengthINTTerminalRuleCall_3_1_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__LengthAssignment_3_1_1"


    // $ANTLR start "rule__Sequence__MimetypeAssignment_3_2_1"
    // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1670:1: rule__Sequence__MimetypeAssignment_3_2_1 : ( ruleMimetypes_Enum ) ;
    public final void rule__Sequence__MimetypeAssignment_3_2_1() throws RecognitionException {

        		int stackSize = keepStackSize();
            
        try {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1674:1: ( ( ruleMimetypes_Enum ) )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1675:1: ( ruleMimetypes_Enum )
            {
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1675:1: ( ruleMimetypes_Enum )
            // ../org.istic.idm.xtext.videogen.ui/src-gen/org/istic/idm/xtext/videogen/ui/contentassist/antlr/internal/InternalVideoGen.g:1676:1: ruleMimetypes_Enum
            {
             before(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 
            pushFollow(FOLLOW_ruleMimetypes_Enum_in_rule__Sequence__MimetypeAssignment_3_2_13512);
            ruleMimetypes_Enum();

            state._fsp--;

             after(grammarAccess.getSequenceAccess().getMimetypeMimetypes_EnumEnumRuleCall_3_2_1_0()); 

            }


            }

        }
        catch (RecognitionException re) {
            reportError(re);
            recover(input,re);
        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Sequence__MimetypeAssignment_3_2_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_ruleVideoGen_in_entryRuleVideoGen61 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleVideoGen68 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0_in_ruleVideoGen94 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_entryRuleStatement121 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleStatement128 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Alternatives_in_ruleStatement154 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_entryRuleAlternatives181 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleAlternatives188 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0_in_ruleAlternatives214 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_entryRuleMandatory241 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleMandatory248 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mandatory__SequenceAssignment_in_ruleMandatory274 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_entryRuleOptional301 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleOptional308 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0_in_ruleOptional334 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_entryRuleSequence361 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_EOF_in_entryRuleSequence368 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0_in_ruleSequence394 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Mimetypes_Enum__Alternatives_in_ruleMimetypes_Enum431 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0_in_rule__Statement__Alternatives466 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0_in_rule__Statement__Alternatives484 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleAlternatives_in_rule__Statement__Alternatives502 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_13_in_rule__Mimetypes_Enum__Alternatives535 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_14_in_rule__Mimetypes_Enum__Alternatives556 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_15_in_rule__Mimetypes_Enum__Alternatives577 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_16_in_rule__Mimetypes_Enum__Alternatives598 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_17_in_rule__Mimetypes_Enum__Alternatives619 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_18_in_rule__Mimetypes_Enum__Alternatives640 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_19_in_rule__Mimetypes_Enum__Alternatives661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_20_in_rule__Mimetypes_Enum__Alternatives682 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__0__Impl_in_rule__VideoGen__Group__0715 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1_in_rule__VideoGen__Group__0718 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_21_in_rule__VideoGen__Group__0__Impl746 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__1__Impl_in_rule__VideoGen__Group__1777 = new BitSet(new long[]{0x0000000009C00000L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2_in_rule__VideoGen__Group__1780 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__VideoGen__Group__1__Impl807 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__2__Impl_in_rule__VideoGen__Group__2836 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3_in_rule__VideoGen__Group__2839 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl868 = new BitSet(new long[]{0x0000000009C00002L});
    public static final BitSet FOLLOW_rule__VideoGen__StatementsAssignment_2_in_rule__VideoGen__Group__2__Impl880 = new BitSet(new long[]{0x0000000009C00002L});
    public static final BitSet FOLLOW_rule__VideoGen__Group__3__Impl_in_rule__VideoGen__Group__3913 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__VideoGen__Group__3__Impl940 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__0__Impl_in_rule__Statement__Group_0__0977 = new BitSet(new long[]{0x000000000A800000L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1_in_rule__Statement__Group_0__0980 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_22_in_rule__Statement__Group_0__0__Impl1008 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_0__1__Impl_in_rule__Statement__Group_0__11039 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Statement__Group_0__1__Impl1066 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__0__Impl_in_rule__Statement__Group_1__01099 = new BitSet(new long[]{0x0000000008800000L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1_in_rule__Statement__Group_1__01102 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_23_in_rule__Statement__Group_1__0__Impl1131 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Statement__Group_1__1__Impl_in_rule__Statement__Group_1__11164 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMandatory_in_rule__Statement__Group_1__1__Impl1191 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__0__Impl_in_rule__Alternatives__Group__01224 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1_in_rule__Alternatives__Group__01227 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_24_in_rule__Alternatives__Group__0__Impl1255 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__1__Impl_in_rule__Alternatives__Group__11286 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2_in_rule__Alternatives__Group__11289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__NameAssignment_1_in_rule__Alternatives__Group__1__Impl1316 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__2__Impl_in_rule__Alternatives__Group__21346 = new BitSet(new long[]{0x000000000A800000L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3_in_rule__Alternatives__Group__21349 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Alternatives__Group__2__Impl1376 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__3__Impl_in_rule__Alternatives__Group__31405 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4_in_rule__Alternatives__Group__31408 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1437 = new BitSet(new long[]{0x000000000A800002L});
    public static final BitSet FOLLOW_rule__Alternatives__OptionsAssignment_3_in_rule__Alternatives__Group__3__Impl1449 = new BitSet(new long[]{0x000000000A800002L});
    public static final BitSet FOLLOW_rule__Alternatives__Group__4__Impl_in_rule__Alternatives__Group__41482 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Alternatives__Group__4__Impl1509 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__0__Impl_in_rule__Optional__Group__01548 = new BitSet(new long[]{0x000000000A800000L});
    public static final BitSet FOLLOW_rule__Optional__Group__1_in_rule__Optional__Group__01551 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0_in_rule__Optional__Group__0__Impl1578 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group__1__Impl_in_rule__Optional__Group__11609 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__SequenceAssignment_1_in_rule__Optional__Group__1__Impl1636 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__0__Impl_in_rule__Optional__Group_0__01670 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1_in_rule__Optional__Group_0__01673 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_25_in_rule__Optional__Group_0__0__Impl1701 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__1__Impl_in_rule__Optional__Group_0__11732 = new BitSet(new long[]{0x0000000004000000L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2_in_rule__Optional__Group_0__11735 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__ProbabilityAssignment_0_1_in_rule__Optional__Group_0__1__Impl1762 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Optional__Group_0__2__Impl_in_rule__Optional__Group_0__21792 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_26_in_rule__Optional__Group_0__2__Impl1820 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__0__Impl_in_rule__Sequence__Group__01857 = new BitSet(new long[]{0x0000000000000040L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1_in_rule__Sequence__Group__01860 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_27_in_rule__Sequence__Group__0__Impl1888 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__1__Impl_in_rule__Sequence__Group__11919 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2_in_rule__Sequence__Group__11922 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__NameAssignment_1_in_rule__Sequence__Group__1__Impl1949 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__2__Impl_in_rule__Sequence__Group__21979 = new BitSet(new long[]{0x00000000D0000100L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3_in_rule__Sequence__Group__21982 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_LEFT_BRACKET_in_rule__Sequence__Group__2__Impl2009 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__3__Impl_in_rule__Sequence__Group__32038 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4_in_rule__Sequence__Group__32041 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3_in_rule__Sequence__Group__3__Impl2068 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group__4__Impl_in_rule__Sequence__Group__42098 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_RIGHT_BRACKET_in_rule__Sequence__Group__4__Impl2125 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0__Impl_in_rule__Sequence__Group_3_0__02164 = new BitSet(new long[]{0x0000000020000000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1_in_rule__Sequence__Group_3_0__02167 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0_in_rule__Sequence__Group_3_0__0__Impl2194 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__1__Impl_in_rule__Sequence__Group_3_0__12224 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0_in_rule__Sequence__Group_3_0__1__Impl2251 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__0__Impl_in_rule__Sequence__Group_3_0_0__02286 = new BitSet(new long[]{0x0000000010000100L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1_in_rule__Sequence__Group_3_0_0__02289 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_28_in_rule__Sequence__Group_3_0_0__0__Impl2318 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_0__1__Impl_in_rule__Sequence__Group_3_0_0__12351 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UrlAssignment_3_0_0_1_in_rule__Sequence__Group_3_0_0__1__Impl2378 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__0__Impl_in_rule__Sequence__Group_3_0_1__02412 = new BitSet(new long[]{0x0000000000000100L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1_in_rule__Sequence__Group_3_0_1__02415 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_29_in_rule__Sequence__Group_3_0_1__0__Impl2443 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0_1__1__Impl_in_rule__Sequence__Group_3_0_1__12474 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__DescriptionAssignment_3_0_1_1_in_rule__Sequence__Group_3_0_1__1__Impl2501 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0__Impl_in_rule__Sequence__Group_3_1__02535 = new BitSet(new long[]{0x0000000000000080L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1_in_rule__Sequence__Group_3_1__02538 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_30_in_rule__Sequence__Group_3_1__0__Impl2566 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__1__Impl_in_rule__Sequence__Group_3_1__12597 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__LengthAssignment_3_1_1_in_rule__Sequence__Group_3_1__1__Impl2624 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0__Impl_in_rule__Sequence__Group_3_2__02658 = new BitSet(new long[]{0x00000000001FE000L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1_in_rule__Sequence__Group_3_2__02661 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_31_in_rule__Sequence__Group_3_2__0__Impl2689 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__1__Impl_in_rule__Sequence__Group_3_2__12720 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__MimetypeAssignment_3_2_1_in_rule__Sequence__Group_3_2__1__Impl2747 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__0_in_rule__Sequence__UnorderedGroup_32782 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_0__0_in_rule__Sequence__UnorderedGroup_3__Impl2871 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_1__0_in_rule__Sequence__UnorderedGroup_3__Impl2962 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__Group_3_2__0_in_rule__Sequence__UnorderedGroup_3__Impl3053 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__03112 = new BitSet(new long[]{0x00000000D0000102L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__1_in_rule__Sequence__UnorderedGroup_3__03115 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__13140 = new BitSet(new long[]{0x00000000D0000102L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__2_in_rule__Sequence__UnorderedGroup_3__13143 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_rule__Sequence__UnorderedGroup_3__Impl_in_rule__Sequence__UnorderedGroup_3__23168 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleStatement_in_rule__VideoGen__StatementsAssignment_23202 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Alternatives__NameAssignment_13233 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleOptional_in_rule__Alternatives__OptionsAssignment_33264 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Mandatory__SequenceAssignment3295 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Optional__ProbabilityAssignment_0_13326 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleSequence_in_rule__Optional__SequenceAssignment_13357 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_ID_in_rule__Sequence__NameAssignment_13388 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__UrlAssignment_3_0_0_13419 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_STRING_in_rule__Sequence__DescriptionAssignment_3_0_1_13450 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_RULE_INT_in_rule__Sequence__LengthAssignment_3_1_13481 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_ruleMimetypes_Enum_in_rule__Sequence__MimetypeAssignment_3_2_13512 = new BitSet(new long[]{0x0000000000000002L});

}
