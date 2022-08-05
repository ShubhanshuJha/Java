// InsertionSort is efficient than BubbleSort because it does less swapping.
public class InsertionSort{
	public static void main(String[] args) {
		int a[]={2,1,8,-3,6,4,12};
		// int a[]={5,4,60,-10,1,2,-99};
		int n=a.length;

		Solution sol = new Solution();
		sol.insertionSort(a, n);

		for (int item: a) {
			System.out.print(item+" ");
		}
	}
}
class Solution{
	public void insertionSort(int[] a, int n){
		for(int i=1; i<n; i++){
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp){
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
}