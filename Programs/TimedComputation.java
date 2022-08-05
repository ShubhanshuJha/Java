import java.util.Scanner;

public class TimedComputation{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		long startTime; // Starting time of program, in milliseconds.
		long endTime; // Time when computations are done, in milliseconds.
		double time; // Time difference, in seconds.
		startTime = System.currentTimeMillis();

		System.out.print("Enter width and height: ");
		double width=sc.nextDouble();
		double height=sc.nextDouble();
		double hypotenuse = Math.sqrt( width*width + height*height );
		System.out.print("A triangle with sides "+width+" and "+height+" has hypotenuse ");
		System.out.println(hypotenuse);
		sc.close();

		System.out.println("\nMathematically, sin(x)*sin(x) + " + "cos(x)*cos(x) - 1 should be 0.");
		System.out.println("Let’s check this for x = 1:");
		System.out.print("=> sin(1)*sin(1) + cos(1)*cos(1) - 1 is ");
		System.out.println((int) (Math.sin(1)*Math.sin(1) + Math.cos(1)*Math.cos(1) - 1) );
		System.out.println("(There can be round-off errors when" + " computing with real numbers!)");

		System.out.print("\nHere is a random number: ");
		System.out.println( Math.random() );

		endTime = System.currentTimeMillis();
		time = (endTime - startTime) / 1000.0;		//here the time taken is converted in seconds
		System.out.print("\nRun time in seconds was: ");
		System.out.println(time);

	}
}