import java.util.Scanner;

class solution_Cody_TM{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int endorsement = sc.nextInt();
		if (endorsement > 100) {
			System.out.println(endorsement+"\nThat's a lot");
		}
		else{
			System.out.println(endorsement);
		}
	}
}