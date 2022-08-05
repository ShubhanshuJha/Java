import java.util.Scanner;
/*  We can Overload the Method, if two or more Methods
are different in parameter*/
public class MethodsExample{
    static void printInSep_Lines(String s){
        for(char c : s.toUpperCase().toCharArray()){
            System.out.println(c);
        }
    }
    
     public static void main(String []args){
     	Scanner sc = new Scanner(System.in);

     	System.out.println("Press 1 to enter the string manually for the test:");
     	int choice = sc.nextInt();
     	String s1 = "Shubhanshu Jha";

     	if (choice == 1){
     		System.out.print("Enter the string:");
     		s1 = sc.next();
     	}	
        printInSep_Lines(s1);
    }
}