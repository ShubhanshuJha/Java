/* Implement a method that takes an integer value and two lists of numbers. It must check if the value occurs the same number of times
in both sequences. In the following input example, the first line contains the value, the second line is the first list, the third
line is another list. All numbers are separated by whitespaces.
Sample Input 1:
		3
		8 8 3 3 2
		1 3 3 2
Sample Output 1: true

Sample Input 2:
		3
		9 8 4 3 2
		1 3 3 3
Sample Output 2: false */

import mypackages.io.*;
import java.util.List;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

class CompFreqOfNumInTwoLists_using_Collections {

	private static final Writer writer = new Writer(System.out);
	private static final Reader reader = new Reader(System.in);

	public static void main(String[] args) {
		writer.print("Enter the element: ");
		int elem = reader.nextInt();
		writer.print("Enter the elements of list1: ");
		String[] raw_input1 = reader.nextLine().split(" ");
		writer.print("Enter the elements of list1: ");
		String[] raw_input2 = reader.nextLine().split(" ");

		List<Integer> list1 = Arrays.stream(raw_input1).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());
		List<Integer> list2 = Arrays.stream(raw_input2).mapToInt(Integer::parseInt).boxed().collect(Collectors.toList());

		writer.println("Result: " + Counter.checkTheSameNumberOfTimes(elem, list1, list2));
	}
}

class Counter {
    public static final boolean checkTheSameNumberOfTimes(int elem, List<Integer> list1, List<Integer> list2) {
        return Collections.frequency(list1, elem) == Collections.frequency(list2, elem);
    }
}