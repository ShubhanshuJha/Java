import java.util.*;

public class TwoD_Array_MaxSumMinElem {
    public static void main(String []args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        List<List<Integer>> A = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            List<Integer> l = new ArrayList<>();
            for (int j = 0; j < M; j++) {
                l.add(sc.nextInt());
            }
            A.add(l);
        }
        
        System.out.println(solution(N, M, A));
    }
    static int solution(int n, int m, List<List<Integer>> A) {
        int[] minCol = new int[m];
        int[][] grid = new int[n][m];
        
        for (int i = 0; i < m; i++) {
            minCol[i] = A.get(0).get(i);
            grid[0][i] = minCol[i];
        }
        
        for (int i = 1; i < n; i++) {
            List<Integer> list = A.get(i);
            for (int j = 0; j < m; j++) {
                minCol[j] = Integer.min(minCol[j], list.get(j));
                grid[i][j] = list.get(j);
            }
        }
        
        int minVal = Integer.MAX_VALUE, idxI = 0, idxJ = 0;
        for (int i = 0; i < m; i++) {
            if (minVal > minCol[i]) {
                minVal = minCol[i];
                idxJ = i;
            }
        }
        int maxValRow = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            boolean found = false;
            maxValRow = Integer.MIN_VALUE;
            
            for (int j = 0; j < m; j++) {
                if (minVal == grid[i][j] && idxJ == j) {
                    idxI = i;
                    found = true;
                }
                maxValRow = Integer.max(maxValRow, grid[i][j]);
            }
            if (found) break;
        }
        for (int i = 0; i < m; i++) {
            if (grid[idxI][i] == maxValRow) {
                grid[idxI][i] = grid[idxI][idxJ];
                grid[idxI][idxJ] = maxValRow;
                break;
            }
        }
        int[] min_col = new int[m];
        Arrays.fill(min_col, Integer.MAX_VALUE);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++)
                min_col[j] = Integer.min(min_col[j], grid[i][j]);
        }
        return Arrays.stream(min_col).sum();
    }
}