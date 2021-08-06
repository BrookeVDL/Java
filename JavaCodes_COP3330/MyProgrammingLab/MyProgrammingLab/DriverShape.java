package MyProgrammingLab;


/*				~Implement the Shape hierarch~

Exercise 72032: JavaDriver.java
Author: Brooke VanDerLinden
COP 3330

Create an abstract class called Shape
	~Is parent class to TwoDimensionalShape and ThreeDimensionalShape
	
Classes Circle, Sq, and Triangle 
	~inherit from TwoDimensionalShape

Classes Sphere, Cube, and Tetrahedron
	~inherit from ThreeDimensionalShape.

Each TwoDimensionalShape must have the methods:
	~getArea() and getPerimeter(), 
		(To calculate the area and perimeter of the shape, respectively) 
Every ThreeDimensionalShape must have the methods:
	~getArea() and getVolume() 
		(To respectively calculate the surface area and volume of the shape) 

Every class should have a member variable containing its dimensions 

Create a Driver class 
	with a main method to test your Shape hierarchy. 

The program should prompt the user to enter the type of shape they'd like to create, and then the shape's dimensions. 

If the shape is two dimensional, the program should print its area and its perimeter
If the shape is three dimensional shape, its surface area and volume.
*/

//Importing Scanner for the Program
import java.util.Scanner;

//Driver Class
public class DriverShape {
	 //Declaring main method to test your Shape hierarchy
	public static void main(String[] args) {
     //Declaration of Interger that are assigned 0
	int input = 0;
    int userInput1 = 0;
    int userInput2 = 0;

	 //Calling Scanner
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter\n1)Two dimensional shape\n2)Three dimensional shape:");
    input = sc.nextInt();

    if (input == 1) {

      System.out.print("Enter\n1)Circle\n2)Sq\n3)Triangle:");
      userInput1 = sc.nextInt();

      switch (userInput1) {
      case 1:
        System.out.print("Enter radius of circle:");
        double rad = sc.nextDouble();

        TwoDimensionalShape c = new Circle(rad);

        System.out.println("Area: " + c.getArea() + " ");
        System.out.println("Perimeter: " +
          String.format("%.2f", c.getPerimeter()));
        break;

      case 2:
        System.out.print("Enter side of Sq:");
        double side1 = sc.nextDouble();

        TwoDimensionalShape s = new SquareShape(side1);

        System.out.printf("Area: %.2f \nPerimeter: %.2f", s.getArea(), s.getPerimeter());
        break;

      case 3:
        System.out.print("Enter side of triangle:");
        double s1 = sc.nextDouble();

        System.out.print("Enter side of triangle:");
        double s2 = sc.nextDouble();

        System.out.print("Enter side of triangle:");
        double s3 = sc.nextDouble();

        TwoDimensionalShape r = new Triangle(s1, s2, s3);
        System.out.println("Area: " + r.getArea() + " ");
        System.out.println("Perimeter: " + String.format("%.2f", r.getPerimeter()));
        break;

      }
    } else if (input == 2) {
      /* System.out.println("Enter");
      	System.out.println("1)Sphere");
      	System.out.println("2)Cube");
     	 System.out.println("3)Tetrahedron");*/
      System.out.print("Enter\n1)Sphere\n2)Cube\n3)Tetrahedron:");
      userInput2 = sc.nextInt();

      switch (userInput2) {
      case 1:
        System.out.print("Enter radius of sphere:");
        double radx = sc.nextDouble();

        ThreeDimensionalShape cc2 = new Sphere(radx);

        System.out.println("Surface area: " +
          String.format("%.2f", cc2.getArea()) + " ");
        System.out.println("Volume: " +
          String.format("%.2f", cc2.getVolume()));
        break;

      case 2:

        System.out.print("Enter side of cube:");
        double sx = sc.nextDouble();

        ThreeDimensionalShape cc1 = new Cube(sx);

        System.out.println("Surface area: " +
          String.format("%.2f", cc1.getArea()) + " ");
        System.out.println("Volume: " +
          String.format("%.2f", cc1.getVolume()));
        break;

      case 3:
        System.out.print("Enter side of tetrahedron:");
        double tx = sc.nextDouble();

        ThreeDimensionalShape cc3 = new Tetrahedron(tx);

        System.out.println("Surface area: " + cc3.getArea() + " ");
        System.out.println("Volume: " + cc3.getVolume());
        break;

      }
    } else {
      System.out.println("Input is invalid");
    }
    sc.close();
  }

}
/*Shape
	Abstract class Implementation 
	The parent class to TwoDimensionalShape and ThreeDimensionalShape*/
