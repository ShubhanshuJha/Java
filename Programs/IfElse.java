import java.util.Scanner;
class IfElse {
public static void main(String args[])
{
int marksObtained, passingMarks;
passingMarks=33;
Scanner input=new
Scanner(System.in);
System.out.println("Enter the marks obtained by you");
marksObtained=input.nextInt();
if (marksObtained>=passingMarks) {
System.out.println("You are passed");
}
else {
System.out.println("You are fail");
}}}