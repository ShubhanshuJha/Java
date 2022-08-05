import java.io.*;
import java.util.Arrays;

class Student {
	protected String name;
	protected int Class, roll;
	Student(String name, int Class, int roll) {
		this.name = name;
		this.Class = Class;
		this.roll = roll;
	}
}
class Science extends Student {
	int Math, Chemistry;

	Science(String name, int Class, int roll, int Math, int Chemistry) {
		super(name, Class, roll);
		this.Math = Math;
		this.Chemistry = Chemistry;
	}

	void getData() {
		System.out.println("\tScore in Math: " + Math);
		System.out.println("\tScore in Chemistry: " + Math);
	}

	void showResult() {
		System.out.print("Name: " + super.name + ", Class: " + super.Class + ", Roll: " + super.roll + " marks in:\n");
		System.out.println("\tMath: " + Math);
		System.out.println("\tChemistry: " + Chemistry);
	}

	int total() {
		return Math + Chemistry;
	}
}

public class JavaOnInheritance {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("Enter student's name, class, roll (separated by a space): ");
		String[] basicInfo = br.readLine().split(" ");

		int Class = Integer.parseInt(basicInfo[1]);
		int roll = Integer.parseInt(basicInfo[2]);

		String[] streams = {"Science", "Arts"};
		System.out.println("Choose the stream from " + Arrays.toString(streams));
		String str = br.readLine();

		if (str.equalsIgnoreCase(streams[0])) {
			System.out.print("Enter the score of Math and Chemistry (separated by a space): ");
			String[] scores = br.readLine().split(" ");

			System.out.println();

			Science stud1 = new Science(basicInfo[0], Class, roll, Integer.parseInt(scores[0]), Integer.parseInt(scores[1]));
			System.out.println("The marks of the student " + basicInfo[0] + ":");
			stud1.getData();

			System.out.println();

			System.out.println("Total marks of the student " + basicInfo[0] + " is: " + stud1.total());
			System.out.println();
			System.out.println("Displaying the result of the student " + basicInfo[0] + ":");
			System.out.println();
			stud1.showResult();
		} else {
			System.out.println("Arts is still in the development...");
		}

	}
}