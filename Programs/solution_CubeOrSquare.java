import java.util.Scanner;

class solution_CubeOrSquare{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		if (num < 0) {
			System.out.println(num*num*num);
		}
		else if (num == 0) {
			System.out.println("zero");
		}
		else{
			System.out.println(num*num);
		}
	}
}