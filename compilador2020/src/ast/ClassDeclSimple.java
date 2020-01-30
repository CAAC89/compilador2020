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
public class ClassDeclSimple implements ClassDecl{
    
    private Identifier classId;
	private VarDeclList fields;
	private MethodDeclList methods;
	
	public ClassDeclSimple(Identifier classId, VarDeclList fields, MethodDeclList methods) {
		this.classId = classId;
		this.fields = fields;
		this.methods = methods;
	}
	
	public Identifier getClassId() {
		return classId;
	}
	
	public VarDeclList getFields() {
		return fields;
	}
	
	public MethodDeclList getMethods() {
		return methods;
	}
	
	public void accept(Visitor v) {
		v.visit(this);
	}
    
}
