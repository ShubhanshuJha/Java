import java.util.Scanner;
public class NestedForLoop{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the value upto which table should be printed. ");
		int n=sc.nextInt();
		for (int j=1;j<=n;j++) {
			int tableOf=j;
			for (int i=1;i<=10;i++) {
				System.out.print(tableOf*i +" ");
			}
			System.out.println();
		}
	}
}