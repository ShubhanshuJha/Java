import java.util.Scanner;

class solution_Apple_To_John{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num_Apples = 5;

		int apples_John = sc.nextInt();
		if (apples_John == 0) {
			num_Apples--;
			System.out.println(num_Apples);
		}
		else{
			num_Apples += apples_John;
			System.out.println(num_Apples);
		}
	}
}