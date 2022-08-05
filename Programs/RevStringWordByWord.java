import java.util.Scanner;

public class RevStringWordByWord{
	public static String revString(String s){
		int i = s.length() - 1;
     	String word = "";
     	while (i >= 0) {
     		while(i >= 0 && s.charAt(i) == ' ')i--;
     		int j = i;
     		if (i < 0)
     			break;
     		while(i >= 0 && s.charAt(i) != ' ')i--;
     		if (word.isEmpty())
     			word = word.concat(s.substring(i+1,j+1));
     		else
     			word = word.concat(" "+s.substring(i+1,j+1));
     	}
     	return word;
	}
    public static void main(String []args){
     	Scanner sc = new Scanner(System.in);

     	String s = sc.nextLine();
     	// String s = "The sky is blue.";
        System.out.println(revString(s));
    }
}