/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analisisLexico;

/**
 *
 * @author Caili
 */
public class Token {
    
    private TokenType type;
    private int lineNum, colNum; // for error reporting
	
	public Token(TokenType type, int lineNum, int colNum) {
		this.type = type;
		this.lineNum = lineNum;
		this.colNum = colNum;
	}
	
	public TokenType getType() {
		return type;
	}
	
	public int getLineNum() {
		return lineNum;
	}
	
	public int getColNum() {
		return colNum;
	}
    
}
