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
public class StatementList {
    private List<Statement> list;
	
	public StatementList() {
		list = new ArrayList<Statement>();
	}
	
	public void addElement(Statement stm) {
		list.add(stm);
	}
	
	public Statement elementAt(int index) {
		return list.get(index);
	}
	
	public int size() {
		return list.size();
	}
}
