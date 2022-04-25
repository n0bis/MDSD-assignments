package math_expression.test;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import math_expression.*;

public class MathTest {
	
	@Test
	public void number() {
		Test01 math = new Test01();
		math.compute();
		Assertions.assertEquals(42, math.x);
	}
	
	@Test
	public void addition() {
		Test02 math = new Test02();
		math.compute();
		Assertions.assertEquals(42, math.x);
	}
	
	@Test
	public void threeNumbersAddition() {
		Test03 math = new Test03();
		math.compute();
		Assertions.assertEquals(42, math.x);
	}
	
	@Test
	public void subtraction() {
		Test04 math = new Test04();
		math.compute();
		Assertions.assertEquals(42, math.x);
	}
	
	@Test
	public void nonCommutativeSubtraction() {
		Test05 math = new Test05();
		math.compute();
		Assertions.assertEquals(-42, math.x);
	}
	
	@Test
	public void threeNumbersSubtraction() {
		Test06 math = new Test06();
		math.compute();
		Assertions.assertEquals(-42, math.x);
	}
	
	@Test
	public void additionAndSubstraction() {
		Test07 math = new Test07();
		math.compute();
		Assertions.assertEquals(87, math.x);
	}
	
	@Test
	public void multiplication() {
		Test08 math = new Test08();
		math.compute();
		Assertions.assertEquals(20, math.x);
	}
	
	@Test
	public void threeNumberMultiplication() {
		Test09 math = new Test09();
		math.compute();
		Assertions.assertEquals(120, math.x);
	}
	
	@Test
	public void division() {
		Test10 math = new Test10();
		math.compute();
		Assertions.assertEquals(5, math.x);
	}
	
	@Test
	public void nonConmmutativeDivision() {
		Test11 math = new Test11();
		math.compute();
		Assertions.assertEquals(0, math.x);
	}
	
	@Test
	public void threeNumbersDivision() {
		Test12 math = new Test12();
		math.compute();
		Assertions.assertEquals(4, math.x);
	}
	
	@Test
	public void multiplicationAndDivision() {
		Test13 math = new Test13();
		math.compute();
		Assertions.assertEquals(600, math.x);
	}
	
	@Test
	public void variables() {
		Test14 math = new Test14();
		math.compute();
		Assertions.assertEquals(42, math.x);
		Assertions.assertEquals(87, math.y);
		Assertions.assertEquals(600, math.z);
	}
	
	@Test
	public void parenthesis() {
		Test15 math = new Test15();
		math.compute();
		Assertions.assertEquals(87, math.x);
	}
	
	@Test
	public void precedence() {
		Test16 math = new Test16();
		math.compute();
		Assertions.assertEquals(21, math.x);
	}
	
	@Test
	public void letBinding() {
		Test17 math = new Test17();
		math.compute();
		Assertions.assertEquals(42, math.x);
	}
	
	@Test
	public void letBindingExpression() {
		Test18 math = new Test18();
		math.compute();
		Assertions.assertEquals(87, math.x);
	}
	
	@Test
	public void nestedLet() {
		Test19 math = new Test19();
		math.compute();
		Assertions.assertEquals(87, math.x);
	}
	
	@Test
	public void letBindingShadowing() {
		Test20 math = new Test20();
		math.compute();
		Assertions.assertEquals(87, math.x);
	}
	
	@Test
	public void varBinding() {
		Test21 math = new Test21();
		math.compute();
		Assertions.assertEquals(42, math.x);
		Assertions.assertEquals(42, math.y);
	}
	
	@Test
	public void varBindingExpression() {
		Test22 math = new Test22();
		math.compute();
		Assertions.assertEquals(42, math.x);
		Assertions.assertEquals(84, math.y);
	}
	
	@Test
	public void varBindingInLetBody() {
		Test23 math = new Test23();
		math.compute();
		Assertions.assertEquals(21, math.x);
		Assertions.assertEquals(42, math.y);
	}
	
	@Test
	public void varBindingInLetBinding() {
		Test24 math = new Test24();
		math.compute();
		Assertions.assertEquals(21, math.x);
		Assertions.assertEquals(42, math.y);
	}
	
	@Test
	public void letBindingShadowingVarBinding() {
		Test25 math = new Test25();
		math.compute();
		Assertions.assertEquals(20, math.x);
		Assertions.assertEquals(42, math.y);
	}
	
	@Test
	public void letBindingReferenceVarAndShadowing() {
		Test26 math = new Test26();
		math.compute();
		Assertions.assertEquals(21, math.x);
		Assertions.assertEquals(44, math.y);
	}
	
	@Test
	public void externalCallNoArguments() {
		Test27 math = new Test27(new ExternalImpl());
		math.compute();
		Assertions.assertEquals(3, math.x);
		Assertions.assertEquals(5, math.y);
	}
	
	@Test
	public void externalCallOneArgument() {
		Test28 math = new Test28(new ExternalImpl());
		math.compute();
		Assertions.assertEquals(2, math.x);
		Assertions.assertEquals(4, math.y);
	}
	
	@Test
	public void externalCallMultipleArguments() {
		Test29 math = new Test29(new ExternalImpl());
		math.compute();
		Assertions.assertEquals(16, math.x);
		Assertions.assertEquals(14, math.y);
	}
	
	@Test
	public void multipleExternalCalls() {
		Test30 math = new Test30(new ExternalImpl());
		math.compute();
		Assertions.assertEquals(3, math.x);
	}
	
	@Test
	public void externalCallAndExpression() {
		Test31 math = new Test31(new ExternalImpl());
		math.compute();
		Assertions.assertEquals(5, math.x);
		Assertions.assertEquals(66, math.y);
	}
	
	@Test
	public void FullExample1() {
		Test32 math = new Test32();
		math.compute();
		Assertions.assertEquals(40, math.a);
		Assertions.assertEquals(42, math.b);
		Assertions.assertEquals(27, math.c);
		Assertions.assertEquals(128, math.d);
		Assertions.assertEquals(3528, math.e);
	}
	
	@Test
	public void FullExample2() {
		Test33 math = new Test33();
		math.compute();
		Assertions.assertEquals(40, math.a);
		Assertions.assertEquals(80, math.b);
		Assertions.assertEquals(240, math.c);
		Assertions.assertEquals(244, math.d);
	}
	
	@Test
	public void FullExample3() {
		Test34 math = new Test34(new ExternalImpl());
		math.compute();
		Assertions.assertEquals(3, math.sideA);
		Assertions.assertEquals(4, math.sideB);
		Assertions.assertEquals(5, math.sideC);
		Assertions.assertEquals(12, math.perimeterTriangle);
		Assertions.assertEquals(5, math.radius);
		Assertions.assertEquals(30, math.perimeterCircle);
	}
}








































