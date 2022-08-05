import java.io.*;
import java.util.*;
// Above package includes everything which is below:
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

public class ATC_GuessingGame_Solution{
	static List<String> stringList = new ArrayList<>();
/*	Generating a list of words from the text file 	*/
	private static void getStringList(String loc){
		try{
			File file = new File(loc);
			FileReader fr = new FileReader(file);
      		BufferedReader br = new BufferedReader(fr);
      		String s;
      		while((s = br.readLine()) != null) {
        		stringList.add(s);
      		}
		}catch (Exception e) {
	    }
	}

/*	Checking if the guess has exact match in the list 	*/
	private static int checkForExactMatch(String guess){
		int count = 0;
		for (String str : stringList) {
			if (guess.equals(str)) {
				count++;
			}
		}
		System.out.println(count);
		return count*100;
	}

/* Checking if the guess has semi-match in the list 	*/
	private static int checkForSemiMatch(String str){
		for (int idx = 0; idx < 3; idx++) {
			for (int compIdx = idx+1; compIdx < 4; compIdx++) {
				if (str.charAt(idx) == str.charAt(compIdx))
					return 0;
			}
		}
        int count = 0, flag;
        for (int idx = 0; idx < stringList.size(); idx++){
            flag = 0;
            String s = stringList.get(idx).toString();
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(str.charAt(i) == s.charAt(j)){
                        flag++;
                        continue;
                    }
                }
                if (flag == str.length()) {
                    count++;
                }
            }
        }
        System.out.println(count);
        return count*50;
	}

/*	Checking if one letter of guess has same order in list 	*/
	private static int checkForOneLetterSameOrder(String str){
		for (String s : stringList) {
			for (int i = 0; i < 4; i++) {
				if (str.charAt(i) == s.charAt(i)) {
					return 20;
				}
			}
		}
		return 0;
	}

/*	Checking if one letter of guess has different order in list 	*/
	private static int checkForOneLetterDifferentOrder(String str){
		for (int idx = 0; idx < 3; idx++) {
			for (int compIdx = idx+1; compIdx < 4; compIdx++) {
				if (str.charAt(idx) == str.charAt(compIdx))
					return 0;
			}
		}
        int count = 0, flag;
        for (int idx = 0; idx < stringList.size(); idx++){
            flag = 0;
            String s = stringList.get(idx).toString();
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(str.charAt(i) == s.charAt(j)){
                        flag++;
                        continue;
                    }
                }
                if (flag == str.length()) {
                    count++;
                }
            }
        }
        System.out.println(count);
		return count*10;
	}

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		String fileLocation = "\\Users\\shubh\\Documents\\Java\\Sample Files For Testing Folder\\Sample input file.txt";
		getStringList(fileLocation);

		char input;		int score;
		do{
			sc.reset();
		/*	Code to calc score of first player_guess1	*/
			score = 0;
			System.out.println("Player 1, Please enter your guess:");
			String player_guess1 = sc.next().toUpperCase();
			score = checkForExactMatch(player_guess1) + checkForSemiMatch(player_guess1);
			score = score + checkForOneLetterSameOrder(player_guess1) + checkForOneLetterDifferentOrder(player_guess1);
			System.out.println("Score of player 1 is: "+score);

		/*	Code to calc score of second player_guess2 	*/
			score = 0;
			System.out.println("Player 2, Please enter your guess:");
			String player_guess2 = sc.next().toUpperCase();
			score = checkForExactMatch(player_guess2) + checkForSemiMatch(player_guess2);
			score = score + checkForOneLetterSameOrder(player_guess2) + checkForOneLetterDifferentOrder(player_guess2);
			System.out.println("Score of player 2 is: "+score);

			System.out.println("Do you want to exit the game (Y/N)?");
			input = sc.next().charAt(0);
		}while(input == 'N' || input == 'n');
	}
}