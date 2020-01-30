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
public class VarDeclList {
    private List<VarDecl> list;
	
	public VarDeclList() {
		list = new ArrayList<VarDecl>();
	}
	
	public void addElement(VarDecl varDecl) {
		list.add(varDecl);
	}
	
	public VarDecl elementAt(int index) {
		return list.get(index);
	}
	
	public int size() {
		return list.size();
	}
}
