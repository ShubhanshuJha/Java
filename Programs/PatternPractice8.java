import java.util.Scanner;

public class PatternPractice8 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        
        for (int i = n-1; i >= 0; i--) {
            for (int a = 0; a < i; a++) {
                System.out.print("  ");
            }
            if (i == n-1) {
                System.out.print("0  ");
            }
            
            for (int b = i; b <= n-1; b++) {
                System.out.print(b+"  ");
            }
            
            System.out.println();
        }
    }
}