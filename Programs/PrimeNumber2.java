import java.util.Scanner;
public class PrimeNumber2{

	public static boolean checkPrime(int n){
		boolean isPrime=true;
		for (int i = 2; i * i <= n; i++) {	//This is efficient looping condition to check for Prime number
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
		System.out.print("Enter the number to check whether its prime or not: ");
		int n = sc.nextInt();
		boolean isPrime = checkPrime(n);
		if (isPrime == true)
			System.out.println(n+" is a Prime Number.");
		else
			System.out.println(n+" is not a Prime Number.");
	}
}