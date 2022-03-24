package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.generator.MathGenerator;
import dk.sdu.mmmi.mdsd.math.MathExp;
import java.util.Map;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathExampleTest {
  @Inject
  @Extension
  private ParseHelper<MathExp> _parseHelper;
  
  @Test
  public void mathematicalOperations() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 40");
      _builder.newLine();
      _builder.append("var b = 40 + 2");
      _builder.newLine();
      _builder.append("var c = 40 + 5 - 10 - 8");
      _builder.newLine();
      _builder.append("var d = 40 + 2 * 4 + 80");
      _builder.newLine();
      _builder.append("var e = (40 + 2) * (4 + 80)");
      _builder.newLine();
      final MathExp result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MathGenerator.compute(result);
      Assertions.assertEquals(40, variables.get("a"));
      Assertions.assertEquals(42, variables.get("b"));
      Assertions.assertEquals(27, variables.get("c"));
      Assertions.assertEquals(128, variables.get("d"));
      Assertions.assertEquals(3528, variables.get("e"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void letAndScope() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = 40");
      _builder.newLine();
      _builder.append("var b = let i = 2 in a * i end");
      _builder.newLine();
      _builder.append("var c = b * 3");
      _builder.newLine();
      _builder.append("var d = let i = 4 in  c + i end ");
      _builder.newLine();
      final MathExp result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MathGenerator.compute(result);
      Assertions.assertEquals(40, variables.get("a"));
      Assertions.assertEquals(80, variables.get("b"));
      Assertions.assertEquals(240, variables.get("c"));
      Assertions.assertEquals(244, variables.get("d"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void evilExample() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var a = let i = b in b + c + d + e + i end");
      _builder.newLine();
      _builder.append("var c = let i = 3 in b * i end");
      _builder.newLine();
      _builder.append("var e = let i = d in i * d end");
      _builder.newLine();
      _builder.append("var d = let i = c in i + b end");
      _builder.newLine();
      _builder.append("var b = 2");
      _builder.newLine();
      final MathExp result = this._parseHelper.parse(_builder);
      final Map<String, Integer> variables = MathGenerator.compute(result);
      Assertions.assertEquals(82, variables.get("a"));
      Assertions.assertEquals(2, variables.get("b"));
      Assertions.assertEquals(6, variables.get("c"));
      Assertions.assertEquals(8, variables.get("d"));
      Assertions.assertEquals(64, variables.get("e"));
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
