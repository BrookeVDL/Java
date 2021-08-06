/***************************************************************************************
 * Brooke VanDerLinden
 * COP 3330
 * Final Exam Question #49
 *							 File: ArrayListApplication.java
 * 
 * This application class performs the following: 
 *	1.) Prompt user for 10 names and store in an "ArrayList" object
 *	2.) Shuffle the names using "shuffle"" method of the "Collections" class
 *	3.) Display the names based on the order of the previous step
 *
 *                 Save and upload the file as "ArrayListApplication.java"
 ****************************************************************************************
 */

 //Importing Packages 
import java.util.Scanner;		//Scans user input
import java.util.ArrayList;		//Flexible array for storing elements
import java.util.Collections;	//Shuffle method to shuffle the names


public class ArrayListApplication {
	public static void main(String[] args) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("\t\tWelcome to the Name Shuffler\r\n");
		System.out.println("\tPlease Enter 10 Names for the Application to Shuffle\r\n");
		
		 //Create String Array
		ArrayList<String> userList = new ArrayList<String>();
		for (int i = 0; i < 10; i++) {		//Loop asking for input 10 times
			System.out.printf("Input Name: ");
			String name = userInput.nextLine();
			 //Make sentence case
			name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
			userList.add(name);
			}
		
		userInput.close();	//Close Scanner 
		
		System.out.println("\t\t\nShuffling . . .\r\n");
		
		 //Shuffle the User's Names
		Collections.shuffle(userList);
		 //Print the Shuffled Names
		System.out.println("Random List of the Input Names: \n" + userList);
		}
	}