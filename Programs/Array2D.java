import java.util.Scanner;

public class Array2D{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the rows and columns for the 2D Array: ");
		int rows = sc.nextInt();
		int columns  = sc.nextInt();

		int arr[] [] = new int[rows] [columns];

		//First loop repeats the Second loop, rows times in this case
		for (int i = 0; i < rows; i++) {
			//Second loop forms an array of size columns in this case
			for (int j = 0; j < columns; j++) {
				System.out.printf("Enter the arr[%d][%d]",i,j,"value: ");
				arr[i] [j] = sc.nextInt();
			}
		}

		// //2D Arrays can be formed in this manner as well
		// int arr[][] = {
		// 	{1,2,3,4,5},
		// 	{10,20,30,40,50},
		// 	{100,200,300,400,500}
		// };

		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < columns; j++) {
				System.out.print(arr[j][i]+" ");
			}
			System.out.println();
		}
	}
}