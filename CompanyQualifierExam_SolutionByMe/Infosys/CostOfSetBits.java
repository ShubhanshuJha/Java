import java.util.*;

class CostOfSetBits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        System.out.println(solution(input));
    }
    private static int solution(String str) {
        char[] bits = str.toCharArray();
        int n = bits.length;
        if (n == 1) {
            if (bits[0] == '0') return 1;
            return 0;
        }
        short flag = 1;
        for (char ch : bits)
            if (ch == '0') {
                flag = 0;
                break;
            }
        if (flag == 1) return 0;
        int oprCt = 0;
        for (int i = 0; i < n; i++) {
            int j = i;
            while (j < n && bits[j++] == '0');
            i = j;
            oprCt++;
            for (int k = i; k < n; k++) {
                if (bits[k] == '1')
                    bits[k] = '0';
                else
                    bits[k] = '1';
            }
        }
        return oprCt;
    }
}