import java.util.Scanner;
public class Series1{
	public static void main(String[] args) {
		System.out.println("Program for series 1+1/2+1/3+1/4+1/5+...1/n");

		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of n: ");
		int n=sc.nextInt();
		float result=0;
		for (float i=1;i<=n;i++) {
			result+=1/i;
		}
		System.out.print("The result is "+result);
	}
}