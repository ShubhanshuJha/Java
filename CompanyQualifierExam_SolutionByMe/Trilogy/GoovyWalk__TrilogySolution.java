/* Groovy likes to have morning walk. He walks on a AxA matrix from start to finish.
The start is at the top left cell of the matrix, and the end is at the bottom right
cell. He can only ever walk downwards or rightwards. i.e. from the cell (i, j), he can
only go to (i + 1, j) or (i, j + 1). He can not go out of bounds of the array. A is
guarantedd to be an odd integer.

But, there's a problem, right at the centre of the matrix, there's a machine set up that
produces a toxic gas that has spread to B outer rings apart from the center cell. i.e. to
say, if B = 1 then all cells adjacent to the centre block, including which touch it on corners
(the whole outer ring) are also toxic.

Your task is to determine the no. of ways Groovy has, to reach the ending block from the
starting block while avoiding the toxic cells. Since, the no. can be very large, output
it to modulo 1e9 + 7.

For example, if A = 3 and B = 0, the grid will look like (0 are possible cells while X are toxic cells)
0 0 0 
0 X 0 
0 0 0

Sample Input: A = 5  B = 0
Sample Output: 34 
Sample Input: A = 3  B = 1
Sample Output: -1 */

public class GoovyWalk__TrilogySolution {
    private final static int NEG_INF = Integer.MIN_VALUE;
    private final static int M = (int)1000000007;
    
	public static void main(String[] args) {
	    // int A = 5;
	    // int B = 0;
        int A = 3;
        int B = 1;
		System.out.println("No. of ways to reach the end: " + solve(A, B)); // -1 represents that it's not possible to reach to the end
	}

	// This is a DP approach taking T.C. O(n ^ 2) and S.C. O(n ^ 2)
	public static int solve(int A, int B) {
	    int[][] path = new int[A][A];
	    
	    // Here, I'm creating the blockage, as per question
	    int mid = A >> 1;
	    for (int i = mid - B; i <= mid + B; i++) {
	        for (int j = mid - B; j <= mid + B; j++) {
	            path[i][j] = NEG_INF;
	        }
	    }
	    // Analysing whether condition worked or not
	    printMat(path);

	    // Filling the first row and the first column with 1
	    // If there's a blockage, then still the value won't become positive
	    // So opted for this technique.
        for (int i = 0; i < A; i++) {
           if (i > 0)
            path[i][0]++;
           path[0][i]++;
        }

        // Now, summing the value of upper cell and left cell
        // And, storing the value in the current cell. 
        for (int i = 1; i < A; i++) {
            for (int j = 1; j < A; j++) {
                if (path[i][j] != NEG_INF)
                    path[i][j] = path[i - 1][j] + path[i][j - 1];
            }
        }

        // Again, checking whether the logic is working or not
	    printMat(path);
	    // We'll see that our required task i.e. count of number of paths, is stored at the last cell of the path (matrix)

	    // If the last cell of the path matrix has negative value
	    // It means that there's no way to reach to the end
	    // Otherwise, return the value stored in the last cell.
	    return path[A - 1][A - 1] == NEG_INF ? -1 : path[A - 1][A - 1];
	}

	// Printing the path weightage
	private static void printMat(int[][] mat) {
		// This retrieves each row (i.e. array) from the matrix
	    for (int[] r : mat) {
	    	// This retrieves each value from the row (i.e. the array)
	        for (int i : r) {
	        	// If the value is Negative then printing 'X' for the ease
	        	// Otherwise printing the value.
	            System.out.print((i < 0 ? "X" : i) + " ");
	        }
	        System.out.println();
	    }
	    // Giving an extra line gap for output beautification.
	    System.out.println();
	}
}
