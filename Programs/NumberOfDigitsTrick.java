import java.lang.Math;
import java.util.Scanner;
class NumberOfDigitsTrick{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double d=sc.nextDouble();
		int num=(int)Math.floor(Math.log10(d))+1;
		System.out.println("The number of digits in "+(int)d+" is "+num);
	}
}