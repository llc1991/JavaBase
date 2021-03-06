package com.llc.arithmetic;

import com.llc.lang.stack.Algs4Stack;

public class Explainer {

	public static void main(String[] args) {

		String expression = " ( 2/1)";
		Algs4Stack<Double> operandStack = new Algs4Stack<Double>();
		Algs4Stack<String> operatorStack = new Algs4Stack<String>();

		for (int i = 1; i <= expression.length(); i++) {
			String current = expression.substring(i - 1, i);
			if (!current.matches("\\s")) {
				if (current.equals("(")) {

				} else if (current.matches("[\\+\\-\\*\\/]{1}")) {
					operatorStack.push(current);
				} else if (current.equals(")")) {
					String op = operatorStack.pop();
					Double v = operandStack.pop();
					if (op.equals("+")) {
						v = operandStack.pop() + v;
					} else if (op.equals("-")) {
						v = operandStack.pop() - v;
					} else if (op.equals("*")) {
						v = operandStack.pop() * v;
					} else if (op.equals("/")) {
						v = operandStack.pop() / v;
					}
					operandStack.push(v);
				} else {
					operandStack.push(Double.parseDouble(current));
				}
			}
		}

		System.out.println(operandStack.pop());

		// .matches("[0-9]{1}");

	}
}
