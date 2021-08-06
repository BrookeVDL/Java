package MyProgrammingLab;

/*Assignment 72020
Written by: Brooke VanDerLinden*/
/*This Application takes 5 number inputs between 10 and 100
It then:
- Reads and displays each if not a duplicate,
- Provides "worst case" where all are different,
- Uses the smallest possible array to complete,
- Displays the complete set of unique values input
after the user enters each new value*/
//filename: DuplicateElimination.java
//Program takes an array as input from it's user

import java.util.Scanner;

public class DuplicateElimination {

		
	public static boolean  isDuplicate(int x, int[] y) {
		boolean isDuplicate =  false;
		for (int i = 0; i < y.length; i++) {
			if (y[i] == x) {
				isDuplicate = true;
		   }
	     }
		return isDuplicate;
	  }

	public static int[] append(int x, int[] y) {
		int len = y.length +1;
		int[] tempArray = new int[len];
		for(int i=0; i<y.length; i++) {
			tempArray[i] = y[i];
		}
		tempArray[y.length] = x;
		return tempArray;
	}
	
	
	/*Main method, begins execution
	   of Java DuplicateElimination Application*/
 	public static void main(String[] args) { 
		
    	try (Scanner input = new Scanner(System.in)) {
			/*Declares variable array and
			    initializes it with array object*/
			int[] uniqueValues = new int[1];	
			uniqueValues[0] = 0;
			
			System.out.print("Enter an integer between 10 and 100:");
			int inputNum = input.nextInt();

			System.out.printf("This is the first time %d has been entered\n", inputNum); 
			uniqueValues[0] = inputNum;
			
			for(int i = 0; i<4; i++) {
				System.out.print("Enter an integer between 10 and 100:");
				inputNum = input.nextInt();

				if(isDuplicate(inputNum, uniqueValues) == false) {
					System.out.printf("This is the first time %d has been entered\n", inputNum);     
					uniqueValues = append(inputNum, uniqueValues);

				}
			}

			 System.out.printf("The complete set of unique values entered is:\n");
			for(int i=0;i<uniqueValues.length;i++){
			    System.out.printf("Unique Value %d: is %d\n", +(i+1), uniqueValues[i]);
			}
		}
    }
}