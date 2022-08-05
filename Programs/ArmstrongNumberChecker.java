import java.util.Scanner;
import java.util.List;
import java.util.LinkedList;

class ArmstrongNumberChecker {
	int n, digits;
	ArmstrongNumberChecker(int n) {
		this.n = n;
		while (n > 0) {
			n /= 10;
			digits++;
		}
	}
	public boolean checkArmstrong() {
		// String temp = String.valueOf(n);
		// int numberOfDigit = temp.length();
		// int cubicSum = 0;
		// for (int i = 0; i < numberOfDigit; i++) {
		// 	cubicSum += (int) Math.pow(Integer.parseInt(temp.substring(i, i + 1)), numberOfDigit);
		// }
		int cubicSum = 0;
		int temp = n;
		while (temp > 0) {
			cubicSum += (int) Math.pow(temp % 10, digits);
			temp /= 10;
		}

		return cubicSum == n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = 153;
		// int n = 1634; // Now working
		ArmstrongNumberChecker anc = new ArmstrongNumberChecker(n);
		System.out.println(n + " is a Armstrong number: " + anc.checkArmstrong());

		System.out.print("Enter the intervals: ");
		int a = sc.nextInt();
		int b = sc.nextInt();
		List<Integer> list = new LinkedList<>();
		for (int i = a; i <= b; i++) {
			ArmstrongNumberChecker temp = new ArmstrongNumberChecker(i);
			if (temp.checkArmstrong()) {
				list.add(i);
			}
		}
		System.out.println("The generated list is:\n" + list);
	}
}