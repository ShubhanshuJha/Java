public class DavidAndTheTrainingRegiment {
	public static void main(String[] args) {
		// int n = 6;
		// int n = 4;
		int n = 50;
		System.out.println(training(n));
	}
	static int training(int input1) {
		if (input1 <= 3) {
			return input1;
		}
		int m = 1000000007;
		int[] trainingUnits = new int[input1];
		for (int i = 0; i < 3; i++)
			trainingUnits[i] = i + 1;
		for (int i = 3; i < input1; i++) {
			trainingUnits[i] = (trainingUnits[i - 1] + trainingUnits[i - 2] + trainingUnits[i - 3]) % m;
		}
		return trainingUnits[input1 - 1];
	}
}