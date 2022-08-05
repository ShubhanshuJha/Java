import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        int test = Integer.parseInt(in.readLine());
        for (int t = 1; t <= test; t++) {
            int n = Integer.parseInt(in.readLine());
            String oldPass = in.readLine();
            int len = 7 - n;
            int upper = 1;
            int lower = 1;
            int dig = 1;
            int special = 1;
            StringBuilder newPass = new StringBuilder();
            for (char ch : oldPass.toCharArray()) {
                if (Character.isLetterOrDigit(ch)) {
                    if (Character.isLetter(ch)) {
                        if (Character.isUpperCase(ch)) {
                            upper--;
                        } else {
                            lower--;
                        }
                    } else {
                        dig--;
                    }
                } else if (ch == '#' || ch == '@' || ch == '*' || ch == '&') {
                    special--;
                }
                newPass.append(ch);
            }
            while (lower-- > 0) {
                len--;
                newPass.append('a');
            }
            while (upper-- > 0) {
                len--;
                newPass.append('A');
            }
            while (special-- > 0) {
                len--;
                newPass.append('&');
            }
            while (dig-- > 0) {
                len--;
                newPass.append('1');
            }
            while (len-- > 0) {
                newPass.append('a');
            }
            out.write("Case #" + t + ": " + newPass.toString() + "\n");
            out.flush();
        }
    }
}
