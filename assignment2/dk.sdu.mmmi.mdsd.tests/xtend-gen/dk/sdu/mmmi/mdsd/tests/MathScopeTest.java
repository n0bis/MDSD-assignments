package dk.sdu.mmmi.mdsd.tests;

import com.google.inject.Inject;
import dk.sdu.mmmi.mdsd.math.MathPackage;
import dk.sdu.mmmi.mdsd.math.Model;
import org.eclipse.xtext.testing.InjectWith;
import org.eclipse.xtext.testing.extensions.InjectionExtension;
import org.eclipse.xtext.testing.util.ParseHelper;
import org.eclipse.xtext.testing.validation.ValidationTestHelper;
import org.eclipse.xtext.xbase.lib.Extension;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

@ExtendWith(InjectionExtension.class)
@InjectWith(MathInjectorProvider.class)
@SuppressWarnings("all")
public class MathScopeTest {
  @Inject
  @Extension
  private ParseHelper<Model> _parseHelper;
  
  @Inject
  @Extension
  private ValidationTestHelper _validationTestHelper;
  
  private final MathPackage epackage = MathPackage.eINSTANCE;
  
  @Test
  public void forwardReferenceLetError() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MathPackage");
  }
  
  @Test
  public void referenceOutsideLetError() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MathPackage");
  }
  
  @Test
  public void referenceNoVariable() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MathPackage");
  }
  
  @Test
  public void referenceCurrentVar() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MathPackage");
  }
  
  @Test
  public void referenceCurrentVarInLet() {
    throw new Error("Unresolved compilation problems:"
      + "\nThe method or field variableUse is undefined for the type MathPackage");
  }
}
