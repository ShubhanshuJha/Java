import java.io.*;

public class ConvertCaseOfChar{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the character: ");
		char input = (char)br.read();
		System.out.println("\nThe input is: "+input);
		System.out.println("Its Upper Case is: "+Character.toUpperCase(input));
		System.out.println("Its Lower Case is: "+Character.toLowerCase(input));
	}
}
class Character{
	static char toUpperCase(char ch){
		if ((int)ch < 91)
			return ch;
		int charVal = (int)ch - 32;
		return (char)charVal;
	}

	static char toLowerCase(char ch){
		if ((int)ch >= 91)
			return ch;
		int charVal = (int)ch + 32;
		return (char)charVal;
	}
}