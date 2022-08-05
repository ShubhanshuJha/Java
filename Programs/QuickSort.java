// Efficient sorting algo because TC here is O(n log n), but in worst case it may go upto O(n^2)
// Space Complexity = O(n)
import java.io.*;

public class QuickSort{
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
		sol.quickSort(arr, 0, n - 1);
		
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
	public void quickSort(int[] arr, int lb, int ub){
		if (lb < ub) {
			int pivotIdx = partition(arr, lb, ub);
			quickSort(arr, lb, pivotIdx-1);
			quickSort(arr, pivotIdx+1, ub);
		}
	}

	private int partition(int[] arr, int lb, int ub){
		int pivot = arr[lb];
		// int pivot = arr[(lb+ub)/2];  //This is more efficient way for pivotElement
		int startIdx = lb, endIdx = ub;

		while(startIdx < endIdx){
			while(arr[startIdx] <= pivot) startIdx++;
			while(arr[endIdx] > pivot) endIdx--;
			if (startIdx < endIdx)
				swap(arr, startIdx, endIdx);
		}
		swap(arr, endIdx, lb);
		return endIdx;
	}

	// A utility function to swap two elements
	private void swap(int[] arr, int i, int j){
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}