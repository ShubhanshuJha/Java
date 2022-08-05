import java.io.*;
import java.util.*;
import java.text.DecimalFormat;

abstract class Shape{
	public abstract Double calculatePerimeter();
}

class Circle extends Shape {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public Double calculatePerimeter(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter radius of the circle: ");
		float radius = sc.nextFloat();
		double result = 2 * 3.14 * radius;
		System.out.println(df.format(result));
		return result;
	}
}

class Rectangle extends Shape {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public Double calculatePerimeter(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter length and breadth of the rectangle: ");
		float len = sc.nextFloat();
		float breadth = sc.nextFloat();
		double result = 2 * (len + breadth);
		System.out.println(df.format(result));
		return result;
	}
}

class Square extends Shape {
	private static DecimalFormat df = new DecimalFormat("0.00");
	public Double calculatePerimeter(){
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter side of the square: ");
		float side = sc.nextFloat();
		double result = 4 * side;
		System.out.println(df.format(result));
		return result;
	}
}

public class AbstractClass_Perimeter{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Select the shape whose perimeter you want to calculate:");
		System.out.println("1 for circle\t2 for rectangle \t3 for square: ");
		int choice = Integer.parseInt(br.readLine());
		switch(choice){
			case 1:
			Shape c = new Circle();
			c.calculatePerimeter();
			break;

			case 2:
			Shape r = new Rectangle();
			r.calculatePerimeter();
			break;

			case 3:
			Shape s = new Square();
			s.calculatePerimeter();
			break;

			default:
			System.out.println("Wrong Selection!!!\nExited the program.");
		}
	}
}