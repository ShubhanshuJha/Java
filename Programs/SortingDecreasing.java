// A sample Java program to sort a subarray 
// in descending order using Arrays.sort(). 
import java.util.Arrays; 
import java.util.Collections; 
import java.util.Scanner;
public class SortingDecreasing 
{ 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the number of elements: ");
		// Note that we have Integer here instead of 
		// int[] as Collections.reverseOrder doesn't 
		// work for primitive types.
		int n=sc.nextInt();
		Integer[] arr = new Integer[n];
		for (int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}

		// Sorts arr[] in descending order 
		Arrays.sort(arr, Collections.reverseOrder()); 

		System.out.printf("Modified arr[] : %s", 
						Arrays.toString(arr)); 
	} 
} 
