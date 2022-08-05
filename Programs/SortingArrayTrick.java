// A sample Java program to sort an array of integers 
// using Arrays.sort(). It by default sorts in 
// ascending order 
import java.util.Arrays; 
import java.util.Scanner;
public class SortingArrayTrick 
{ 
	public static void main(String[] args) 
	{ 
		Scanner sc=new Scanner(System.in);
		System.out.printf("Enter the number of elements: ");
		int n=sc.nextInt();
		int[] arr = new int[n];
		for (int i=0;i<n;i++) {
		 	arr[i]=sc.nextInt();
		}
		System.out.print("Enter 1 for Periodic Sorting.\nEnter 2 for Full Sorting.");
		int sel=sc.nextInt();
		if(sel==1){
		// Periodic Sorting
		System.out.println("Enter the values in between you want to sort: ");
		int a=sc.nextInt();
		int b=sc.nextInt();
		Arrays.sort(arr, a, b); 
        System.out.printf("Modified arr[] : %s", 
                          Arrays.toString(arr));
    	}
    	else if (sel==2) {
        // Full Sorting
		Arrays.sort(arr); 

		System.out.printf("Modified arr[] : %s", 
						Arrays.toString(arr));
		}
		else System.exit(0);
	} 
} 
