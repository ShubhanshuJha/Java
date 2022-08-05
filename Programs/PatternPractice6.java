import java.util.Scanner;

public class PatternPractice6 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        
        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = 0; j < n-i-1; j++) {
                System.out.print("  ");
            }
            for (int j = 1; j <= i+1; j++) {
                System.out.print(j+" ");
                count += 1;
            }
            for (int k = count; k <= 2*i+1; k++) {
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}