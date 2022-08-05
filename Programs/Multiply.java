import java.util.Scanner;
class Multiply
{
public static void main(String args[])
{
int x,y,z;
System.out.println("Enter the integers to calculate their product");
Scanner in=new
Scanner(System.in);
x=in.nextInt();
y=in.nextInt();
z=x*y;
System.out.println("The product of the numbers is= "+z);
}}