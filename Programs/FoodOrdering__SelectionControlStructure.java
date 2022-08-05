/*
Food Corner home delivers vegetarian and non-vegetarian meals to its customers based on the order.
A vegetarian combo costs $12 per plate and a non-vegetarian combo costs $15 per plate. Apart from the cost per plate of food, customers are also charged
for home delivery based on the distance in kms from the restaurant to the delivery point. The delivery charges are as mentioned below:
	First 3km -> $0/km 	 Next 3km -> $1/km 	 Remaining kms -> $2/km

Given the type of food, quantity (no. of plates) and the distance in kms from the restaurant to the delivery point, implement a program to calculate the
final bill amount to be paid by a customer. The below information must be used to check the validity of the data provided by the customer: 
    Type of food must be 'V' for vegetarian and 'N' for non-vegetarian.
    Distance in kms must be greater than 0.
    Quantity ordered should be minimum 1.
If any of the input is invalid, the bill amount should be displayed as -1.
*/

import mypackages.io.*;
import java.util.HashMap;
import java.util.Scanner;

class FoodOrdering__SelectionControlStructure {

	private static final Writer write = new Writer(System.out);
	private static final Scanner read = new Scanner(System.in);

	public static void main(String[] args) {
		HashMap<Integer, Integer> perPlatePrice = new HashMap<>();
		perPlatePrice.put(((int)'v'), 12);
		perPlatePrice.put(((int)'n'), 15);
		perPlatePrice.put(((int)'V'), 12);
		perPlatePrice.put(((int)'N'), 15);

		char cont = '0';
		do {
			write.print("\nEnter Food Type (N or V) ? ");
			char foodType = read.next().charAt(0);
			write.print("Enter Quantity: ");
			int quantity = read.nextInt();
			write.print("Enter Distance: ");
			int distance = read.nextInt();

			int foodCost = perPlatePrice.get((int)foodType) * quantity;
			int deliveryCharge;
			if (distance <= 3) {
				deliveryCharge = 0;
			} else {
				deliveryCharge = 0;
				distance -= 3;
				for (int i = 1; i <= 3 && distance > 0; i++) {
					distance--;
					deliveryCharge++;
				}
				while (distance > 0) {
					distance--;
					deliveryCharge += 2;
				}
			}

			int totalPrice = foodCost + deliveryCharge;

			write.println("\nFood Costs: $" + foodCost);
			write.println("Delivery Charge: $" + deliveryCharge);
			write.println("Total Price: $" + totalPrice);

			write.print("Order Placed Successfully.\nWant to continue shopping (Y/N) ? ");
			cont = read.next().charAt(0);
		} while (cont == 'Y' || cont == 'y');
		write.println("Thank You.");
	}
}