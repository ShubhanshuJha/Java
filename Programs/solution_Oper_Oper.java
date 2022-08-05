import java.util.Scanner;
import java.text.DecimalFormat;

public class solution_Oper_Oper{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.##");

		float result = 0;
		float m = sc.nextFloat();
		char op = sc.next().charAt(0);
		float n = sc.nextFloat();
		switch(op){
			case '+':
				result = m + n;
				System.out.print(df.format(result));
				break;
			case '-':
				result = m - n;
				System.out.print(df.format(result));
				break;
			case '*':
				result = m * n;
				System.out.print(df.format(result));
				break;
			case '/':
				result = m / n;
				System.out.print(df.format(result));
				break;
		}
	}
}