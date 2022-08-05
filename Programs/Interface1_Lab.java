interface Area {
	public float pi = 3.14f;
	public float compute(float a, float b);
}

class Rectangle implements Area {
	@Override
	public float compute(float a, float b) {
		return a * b;
	}
}
class Circle implements Area {
	@Override
	public float compute(float a, float b) {
		return pi * b;
	}
}

public class Interface1_Lab {
	public static void main(String[] args) {

		java.util.Scanner sc = new java.util.Scanner(System.in);

		// Area rect = new Rectangle();
		// Area circle = new Circle();
		Area area;

		System.out.print("Enter the length and breadth for the Rectangle: ");
		float length = sc.nextFloat(), breadth = sc.nextFloat();
		// float area_Rect = rect.compute(length, breadth);
		area = new Rectangle();
		float area_Rect = area.compute(length, breadth);
		System.out.println("Area of the Rectangle is: " + area_Rect);

		System.out.print("Enter the radius for the Circle: ");
		float rad = sc.nextFloat();
		// float area_Circle = circle.compute(rad, rad);
		area = new Circle();
		float area_Circle = area.compute(rad, rad);
		System.out.println("Area of the Circle is: " + area_Circle);
	}
}