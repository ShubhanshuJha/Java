// Question to be attempted in C->
/*
P*R+T-
A = 65, a = 97
B = 66, b = 98
Z = 90, z = 122
p*r+t-

if(x[i] >= 'A' && x[i] == 'Z')
x[i] += 32
i++
*/

import java.util.Scanner;

public class PatternPractice5 {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);

        int n = console.nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n-i; j++) {
                System.out.print("* ");
            }
            for (int k = 0; k < 2*i+1; k++) {
                System.out.print("  ");
            }
            for (int l = 0; l < n-i; l++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < n; j++) {
            for (int a = 0; a < j+1; a++) {
                System.out.print("* ");
            }
            for (int b = 0; b < 2*n-1-2*j; b++) {
                System.out.print("  ");
            }
            for (int c = 0; c < j+1; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}