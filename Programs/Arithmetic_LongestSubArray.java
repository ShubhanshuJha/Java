// Google Kickstart Problem: An arithmetic array is an array that contains at least two integers and the differences between
// consecutive integers are equal. E.g., [9, 10], [3, 3, 3], and [9, 7, 5, 3] are arithmetic array, while [1, 3, 3, 7],
// [2, 1, 2], and [1, 2, 4] are not arithmetic array.
// Sarasvati has an array of N non-negative integers. The i-th integer of the array is Ai. She wants to choose a contiguous
// arithmetic subarray from her array that has the max. length. Please help her to determine the length of te longest
// contiguous arithmetic subarray.
// Input: First line of the input gives the number of test cases. Each test case begin with a line containing an integer N.
// The second line contains N integers. The i-th integer is Ai.
// Output: For each test case, output one line containing Case #x : y, where x is the test case number (starting from 1) and
// y is the length of the longest contiguous arithmetic subarray.
// Sample:-
	// Input:									|	Output:
	// 		4
	// 		7									|
	// 		10 7 4 6 8 10 11					|		4
	// 		4
	// 		9 7 5 3								|		4
	// 		9
	// 		5 5 4 5 5 5 4 5 6					|		3
	// 		10
	// 		5 4 3 2 1 2 3 4 5 6					|		6

import java.io.*;

public class Arithmetic_LongestSubArray { // Class name should be Solution
	public static void main(String[] args) {
		IO.print("Enter the number of test cases: ");
		int test = IO.inputInt();
		for (int t = 1; t <= test; t++) {
			IO.print("Enter the size of array: ");
			int n = IO.inputInt();
			IO.print("Enter the elements of the array: ");
			int[] arr = IO.inputIntArr();

			// IO.println();
			int y = solution(arr, n);
			// IO.println("The result is:\n\t\t#" + t + " : " + y);
			IO.println("Case #" + t + ": " + y);
			IO.println();
		}
		IO.println("Program Finished.");
	}
	// Time Complexity: O(n)
	private static int solution(int[] arr, int n) {
		int[] difference = new int[n - 1];
		for (int i = 1; i < n; i++)
			difference[i - 1] = arr[i] - arr[i - 1];
		// IO.println("The difference list is:\n" + 
		// 	java.util.Arrays.toString(difference));
		int result = 1, currVal = difference[0], currLen = 1;
		for (int i = 1; i < n - 1; i++) {
			if (currVal == difference[i]) {
				currLen++;
			} else {
				currVal = difference[i];
				currLen = 1;
			}
			result = Integer.max(result, currLen);
		}
		return ++result;
	}
}

final class IO {
	final static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	final static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	public final static int inputInt(){
		int val = 0;
		try {
			val = Integer.valueOf(br.readLine());
		} catch (IOException ioe) {}
		return val;
	}
	public final static int[] inputIntArr(){
		String[] val = null;
		int n = 0;
		try {
			val = br.readLine().split(" ");
			n = val.length;
		} catch (IOException ioe) {}
		int[] arr = new int[n];
		for (int i = 0; i < n; i++)
			arr[i] = Integer.valueOf(val[i]);
		return arr;
	}
	public final static long inputLong(){
		long val = 0;
		try {
			val = Long.valueOf(br.readLine());
		} catch (IOException ioe) {}
		return val;
	}
	public final static String inputString(){
		String val = "";
		try {
			val = br.readLine();
		} catch (IOException ioe) {}
		return val;
	}
	public final static void print(int a){
		try {
			bw.write(a);
			bw.flush();
		} catch (IOException ioe) {}
	}
	public final static void println(int a){
		try {
			bw.write(a + "\n");
			bw.flush();
		} catch (IOException ioe) {}
	}
	public final static void print(String a){
		try {
			bw.write(a);
			bw.flush();
		} catch (IOException ioe) {}
	}
	public final static void println(String a){
		try {
			bw.write(a + "\n");
			bw.flush();
		} catch (IOException ioe) {}
	}
	public final static void println(){
		try {
			bw.write("\n");
			bw.flush();
		} catch (IOException ioe) {}
	}
}