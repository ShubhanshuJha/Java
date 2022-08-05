import java.util.Scanner;

public class AnagramHackerRank{

    static boolean isAnagram(String a, String b) {
        if(a.length()!=b.length()){
            return false;
        }
        int[] char_frequencies=new int[26];
        a=a.toLowerCase();
        b=b.toLowerCase();
        for(int i=0;i<a.length();i++){
            char current_char=a.charAt(i);
            Character.toLowerCase(current_char);
            int index=Character.toLowerCase(current_char)-'a';
            char_frequencies[index]++;
        }
        for(int i=0;i<b.length();i++){
            char current_char=b.charAt(i);
            int index=current_char-'a';
            char_frequencies[index]--;
        }
        for(int i=0;i<26;i++){
            if(char_frequencies[i]!=0){
                return false;
            }
        }
        return true;
    }
  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}