// This works on Divide And Conquer technique 
// One of the most efficient sorting algo because TC is O(n log n) in all cases
// Space Complexity = O(n)

import java.io.*;

public class MergeSort{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter the array: ");
		String[] input = br.readLine().split(" ");
		int n = input.length;
		int[] arr = new int[n];

		for (int i=0; i<n; i++)
			arr[i] = Integer.parseInt(input[i]);

		System.out.println("Given array is:");
		printArray(arr, n);

		Solution sol = new Solution();
		sol.mergeSort(arr, 0, n - 1);
		
		System.out.println("Sorted array is: ");
		printArray(arr, n);
	}
	// Function to print an array
	public static void printArray(int[] arr, int size){
		for(int i = 0; i < size; i++)
			System.out.print(arr[i] + " ");
			
		System.out.println();
	}
}
class Solution{
	public void mergeSort(int[] arr, int lb, int ub){
		if (lb < ub) {
			int midIdx = (lb+(ub-1))/2;
			mergeSort(arr, lb, midIdx);
			mergeSort(arr, midIdx+1, ub);
			merge(arr, lb, midIdx, ub);
		}
	}

	private void merge(int[] arr, int lb, int mid, int ub){
		// Find sizes of two subarrays to be merged
        int n1 = mid - lb + 1;
        int n2 = ub - mid;
 
        /* Create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];

        /*Copy data to temp arrays*/
        for (int i = 0; i < n1; ++i)
            L[i] = arr[lb + i];
        for (int j = 0; j < n2; ++j)
            R[j] = arr[mid + 1 + j];

        // Initial indexes of first and second subarrays
        int i = 0, j = 0, k = lb;

		while (i < n1 && j < n2) {
            if (L[i] <= R[j]) {
                arr[k] = L[i];
                i++;
            }
            else {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
 
        /* Copy remaining elements of L[] if any */
        while (i < n1) {
            arr[k] = L[i];
            i++;
            k++;
        }
 
        /* Copy remaining elements of R[] if any */
        while (j < n2) {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
}