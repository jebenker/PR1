package uebung4;

import java.util.*;

public class Main {

	public static void main(String[] args) {

		// an object of the class Stack is implement as 'myStack'
		Stack myStack = new Stack();

		System.out.println("Bitte geben Sie eine Klammerfolge ein, die zu überprüfen ist: ");

		// instantiate a scanner object
		Scanner sc = new Scanner(System.in);
		String eingabe = sc.next();

		// for-loop to check up the brackets
		for (int i = 0; i < eingabe.length(); i++) {

			/*
			 * charAt()-method checks a string character for character. The characters are
			 * stored in a.
			 */
			char a = eingabe.charAt(i);

			// brackets which open are pushed in myStack
			if (a == '(' || a == '{' || a == '[') {
				myStack.push(eingabe.charAt(i));

			}

			// brackets which close will be checked
			else if (a == ')' || a == '}' || a == ']') {

				char b = myStack.pop();

				/*
				 * If the open parenthesis has a matching closing parenthesis, then they are
				 * deleted from the stack.
				 * 
				 */
				if (a == ')' && b == '(') {

				} else if (a == '}' && b == '{') {

				} else if (a == ']' && b == '[') {
				}

				// if there are a matching problem you get error message
				else {
					System.out.println("Klammerfehler!");
				}
			}
		}

		// If a parenthesis remains in the stack, there should also be an error message.
		if (myStack.pop() != 0) {
			System.out.println("Klammerfehler!");
		}
		sc.close();
	}
}