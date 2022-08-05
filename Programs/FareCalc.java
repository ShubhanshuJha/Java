import java.io.*;

public class FareCalc{
	static double minFare = 9;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter kilometer to travel: ");
		int distance = Integer.parseInt(br.readLine());
		System.out.print("Choose your status:\nA. Student/Senior/PWD(20%)"+
			"\nB. Regular\nEnter choice: ");
		char choice = (char)br.read();
		System.out.print("Hello your fare is: "+calcFare(distance));
	}
	static double calcFare(int km){
		if (km == 0)
			System.exit(0);
		else if (km > 4){
			int extra = km - 4;
			minFare += extra;
		}
		return minFare;
	}
}