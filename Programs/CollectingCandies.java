import java.util.Scanner;
class CollectingCandies{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,t,temp,k=0,sum=0,s1=0;
        System.out.println("Enter the number of tests");
        t=sc.nextInt();
        long c[]=new long[100009];
        long s[]=new long[100009];
        for (int l=0;l<t;l++) {
            n=sc.nextInt();
            for (int i=0;i<n;i++) {
                c[i]=sc.nextLong();
            }
            for (int i=0;i<n;i++) {
                for (int j=i+1;j<n;j++) {
                    if (c[i]>c[j]) {
                        temp=(int) c[i];
                        c[i]=c[j];
                        c[j]=temp;
                    }
                }
            }
            for (int i=0;i<n;i++) {
                sum=(int) (sum+c[i]);
                s[k]=sum;
                k++;
            }
            for (int i=1;i<k;i++) {
                s1=(int) (s1+s[i]);
            }
            System.out.println(s1);
        }
    }
}