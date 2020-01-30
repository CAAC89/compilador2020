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
public class NewArray implements Exp{
    private Exp arraySize;
	
	public NewArray(Exp arraySize) {
		this.arraySize = arraySize;
	}
	
	public Exp getArraySize() {
		return arraySize;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
