// Uncommon Objects
// Problem: Given two strings A and B. Find the characters that are not common in the two strings.
// Input:
// 	A = geeksforgeeks
// 	B = geeksquiz
// Output: fioqruz

import mypackages.io.Writer;
import mypackages.io.Reader;
import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Iterator;

class UncommonObjects_GFG {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		writer.print("Enter two Strings:\n\t");
		String A = reader.next();
		String B = reader.next();

		String result = Solution.UncommonChars(A, B);
		writer.println("Output:\t" + result);
	}
}

final class Solution {
    public static final String UncommonChars(String A, String B) {
        HashSet<Object> setA = new HashSet<>();
        HashSet<Object> setB = new HashSet<>();
        char[] a = A.toCharArray();
        char[] b = B.toCharArray();

        for (int i = 0; i < A.length(); i++)
            setA.add(A.charAt(i));
        for (int i = 0; i < B.length(); i++)
            setB.add(B.charAt(i));
        
        HashSet<Object> temp1 = new HashSet<>(setA);
        HashSet<Object> temp2 = new HashSet<>(setB);
        temp1.retainAll(setB);
        temp2.retainAll(setA);
        temp1.addAll(temp2);
        
        setA.addAll(setB);
        
        PriorityQueue<Object> pq = new PriorityQueue<>();
        Iterator<Object> it = setA.iterator();
        
        while (it.hasNext()) {
            Object ch = it.next();
            if (!temp1.contains(ch))
                pq.offer(ch);
        }
        if (pq.isEmpty()) return "-1";
        
        String res = "";
        while (!pq.isEmpty())
            res += pq.poll();
        return res;
    }
}
// geeks geeks
// => -1
// characters alphabets
// => bclpr