import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ArrayList_Implementations{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Without generics
		ArrayList fruits = new ArrayList(); //created an object of ArrayList
		fruits.add("Mango");
		fruits.add("Orange");
		fruits.add(12345);
		fruits.add(12.345);
		System.out.println(fruits);

		// With generics
		ArrayList<String> fruitsName = new ArrayList();
		// Now, only String values are acceptable
		fruitsName.add("Mango");
		fruitsName.add("Orange");
		// fruits.add(12345);//This will give error now
		// fruits.add(12.345);//This will give error
		fruitsName.add("Apple");
		fruitsName.add("Banana");
		System.out.println(fruitsName);

		// We can do in this way too
		List<String> fruitsNames = new ArrayList();
		// Now, only String values are acceptable
		fruitsNames.add("Mango");
		fruitsNames.add("Orange");
		// fruits.add(12345);//This will give error now
		// fruits.add(12.345);//This will give error
		fruitsNames.add("Apple");
		fruitsNames.add("Banana");
		System.out.println(fruitsNames);
	}
}