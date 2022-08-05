import java.util.Scanner;
 
public class freq_of_a_digit{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int digit = scan.nextInt();
		int n = scan.nextInt();

		int freq = 0;
		while(n != 0){
			int val = n % 10;
			if (val == digit) {
				freq += 1;
			}
			n = n / 10;
		}
		System.out.println(freq);
	}
}