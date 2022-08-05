import java.lang.*;
import java.io.*;
import java.util.*;

class Decimal_To_Binary{
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
		bw.write("Enter the number to get its Binary: "); bw.flush();
		int val = Integer.parseInt(br.readLine());
		// inbuiltMethod(val);
		bitManipulating(val);
	}
	static void inbuiltMethod(int num) throws IOException{
		bw.write(Integer.toBinaryString(num)); bw.flush();
	}
	static void bitManipulating(int num) throws IOException{
		String res="";
		if (num == 0) res="0";
        else
	        while(num != 0){
	            res += (num&1);
	            num >>= 1;
	        }
        StringBuilder str = new StringBuilder(res);
        res=String.valueOf(str.reverse());
		bw.write(res); bw.flush();
	}
}