import java.util.Scanner;
import java.text.DecimalFormat;

class solution_DebbieDowner{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");
		float arr[] = new float[5];
		float result = 0;

		for (int i = 0; i < 5; i++) {
			arr[i] = sc.nextFloat();
		}
		for (int i = 0; i < 5; i++) {
			if (arr[i] < 0) {
				result += arr[i];
			}
		}
		System.out.println(df.format(result));
	}
}