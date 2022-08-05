import java.io.*;
import java.util.*;

class MyString{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the string:");
		String str = br.readLine();

		System.out.println("\nThe string input is:\n"+str);
		System.out.println("Reversed output of the string is:\n"+reverseString(str));
		System.out.println("String input is palindrom? "+isPalindrome(str));
		System.out.println("ShortHanded output of the string is:\n"+ShortHanded(str));
		countSenten_and_Words(str);
	}

	public static String reverseString(String s){
		String revString = "";
		for (int i = s.length()-1; i >= 0; i--) {
			revString += s.charAt(i);
		}
		return revString;
	}

	private static String trimPunct(String str){
		String res = "";
		for (char ch : str.toCharArray()) {
			if (ch == ' ' || ch == ',' || ch == '.' || ch == '?' || ch == '!' || ch == '\'' || ch == ';' 
				|| ch == '-' || ch == ':') {
				continue;
			}
			res += ch;
		}
		res = res.toLowerCase();
		return res;
	}
	public static boolean isPalindrome(String s){
		String revStr = reverseString(trimPunct(s));
		if (revStr.equals(trimPunct(s)))
			return true;
		return false;
	}

	private static String removeVowels(String str){
		String res = "";
		for (String s : str.split(" ")) {
			if (s.charAt(0) == 'U' || s.charAt(0) == 'I') {
				res += s + " ";
				continue;
			}
			res += s.replaceAll("[aeiouAEIOU]", "") + " ";
		}
		return res;
	}
	public static String ShortHanded(String s){
		TreeMap<String, String> dict = new TreeMap<>();
		dict.put("and", "&");
		dict.put("to", "2");
		dict.put("you", "U");
		dict.put("for", "4");
		String res = "";
		for (String str : s.split(" ")) {
			if (dict.containsKey(str)) {
				res = res + dict.get(str).toString() + " ";
			}
			else{
				res = res + str + " ";
			}
		}
		return removeVowels(res);
	}

	private static int numberOfSentence(String str){
		int count = 0;
		for (String s : str.split("[.,?!]")) {
			count++;
		}
		return count;
	}
	private static int numberOfWords(String str){
		int count = 0;
		for (String s : str.split(" ")) {
			if (s.length() > 3)
				count++;
		}
		return count;
	}

	public static void countSenten_and_Words(String str){
		System.out.println("Number of sentences is "+numberOfSentence(str)+
			"\nNumber of words is "+numberOfWords(str));
	}
}