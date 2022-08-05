import java.io.*;
import java.lang.*;
import java.util.*;
import java.util.Collection;
import static java.lang.Math.*;
/*
author id: shubhanshu_jha
This is being used for the FastIO operations...
*/
public class Solution implements Runnable {  
    public void run() {
        InputReader input = new InputReader(System.in);
        PrintWriter output = new PrintWriter(System.out);
        int inpTest = input.nextInt();
        for (int i = 1; i <= inpTest; i++) {
            int inpN = input.nextInt();
            Deque<Long> deq = new LinkedList<>();
            for (int idx = 1; idx <= inpN; idx++)
                deq.offer(input.nextLong());
            long noOfCustWhoPaid = 1L;
            long currServed = Long.min(deq.peekFirst(), deq.peekLast()) == deq.peekFirst() ? deq.pollFirst() : deq.pollLast();
            while (!deq.isEmpty()) {
                if (deq.peekFirst() >= currServed && deq.peekLast() >= currServed) {
                    currServed = Long.min(deq.peekFirst(), deq.peekLast()) == deq.peekFirst() ? deq.pollFirst() : deq.pollLast();
                    noOfCustWhoPaid++;
                } else if (deq.peekFirst() >= currServed) {
                    currServed = deq.pollFirst();
                    if (deq.size() > 1)
                        deq.pollLast();
                    noOfCustWhoPaid++;
                } else if (deq.peekLast() >= currServed) {
                    currServed = deq.pollLast();
                    if (deq.size() > 1)
                        deq.pollFirst();
                    noOfCustWhoPaid++;
                } else {
                    deq.pollFirst();
                }
            }
            output.println("Case #" + i + ": " + noOfCustWhoPaid);
        }
        output.close();
    }
    static class InputReader {
        private InputStream stream;
        private byte[] buf = new byte[1024];
        private int curChar;
        private int numChars;;
        private SpaceCharFilter filter;
        private BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
 
        public InputReader(InputStream stream) {
            this.stream = stream;
        }
        
        public int read() {
            if (numChars==-1) 
                throw new InputMismatchException();
            
            if (curChar >= numChars) {
                curChar = 0;
                try {
                    numChars = stream.read(buf);
                }
                catch (IOException e) {
                    throw new InputMismatchException();
                }
                
                if(numChars <= 0)               
                    return -1;
            }
            return buf[curChar++];
        }
     
        public String nextLine() {
            String str = "";
            try {
                str = br.readLine();
            }
            catch (IOException e) {
                e.printStackTrace();
            }
            return str;
        }
        public int nextInt() {
            int c = read();
            
            while(isSpaceChar(c)) 
                c = read();
            
            int sgn = 1;
            
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            
            int res = 0;
            do {
                if(c<'0'||c>'9') 
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c)); 
            
            return res * sgn;
        }
        
        public long nextLong() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            long res = 0;
            
            do {
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            while (!isSpaceChar(c));
                return res * sgn;
        }
        
        public double nextDouble() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            int sgn = 1;
            if (c == '-') {
                sgn = -1;
                c = read();
            }
            double res = 0;
            while (!isSpaceChar(c) && c != '.') {
                if (c == 'e' || c == 'E')
                    return res * Math.pow(10, nextInt());
                if (c < '0' || c > '9')
                    throw new InputMismatchException();
                res *= 10;
                res += c - '0';
                c = read();
            }
            if (c == '.') {
                c = read();
                double m = 1;
                while (!isSpaceChar(c)) {
                    if (c == 'e' || c == 'E')
                        return res * Math.pow(10, nextInt());
                    if (c < '0' || c > '9')
                        throw new InputMismatchException();
                    m /= 10;
                    res += (c - '0') * m;
                    c = read();
                }
            }
            return res * sgn;
        }
        
        public String readString() {
            int c = read();
            while (isSpaceChar(c))
                c = read();
            StringBuilder res = new StringBuilder();
            do {
                res.appendCodePoint(c);
                c = read();
            } 
            while (!isSpaceChar(c));
            
            return res.toString();
        }
        
        public char nextChar() {
            return next().charAt(0);
        }
     
        public boolean isSpaceChar(int c) {
            if (filter != null)
                return filter.isSpaceChar(c);
            return c == ' ' || c == '\n' || c == '\r' || c == '\t' || c == -1;
        }

        public String next() {
            return readString();
        }
        
        public interface SpaceCharFilter {
            public boolean isSpaceChar(int ch);
        }
    }
    public static void main(String args[]) throws Exception {
        new Thread(null, new Solution(),"Solution",1 << 26).start();
    }
}
/*
Sample Input
4
2
1 5
4
1 4 2 3
5
10 10 10 10 10
4
7 1 3 1000000

Sample Output
Case #1: 2
Case #2: 3
Case #3: 5
Case #4: 2
*/
