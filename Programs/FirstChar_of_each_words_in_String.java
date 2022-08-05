import java.io.*;

class FirstChar_of_each_words_in_String{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		String str = br.readLine();
		firstChar(str);
		joinFirstChar(str);
	}
	private static void firstChar(String str){
		for (String s : str.split(" ")) {
			System.out.println(s);
		}
	}
	protected static void joinFirstChar(String str){
		String result = null;
		for (String s : str.split(" ")) {
			result = result + String.valueOf(s.charAt(0));
		}
		result = result.substring(4);
		System.out.println(result);
	}
}