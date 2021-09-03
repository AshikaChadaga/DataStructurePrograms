package com.bridgelabz.datastructureprograms;

import java.util.Scanner;

import com.bridgelabz.mydatastructure.MyNode;
import com.bridgelabz.mydatastructure.Stack;

public class BalancedParanthesis {

	static boolean isBalanced(String expression) {

		Stack<Character> stackList = new Stack<Character>();

		char expressionArray[] = expression.toCharArray();
		int lengthOfarray = expression.length();
		int countOfOpenBrackets = 0;
		int countOfClosedBrackets = 0;

		for (int index = 0; index < lengthOfarray; index++) {
			if (expressionArray[index] == '(') {
				MyNode<Character> bracket = new MyNode<Character>(expressionArray[index]);
				stackList.push(bracket);

				countOfOpenBrackets++;
			} else if (expressionArray[index] == ')') {
				stackList.pop();
				countOfClosedBrackets++;
			}
		}
		if (countOfOpenBrackets == countOfClosedBrackets) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Enter the aithmetic expression :");
		String expression = scannerObject.nextLine();

		if (isBalanced(expression))
			System.out.println("Expression is balanced");
		else {
			System.out.println("Expression is not Balanced");
		}
		scannerObject.close();

	}

}
