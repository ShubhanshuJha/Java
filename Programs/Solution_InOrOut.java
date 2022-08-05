import java.util.Scanner;

public class Solution_InOrOut{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int input = sc.nextInt();
		String result = input % 2 == 0 ? "In" : "Out";
		System.out.print(result);
	}
}