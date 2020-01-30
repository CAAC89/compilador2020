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
public class Block implements Statement {
    private StatementList stms;
	
	public Block(StatementList stms) {
		this.stms = stms;
	}
	
	public StatementList getStms() {
		return stms;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
}
