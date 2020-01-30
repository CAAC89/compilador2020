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
public class Formal {
    
    private Type type;
	private Identifier id;
	
	public Formal(Type type, Identifier id) {
		this.type = type;
		this.id = id;
	}
	
	public Type getType() {
		return type;
	}
	
	public Identifier getId() {
		return id;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
    
}
