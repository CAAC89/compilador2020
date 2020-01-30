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
public class IdentifierType implements Type{
    private String name;
	
	public IdentifierType(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
