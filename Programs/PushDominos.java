/*There are n dominoes in a line. Initially every dominoes is vertically upright. After each sec, the dominoes falling to left pushes its adjacent domino to the
left, & the dominoes falling to the right pushes its adjacent domino to the right. When there is 'R.L' or 'RL', then it stays still due to the balance of forces.
Sample Input1: "RR.L"
Sample Output1: "RR.L"
Sample Input2: ".L.R...LR..L.."
Sample Output2: "LL.RR.LLRRLL.." */

import static java.lang.System.*;
import java.util.*;

public class PushDominos {
    public static void main(String...args) {
        Scanner sc = new Scanner(in);
        out.print("Enter the string representing the n dominoes in line: ");
        String dominoes = sc.next();
        String finalState = pushDominos(dominoes);
        out.println("String representing the final state: " + finalState + "\n");
    }
    static String pushDominos(String dominoes) {
        char[] dom = dominoes.toCharArray();
        Queue<Pair> q = new LinkedList<>();
        for (int i = 0; i < dom.length; i++) {
            if (dom[i] != '.') {
                q.offer(new Pair(i, dom[i]));
            }
        }
        while (!q.isEmpty()) {
            Pair currDom = q.poll();
            if (currDom.dom == 'L') {
                if (currDom.idx > 0 && dom[currDom.idx - 1] == '.') {
                    q.offer(new Pair(currDom.idx - 1, 'L'));
                    dom[currDom.idx - 1] = 'L';
                }
            }
            else if (currDom.dom == 'R') {
                if (currDom.idx + 1 < dom.length && dom[currDom.idx + 1] == '.') {
                    if (currDom.idx + 2 < dom.length && dom[currDom.idx + 2] == 'L') {
                        q.poll();
                    } else {
                        q.offer(new Pair(currDom.idx + 1, 'R'));
                        dom[currDom.idx + 1] = 'R';
                    }
                }
            }
        }
        return String.valueOf(dom);
    }
}

class Pair {
    int idx;
    char dom;
    Pair(int idx, char dom) {
        this.idx = idx;
        this.dom = dom;
    }
}