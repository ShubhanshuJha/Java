import java.util.Scanner;
 
public class solution_FizzBuzz{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int count = 1; count <= n; count++) {
			if (count % 3 == 0 && count % 5 == 0) {
				System.out.println("FizzBuzz");
			}
			else if (count % 3 == 0) {
				System.out.println("Fizz");
			}
			else if (count % 5 == 0) {
				System.out.println("Buzz");
			}
			else{
				System.out.println(count);
			}
		}
	}
}

import java.util.Scanner;
 
// public class solution_FizzBuzz{
// 	public static void main(String[] args) {
// 		Scanner sc = new Scanner(System.in);

// 		int n = sc.nextInt();
// 		for (int count = 1; count <= n; count++) {
// 			if (count % 3 == 0 && count % 5 == 0) {
// 				System.out.println("FizzBuzz");
// 			}
// 			else if (count % 3 == 0) {
// 				System.out.println("Fizz");
// 			}
// 			else if (count % 5 == 0) {
// 				System.out.println("Buzz");
// 			}
// 		}
// 	}
// }