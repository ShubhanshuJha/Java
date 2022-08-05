// Count frequency from a user given list

import java.util.*;

public class FreqOfElemFromList{
    static int migratoryBirds(List<Integer> arr) {
        int[] count = new int[arr.size()];
        Arrays.fill(count, 0);
        int idx = 0;
        while (idx < arr.size()){
            count[arr.get(idx) - 1]++;
            idx++;
        }
        int max = count[0]; int res = max;
        for(int i = 0; i < count.length; i++){
            if(count[i] > max){
                max = count[i];
                res = i+1;
            }
        }
        return res;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        List<Integer> lst = new ArrayList<>();
        
        for(int i = 0; i < n; i++){
            int temp = sc.nextInt();
            lst.add(temp);
        }
        int max = migratoryBirds(lst);
        
        System.out.println(max);
    }
}