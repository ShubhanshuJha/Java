// Sum of Digit is Pallindrome or not
// Given a number N.Find if the digit sum(or sum of digits) of N is a Palindrome number or not.
// Note:A Palindrome number is a number which stays the same when reversed.Example- 121,131,7 etc.
// Input: N = 56		Output: 1
// Input: N = 98		Output: 0
// Time Complexity:O(LogN)		Auxillary Space:O(1)

import mypackages.io.Writer;
import mypackages.io.Reader;

class Sum_If_Palindrome {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter a number: ");
			int n = reader.nextInt();
			writer.println("Is sum of digits of " + n + " a Pallindrome? " + 
							(isDigitSumPalindrome(n) == 1 ? "Yes" : "No"));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static int isDigitSumPalindrome(int N){
        int sum = 0;
        while (N > 0) {
            sum += N % 10;
            N /= 10;
        }
        int temp = sum;
        int rev_sum = 0;
        while (temp > 0) {
            rev_sum = rev_sum * 10 + temp % 10;
            temp /= 10;
        }
        return sum == rev_sum ? 1 : 0;
    }
}