import java.util.Set;
import java.util.HashSet;

public class Set_Example{
	public static void main(String[] args) {
		Set<String> fruits = new HashSet<>();
		// Here, HashSet use HashMap Data Structure, which stores
		// a value with respect to a specific key value.
		fruits.add("Apple");
		fruits.add("Mango");
		fruits.add("Banana");
		fruits.add("Kiwi");
		System.out.println("Current fruits set is:\n"+fruits);
		// add() returns Boolean value
		System.out.println("Is Kiwi not present in fruits: "+fruits.add("Kiwi"));
		System.out.println("Is Orange not present in fruits: "+fruits.add("Orange"));
		// We observe that place of item in the Set is different from our input sequence.
		// This difference is because of HashSet.
		// If we've used LinkedHashSet<>(), instead of HashSet<>(), then the items are stored
		// with the same sequence.
		// If we've want to store items in sorted order, then we will use
		// TreeSet<>().
		System.out.println("Current fruits set is:\n"+fruits);

		// Performing Union & Intersection
		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(1);
		x.add(5);
		x.add(15);
		System.out.println("Elements in Set X is:\n"+x);
		Set<Integer> y = new HashSet<>();
		y.add(9);
		y.add(20);
		y.add(1);
		y.add(15);
		System.out.println("Elements in Set Y is:\n"+y);
		// x.addAll(y);
		// System.out.println("Union of X and Y is:\n"+x);
		x.retainAll(y);
		System.out.println("Intersection of X and Y is:\n"+x);
		// To check if X is a subset of Y
		System.out.println("Is X a subset of Y: "+x.containsAll(y));
	}
}