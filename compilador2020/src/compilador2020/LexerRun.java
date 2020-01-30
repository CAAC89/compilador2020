/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2020;

import analisisLexico.Lexer;
import analisisLexico.Token;
import analisisLexico.TokenType;
import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *
 * @author Caili
 */
public class LexerRun {
    public static void main(String[] args) {
	
				FileReader file;
				
				// attempt to open file
				try {
					file = new FileReader("C:\\Users\\Caili\\Desktop\\proyectoEntregaCompiladores2020\\compilador2020\\Examples\\BinarySearch.java");
                                        // create lexer
				Lexer lexer = new Lexer(file);
				
				// start tokenizing file
				System.out.println("Tokenizing ...");
				long startTime = System.currentTimeMillis();
				int numTokens = 0;
				Token token;
				do {
					token = lexer.getToken();
					numTokens++;
					
					// print token type and location
					System.out.print(token.getType());
					System.out.print(" (" + token.getLineNum() + "," + token.getColNum() + ")");
					
					// print out semantic values for ID and INT_CONST tokens
					if (token.getType() == TokenType.ID)
						System.out.println(": " + lexer.getIdVal());
					else if (token.getType() == TokenType.INT_CONST)
						System.out.println(": " + lexer.getIntVal());
					else
						System.out.println();
					
				} while (token.getType() != TokenType.EOF);
				
				long endTime = System.currentTimeMillis();
				
				// print out statistics
				System.out.println("---");
				System.out.println("Number of tokens: " + numTokens);
				System.out.println("Execution time: " + (endTime - startTime) + "ms");
				System.out.println();
				} catch (FileNotFoundException e) {
					System.err.println( " was not found in MiniJava/programs");
				}
				
				
			}
		
	
}
