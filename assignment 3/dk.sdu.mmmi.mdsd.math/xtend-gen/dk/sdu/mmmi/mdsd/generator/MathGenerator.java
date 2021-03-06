/**
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator;

import com.google.common.collect.Iterators;
import dk.sdu.mmmi.mdsd.math.Binding;
import dk.sdu.mmmi.mdsd.math.Div;
import dk.sdu.mmmi.mdsd.math.Expression;
import dk.sdu.mmmi.mdsd.math.External;
import dk.sdu.mmmi.mdsd.math.LetBinding;
import dk.sdu.mmmi.mdsd.math.MathExp;
import dk.sdu.mmmi.mdsd.math.MathNumber;
import dk.sdu.mmmi.mdsd.math.Method;
import dk.sdu.mmmi.mdsd.math.Minus;
import dk.sdu.mmmi.mdsd.math.Mult;
import dk.sdu.mmmi.mdsd.math.Parenthesis;
import dk.sdu.mmmi.mdsd.math.Plus;
import dk.sdu.mmmi.mdsd.math.VarBinding;
import dk.sdu.mmmi.mdsd.math.VariableUse;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.xtend2.lib.StringConcatenation;
import org.eclipse.xtext.generator.AbstractGenerator;
import org.eclipse.xtext.generator.IFileSystemAccess2;
import org.eclipse.xtext.generator.IGeneratorContext;

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
@SuppressWarnings("all")
public class MathGenerator extends AbstractGenerator {
  @Override
  public void doGenerate(final Resource resource, final IFileSystemAccess2 fsa, final IGeneratorContext context) {
    final MathExp program = Iterators.<MathExp>filter(resource.getAllContents(), MathExp.class).next();
    String _name = program.getName();
    String _plus = ("math_expression/" + _name);
    String _plus_1 = (_plus + ".java");
    fsa.generateFile(_plus_1, this.compile(program));
  }
  
  public CharSequence compile(final MathExp program) {
    StringConcatenation _builder = new StringConcatenation();
    _builder.append("package math_expression;");
    _builder.newLine();
    _builder.newLine();
    _builder.append("public class ");
    String _name = program.getName();
    _builder.append(_name);
    _builder.append(" {");
    _builder.newLineIfNotEmpty();
    {
      EList<VarBinding> _variables = program.getVariables();
      for(final VarBinding varBinding : _variables) {
        _builder.append("\t");
        _builder.append("public int ");
        String _name_1 = varBinding.getName();
        _builder.append(_name_1, "\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.newLine();
    _builder.append("\t");
    _builder.append("public void compute() {");
    _builder.newLine();
    {
      EList<VarBinding> _variables_1 = program.getVariables();
      for(final VarBinding varBinding_1 : _variables_1) {
        _builder.append("\t\t");
        String _name_2 = varBinding_1.getName();
        _builder.append(_name_2, "\t\t");
        _builder.append(" = ");
        String _computeExpression = MathGenerator.computeExpression(varBinding_1.getExpression());
        _builder.append(_computeExpression, "\t\t");
        _builder.append(";");
        _builder.newLineIfNotEmpty();
      }
    }
    _builder.append("\t");
    _builder.append("}");
    _builder.newLine();
    _builder.append("\t");
    _builder.newLine();
    {
      int _size = program.getExternals().size();
      boolean _greaterThan = (_size > 0);
      if (_greaterThan) {
        _builder.append("\t");
        _builder.append("private External external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("  ");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public ");
        String _name_3 = program.getName();
        _builder.append(_name_3, "\t");
        _builder.append("(External external) {");
        _builder.newLineIfNotEmpty();
        _builder.append("\t");
        _builder.append("\t");
        _builder.append("this.external = external;");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
        _builder.append("\t");
        _builder.append("public interface External {");
        _builder.newLine();
        {
          EList<External> _externals = program.getExternals();
          for(final External func : _externals) {
            _builder.append("\t");
            _builder.append("\t");
            _builder.append("int ");
            String _name_4 = func.getName();
            _builder.append(_name_4, "\t\t");
            _builder.append("(");
            {
              int _size_1 = func.getArgs().size();
              boolean _equals = (_size_1 == 1);
              if (_equals) {
                _builder.append("int n");
              }
            }
            {
              int _size_2 = func.getArgs().size();
              boolean _equals_1 = (_size_2 == 2);
              if (_equals_1) {
                _builder.append("int n, int m");
              }
            }
            _builder.append(");");
            _builder.newLineIfNotEmpty();
          }
        }
        _builder.append("\t");
        _builder.append("}");
        _builder.newLine();
      }
    }
    _builder.append("}");
    _builder.newLine();
    return _builder;
  }
  
  protected static String _computeExpression(final Expression exp) {
    String _switchResult = null;
    boolean _matched = false;
    if (exp instanceof MathNumber) {
      _matched=true;
      _switchResult = Integer.valueOf(((MathNumber)exp).getValue()).toString();
    }
    if (!_matched) {
      if (exp instanceof Plus) {
        _matched=true;
        String _computeExpression = MathGenerator.computeExpression(((Plus)exp).getLeft());
        String _plus = (_computeExpression + " + ");
        String _computeExpression_1 = MathGenerator.computeExpression(((Plus)exp).getRight());
        _switchResult = (_plus + _computeExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Minus) {
        _matched=true;
        String _computeExpression = MathGenerator.computeExpression(((Minus)exp).getLeft());
        String _plus = (_computeExpression + " - ");
        String _computeExpression_1 = MathGenerator.computeExpression(((Minus)exp).getRight());
        _switchResult = (_plus + _computeExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Mult) {
        _matched=true;
        String _computeExpression = MathGenerator.computeExpression(((Mult)exp).getLeft());
        String _plus = (_computeExpression + " * ");
        String _computeExpression_1 = MathGenerator.computeExpression(((Mult)exp).getRight());
        _switchResult = (_plus + _computeExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Div) {
        _matched=true;
        String _computeExpression = MathGenerator.computeExpression(((Div)exp).getLeft());
        String _plus = (_computeExpression + " / ");
        String _computeExpression_1 = MathGenerator.computeExpression(((Div)exp).getRight());
        _switchResult = (_plus + _computeExpression_1);
      }
    }
    if (!_matched) {
      if (exp instanceof Parenthesis) {
        _matched=true;
        String _computeExpression = MathGenerator.computeExpression(((Parenthesis)exp).getExp());
        String _plus = ("(" + _computeExpression);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof LetBinding) {
        _matched=true;
        _switchResult = MathGenerator.computeExpression(((LetBinding)exp).getBody());
      }
    }
    if (!_matched) {
      if (exp instanceof VariableUse) {
        _matched=true;
        String _computeBinding = MathGenerator.computeBinding(((VariableUse)exp).getRef());
        String _plus = ("(" + _computeBinding);
        _switchResult = (_plus + ")");
      }
    }
    if (!_matched) {
      if (exp instanceof Method) {
        _matched=true;
        StringConcatenation _builder = new StringConcatenation();
        _builder.append("this.external.");
        String _name = ((Method)exp).getRef().getName();
        String _plus = (_builder.toString() + _name);
        StringConcatenation _builder_1 = new StringConcatenation();
        _builder_1.append("(");
        {
          EList<Expression> _exps = ((Method)exp).getExps();
          boolean _hasElements = false;
          for(final Expression x : _exps) {
            if (!_hasElements) {
              _hasElements = true;
            } else {
              _builder_1.appendImmediate(", ", "");
            }
            _builder_1.append(" ");
            String _computeExpression = MathGenerator.computeExpression(x);
            _builder_1.append(_computeExpression);
            _builder_1.append(" ");
          }
        }
        _builder_1.append(")");
        _switchResult = (_plus + _builder_1);
      }
    }
    return _switchResult;
  }
  
  protected static String _computeBinding(final Binding binding) {
    String _switchResult = null;
    boolean _matched = false;
    if (binding instanceof VarBinding) {
      _matched=true;
      _switchResult = ((VarBinding)binding).getName();
    }
    if (!_matched) {
      if (binding instanceof LetBinding) {
        _matched=true;
        _switchResult = MathGenerator.computeExpression(((LetBinding)binding).getBinding());
      }
    }
    return _switchResult;
  }
  
  public static String computeExpression(final Expression exp) {
    return _computeExpression(exp);
  }
  
  public static String computeBinding(final Binding binding) {
    return _computeBinding(binding);
  }
}
