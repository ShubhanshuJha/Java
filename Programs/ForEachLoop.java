import java.util.Scanner;

class ForEachLoop{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a string: ");
		String s = sc.next();
		System.out.println("Displaying the Characters in the string in Upper Case:");
		for (char c : s.trim().toUpperCase().toCharArray()) {
			int charASCII = (int)c;
			System.out.println(c + ": ASCII value-> "+charASCII);
		}
		System.out.println("\nDisplaying the Characters in the string in Lower Case:");
		for (char c : s.toLowerCase().toCharArray()) {
			int charASCII = (int)c;
			System.out.println(c + ": ASCII value-> "+charASCII);
		}
	}
}