import java.util.*;
import java.lang.*;
public class ThreeProbDNA{
	public static int findStopCodon(String dnaStr, int startIndex, String stopCodon){
		int currIndex=dnaStr.indexOf(stopCodon, startIndex+3);
		while(currIndex != -1)
		{
			int diff=currIndex-startIndex;
			if (diff%3==0) {
				return currIndex;
			}
			else 
			{
				currIndex=dnaStr.indexOf(stopCodon,currIndex+1);
			}
		}
		return dnaStr.length();
	}
	// public void testFindStop(){
	// 	String dna="xxxyyyzzzTAAxxxyyyzzzTAAxx";
	// 	int dex=findStopCodon(dna,0,"TAA");
	// 	for (int i=0;i<=200 ;i++ ) {
	// 		if (dex%3!=0) {
	// 			System.out.println("Error on "+i);
	// 		}
	// 	System.out.println("Test Finished.");
	// 	}
	// }
	public static void main(String[] args) {
		String dna="ATGyyyzajkhzzTAAxxxyyykakldzzzTAAxx";
		int dex=findStopCodon(dna,0,"TAA");
			if (dex%3!=0) {
				System.out.println("Error on: 9");
			}
	}
}	