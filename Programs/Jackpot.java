import java.util.Scanner;

public class Jackpot{
     public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        
        int m = sc.nextInt();
        int n = sc.nextInt();

        int arr[] = new int[3];
        int flag1 = 0, flag2 = 0, flag3 = 0, j = 0;

        while(j < 3){
            int val = m % 10;
            m /= 10;
            arr[j] = val;
            j++;
        }

        flag1 = comp(arr[0],n);
        flag2 = comp(arr[1],n);
        flag3 = comp(arr[2],n);

        if(flag1 == 1 && flag2 == 1 && flag3 == 1){
            System.out.println("Jackpot!");
        }
        else{
            System.out.println("Nah");
        }
    }

    public static int comp(int n, int m){

        if (n == m) {
            return 1;
        }
        else{
            return 0;
        }
    }
}