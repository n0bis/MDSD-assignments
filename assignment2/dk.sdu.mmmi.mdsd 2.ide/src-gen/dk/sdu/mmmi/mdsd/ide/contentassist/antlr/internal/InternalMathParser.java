package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

import java.io.InputStream;
import org.eclipse.xtext.*;
import org.eclipse.xtext.parser.*;
import org.eclipse.xtext.parser.impl.*;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.parser.antlr.XtextTokenStream;
import org.eclipse.xtext.parser.antlr.XtextTokenStream.HiddenTokens;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.DFA;
import dk.sdu.mmmi.mdsd.services.MathGrammarAccess;



import org.antlr.runtime.*;
import java.util.Stack;
import java.util.List;
import java.util.ArrayList;

@SuppressWarnings("all")
public class InternalMathParser extends AbstractInternalContentAssistParser {
    public static final String[] tokenNames = new String[] {
        "<invalid>", "<EOR>", "<DOWN>", "<UP>", "RULE_ID", "RULE_INT", "RULE_STRING", "RULE_ML_COMMENT", "RULE_SL_COMMENT", "RULE_WS", "RULE_ANY_OTHER", "'*'", "'/'", "'var'", "'='", "'let'", "'in'", "'end'", "'+'", "'-'", "'('", "')'"
    };
    public static final int RULE_STRING=6;
    public static final int RULE_SL_COMMENT=8;
    public static final int T__19=19;
    public static final int T__15=15;
    public static final int T__16=16;
    public static final int T__17=17;
    public static final int T__18=18;
    public static final int T__11=11;
    public static final int T__12=12;
    public static final int T__13=13;
    public static final int T__14=14;
    public static final int EOF=-1;
    public static final int RULE_ID=4;
    public static final int RULE_WS=9;
    public static final int RULE_ANY_OTHER=10;
    public static final int RULE_INT=5;
    public static final int RULE_ML_COMMENT=7;
    public static final int T__20=20;
    public static final int T__21=21;

    // delegates
    // delegators


        public InternalMathParser(TokenStream input) {
            this(input, new RecognizerSharedState());
        }
        public InternalMathParser(TokenStream input, RecognizerSharedState state) {
            super(input, state);
             
        }
        

    public String[] getTokenNames() { return InternalMathParser.tokenNames; }
    public String getGrammarFileName() { return "InternalMath.g"; }


    	private MathGrammarAccess grammarAccess;

