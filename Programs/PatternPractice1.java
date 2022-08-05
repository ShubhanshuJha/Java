import java.util.Scanner;

public class PatternPractice1 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        for (int i = n; i > 0; i--) {
            for (int k = 0; k < n - i; k++) {
                System.out.print("  ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}