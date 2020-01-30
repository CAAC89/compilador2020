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
public class Program {
    
    private MainClass main;
	private ClassDeclList classList;
	
	public Program(MainClass main, ClassDeclList classList) {
		this.main = main;
		this.classList = classList;
	}
	
	public MainClass getMainClass() {
		return main;
	}
	
	public ClassDeclList getClassDeclList() {
		return classList;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
    
}
