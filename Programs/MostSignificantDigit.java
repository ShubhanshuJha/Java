import java.util.Scanner;
import java.lang.Math;
class MostSignificantDigitTrick{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		double d=Math.log10(n);
		d=d-Math.floor(d);
		int x=(int)Math.pow(10,d);
		System.out.println("The most significant digit is "+x);
	}
}