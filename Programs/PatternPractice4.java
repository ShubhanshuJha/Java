import java.util.Scanner;

public class PatternPractice4 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();

        for (int i = n; i >= 1; i--) {
            for (int j = i - 1; j >= 0; j--) {
                System.out.print("  ");
            }
            for (int k = 1; k < (n-i)+2; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int j = 1; j < n; j++) {
            System.out.print("  ");
            for (int k = 1; k <= j; k++) {
                System.out.print("  ");
            }
            for (int l = n-j; l >= 1; l--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}