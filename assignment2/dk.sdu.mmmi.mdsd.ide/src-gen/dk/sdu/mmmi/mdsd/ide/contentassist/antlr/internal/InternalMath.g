/*
 * generated by Xtext 2.25.0
 */
grammar InternalMath;

options {
	superClass=AbstractInternalContentAssistParser;
}

@lexer::header {
package dk.sdu.mmmi.mdsd.ide.contentassist.antlr.internal;

// Hack: Use our own Lexer superclass by means of import. 
// Currently there is no other way to specify the superclass for the lexer.
import org.eclipse.xtext.ide.editor.contentassist.antlr.internal.Lexer;
}

@parser::header {
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

}
@parser::members {
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
}

// Entry rule entryRuleMathExp
entryRuleMathExp
:
{ before(grammarAccess.getMathExpRule()); }
	 ruleMathExp
{ after(grammarAccess.getMathExpRule()); } 
	 EOF 
;

// Rule MathExp
ruleMathExp 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMathExpAccess().getElementsAssignment()); }
		(rule__MathExp__ElementsAssignment)*
		{ after(grammarAccess.getMathExpAccess().getElementsAssignment()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAbstractElement
entryRuleAbstractElement
:
{ before(grammarAccess.getAbstractElementRule()); }
	 ruleAbstractElement
{ after(grammarAccess.getAbstractElementRule()); } 
	 EOF 
;

// Rule AbstractElement
ruleAbstractElement 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAbstractElementAccess().getAlternatives()); }
		(rule__AbstractElement__Alternatives)
		{ after(grammarAccess.getAbstractElementAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleVariable
entryRuleVariable
:
{ before(grammarAccess.getVariableRule()); }
	 ruleVariable
{ after(grammarAccess.getVariableRule()); } 
	 EOF 
;

// Rule Variable
ruleVariable 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getVariableAccess().getGroup()); }
		(rule__Variable__Group__0)
		{ after(grammarAccess.getVariableAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleLetExpression
entryRuleLetExpression
:
{ before(grammarAccess.getLetExpressionRule()); }
	 ruleLetExpression
{ after(grammarAccess.getLetExpressionRule()); } 
	 EOF 
;

// Rule LetExpression
ruleLetExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getLetExpressionAccess().getGroup()); }
		(rule__LetExpression__Group__0)
		{ after(grammarAccess.getLetExpressionAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleExpression
entryRuleExpression
:
{ before(grammarAccess.getExpressionRule()); }
	 ruleExpression
{ after(grammarAccess.getExpressionRule()); } 
	 EOF 
;

// Rule Expression
ruleExpression 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); }
		rulePlusOrMinus
		{ after(grammarAccess.getExpressionAccess().getPlusOrMinusParserRuleCall()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePlusOrMinus
entryRulePlusOrMinus
:
{ before(grammarAccess.getPlusOrMinusRule()); }
	 rulePlusOrMinus
{ after(grammarAccess.getPlusOrMinusRule()); } 
	 EOF 
;

// Rule PlusOrMinus
rulePlusOrMinus 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup()); }
		(rule__PlusOrMinus__Group__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleMulOrDiv
entryRuleMulOrDiv
:
{ before(grammarAccess.getMulOrDivRule()); }
	 ruleMulOrDiv
{ after(grammarAccess.getMulOrDivRule()); } 
	 EOF 
;

// Rule MulOrDiv
ruleMulOrDiv 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getMulOrDivAccess().getGroup()); }
		(rule__MulOrDiv__Group__0)
		{ after(grammarAccess.getMulOrDivAccess().getGroup()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRulePrimary
entryRulePrimary
:
{ before(grammarAccess.getPrimaryRule()); }
	 rulePrimary
{ after(grammarAccess.getPrimaryRule()); } 
	 EOF 
;

// Rule Primary
rulePrimary 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getPrimaryAccess().getAlternatives()); }
		(rule__Primary__Alternatives)
		{ after(grammarAccess.getPrimaryAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

// Entry rule entryRuleAtomic
entryRuleAtomic
:
{ before(grammarAccess.getAtomicRule()); }
	 ruleAtomic
{ after(grammarAccess.getAtomicRule()); } 
	 EOF 
;

// Rule Atomic
ruleAtomic 
	@init {
		int stackSize = keepStackSize();
	}
	:
	(
		{ before(grammarAccess.getAtomicAccess().getAlternatives()); }
		(rule__Atomic__Alternatives)
		{ after(grammarAccess.getAtomicAccess().getAlternatives()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__AbstractElement__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); }
		ruleVariable
		{ after(grammarAccess.getAbstractElementAccess().getVariableParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getAbstractElementAccess().getLetExpressionParserRuleCall_1()); }
		ruleLetExpression
		{ after(grammarAccess.getAbstractElementAccess().getLetExpressionParserRuleCall_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Alternatives_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
		(rule__PlusOrMinus__Group_1_0_0__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
		(rule__PlusOrMinus__Group_1_0_1__0)
		{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__OpAlternatives_1_0_1_0
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); }
		'*'
		{ after(grammarAccess.getMulOrDivAccess().getOpAsteriskKeyword_1_0_1_0_0()); }
	)
	|
	(
		{ before(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); }
		'/'
		{ after(grammarAccess.getMulOrDivAccess().getOpSolidusKeyword_1_0_1_0_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); }
		ruleAtomic
		{ after(grammarAccess.getPrimaryAccess().getAtomicParserRuleCall_0()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getGroup_1()); }
		(rule__Primary__Group_1__0)
		{ after(grammarAccess.getPrimaryAccess().getGroup_1()); }
	)
	|
	(
		{ before(grammarAccess.getPrimaryAccess().getAbstractElementParserRuleCall_2()); }
		ruleAbstractElement
		{ after(grammarAccess.getPrimaryAccess().getAbstractElementParserRuleCall_2()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Alternatives
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_0()); }
		(rule__Atomic__Group_0__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_0()); }
	)
	|
	(
		{ before(grammarAccess.getAtomicAccess().getGroup_1()); }
		(rule__Atomic__Group_1__0)
		{ after(grammarAccess.getAtomicAccess().getGroup_1()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group__0__Impl
	rule__Variable__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getVarKeyword_0()); }
	'var'
	{ after(grammarAccess.getVariableAccess().getVarKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group__1__Impl
	rule__Variable__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getNameAssignment_1()); }
	(rule__Variable__NameAssignment_1)
	{ after(grammarAccess.getVariableAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group__2__Impl
	rule__Variable__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getVariableAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Variable__Group__3__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getVariableAccess().getExpressionAssignment_3()); }
	(rule__Variable__ExpressionAssignment_3)
	{ after(grammarAccess.getVariableAccess().getExpressionAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__LetExpression__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__0__Impl
	rule__LetExpression__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); }
	'let'
	{ after(grammarAccess.getLetExpressionAccess().getLetKeyword_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__1__Impl
	rule__LetExpression__Group__2
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getNameAssignment_1()); }
	(rule__LetExpression__NameAssignment_1)
	{ after(grammarAccess.getLetExpressionAccess().getNameAssignment_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__2__Impl
	rule__LetExpression__Group__3
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getEqualsSignKeyword_2()); }
	'='
	{ after(grammarAccess.getLetExpressionAccess().getEqualsSignKeyword_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__3
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__3__Impl
	rule__LetExpression__Group__4
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__3__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getVariableAssignment_3()); }
	(rule__LetExpression__VariableAssignment_3)
	{ after(grammarAccess.getLetExpressionAccess().getVariableAssignment_3()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__4
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__4__Impl
	rule__LetExpression__Group__5
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__4__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getInKeyword_4()); }
	'in'
	{ after(grammarAccess.getLetExpressionAccess().getInKeyword_4()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__5
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__5__Impl
	rule__LetExpression__Group__6
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__5__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getExpressionAssignment_5()); }
	(rule__LetExpression__ExpressionAssignment_5)
	{ after(grammarAccess.getLetExpressionAccess().getExpressionAssignment_5()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__6
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__LetExpression__Group__6__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__Group__6__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getLetExpressionAccess().getEndKeyword_6()); }
	'end'
	{ after(grammarAccess.getLetExpressionAccess().getEndKeyword_6()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__0__Impl
	rule__PlusOrMinus__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); }
	ruleMulOrDiv
	{ after(grammarAccess.getPlusOrMinusAccess().getMulOrDivParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
	(rule__PlusOrMinus__Group_1__0)*
	{ after(grammarAccess.getPlusOrMinusAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__0__Impl
	rule__PlusOrMinus__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
	(rule__PlusOrMinus__Alternatives_1_0)
	{ after(grammarAccess.getPlusOrMinusAccess().getAlternatives_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
	(rule__PlusOrMinus__RightAssignment_1_1)
	{ after(grammarAccess.getPlusOrMinusAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__0__Impl
	rule__PlusOrMinus__Group_1_0_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusLeftAction_1_0_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); }
	'+'
	{ after(grammarAccess.getPlusOrMinusAccess().getPlusSignKeyword_1_0_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__PlusOrMinus__Group_1_0_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__0__Impl
	rule__PlusOrMinus__Group_1_0_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); }
	()
	{ after(grammarAccess.getPlusOrMinusAccess().getMinusLeftAction_1_0_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__PlusOrMinus__Group_1_0_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__Group_1_0_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); }
	'-'
	{ after(grammarAccess.getPlusOrMinusAccess().getHyphenMinusKeyword_1_0_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group__0__Impl
	rule__MulOrDiv__Group__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); }
	rulePrimary
	{ after(grammarAccess.getMulOrDivAccess().getPrimaryParserRuleCall_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getGroup_1()); }
	(rule__MulOrDiv__Group_1__0)*
	{ after(grammarAccess.getMulOrDivAccess().getGroup_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__0__Impl
	rule__MulOrDiv__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getGroup_1_0()); }
	(rule__MulOrDiv__Group_1_0__0)
	{ after(grammarAccess.getMulOrDivAccess().getGroup_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); }
	(rule__MulOrDiv__RightAssignment_1_1)
	{ after(grammarAccess.getMulOrDivAccess().getRightAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MulOrDiv__Group_1_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1_0__0__Impl
	rule__MulOrDiv__Group_1_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); }
	()
	{ after(grammarAccess.getMulOrDivAccess().getMulOrDivLeftAction_1_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__MulOrDiv__Group_1_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__Group_1_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); }
	(rule__MulOrDiv__OpAssignment_1_0_1)
	{ after(grammarAccess.getMulOrDivAccess().getOpAssignment_1_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Primary__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__0__Impl
	rule__Primary__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); }
	'('
	{ after(grammarAccess.getPrimaryAccess().getLeftParenthesisKeyword_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__1__Impl
	rule__Primary__Group_1__2
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1()); }
	ruleExpression
	{ after(grammarAccess.getPrimaryAccess().getExpressionParserRuleCall_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Primary__Group_1__2__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Primary__Group_1__2__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); }
	')'
	{ after(grammarAccess.getPrimaryAccess().getRightParenthesisKeyword_1_2()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_0__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_0__0__Impl
	rule__Atomic__Group_0__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_0__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getNumberAction_0_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getNumberAction_0_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_0__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_0__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_0__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); }
	(rule__Atomic__ValueAssignment_0_1)
	{ after(grammarAccess.getAtomicAccess().getValueAssignment_0_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__Atomic__Group_1__0
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_1__0__Impl
	rule__Atomic__Group_1__1
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_1__0__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getVariableUseAction_1_0()); }
	()
	{ after(grammarAccess.getAtomicAccess().getVariableUseAction_1_0()); }
)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_1__1
	@init {
		int stackSize = keepStackSize();
	}
:
	rule__Atomic__Group_1__1__Impl
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__Group_1__1__Impl
	@init {
		int stackSize = keepStackSize();
	}
:
(
	{ before(grammarAccess.getAtomicAccess().getVariableUseAssignment_1_1()); }
	(rule__Atomic__VariableUseAssignment_1_1)
	{ after(grammarAccess.getAtomicAccess().getVariableUseAssignment_1_1()); }
)
;
finally {
	restoreStackSize(stackSize);
}


rule__MathExp__ElementsAssignment
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMathExpAccess().getElementsVariableParserRuleCall_0()); }
		ruleVariable
		{ after(grammarAccess.getMathExpAccess().getElementsVariableParserRuleCall_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getVariableAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Variable__ExpressionAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); }
		ruleExpression
		{ after(grammarAccess.getVariableAccess().getExpressionExpressionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__NameAssignment_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
		RULE_ID
		{ after(grammarAccess.getLetExpressionAccess().getNameIDTerminalRuleCall_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__VariableAssignment_3
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetExpressionAccess().getVariableExpressionParserRuleCall_3_0()); }
		ruleExpression
		{ after(grammarAccess.getLetExpressionAccess().getVariableExpressionParserRuleCall_3_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__LetExpression__ExpressionAssignment_5
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_5_0()); }
		ruleExpression
		{ after(grammarAccess.getLetExpressionAccess().getExpressionExpressionParserRuleCall_5_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__PlusOrMinus__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); }
		ruleMulOrDiv
		{ after(grammarAccess.getPlusOrMinusAccess().getRightMulOrDivParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__OpAssignment_1_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); }
		(rule__MulOrDiv__OpAlternatives_1_0_1_0)
		{ after(grammarAccess.getMulOrDivAccess().getOpAlternatives_1_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__MulOrDiv__RightAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); }
		rulePrimary
		{ after(grammarAccess.getMulOrDivAccess().getRightPrimaryParserRuleCall_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__ValueAssignment_0_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); }
		RULE_INT
		{ after(grammarAccess.getAtomicAccess().getValueINTTerminalRuleCall_0_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

rule__Atomic__VariableUseAssignment_1_1
	@init {
		int stackSize = keepStackSize();
	}
:
	(
		{ before(grammarAccess.getAtomicAccess().getVariableUseAbstractElementCrossReference_1_1_0()); }
		(
			{ before(grammarAccess.getAtomicAccess().getVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1()); }
			RULE_ID
			{ after(grammarAccess.getAtomicAccess().getVariableUseAbstractElementIDTerminalRuleCall_1_1_0_1()); }
		)
		{ after(grammarAccess.getAtomicAccess().getVariableUseAbstractElementCrossReference_1_1_0()); }
	)
;
finally {
	restoreStackSize(stackSize);
}

RULE_ID : '^'? ('a'..'z'|'A'..'Z'|'_') ('a'..'z'|'A'..'Z'|'_'|'0'..'9')*;

RULE_INT : ('0'..'9')+;

RULE_STRING : ('"' ('\\' .|~(('\\'|'"')))* '"'|'\'' ('\\' .|~(('\\'|'\'')))* '\'');

RULE_ML_COMMENT : '/*' ( options {greedy=false;} : . )*'*/';

RULE_SL_COMMENT : '//' ~(('\n'|'\r'))* ('\r'? '\n')?;

RULE_WS : (' '|'\t'|'\r'|'\n')+;

RULE_ANY_OTHER : .;
