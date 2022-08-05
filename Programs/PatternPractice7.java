import java.util.Scanner;

public class PatternPractice7 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("   ");
            }
            System.out.print(i+1+"  ");
            for (int a = 0; a < i; a++) {
                System.out.print("0  ");
            }
            if (i > 0) {
                for (int a = 0; a < i-1; a++) {
                    System.out.print("0  ");
                }
                System.out.print(i+1+"  ");
            }
            System.out.println();
        }
    }
}