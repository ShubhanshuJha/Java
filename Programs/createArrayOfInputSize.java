import java.io.*;

public class createArrayOfInputSize{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("Enter the values: ");
		String values = br.readLine();
		String arr[] = createArray(values);
		for (String s : arr) {
			System.out.println(s);
		}
	}
	static String[] createArray(String values){
		int size = 0, i = 0;
		for (String s : values.split(" ")) {
			size++;
		}
		String[] array = new String[size];
		for (String s : values.split(" ")) {
			array[i] = s;
			i++;
		}
		return array;
	}
}