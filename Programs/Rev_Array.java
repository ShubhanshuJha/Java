import java.util.Scanner;

public class Rev_Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String[] arr = new String[a];

		for (int i = 0; i < a; i++) {
			arr[i] = sc.nextLine();
		}

		for (int i = a - 1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
	}
	// public static void main(String[] args) {
	// 	Scanner sc = new Scanner(System.in);

	// 	int a = sc.nextInt();
	// 	int[] arr = new int[a];

	// 	for (int i = 0; i < a; i++) {
	// 		arr[i] = sc.nextInt();
	// 	}

	// 	for (int i = a - 1; i >= 0; i--) {
	// 		System.out.println(arr[i]);
	// 	}
	// }
}