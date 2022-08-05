import java.util.Scanner;
import java.lang.Math;

public class WhileLoop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=sc.nextInt();
		int temp=n;
		int sum=0;
		// To know the number of digits of an input
		// Use this method
		int numberOfDigits = (int)Math.log10(n) + 1;
		System.out.println(n+" is a "+numberOfDigits+" digits number.");
		while(temp>0){
			int lastDigit=temp%10;
			temp/=10;
			sum+=lastDigit;
		}
		System.out.println("The sum of digits of "+n+" is : "+sum);
	}
}