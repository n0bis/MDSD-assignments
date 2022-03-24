package dk.sdu.mmmi.mdsd.tests

import com.google.inject.Inject
import dk.sdu.mmmi.mdsd.math.MathExp
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

import static extension dk.sdu.mmmi.mdsd.generator.MathGenerator.compute

@ExtendWith(InjectionExtension)
@InjectWith(MathInjectorProvider)
class MathExampleTest {
	@Inject extension ParseHelper<MathExp> 
	
	@Test
	def void mathematicalOperations() {
		val result = '''
			var a = 40
			var b = 40 + 2
			var c = 40 + 5 - 10 - 8
			var d = 40 + 2 * 4 + 80
			var e = (40 + 2) * (4 + 80)
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(40, variables.get("a"))
		Assertions.assertEquals(42, variables.get("b"))
		Assertions.assertEquals(27, variables.get("c"))
		Assertions.assertEquals(128, variables.get("d"))
		Assertions.assertEquals(3528, variables.get("e"))
	}

	@Test
	def void letAndScope() {
		val result = '''
			var a = 40
			var b = let i = 2 in a * i end
			var c = b * 3
			var d = let i = 4 in  c + i end 
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(40, variables.get("a"))
		Assertions.assertEquals(80, variables.get("b"))
		Assertions.assertEquals(240, variables.get("c"))
		Assertions.assertEquals(244, variables.get("d"))
	}

	@Test
	def void evilExample() {
		val result = '''
			var a = let i = b in b + c + d + e + i end
			var c = let i = 3 in b * i end
			var e = let i = d in i * d end
			var d = let i = c in i + b end
			var b = 2
		'''.parse
		val variables = result.compute
		Assertions.assertEquals(82, variables.get("a"))
		Assertions.assertEquals(2, variables.get("b"))
		Assertions.assertEquals(6, variables.get("c"))
		Assertions.assertEquals(8, variables.get("d"))
		Assertions.assertEquals(64, variables.get("e"))
	}
}