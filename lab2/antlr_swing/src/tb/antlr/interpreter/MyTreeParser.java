package tb.antlr.interpreter;

import org.antlr.runtime.*;
import org.antlr.runtime.tree.*;

import tb.antlr.symbolTable.GlobalSymbols;

public class MyTreeParser extends TreeParser {
	
	protected GlobalSymbols gSymbols = new GlobalSymbols();

    public MyTreeParser(TreeNodeStream input) {
        super(input);
    }

    public MyTreeParser(TreeNodeStream input, RecognizerSharedState state) {
        super(input, state);
    }

    protected void drukuj(String text) {
        System.out.println(text.replace('\r', ' ').replace('\n', ' '));
    }
    
    protected void printEx(RuntimeException ex) {
    	System.out.println(ex.getMessage());
    }

	protected Integer getInt(String text) {
		return Integer.parseInt(text);
	}
	
	protected Integer add(Integer a, Integer b) {
		return a + b;
	}
	
	protected Integer sub(Integer a, Integer b) {
		return a - b;
	}
	
	protected Integer mul(Integer a, Integer b) {
		return a * b;
	}
	
	protected Integer div(Integer a, Integer b) throws RuntimeException{
		if(b == 0) {
			throw new RuntimeException("Cannot divide by zero!");
		}
		
		return a / b;
	}
	
	protected Integer setVariable(String name, Integer val) {
		gSymbols.setSymbol(name, val);
		return val;
	}
	
	protected void createVariable(String name) {
		gSymbols.newSymbol(name);
	}
	
	protected Integer getValue(String name) {
		return gSymbols.getSymbol(name);
	}
}
