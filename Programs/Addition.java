import java.util.Scanner;

class Addition{
	public static void main(String args[]){
	int a,b,c;
	System.out.println("Enter the two integers to calculate their sum:");
	Scanner in=new Scanner(System.in);
	a=in.nextInt();
	b=in.nextInt();
	System.out.print("Sum of the two integers is = "+(a+b));
	}
}