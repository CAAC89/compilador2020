/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compilador2020;

import analisisLexico.Lexer;
import analisisLexico.Token;
import analisisLexico.TokenType;
import analisisSintactico.Parser;
import ast.Program;
import java.io.FileNotFoundException;
import java.io.FileReader;
import visitor.Checker;

import java.lang.*;

/**
 *
 * @author Caili
 */
public class Compilador2020 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here
       
              
                
                //file = new FileReader("C:\\Users\\Caili\\Desktop\\proyectoEntregaCompiladores2020\\compilador2020\\Examples\\Example.java");
                  
                
                
			// parse each file argument given
			
				FileReader file;
				
				// attempt to open file
				try {
					file = new FileReader("C:\\Users\\Caili\\Desktop\\proyectoEntregaCompiladores2020\\compilador2020\\Examples\\BinarySearch.java" );
                                        // create parser
				Parser parser = new Parser(file);
				System.out.println("Parsing ...");
				
				// initiate parse and clock time
				long startTime = System.currentTimeMillis();
				Program prog = parser.parseProgram();
				long endTime = System.currentTimeMillis();
				
				// print out statistics
				System.out.println("File has finished parsing!");
				System.out.println("Execution time: " + (endTime - startTime) + "ms");
				System.out.println(parser.getErrorCount() + " errors reported");
				System.out.println("---");
				
				// print out ASTs
				Checker printer = new Checker();
				printer.visit(prog);
				System.out.println();
                                } catch (FileNotFoundException e) {
					System.err.println( " was not found in MiniJava/programs");

				}
				
				
			}
		
                
            

}
