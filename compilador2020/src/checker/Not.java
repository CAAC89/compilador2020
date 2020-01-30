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
public class Not implements Exp{
    private Exp exp;
	
	public Not(Exp exp) {
		this.exp = exp;
	}
	
	public Exp getExp() {
		return exp;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}