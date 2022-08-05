// Using Collections.sort() to sort an array 
import java.util.*; 
public class CollectionSortForArray 
{ 
	public static void main(String[] args) 
	{ 
		// create an array of string objs 
		String domains[] = {"Practice", "Geeks", "Code", "Quiz"}; 

		// Here we are making a list named as Collist 
		List colList = new ArrayList(Arrays.asList(domains)); 

		// Collection.sort() method is used here 
		// to sort the list elements. 
		Collections.sort(colList); 

		// Let us print the sorted list 
		System.out.println("List after the use of" + " Collection.sort() :\n"+colList); 
	} 
} 
