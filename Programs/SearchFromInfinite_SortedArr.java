// Search element from an infinite sorted array, i.e, len(Arr) is not given/considered.
// The solution should be in O(log n).
import java.util.Scanner;
import java.util.Arrays;

public class SearchFromInfinite_SortedArr{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		print("Enter the size for the array: ");
		int size = sc.nextInt();

		long startTimeIO = System.currentTimeMillis();
		RandomInput rand = new RandomInput(size);
		int[] arr = rand.random();
		
		long endTimeIO = System.currentTimeMillis();
		// double timeIO = (endTimeIO - startTimeIO) / 1000.0;	//This shows in seconds
		// print("Input generated in "+timeIO+" seconds.\n");
		double timeIO = (endTimeIO - startTimeIO); // Time in ms
		print("Input generated in "+timeIO+" milli seconds.");
		println();

		Arrays.sort(arr);
		print("The sorted array is:\n");
		printArr(arr);
		println();

		print("Enter the key: ");
		int key = sc.nextInt();

		long startTime = System.currentTimeMillis();
		boolean isPresent = searchInfinite(arr, key);
		long endTime = System.currentTimeMillis();

		if (isPresent)
			println(key+" is present in the array.\n");
		else
			println(key+" is not present in the array.\n");

		double time = (endTime - startTime) / 1000.0;
		print("Run time in seconds was: "+time);
	}
	// This method takes O(log n)
	protected static boolean searchInfinite(int[] a, int key){
		int low = 0, high = 1;
		try {
			while(a[high] < key){ //Till now this method is not working upto the mark
				low = high;
				high = 2 * high;
			}
		} catch (Exception e){
			high = (high >> 1);
			high = (int)(1.5 * high);
		}
		return binarySearch(a, key, low, high);
	}
	// This method also takes O(log n)
	public static boolean binarySearch(int[] a, int key, int lb, int ub){
	    if(lb > ub)
	        return false;

	    int mid = ((lb+ub)>>1);
	    if(a[mid] == key)
	        return true;

	    if(key < a[mid])
	        return binarySearch(a, key, lb, mid-1);
	    else
	        return binarySearch(a, key, mid+1, ub);
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
}