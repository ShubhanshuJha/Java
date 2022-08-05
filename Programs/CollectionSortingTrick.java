// Java program to demonstrate working of Collections.sort() 
import java.util.*; 

public class CollectionSortingTrick
{ 
	public static void main(String[] args) 
	{
		
		// Create a list of strings 
		ArrayList<String> al = new ArrayList<String>(); 
		al.add("I am Shubhanshu"); 
		al.add("Friends"); 
		al.add("Dear"); 
		al.add("Hi"); 
		al.add(" My");
		al.add("Jha");

		/* Collections.sort method is sorting the 
		elements of ArrayList in ascending order. */
		Collections.sort(al); 

		// Let us print the sorted list 
		System.out.println("Ascending ordered list of" + 
						" Collection.sort() :\n" + al);
		/* Collections.sort method is sorting the 
        elements of ArrayList in ascending order. */
        Collections.sort(al, Collections.reverseOrder()); 
  
        // Let us print the sorted list 
        System.out.println("\nDescending ordered list of" + 
                           " Collection.sort() :\n" + al);  
	} 
} 
