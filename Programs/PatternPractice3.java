import java.util.Scanner;

public class PatternPractice3 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < i - 1; j++) {
                System.out.print("  ");
            }
            for (int k = 1; k <= n-i+1; k++) {
                System.out.print("*    ");
            }
            System.out.println();
        }
    }
}