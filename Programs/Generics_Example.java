import java.util.*;

public class Generics_Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Which type of pairing would you to like to do ?");
		System.out.println("Input e.g., String and Integer, Boolean and String...");
		String types = sc.nextLine();
		if (types.toLowerCase().equals("integer and string")) {
			System.out.println("Enter the space separated String and Integer values: ");
			int num = sc.nextInt();
			String str = sc.next();
			Generics_Pair_Class<Integer,String> p1 = new Generics_Pair_Class(num,str);
			p1.displayPair();
		}

		else if (types.toLowerCase().equals("boolean and string")) {
			System.out.println("Enter the space separated Boolean and String values: ");
			boolean bool = sc.nextBoolean();
			String str = sc.next();
			Generics_Pair_Class<Boolean, String> p1 = new Generics_Pair_Class(bool, str);
			p1.displayPair();
		}
		else if (types.toLowerCase().equals("string and string")) {
			System.out.println("Enter the space separated Boolean and String values: ");
			String str1 = sc.next();
			String str2 = sc.next();
			Generics_Pair_Class<String, String> p1 = new Generics_Pair_Class(str1, str2);
			p1.displayPair();
		}

		else if (types.toLowerCase().equals("integer and integer")) {
			System.out.println("Enter the space separated Integer and Integer values: ");
			int key = sc.nextInt();
			int val = sc.nextInt();
			Generics_Pair_Class<String, Integer> p1 = new Generics_Pair_Class(key, val);
			p1.displayPair();
		}

		else if (types.toLowerCase().equals("boolean and Integer")) {
			System.out.println("Enter the space separated Boolean and String values: ");
			boolean key = sc.nextBoolean();
			int val = sc.nextInt();
			Generics_Pair_Class<Boolean, Integer> p1 = new Generics_Pair_Class(key, val);
			p1.displayPair();
		}
		else if (types.toLowerCase().equals("string and Integer")) {
			System.out.println("Enter the space separated Boolean and String values: ");
			String key = sc.next();
			int val = sc.nextInt();
			Generics_Pair_Class<String, Integer> p1 = new Generics_Pair_Class(key, val);
			p1.displayPair();
		}
	}
}