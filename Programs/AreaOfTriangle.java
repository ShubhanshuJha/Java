import java.util.Scanner;

class AreaOfTriangle{
	public static void main(String args[]){
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the base");
		double b = s.nextDouble();
		System.out.println("Enter the height");
		double h = s.nextDouble();
		double area = (b*h)*1/2;
		System.out.println("Area of the Triangle is = "+area);
	}
}