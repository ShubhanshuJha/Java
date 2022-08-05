import java.util.Scanner;
 
public class loopingStrings{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String a = "CodeChum is awesome";
		int n = sc.nextInt();
		while(n != 0){
			System.out.println(a);
			n--;
		}
	}
}