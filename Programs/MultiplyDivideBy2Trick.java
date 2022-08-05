import java.util.Scanner;
class MultiplyDivideBy2Trick{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println("Enter 1 to multiply or 2 to divide.");
		int b=sc.nextInt();
		if (b==1) {
			a=a<<1;
			System.out.println(a);
		}
		else if (b==2) {
			a=a>>1;
			System.out.println(a);
		}
		else{
			System.out.println("Wrong choice.");
		}
	}
}