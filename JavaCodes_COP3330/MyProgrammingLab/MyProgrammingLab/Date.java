package MyProgrammingLab;
	/*		
	  Author: Brooke VanDerLinden
	  Date 5/20/2021
	  Course: COP3330
	  Exercise 72005 java Date.java
	 	 Class (Date Class) with 3 instance variables (type int)
	   		 Plus main method to show class Date's capibilities 
			 Month, Day, Year
	     Provid set and get method for each
	         Displayed Month/Day/Year
	     Provide Constructor to 
	         Initialize instances and 
	         Assumes values provided are correct
			 													*/
	// Filename: Date.java

	import java.util.Scanner;

	//Class Declaration
	public class Date {
	  //Declare three instance variables
	  private int month;
	  private int day;
	  private int year;

	  //Account constructor that recieves three parameters
	  public Date(int month, int day, int year) {
	    this.month = month; //Assign Month to instance variable month
	    this.day = day; //Assign Day to instance variable day
	    this.year = year; //Assign Year to instance variable year
	  }

	  //Method to set the month in the date
	  public void setMonth(int month) {
	    this.month = month; //Store the month 
	  }

	  //Method to retrieve the month from the date
	  public int getMonth() {
	    return month; // Return the value for the month
	  }

	  //Method to set the day in the date
	  public void setDay(int day) {
	    this.day = day; //Store the day 
	  }

	  //Method to retrieve the day from the date
	  public int getDay() {
	    return day; // Return the value for the day
	  }

	  //Method to set the year in the date
	  public void setYear(int year) {
	    this.year = year; //Store the year
	  }

	  //Method to retrieve the year from the date
	  public int getYear() {
	    return year; // Return the value for the year
	  }

	  public void displayDate() {
	    System.out.printf("The Date object's state is: %d/%d/%d%n", getMonth(), getDay(), getYear());
	  }

	  public static void main(String[] args) {

	    try (//Scanner to obtain input from the command window
		Scanner scan = new Scanner(System.in)) {
			Date date = new Date(0, 0, 0);
			System.out.printf("Enter the month, day and year in the form XX XX XXXX and hit enter:");
			  int month = scan.nextInt();
			    date.setMonth(month);
			  int day = scan.nextInt();
			    date.setDay(day);
			  int year = scan.nextInt();
			    date.setYear(year);
			  
			date.displayDate();

			System.out.printf("Enter a new year:");
			  year = scan.nextInt();
			   date.setYear(year);
			  
			date.displayDate();

			System.out.printf("Enter a new day:");
			  day = scan.nextInt();
			   date.setDay(day);
			  
			date.displayDate();

			System.out.printf("Enter a new month:");
			  month = scan.nextInt();
			    date.setMonth(month);
			date.displayDate();
		}

	    //Assinging new date object	

		  
	  }
	}

	
