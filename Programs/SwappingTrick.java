import java.util.Scanner;
class SwappingTrick{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		System.out.println(a+" "+b);
		a^=b;
		b^=a;
		a^=b;
		if (a<b) {
			System.out.println("Ascending Order is "+a+" "+b);
		}
		else System.out.println("Descending Order is "+a+" "+b);
	}
}