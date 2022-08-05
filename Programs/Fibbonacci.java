import java.util.Scanner;

public class Fibbonacci{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int a = 0, b = 1, result = 0;
		System.out.print(a+" "+b+" ");
		for (int i = 0; i < n-2; i++) {
			result = a + b;
			System.out.print(result+" ");
			a = b;
			b = result;
		}
	}
}