import java.util.Scanner;

public class solution_GCD{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		int gcd = get_GCD(a,b);

		System.out.println(gcd);
	}

	public static int get_GCD(int a, int b){
		if (a == 0)
         	return b;
        if (b == 0)
        	return a;
        if (a == b)
        	return a;
        if (a > b)
        	return get_GCD(a-b, b);

        return get_GCD(a, b-a);
	}
}