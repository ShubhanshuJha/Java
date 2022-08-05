// Google Online Coding Challenge: People in a room
// The hostel administration of your college wants to keep exactly K students in one room. There are N number of beds represented 
// by a String S that includes only 0 and 1. Here, 1 denotes a student is present on the Ith bed and 0 denotes that there is no
// student on the Ith bed. Your task is to determine the possible ways to build a wall so that only K students are
// present in one room. Since the answer can be very large, print it modulo 10^9 + 7. If there is no way to fulfill
// the mentioned condition, then print '-1' (without quotes).

import java.io.*;
import java.util.Set;
import java.util.HashSet;

public class PeopleInARoom_Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int testCase = Integer.parseInt(br.readLine());
		while(testCase-- > 0){
			// Using this technic we can take multiple inputs in a single line
			String input = br.readLine();
			String integerInput[] = input.split(" ");
			int n = Integer.parseInt(integerInput[0]);
			int k = Integer.parseInt(integerInput[1]);
			String s = br.readLine();
			// System.out.println("N = "+n+" | K = "+k+"\nS = "+s);		//Test for taking input process
			int result = getNumberOfPossibleWays(n, k, s);
			System.out.println(result);
		}
	}
	static int getNumberOfPossibleWays(int numOfBeds, int numOfStudents, String arrangement){
		if (arrangement.isEmpty()) {
			return -1;
		}
		if (!arrangement.contains("1")) {
			return -1;
		}

		int count1 = countOne(arrangement);
		if (count1 < numOfStudents) {
			return -1;
		}

		int countPoss = 0;
		
		int startMark = 0;
		int start = 0; int countPair = 0;
		int end = (start + numOfStudents - 1);
		Set<String> seq = new HashSet<>();

		while(end < arrangement.length()){
			String temp = arrangement.substring(start, end);
			count1 = countOne(temp);
			if (count1 > numOfStudents) {
				break;
			}
			int endMark = end;
			int iter = 0;

			while(endMark < arrangement.length() && startMark < arrangement.length()){
				if (seq.contains(temp)) {
					countPoss--;
				}
				if (endMark >= arrangement.length() || startMark >= arrangement.length()) {
					break;
				}
				count1 = countOne(temp);
				if (count1 > numOfStudents) {
					break;
				}
				if (count1 < numOfStudents) {
					endMark++;
					temp = arrangement.substring(startMark, endMark+1);
					continue;
				}
				if (count1 == numOfStudents) {
					// System.out.println(temp);
					seq.add(temp);
					iter++;
					if (iter == 1) {
						end = endMark + 1;
					}
					startMark = endMark + 1;
					endMark = startMark + (numOfStudents-1);
					if (endMark >= arrangement.length() || startMark >= arrangement.length()) {
						break;
					}
					temp = arrangement.substring(startMark, endMark+1);
				}
			}

			if (!seq.isEmpty()){
				++countPoss;
			}
			startMark = 0;
		}
		// System.out.println("Current Possible Rooms:\n"+seq);
		if (countPoss < 0) {
			return 1;
		}
		if (countPoss >= (Integer.MAX_VALUE)/2) {
			return (int) Math.pow(10,9)+7;
		}
		return countPoss;
	}

	static int countOne(String str){
		int countOne = 0;
		for (char ch : str.toCharArray()) {
			if (ch == '1') {
				countOne++;
			}
		}
		return countOne;
	}
}

// Input/Output Sample:
// 4
// 13 10
// 000000000000
// -1
// 12 9
// 0000000100000
// -1
// 9 3
// 110100111
// 3
// 15 2
// 0111111111011111
// 1