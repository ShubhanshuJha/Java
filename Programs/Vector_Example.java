import java.util.Vector;
import java.util.List;
import java.util.Scanner;

public class Vector_Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();
		// Vector<Integer> v = new Vector();
		Vector<Integer> v = new Vector<>();
		// Vector v = new Vector(n, 1);
		// Vector<Integer> v=new Vector<>(n, 1);
        
		// v.add(11);
		// v.add(13);
		// v.add(15);
		// v.add(17);
		// v.add(19);
		for (int i = 1; i <= n; i = i + 2) {
			if (i > n)
				continue;
			v.add(i);
		}

		System.out.println("Displaying the elements in Vector:\n"+v);
		System.out.println("Size of the Vector is: "+v.size());
	}
}