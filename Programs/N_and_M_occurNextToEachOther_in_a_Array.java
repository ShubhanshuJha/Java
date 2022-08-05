// Iterating over arrays -> Check if an array contains two numbers
/* Write a program that reads an unsorted array of integers and two numbers n and m. The program must check if n and m occur next to each
other in the array (in any order).
Input data format:
		The first line contains the size of an array.
		The second line contains elements of the array.
		The third line contains two integer numbers n and m.
		All numbers in the same line are separated by the space character.
Output data format:
		Only a single value: true or false.
Sample Input 1:
		3
		1 3 2
		2 3
Sample Output 1: true

Sample Input 2:
		3
		2 1 2
		2 3
Sample Output 2: false */

import mypackages.io.*;

class N_and_M_occurNextToEachOther_in_a_Array {

	private static final Writer writer = new Writer(System.out);
	private static final Reader reader = new Reader(System.in);

	public static void main(String[] args) {
		writer.print("Enter size of the array: ");
		int size = reader.nextInt();
		writer.print("Enter the elements of the array: ");
		int[] array = java.util.Arrays.stream(reader.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		writer.print("Enter the value of N and M: ");
		int[] n_and_m = java.util.Arrays.stream(reader.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

		// boolean response = isNextToEachOther_Approach1(array, n_and_m[0], n_and_m[1]);
		boolean response = isNextToEachOther_Approach2(array, n_and_m[0], n_and_m[1]);
		String result = response ? "YES" : "NO";
		writer.print("Is M and N are next to each other in the array? " + result);
	}
	// Not efficient solution
	private final static boolean isNextToEachOther_Approach1(int[] arr, int n, int m) {
        java.util.PriorityQueue<Integer> pq = new java.util.PriorityQueue<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] == n) {
                pq.offer(i);
            }
        }
        while (!pq.isEmpty()) {
            int idx = pq.poll();
            if (idx < n - 1 && arr[idx + 1] == m || idx > 0 && arr[idx - 1] == m) {
                return true;
            }
        }
        return false;
	}
	// Efficient solution
	private final static boolean isNextToEachOther_Approach2(int[] arr, int n, int m) {
        int sum = m + n;
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] + arr[i + 1] == sum) {
                return true;
            }
        }
        return false;
	}
}