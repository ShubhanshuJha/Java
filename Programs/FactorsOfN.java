// Given a number N, find all factors of N.
import java.io.*;
import java.util.*;

class FactorsOfN{
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		bw.write("Enter the number to get its factors: "); bw.flush();
		int val = Integer.parseInt(br.readLine());
		ArrayList<Integer> list = new ArrayList<>();
		list = getFactorsList(val);
		System.out.println("The factors of "+val+" are:\n"+list);
	}
	// This solves in O(sqrt(n))
	static ArrayList<Integer> getFactorsList(int A){
		ArrayList<Integer> lst = new ArrayList<>();
        for(int i=1; i*i<=A; i++)
            if(A%i == 0){
                lst.add(i);
                if(i*i != A)
                    lst.add(A/i);
            }
        Collections.sort(lst);
        return lst;
	}
}