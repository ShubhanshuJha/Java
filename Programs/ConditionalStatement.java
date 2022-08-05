import java.util.*;
class ConditionalStatement{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		if (n%2==0) {
			if (n<=5) {
				System.out.println("Not Weird");
			}
			else if (n<=20) {
				System.out.println("Weird");
			}
			if (n>20){
				System.out.println("Not Weird");
			}
		}
		else {
			System.out.println("Weird");
		}
	}
}