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
public class If implements Statement{
    
    private Exp condExp;
	private Statement trueStm, falseStm;
	
	public If(Exp condExp, Statement trueStm, Statement falseStm) {
		this.condExp = condExp;
		this.trueStm = trueStm;
		this.falseStm = falseStm;
	}
	
	public Exp getCondExp() {
		return condExp;
	}
	
	public Statement getTrueStm() {
		return trueStm;
	}
	
	public Statement getFalseStm() {
		return falseStm;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
    
}
