package DriverHours;

/*				~ HourlyEmployee class that inherits from Employee~

Exercise 72029: Driver.java
Author: Brooke VanDerLinden
COP 3330

Create an HourlyEmployee class that 
	~ inherits from Employee 
	~ has two new instance variables(Both are doubles): 
		~ hours, represents the hours worked  
		~ wage, represents the employee's pay per hour  
		
Create a constructor that takes the arguments 
	~ first name 
	~ last name 
	~ social security number 
	~ hourly wage
	~ number of hours worked 
	
create accessors, mutators, an earnings method that 
	returns the money earned by the employee this week

toString method that returns information about the employee 
	in the form of a String

setWage method should ensure that the wage is nonnegative, 

setHours method should ensure that the value of hours is 
	between 0 and 168 (the number of hours in a week)

Create a Driver class 
	~ with a main method that prompts the user to enter a 
		~ first name
		~ last name 
		~ social security number
		~ hours 
		~ wage for an employee 

Last Program should create an HourlyEmployee object and 
	use its toString method to print information about it.
*/

 //Importing scanner utility
import java.util.Scanner;

 //Driver Class
class DriverHourly {
	public static void main(String args[]) {
		
		try (//Calling the Scanner Utility
		Scanner scanner = new Scanner(System.in)) {
			System.out.print("Enter first name:");				//Prompt User for first name
			String firstName = scanner.next();
			System.out.print("Enter last name:");				//Prompt User for last name 
			String lastName = scanner.next();
			System.out.print("Enter social security number:");  //Prompt User for social security number
			String socialSecurityNumber = scanner.next();
			System.out.print("Enter hours worked:");			//Prompt User for hours 
			double hours = scanner.nextDouble();
			System.out.print("Enter wage:");					//Prompt User for employee wage
			double wage = scanner.nextDouble();
			
			//Create an HourlyEmployee object
			HourlyEmployee info = new HourlyEmployee(firstName, lastName, socialSecurityNumber, hours, wage);
			        // print information
				System.out.print(info.toString());
		}
	}
}
		
//Implementing Employee Class
class Employee {
	private String firstName;
	private String lastName;
	private String socialSecurityNumber;
	
//Costructor
	public Employee(String firstName, String lastName, String socialSecurityNumber) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.socialSecurityNumber = socialSecurityNumber;
	}
	
//Set Methods
	public void setFirstName(String firstName) {	//Set firstName
		this.firstName = firstName;
	}
		 
	public void setLastName(String lastName) {		//Set lastName
		this.lastName = lastName;
	}

	public void setSocialSecurityNumber(String socialSecurityNumber) {
		this.socialSecurityNumber = socialSecurityNumber; 	//Set socialSecurityNumber
	}
	
//Get Methods
	public String getFirstName() {		//Get firstName
		return firstName;
	}
	
	
	public String getLastName() {		//Get lastName
		return lastName;
	}
	
	
	public String getSocialSecurityNumber() {	//Get socialSecurityNumber
		return socialSecurityNumber;
	}
	
 //convert to String in standard
	public String toString(){
		return String.format("%s: %s %s%n%s: %s",
			"employee", getFirstName(), getLastName(),
			"social security number", getSocialSecurityNumber());
	}
}

//Implement an HourlyEmployee class 
class HourlyEmployee extends Employee {		//inherits from Employee class
	//Declare the instance variables
	private double hours;
	private double wage;
	
	//constructor 
	public HourlyEmployee(String firstName, String lastName, 
						  String socialSecurityNumber, double hours, double wage) {
		super(firstName, lastName, socialSecurityNumber);
		this.hours = hours;
		this.wage = wage;
	}
	
	//Set Methods
	public void setHours(double hours) {	//Set hours
		if (hours >= 0 && hours <= 168)
			this.hours = hours;				//ensure hours are between 0 and 168								
		else
			this.hours = 0;
	}
	
	public void setWage(double wage) {		//Set wage
		if (wage >= 0)
			this.wage = wage;				//ensure that the wage is nonnegative
		else
			this.wage = 0;
	}
	
	//Get Methods
	public double getHours() {				//Get hours
		return this.hours = hours;
	}
	
	public double getWage() {				//Get wage
		return this.wage = wage;
	}
	//Method to return earning
    public double earnings() {
		return this.wage * this.hours;
	}
	
	//Method to return string
	public String toString(){
		return String.format("hourly %s\n%s: %.1f \n%s: %.2f \n%s: %.2f",
			super.toString(),
			"hours", getHours(), 
			"wage", getWage(), 
			"earnings", earnings());
	}
}