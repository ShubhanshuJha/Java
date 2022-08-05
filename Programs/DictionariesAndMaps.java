import java.util.*;
import java.io.*;
class DictionariesAndMaps{
	public static void main(String[] argh) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		Map<String,Integer> myMap = new HashMap<String,Integer>(); 
		for (int i=0;i<n;i++) {
			String name=sc.nextLine();
			int phone=sc.nextInt();
			myMap.put(name,phone);
		}
		while (sc.hasNext()){
			String s=sc.next();
			if (myMap.get(s)!=null) {
				System.out.println(s+"="+myMap.get(s));
			}
			else{
				System.out.println("Not found");
			}
		}
		sc.close();
	}
}