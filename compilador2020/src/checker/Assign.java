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
public class Assign implements Statement{
    private Identifier id;
	private Exp value;
	
	public Assign(Identifier id, Exp value) {
		this.id = id;
		this.value = value;
	}
	
	public Identifier getId() {
		return id;
	}
	
	public Exp getValue() {
		return value;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
