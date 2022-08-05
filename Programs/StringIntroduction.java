import java.util.Scanner;

class StringIntroduction{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// String cars="Audi,Benz,Lamborghini,Buggatti,Ferari";
		String name="Shubhanshu Jha";
		System.out.println("Topics of Strings are:");

		System.out.println("String.charAt()\nString.length()");
		System.out.println("\tString.substring(starting index)\n\t2nd String.substring(starting index,ending index)");
		System.out.println("String.contains() \nString.equals()\nString.isEmpty");
		System.out.println("\tString.concat()\n\tString.replace()\n\tString.split()\n\tString.indexOf()");
		System.out.println("String.toLowerCase()\nString.toUpperCase()\nString.trim()");
		System.out.println();
		System.out.println("Length of "+name+" is "+name.length());

		System.out.print("Enter the index value: ");
		int n=sc.nextInt();
		System.out.println("Char at "+n+" is "+name.charAt(n));

		System.out.println();

		System.out.println("SubString from "+n+" is "+name.substring(n));

		System.out.println();

		System.out.print("Enter the wanted ending index value: ");
		int end=sc.nextInt();
		System.out.println("New Substring from "+n+" to "+end+" is "+name.substring(n,end));

		System.out.println(name.contains("Shubhanshu"));

		System.out.println();

		System.out.print("Enter a string to check whether it is same or not: ");
		String name2=new String("SJ");
		String name3=sc.next();
		System.out.println(name2.equals(name3));

		System.out.println();

		System.out.println("Checking whether name4 is empty or not...");
		String name4="Charp";
		System.out.println(name4.isEmpty());

		System.out.println(name.concat(" is Superb."));

		System.out.println("Char @name4 is updated as "+name4.replace(' ','S'));
		System.out.println();
		String favourite="My favourite car is Buggatti Veyron.,My favourite bike is Ducati Panigle.,My favourite color is Black and Blue.";
		String allFavs[]=favourite.split(",");
		for (String fav:allFavs) {
			System.out.println(fav);
		}

		System.out.println();
		System.out.print("Enter a Char to check its index: ");
		String na=sc.next();
		System.out.println(name.indexOf(na));
		System.out.println();

		System.out.println(name.toLowerCase());
		System.out.println();
		System.out.println(name.toUpperCase());

		System.out.println();
		String coding=" His Coding Level is Awesome.";
		System.out.println(coding.trim());
	}
}