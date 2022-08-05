import java.util.Scanner;
public class Series2{
	public static void main(String[] args) {
		System.out.println("Program for series 1-1/2+1/3-...+...-....n");

		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		float result=0;
		for (float i=1;i<=n;i++) {
			if (i%2==0) {
				result -= 1/i;
			}
			else {
				result += 1/i;
			}
		}
		System.out.println("The value of the series is: "+result);
	}
}