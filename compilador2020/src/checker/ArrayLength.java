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
public class ArrayLength implements Exp{
    
    private Exp array;
	
	public ArrayLength(Exp array) {
		this.array = array;
	}
	
	public Exp getArray() {
		return array;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
    
}
