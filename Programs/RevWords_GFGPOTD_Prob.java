// Reverse each word in a given string
/*Problem: Given a String. Reverse each word in it where the words are separated by dots.
Input: i.like.this.program.very.much
Output: i.ekil.siht.margorp.yrev.hcum
Input: pqr.mno
Output: rqp.onm
Input: qhm.ynfxi....xg.kn.u.ff.vr.jrpg..n.ytw.syq
Output: mhq.ixfny....gx.nk.u.ff.rv.gprj..n.wty.qys
Expected Time Complexity: O(|S|)		Expected Auxiliary Space: O(|S|) */

import mypackages.io.*;

class RevWords_GFGPOTD_Prob {

	private static final Writer writer = new Writer(System.out);
	private static final Reader reader = new Reader(System.in);

	public static void main(String[] args) {
		writer.print("Enter the string: ");
		String str = reader.nextLine();

		Solution ob = new Solution();
		writer.print("After reversing the charcater of each words in the String,\n\t" + 
					"the resultant string is: " + ob.reverseWords(str) + "\n");
	}
}

class Solution {
    String reverseWords(String S) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while (i < S.length()) {
        	while (j < S.length() && S.charAt(j) != '.') j++;
        	StringBuilder temp = new StringBuilder(S.substring(i, j));
        	temp.reverse();
        	sb.append(temp);
        	while (j < S.length() && S.charAt(j) == '.') {
        		sb.append(S.charAt(j));
        		j++;
        	}
        	i = j;
        }
        return sb.toString();
    }
}