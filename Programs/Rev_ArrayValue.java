import java.io.*;

public class Rev_ArrayValue{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the size of the array: ");
		int n = Integer.parseInt(br.readLine());
		String array[] = new String[n];
		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++) {
			array[i] = br.readLine();
		}
		System.out.println("Current elements in the array:");
		printArray(array);

		array = revArray(array);
		System.out.println("After reversing, elements in the array:");
		printArray(array);
	}
	static void printArray(String[] arr){
		for (String i : arr) {
			System.out.print(i+" ");
		}
		System.out.println();
	}
	static String[] revArray(String[] arr){
		String temp[] = new String[arr.length];
		for (int i = 0; i < arr.length; i++) {
			temp[i] = arr[arr.length-1-i];
		}
		return temp;
	}

// For integer type array
	// public static void main(String[] args) throws IOException{
	// 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	// 	System.out.println("Enter the size of the array: ");
	// 	int n = Integer.parseInt(br.readLine());
	// 	int array[] = new int[n];
	// 	System.out.println("Enter the values: ");
	// 	for (int i = 0; i < n; i++) {
	// 		array[i] = Integer.parseInt(br.readLine());
	// 	}
	// 	System.out.println("Current elements in the array:");
	// 	printArray(array);

	// 	array = revArray(array);
	// 	System.out.println("After reversing, elements in the array:");
	// 	printArray(array);
	// }
	// static void printArray(int[] arr){
	// 	for (int i : arr) {
	// 		System.out.print(i+" ");
	// 	}
	// 	System.out.println();
	// }
	// static int[] revArray(int[] arr){
	// 	int temp[] = new int[arr.length];
	// 	for (int i = 0; i < arr.length; i++) {
	// 		temp[i] = arr[arr.length-1-i];
	// 	}
	// 	return temp;
	// }
}