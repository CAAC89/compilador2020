/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ast;

import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author Caili
 */
public class MethodDeclList {
    private List<MethodDecl> list;
	
	public MethodDeclList() {
		list = new ArrayList<MethodDecl>();
	}
	
	public void addElement(MethodDecl methodDecl) {
		list.add(methodDecl);
	}
	
	public MethodDecl elementAt(int index) {
		return list.get(index);
	}
	
	public int size() {
		return list.size();
	}
}
