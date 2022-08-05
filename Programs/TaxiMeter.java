import java.util.Scanner;

public class TaxiMeter{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total distance: ");
		int totalDistance = sc.nextInt();
		double cost;
		if (totalDistance <= 250) {
			if (totalDistance == 0) {
				cost = 0.00;
				System.out.println("Cost= P"+ cost);				
			}
			else{
				cost = 40.00;
				System.out.println("Cost= P"+ cost);
			}
		}
		else{
			totalDistance = totalDistance - 250;
			cost = 40;
			if (totalDistance % 200 == 0) {
				double costPer200Meter = (totalDistance / 200)	* 2.50;
				cost += costPer200Meter;
				System.out.println("Total cost= P"+cost);		
			}
			else{
				double costPer200Meter = ((totalDistance / 200) * 2.50) + 2.50;
				cost += costPer200Meter;
				System.out.println("Total cost= P"+cost);
			}
		}
	}
}