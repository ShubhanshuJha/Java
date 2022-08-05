import java.util.Scanner;
 
public class solution_IIY_Cody{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = sc.next();
		String b = sc.next();
		String c = sc.next();
		String d = sc.next();
		a = a+b+c+d;
		String s = "cody";
		if (a.toLowerCase().equals(s)) {
			System.out.println("Correct");
		}
		else{
			System.out.println("Wrong");
		}
	}
}