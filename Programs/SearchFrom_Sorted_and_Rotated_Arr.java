// Find an element from a Sorted and Rotated array.
import java.io.*;

public class SearchFrom_Sorted_and_Rotated_Arr{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		print("Enter the array: ");
		String[] input = br.readLine().split(" ");
		int size = input.length;
		int[] arr = new int[size];

		for (int i = 0; i < size; i++)
			arr[i] = Integer.parseInt(input[i]);

		print("The array is:");
		printArr(arr);
		println();

		print("Enter the key: ");
		int key = Integer.parseInt(br.readLine());

		long startTime = System.currentTimeMillis();
		int idx = modified_BS(arr, key);
		long endTime = System.currentTimeMillis();

		if (idx == -1)
			println(key+" is not present in the array.\n");
		else
			println(key+" is present at index "+idx+" in the array.\n");

		double time = (endTime - startTime) / 1000.0;
		print("Run time in seconds was: "+time);
	}

	// This method takes O(log n)
	protected static int modified_BS(int[] arr, int key){
		int low = 0, high = arr.length - 1;
		while (low <= high){
			int mid = ((low+high)>>1);
			if (arr[mid] == key)
				return mid;
			if (arr[low] < arr[mid]){ //When Left part is sorted
				if (key >= arr[low] && key < arr[mid])
					high = mid - 1;
				else
					low = mid + 1;
			}
			else{ //When Right part is sorted
				if (key > arr[mid] && key <= arr[high])
					low = mid + 1;
				else
					high = mid - 1;
			}
		}
		return -1;
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