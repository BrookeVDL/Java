/***************************************************************************************
 * Brooke VanDerLinden
 * COP 3330
 * Final Exam Question #50
 *							 File: Cuboid.java
 * 
 * 	Write A class, "Cuboid" that implements the "Comparable" interface. 
 *  - The class contains:
 *   	- height
 *  	- width 
 *  	- depth attributes (type "double")
 *  	- a constructor
 *  	- accessor and mutator methods for each of the attributes. 
 *  
 * Add a "main" method that performs the following
 *	1.) Add 3 objects of the "Cuboid" type to a Collection (e.g., List). Don't 
 *		ask the user to enter the dimensions. Just hard code them in your program 
 *		as shown below. 
 *	2.) Sort the list.  (i.e., will order the elements  based on the method 
 *		implemented to satisfy the "Comparable" interface) 
 *	3.) Use an iterative structure to display the elements.
 *
 * Use the following dimensions:
 *	   Cuboid cuboid1(2,2,2);
 *	   Cuboid cuboid2(1,2,5);
 *	   Cuboid cuboid3(1,1,7);
 *
 *                 Save and upload the file as "Cuboid.java"
 ****************************************************************************************
 */

 //Importing Packages 
import java.util.ArrayList;		//Flexible array for storing elements
import java.util.Collections;	//sort method to sort the list

 //Implementing the Comparable interface 
public class Cuboid implements Comparable<Cuboid> {
	
	private double height; 
	private double width; 
	private double depth;
	
	public Cuboid(double height, double width, double depth) {
		this.height = height;
	    this.width = width;
	    this.depth = depth;
	    }
	@Override
	public int compareTo(Cuboid o) {
		return (int) (height * width * depth - o.height * o.depth * o.depth);
		}
	
	public void setHeight(double height) {
		this.height = height;
		}

	public void setWidth(double width) {
		this.width = width;
		}
	
	public void setDepth(double depth) {
		this.depth = depth;
		}
	
	@Override
	public String toString() {
		return "Cuboid {" + "Height = " + height + ", Width = " + width + ", Depth = " + depth + ", Volume: " + height * width * depth + '}';
	    }
	    
	    public static void main(String[] args) {
	    	Cuboid cuboid1 = new Cuboid(2, 2, 2);
	    	Cuboid cuboid2 = new Cuboid(1, 2, 5);
	    	Cuboid cuboid3 = new Cuboid(1, 1, 7);
	    	
	        ArrayList<Cuboid> cuboidList = new ArrayList<>();
	        for (int i = 0; i < 1; i++) {
	        cuboidList.add(cuboid1);
	        cuboidList.add(cuboid2);
	        cuboidList.add(cuboid3);
	       
	      }
	        
	        System.out.println("\t\tWelcome to the Cuboid Application");
	        System.out.println("\tA Cuboid is a cube that may or may not have equavilant edges"); 
	        System.out.println("This Application adds & sorts 3 objects of the Cuboid type to a Collection.\n");

	        System.out.println("Unsorted Cuboid Elements:");
	        for (Cuboid cuboid : cuboidList) {
	            System.out.println(cuboid);
	        }
	        Collections.sort(cuboidList);
	        System.out.println("\nCuboid Elements sorted by Volume: ");
	        	 for (Cuboid cuboid : cuboidList) {
	        		System.out.println(cuboid);
	        		}
	    }
}
	  