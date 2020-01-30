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
public class ClassDeclExtends  implements ClassDecl{
    private Identifier classId, superId;
	private VarDeclList fields;
	private MethodDeclList methods;
	
	public ClassDeclExtends(Identifier classId, Identifier superId, VarDeclList fields,MethodDeclList methods) {
		
		this.classId = classId;
		this.superId = superId;
		this.fields = fields;
		this.methods = methods;
	}
	
	public Identifier getClassId() {
		return classId;
	}
	
	public Identifier getSuperId() {
		return superId;
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
