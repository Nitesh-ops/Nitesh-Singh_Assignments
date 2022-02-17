package com.Question7_Assignment;

import org.springframework.expression.Expression;
import org.springframework.expression.ExpressionParser;
import org.springframework.expression.spel.standard.SpelExpressionParser;

public class Question7 {
	public static void main(String[] args) {
		ExpressionParser parser=new SpelExpressionParser();
		Expression exp=parser.parseExpression("'Hello'");
		String str=(String)exp.getValue();
		System.out.println(str);
		
		ExpressionParser parser1=new SpelExpressionParser();
		Expression exp1=parser1.parseExpression("'World!'");
		String str1=(String)exp1.getValue();
		System.out.println(str1);
	}
}
