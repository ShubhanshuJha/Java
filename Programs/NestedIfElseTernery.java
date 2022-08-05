import java.util.Scanner;
public class NestedIfElseTernery{
	public static void main(String[] args) {
		int a,b,c,result=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the numbers:");
		a=sc.nextInt();
		b=sc.nextInt();
		c=sc.nextInt();
		result=a>b ? a>c ? a : c : b>c ? b : c;
		System.out.println("The largest number is "+result);
	}
}