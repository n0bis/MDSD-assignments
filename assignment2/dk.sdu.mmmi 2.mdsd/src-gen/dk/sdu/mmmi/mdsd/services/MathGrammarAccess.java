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
import org.eclipse.xtext.CrossReference;
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
	
	public class MathExpElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.MathExp");
		private final Assignment cElementsAssignment = (Assignment)rule.eContents().get(1);
		private final RuleCall cElementsVariableParserRuleCall_0 = (RuleCall)cElementsAssignment.eContents().get(0);
		
		//MathExp:
		//    elements+=Variable*
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//elements+=Variable*
		public Assignment getElementsAssignment() { return cElementsAssignment; }
		
		//Variable
		public RuleCall getElementsVariableParserRuleCall_0() { return cElementsVariableParserRuleCall_0; }
	}
	public class AbstractElementElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.AbstractElement");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final RuleCall cVariableParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final RuleCall cLetExpressionParserRuleCall_1 = (RuleCall)cAlternatives.eContents().get(1);
		
		//AbstractElement:
		//    Variable | LetExpression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Variable | LetExpression
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Variable
		public RuleCall getVariableParserRuleCall_0() { return cVariableParserRuleCall_0; }
		
		//LetExpression
		public RuleCall getLetExpressionParserRuleCall_1() { return cLetExpressionParserRuleCall_1; }
	}
	public class VariableElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Variable");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cVarKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cExpressionAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cExpressionExpressionParserRuleCall_3_0 = (RuleCall)cExpressionAssignment_3.eContents().get(0);
		
		//Variable:
		//    'var' name=ID '=' expression=Expression
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'var' name=ID '=' expression=Expression
		public Group getGroup() { return cGroup; }
		
		//'var'
		public Keyword getVarKeyword_0() { return cVarKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_3() { return cExpressionAssignment_3; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_3_0() { return cExpressionExpressionParserRuleCall_3_0; }
	}
	public class LetExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.LetExpression");
		private final Group cGroup = (Group)rule.eContents().get(1);
		private final Keyword cLetKeyword_0 = (Keyword)cGroup.eContents().get(0);
		private final Assignment cNameAssignment_1 = (Assignment)cGroup.eContents().get(1);
		private final RuleCall cNameIDTerminalRuleCall_1_0 = (RuleCall)cNameAssignment_1.eContents().get(0);
		private final Keyword cEqualsSignKeyword_2 = (Keyword)cGroup.eContents().get(2);
		private final Assignment cVariableAssignment_3 = (Assignment)cGroup.eContents().get(3);
		private final RuleCall cVariableExpressionParserRuleCall_3_0 = (RuleCall)cVariableAssignment_3.eContents().get(0);
		private final Keyword cInKeyword_4 = (Keyword)cGroup.eContents().get(4);
		private final Assignment cExpressionAssignment_5 = (Assignment)cGroup.eContents().get(5);
		private final RuleCall cExpressionExpressionParserRuleCall_5_0 = (RuleCall)cExpressionAssignment_5.eContents().get(0);
		private final Keyword cEndKeyword_6 = (Keyword)cGroup.eContents().get(6);
		
		//LetExpression:
		//    'let' name=ID '=' variable=Expression 'in' expression=Expression 'end'
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//'let' name=ID '=' variable=Expression 'in' expression=Expression 'end'
		public Group getGroup() { return cGroup; }
		
		//'let'
		public Keyword getLetKeyword_0() { return cLetKeyword_0; }
		
		//name=ID
		public Assignment getNameAssignment_1() { return cNameAssignment_1; }
		
		//ID
		public RuleCall getNameIDTerminalRuleCall_1_0() { return cNameIDTerminalRuleCall_1_0; }
		
		//'='
		public Keyword getEqualsSignKeyword_2() { return cEqualsSignKeyword_2; }
		
		//variable=Expression
		public Assignment getVariableAssignment_3() { return cVariableAssignment_3; }
		
		//Expression
		public RuleCall getVariableExpressionParserRuleCall_3_0() { return cVariableExpressionParserRuleCall_3_0; }
		
		//'in'
		public Keyword getInKeyword_4() { return cInKeyword_4; }
		
		//expression=Expression
		public Assignment getExpressionAssignment_5() { return cExpressionAssignment_5; }
		
		//Expression
		public RuleCall getExpressionExpressionParserRuleCall_5_0() { return cExpressionExpressionParserRuleCall_5_0; }
		
		//'end'
		public Keyword getEndKeyword_6() { return cEndKeyword_6; }
	}
	public class ExpressionElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Expression");
		private final RuleCall cPlusOrMinusParserRuleCall = (RuleCall)rule.eContents().get(1);
		
		//Expression: PlusOrMinus;
		@Override public ParserRule getRule() { return rule; }
		
		//PlusOrMinus
		public RuleCall getPlusOrMinusParserRuleCall() { return cPlusOrMinusParserRuleCall; }
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
		
		//PlusOrMinus returns Expression: MulOrDiv (
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
		
		//MulOrDiv returns Expression: Primary (
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
		private final RuleCall cAtomicParserRuleCall_0 = (RuleCall)cAlternatives.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Keyword cLeftParenthesisKeyword_1_0 = (Keyword)cGroup_1.eContents().get(0);
		private final RuleCall cExpressionParserRuleCall_1_1 = (RuleCall)cGroup_1.eContents().get(1);
		private final Keyword cRightParenthesisKeyword_1_2 = (Keyword)cGroup_1.eContents().get(2);
		private final RuleCall cAbstractElementParserRuleCall_2 = (RuleCall)cAlternatives.eContents().get(2);
		
		//Primary returns Expression:
		//    Atomic | '(' Expression ')' | AbstractElement
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//Atomic | '(' Expression ')' | AbstractElement
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//Atomic
		public RuleCall getAtomicParserRuleCall_0() { return cAtomicParserRuleCall_0; }
		
		//'(' Expression ')'
		public Group getGroup_1() { return cGroup_1; }
		
		//'('
		public Keyword getLeftParenthesisKeyword_1_0() { return cLeftParenthesisKeyword_1_0; }
		
		//Expression
		public RuleCall getExpressionParserRuleCall_1_1() { return cExpressionParserRuleCall_1_1; }
		
		//')'
		public Keyword getRightParenthesisKeyword_1_2() { return cRightParenthesisKeyword_1_2; }
		
		//AbstractElement
		public RuleCall getAbstractElementParserRuleCall_2() { return cAbstractElementParserRuleCall_2; }
	}
	public class AtomicElements extends AbstractParserRuleElementFinder {
		private final ParserRule rule = (ParserRule) GrammarUtil.findRuleForName(getGrammar(), "dk.sdu.mmmi.mdsd.Math.Atomic");
		private final Alternatives cAlternatives = (Alternatives)rule.eContents().get(1);
		private final Group cGroup_0 = (Group)cAlternatives.eContents().get(0);
		private final Action cNumberAction_0_0 = (Action)cGroup_0.eContents().get(0);
		private final Assignment cValueAssignment_0_1 = (Assignment)cGroup_0.eContents().get(1);
		private final RuleCall cValueINTTerminalRuleCall_0_1_0 = (RuleCall)cValueAssignment_0_1.eContents().get(0);
		private final Group cGroup_1 = (Group)cAlternatives.eContents().get(1);
		private final Action cVariableUseAction_1_0 = (Action)cGroup_1.eContents().get(0);
		private final Assignment cVariableUseAssignment_1_1 = (Assignment)cGroup_1.eContents().get(1);
		private final CrossReference cVariableUseAbstractElementCrossReference_1_1_0 = (CrossReference)cVariableUseAssignment_1_1.eContents().get(0);
		private final RuleCall cVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1 = (RuleCall)cVariableUseAbstractElementCrossReference_1_1_0.eContents().get(1);
		
		//Atomic:
		//    {Number} value=INT |
		//    {VariableUse} variableUse=[AbstractElement]
		//;
		@Override public ParserRule getRule() { return rule; }
		
		//{Number} value=INT |
		//{VariableUse} variableUse=[AbstractElement]
		public Alternatives getAlternatives() { return cAlternatives; }
		
		//{Number} value=INT
		public Group getGroup_0() { return cGroup_0; }
		
		//{Number}
		public Action getNumberAction_0_0() { return cNumberAction_0_0; }
		
		//value=INT
		public Assignment getValueAssignment_0_1() { return cValueAssignment_0_1; }
		
		//INT
		public RuleCall getValueINTTerminalRuleCall_0_1_0() { return cValueINTTerminalRuleCall_0_1_0; }
		
		//{VariableUse} variableUse=[AbstractElement]
		public Group getGroup_1() { return cGroup_1; }
		
		//{VariableUse}
		public Action getVariableUseAction_1_0() { return cVariableUseAction_1_0; }
		
		//variableUse=[AbstractElement]
		public Assignment getVariableUseAssignment_1_1() { return cVariableUseAssignment_1_1; }
		
		//[AbstractElement]
		public CrossReference getVariableUseAbstractElementCrossReference_1_1_0() { return cVariableUseAbstractElementCrossReference_1_1_0; }
		
		//ID
		public RuleCall getVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1() { return cVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1; }
	}
	
	
	private final MathExpElements pMathExp;
	private final AbstractElementElements pAbstractElement;
	private final VariableElements pVariable;
	private final LetExpressionElements pLetExpression;
	private final ExpressionElements pExpression;
	private final PlusOrMinusElements pPlusOrMinus;
	private final MulOrDivElements pMulOrDiv;
	private final PrimaryElements pPrimary;
	private final AtomicElements pAtomic;
	
	private final Grammar grammar;
	
	private final TerminalsGrammarAccess gaTerminals;

	@Inject
	public MathGrammarAccess(GrammarProvider grammarProvider,
			TerminalsGrammarAccess gaTerminals) {
		this.grammar = internalFindGrammar(grammarProvider);
		this.gaTerminals = gaTerminals;
		this.pMathExp = new MathExpElements();
		this.pAbstractElement = new AbstractElementElements();
		this.pVariable = new VariableElements();
		this.pLetExpression = new LetExpressionElements();
		this.pExpression = new ExpressionElements();
		this.pPlusOrMinus = new PlusOrMinusElements();
		this.pMulOrDiv = new MulOrDivElements();
		this.pPrimary = new PrimaryElements();
		this.pAtomic = new AtomicElements();
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

	
	//MathExp:
	//    elements+=Variable*
	//;
	public MathExpElements getMathExpAccess() {
		return pMathExp;
	}
	
	public ParserRule getMathExpRule() {
		return getMathExpAccess().getRule();
	}
	
	//AbstractElement:
	//    Variable | LetExpression
	//;
	public AbstractElementElements getAbstractElementAccess() {
		return pAbstractElement;
	}
	
	public ParserRule getAbstractElementRule() {
		return getAbstractElementAccess().getRule();
	}
	
	//Variable:
	//    'var' name=ID '=' expression=Expression
	//;
	public VariableElements getVariableAccess() {
		return pVariable;
	}
	
	public ParserRule getVariableRule() {
		return getVariableAccess().getRule();
	}
	
	//LetExpression:
	//    'let' name=ID '=' variable=Expression 'in' expression=Expression 'end'
	//;
	public LetExpressionElements getLetExpressionAccess() {
		return pLetExpression;
	}
	
	public ParserRule getLetExpressionRule() {
		return getLetExpressionAccess().getRule();
	}
	
	//Expression: PlusOrMinus;
	public ExpressionElements getExpressionAccess() {
		return pExpression;
	}
	
	public ParserRule getExpressionRule() {
		return getExpressionAccess().getRule();
	}
	
	//PlusOrMinus returns Expression: MulOrDiv (
	//({Plus.left=current} '+' | {Minus.left=current} '-')
	//       right=MulOrDiv
	//     )* ;
	public PlusOrMinusElements getPlusOrMinusAccess() {
		return pPlusOrMinus;
	}
	
	public ParserRule getPlusOrMinusRule() {
		return getPlusOrMinusAccess().getRule();
	}
	
	//MulOrDiv returns Expression: Primary (
	//({MulOrDiv.left=current} op=('*'|'/'))
	//       right=Primary
	//     )* ;
	public MulOrDivElements getMulOrDivAccess() {
		return pMulOrDiv;
	}
	
	public ParserRule getMulOrDivRule() {
		return getMulOrDivAccess().getRule();
	}
	
	//Primary returns Expression:
	//    Atomic | '(' Expression ')' | AbstractElement
	//;
	public PrimaryElements getPrimaryAccess() {
		return pPrimary;
	}
	
	public ParserRule getPrimaryRule() {
		return getPrimaryAccess().getRule();
	}
	
	//Atomic:
	//    {Number} value=INT |
	//    {VariableUse} variableUse=[AbstractElement]
	//;
	public AtomicElements getAtomicAccess() {
		return pAtomic;
	}
	
	public ParserRule getAtomicRule() {
		return getAtomicAccess().getRule();
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