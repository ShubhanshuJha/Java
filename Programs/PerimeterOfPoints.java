import java.util.Scanner;
import java.lang.Math;
class PerimeterOfPoints{
	public static void main(String[] args) throws Exception {
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter the Number of point: ");
		int n=sc.nextInt();
		System.out.print("\n");
		double pointCoordinates[]=new double[n];
		double sum=0;
		for (int i=1;i<=n ;i++) {
			System.out.println("Enter the elements of"+i);
			pointCoordinates[i]=sc.nextDouble();
			for (double ptsDistance=1;ptsDistance<=i;ptsDistance++) {
				ptsDistance=distance(pointCoordinates);
				sum=sum+ptsDistance;
			}
		}
		System.out.println(sum);
	}	
	
	private static double distance(double arr[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the point A co-ordinates individually: ");
		double ptA=sc.nextDouble();
		double ptB=sc.nextDouble();
		System.out.println("Enter the point B co-ordinates individually: ");
		double ptC=sc.nextDouble();
		double ptD=sc.nextDouble();
		sc.close();
		double a= ptC-ptA;
		double b=ptD-ptB;
		double distanceAb=Math.hypot(a,b);
		return (distanceAb);
	}	
}