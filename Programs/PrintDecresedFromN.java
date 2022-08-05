import java.util.*;
public class PrintDecresedFromN{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of n:");
		int n=sc.nextInt();
		System.out.println("The numbers from "+n+" are:");
		for (int i=n;i>0;i--) {
			System.out.println(i);
		}
	}
}