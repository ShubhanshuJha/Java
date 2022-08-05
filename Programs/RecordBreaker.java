// Google Kickstart Problem: Isyana is given the number of visitors at her local theme park on N consecutive days. The number
// of visitors on the i-th day is Vi. A day is record breaking if it satisfies both of the following conditions:
// 	->The number of visitors on the day is strictly larger than the number of visitors on each of the previous days.
// 	->Either it is the last day, or the number of visitors on the day is strictly larger than the number of visitors
// 	  on the following day.
// Note that the very first day could be a record breaking day!
// Please help Isyana find out the number of record breaking days.
// Input: First line of the input gives the number of test cases. Each test case begin with a line containing an integer N.
// The second line contains N integers. The i-th integer is Vi.
// Output: For each test case, output one line containing Case #x : y, where x is the test case number (starting from 1) and
// y is the number of record breaking days.

// Sample:-
	// Input:									|	Output:			|	Values in the Output:
	// 		4
	// 		8									|
	// 		1 2 0 7 2 0 2 0 					|		2 			|	[2, 7, ...] (second, fourth)
	// 		6
	// 		4 8 15 16 23 42						|		1			|	[42] (last)
	// 		9
	// 		3 1 4 1 5 9 2 6 5					|		3 			|	[3, 4, 9] (first, third, sixth)
	// 		6
	// 		9 9 9 9 9 9							|		0			|	[] (no record breaking day)

import java.io.*;

public class RecordBreaker {
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
			// IO.println();
		}
		IO.println("Program Finished.");
	}
	// Time Complexity: O(n)
	private static int solution(int[] arr, int n) {
		boolean[] leftGreat = new boolean[n];
		leftGreat[0] = true;
		int currLarg = arr[0];
		for (int i = 1; i < n; i++) {
			if (arr[i] > currLarg) {
				currLarg = arr[i];
				leftGreat[i] = true;
			}
		}
		// IO.println(java.util.Arrays.toString(leftGreat));
		int result = 0;
		for (int i = 0; i < n; i++) {
			if (i == n - 1 && leftGreat[i]) {
				result++;
			} else if (leftGreat[i] && arr[i + 1] < arr[i]) {
				result++;
				// IO.print(arr[i] + " ");
			}
		}
		return result;
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