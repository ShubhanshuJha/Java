// import java.io.*;
import java.util.*;
// import java.text.*;
import java.math.*;
// import java.util.regex.*;

public class BigIntegerPlusMult {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        BigInteger sum,mult;
        BigInteger a=new BigInteger(str1);
        BigInteger b=new BigInteger(str2);
        sum=a.add(b);
        mult=a.multiply(b);
        System.out.println("Their addition is: "+sum);
        System.out.println("Their multiplication is: "+mult);       
    }
}