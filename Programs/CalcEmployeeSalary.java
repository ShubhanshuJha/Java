import java.util.Scanner;

public class CalcEmployeeSalary{

	public static double calcSalary(int n, double hourlyrate){
		int extraTime = 0;
		/* If worked hour is more than 40, then obtain the extra hour */
		if (n > 40)
			extraTime = n - 40;
		n = n - extraTime;
		double salary = (n * hourlyrate) + ((1.5 * hourlyrate) * extraTime);
		return salary;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter hours worked (-1 to end): ");
		int n = sc.nextInt();
		do{
			System.out.print("Enter hourly rate of the worker ($00.00): ");
			double rate = sc.nextDouble();

			System.out.println("Salary is "+calcSalary(n, rate));
			System.out.print("\nEnter hours worked (-1 to end): ");
			n = sc.nextInt();
		}while (n != -1);
	}
}