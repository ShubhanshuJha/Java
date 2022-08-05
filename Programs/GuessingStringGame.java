/*This code is not efficient approach*/
import java.io.*;
import java.util.*;
// Above package includes everything wiz. below:
// import java.io.BufferedReader;
// import java.io.FileReader;
// import java.io.IOException;

class GuessingStringGame{
	public static void main(String[] args) throws IOException{
		String fileLocation = "\\Users\\shubh\\Documents\\Java\\Sample Files For Testing Folder\\Sample input file.txt";
		Scanner sc = new Scanner(System.in);
		char input;
		int score;
		do{
			sc.reset();
		/*	Code to calc score of first player_guess1	*/
			score = 0;
			System.out.println("Player 1, Please enter your guess: ");
			String player_guess1 = sc.next();
			score = reader(fileLocation, player_guess1);
			if (score != 180) {
				score = guess(fileLocation, player_guess1);
			}
			System.out.println("Score of player 1 is: "+score);

		/*	Code to calc score of second player_guess2 	*/
			score = 0;
			System.out.println("Player 2, Please enter your guess: ");
			String player_guess2 = sc.next();
			score = reader(fileLocation, player_guess2);
			if (score != 180) {
				score = guess(fileLocation, player_guess2);
			}
			System.out.println("Score of player 2 is: "+score);

			System.out.println("Do you want to exit the game (Y/N)?");
			input = sc.next().charAt(0);
		}while(input == 'N' || input == 'n');
	}

	private static int guess(String loc, String input){
		int score = 0, idx = 0;
		try{
			File f1 = new File(loc);
			FileReader fr = new FileReader(f1);
      		BufferedReader br = new BufferedReader(fr);

      		List<String> stringList = new ArrayList<String>();
      		String s;

      		while((s = br.readLine()) != null) {
        		stringList.add(s);
      		}
      		score = compString(stringList, input);
		}catch (Exception e) {
	    }
		return score;
	}
	
	private static int compString(List words, String str){
		// int count = words.size(), flag = 0;
		for (int idx = 0; idx < 3; idx++) {
			for (int compIdx = idx+1; compIdx < 4; compIdx++) {
				if (str.charAt(idx) == str.charAt(compIdx))
					return 0;
			}
		}
        int count = 0, flag;
        for (int idx = 0; idx < words.size(); idx++){
            flag = 0;
            String s = words.get(idx).toString();
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

	private static int reader(String loc, String input){
		try{
			//Creation of File Descriptor for input file
			File f1 = new File(loc);
			//Creation of File Reader object
      		FileReader fr = new FileReader(f1);
      		//Creation of BufferedReader object
      		BufferedReader br = new BufferedReader(fr);

			//Intialize the word Array
      		String[] words = null;
      		String s;
      		//Intialize a flag as zero
      		int flag = 0;
      		//Reading Content from the file
      		while((s = br.readLine()) != null) {
      			//Split the word using space
        		words = s.split(" ");
        		for (String word : words){
        			//Search for the given word
                	if (word.equals(input)) {
                		//If Present increase the count by one
            	    	flag++;
                	}
          		}
      		}
      		//Check if flag is not equal to zero
      		if (flag != 0) {
      			return 180;
      		}
        	fr.close();
		}catch (Exception e) {
	    }
	    return 0;
	}
}