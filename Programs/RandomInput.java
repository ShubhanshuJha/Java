public class RandomInput{
    int n;
    int arr[];
    public RandomInput(int n){
        this.n = n;
        arr=new int[n];
    }
    public int[] random(){
        int limit = 10000;
        if (limit <= n)
            limit = ((n<<1)+(n>>1));

        for (int i=0; i<n; i++){
            arr[i] = (int)(Math.random() * limit) + 1;
        }
        return arr;
    }
}
// import java.io.*;

// public class RandomInput{
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int n = Integer.valueOf(br.readLine());
        
//         String[] arr = new String[n];
        
//         for(int i=0; i<n; i++){
//             System.out.print(i);
//             arr[i] = br.readLine();
//         }
//         int idx = Integer.valueOf(br.readLine());
//         System.out.print(arr[idx]);
//         br.close();
//     }
// }