import java.util.Scanner;

class solution_Divisible{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		if (num1 < num2) {
			if (num2 % num1 == 0) {
				System.out.println("divisible");
			}
			else{
				System.out.println("not");
			}
		}
		else{
			if (num1 % num2 == 0) {
				System.out.println("divisible");
			}
			else{
				System.out.println("not");
			}
		}
	}
}