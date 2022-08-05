// HackerRank
// Java Strings Introduction
// String is "hello" and is "java". has a length of , and has a length of ; the sum of their lengths is .
// When sorted alphabetically/lexicographically, "hello" precedes "java"; therefore, is not greater than and the answer is No.
// When you capitalize the first letter of both and and then print them separated by a space, you get "Hello Java".

// Code
import java.util.*;

public class StringIntroductionHackerRank {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        System.out.println(A.length()+B.length());
        if(A.compareTo(B)>0){
            System.out.println("Yes");
            }
        else{
            System.out.println("No");
        }
        String A1=A.substring(0,1).toUpperCase()+A.substring(1);
        String B1=B.substring(0,1).toUpperCase()+B.substring(1);
        System.out.println(A1+" "+B1);
    }
}