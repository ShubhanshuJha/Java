import java.util.Scanner;
class BankCompareProb{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int t, n, period, b=0;
		double p, interest, sq, emi;
		double bank[]=new double[2];
		System.out.println("Enter the principal amount");
		p=sc.nextDouble();
		System.out.println("Enter the tenature year");
		t=sc.nextInt();
		for (int i=0;i<2;i++ ) {
			System.out.println("Enter the number of slabs");
			n=sc.nextInt();
			double sum=0;
			for (int j=0;j<n ;j++ ) {
				System.out.println("Enter the period");
				period=sc.nextInt();
				System.out.println("Enter the interest");
				interest=sc.nextDouble();
				sq=Math.pow((1+interest), period*12);
				emi=(p*interest)/(1-1/sq);
				sum=sum+emi;
			}
			bank[b++]=sum;
		}
		if (bank[0]<bank[1]) {
			System.out.println("Bank A");
		}
		else {
			System.out.println("Bank B");
		}
	}
}