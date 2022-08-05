import java.util.Scanner;
import java.math.BigInteger;

class PrimeAndPowerFinderTrick{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter 1 for Prime finder.\nEnter 2 for PowerOfTwo finder.\nEnter 3 to find both.\nPress any key to exit.");
		int a=sc.nextInt();
		if (a==1) {
			System.out.println("Enter the number: ");
			int x=sc.nextInt();
			System.out.println(BigInteger.valueOf(x).isProbablePrime(1));
		}
		else if (a==2) {
			System.out.println("Enter the number: ");
			int x=sc.nextInt();
			System.out.println(isPowerOfTwo(x));
		}
		else if (a==3) {
			System.out.println("Enter the number: ");
			int x=sc.nextInt();
			System.out.println(BigInteger.valueOf(x).isProbablePrime(1));
			System.out.println(isPowerOfTwo(x));
		}
		else{
			System.exit(0);
		}
	}
	static boolean isPowerOfTwo(int x){
		return x!=0 && ((x&(x-1))==0);
	}
}