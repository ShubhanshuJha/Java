import java.util.Scanner;

public class ArraysAvgMarks{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of the students: ");
		int n=sc.nextInt();
		int marks[]=new int[n];
		System.out.println("Enter the marks now: ");
		for (int i=0;i<n;i++) {
			marks[i]=sc.nextInt();
		}
		int averageMarks=0;
		for (int i=0;i<n;i++) {
			averageMarks= averageMarks+marks[i];
		}
		averageMarks/=n;
		System.out.println("The average marks are "+averageMarks);
	}
}