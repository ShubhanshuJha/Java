// Subarrays with equal 1s and 0s
/* Problem: Given an array containing 0s and 1s. Find the number of subarrays having equal number of 0s and 1s.
Input: 	n = 7
		A[] = {1,0,0,1,0,1,1}
Output: 8
Input:  n = 5
		A[] = {1,1,1,1,0}
Output: 1
Expected Time Complexity: O(n)		Expected Auxiliary Space: O(n) */

import mypackages.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class SubarraysWithWqual_1s_and_0s {

	private static final Writer writer = new Writer(System.out);
	private static final Reader reader = new Reader(System.in);

	public static void main(String[] args) {
		writer.println("This program does not take \'n\' value.");
		writer.print("Enter the elements of the array: ");
		int[] arr = Arrays.stream(reader.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		writer.println("The number of required subarrays: " + countSubarrWithEqualZeroAndOne(arr));
	}

	//Function to count subarrays with 1s and 0s.
    private final static int countSubarrWithEqualZeroAndOne(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for (int i : arr) {
            sum += (i == 0) ? -1 : i;
            map.put(sum, map.get(sum) == null ? 1 : map.get(sum) + 1);
        }
        int count = 0;
        for(Map.Entry<Integer, Integer> e : map.entrySet()) {
            count += (e.getValue() > 1) ? ((e.getValue() * (e.getValue() - 1)) >> 1)
                                            : 0;
        }
        count += (map.containsKey(0)) ? map.get(0) : 0;
        return count;
    }
}