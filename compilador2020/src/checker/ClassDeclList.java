/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Caili
 */
public class ClassDeclList {
    private List<ClassDecl> list;
	
	public ClassDeclList() {
		list = new ArrayList<ClassDecl>();
	}
	
	public void addElement(ClassDecl classDecl) {
		list.add(classDecl);
	}
	
	public ClassDecl elementAt(int index) {
		return list.get(index);
	}
	
	public int size() {
		return list.size();
	}
}
