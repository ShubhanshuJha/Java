import java.util.Scanner;
import java.util.Arrays;

public class LinearSearch_Analysis{
	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();

		Scanner sc=new Scanner(System.in);
		print("Enter the size for the array: ");
		int size = sc.nextInt();

		long startTimeIO = System.currentTimeMillis();
		RandomInput rand = new RandomInput(size);
		int[] arr = rand.random();
		long endTimeIO = System.currentTimeMillis();
		double timeIO = (endTimeIO - startTimeIO) / 1000.0;
		print("Input generated in "+timeIO+" seconds.\n");
		println();

		// print("Array before sorting:");
		// printArr(arr);
		// println();

		Arrays.sort(arr);  //The data are now in sorted order
		// print("\nArray after sorting:");
		// printArr(arr);
		// println("\n");

		print("Enter the key to search in array: ");
		int key = sc.nextInt();

		long startTimeBS = System.currentTimeMillis();
		boolean isPresent = linearSearch(arr, key, size);
		long endTimeBS = System.currentTimeMillis();
		double timeBS = (endTimeBS - startTimeBS) / 1000.0;

		if(isPresent)
	        print(key+" found in the array.\n");
	    else
	        print(key+" not found in the array.\n");

	    
	    print("Linear Search performed in "+timeBS+" seconds.\n\n");

		long endTime = System.currentTimeMillis();
		double time = (endTime - startTime) / 1000.0;
		print("Run time in seconds was: "+time);
	}
	protected static void print(String s){
		System.out.print(s);
	}
	protected static void println(){
		System.out.println();
	}
	protected static void println(String s){
		System.out.println(s);
	}
	protected static void printArr(int[] arr){
		for (int i=0; i<arr.length; i++) {
			if (i % 100 == 0)
				println();
			print(arr[i]+" ");
		}
	}
	public static boolean linearSearch(int[] a, int key, int n){
	    for (int i=0; i<n; i++){
	    	if (a[i] == key) {
	    		return true;
	    	}
	    }
	    return false;
	}
}