// Conditional Product of Three Numbers
/* Implement a program to calculate the product of three positive integer values. However, if one of the integers is 7,
consider only the values to the right of 7 for calculation. If 7 is the last integer, then display -1.
Note: Only one of the three values can be 7.  */

import mypackages.io.*;

class ProdOfThreeNum__SelectionControlStructure {
	private static final Reader read = new Reader(System.in);
	private static final Writer write = new Writer(System.out);

	public static void main(String[] args) {
		write.println("Enter three numbers:");
		int[] nums = {read.nextInt(), read.nextInt(), read.nextInt()};

		int prod = 1;
		for (int i = 0; i < 3; i++) {
			prod *= nums[i];
			if (i < 2 && nums[i] == 7) prod = 1;
			if (i == 2 && nums[i] == 7) prod = -1;
		}
		write.println("Result: " + prod);
	}
}