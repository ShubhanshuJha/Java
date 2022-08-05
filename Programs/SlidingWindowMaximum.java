// LeetCode Problem: Sliding Window Maximum
import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum{
	public static void main(String[] args) {
		Solution solution = new Solution();
		// int a[] = {4,3,1,2,5,3,4,7,1,9};
		// int k = 4;

		// int a[] = {1,3,-1,-3,5,3,6,7};
		// int k = 3;

		int a[] = {6,5,4,3,2,13,5,7,8,6,5};
		int k = 3;
		int ans[] = solution.maxSlidingWindow(a,k);
		System.out.println("Displaying the elements:");
		for (int x : ans) {
			System.out.print(x+" ");
		}
	}

	static class Solution{
		public int[] maxSlidingWindow(int[] a, int k){
			int n = a.length;
			if (n <= 1) {
				return a;
			}
			Deque<Integer> dQ = new LinkedList<>();

			int ans[] = new int[n-k+1];

			int i = 0;
			for (; i < k; i++) {
				while(!dQ.isEmpty() && a[dQ.peekLast()] <= a[i]){
					dQ.removeLast();
				}
				dQ.addLast(i);
			}
			for(; i < n; i++){
				ans[i-k] = a[dQ.peekFirst()];

				while(!dQ.isEmpty() && dQ.peekFirst() <= i - k){
					dQ.removeFirst();
				}
				while(!dQ.isEmpty() && a[dQ.peekLast()] <= a[i]){
					dQ.removeLast();
				}
				dQ.addLast(i);
			}
			ans[i - k] = a[dQ.peekFirst()];
			return ans;
		}
	}
}