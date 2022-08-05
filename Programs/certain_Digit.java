import java.util.Scanner;
import java.text.DecimalFormat;

public class certain_Digit{
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#");
		float num = scan.nextFloat();

		System.out.println(df.format(num));
	}
}