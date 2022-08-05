import java.lang.*;
class ExcepDemo {
public static void main(String args[]) {
int num=120;
int a=0;
try {
num=num/a;
System.out.println(num);
}
catch(ArithmeticException e) {
System.out.println("You can not divide an integer by 0");
}
}}