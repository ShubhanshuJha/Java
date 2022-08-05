import java.util.Scanner;
class OnACubeProb{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double x,y,z;
		System.out.println("Enter the number of points");
		int n=sc.nextInt();
		for (int i=0;i<=n;i++) {
			System.out.println("Enter the co-ordinates separated by ',':");
			String line=sc.nextLine();
			String lineVector[];
			lineVector=line.split(",");
			x=Double.parseDouble(lineVector[0]);
			y=Double.parseDouble(lineVector[1]);
			z=Double.parseDouble(lineVector[2]);
			double ab=Distance(x,y,z);
			double bc=Distance(x,y,z);
			double cd=Distance(x,y,z);
			double da=Distance(x,y,z);
			double dist=ab+bc+cd+da;
			System.out.println(dist);
		}
	}
	static double Distance(double x,double y, double z){
		Scanner sc=new Scanner(System.in);
		double x1=sc.nextDouble();
		double x2=sc.nextDouble();
		double y1=sc.nextDouble();
		double y2=sc.nextDouble();
		double z1=sc.nextDouble();
		double z2=sc.nextDouble();
		x=x2-x1;
		y=y2-y1;
		z=z2-z1;
		double ab=Math.sqrt((x*x)+(y*y)+(z*z));
		return ab;
	}
}