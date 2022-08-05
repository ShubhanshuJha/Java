import java.io.*;

public class HashFunction_Example{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		// bw.write("Enter the number of elements you want to deal with: ");
		// bw.flush();
		// int n = Integer.parseInt(br.readLine());

		// String[] str_Arr = new String[n];
		// int[] hash_Arr = new int[n];

		// bw.write("Enter the space separated values: ");
		// bw.flush();

		// String input = br.readLine();
		// str_Arr = input.split(" ");
		// int i = 0;
		// for (String s : str_Arr) {
		// 	bw.write(s+"\n");
		// 	bw.flush();
		// 	hash_Arr[i] = getHash(s);
		// 	i++;
		// }
		// for (int idx : hash_Arr) {
		// 	bw.write(idx+"\n");
		// 	bw.flush();
		// }
		bw.write(getHash("Cat")+"\n");
		bw.flush();
		bw.write(getHash("Dog")+"\n");
		bw.flush();
		bw.write(getHash("Cow")+"\n");
		bw.flush();
	}
	// This hash() isn't that efficient, it may cause collision.
	public static int getHash(String s){
		int len = s.length();
		int hashValue = getASCII_Val(s);
		return hashValue*(int)Math.pow(30,len-1);
	}
	public static int getASCII_Val(String s){
		int ascii_Val = 0;
		for (int i = 0; i < s.length(); i++) {
			ascii_Val += s.charAt(i);
		}
		return ascii_Val;
	}
}