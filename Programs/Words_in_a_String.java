import java.io.*;

public class Words_in_a_String{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string: ");
		String str = br.readLine();
		printWords(str);
	}
	private static void printWords(String str){
		for (String s:str.split(" ")) {
			System.out.println(s);
		}
	}
}