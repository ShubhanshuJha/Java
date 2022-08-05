// Java program to sum values from 1 to n (input value)
import java.io.*;
import java.util.*;

class SumOfN_Num{
	static int count=0;
	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the value of n: ");
		int n = Integer.parseInt(br.readLine());
		int sum = getSum1(n);
		System.out.print("The sum is: "+sum);
		sum = getSum2(n);
		System.out.print("The sum is: "+sum);
		sum = getSum3(n);
		System.out.print("The sum is: "+sum);
		sum = getSum4(n);
		System.out.print("The sum is: "+sum);
		sum = getSum5(n);
		System.out.print("The sum is: "+sum);
	}

	static int getSum1(int n){
		count = 1;
		int result = (n*(n+1))/2;
		
		System.out.println("\nExecution happend "+count+" times.");
		return result;
	}

	static int getSum2(int n){
		count = 0;
		int result = 0;
		for (int i=1; i<=n; i++){
			count++;
			result += i;
		}
		System.out.println("\nExecution happend "+count+" times.");
		return result;
	}

	static int getSum3(int n){
		count = 0;
		int result = reqForGetSum3(n, 1);
		System.out.println("\nExecution happend "+count+" times.");
		return result;
	}
	static int reqForGetSum3(int n, int i){
		count++;
		if(i > n)
			return 0;
		return i + reqForGetSum3(n, i+1);
	}

	static int getSum4(int n){
		count = 0;
		int result = reqForGetSum4(n);
		System.out.println("\nExecution happend "+count+" times.");
		return result;
	}
	static int reqForGetSum4(int n){
		count++;
		if(n <= 0)
			return 0;
		return n + reqForGetSum4(n-1);
	}

	static int getSum5(int n){
		count = 0;
		int result = reqForGetSum3((n/2)-1, 1) + reqForGetSum3(n, n/2);
		System.out.println("\nExecution happend "+count+" times.");
		return result;
	}
}