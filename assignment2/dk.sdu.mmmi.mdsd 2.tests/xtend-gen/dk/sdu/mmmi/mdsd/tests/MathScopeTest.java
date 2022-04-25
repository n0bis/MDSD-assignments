package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.diagnostics.Diagnostic;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Exceptions;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathScopeTest {
  @Inject
  @Extension
  private ParseHelper<MathExp> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  private final MathPackage epackage = MathPackage.eINSTANCE;
  
  @Test
  public void forwardReferenceLetError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var z = let x=y in let y=3 in x*y end + x end + 0");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), this.epackage.getVariableUse(), 
        Diagnostic.LINKING_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void referenceOutsideLetError() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var z = let x=4 in let y=3 in x*y end + y end + 0");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), this.epackage.getVariableUse(), 
        Diagnostic.LINKING_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void referenceNoVariable() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = let i=4 in y end");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), this.epackage.getVariableUse(), 
        Diagnostic.LINKING_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void referenceCurrentVar() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = x");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), this.epackage.getVariableUse(), 
        Diagnostic.LINKING_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
  
  @Test
  public void referenceCurrentVarInLet() {
    try {
      StringConcatenation _builder = new StringConcatenation();
      _builder.append("var x = let i = 2 in x end");
      _builder.newLine();
      this._validationTestHelper.assertError(this._parseHelper.parse(_builder), this.epackage.getVariableUse(), 
        Diagnostic.LINKING_DIAGNOSTIC);
    } catch (Throwable _e) {
      throw Exceptions.sneakyThrow(_e);
    }
  }
}
