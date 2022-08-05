public class BubbleSort{
	public static void main(String[] args) {
		int a[]={2,1,8,-3,6,4,12};
		int n=a.length;
		Solution sol = new Solution();
		// sol.bubbleSort(a, n);
		// sol.efficientBubbleSort(a, n);
		sol.recursiveBubbleSort(a, n);
		for (int item: a) {
			System.out.print(item+" ");
		}
	}
}
class Solution{
	public void bubbleSort(int[] a, int n){
		for (int i=0; i<n-1; i++) {

			for (int j=0; j<n-1-i; j++) {
				if (a[j+1]<a[j]) {
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}

		}
	}
	public void efficientBubbleSort(int[] a, int n){
		for (int i=0; i<n-1; i++) {
			boolean isSorted=true;
			for (int j=0; j<n-1-i; j++) {
				// Here, swapping elements using bitwise operation, wiz. more efficient
				if (a[j+1]<a[j]) {
					a[j] ^= a[j+1];
					a[j+1] ^= a[j];
					a[j] ^= a[j+1];
					isSorted = false;
				}
			}
			if (isSorted) break;
		}
	}

	public void recursiveBubbleSort(int[] a, int n){
		if (n == 1) return;
		for (int i=0; i<n-1; i++) {
			if (a[i] > a[i+1]){
				a[i] ^= a[i+1];
				a[i+1] ^= a[i];
				a[i] ^= a[i+1];
			}
		}
		recursiveBubbleSort(a, n-1);
	}
}