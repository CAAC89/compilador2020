/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package visitor;

/**
 *
 * @author Caili
 */
import ast.Block;
import ast.False;
import ast.IdentifierType;
import ast.IntArrayType;
import ast.And;
import ast.MainClass;
import ast.IntegerLiteral;
import ast.ArrayLookup;
import ast.Program;
import ast.Print;
import ast.BooleanType;
import ast.Not;
import ast.IdentifierExp;
import ast.True;
import ast.IntegerType;
import ast.Plus;
import ast.ArrayAssign;
import ast.ClassDeclSimple;
import ast.Formal;
import ast.MethodDecl;
import ast.Assign;
import ast.Times;
import ast.NewObject;
import ast.LessThan;
import ast.ClassDeclExtends;
import ast.ArrayLength;
import ast.Identifier;
import ast.NewArray;
import ast.Minus;
import ast.Call;
import ast.This;
import ast.VarDecl;
import ast.While;
import ast.If;

public interface  Visitor {
    
    public void visit(Program prog);
	public void visit(MainClass main);
	public void visit(ClassDeclSimple simpleClass);
	public void visit(ClassDeclExtends extendsClass);
	public void visit(VarDecl var);
	public void visit(MethodDecl method);
	public void visit(Formal param);
	public void visit(IntArrayType intArrayT);
	public void visit(BooleanType boolT);
	public void visit(IntegerType intT);
	public void visit(IdentifierType idT);
	public void visit(Block blockStm);
	public void visit(If ifStm);
	public void visit(While whileStm);
	public void visit(Print printStm);
	public void visit(Assign assignStm);
	public void visit(ArrayAssign arrayAssignStm);
	public void visit(And andExp);
	public void visit(LessThan lessThanExp);
	public void visit(Plus plusExp);
	public void visit(Minus minusExp);
	public void visit(Times timesExp);
	public void visit(ArrayLookup arrayLookup);
	public void visit(ArrayLength length);
	public void visit(Call callExp);
	public void visit(IntegerLiteral intLiteral);
	public void visit(True trueLiteral);
	public void visit(False falseLiteral);
	public void visit(IdentifierExp identExp);
	public void visit(This thisLiteral);
	public void visit(NewArray array);
	public void visit(NewObject object);
	public void visit(Not notExp);
	public void visit(Identifier id);
    
}
