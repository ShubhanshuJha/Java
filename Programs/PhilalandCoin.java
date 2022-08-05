import java.util.*;
class PhilalandCoin{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int T=sc.nextInt();
		for (int j=1;j<=T;j++) {
			int N=sc.nextInt();
			int sum=0;
			int count=0;
			int i=1;
			while (sum<N){
				sum+=i;
				i++;
				count++;
			}
			System.out.println(count);
		}
	}
}