import java.util.Scanner;
class LeapYear {
public static void main(String args[]) {
Scanner in=new
Scanner(System.in);
long a,b,c;
System.out.println("Enter the year");
b=in.nextLong();
if (b!=0) {
a=(b%400==0)?(c=1): ((b%100==0)?(c=0) : ((b%4==0)?(c=1): (c=0)));
if (a==1) {
System.out.println(b+" is a leap year");
}
else {
System.out.println(b+" is not a leap year");
}
}
else{
System.out.println("Year zero does not exit");
}
}}