abstract class Shape {
}
 /*TwoDimensionalShape 
 	Abstract class Implementation 
	with methods getArea and getPerimeter*/ 
abstract class TwoDimensionalShape extends Shape {
	abstract double getArea(); //Method to find the area
  	abstract double getPerimeter(); //Method to find the perimeter 
}

 /*ThreeDimensionalShape
 	Abstract class Implementation
 	with methods getArea and getVolume */
abstract class ThreeDimensionalShape extends Shape {
	abstract double getArea(); //Method to find the surface area 
	abstract double getVolume(); //Method to find the volume
}

 /*Circle
 	Class Implementation
 	inherits from TwoDimensionalShape */
class Circle extends TwoDimensionalShape {
	double radius;
	
	Circle(double r) {
		radius = r;
	}
	
	public double getArea() { //Find area of Circle
		double area = Math.PI * Math.pow(radius, 2);

    return Math.round(area * 100.00) / 100.00;
  }

  public double getPerimeter() { //Find perimeter of Circle
	  double peri = 2 * Math.PI * radius;
	  	return Math.round(peri * 100.00) / 100.00;
  }
}

/*Sq
 	Class Implementation
 	inherits from TwoDimensionalShape */
public class SquareShape extends TwoDimensionalShape {
	private double side;
	
	SquareShape(double s) {
		side = s;
	}

  public double getArea() { //Find area of Sq
	  double area = Math.pow(side, 2);
      	return Math.round(area * 100.0) / 100.0;
  }

  public double getPerimeter() { //Find perimeter of Sq
    double peri = side + side + side + side;
    return Math.round(peri * 100.0) / 100.0;
  }
}

/*Triangle
 	Class Implementation
 	inherits from TwoDimensionalShape */
class Triangle extends TwoDimensionalShape {
	private double side1;
    private double side2;
    private double side3;
 
  Triangle(double s1, double s2, double s3) {
    side1 = s1;
    side2 = s2;
    side3 = s3;
  }

  public double getArea() { //Find area of Triangle
	  double s = (side1 + side2 + side3) / 2;
	  double area = Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
      	return Math.round(area * 100.0) / 100.0;
  }

  public double getPerimeter() { //Find perimeter of Triangle
	  double peri = side1 + side2 + side3;
      	return Math.round(peri * 100.0) / 100.0;
  }
}

/*Cube
 	Class Implementation
 	inherits from ThreeDimensionalShape */
class Cube extends ThreeDimensionalShape {
  private double side;
  Cube(double s) {
    side = s;
  }
  public double getArea() { //Find Surface area of Cube
		double area = 6 * Math.pow(side, 2);
        	return area;
  }

  public double getVolume() { //Find Volume of Cube
		double volume = Math.pow(side, 3);
        	return Math.round(volume * 100.00) / 100.00;
  }
}

/*Sphere
 	Class Implementation
 	inherits from ThreeDimensionalShape */
class Sphere extends ThreeDimensionalShape {
  private double radius;

  Sphere(double r) {
    radius = r;
  }

  public double getArea() { //Find Surface area of Sphere
		double area = 4 * Math.PI * Math.pow(radius, 2);
        	return Math.round(area * 100.0) / 100.0;
  }

  public double getVolume() { //Find Volume of Sphere
		double volume = (1.33333 * Math.PI * Math.pow(radius, 3));
        	return Math.round(volume * 100.0) / 100.0;
  }
}

/*Tetrahedron
 	Class Implementation
 	inherits from ThreeDimensionalShape */
class Tetrahedron extends ThreeDimensionalShape {
	private double edge;
	
	Tetrahedron(double s) {
		edge = s;
	}
	public double getArea() { //Find Surface area of Tetrahedron
		double area = Math.sqrt(3) * Math.pow(edge, 2);
        	return Math.round(area * 100.00) / 100.00;
  }

  public double getVolume() { //Find Volume of Tetrahedron
		double volume = Math.pow(edge, 3) / (6 * Math.sqrt(2));
        	return Math.round(volume * 100.00) / 100.00;
  }
}