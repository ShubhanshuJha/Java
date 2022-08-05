import java.util.Scanner;

public class StringMethodsExample{
	public static void main(String[] args) {
		Scanner con = new Scanner(System.in);
		System.out.print("Enter a string: ");
		// String str = con.next();
		String str = con.nextLine();
		String s2 = "Hello World";
		// System.out.println(str);
		System.out.print("The number of characters in ");
		System.out.print("the string "+str+" is : "+str.length()+" and in the string \"Hello World\" is ");
		System.out.println("Hello World".length()+".");		//This way can also be used.

		System.out.println("Implementation of some methods in String class:");
		System.out.println("s1.equals(s2) -> "+str.equals(s2));
		System.out.println("s1.equalsIgnoreCase(s2) -> "+str.equalsIgnoreCase(s2));
		System.out.println("s1.length() -> "+str.length());
		System.out.println("s1.charAt(N) [N=5] -> "+str.charAt(5));
		System.out.println("s1.substring(N,M) [N=2, M=6] -> "+str.substring(2,6));
		System.out.println("s1.indexOf(s2) -> "+str.indexOf(s2));
		System.out.println("s1.compareTo(s2) -> "+str.compareTo(s2));
		System.out.println("s1.toUpperCase() -> "+str.toUpperCase());
		System.out.println("s1.toLowerCase() -> "+str.toLowerCase());
		System.out.println("s1.trim() -> "+str.trim());
		System.out.println("s1.split(string) -> "+s2.split("l"));
	}
}