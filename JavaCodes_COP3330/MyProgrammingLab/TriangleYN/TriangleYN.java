package TriangleYN;
/*		
Author: Brooke VanDerLinden
Date 5/20/2021
Course: COP3330
Exercise 72009 TriangleYN.java
	 Application that reads three nonzero values from user
	    Determines and prints if the could represent sides of a triangle 
		 													*/
//Filename: TriangleYN.java

import java.util.Scanner;   // Program ises class scanner

public class TriangleYN {
	
 public static void main(String[] args) {
	   try (//Create scanner to get input from user
	Scanner input = new Scanner(System.in)) {
		//Prompt user for input 
		   System.out.print("Enter three sizes, separated by spaces(decimals values are acceptable):");
		   double a = input.nextDouble();
		   double b = input.nextDouble();
		   double c = input.nextDouble();

		   if(((a+b)>c) && ((b+c)>a) &&((a+c)>b)) {
				System.out.printf("A triangle could measure %.2f, %.2f, by %.2f.",a,b,c);
			}
			else 
			{
			   System.out.printf("A triangle could not measure %.2f, %.2f, by %.2f.",a,b,c);
			}
	}
	}
}

