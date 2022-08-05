import java.util.Map;
import java.util.HashMap;
import java.util.Set;
import java.util.Map.Entry;

public class Map_Example{
	public static void main(String[] args) {
		Map<String, Integer> number = new HashMap<>();
		number.put("Zero", 0);
		number.put("One", 1);
		number.put("Two", 2);
		number.put("Three", 3);
		number.put("Four", 4);
		number.put("Five", 5);
		// number.put("Six", 6);
		// number.put("Seven", 7);
		// number.put("Eight", 8);
		// number.put("Nine", 9);
		// number.put("Ten", 10);
		number.put("Hundred", 100);
		System.out.println(number);
		// Here, the values at the keys will get updated
		number.put("Five", -5);
		number.put("Four", 40);
		System.out.println(number);
		// This will insert the value at key, if the key isn't already in the Map.
		// If present, then it'll not do insertion.
		number.putIfAbsent("One", 1);
		number.putIfAbsent("Two", 10);
		number.putIfAbsent("Twenty", 20);
		System.out.println(number);
		// This will return the value corres. to the key input.
		System.out.print(number.get("Five")+" ");
		System.out.println(number.get("One"));
		// Returns null, if the key isn't valid.
		System.out.println(number.get("Nine"));
		// Implementing putAll() method
		Map<String, Integer> numberMap2 = new HashMap<>();
		numberMap2.putAll(number);
		System.out.println("Displaying elements in the numberMap2:\n"+numberMap2);
		// Implementing containsKey() and containsValue() methods.
		System.out.println(numberMap2.containsKey("One"));
		System.out.println(numberMap2.containsKey("Nine"));
		System.out.println(numberMap2.containsValue(40));
		System.out.println(numberMap2.containsValue(6));
		// Implementing remove() method.
		System.out.println(numberMap2.remove("Four"));
		// keySet() method
		System.out.println("Keys are: "+number.keySet());
		// values() method
		System.out.println("Values are: "+number.values());
		// entrySet() method
		System.out.println("Entries are: "+number.entrySet());

		// Iterating over entries of a Map.
		Set<Entry<String, Integer>> entries = number.entrySet();
		// System.out.println("Iteration over entries of the number Map:");
		for (Entry<String, Integer> entry : entries) {
			// I want to multiply each value of entry by 5.
			entry.setValue(entry.getValue() * 5);
			// System.out.println(entry);
		}
		System.out.println("Now the number Map is:\n"+number);
	}
}