import java.util.*;
class FunctionExample{
	private static int myFunction(int x, int y){
		int z=2*x-y;
		return z*x;
	}
	private static int f(int n){
		return 3+myFunction(n,n+1);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value of b: ");
		int b=sc.nextInt();
		System.out.print("\nEnter the value of c: ");
		int c=sc.nextInt();
		System.out.print("\n");
		int a=myFunction(b,c);
		int d=f(a*a);
		System.out.println(d);
	}
}