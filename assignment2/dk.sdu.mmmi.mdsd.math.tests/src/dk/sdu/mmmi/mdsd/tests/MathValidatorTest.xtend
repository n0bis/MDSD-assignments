package dk.sdu.mmmi.mdsd.tests

import com.google.inject.Inject
import dk.sdu.mmmi.mdsd.math.MathExp
import org.eclipse.xtext.testing.InjectWith
import org.eclipse.xtext.testing.extensions.InjectionExtension
import org.eclipse.xtext.testing.util.ParseHelper
import org.eclipse.xtext.testing.validation.ValidationTestHelper
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.^extension.ExtendWith

@ExtendWith(InjectionExtension)
@InjectWith(MathInjectorProvider)
class MathValidatorTest {
    @Inject extension ParseHelper<MathExp>
    @Inject extension ValidationTestHelper
        
    @Test
    def void noRepeatedGlobalVarDeclaration() {
        val result = '''
            var x = 1*2
            var y = 42
            var x = let i = y in i end
        '''.parse
        Assertions.assertTrue(result.eResource.validate.size > 0 )
    }
}

