import java.math.BigInteger; 
import java.util.Scanner;	
class InBuiltGCDTrick 
{ 
	public static int gcd(int a, int b) 
	{ 
		BigInteger b1 = BigInteger.valueOf(a); 
		BigInteger b2 = BigInteger.valueOf(b); 
		BigInteger gcd = b1.gcd(b2); 
			return gcd.intValue(); 
	} 
	
	public static long gcd(long a, long b) 
	{ 
		BigInteger b1 = BigInteger.valueOf(a); 
		BigInteger b2 = BigInteger.valueOf(b); 
		BigInteger gcd = b1.gcd(b2); 
			return gcd.longValue(); 
	} 
	
		
	// Driver method 
	public static void main(String[] args) 
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter two intergers to find their greatest common divisor:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter long value to find their greatest common divisor:");
		long j=sc.nextLong();
		long k=sc.nextLong();
		System.out.println(gcd(a, b)); 
		System.out.println(gcd(j,k)); 
	}
} 
