import java.util.Scanner;

class printNumberSeparately{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		int tmp = n, factor = 1;
		while(tmp != 0){
			tmp = tmp / 10;
			factor = factor * 10;
		}
		while(factor > 1){
			factor = factor / 10;
			System.out.print((n/factor)+" ");
			n = n % factor;
		}
	}
}