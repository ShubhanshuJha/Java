import java.lang.Math;
import java.util.*;
class HypotExam{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of co-ordinates: ");
		int n=sc.nextInt();
		double sum=0;
		double perim=0;
		for (int i=1;i<=n;i++) {
			double prevPt=i;
			double nextPt=i+1;
			while(i<=n){
				prevPt=i;
				sum=sum+distancePts(prevPt,nextPt);
				swap(prevPt+i,nextPt);
				i++;
			}
			if (i==n) {
				break;
			}
		}
		perim=sum;
		sc.close();
		System.out.println("The perimeter is: "+perim);
	}
	private static double distancePts(double a, double b){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the point A co-ordinates individually: ");
		double ptA=sc.nextDouble();
		double ptB=sc.nextDouble();
		System.out.println("Enter the point B co-ordinates individually: ");
		double ptC=sc.nextDouble();
		double ptD=sc.nextDouble();
		a= ptC-ptA;
		b=ptD-ptB;
		double distanceAb=Math.hypot(a,b);
		return (distanceAb);
	}
	private static void swap(double x, double y){
		double temp=x;
		x=y;
		y=temp;
	}
}