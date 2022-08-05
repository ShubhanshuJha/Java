import java.util.*;
import java.lang.*;
public class FindGene{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String gene="";
		System.out.println("Enter the dna:");
		String dna=sc.nextLine();
		int startIndex=dna.indexOf("ATG");
		int currIndex=dna.indexOf("TAA", startIndex+3);
		if(currIndex!=-1){
			if ((currIndex-startIndex)%3==0){
				gene=dna.substring(startIndex, currIndex+3);
			}
			else{
				currIndex=dna.indexOf("TAA", currIndex+1);
			}
		}
		System.out.println("DNA strand is: "+dna);
		System.out.println("Gene is: "+gene);
	}
}