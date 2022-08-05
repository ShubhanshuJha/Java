// Not Correct
import java.util.*;

public class MinCostEraseElems {
    public static void main(String[] args) {
        // int[] arr = {5, 4, 4, 2};
        // int[] arr = {1};
        int[] arr = {2, 4, 5};
        List <Integer> list = new ArrayList <> ();
        for(int i=0;i<arr.length; i++){
            list.add(arr[i]);
        }
        System.out.println(solution(list, list.size()));
    }
    private static int solution(List<Integer> arr, int n) {
        if (n == 1) return arr.get(0);
        TreeSet<Integer> ts = new TreeSet<>();
        int max = Integer.MIN_VALUE;
        for (int i : arr) {
            ts.add(i);
            max = Integer.max(max, i);
        }

        int minCost = ts.pollFirst();
        
        for (int i = 0; i < n; i++) {
            if (ts.contains(arr.get(i)))
                minCost += (max - arr.get(i));
        }
        return minCost + max;
    }
}