import java.util.Scanner;
import java.util.Arrays;

public class Computation_in_Array{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array: ");
		int n = sc.nextInt();
		int[] array = new int[n];

		System.out.println("Enter the elements: ");
		for (int i = 0; i < n; i++)
			array[i] = sc.nextInt();
		System.out.println("The elements in the array: ");
		for (int i : array)
			System.out.print(i+" ");
		int sum_res = sum(array);
		System.out.println("\nSum of the elements: "+sum_res);
		System.out.println("Average of the elements: "+sum_res/n);
		Arrays.sort(array);
		System.out.println("Highest element: "+array[n-1]+"\nLowest element: "+array[0]);
	}
	static int sum(int[] array){
		int sum = 0;
		for (int i : array) {
			sum += i;
		}
		return sum;
	}
}