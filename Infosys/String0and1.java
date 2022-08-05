import java.util.*;

public class String0and1 {
	public static void main(String[] arg) {
		String str = "000";
// 		String str = "001";
// 		String str = "111";
		System.out.println(solution(str, str.length()));
	}
	private static int solution(String str, int n) {
		if (Integer.parseInt(str) == 0) return 1;
		int currLen = 0;
		int maxLen = Integer.MIN_VALUE;
		
		char[] arr = str.toCharArray();
		for (int i = 0; i < n; i++) {
			currLen++;
			maxLen = Integer.max(maxLen, currLen);
			if (i < n && arr[i] == '0' && arr[i + 1] == '0')
				currLen = 0;
		}
		return maxLen;
	}
}
