import java.util.Scanner;

class Factorial{
	public static void main(String arg[]){
        long fact = 1;
	
	    Scanner sc=new Scanner(System.in);
        long n = sc.nextLong();
 
	    for(int i = 1;i <= n; i++){
	    	fact = fact * i;
 	    }
  	    System.out.println(fact);
	}
}