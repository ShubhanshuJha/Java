import java.util.*;

public class EvenSizeXorSubArray {
    public static void main(String []args) throws Exception{
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        
        System.out.println(solution(arr, n));
    }
    private static int solution(int arr[], int n) {
        int ans = 0, XOR = 0;
        int prefix[] = new int[n];
     
        for (int i = 0; i < n; ++i){
            XOR = XOR ^ arr[i];
            prefix[i] = XOR;
        }
        HashMap<Integer, Integer> evenGroup = new HashMap<>();
        HashMap<Integer, Integer> oddGroup = new HashMap<>();
        
        oddGroup.put(0, 1);
     
        for (int i = 0; i < n; ++i){
            if (i % 2 == 1){
                if(oddGroup.containsKey(prefix[i])){
                    ans += oddGroup.get(prefix[i]);
                    oddGroup.put(prefix[i],oddGroup.get(prefix[i]) + 1);
                } else{
                    oddGroup.put(prefix[i], 1);
                }
            } else{
                if(evenGroup.containsKey(prefix[i])){
                    ans += evenGroup.get(prefix[i]);
                    evenGroup.put(prefix[i], evenGroup.get(prefix[i]) + 1);
                } else{
                    evenGroup.put(prefix[i], 1);
                }
            }
        }
        return ans;
    }
}