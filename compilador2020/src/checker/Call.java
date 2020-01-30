/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checker;

import visitor.Visitor;

/**
 *
 * @author Caili
 */
public class Call implements Exp {
    
    private Exp callee;
	private Identifier methodName;
	private ExpList args;
	
	public Call(Exp callee, Identifier methodName, ExpList args) {
		this.callee = callee;
		this.methodName = methodName;
		this.args = args;
	}
	
	public Exp getCallee() {
		return callee;
	}
	
	public Identifier getMethodName() {
		return methodName;
	}
	
	public ExpList getArgs() {
		return args;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
    
}
