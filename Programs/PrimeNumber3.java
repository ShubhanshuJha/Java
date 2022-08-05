import java.util.Scanner;
public class PrimeNumber3{

	public static boolean checkPrime(int n){
		boolean isPrime=true;
		for (int i = 2; i * i <= n; i++) {
			if (n % i == 0) {
				isPrime = false;
				break;
			}
		}
		if (n<2) isPrime = false;
		return isPrime;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the number to check whether it's prime or not: ");
		int n = sc.nextInt();
		do{
			boolean isPrime = checkPrime(n);
			if (isPrime == true)
				System.out.println(n+" is a Prime Number.");
			else
				System.out.println(n+" is not a Prime Number.");

			System.out.print("Enter the number to check whether its prime or not: ");
			n = sc.nextInt();
		}while (n >= 2);
	}
}