    	public void setGrammarAccess(MathGrammarAccess grammarAccess) {
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



    // $ANTLR start "entryRuleMathExp"
    // InternalMath.g:53:1: entryRuleMathExp : ruleMathExp EOF ;
    public final void entryRuleMathExp() throws RecognitionException {
        try {
            // InternalMath.g:54:1: ( ruleMathExp EOF )
            // InternalMath.g:55:1: ruleMathExp EOF
            {
             before(grammarAccess.getMathExpRule()); 
            pushFollow(FOLLOW_1);
            ruleMathExp();

            state._fsp--;

             after(grammarAccess.getMathExpRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMathExp"


    // $ANTLR start "ruleMathExp"
    // InternalMath.g:62:1: ruleMathExp : ( ( rule__MathExp__ElementsAssignment )* ) ;
    public final void ruleMathExp() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:66:2: ( ( ( rule__MathExp__ElementsAssignment )* ) )
            // InternalMath.g:67:2: ( ( rule__MathExp__ElementsAssignment )* )
            {
            // InternalMath.g:67:2: ( ( rule__MathExp__ElementsAssignment )* )
            // InternalMath.g:68:3: ( rule__MathExp__ElementsAssignment )*
            {
             before(grammarAccess.getMathExpAccess().getElementsAssignment()); 
            // InternalMath.g:69:3: ( rule__MathExp__ElementsAssignment )*
            loop1:
            do {
                int alt1=2;
                int LA1_0 = input.LA(1);

                if ( (LA1_0==13) ) {
                    alt1=1;
                }


                switch (alt1) {
            	case 1 :
            	    // InternalMath.g:69:4: rule__MathExp__ElementsAssignment
            	    {
            	    pushFollow(FOLLOW_3);
            	    rule__MathExp__ElementsAssignment();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop1;
                }
            } while (true);

             after(grammarAccess.getMathExpAccess().getElementsAssignment()); 

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
    // $ANTLR end "ruleMathExp"


    // $ANTLR start "entryRuleAbstractElement"
    // InternalMath.g:78:1: entryRuleAbstractElement : ruleAbstractElement EOF ;
    public final void entryRuleAbstractElement() throws RecognitionException {
        try {
            // InternalMath.g:79:1: ( ruleAbstractElement EOF )
            // InternalMath.g:80:1: ruleAbstractElement EOF
            {
             before(grammarAccess.getAbstractElementRule()); 
            pushFollow(FOLLOW_1);
            ruleAbstractElement();

            state._fsp--;

             after(grammarAccess.getAbstractElementRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAbstractElement"


    // $ANTLR start "ruleAbstractElement"
    // InternalMath.g:87:1: ruleAbstractElement : ( ( rule__AbstractElement__Alternatives ) ) ;
    public final void ruleAbstractElement() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:91:2: ( ( ( rule__AbstractElement__Alternatives ) ) )
            // InternalMath.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            {
            // InternalMath.g:92:2: ( ( rule__AbstractElement__Alternatives ) )
            // InternalMath.g:93:3: ( rule__AbstractElement__Alternatives )
            {
             before(grammarAccess.getAbstractElementAccess().getAlternatives()); 
            // InternalMath.g:94:3: ( rule__AbstractElement__Alternatives )
            // InternalMath.g:94:4: rule__AbstractElement__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__AbstractElement__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAbstractElementAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAbstractElement"


    // $ANTLR start "entryRuleVariable"
    // InternalMath.g:103:1: entryRuleVariable : ruleVariable EOF ;
    public final void entryRuleVariable() throws RecognitionException {
        try {
            // InternalMath.g:104:1: ( ruleVariable EOF )
            // InternalMath.g:105:1: ruleVariable EOF
            {
             before(grammarAccess.getVariableRule()); 
            pushFollow(FOLLOW_1);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getVariableRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleVariable"


    // $ANTLR start "ruleVariable"
    // InternalMath.g:112:1: ruleVariable : ( ( rule__Variable__Group__0 ) ) ;
    public final void ruleVariable() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:116:2: ( ( ( rule__Variable__Group__0 ) ) )
            // InternalMath.g:117:2: ( ( rule__Variable__Group__0 ) )
            {
            // InternalMath.g:117:2: ( ( rule__Variable__Group__0 ) )
            // InternalMath.g:118:3: ( rule__Variable__Group__0 )
            {
             before(grammarAccess.getVariableAccess().getGroup()); 
            // InternalMath.g:119:3: ( rule__Variable__Group__0 )
            // InternalMath.g:119:4: rule__Variable__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getGroup()); 

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
    // $ANTLR end "ruleVariable"


    // $ANTLR start "entryRuleLetExpression"
    // InternalMath.g:128:1: entryRuleLetExpression : ruleLetExpression EOF ;
    public final void entryRuleLetExpression() throws RecognitionException {
        try {
            // InternalMath.g:129:1: ( ruleLetExpression EOF )
            // InternalMath.g:130:1: ruleLetExpression EOF
            {
             before(grammarAccess.getLetExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleLetExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleLetExpression"


    // $ANTLR start "ruleLetExpression"
    // InternalMath.g:137:1: ruleLetExpression : ( ( rule__LetExpression__Group__0 ) ) ;
    public final void ruleLetExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:141:2: ( ( ( rule__LetExpression__Group__0 ) ) )
            // InternalMath.g:142:2: ( ( rule__LetExpression__Group__0 ) )
            {
            // InternalMath.g:142:2: ( ( rule__LetExpression__Group__0 ) )
            // InternalMath.g:143:3: ( rule__LetExpression__Group__0 )
            {
             before(grammarAccess.getLetExpressionAccess().getGroup()); 
            // InternalMath.g:144:3: ( rule__LetExpression__Group__0 )
            // InternalMath.g:144:4: rule__LetExpression__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getGroup()); 

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
    // $ANTLR end "ruleLetExpression"


    // $ANTLR start "entryRuleExpression"
    // InternalMath.g:153:1: entryRuleExpression : ruleExpression EOF ;
    public final void entryRuleExpression() throws RecognitionException {
        try {
            // InternalMath.g:154:1: ( ruleExpression EOF )
            // InternalMath.g:155:1: ruleExpression EOF
            {
             before(grammarAccess.getExpressionRule()); 
            pushFollow(FOLLOW_1);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getExpressionRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleExpression"


    // $ANTLR start "ruleExpression"
    // InternalMath.g:162:1: ruleExpression : ( rulePlusOrMinus ) ;
    public final void ruleExpression() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:166:2: ( ( rulePlusOrMinus ) )
            // InternalMath.g:167:2: ( rulePlusOrMinus )
            {
            // InternalMath.g:167:2: ( rulePlusOrMinus )
            // InternalMath.g:168:3: rulePlusOrMinus
            {
             before(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 
            pushFollow(FOLLOW_2);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); 

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
    // $ANTLR end "ruleExpression"


    // $ANTLR start "entryRulePlusOrMinus"
    // InternalMath.g:178:1: entryRulePlusOrMinus : rulePlusOrMinus EOF ;
    public final void entryRulePlusOrMinus() throws RecognitionException {
        try {
            // InternalMath.g:179:1: ( rulePlusOrMinus EOF )
            // InternalMath.g:180:1: rulePlusOrMinus EOF
            {
             before(grammarAccess.getPlusOrMinusRule()); 
            pushFollow(FOLLOW_1);
            rulePlusOrMinus();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePlusOrMinus"


    // $ANTLR start "rulePlusOrMinus"
    // InternalMath.g:187:1: rulePlusOrMinus : ( ( rule__PlusOrMinus__Group__0 ) ) ;
    public final void rulePlusOrMinus() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:191:2: ( ( ( rule__PlusOrMinus__Group__0 ) ) )
            // InternalMath.g:192:2: ( ( rule__PlusOrMinus__Group__0 ) )
            {
            // InternalMath.g:192:2: ( ( rule__PlusOrMinus__Group__0 ) )
            // InternalMath.g:193:3: ( rule__PlusOrMinus__Group__0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup()); 
            // InternalMath.g:194:3: ( rule__PlusOrMinus__Group__0 )
            // InternalMath.g:194:4: rule__PlusOrMinus__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getGroup()); 

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
    // $ANTLR end "rulePlusOrMinus"


    // $ANTLR start "entryRuleMulOrDiv"
    // InternalMath.g:203:1: entryRuleMulOrDiv : ruleMulOrDiv EOF ;
    public final void entryRuleMulOrDiv() throws RecognitionException {
        try {
            // InternalMath.g:204:1: ( ruleMulOrDiv EOF )
            // InternalMath.g:205:1: ruleMulOrDiv EOF
            {
             before(grammarAccess.getMulOrDivRule()); 
            pushFollow(FOLLOW_1);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getMulOrDivRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleMulOrDiv"


    // $ANTLR start "ruleMulOrDiv"
    // InternalMath.g:212:1: ruleMulOrDiv : ( ( rule__MulOrDiv__Group__0 ) ) ;
    public final void ruleMulOrDiv() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:216:2: ( ( ( rule__MulOrDiv__Group__0 ) ) )
            // InternalMath.g:217:2: ( ( rule__MulOrDiv__Group__0 ) )
            {
            // InternalMath.g:217:2: ( ( rule__MulOrDiv__Group__0 ) )
            // InternalMath.g:218:3: ( rule__MulOrDiv__Group__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup()); 
            // InternalMath.g:219:3: ( rule__MulOrDiv__Group__0 )
            // InternalMath.g:219:4: rule__MulOrDiv__Group__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup()); 

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
    // $ANTLR end "ruleMulOrDiv"


    // $ANTLR start "entryRulePrimary"
    // InternalMath.g:228:1: entryRulePrimary : rulePrimary EOF ;
    public final void entryRulePrimary() throws RecognitionException {
        try {
            // InternalMath.g:229:1: ( rulePrimary EOF )
            // InternalMath.g:230:1: rulePrimary EOF
            {
             before(grammarAccess.getPrimaryRule()); 
            pushFollow(FOLLOW_1);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getPrimaryRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRulePrimary"


    // $ANTLR start "rulePrimary"
    // InternalMath.g:237:1: rulePrimary : ( ( rule__Primary__Alternatives ) ) ;
    public final void rulePrimary() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:241:2: ( ( ( rule__Primary__Alternatives ) ) )
            // InternalMath.g:242:2: ( ( rule__Primary__Alternatives ) )
            {
            // InternalMath.g:242:2: ( ( rule__Primary__Alternatives ) )
            // InternalMath.g:243:3: ( rule__Primary__Alternatives )
            {
             before(grammarAccess.getPrimaryAccess().getAlternatives()); 
            // InternalMath.g:244:3: ( rule__Primary__Alternatives )
            // InternalMath.g:244:4: rule__Primary__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getPrimaryAccess().getAlternatives()); 

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
    // $ANTLR end "rulePrimary"


    // $ANTLR start "entryRuleAtomic"
    // InternalMath.g:253:1: entryRuleAtomic : ruleAtomic EOF ;
    public final void entryRuleAtomic() throws RecognitionException {
        try {
            // InternalMath.g:254:1: ( ruleAtomic EOF )
            // InternalMath.g:255:1: ruleAtomic EOF
            {
             before(grammarAccess.getAtomicRule()); 
            pushFollow(FOLLOW_1);
            ruleAtomic();

            state._fsp--;

             after(grammarAccess.getAtomicRule()); 
            match(input,EOF,FOLLOW_2); 

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
    // $ANTLR end "entryRuleAtomic"


    // $ANTLR start "ruleAtomic"
    // InternalMath.g:262:1: ruleAtomic : ( ( rule__Atomic__Alternatives ) ) ;
    public final void ruleAtomic() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:266:2: ( ( ( rule__Atomic__Alternatives ) ) )
            // InternalMath.g:267:2: ( ( rule__Atomic__Alternatives ) )
            {
            // InternalMath.g:267:2: ( ( rule__Atomic__Alternatives ) )
            // InternalMath.g:268:3: ( rule__Atomic__Alternatives )
            {
             before(grammarAccess.getAtomicAccess().getAlternatives()); 
            // InternalMath.g:269:3: ( rule__Atomic__Alternatives )
            // InternalMath.g:269:4: rule__Atomic__Alternatives
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Alternatives();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getAlternatives()); 

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
    // $ANTLR end "ruleAtomic"


    // $ANTLR start "rule__AbstractElement__Alternatives"
    // InternalMath.g:277:1: rule__AbstractElement__Alternatives : ( ( ruleVariable ) | ( ruleLetExpression ) );
    public final void rule__AbstractElement__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:281:1: ( ( ruleVariable ) | ( ruleLetExpression ) )
            int alt2=2;
            int LA2_0 = input.LA(1);

            if ( (LA2_0==13) ) {
                alt2=1;
            }
            else if ( (LA2_0==15) ) {
                alt2=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 2, 0, input);

                throw nvae;
            }
            switch (alt2) {
                case 1 :
                    // InternalMath.g:282:2: ( ruleVariable )
                    {
                    // InternalMath.g:282:2: ( ruleVariable )
                    // InternalMath.g:283:3: ruleVariable
                    {
                     before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleVariable();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:288:2: ( ruleLetExpression )
                    {
                    // InternalMath.g:288:2: ( ruleLetExpression )
                    // InternalMath.g:289:3: ruleLetExpression
                    {
                     before(grammarAccess.getAbstractElementAccess().getLetExpressionParserRuleCall_1()); 
                    pushFollow(FOLLOW_2);
                    ruleLetExpression();

                    state._fsp--;

                     after(grammarAccess.getAbstractElementAccess().getLetExpressionParserRuleCall_1()); 

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
    // $ANTLR end "rule__AbstractElement__Alternatives"


    // $ANTLR start "rule__PlusOrMinus__Alternatives_1_0"
    // InternalMath.g:298:1: rule__PlusOrMinus__Alternatives_1_0 : ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) );
    public final void rule__PlusOrMinus__Alternatives_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:302:1: ( ( ( rule__PlusOrMinus__Group_1_0_0__0 ) ) | ( ( rule__PlusOrMinus__Group_1_0_1__0 ) ) )
            int alt3=2;
            int LA3_0 = input.LA(1);

            if ( (LA3_0==18) ) {
                alt3=1;
            }
            else if ( (LA3_0==19) ) {
                alt3=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 3, 0, input);

                throw nvae;
            }
            switch (alt3) {
                case 1 :
                    // InternalMath.g:303:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    {
                    // InternalMath.g:303:2: ( ( rule__PlusOrMinus__Group_1_0_0__0 ) )
                    // InternalMath.g:304:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 
                    // InternalMath.g:305:3: ( rule__PlusOrMinus__Group_1_0_0__0 )
                    // InternalMath.g:305:4: rule__PlusOrMinus__Group_1_0_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:309:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    {
                    // InternalMath.g:309:2: ( ( rule__PlusOrMinus__Group_1_0_1__0 ) )
                    // InternalMath.g:310:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    {
                     before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 
                    // InternalMath.g:311:3: ( rule__PlusOrMinus__Group_1_0_1__0 )
                    // InternalMath.g:311:4: rule__PlusOrMinus__Group_1_0_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__PlusOrMinus__Group_1_0_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Alternatives_1_0"


    // $ANTLR start "rule__MulOrDiv__OpAlternatives_1_0_1_0"
    // InternalMath.g:319:1: rule__MulOrDiv__OpAlternatives_1_0_1_0 : ( ( '*' ) | ( '/' ) );
    public final void rule__MulOrDiv__OpAlternatives_1_0_1_0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:323:1: ( ( '*' ) | ( '/' ) )
            int alt4=2;
            int LA4_0 = input.LA(1);

            if ( (LA4_0==11) ) {
                alt4=1;
            }
            else if ( (LA4_0==12) ) {
                alt4=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 4, 0, input);

                throw nvae;
            }
            switch (alt4) {
                case 1 :
                    // InternalMath.g:324:2: ( '*' )
                    {
                    // InternalMath.g:324:2: ( '*' )
                    // InternalMath.g:325:3: '*'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 
                    match(input,11,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:330:2: ( '/' )
                    {
                    // InternalMath.g:330:2: ( '/' )
                    // InternalMath.g:331:3: '/'
                    {
                     before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 
                    match(input,12,FOLLOW_2); 
                     after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAlternatives_1_0_1_0"


    // $ANTLR start "rule__Primary__Alternatives"
    // InternalMath.g:340:1: rule__Primary__Alternatives : ( ( ruleAtomic ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAbstractElement ) );
    public final void rule__Primary__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:344:1: ( ( ruleAtomic ) | ( ( rule__Primary__Group_1__0 ) ) | ( ruleAbstractElement ) )
            int alt5=3;
            switch ( input.LA(1) ) {
            case RULE_ID:
            case RULE_INT:
                {
                alt5=1;
                }
                break;
            case 20:
                {
                alt5=2;
                }
                break;
            case 13:
            case 15:
                {
                alt5=3;
                }
                break;
            default:
                NoViableAltException nvae =
                    new NoViableAltException("", 5, 0, input);

                throw nvae;
            }

            switch (alt5) {
                case 1 :
                    // InternalMath.g:345:2: ( ruleAtomic )
                    {
                    // InternalMath.g:345:2: ( ruleAtomic )
                    // InternalMath.g:346:3: ruleAtomic
                    {
                     before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 
                    pushFollow(FOLLOW_2);
                    ruleAtomic();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:351:2: ( ( rule__Primary__Group_1__0 ) )
                    {
                    // InternalMath.g:351:2: ( ( rule__Primary__Group_1__0 ) )
                    // InternalMath.g:352:3: ( rule__Primary__Group_1__0 )
                    {
                     before(grammarAccess.getPrimaryAccess().getGroup_1()); 
                    // InternalMath.g:353:3: ( rule__Primary__Group_1__0 )
                    // InternalMath.g:353:4: rule__Primary__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Primary__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getPrimaryAccess().getGroup_1()); 

                    }


                    }
                    break;
                case 3 :
                    // InternalMath.g:357:2: ( ruleAbstractElement )
                    {
                    // InternalMath.g:357:2: ( ruleAbstractElement )
                    // InternalMath.g:358:3: ruleAbstractElement
                    {
                     before(grammarAccess.getPrimaryAccess().getAbstractElementParserRuleCall_2()); 
                    pushFollow(FOLLOW_2);
                    ruleAbstractElement();

                    state._fsp--;

                     after(grammarAccess.getPrimaryAccess().getAbstractElementParserRuleCall_2()); 

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
    // $ANTLR end "rule__Primary__Alternatives"


    // $ANTLR start "rule__Atomic__Alternatives"
    // InternalMath.g:367:1: rule__Atomic__Alternatives : ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) );
    public final void rule__Atomic__Alternatives() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:371:1: ( ( ( rule__Atomic__Group_0__0 ) ) | ( ( rule__Atomic__Group_1__0 ) ) )
            int alt6=2;
            int LA6_0 = input.LA(1);

            if ( (LA6_0==RULE_INT) ) {
                alt6=1;
            }
            else if ( (LA6_0==RULE_ID) ) {
                alt6=2;
            }
            else {
                NoViableAltException nvae =
                    new NoViableAltException("", 6, 0, input);

                throw nvae;
            }
            switch (alt6) {
                case 1 :
                    // InternalMath.g:372:2: ( ( rule__Atomic__Group_0__0 ) )
                    {
                    // InternalMath.g:372:2: ( ( rule__Atomic__Group_0__0 ) )
                    // InternalMath.g:373:3: ( rule__Atomic__Group_0__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_0()); 
                    // InternalMath.g:374:3: ( rule__Atomic__Group_0__0 )
                    // InternalMath.g:374:4: rule__Atomic__Group_0__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_0__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_0()); 

                    }


                    }
                    break;
                case 2 :
                    // InternalMath.g:378:2: ( ( rule__Atomic__Group_1__0 ) )
                    {
                    // InternalMath.g:378:2: ( ( rule__Atomic__Group_1__0 ) )
                    // InternalMath.g:379:3: ( rule__Atomic__Group_1__0 )
                    {
                     before(grammarAccess.getAtomicAccess().getGroup_1()); 
                    // InternalMath.g:380:3: ( rule__Atomic__Group_1__0 )
                    // InternalMath.g:380:4: rule__Atomic__Group_1__0
                    {
                    pushFollow(FOLLOW_2);
                    rule__Atomic__Group_1__0();

                    state._fsp--;


                    }

                     after(grammarAccess.getAtomicAccess().getGroup_1()); 

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
    // $ANTLR end "rule__Atomic__Alternatives"


    // $ANTLR start "rule__Variable__Group__0"
    // InternalMath.g:388:1: rule__Variable__Group__0 : rule__Variable__Group__0__Impl rule__Variable__Group__1 ;
    public final void rule__Variable__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:392:1: ( rule__Variable__Group__0__Impl rule__Variable__Group__1 )
            // InternalMath.g:393:2: rule__Variable__Group__0__Impl rule__Variable__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__Variable__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__1();

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
    // $ANTLR end "rule__Variable__Group__0"


    // $ANTLR start "rule__Variable__Group__0__Impl"
    // InternalMath.g:400:1: rule__Variable__Group__0__Impl : ( 'var' ) ;
    public final void rule__Variable__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:404:1: ( ( 'var' ) )
            // InternalMath.g:405:1: ( 'var' )
            {
            // InternalMath.g:405:1: ( 'var' )
            // InternalMath.g:406:2: 'var'
            {
             before(grammarAccess.getVariableAccess().getVarKeyword_0()); 
            match(input,13,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getVarKeyword_0()); 

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
    // $ANTLR end "rule__Variable__Group__0__Impl"


    // $ANTLR start "rule__Variable__Group__1"
    // InternalMath.g:415:1: rule__Variable__Group__1 : rule__Variable__Group__1__Impl rule__Variable__Group__2 ;
    public final void rule__Variable__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:419:1: ( rule__Variable__Group__1__Impl rule__Variable__Group__2 )
            // InternalMath.g:420:2: rule__Variable__Group__1__Impl rule__Variable__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__Variable__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__2();

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
    // $ANTLR end "rule__Variable__Group__1"


    // $ANTLR start "rule__Variable__Group__1__Impl"
    // InternalMath.g:427:1: rule__Variable__Group__1__Impl : ( ( rule__Variable__NameAssignment_1 ) ) ;
    public final void rule__Variable__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:431:1: ( ( ( rule__Variable__NameAssignment_1 ) ) )
            // InternalMath.g:432:1: ( ( rule__Variable__NameAssignment_1 ) )
            {
            // InternalMath.g:432:1: ( ( rule__Variable__NameAssignment_1 ) )
            // InternalMath.g:433:2: ( rule__Variable__NameAssignment_1 )
            {
             before(grammarAccess.getVariableAccess().getNameAssignment_1()); 
            // InternalMath.g:434:2: ( rule__Variable__NameAssignment_1 )
            // InternalMath.g:434:3: rule__Variable__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__Variable__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__Variable__Group__1__Impl"


    // $ANTLR start "rule__Variable__Group__2"
    // InternalMath.g:442:1: rule__Variable__Group__2 : rule__Variable__Group__2__Impl rule__Variable__Group__3 ;
    public final void rule__Variable__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:446:1: ( rule__Variable__Group__2__Impl rule__Variable__Group__3 )
            // InternalMath.g:447:2: rule__Variable__Group__2__Impl rule__Variable__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__Variable__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Variable__Group__3();

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
    // $ANTLR end "rule__Variable__Group__2"


    // $ANTLR start "rule__Variable__Group__2__Impl"
    // InternalMath.g:454:1: rule__Variable__Group__2__Impl : ( '=' ) ;
    public final void rule__Variable__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:458:1: ( ( '=' ) )
            // InternalMath.g:459:1: ( '=' )
            {
            // InternalMath.g:459:1: ( '=' )
            // InternalMath.g:460:2: '='
            {
             before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__Variable__Group__2__Impl"


    // $ANTLR start "rule__Variable__Group__3"
    // InternalMath.g:469:1: rule__Variable__Group__3 : rule__Variable__Group__3__Impl ;
    public final void rule__Variable__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:473:1: ( rule__Variable__Group__3__Impl )
            // InternalMath.g:474:2: rule__Variable__Group__3__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Variable__Group__3__Impl();

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
    // $ANTLR end "rule__Variable__Group__3"


    // $ANTLR start "rule__Variable__Group__3__Impl"
    // InternalMath.g:480:1: rule__Variable__Group__3__Impl : ( ( rule__Variable__ExpressionAssignment_3 ) ) ;
    public final void rule__Variable__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:484:1: ( ( ( rule__Variable__ExpressionAssignment_3 ) ) )
            // InternalMath.g:485:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            {
            // InternalMath.g:485:1: ( ( rule__Variable__ExpressionAssignment_3 ) )
            // InternalMath.g:486:2: ( rule__Variable__ExpressionAssignment_3 )
            {
             before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 
            // InternalMath.g:487:2: ( rule__Variable__ExpressionAssignment_3 )
            // InternalMath.g:487:3: rule__Variable__ExpressionAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__Variable__ExpressionAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getVariableAccess().getExpressionAssignment_3()); 

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
    // $ANTLR end "rule__Variable__Group__3__Impl"


    // $ANTLR start "rule__LetExpression__Group__0"
    // InternalMath.g:496:1: rule__LetExpression__Group__0 : rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 ;
    public final void rule__LetExpression__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:500:1: ( rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1 )
            // InternalMath.g:501:2: rule__LetExpression__Group__0__Impl rule__LetExpression__Group__1
            {
            pushFollow(FOLLOW_4);
            rule__LetExpression__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__1();

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
    // $ANTLR end "rule__LetExpression__Group__0"


    // $ANTLR start "rule__LetExpression__Group__0__Impl"
    // InternalMath.g:508:1: rule__LetExpression__Group__0__Impl : ( 'let' ) ;
    public final void rule__LetExpression__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:512:1: ( ( 'let' ) )
            // InternalMath.g:513:1: ( 'let' )
            {
            // InternalMath.g:513:1: ( 'let' )
            // InternalMath.g:514:2: 'let'
            {
             before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 
            match(input,15,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); 

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
    // $ANTLR end "rule__LetExpression__Group__0__Impl"


    // $ANTLR start "rule__LetExpression__Group__1"
    // InternalMath.g:523:1: rule__LetExpression__Group__1 : rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 ;
    public final void rule__LetExpression__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:527:1: ( rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2 )
            // InternalMath.g:528:2: rule__LetExpression__Group__1__Impl rule__LetExpression__Group__2
            {
            pushFollow(FOLLOW_5);
            rule__LetExpression__Group__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__2();

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
    // $ANTLR end "rule__LetExpression__Group__1"


    // $ANTLR start "rule__LetExpression__Group__1__Impl"
    // InternalMath.g:535:1: rule__LetExpression__Group__1__Impl : ( ( rule__LetExpression__NameAssignment_1 ) ) ;
    public final void rule__LetExpression__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:539:1: ( ( ( rule__LetExpression__NameAssignment_1 ) ) )
            // InternalMath.g:540:1: ( ( rule__LetExpression__NameAssignment_1 ) )
            {
            // InternalMath.g:540:1: ( ( rule__LetExpression__NameAssignment_1 ) )
            // InternalMath.g:541:2: ( rule__LetExpression__NameAssignment_1 )
            {
             before(grammarAccess.getLetExpressionAccess().getNameAssignment_1()); 
            // InternalMath.g:542:2: ( rule__LetExpression__NameAssignment_1 )
            // InternalMath.g:542:3: rule__LetExpression__NameAssignment_1
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__NameAssignment_1();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getNameAssignment_1()); 

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
    // $ANTLR end "rule__LetExpression__Group__1__Impl"


    // $ANTLR start "rule__LetExpression__Group__2"
    // InternalMath.g:550:1: rule__LetExpression__Group__2 : rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 ;
    public final void rule__LetExpression__Group__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:554:1: ( rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3 )
            // InternalMath.g:555:2: rule__LetExpression__Group__2__Impl rule__LetExpression__Group__3
            {
            pushFollow(FOLLOW_6);
            rule__LetExpression__Group__2__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__3();

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
    // $ANTLR end "rule__LetExpression__Group__2"


    // $ANTLR start "rule__LetExpression__Group__2__Impl"
    // InternalMath.g:562:1: rule__LetExpression__Group__2__Impl : ( '=' ) ;
    public final void rule__LetExpression__Group__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:566:1: ( ( '=' ) )
            // InternalMath.g:567:1: ( '=' )
            {
            // InternalMath.g:567:1: ( '=' )
            // InternalMath.g:568:2: '='
            {
             before(grammarAccess.getLetExpressionAccess().getEqualsSignKeyword_2()); 
            match(input,14,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getEqualsSignKeyword_2()); 

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
    // $ANTLR end "rule__LetExpression__Group__2__Impl"


    // $ANTLR start "rule__LetExpression__Group__3"
    // InternalMath.g:577:1: rule__LetExpression__Group__3 : rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4 ;
    public final void rule__LetExpression__Group__3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:581:1: ( rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4 )
            // InternalMath.g:582:2: rule__LetExpression__Group__3__Impl rule__LetExpression__Group__4
            {
            pushFollow(FOLLOW_7);
            rule__LetExpression__Group__3__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__4();

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
    // $ANTLR end "rule__LetExpression__Group__3"


    // $ANTLR start "rule__LetExpression__Group__3__Impl"
    // InternalMath.g:589:1: rule__LetExpression__Group__3__Impl : ( ( rule__LetExpression__VariableAssignment_3 ) ) ;
    public final void rule__LetExpression__Group__3__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:593:1: ( ( ( rule__LetExpression__VariableAssignment_3 ) ) )
            // InternalMath.g:594:1: ( ( rule__LetExpression__VariableAssignment_3 ) )
            {
            // InternalMath.g:594:1: ( ( rule__LetExpression__VariableAssignment_3 ) )
            // InternalMath.g:595:2: ( rule__LetExpression__VariableAssignment_3 )
            {
             before(grammarAccess.getLetExpressionAccess().getVariableAssignment_3()); 
            // InternalMath.g:596:2: ( rule__LetExpression__VariableAssignment_3 )
            // InternalMath.g:596:3: rule__LetExpression__VariableAssignment_3
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__VariableAssignment_3();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getVariableAssignment_3()); 

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
    // $ANTLR end "rule__LetExpression__Group__3__Impl"


    // $ANTLR start "rule__LetExpression__Group__4"
    // InternalMath.g:604:1: rule__LetExpression__Group__4 : rule__LetExpression__Group__4__Impl rule__LetExpression__Group__5 ;
    public final void rule__LetExpression__Group__4() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:608:1: ( rule__LetExpression__Group__4__Impl rule__LetExpression__Group__5 )
            // InternalMath.g:609:2: rule__LetExpression__Group__4__Impl rule__LetExpression__Group__5
            {
            pushFollow(FOLLOW_6);
            rule__LetExpression__Group__4__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__5();

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
    // $ANTLR end "rule__LetExpression__Group__4"


    // $ANTLR start "rule__LetExpression__Group__4__Impl"
    // InternalMath.g:616:1: rule__LetExpression__Group__4__Impl : ( 'in' ) ;
    public final void rule__LetExpression__Group__4__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:620:1: ( ( 'in' ) )
            // InternalMath.g:621:1: ( 'in' )
            {
            // InternalMath.g:621:1: ( 'in' )
            // InternalMath.g:622:2: 'in'
            {
             before(grammarAccess.getLetExpressionAccess().getInKeyword_4()); 
            match(input,16,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getInKeyword_4()); 

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
    // $ANTLR end "rule__LetExpression__Group__4__Impl"


    // $ANTLR start "rule__LetExpression__Group__5"
    // InternalMath.g:631:1: rule__LetExpression__Group__5 : rule__LetExpression__Group__5__Impl rule__LetExpression__Group__6 ;
    public final void rule__LetExpression__Group__5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:635:1: ( rule__LetExpression__Group__5__Impl rule__LetExpression__Group__6 )
            // InternalMath.g:636:2: rule__LetExpression__Group__5__Impl rule__LetExpression__Group__6
            {
            pushFollow(FOLLOW_8);
            rule__LetExpression__Group__5__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__6();

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
    // $ANTLR end "rule__LetExpression__Group__5"


    // $ANTLR start "rule__LetExpression__Group__5__Impl"
    // InternalMath.g:643:1: rule__LetExpression__Group__5__Impl : ( ( rule__LetExpression__ExpressionAssignment_5 ) ) ;
    public final void rule__LetExpression__Group__5__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:647:1: ( ( ( rule__LetExpression__ExpressionAssignment_5 ) ) )
            // InternalMath.g:648:1: ( ( rule__LetExpression__ExpressionAssignment_5 ) )
            {
            // InternalMath.g:648:1: ( ( rule__LetExpression__ExpressionAssignment_5 ) )
            // InternalMath.g:649:2: ( rule__LetExpression__ExpressionAssignment_5 )
            {
             before(grammarAccess.getLetExpressionAccess().getExpressionAssignment_5()); 
            // InternalMath.g:650:2: ( rule__LetExpression__ExpressionAssignment_5 )
            // InternalMath.g:650:3: rule__LetExpression__ExpressionAssignment_5
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__ExpressionAssignment_5();

            state._fsp--;


            }

             after(grammarAccess.getLetExpressionAccess().getExpressionAssignment_5()); 

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
    // $ANTLR end "rule__LetExpression__Group__5__Impl"


    // $ANTLR start "rule__LetExpression__Group__6"
    // InternalMath.g:658:1: rule__LetExpression__Group__6 : rule__LetExpression__Group__6__Impl ;
    public final void rule__LetExpression__Group__6() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:662:1: ( rule__LetExpression__Group__6__Impl )
            // InternalMath.g:663:2: rule__LetExpression__Group__6__Impl
            {
            pushFollow(FOLLOW_2);
            rule__LetExpression__Group__6__Impl();

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
    // $ANTLR end "rule__LetExpression__Group__6"


    // $ANTLR start "rule__LetExpression__Group__6__Impl"
    // InternalMath.g:669:1: rule__LetExpression__Group__6__Impl : ( 'end' ) ;
    public final void rule__LetExpression__Group__6__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:673:1: ( ( 'end' ) )
            // InternalMath.g:674:1: ( 'end' )
            {
            // InternalMath.g:674:1: ( 'end' )
            // InternalMath.g:675:2: 'end'
            {
             before(grammarAccess.getLetExpressionAccess().getEndKeyword_6()); 
            match(input,17,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getEndKeyword_6()); 

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
    // $ANTLR end "rule__LetExpression__Group__6__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__0"
    // InternalMath.g:685:1: rule__PlusOrMinus__Group__0 : rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 ;
    public final void rule__PlusOrMinus__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:689:1: ( rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1 )
            // InternalMath.g:690:2: rule__PlusOrMinus__Group__0__Impl rule__PlusOrMinus__Group__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusOrMinus__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group__0"


    // $ANTLR start "rule__PlusOrMinus__Group__0__Impl"
    // InternalMath.g:697:1: rule__PlusOrMinus__Group__0__Impl : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:701:1: ( ( ruleMulOrDiv ) )
            // InternalMath.g:702:1: ( ruleMulOrDiv )
            {
            // InternalMath.g:702:1: ( ruleMulOrDiv )
            // InternalMath.g:703:2: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group__1"
    // InternalMath.g:712:1: rule__PlusOrMinus__Group__1 : rule__PlusOrMinus__Group__1__Impl ;
    public final void rule__PlusOrMinus__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:716:1: ( rule__PlusOrMinus__Group__1__Impl )
            // InternalMath.g:717:2: rule__PlusOrMinus__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group__1"


    // $ANTLR start "rule__PlusOrMinus__Group__1__Impl"
    // InternalMath.g:723:1: rule__PlusOrMinus__Group__1__Impl : ( ( rule__PlusOrMinus__Group_1__0 )* ) ;
    public final void rule__PlusOrMinus__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:727:1: ( ( ( rule__PlusOrMinus__Group_1__0 )* ) )
            // InternalMath.g:728:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            {
            // InternalMath.g:728:1: ( ( rule__PlusOrMinus__Group_1__0 )* )
            // InternalMath.g:729:2: ( rule__PlusOrMinus__Group_1__0 )*
            {
             before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 
            // InternalMath.g:730:2: ( rule__PlusOrMinus__Group_1__0 )*
            loop7:
            do {
                int alt7=2;
                int LA7_0 = input.LA(1);

                if ( (LA7_0==18) ) {
                    alt7=1;
                }
                else if ( (LA7_0==19) ) {
                    alt7=1;
                }


                switch (alt7) {
            	case 1 :
            	    // InternalMath.g:730:3: rule__PlusOrMinus__Group_1__0
            	    {
            	    pushFollow(FOLLOW_10);
            	    rule__PlusOrMinus__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop7;
                }
            } while (true);

             after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0"
    // InternalMath.g:739:1: rule__PlusOrMinus__Group_1__0 : rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 ;
    public final void rule__PlusOrMinus__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:743:1: ( rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1 )
            // InternalMath.g:744:2: rule__PlusOrMinus__Group_1__0__Impl rule__PlusOrMinus__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__PlusOrMinus__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1__0__Impl"
    // InternalMath.g:751:1: rule__PlusOrMinus__Group_1__0__Impl : ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) ;
    public final void rule__PlusOrMinus__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:755:1: ( ( ( rule__PlusOrMinus__Alternatives_1_0 ) ) )
            // InternalMath.g:756:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            {
            // InternalMath.g:756:1: ( ( rule__PlusOrMinus__Alternatives_1_0 ) )
            // InternalMath.g:757:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 
            // InternalMath.g:758:2: ( rule__PlusOrMinus__Alternatives_1_0 )
            // InternalMath.g:758:3: rule__PlusOrMinus__Alternatives_1_0
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Alternatives_1_0();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1"
    // InternalMath.g:766:1: rule__PlusOrMinus__Group_1__1 : rule__PlusOrMinus__Group_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:770:1: ( rule__PlusOrMinus__Group_1__1__Impl )
            // InternalMath.g:771:2: rule__PlusOrMinus__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1__1__Impl"
    // InternalMath.g:777:1: rule__PlusOrMinus__Group_1__1__Impl : ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) ;
    public final void rule__PlusOrMinus__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:781:1: ( ( ( rule__PlusOrMinus__RightAssignment_1_1 ) ) )
            // InternalMath.g:782:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            {
            // InternalMath.g:782:1: ( ( rule__PlusOrMinus__RightAssignment_1_1 ) )
            // InternalMath.g:783:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 
            // InternalMath.g:784:2: ( rule__PlusOrMinus__RightAssignment_1_1 )
            // InternalMath.g:784:3: rule__PlusOrMinus__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0"
    // InternalMath.g:793:1: rule__PlusOrMinus__Group_1_0_0__0 : rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 ;
    public final void rule__PlusOrMinus__Group_1_0_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:797:1: ( rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1 )
            // InternalMath.g:798:2: rule__PlusOrMinus__Group_1_0_0__0__Impl rule__PlusOrMinus__Group_1_0_0__1
            {
            pushFollow(FOLLOW_11);
            rule__PlusOrMinus__Group_1_0_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__0__Impl"
    // InternalMath.g:805:1: rule__PlusOrMinus__Group_1_0_0__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:809:1: ( ( () ) )
            // InternalMath.g:810:1: ( () )
            {
            // InternalMath.g:810:1: ( () )
            // InternalMath.g:811:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 
            // InternalMath.g:812:2: ()
            // InternalMath.g:812:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1"
    // InternalMath.g:820:1: rule__PlusOrMinus__Group_1_0_0__1 : rule__PlusOrMinus__Group_1_0_0__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:824:1: ( rule__PlusOrMinus__Group_1_0_0__1__Impl )
            // InternalMath.g:825:2: rule__PlusOrMinus__Group_1_0_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_0__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_0__1__Impl"
    // InternalMath.g:831:1: rule__PlusOrMinus__Group_1_0_0__1__Impl : ( '+' ) ;
    public final void rule__PlusOrMinus__Group_1_0_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:835:1: ( ( '+' ) )
            // InternalMath.g:836:1: ( '+' )
            {
            // InternalMath.g:836:1: ( '+' )
            // InternalMath.g:837:2: '+'
            {
             before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 
            match(input,18,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_0__1__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0"
    // InternalMath.g:847:1: rule__PlusOrMinus__Group_1_0_1__0 : rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 ;
    public final void rule__PlusOrMinus__Group_1_0_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:851:1: ( rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1 )
            // InternalMath.g:852:2: rule__PlusOrMinus__Group_1_0_1__0__Impl rule__PlusOrMinus__Group_1_0_1__1
            {
            pushFollow(FOLLOW_9);
            rule__PlusOrMinus__Group_1_0_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__0__Impl"
    // InternalMath.g:859:1: rule__PlusOrMinus__Group_1_0_1__0__Impl : ( () ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:863:1: ( ( () ) )
            // InternalMath.g:864:1: ( () )
            {
            // InternalMath.g:864:1: ( () )
            // InternalMath.g:865:2: ()
            {
             before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 
            // InternalMath.g:866:2: ()
            // InternalMath.g:866:3: 
            {
            }

             after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__0__Impl"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1"
    // InternalMath.g:874:1: rule__PlusOrMinus__Group_1_0_1__1 : rule__PlusOrMinus__Group_1_0_1__1__Impl ;
    public final void rule__PlusOrMinus__Group_1_0_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:878:1: ( rule__PlusOrMinus__Group_1_0_1__1__Impl )
            // InternalMath.g:879:2: rule__PlusOrMinus__Group_1_0_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__PlusOrMinus__Group_1_0_1__1__Impl();

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1"


    // $ANTLR start "rule__PlusOrMinus__Group_1_0_1__1__Impl"
    // InternalMath.g:885:1: rule__PlusOrMinus__Group_1_0_1__1__Impl : ( '-' ) ;
    public final void rule__PlusOrMinus__Group_1_0_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:889:1: ( ( '-' ) )
            // InternalMath.g:890:1: ( '-' )
            {
            // InternalMath.g:890:1: ( '-' )
            // InternalMath.g:891:2: '-'
            {
             before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 
            match(input,19,FOLLOW_2); 
             after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); 

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
    // $ANTLR end "rule__PlusOrMinus__Group_1_0_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__0"
    // InternalMath.g:901:1: rule__MulOrDiv__Group__0 : rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 ;
    public final void rule__MulOrDiv__Group__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:905:1: ( rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1 )
            // InternalMath.g:906:2: rule__MulOrDiv__Group__0__Impl rule__MulOrDiv__Group__1
            {
            pushFollow(FOLLOW_12);
            rule__MulOrDiv__Group__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1();

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
    // $ANTLR end "rule__MulOrDiv__Group__0"


    // $ANTLR start "rule__MulOrDiv__Group__0__Impl"
    // InternalMath.g:913:1: rule__MulOrDiv__Group__0__Impl : ( rulePrimary ) ;
    public final void rule__MulOrDiv__Group__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:917:1: ( ( rulePrimary ) )
            // InternalMath.g:918:1: ( rulePrimary )
            {
            // InternalMath.g:918:1: ( rulePrimary )
            // InternalMath.g:919:2: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group__1"
    // InternalMath.g:928:1: rule__MulOrDiv__Group__1 : rule__MulOrDiv__Group__1__Impl ;
    public final void rule__MulOrDiv__Group__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:932:1: ( rule__MulOrDiv__Group__1__Impl )
            // InternalMath.g:933:2: rule__MulOrDiv__Group__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group__1"


    // $ANTLR start "rule__MulOrDiv__Group__1__Impl"
    // InternalMath.g:939:1: rule__MulOrDiv__Group__1__Impl : ( ( rule__MulOrDiv__Group_1__0 )* ) ;
    public final void rule__MulOrDiv__Group__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:943:1: ( ( ( rule__MulOrDiv__Group_1__0 )* ) )
            // InternalMath.g:944:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            {
            // InternalMath.g:944:1: ( ( rule__MulOrDiv__Group_1__0 )* )
            // InternalMath.g:945:2: ( rule__MulOrDiv__Group_1__0 )*
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1()); 
            // InternalMath.g:946:2: ( rule__MulOrDiv__Group_1__0 )*
            loop8:
            do {
                int alt8=2;
                int LA8_0 = input.LA(1);

                if ( (LA8_0==11) ) {
                    alt8=1;
                }
                else if ( (LA8_0==12) ) {
                    alt8=1;
                }


                switch (alt8) {
            	case 1 :
            	    // InternalMath.g:946:3: rule__MulOrDiv__Group_1__0
            	    {
            	    pushFollow(FOLLOW_13);
            	    rule__MulOrDiv__Group_1__0();

            	    state._fsp--;


            	    }
            	    break;

            	default :
            	    break loop8;
                }
            } while (true);

             after(grammarAccess.getMulOrDivAccess().getGroup_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__0"
    // InternalMath.g:955:1: rule__MulOrDiv__Group_1__0 : rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 ;
    public final void rule__MulOrDiv__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:959:1: ( rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1 )
            // InternalMath.g:960:2: rule__MulOrDiv__Group_1__0__Impl rule__MulOrDiv__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__MulOrDiv__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0"


    // $ANTLR start "rule__MulOrDiv__Group_1__0__Impl"
    // InternalMath.g:967:1: rule__MulOrDiv__Group_1__0__Impl : ( ( rule__MulOrDiv__Group_1_0__0 ) ) ;
    public final void rule__MulOrDiv__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:971:1: ( ( ( rule__MulOrDiv__Group_1_0__0 ) ) )
            // InternalMath.g:972:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            {
            // InternalMath.g:972:1: ( ( rule__MulOrDiv__Group_1_0__0 ) )
            // InternalMath.g:973:2: ( rule__MulOrDiv__Group_1_0__0 )
            {
             before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 
            // InternalMath.g:974:2: ( rule__MulOrDiv__Group_1_0__0 )
            // InternalMath.g:974:3: rule__MulOrDiv__Group_1_0__0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getGroup_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1__1"
    // InternalMath.g:982:1: rule__MulOrDiv__Group_1__1 : rule__MulOrDiv__Group_1__1__Impl ;
    public final void rule__MulOrDiv__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:986:1: ( rule__MulOrDiv__Group_1__1__Impl )
            // InternalMath.g:987:2: rule__MulOrDiv__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1"


    // $ANTLR start "rule__MulOrDiv__Group_1__1__Impl"
    // InternalMath.g:993:1: rule__MulOrDiv__Group_1__1__Impl : ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) ;
    public final void rule__MulOrDiv__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:997:1: ( ( ( rule__MulOrDiv__RightAssignment_1_1 ) ) )
            // InternalMath.g:998:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            {
            // InternalMath.g:998:1: ( ( rule__MulOrDiv__RightAssignment_1_1 ) )
            // InternalMath.g:999:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 
            // InternalMath.g:1000:2: ( rule__MulOrDiv__RightAssignment_1_1 )
            // InternalMath.g:1000:3: rule__MulOrDiv__RightAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__RightAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1__1__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0"
    // InternalMath.g:1009:1: rule__MulOrDiv__Group_1_0__0 : rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 ;
    public final void rule__MulOrDiv__Group_1_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1013:1: ( rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1 )
            // InternalMath.g:1014:2: rule__MulOrDiv__Group_1_0__0__Impl rule__MulOrDiv__Group_1_0__1
            {
            pushFollow(FOLLOW_12);
            rule__MulOrDiv__Group_1_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__1();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__0__Impl"
    // InternalMath.g:1021:1: rule__MulOrDiv__Group_1_0__0__Impl : ( () ) ;
    public final void rule__MulOrDiv__Group_1_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1025:1: ( ( () ) )
            // InternalMath.g:1026:1: ( () )
            {
            // InternalMath.g:1026:1: ( () )
            // InternalMath.g:1027:2: ()
            {
             before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 
            // InternalMath.g:1028:2: ()
            // InternalMath.g:1028:3: 
            {
            }

             after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__MulOrDiv__Group_1_0__0__Impl"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1"
    // InternalMath.g:1036:1: rule__MulOrDiv__Group_1_0__1 : rule__MulOrDiv__Group_1_0__1__Impl ;
    public final void rule__MulOrDiv__Group_1_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1040:1: ( rule__MulOrDiv__Group_1_0__1__Impl )
            // InternalMath.g:1041:2: rule__MulOrDiv__Group_1_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__Group_1_0__1__Impl();

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1"


    // $ANTLR start "rule__MulOrDiv__Group_1_0__1__Impl"
    // InternalMath.g:1047:1: rule__MulOrDiv__Group_1_0__1__Impl : ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) ;
    public final void rule__MulOrDiv__Group_1_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1051:1: ( ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) ) )
            // InternalMath.g:1052:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            {
            // InternalMath.g:1052:1: ( ( rule__MulOrDiv__OpAssignment_1_0_1 ) )
            // InternalMath.g:1053:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 
            // InternalMath.g:1054:2: ( rule__MulOrDiv__OpAssignment_1_0_1 )
            // InternalMath.g:1054:3: rule__MulOrDiv__OpAssignment_1_0_1
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAssignment_1_0_1();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); 

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
    // $ANTLR end "rule__MulOrDiv__Group_1_0__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__0"
    // InternalMath.g:1063:1: rule__Primary__Group_1__0 : rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 ;
    public final void rule__Primary__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1067:1: ( rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1 )
            // InternalMath.g:1068:2: rule__Primary__Group_1__0__Impl rule__Primary__Group_1__1
            {
            pushFollow(FOLLOW_6);
            rule__Primary__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__1();

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
    // $ANTLR end "rule__Primary__Group_1__0"


    // $ANTLR start "rule__Primary__Group_1__0__Impl"
    // InternalMath.g:1075:1: rule__Primary__Group_1__0__Impl : ( '(' ) ;
    public final void rule__Primary__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1079:1: ( ( '(' ) )
            // InternalMath.g:1080:1: ( '(' )
            {
            // InternalMath.g:1080:1: ( '(' )
            // InternalMath.g:1081:2: '('
            {
             before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 
            match(input,20,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); 

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
    // $ANTLR end "rule__Primary__Group_1__0__Impl"


    // $ANTLR start "rule__Primary__Group_1__1"
    // InternalMath.g:1090:1: rule__Primary__Group_1__1 : rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 ;
    public final void rule__Primary__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1094:1: ( rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2 )
            // InternalMath.g:1095:2: rule__Primary__Group_1__1__Impl rule__Primary__Group_1__2
            {
            pushFollow(FOLLOW_14);
            rule__Primary__Group_1__1__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2();

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
    // $ANTLR end "rule__Primary__Group_1__1"


    // $ANTLR start "rule__Primary__Group_1__1__Impl"
    // InternalMath.g:1102:1: rule__Primary__Group_1__1__Impl : ( ruleExpression ) ;
    public final void rule__Primary__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1106:1: ( ( ruleExpression ) )
            // InternalMath.g:1107:1: ( ruleExpression )
            {
            // InternalMath.g:1107:1: ( ruleExpression )
            // InternalMath.g:1108:2: ruleExpression
            {
             before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1()); 

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
    // $ANTLR end "rule__Primary__Group_1__1__Impl"


    // $ANTLR start "rule__Primary__Group_1__2"
    // InternalMath.g:1117:1: rule__Primary__Group_1__2 : rule__Primary__Group_1__2__Impl ;
    public final void rule__Primary__Group_1__2() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1121:1: ( rule__Primary__Group_1__2__Impl )
            // InternalMath.g:1122:2: rule__Primary__Group_1__2__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Primary__Group_1__2__Impl();

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
    // $ANTLR end "rule__Primary__Group_1__2"


    // $ANTLR start "rule__Primary__Group_1__2__Impl"
    // InternalMath.g:1128:1: rule__Primary__Group_1__2__Impl : ( ')' ) ;
    public final void rule__Primary__Group_1__2__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1132:1: ( ( ')' ) )
            // InternalMath.g:1133:1: ( ')' )
            {
            // InternalMath.g:1133:1: ( ')' )
            // InternalMath.g:1134:2: ')'
            {
             before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 
            match(input,21,FOLLOW_2); 
             after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); 

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
    // $ANTLR end "rule__Primary__Group_1__2__Impl"


    // $ANTLR start "rule__Atomic__Group_0__0"
    // InternalMath.g:1144:1: rule__Atomic__Group_0__0 : rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 ;
    public final void rule__Atomic__Group_0__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1148:1: ( rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1 )
            // InternalMath.g:1149:2: rule__Atomic__Group_0__0__Impl rule__Atomic__Group_0__1
            {
            pushFollow(FOLLOW_15);
            rule__Atomic__Group_0__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1();

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
    // $ANTLR end "rule__Atomic__Group_0__0"


    // $ANTLR start "rule__Atomic__Group_0__0__Impl"
    // InternalMath.g:1156:1: rule__Atomic__Group_0__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_0__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1160:1: ( ( () ) )
            // InternalMath.g:1161:1: ( () )
            {
            // InternalMath.g:1161:1: ( () )
            // InternalMath.g:1162:2: ()
            {
             before(grammarAccess.getAtomicAccess().getNumberAction_0_0()); 
            // InternalMath.g:1163:2: ()
            // InternalMath.g:1163:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getNumberAction_0_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_0__0__Impl"


    // $ANTLR start "rule__Atomic__Group_0__1"
    // InternalMath.g:1171:1: rule__Atomic__Group_0__1 : rule__Atomic__Group_0__1__Impl ;
    public final void rule__Atomic__Group_0__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1175:1: ( rule__Atomic__Group_0__1__Impl )
            // InternalMath.g:1176:2: rule__Atomic__Group_0__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_0__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_0__1"


    // $ANTLR start "rule__Atomic__Group_0__1__Impl"
    // InternalMath.g:1182:1: rule__Atomic__Group_0__1__Impl : ( ( rule__Atomic__ValueAssignment_0_1 ) ) ;
    public final void rule__Atomic__Group_0__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1186:1: ( ( ( rule__Atomic__ValueAssignment_0_1 ) ) )
            // InternalMath.g:1187:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            {
            // InternalMath.g:1187:1: ( ( rule__Atomic__ValueAssignment_0_1 ) )
            // InternalMath.g:1188:2: ( rule__Atomic__ValueAssignment_0_1 )
            {
             before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 
            // InternalMath.g:1189:2: ( rule__Atomic__ValueAssignment_0_1 )
            // InternalMath.g:1189:3: rule__Atomic__ValueAssignment_0_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__ValueAssignment_0_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); 

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
    // $ANTLR end "rule__Atomic__Group_0__1__Impl"


    // $ANTLR start "rule__Atomic__Group_1__0"
    // InternalMath.g:1198:1: rule__Atomic__Group_1__0 : rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 ;
    public final void rule__Atomic__Group_1__0() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1202:1: ( rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1 )
            // InternalMath.g:1203:2: rule__Atomic__Group_1__0__Impl rule__Atomic__Group_1__1
            {
            pushFollow(FOLLOW_16);
            rule__Atomic__Group_1__0__Impl();

            state._fsp--;

            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1();

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
    // $ANTLR end "rule__Atomic__Group_1__0"


    // $ANTLR start "rule__Atomic__Group_1__0__Impl"
    // InternalMath.g:1210:1: rule__Atomic__Group_1__0__Impl : ( () ) ;
    public final void rule__Atomic__Group_1__0__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1214:1: ( ( () ) )
            // InternalMath.g:1215:1: ( () )
            {
            // InternalMath.g:1215:1: ( () )
            // InternalMath.g:1216:2: ()
            {
             before(grammarAccess.getAtomicAccess().getVariableUseAction_1_0()); 
            // InternalMath.g:1217:2: ()
            // InternalMath.g:1217:3: 
            {
            }

             after(grammarAccess.getAtomicAccess().getVariableUseAction_1_0()); 

            }


            }

        }
        finally {

            	restoreStackSize(stackSize);

        }
        return ;
    }
    // $ANTLR end "rule__Atomic__Group_1__0__Impl"


    // $ANTLR start "rule__Atomic__Group_1__1"
    // InternalMath.g:1225:1: rule__Atomic__Group_1__1 : rule__Atomic__Group_1__1__Impl ;
    public final void rule__Atomic__Group_1__1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1229:1: ( rule__Atomic__Group_1__1__Impl )
            // InternalMath.g:1230:2: rule__Atomic__Group_1__1__Impl
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__Group_1__1__Impl();

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
    // $ANTLR end "rule__Atomic__Group_1__1"


    // $ANTLR start "rule__Atomic__Group_1__1__Impl"
    // InternalMath.g:1236:1: rule__Atomic__Group_1__1__Impl : ( ( rule__Atomic__VariableUseAssignment_1_1 ) ) ;
    public final void rule__Atomic__Group_1__1__Impl() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1240:1: ( ( ( rule__Atomic__VariableUseAssignment_1_1 ) ) )
            // InternalMath.g:1241:1: ( ( rule__Atomic__VariableUseAssignment_1_1 ) )
            {
            // InternalMath.g:1241:1: ( ( rule__Atomic__VariableUseAssignment_1_1 ) )
            // InternalMath.g:1242:2: ( rule__Atomic__VariableUseAssignment_1_1 )
            {
             before(grammarAccess.getAtomicAccess().getVariableUseAssignment_1_1()); 
            // InternalMath.g:1243:2: ( rule__Atomic__VariableUseAssignment_1_1 )
            // InternalMath.g:1243:3: rule__Atomic__VariableUseAssignment_1_1
            {
            pushFollow(FOLLOW_2);
            rule__Atomic__VariableUseAssignment_1_1();

            state._fsp--;


            }

             after(grammarAccess.getAtomicAccess().getVariableUseAssignment_1_1()); 

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
    // $ANTLR end "rule__Atomic__Group_1__1__Impl"


    // $ANTLR start "rule__MathExp__ElementsAssignment"
    // InternalMath.g:1252:1: rule__MathExp__ElementsAssignment : ( ruleVariable ) ;
    public final void rule__MathExp__ElementsAssignment() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1256:1: ( ( ruleVariable ) )
            // InternalMath.g:1257:2: ( ruleVariable )
            {
            // InternalMath.g:1257:2: ( ruleVariable )
            // InternalMath.g:1258:3: ruleVariable
            {
             before(grammarAccess.getMathExpAccess().getElementsVariableParserRuleCall_0()); 
            pushFollow(FOLLOW_2);
            ruleVariable();

            state._fsp--;

             after(grammarAccess.getMathExpAccess().getElementsVariableParserRuleCall_0()); 

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
    // $ANTLR end "rule__MathExp__ElementsAssignment"


    // $ANTLR start "rule__Variable__NameAssignment_1"
    // InternalMath.g:1267:1: rule__Variable__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__Variable__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1271:1: ( ( RULE_ID ) )
            // InternalMath.g:1272:2: ( RULE_ID )
            {
            // InternalMath.g:1272:2: ( RULE_ID )
            // InternalMath.g:1273:3: RULE_ID
            {
             before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__Variable__NameAssignment_1"


    // $ANTLR start "rule__Variable__ExpressionAssignment_3"
    // InternalMath.g:1282:1: rule__Variable__ExpressionAssignment_3 : ( ruleExpression ) ;
    public final void rule__Variable__ExpressionAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1286:1: ( ( ruleExpression ) )
            // InternalMath.g:1287:2: ( ruleExpression )
            {
            // InternalMath.g:1287:2: ( ruleExpression )
            // InternalMath.g:1288:3: ruleExpression
            {
             before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__Variable__ExpressionAssignment_3"


    // $ANTLR start "rule__LetExpression__NameAssignment_1"
    // InternalMath.g:1297:1: rule__LetExpression__NameAssignment_1 : ( RULE_ID ) ;
    public final void rule__LetExpression__NameAssignment_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1301:1: ( ( RULE_ID ) )
            // InternalMath.g:1302:2: ( RULE_ID )
            {
            // InternalMath.g:1302:2: ( RULE_ID )
            // InternalMath.g:1303:3: RULE_ID
            {
             before(grammarAccess.getLetExpressionAccess().getNameIDTerminalRuleCall_1_0()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getLetExpressionAccess().getNameIDTerminalRuleCall_1_0()); 

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
    // $ANTLR end "rule__LetExpression__NameAssignment_1"


    // $ANTLR start "rule__LetExpression__VariableAssignment_3"
    // InternalMath.g:1312:1: rule__LetExpression__VariableAssignment_3 : ( ruleExpression ) ;
    public final void rule__LetExpression__VariableAssignment_3() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1316:1: ( ( ruleExpression ) )
            // InternalMath.g:1317:2: ( ruleExpression )
            {
            // InternalMath.g:1317:2: ( ruleExpression )
            // InternalMath.g:1318:3: ruleExpression
            {
             before(grammarAccess.getLetExpressionAccess().getVariableExpressionParserRuleCall_3_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getVariableExpressionParserRuleCall_3_0()); 

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
    // $ANTLR end "rule__LetExpression__VariableAssignment_3"


    // $ANTLR start "rule__LetExpression__ExpressionAssignment_5"
    // InternalMath.g:1327:1: rule__LetExpression__ExpressionAssignment_5 : ( ruleExpression ) ;
    public final void rule__LetExpression__ExpressionAssignment_5() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1331:1: ( ( ruleExpression ) )
            // InternalMath.g:1332:2: ( ruleExpression )
            {
            // InternalMath.g:1332:2: ( ruleExpression )
            // InternalMath.g:1333:3: ruleExpression
            {
             before(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_5_0()); 
            pushFollow(FOLLOW_2);
            ruleExpression();

            state._fsp--;

             after(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_5_0()); 

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
    // $ANTLR end "rule__LetExpression__ExpressionAssignment_5"


    // $ANTLR start "rule__PlusOrMinus__RightAssignment_1_1"
    // InternalMath.g:1342:1: rule__PlusOrMinus__RightAssignment_1_1 : ( ruleMulOrDiv ) ;
    public final void rule__PlusOrMinus__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1346:1: ( ( ruleMulOrDiv ) )
            // InternalMath.g:1347:2: ( ruleMulOrDiv )
            {
            // InternalMath.g:1347:2: ( ruleMulOrDiv )
            // InternalMath.g:1348:3: ruleMulOrDiv
            {
             before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            ruleMulOrDiv();

            state._fsp--;

             after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__PlusOrMinus__RightAssignment_1_1"


    // $ANTLR start "rule__MulOrDiv__OpAssignment_1_0_1"
    // InternalMath.g:1357:1: rule__MulOrDiv__OpAssignment_1_0_1 : ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) ;
    public final void rule__MulOrDiv__OpAssignment_1_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1361:1: ( ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) ) )
            // InternalMath.g:1362:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            {
            // InternalMath.g:1362:2: ( ( rule__MulOrDiv__OpAlternatives_1_0_1_0 ) )
            // InternalMath.g:1363:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            {
             before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 
            // InternalMath.g:1364:3: ( rule__MulOrDiv__OpAlternatives_1_0_1_0 )
            // InternalMath.g:1364:4: rule__MulOrDiv__OpAlternatives_1_0_1_0
            {
            pushFollow(FOLLOW_2);
            rule__MulOrDiv__OpAlternatives_1_0_1_0();

            state._fsp--;


            }

             after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__OpAssignment_1_0_1"


    // $ANTLR start "rule__MulOrDiv__RightAssignment_1_1"
    // InternalMath.g:1372:1: rule__MulOrDiv__RightAssignment_1_1 : ( rulePrimary ) ;
    public final void rule__MulOrDiv__RightAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1376:1: ( ( rulePrimary ) )
            // InternalMath.g:1377:2: ( rulePrimary )
            {
            // InternalMath.g:1377:2: ( rulePrimary )
            // InternalMath.g:1378:3: rulePrimary
            {
             before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 
            pushFollow(FOLLOW_2);
            rulePrimary();

            state._fsp--;

             after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); 

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
    // $ANTLR end "rule__MulOrDiv__RightAssignment_1_1"


    // $ANTLR start "rule__Atomic__ValueAssignment_0_1"
    // InternalMath.g:1387:1: rule__Atomic__ValueAssignment_0_1 : ( RULE_INT ) ;
    public final void rule__Atomic__ValueAssignment_0_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1391:1: ( ( RULE_INT ) )
            // InternalMath.g:1392:2: ( RULE_INT )
            {
            // InternalMath.g:1392:2: ( RULE_INT )
            // InternalMath.g:1393:3: RULE_INT
            {
             before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 
            match(input,RULE_INT,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); 

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
    // $ANTLR end "rule__Atomic__ValueAssignment_0_1"


    // $ANTLR start "rule__Atomic__VariableUseAssignment_1_1"
    // InternalMath.g:1402:1: rule__Atomic__VariableUseAssignment_1_1 : ( ( RULE_ID ) ) ;
    public final void rule__Atomic__VariableUseAssignment_1_1() throws RecognitionException {

        		int stackSize = keepStackSize();
        	
        try {
            // InternalMath.g:1406:1: ( ( ( RULE_ID ) ) )
            // InternalMath.g:1407:2: ( ( RULE_ID ) )
            {
            // InternalMath.g:1407:2: ( ( RULE_ID ) )
            // InternalMath.g:1408:3: ( RULE_ID )
            {
             before(grammarAccess.getAtomicAccess().getVariableUseAbstractElementCrossReference_1_1_0()); 
            // InternalMath.g:1409:3: ( RULE_ID )
            // InternalMath.g:1410:4: RULE_ID
            {
             before(grammarAccess.getAtomicAccess().getVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1()); 
            match(input,RULE_ID,FOLLOW_2); 
             after(grammarAccess.getAtomicAccess().getVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1()); 

            }

             after(grammarAccess.getAtomicAccess().getVariableUseAbstractElementCrossReference_1_1_0()); 

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
    // $ANTLR end "rule__Atomic__VariableUseAssignment_1_1"

    // Delegated rules


 

    public static final BitSet FOLLOW_1 = new BitSet(new long[]{0x0000000000000000L});
    public static final BitSet FOLLOW_2 = new BitSet(new long[]{0x0000000000000002L});
    public static final BitSet FOLLOW_3 = new BitSet(new long[]{0x0000000000002002L});
    public static final BitSet FOLLOW_4 = new BitSet(new long[]{0x0000000000000010L});
    public static final BitSet FOLLOW_5 = new BitSet(new long[]{0x0000000000004000L});
    public static final BitSet FOLLOW_6 = new BitSet(new long[]{0x000000000010A030L});
    public static final BitSet FOLLOW_7 = new BitSet(new long[]{0x0000000000010000L});
    public static final BitSet FOLLOW_8 = new BitSet(new long[]{0x0000000000020000L});
    public static final BitSet FOLLOW_9 = new BitSet(new long[]{0x00000000000C0000L});
    public static final BitSet FOLLOW_10 = new BitSet(new long[]{0x00000000000C0002L});
    public static final BitSet FOLLOW_11 = new BitSet(new long[]{0x0000000000040000L});
    public static final BitSet FOLLOW_12 = new BitSet(new long[]{0x0000000000001800L});
    public static final BitSet FOLLOW_13 = new BitSet(new long[]{0x0000000000001802L});
    public static final BitSet FOLLOW_14 = new BitSet(new long[]{0x0000000000200000L});
    public static final BitSet FOLLOW_15 = new BitSet(new long[]{0x0000000000000020L});
    public static final BitSet FOLLOW_16 = new BitSet(new long[]{0x0000000000000030L});

}