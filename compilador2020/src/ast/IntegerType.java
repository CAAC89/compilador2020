/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import visitor.Visitor;

/**
 *
 * @author Caili
 */
public class IntegerType implements Type{
    public void accept(Visitor v) {
		v.visit(this);
	}
}
