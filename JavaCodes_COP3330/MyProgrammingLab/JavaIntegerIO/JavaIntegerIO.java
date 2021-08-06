package JavaIntegerIO;

// Exercise 72000: Arithmetic.java
// Author: Brooke VanDerLinden
// Date: 5/18/2021
// Course: COP 3330
// Writing a program that asks user for 2 integers
// Prints their sum, product, difference and quotient

import java.util.Scanner;  // Program uses Scanner
public class JavaIntegerIO {
	  public class integerIO {
		  // Declare main method that starts program
		  public static void main(String[] args) {
		    try (// Make Scanner to get input from command line
			Scanner input = new Scanner(System.in)) {
				System.out.print("Enter first integer: "); // Prompt
				int number1 = input.nextInt();  // Read the users first integer 
				  
				System.out.print("Enter second integer: "); // Prompt
				int number2 = input.nextInt(); // Read the users second integer
				  
				int sum = number1 + number2; // Add numbers, Store sum
				int product = number1 * number2; // Multiply numbers, store product
				int difference = number1 - number2; // Subtract numbers, store difference
				int quotient = number1 / number2; // Divide numbers, store quotient
				  
				System.out.printf("%d+%d=%d%n", number1, number2, sum); // Display the sum
				System.out.printf("%d*%d=%d%n", number1, number2, product); // Display the product
				System.out.printf("%d-%d=%d%n", number1, number2, difference); // Display the difference
				System.out.printf("%d/%d=%d%n", number1, number2, quotient); // Display the quotient
			}
		  } // End method main
	  } // End class Arithmetic
}
