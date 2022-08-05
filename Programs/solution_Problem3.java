import java.util.Scanner;

public class solution_Problem3{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = 0;
		float arr[] = new float[4];

		for (int i = 0; i < 4; i++) {
			arr[i] = sc.nextFloat();
		}
		// float a = sc.nextFloat();
		// float b = sc.nextFloat();
		// float c = sc.nextFloat();
		// float d = sc.nextFloat();

		for (int i = 0; i < 4; i++) {
			if (arr[i] > 0) {
				count += 1;
			}
		}
		// if (a > 0) {
		// 	count += 1;
		// }
		// if (b > 0) {
		// 	count += 1;
		// }
		// if (c > 0) {
		// 	count += 1;
		// }
		// if (d > 0) {
		// 	count += 1;
		// }

		System.out.println(count);
	}
}