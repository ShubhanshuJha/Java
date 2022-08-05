import java.util.*;
import java.math.*;
class Operators{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double mealCost=sc.nextDouble();
		int tipPercent=sc.nextInt();
		int taxPercent=sc.nextInt();
		double tip=(mealCost*tipPercent/100);
		double tax=(mealCost*taxPercent/100);
		sc.close();
		int totalCost=(int) Math.round (mealCost+tip+tax);
		System.out.println(totalCost);
	}
}