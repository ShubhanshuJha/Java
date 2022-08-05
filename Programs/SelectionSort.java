public class SelectionSort{
	public static void main(String[] args) {
		int a[]={3,1,-2,-4,7,4,-9,8,9,0};
		int n=a.length;

		Solution sol = new Solution();
		// sol.selectionSort(a, n);
		sol.optimizedSelectionSort(a, n);

		for (int e: a) {
			System.out.print(e+" ");
		}
	}
}
class Solution{
	public void selectionSort(int[] a, int n){
		for (int i=0;i<n-1;i++) {
			int minInd=i;
			for (int j=i; j<n; j++) { //Here loop starts from i, wiz. not that effective
				if (a[j]<a[minInd]) {
					minInd=j;
				}
			}
			int temp=a[i];
			a[i]=a[minInd];
			a[minInd]=temp;
		}
	}
	public void optimizedSelectionSort(int[] a, int n){
		for (int i=0;i<n-1;i++) {
			int minInd=i;
			for (int j=i+1; j<n; j++) {
				if (a[j] < a[minInd]) {
					minInd = j;
				}
			}
			if (minInd != i){
				a[i] ^= a[minInd];
				a[minInd] ^= a[i];
				a[i] ^= a[minInd];
			}
		}
	}
}