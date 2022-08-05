import java.util.Scanner;

class solution_Lar_Digit{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[3];

		int n = sc.nextInt();
		int i = 0, max = 0;
		while(n != 0){
			int val = n % 10;
			if (val > max) {
				max = val;
			}
			// arr[i] = val;
			// i++;
			n = n / 10;
		}
		// int max = arr[0];
		// for (int j = 0; j < 3; j++) {
		// 	if (max < arr[j]) {
		// 		max = arr[j];
		// 	}
		// }
		System.out.println(max);
	}
}