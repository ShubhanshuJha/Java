// Given a non negative integer A, following code tries to find all pair of integers (a, b) such that
// 1. a and b are positive integers
// 2. a <= b, and
// 3. a2 + b2 = A
// 4. 0 <= A <= 100000
import java.io.*;
import java.util.*;

class PairsOf_A_B_FromN{
	static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		bw.write("Enter the number to get its factors: "); bw.flush();
		// int val = Integer.parseInt(br.readLine());
		// ArrayList<ArrayList<Integer>> list = new ArrayList<>();
		// list = getPairsList(val);
		// System.out.println("The pairs of "+val+" as per the condition are:\n"+list);

		String[] input = br.readLine().split(" ");
		System.out.println(CountAllPairs(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
	}
	// This solves in O(sqrt(n))
	static ArrayList<ArrayList<Integer>> getPairsList(int A){
		ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        for (int a = 0; a * a < A; a++) {
            for (int b = a; b * b < A; b++) {
                if (a * a + b * b == A) {
                    ArrayList<Integer> newEntry = new ArrayList<Integer>();
                    newEntry.add(a);
                    newEntry.add(b);
                    ans.add(newEntry);
                }
            }
        }
        return ans;
	}
}