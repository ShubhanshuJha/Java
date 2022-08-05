// LeetCode Problem: Group  Anagrams
// Given an array of Strings, group anagrams together.
// Provided, all inputs will be in lowercase, & the order of
// your output does not matter.
// String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
// The Output should be:
// [
// 	["ate", "eat", "tea"],
// 	["nat", "tan"],
// 	["bat"]
// ]
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.LinkedList;
import java.util.List;
import java.util.Arrays;

public class GroupAnagrams_Solution{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		bw.write("Enter the total number of elements: ");
		bw.flush();
		int n = Integer.parseInt(br.readLine());

		bw.write("Enter the elements separating by a space: ");
		bw.flush();
		String input = br.readLine();
		String[] arr = new String[n];
		arr = input.split(" ");
		// String arr[] = {"eat", "tea", "tan", "ate", "nat", "bat"};
		Solution sol = new Solution();
		System.out.println(sol.groupAnagrams(arr));
	}
}
class Solution{
	public List<List<String>> groupAnagrams(String[] strs){
		Map<String, List<String>> map = new HashMap<>();
		for (String s : strs) {
			// For sorting the String
			char[] charArray = s.toCharArray();
			Arrays.sort(charArray);
			// This is the sorted String to be used as Key
			String sorted = new String(charArray);
			// Chacking if the key is already in the Map or not
			if (!map.containsKey(sorted)) {
				// If not present, then will create a new key having
				// a LinkedList as its corres. value
				map.put(sorted, new LinkedList<String>());
			}
			// Adding the String in the appropriate value (LinkedList)
			map.get(sorted).add(s);
		}
		// After getting the List values, we'll return it
		return new LinkedList<>(map.values());
	}
}