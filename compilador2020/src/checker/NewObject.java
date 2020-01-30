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
public class NewObject implements Exp{
    private Identifier id;
	
	public NewObject(Identifier id) {
		this.id = id;
	}
	
	public Identifier getId() {
		return id;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
