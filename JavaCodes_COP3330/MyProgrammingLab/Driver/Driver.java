package Driver;

/*Assignment 72123
	Rectangle Class with double attributes len & width
	File: Driver.java
	Author: Brooke VanDerLinden*/

import java.util.Scanner;

class Rectangle {
	//Assign length and width attributes
	private double length;
	private double width;

	//Set the default constructor to 1.0
	public Rectangle() {
		length = 1.0;
		width = 1.0;
	}

	//Method that calulates the perimeter of the rectangle
	public double findPerimeter() {
		return 2 * (length + width);
	}

	//Method that calculates the area of the rectangle
	public double findArea() {
		return length * width;
	}

	public double getLength() { //Accessor for length
		return length;
	}

	public double getWidth() { //Accessor for width
		return width;
	}

	public void setLength(double len) { //Mutator to set the length
		if (len > 0.0 && len<20.0) {
			length = len;
		}
	}

	public void setWidth(double wdt) { //Mutator to set the width
		if (wdt > 0.0 && wdt<20.0) {
			width = wdt;
		}
	}
} //End class rectangle

//Driver Class starts here
//Is the programs one public class
public class Driver {
	//Sta
	public static void main(String[] args) {

		try (//Call for the scanner
		Scanner input = new Scanner(System.in)) {
			//Create the new rectangle class
			Rectangle testRec = new Rectangle();

			//Ask user to enter a Length value
			System.out.printf("Enter length of rectangle:");
			double len = input.nextDouble();

			//Ask user to enter a Width value
			System.out.printf("Enter width of rectangle:");
			double wdt = input.nextDouble();

			testRec.setLength(len); //Set Length 
			testRec.setWidth(wdt); //Set Width

			double area = testRec.findArea(); //Find the area of the rectangle	
			double perimeter = testRec.findPerimeter(); //Find the perimeter of the rectangle 

			/*Display the area and perimeter for the rectangle
				after the program runs*/
			System.out.printf("Area: " + area + ", Perimeter: " + perimeter);
		}
	} //End main
} //End the public driver class