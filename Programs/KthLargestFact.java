import java.util.Scanner;
class KthLargestFact{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n,k,count=0;
		String line;
		String[] lineVector;
		line=sc.nextLine();
		lineVector=line.split(",");
		n=Integer.parseInt(lineVector[0]);
		k=Integer.parseInt(lineVector[1]);
		for (int i=n;i>=1;i--) {
			if (n%i==0) {
				count++;
			}
			if (count==k) {
				System.out.println(i);
				break;
			}
		}
		if (count!=k) {
			System.out.println(1);
		}
	}
}