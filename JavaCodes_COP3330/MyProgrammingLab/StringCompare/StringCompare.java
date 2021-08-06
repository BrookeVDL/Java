package StringCompare;

/*				~String method regionMatches~

Exercise 72040: StringCompare.java
Author: Brooke VanDerLinden
COP 3330

	This program uses String method regionMatches to 
		~Compare two strings input by the user
	The program should prompt the user to enter 
		~two strings  
		~starting index in the first string 
		~starting index in the second string  
		~the number of characters to be compared 
	The program should print whether or not the strings are equal 
		(Ignore the case of the characters during comparison.)
*/

//Importing Scanner for the Program
import java.util.Scanner;

 //Program that uses String method regionMatches
public class StringCompare {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			/*Prompting the user*/
			System.out.print("Enter first string:");	//Enter First String
			String firstString = scanner.nextLine(); 
			
			System.out.print("Enter second string:");	//Enter Second String
			String secondString = scanner.nextLine(); 
			
			System.out.print("Enter starting index for first string:");	//Enter starting index in the first string 
			int string1StartingIndex = scanner.nextInt(); 
			
			System.out.print("Enter starting index for second string:");	//Enter starting index in the second string 
			int string2StartingIndex = scanner.nextInt(); 
			
			System.out.print("Enter number of characters to be compared:");	//Enter the number of characters to be compared 
			int stringComparison = scanner.nextInt(); 

			/*Printing whether or not the strings are equal */
			boolean results = firstString.regionMatches(true, string1StartingIndex, secondString, string2StartingIndex, stringComparison);

			if (results)
				System.out.println(true);
			else
				System.out.println(false);
		}
	}
}