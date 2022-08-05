import java.util.Scanner;
class DivineDivisorPrb{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int N=sc.nextInt();
		//Find divisor now
		for (int i=1;i<N+1 ;i++ ) {
			if (N%i==0) {
				System.out.print(i+" ");
			}
		}
	}
}