import java.util.*;

public class BinaryNumbers{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int sum = 0, max = 0;
		while(n > 0){
			if (n % 2 == 1) {
				sum++;
				if (sum > max) {
					max = sum;
				}
			}
			else {
				sum = 0;
			}
			n /= 2;
		}
		System.out.println(max);
	}
}