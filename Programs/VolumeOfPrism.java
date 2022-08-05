import java.util.Scanner;
class VolumeOfPrism {
public static void main(String args[]) {
Scanner s=new
Scanner(System.in);
System.out.println("Enter the Area of base: ");
double b=s.nextDouble();
System.out.println("Enter the Height: ");
double h=s.nextDouble();
double volume=b*h;
System.out.println("Volume of prism is: "+volume);
}}