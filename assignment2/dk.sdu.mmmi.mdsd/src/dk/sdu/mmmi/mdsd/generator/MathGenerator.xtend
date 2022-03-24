/*
 * generated by Xtext 2.25.0
 */
package dk.sdu.mmmi.mdsd.generator

import dk.sdu.mmmi.mdsd.math.Minus
import dk.sdu.mmmi.mdsd.math.Plus
import dk.sdu.mmmi.mdsd.math.Number
import java.util.HashMap
import java.util.Map
import javax.swing.JOptionPane
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.xtext.generator.AbstractGenerator
import org.eclipse.xtext.generator.IFileSystemAccess2
import org.eclipse.xtext.generator.IGeneratorContext
import dk.sdu.mmmi.mdsd.math.MulOrDiv
import dk.sdu.mmmi.mdsd.math.Primary
import dk.sdu.mmmi.mdsd.math.MathExp
import dk.sdu.mmmi.mdsd.math.Exp
import dk.sdu.mmmi.mdsd.math.Model

/**
 * Generates code from your model files on save.
 * 
 * See https://www.eclipse.org/Xtext/documentation/303_runtime_concepts.html#code-generation
 */
class MathGenerator extends AbstractGenerator {

	static Map<String, Integer> variables = new HashMap();
	
	override void doGenerate(Resource resource, IFileSystemAccess2 fsa, IGeneratorContext context) {
		//resource.allContents.filter(Model).next.math.map[compute]
		//val math = resource.allContents.filter(MathExp).next
		//val result = math.compute
		val model = resource.allContents.filter(Model).next
		val result = model.compute
		result.displayPanel
	}
	
	def static compute(Model model) {
		for (variable : model.math) {
			variables.put(variable.name, variable.exp.computeExp)
		}
		return variables
	}
	
	//
	// Compute function: computes value of expression
	// Note: written according to illegal left-recursive grammar, requires fix
	//
	
	/*def static compute(MathExp e) {
		variables.put(e.name, e.exp.computeExp)
		return variables
	}*/
	
	def static int computeExp(Exp e) {
		switch e {
			MulOrDiv: {
				val left = e.left.computeExp as Integer
				val right = e.right.computeExp as Integer
				if (e.op == '*')
					left * right
				else
					left / right
			}
			Minus:
				(e.left.computeExp as Integer) - (e.right.computeExp as Integer)
			Plus: {
				(e.left.computeExp as Integer) + (e.right.computeExp as Integer)
			}
			Number: e.value
			Primary: {
				switch e.exp {
					Number: (e.exp as Number).value
					default: e.exp.computeExp
				}
			}
			default: (e as Number).value
		}
	}

	def void displayPanel(Map<String, Integer> result) {
		var resultString = ""
		for (entry : result.entrySet()) {
         	resultString += "var " + entry.getKey() + " = " + entry.getValue() + "\n"
        }
		
		JOptionPane.showMessageDialog(null, resultString ,"Math Language", JOptionPane.INFORMATION_MESSAGE)
	}


}
