package com.learn.stack;

import java.util.Stack;

public class BalancedParentheses {

	public static void main(String[] args) {
		String input = "((())){{]]}[}[[";
		
		Stack<Character> stack = new Stack<>();
		
		for (char c : input.toCharArray()) {
			if (c == '(' || c == '{' || c == '[') {
				stack.push(c);
			}
		}
		
		for (char c : input.toCharArray()) {
			if (c == ')' || c == '}' || c == ']') {
				stack.pop();
			}
		}
		
		if (stack.isEmpty()) System.out.println("Balanced");
		else System.out.println("Not Balanced");

	}

}
