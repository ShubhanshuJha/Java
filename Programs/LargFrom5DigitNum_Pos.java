import java.util.Scanner;

public class LargFrom5DigitNum_Pos{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[5];
		String result;
		int n = sc.nextInt();
// 123456
		for (int i = 0; i < 5; i++) {
			int val = n % 10;	//6,5,4,3,2,1
			arr[i] = val;
			n /= 10;
		}
		int largest = PosOfLarg(arr);
		if(largest == arr[4])
			result = "Leftmost";
		else if (largest == arr[2])
			result = "Middle";
		else if (largest == arr[0])
			result = "Rightmost";	

		else
			result = "Unknown";

		System.out.print(result);
	}

	public static int PosOfLarg(int arr[]){
		int lar = 0;
		for (int i = 0; i < 5; i++) {
			if (lar < arr [i]) {
				lar = arr[i];
			}
		}
		return lar;
	}
}