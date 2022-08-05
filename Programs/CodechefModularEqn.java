/* package codechef; // don't place package name! */
import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class CodechefModularEqn{
	public static void main (String[] args) throws IOException{
	    BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
	    BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	    try {
	        int test_Case = Integer.parseInt(br.readLine());
	        while(test_Case-- > 0){
	            String[] input=br.readLine().split(" ");
	            long inputForN = Long.parseLong(input[0]);
	            long inputForM = Long.parseLong(input[1]);
	            
	            long result = 0;
				long[] arr=new long[(int)(inputForN+1)];
				Arrays.fill(arr, 1);

		        for(int i=2; i <= (int)inputForN; i++){
		            long temp = inputForM % i;
		            result += arr[(int)temp];
		            for(int j = (int)temp; j <= (int)inputForN; j+=i){
		                arr[j] += 1;
		            }
		        }
		        bw.write(result+"\n"); bw.flush();
	            // System.out.println(result);
	        }
	    } catch(Exception e){}
	}
}