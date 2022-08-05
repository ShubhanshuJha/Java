import java.util.Scanner;

public class Block_Implementation{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter two values: ");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		{
			System.out.print("The given values are: ");
			System.out.println(a+" "+b);
		}
		{ // This block exchanges the values of x and y
			int temp; // A temporary variable for use in this block.
			temp = a; // Save a copy of the value of x in temp.
			a = b; // Copy the value of y into x.
			b = temp; // Copy the value of temp into y.
		}
		{
			System.out.print("Now the values are: ");
			System.out.println(a+" "+b);
		}
		// System.out.println("Value stored int temp variable is "+temp); //This will produce error
	}
}