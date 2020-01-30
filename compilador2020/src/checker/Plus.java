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
public class Plus  implements Exp{
    private Exp lhs, rhs;
	
	public Plus(Exp lhs, Exp rhs) {
		this.lhs = lhs;
		this.rhs = rhs;
	}
	
	public Exp getLHS() {
		return lhs;
	}
	
	public Exp getRHS() {
		return rhs;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
