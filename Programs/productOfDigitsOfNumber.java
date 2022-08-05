import java.util.Scanner;

class productOfDigitsOfNumber{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a two digit number: ");
		int n = sc.nextInt();
		int product = 1;
		product = n % 10;
		n = n - product;
		n = n / 10;
		product *= n;
		System.out.println("The product is: "+product);
	}
}