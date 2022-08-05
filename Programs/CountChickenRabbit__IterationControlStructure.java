/*  Implement a program to find the number of rabbits and chickens in a farm. Given the number of heads and legs of the
	chickens and rabbits in a farm, identify and display the number of chickens and rabbits in the farm.
	If the given input cannot make a valid number of rabbits and chickens, then display an appropriate message.
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
heads=150, legs=500	 		|  Chickens=50
							|  Rabbits=100
------------------------------------------------------------------------
heads=3, legs=11			|  The number of chickens and rabbits
							|  cannot be found
------------------------------------------------------------------------ */

import mypackages.io.*;
import java.io.*;

class CountChickenRabbit__IterationControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter the number of heads: ");
		int heads = Integer.parseInt(reader.readLine());
		writer.print("Enter the number of legs: ");
		int legs = Integer.parseInt(reader.readLine());
		countChickensAndRabbits(heads, legs);
	}
	
	private static void countChickensAndRabbits(int heads, int legs) {
		if ((legs & 1) != 0) {
			writer.println("The number of chickens and rabbits cannot be found");
		} else {
			int numOfRabbits = (legs - (heads << 1)) >> 1;
			int numOfChickens = heads - numOfRabbits;
			writer.println("Chickens=" + numOfChickens);
			writer.println("Rabbits=" + numOfRabbits);
		}
	}
}
/* Let the number of Head and Legs of Rabbits = X and that of Chickens = Y.
Then,  X + Y = heads && 4X + 2Y = legs
	=> Y = heads - X  &&  4X = (legs - 2Y)
	=> 4X = legs - 2*(heads - X)
	=> 4X = legs - 2heads + 2X
	=> 2X = legs - 2heads		=>  X = (legs - 2*heads) / 2
Put this value in eqn (i), Y = heads - [X's value]  */