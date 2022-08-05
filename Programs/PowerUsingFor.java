import java.util.Scanner;
public class PowerUsingFor{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the base value ");
		int a=sc.nextInt();
		System.out.print("Enter the power value ");
		int b=sc.nextInt();
		int result=1;
		for (int i=0;i<b;i++) {
			result *= a;
		}
		System.out.println("The result is "+result);
	}
}