import java.util.Scanner;
class NumPrimeSum{
	static int prime(int b){
		int cnt=1;
		for (int j=2;j<=b/2 ;j++ ) {
			if (b%j==0) {
				cnt=0;
			}
		}
		if (cnt==0) {
			return 1;
		}
		else
			return 0;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,cnt,c,sum=0,count=0,k=0;
		NumPrimeSum t=new NumPrimeSum();
		int a[]=new int[25];
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		for (int i=2;i<=n ;i++ ) {
			cnt=1;
			for (int j=2;j<n/2;j++ ) {
				if (i%j==0) {
					cnt=0;
				}
			}
			if (cnt==1) {
				a[k]=i;
				k++;
			}
		}
		for (int i=0;i<k ;i++ ) {
			sum=sum+a[i];
			c=t.prime(sum);
			if (c==1) {
				count++;
			}
		}
		System.out.println(count);
	}
}