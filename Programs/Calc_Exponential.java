import java.lang.*;
import java.io.*;

class Calc_Exponential{
	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter a number: ");
		int n = Integer.parseInt(br.readLine());
		int result = exp(n);
		System.out.print("The result is: "+result);
	}

	/* Method that returns factorial of a Number*/
	static int factorial(int n){
		if (n == 1) {
			return 1;
		}
		return n * factorial(n-1);
	}

	/* Method that calculates the exponential */
	static int exp(int n){
		int sum = 1;
		for (int i = 1; i <= n; i++) {
			sum += Math.pow(n, i) / factorial(i);
		}
		return sum;
	}
}