import java.util.Scanner;

class solution_FindJeepney{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] loc = {"Labangon","Panganiban","Talamban","Capitol","Urgello","Banawa","Lahug","Guadalupe"};
		String[] num = {"12L","12C","13C","14D","01K","07B","04C","06F"};

		String val = sc.next();
		if (val.equals(num[0])) {
			System.out.println(loc[0]);
		}
		else if (val.equals(num[1])) {
			System.out.println(loc[1]);
		}
		else if (val.equals(num[2])) {
			System.out.println(loc[2]);
		}
		else if (val.equals(num[3])) {
			System.out.println(loc[3]);
		}
		else if (val.equals(num[4])) {
			System.out.println(loc[4]);
		}
		else if (val.equals(num[5])) {
			System.out.println(loc[5]);
		}
		else if (val.equals(num[6])) {
			System.out.println(loc[6]);
		}
		else if (val.equals(num[7])) {
			System.out.println(loc[7]);
		}
	}
}