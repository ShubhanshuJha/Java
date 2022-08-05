import java.util.Scanner;
import java.lang.String;

public class solution_DIY_Pattern {

    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);

        String[] pattern = {"#","\\","/","_"};
        int[] n = new int[4];

        for (int i = 0; i < 4; i++) {
            n[i] = sc.nextInt();
        }
        int count = n[0];
        for (int j = 0; j < 4; j++) {
            print(pattern[j],n[j]);
            if (j == 2) {
                count++;
            }
            else{
                System.out.print("\n");
                print(" ",count);
                count++;
            }
        }
    }
    static void print(String s, int n){
        System.out.print(s.repeat(n));
    }
}