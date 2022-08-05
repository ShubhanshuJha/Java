import java.util.*;
class ThreePalindrome{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    String revStr="";
    String str=sc.nextLine();
    int size=str.length();
    for (int i=size-1;i>=1;i++) {
      revStr+=str.charAt(i);
    }
    if (str.equals(revStr)) {
      System.out.println("Palindrome");
    }
    else {
      System.out.println("Impossible");
    }
  }
}