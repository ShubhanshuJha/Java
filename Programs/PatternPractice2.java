import java.util.Scanner;

public class PatternPractice2 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("    ");
            }
            for (int k = i; k >= 1; k--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}