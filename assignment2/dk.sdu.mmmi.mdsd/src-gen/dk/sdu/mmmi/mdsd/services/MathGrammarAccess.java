/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.services;

import com.google.inject.Inject;
import com.google.inject.Singleton;
import java.util.List;
import org.eclipse.xtext.Action;
import org.eclipse.xtext.Alternatives;
import org.eclipse.xtext.Assignment;
import org.eclipse.xtext.Grammar;
import org.eclipse.xtext.GrammarUtil;
import org.eclipse.xtext.Group;
import org.eclipse.xtext.Keyword;
import org.eclipse.xtext.ParserRule;
import org.eclipse.xtext.RuleCall;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.common.services.TerminalsGrammarAccess;
import org.eclipse.xtext.service.AbstractElementFinder;
import org.eclipse.xtext.service.GrammarProvider;

@Singleton
public class MathGrammarAccess extends AbstractElementFinder.AbstractGrammarElementFinder {
	
	public class ModelElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Model");
		private final Assignment cMathAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cMathMathExpParserRuleCall_0 = (RuleCall)cMathAssignment.eContents().get(0);
		
		//Model:
		//    math+=MathExp*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//math+=MathExp*
		public Assignment getMathAssignment() { return cMathAssignment; }
		
		//MathExp
		public RuleCall getMathMathExpParserRuleCall_0() { return cMathMathExpParserRuleCall_0; }
	}
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpExpParserRuleCall_3_0 = (RuleCall)cExpAssignment_3.eContents().get(0);
		
		//MathExp:
		//    'var' name=ID '=' exp=Exp
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' exp=Exp
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//exp=Exp
		public Assignment getExpAssignment_3() { return cExpAssignment_3; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_3_0() { return cExpExpParserRuleCall_3_0; }
	}
	public class ExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Exp");
		private final RuleCall cPlusOrMinusParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Exp: PlusOrMinus;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusOrMinus
		public RuleCall getPlusOrMinusParserRuleCall() { return cPlusOrMinusParserRuleCall; }
	}
	public class NumberElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Number");
		private final Assignment cValueAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0 = (RuleCall)cValueAssignment.eContents().get(0);
		
		//Number:
		//    value=INT
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//value=INT
		public Assignment getValueAssignment() { return cValueAssignment; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0() { return cValueINTTerminalRuleCall_0; }
	}
	public class PlusOrMinusElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.PlusOrMinus");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cMulOrDivParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Alternatives cAlternatives_1_0 = (Alternatives)cGroup_1.eContents().get(0);
		private final Group cGroup_1_0_0 = (Group)cAlternatives_1_0.eContents().get(0);
		private final Action cPlusLeftAction_1_0_0_0 = (Action)cGroup_1_0_0.eContents().get(0);
		private final Keyword cPlusSignKeyword_1_0_0_1 = (Keyword)cGroup_1_0_0.eContents().get(1);
		private final Group cGroup_1_0_1 = (Group)cAlternatives_1_0.eContents().get(1);
		private final Action cMinusLeftAction_1_0_1_0 = (Action)cGroup_1_0_1.eContents().get(0);
		private final Keyword cHyphenMinusKeyword_1_0_1_1 = (Keyword)cGroup_1_0_1.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightMulOrDivParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//PlusOrMinus returns Exp: MulOrDiv (
		//({Plus.left=current} '+' | {Minus.left=current} '-')
		//       right=MulOrDiv
		//     )* ;
		@Override public ParserRule getRule() { return rule; }
		
		// MulOrDiv (
		//({Plus.left=current} '+' | {Minus.left=current} '-')
		//       right=MulOrDiv
		//     )*
		public Group getGroup() { return cGroup; }
		
		//MulOrDiv
		public RuleCall getMulOrDivParserRuleCall_0() { return cMulOrDivParserRuleCall_0; }
		
		// (
		//({Plus.left=current} '+' | {Minus.left=current} '-')
		//       right=MulOrDiv
		//     )*
		public Group getGroup_1() { return cGroup_1; }
		
		//({Plus.left=current} '+' | {Minus.left=current} '-')
		public Alternatives getAlternatives_1_0() { return cAlternatives_1_0; }
		
		//{Plus.left=current} '+'
		public Group getGroup_1_0_0() { return cGroup_1_0_0; }
		
		//{Plus.left=current}
		public Action getPlusLeftAction_1_0_0_0() { return cPlusLeftAction_1_0_0_0; }
		
		//'+'
		public Keyword getPlusSignKeyword_1_0_0_1() { return cPlusSignKeyword_1_0_0_1; }
		
		//{Minus.left=current} '-'
		public Group getGroup_1_0_1() { return cGroup_1_0_1; }
		
		//{Minus.left=current}
		public Action getMinusLeftAction_1_0_1_0() { return cMinusLeftAction_1_0_1_0; }
		
		//'-'
		public Keyword getHyphenMinusKeyword_1_0_1_1() { return cHyphenMinusKeyword_1_0_1_1; }
		
		//right=MulOrDiv
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//MulOrDiv
		public RuleCall getRightMulOrDivParserRuleCall_1_1_0() { return cRightMulOrDivParserRuleCall_1_1_0; }
	}
	public class MulOrDivElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MulOrDiv");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final RuleCall cPrimaryParserRuleCall_0 = (RuleCall)cGroup.eContents().get(0);
		private final Group cGroup_1 = (Group)cGroup.eContents().get(1);
		private final Group cGroup_1_0 = (Group)cGroup_1.eContents().get(0);
		private final Action cMulOrDivLeftAction_1_0_0 = (Action)cGroup_1_0.eContents().get(0);
		private final Assignment cOpAssignment_1_0_1 = (Assignment)cGroup_1_0.eContents().get(1);
		private final Alternatives cOpAlternatives_1_0_1_0 = (Alternatives)cOpAssignment_1_0_1.eContents().get(0);
		private final Keyword cOpAsteriskKeyword_1_0_1_0_0 = (Keyword)cOpAlternatives_1_0_1_0.eContents().get(0);
		private final Keyword cOpSolidusKeyword_1_0_1_0_1 = (Keyword)cOpAlternatives_1_0_1_0.eContents().get(1);
		private final Assignment cRightAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cRightPrimaryParserRuleCall_1_1_0 = (RuleCall)cRightAssignment_1_1.eContents().get(0);
		
		//MulOrDiv returns Exp: Primary (
		//({MulOrDiv.left=current} op=('*'|'/'))
		//       right=Primary
		//     )* ;
		@Override public ParserRule getRule() { return rule; }
		
		// Primary (
		//({MulOrDiv.left=current} op=('*'|'/'))
		//       right=Primary
		//     )*
		public Group getGroup() { return cGroup; }
		
		//Primary
		public RuleCall getPrimaryParserRuleCall_0() { return cPrimaryParserRuleCall_0; }
		
		// (
		//({MulOrDiv.left=current} op=('*'|'/'))
		//       right=Primary
		//     )*
		public Group getGroup_1() { return cGroup_1; }
		
		//({MulOrDiv.left=current} op=('*'|'/'))
		public Group getGroup_1_0() { return cGroup_1_0; }
		
		//{MulOrDiv.left=current}
		public Action getMulOrDivLeftAction_1_0_0() { return cMulOrDivLeftAction_1_0_0; }
		
		//op=('*'|'/')
		public Assignment getOpAssignment_1_0_1() { return cOpAssignment_1_0_1; }
		
		//('*'|'/')
		public Alternatives getOpAlternatives_1_0_1_0() { return cOpAlternatives_1_0_1_0; }
		
		//'*'
		public Keyword getOpAsteriskKeyword_1_0_1_0_0() { return cOpAsteriskKeyword_1_0_1_0_0; }
		
		//'/'
		public Keyword getOpSolidusKeyword_1_0_1_0_1() { return cOpSolidusKeyword_1_0_1_0_1; }
		
		//right=Primary
		public Assignment getRightAssignment_1_1() { return cRightAssignment_1_1; }
		
		//Primary
		public RuleCall getRightPrimaryParserRuleCall_1_1_0() { return cRightPrimaryParserRuleCall_1_1_0; }
	}
	public class PrimaryElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Primary");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cNumberParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final Assignment cExpAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final RuleCall cExpExpParserRuleCall_1_1_0 = (RuleCall)cExpAssignment_1_1.eContents().get(0);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		
		//Primary:
		//    Number | '(' exp=Exp ')';
		@Override public ParserRule getRule() { return rule; }
		
		//Number | '(' exp=Exp ')'
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Number
		public RuleCall getNumberParserRuleCall_0() { return cNumberParserRuleCall_0; }
		
		//'(' exp=Exp ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//exp=Exp
		public Assignment getExpAssignment_1_1() { return cExpAssignment_1_1; }
		
		//Exp
		public RuleCall getExpExpParserRuleCall_1_1_0() { return cExpExpParserRuleCall_1_1_0; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
	}
	
	
	private final ModelElements pModel;
	private final MathExpElements pMathExp;
	private final ExpElements pExp;
	private final NumberElements pNumber;
	private final PlusOrMinusElements pPlusOrMinus;
	private final MulOrDivElements pMulOrDiv;
	private final PrimaryElements pPrimary;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pModel = new ModelElements();
		this.pMathExp = new MathExpElements();
		this.pExp = new ExpElements();
		this.pNumber = new NumberElements();
		this.pPlusOrMinus = new PlusOrMinusElements();
		this.pMulOrDiv = new MulOrDivElements();
		this.pPrimary = new PrimaryElements();
	}
	
	protected Grammar internalFindGrammar(GrammarProvider grammarProvider) {
		Grammar grammar = grammarProvider.getGrammar(this);
		while (grammar != null) {
			if ("dk.sdu.mmmi.mdsd.Math".equals(grammar.getName())) {
				return grammar;
			}
			List<Grammar> grammars = grammar.getUsedGrammars();
			if (!grammars.isEmpty()) {
				grammar = grammars.iterator().next();
			} else {
				return null;
			}
		}
		return grammar;
	}
	
	@Override
	public Grammar getGrammar() {
		return grammar;
	}
	
	
	public TerminalsGrammarAccess getTerminalsGrammarAccess() {
		return gaTerminals;
	}

	
	//Model:
	//    math+=MathExp*
	//;
	public ModelElements getModelAccess() {
		return pModel;
	}
	
	public ParserRule getModelRule() {
		return getModelAccess().getRule();
	}
	
	//MathExp:
	//    'var' name=ID '=' exp=Exp
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//Exp: PlusOrMinus;
	public ExpElements getExpAccess() {
		return pExp;
	}
	
	public ParserRule getExpRule() {
		return getExpAccess().getRule();
	}
	
	//Number:
	//    value=INT
	//;
	public NumberElements getNumberAccess() {
		return pNumber;
	}
	
	public ParserRule getNumberRule() {
		return getNumberAccess().getRule();
	}
	
	//PlusOrMinus returns Exp: MulOrDiv (
	//({Plus.left=current} '+' | {Minus.left=current} '-')
	//       right=MulOrDiv
	//     )* ;
	public PlusOrMinusElements getPlusOrMinusAccess() {
		return pPlusOrMinus;
	}
	
	public ParserRule getPlusOrMinusRule() {
		return getPlusOrMinusAccess().getRule();
	}
	
	//MulOrDiv returns Exp: Primary (
	//({MulOrDiv.left=current} op=('*'|'/'))
	//       right=Primary
	//     )* ;
	public MulOrDivElements getMulOrDivAccess() {
		return pMulOrDiv;
	}
	
	public ParserRule getMulOrDivRule() {
		return getMulOrDivAccess().getRule();
	}
	
	//Primary:
	//    Number | '(' exp=Exp ')';
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//terminal ID: '^'?('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;
	public TerminalRule getIDRule() {
		return gaTerminals.getIDRule();
	}
	
	//terminal INT returns ecore::EInt: ('0'..'9')+;
	public TerminalRule getINTRule() {
		return gaTerminals.getINTRule();
	}
	
	//terminal STRING:
	//            '"' ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|'"') )* '"' |
	//            "'" ( '\\' . /* 'b'|'t'|'n'|'f'|'r'|'u'|'"'|"'"|'\\' */ | !('\\'|"'") )* "'"
	//        ;
	public TerminalRule getSTRINGRule() {
		return gaTerminals.getSTRINGRule();
	}
	
	//terminal ML_COMMENT : '/*' -> '*/';
	public TerminalRule getML_COMMENTRule() {
		return gaTerminals.getML_COMMENTRule();
	}
	
	//terminal SL_COMMENT : '//' !('\n'|'\r')* ('\r'? '\n')?;
	public TerminalRule getSL_COMMENTRule() {
		return gaTerminals.getSL_COMMENTRule();
	}
	
	//terminal WS         : (' '|'\t'|'\r'|'\n')+;
	public TerminalRule getWSRule() {
		return gaTerminals.getWSRule();
	}
	
	//terminal ANY_OTHER: .;
	public TerminalRule getANY_OTHERRule() {
		return gaTerminals.getANY_OTHERRule();
	}
}