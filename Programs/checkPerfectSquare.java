import java.util.Scanner;

public class checkPerfectSquare{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number to check: ");
        double num = sc.nextDouble();
        sc.close();
        double d=Math.sqrt(num);
        if (d-Math.floor(d)==0){
		  System.out.print(num+ " is a perfect square number.");
        }
	    else{
		  System.out.print(num+ " is not a perfect square number.");
        }
     }
}