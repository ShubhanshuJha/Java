/*  A method is a set of statements which represents the behavior of a class. It is used to implement a specific
	functionality. In Java, every method must be part of some class. Parts of a method in Java:
	Access modifier – defines the access type of the method
	Return type – the data type of the value returned by the method or void if nothing is returned
	Method name – name of the method
	Parameters – comma separated input values passed to the method, should be () if no parameters are passed
	Method body – the code that defines the functionality of the method
The arguments passed while making the method call are known as actual parameters and the
arguments present in the method header are known as formal parameters.

Create a new class Food in the Java project SwiftFood with the details given below.
	Attributes:
		foodName: String
		cuisine: String
		foodType: String
		quantityAvailable: int
		unitPrice: double */
import mypackages.io.*;
import java.io.*;

class SwiftFood__ClassAndObject {
	static class SwiftFood {
		public String foodName, cuisine, foodType;
		public int quantityAvailable;
		public double unitPrice;
		SwiftFood(String foodName, String cuisine, String foodType, int quantityAvailable, double unitPrice) {
			this.foodName = foodName;
			this.cuisine = cuisine;
			this.foodType = foodType;
			this.quantityAvailable = quantityAvailable;
			this.unitPrice = unitPrice;
		}
		SwiftFood() {}
		@Override
		public String toString() {
			return "\tFood Name: " + foodName
					 + "\n\tCuisine: " + cuisine
					 + "\n\tFood Type: " + foodType
					 + "\n\tQuantity Available: " + quantityAvailable
					 + "\n\tUnit Price: $" + unitPrice;
		}
	}

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws IOException {
		// Declaration, Instatiation, & Initialization
		SwiftFood food1 = new SwiftFood("Chow mein", "Chinese", "Non-Veg", 25, 140);
		writer.println("Displaying the details for the 1st Food:");
		writer.println(food1.toString());

	// The new operator returns a reference to the object it created
		SwiftFood food2; // Declaration of the Object
		food2 = new SwiftFood(); // Instantiation of the object
		food2.foodName = "Sushi";
		food2.cuisine = "Japanese";
		food2.foodType = "Non-Veg";
		food2.quantityAvailable = 30;
		food2.unitPrice = 280;
		writer.println("\nDisplaying the details for the 2nd Food:");
		writer.println(food2.toString());

		SwiftFood food3 = null;
		food3 = new SwiftFood("Pizza", "Italian", "Veg", 7, 300);
		writer.println("\nDisplaying the details for the 3rd Food:");
		writer.println(food3.toString());
	}
}