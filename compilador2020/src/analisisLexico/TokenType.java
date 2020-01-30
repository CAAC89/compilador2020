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
public enum TokenType {
    
    // basic types
	ID, // [a-zA-Z][a-zA-Z0-9_]*
	INT_CONST, // [0-9]+
	EOF, // input stream has been consumed
	UNKNOWN, // character/token could not be processed
	
	// binary operators
	AND, // &&
	LT, // <
	PLUS, // +
	MINUS, // -
	TIMES, // *
	
	// reserved words (case-sensitive)
	CLASS, // class
	PUBLIC, // public
	STATIC, // static
	VOID, // void
	MAIN, // main - relegate as ID (?)
	STRING, // String - relegate as ID (?)
	EXTENDS, // extends
	RETURN, // return
	INT, // int
	BOOLEAN, // boolean
	IF, // if
	ELSE, // else
	WHILE, // while
	TRUE, // true
	FALSE, // false
	THIS, // this
	NEW, // new
	
	// punctuation
	LPAREN, // (
	RPAREN, // )
	LBRACKET, // [
	RBRACKET, // ]
	LBRACE, // {
	RBRACE, // }
	SEMI, // ;
	COMMA, // ,
	DOT, // .
	ASSIGN, // =
	BANG, // !
	
	// for error reporting
	STATEMENT,
	EXPRESSION,
	OPERATOR,
	TYPE
    
}
