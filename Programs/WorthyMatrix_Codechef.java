// Wrong in Java
import java.util.*;
import java.io.*;
import java.lang.*;

class WorthyMatrix_Codechef{
	static long min(long x, long y){
		if(x < y){
        	return x;
    	}
    	return y;
	}
	public static void main(String[] args) throws java.lang.Exception{
		Scanner sc = new Scanner(System.in);
		long testCase = sc.nextLong();
		while(testCase-- > 0){
			long n = sc.nextLong();
			long m = sc.nextLong();
			long k = sc.nextLong();
			double matrixArr[][] = new double[(int)(n+1)][(int)(m+1)];
			for (int i = 0; i <= n; i++) {
				for (int j = 0; j <= m; j++) {
					if (i == 0 || j == 0) {
						matrixArr[i][j] = 0;
					}
					else{
						matrixArr[i][j] = sc.nextDouble();
					}
				}
			}
			for (int i = 0;  i <= n; i++) {
				double previous = 0;
				for (int j = 0; j <= m; j++) {
					matrixArr[i][j] += previous;
					previous = matrixArr[i][j];
				}
			}
			for (int i = 0;  i <= n; i++) {
				double previous = 0;
				for (int j = 0; j <= m; j++) {
					matrixArr[i][j] += previous;
					previous = matrixArr[i][j];
				}
			}
			long minVal = min(n,m);
			long result = 0;
			for (int len = 1; len <= minVal; len++) {
				for (int i = len; i <= n; i++) {
					for (int j = len; j <= m; j++) {
						if (matrixArr[i][j] + matrixArr[i-len][j-len]-matrixArr[i][j-len]-matrixArr[i-len][j] / (len*len) >= k) {
							result++;
						}
					}
				}
			}
			System.out.println(result-1);
		}
    }
}