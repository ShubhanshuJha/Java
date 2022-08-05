import java.util.*;
class OddEvenTrick{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		System.out.println((a&1)==0 ? "Even" : "Odd");
	}
}