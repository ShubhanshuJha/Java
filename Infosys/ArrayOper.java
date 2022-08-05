import java.util.*;

public class ArrayOper {
	public static void main(String[] arg) {
		int[] arr = {8, 5, 4}; // => 2
// 		int[] arr = {9, 9, 3, 6, 3}; // => 1
// 		int[] arr = {3, 7, 2, 5, 8}; // => 4
		System.out.println(solution2(arr, arr.length));
	}
	private static int solution(int[] arr, int n) {
		Arrays.sort(arr); // 4, 5, 8
		HashSet<Integer> set = new HashSet<>();
		int ct = 0;
		for (int i = 0; i <  n; i++) {
			if (set.isEmpty()) {
				set.add(arr[i]);
				ct++;
			} else if (!set.contains(arr[i])) {
				set.add(arr[i]);
				ct++;
			}
			int j = i + 1;
			while (j < n) {
				if (arr[j] % arr[i] == 0 && !set.contains(arr[j])) {
					set.add(arr[j]);
				}
				j++;
			}
		}
		return ct;
	}
	
	private static int solution2(int[] arr, int n) {
// 		Arrays.sort(arr); // 4, 5, 8
		int max = Arrays.stream(arr).max().getAsInt();
		int[] disSet = new int[max + 1];
		for (int i : arr)
			disSet[i] = 1;
		// disSet[] = {0, 0, 0, 0, 4, 5, 0, 0, 8}
		int ct = 0;
		for (int i = 1; i <= max; i++) {
			while (i <= max && disSet[i] == 0) i++;
			if (i <= max && disSet[i] == 1) {
				ct++;
				disSet[i] = 0;
				int j = i + i;
				while (j <= max) {
					if (j % i == 0 && disSet[j] != 0) {
						disSet[j] = 0;
					}
					j += i;
				}
			}
		}
		return ct;
	}
}
