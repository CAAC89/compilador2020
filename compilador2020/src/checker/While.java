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
public class While implements Statement{
    private Exp condExp;
	private Statement stm;
	
	public While(Exp condExp, Statement stm) {
		this.condExp = condExp;
		this.stm = stm;
	}
	
	public Exp getCondExp() {
		return condExp;
	}
	
	public Statement getStm() {
		return stm;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
