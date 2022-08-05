import java.util.Scanner;
import java.lang.*;

public class summerInternship{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your pay rate and number of working hours per week:");
		double yourPayRate = sc.nextDouble();
		int numberOfHours = sc.nextInt();
		incomeBeforeandAfterTax(yourPayRate, numberOfHours);
	}
	public static void incomeBeforeandAfterTax(double d, int i){
		int totalHours = i*5;
		double income = d*totalHours;
		System.out.println("Income before the tax is $"+income);
		double newIncome = income-(income*0.14);
		System.out.println("Income after the tax is $"+newIncome);
		double expense1 = clothes_and_accessoriesCost(newIncome);
		double expense2 = schoolSuppliesCost(newIncome);
		newIncome = newIncome - (expense1+expense2);
		yourBondsCost(newIncome);
	}
	public static double clothes_and_accessoriesCost(double d){
		double c_and_a_Cost = d-(d*0.10);
		System.out.println("The money you spend on clothes and other accessories is $"+c_and_a_Cost);
		return c_and_a_Cost;
	}
	public static double schoolSuppliesCost(double d){
		double sc_supp_Cost = d-(d*0.01);
		System.out.println("The money you spend on school supplies is $"+sc_supp_Cost);
		return sc_supp_Cost;
	}
	public static void yourBondsCost(double d){
		double myBondsCost = d-(d*0.25);
		System.out.println("The money you spend to buy savings bonds is $"+myBondsCost);
		additionalBondsCost(myBondsCost);
	}
	public static void additionalBondsCost(double d){
		double additional_bond_Cost = 0.50*d;
		System.out.println("The money your parents spend to buy additional savings bonds for you is $"+additional_bond_Cost);
	}
}