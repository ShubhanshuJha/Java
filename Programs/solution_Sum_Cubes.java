import java.util.Scanner;

public class solution_Sum_Cubes {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
        int[] n = new int[3];

        for (int i = 0; i < 3; i++) {
            n[i] = sc.nextInt();
        }
        int sum = 0;
        for (int j = 0; j < 3; j++) {
            sum += findCube(n[j]);
        }
        if (sum < 0) {
            System.out.println("Negative");
        }
        else {
            System.out.println("Positive");
        }
    }
    static int findCube(int n){
        return n*n*n;
    }
}