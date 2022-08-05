import java.util.*;
import java.io.*;

public class Snakes_and_Ladders_game{
	protected static int laddersBase[] = {2,8,20,32,41,74,82,85};
	protected static int laddersHeight[] = {23,34,77,68,79,88,100,95};

	protected static int snakesMouth[] = {29,38,47,53,62,86,92,97};
	protected static int snakesTail[] =  {9,15,5,33,37,54,70,25};

	protected static Random random = new Random();
	protected static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException{
		// BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the number of players (2/3/4): ");
		int numberOfPlayers = Integer.parseInt(br.readLine());
		int playersData[] = new int[numberOfPlayers];
		Arrays.fill(playersData, 1);
		// for (int i = 0; i < numberOfPlayers; i++) {
		// 	System.out.print("\nData : "+playersData[i]);
		// }
		String playersName[] = new String[numberOfPlayers];
		for (int i = 0; i < numberOfPlayers; i++) {
			System.out.print("\nPlayer "+(i+1)+" enter your name: ");
			playersName[i] = br.readLine();
		}

		while(true){
			for (int i = 0; i < numberOfPlayers; i++) {
				// clrScr();
				System.out.print("\n"+playersName[i]+", ");
				int diceValue = rollDice();
				System.out.print(diceValue);
				move(playersData, i, diceValue);
				checkSnake(playersData, i);
				checkLadder(playersData, i);
				System.out.print("\n"+playersName[i]+" you're at "+playersData[i]+" cell.");
				int winCheck = checkForWin(playersData, i);
				if (winCheck == 1){
					System.out.print("\nCongratulations "+playersName[i]+", you won.");
					System.exit(1);
				}
			}
		}
	}
	static int rollDice() throws IOException{
		int roll = 0;
		while(roll != 1){
			System.out.print("Press 1 to roll dice: ");
			roll = Integer.parseInt(br.readLine());
		}
		int diceValue = random.nextInt(7);
		while (diceValue == 0)
			diceValue = random.nextInt(7);
		return diceValue;
	}
	static void move(int[] data, int pos, int diceValue) throws IOException{
		if (data[pos] == 1) {
			if (diceValue == 6) {
				System.out.println("\nYou got 6.");
				int extraChance = rollDice();
				System.out.println(extraChance);
				data[pos] += extraChance;
			}
		}
		else{
			if (diceValue == 6) {
				System.out.println("\nYou got 6.\n");
				int extraChance = rollDice();
				System.out.println(extraChance);
				diceValue += extraChance;
			}
			data[pos] += diceValue;
		}
		if (data[pos] > 100) {
			data[pos] -= diceValue;
		}
	}
	static int checkForWin(int[] playersData, int idx){
		if (playersData[idx] == 100) {
			return 1;
		}
		return 0;
	}
	static void checkSnake(int[] playersData, int idx){
		int count = 0;
		for (int i : snakesMouth) {
			if (playersData[idx] == i){
				System.out.println("\nSnake found at "+playersData[idx]);
				playersData[idx] = snakesTail[count];
			}
			count++;
		}
	}
	static void checkLadder(int[] playersData, int idx){
		int count = 0;
		for (int i : laddersBase) {
			if (playersData[idx] == i) {
				System.out.println("\nLadder found at "+playersData[idx]);
				playersData[idx] = laddersHeight[count];
			}
			count++;
		}
	}
	static void clrScr(){
		try{
			new ProcessBuilder("cmd","/c","cls").inheritIO().start().waitFor();
		}catch(Exception e){
			System.out.println(e);
		}
	}
}