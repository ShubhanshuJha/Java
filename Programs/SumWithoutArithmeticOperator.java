// Sum of two numbers without using arithmetic operators
// Input - Output:
//		5 3 = 8
//		6 233 = 239

import mypackages.io.Writer;
import mypackages.io.Reader;

class SumWithoutArithmeticOperator {
	public static void main(String[] args) {
		Writer writer = new Writer(System.out);
		Reader reader = new Reader(System.in);
		try {
			writer.print("Enter two numbers: ");
			int a = reader.nextInt();
			int b = reader.nextInt();
			writer.println("The sum is: " + sum(a, b));
		} catch (Exception e) {
			System.err.println(e);
		}
	}
	static int sum(int a, int b){
		StringBuffer sb1 = new StringBuffer(Integer.toBinaryString(a));
		StringBuffer sb2 = new StringBuffer(Integer.toBinaryString(b));
		StringBuffer sum = new StringBuffer();
        int n1 = sb1.length(), n2 = sb2.length();
        int diff = Math.abs(n1 - n2);
        if (n1 > n2) {
        	while (diff-- > 0) {
        		sb2.insert(0, '0');
        	}
        } else if (n1 < n2) {
        	while (diff-- > 0) {
        		sb1.insert(0, '0');
        	}
        }
        // System.out.println("A: " + sb1 + "\tB: " + sb2);  // Got same bit-length binary numbers
        char c = '0';
        for (int i = Integer.max(n1, n2) - 1; i >= 0; i--) {
        	char _a = sb1.charAt(i);
        	char _b = sb2.charAt(i);
        	if (_a == _b && _a == '0') {
        		sum.append(c);
        		if (c == '1')
        			c = '0';
        	} else if (_a == '0' && _b == '1') {
        		if (c == '1') {
        			sum.append('0');
        		} else {
        			sum.append('1');
        		}
        	} else if (_a == '1' && _b == '0') {
        		if (c == '1') {
        			sum.append('0');
        		} else {
        			sum.append('1');
        		}
        	} else {
        		if (c == '1') {
        			sum.append('1');
        		} else {
        			sum.append('0');
        			c = '1';
        		}
        	}
        }
        sum.append(c);
        sum = sum.reverse();
        // System.out.println("The sum is: " + sum);
        return Integer.parseInt(sum.toString(), 2);
    }
}