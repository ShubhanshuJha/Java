import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayList_Methods{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> fruits = new ArrayList();

		// .add() method
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Cucumber");
		System.out.println("Current fruit list:\n"+fruits);

		List<String> vegetables = new ArrayList();
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Carrot");
		System.out.println("Current vegetables list:\n"+vegetables);

		// We now want insertion of item at specific index, so we use
		// .add() method
		System.out.println("Enter the index for the insertion:");
		int index = sc.nextInt();
		System.out.println("Enter the value you want to insert:");
		String newValue = sc.next();
		vegetables.add(index, newValue);
		System.out.println("Current vegetables list:\n"+vegetables);

		// We now want to add all fruits to vegetables, so we use
		// .addAll() method
		vegetables.addAll(fruits);
		System.out.println("Current vegetables list:\n"+vegetables);

		// We want to get item stored at specific index in vegetables list, so we use
		// .get() method
		System.out.println("Enter the index value: ");
		index = sc.nextInt();
		// If we give index value beyond index range of vegetables list, then it'll give
		// IndexOutOfBoundsException
		System.out.println("Item stored at "+index+" in vegetables list is "+vegetables.get(index));

		// We want to update an item stored at specific index in vegetables list, so we use
		// .set() method
		System.out.println("Enter the index value you want to update: ");
		index = sc.nextInt();
		System.out.println("Enter the value you want to update with: ");
		newValue = sc.next();
		// If we give index value beyond index range of vegetables list, then it'll give
		// IndexOutOfBoundsException
		vegetables.set(index, newValue);
		System.out.println("Current vegetables list:\n"+vegetables);

		// We want to remove an item stored at specific index in vegetables list, so we use
		// .remove() method
		System.out.println("Enter the index value you want to remove: ");
		index = sc.nextInt();
		// If we give index value beyond index range of vegetables list, then it'll give
		// IndexOutOfBoundsException
		vegetables.remove(index);
		System.out.println("Current vegetables list:\n"+vegetables);

		// We want to remove a particular collections from vegetables list, so we use
		// .removeAll() method

		vegetables.removeAll(fruits);
		System.out.println("Current vegetables list after removing fruits list:\n"+vegetables);

		// We want to remove all items from vegetables list, so we use
		// .clear() method
		vegetables.clear();
		System.out.println("Current vegetables list after removing all items:\n"+vegetables);

		// We want to get size of fruits list, so we use
		// .size() method
		System.out.println("Size of the fruits list is :\n"+fruits.size());

		// We want to check if a particular item exists in our list or not, so we use
		// .contains() method
		// This will return Boolean value
		System.out.println("Is Guava present is the fruits list :\n"+fruits.contains("Guava"));
		System.out.println("Is Apple present is the fruits list :\n"+fruits.contains("Apple"));

		// We want to check if our list is empty or not, so we use
		// .isEmpty() method
		// This will return Boolean value
		System.out.println("Is fruits list empty? :\n"+fruits.isEmpty());
		System.out.println("Is vegetables list empty? :\n"+vegetables.isEmpty());

		// We want to convert our fruits list to an array, so we use
		// .toArray() method
		// This will return an array
		// Object frt[] = fruits.toArray();

		// Here, it will give us array of any Object.
		// But, we know we want String array, so we use this method
		String frts_str[] = new String[fruits.size()];
		fruits.toArray(frts_str);
		System.out.println("Displaying the elements of Fruits array:");
		for (String s : frts_str) {
			System.out.println(s);
		}

		// We can use for each loop in ArrayList as well
		System.out.println("Displaying the elements of Fruits list:");
		for (String s : fruits) {
			System.out.println(s);
		}
	}
}