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
public class FormalList {
    private List<Formal> list;
	
	public FormalList() {
		list = new ArrayList<Formal>();
	}
	
	public void addElement(Formal param) {
		list.add(param);
	}
	
	public Formal elementAt(int index) {
		return list.get(index);
	}
	
	public int size() {
		return list.size();
	}
}
