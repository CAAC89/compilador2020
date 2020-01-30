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
public class ExpList {
    private List<Exp> list;
	
	public ExpList() {
		list = new ArrayList<Exp>();
	}
	
	public void addElement(Exp exp) {
		list.add(exp);
	}
	
	public Exp elementAt(int index) {
		return list.get(index);
	}
	
	public int size() {
		return list.size();
	}
}
