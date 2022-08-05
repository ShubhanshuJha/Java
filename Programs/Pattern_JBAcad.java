/*Take n from the user and make a n x n matrix. Fill the matrix with the following criteria:
-> Primary Diagonal of matrix = 0
-> Closest to Primary Diagonal of the matrix = 1
-> Second closest to Primary Diagonal of the matrix = 2
-> Third closest to Primary Diagonal of the matrix = 3
 and so on.
 E.g. Enter the value of n: 5
		0 1 2 3 4
		1 0 1 2 3
		2 1 0 1 2
		3 2 1 0 1
		4 3 2 1 0 */

public class Pattern_JBAcad{
	public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int temp = (int)Math.abs(j - i);
                matrix[i][j] = temp;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }        
    }
}