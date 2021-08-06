package MyProgrammingLab;

//Exercise 72037: Driver.java
	//Author: Brooke VanDerLinden
	//COP 3330
	/*
		Define class InvalidSideException
			- inherits from the Exception class
			
		Define class Square
			1* Method variable sideLength 
				to describe side length
			Constructor that takes one argument that if 
				is not greater than 0 it should throw an 
				InvalidSideError
			Method getArea()
				Returns the area of the Square
			
		Define class Driver
			Main method, public
			Prompt user to enter a value for side length
			Creates a square object with that value 
			If valid
				Program prints square area
			If not valid
				Program willcatch the InvalidExceptionError, 
				print "Side length must be greater than 0.", 
				and terminate the program.
		*/

import java.util.Scanner;


//Define class InvalidSideException
class InvalidSideException extends Exception {
	private static final long serialVersionUID = 1L;
	InvalidSideException(String fail) {
		super(fail);
		}
	}
			  
//Define class Square
class Square {
	int lenSqSide;  //Method variable describing the squares side length 
	

	
 Square (int lenSqSide) throws InvalidSideException {
		if(lenSqSide <= 0) {
			throw new InvalidSideException("Side length must be greater than 0.");
		
		} else {
				this.lenSqSide = lenSqSide;
		}
	}
		//Method to return the area of the Square
		public int calculateArea() {
			return lenSqSide * lenSqSide;
		}
}
	
//Define class Driver
public class Driver2 {
	public static void  main(String[] args) {
		
		Scanner input = new Scanner(System.in); //Call for Scanner
			System.out.print("Enter side length of square:");
			int lenSqSide = input.nextInt();
		try {
			
				Square buildSquare = new Square(lenSqSide);	
	
			
				
			System.out.println(buildSquare.calculateArea());
		
			}catch (InvalidSideException ex) 
		{
			System.out.println(ex.getMessage());
			
input.close();		}
	}
}