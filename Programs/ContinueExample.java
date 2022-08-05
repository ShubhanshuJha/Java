import java.util.*;
class ContinueExample{
	public static void main(String[] args) {
		Scanner sc=new
		Scanner(System.in);
		System.out.print("Enter the highest number in list: ");
		int n=sc.nextInt();
		System.out.println("Enter the upper & lower value of range to be removed from the list --");
		int u=sc.nextInt();
		int l=sc.nextInt();
		System.out.println("The updated list upto "+n+" is:");
		for (int i=1;i<=n;i++) {
			if (i>=u && i<=l) {
				continue;
			}
			System.out.println(i);
		}
	}
}