/*  Implement a program to generate and display the next date of a given date. The date will be provided as day, month and
	year as shown in the below table. The output should be displayed in the format: day-month-year.
	Assumption: The input will always be a valid date.

Sample Input and Output:
------------------------------------------------------------------------
Sample  Input 				|	Expected Output
------------------------------------------------------------------------
Day = 1 			 		|  2-9-2015
Month = 9 					|
Year = 15					|
------------------------------------------------------------------------ */

import mypackages.io.*;
import java.io.*;

class GenNextDate__SelectionControlStructure {

	private static final Writer writer = new Writer(System.out);
	private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws IOException {
		writer.print("Enter Day: ");
		int day = Integer.parseInt(reader.readLine());
		writer.print("Enter Month: ");
		int month = Integer.parseInt(reader.readLine());
		writer.print("Enter Year: ");
		int year = Integer.parseInt(reader.readLine());

		String nextDate = getNextDate(day, month, year);
		writer.println(nextDate);
	}
	
	private final static String getNextDate(int day, int month, int year) {
		StringBuffer nextDate = new StringBuffer();
		final int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if (isLeap(year)) {
			mon[1] = 29;
		}
		day++;
		if (day > mon[month - 1]) {
			month++;
			if (month > 12) {
				year++;
				month = 1;
			}
			day = 1;
		}
		nextDate.append(day).append("-").append(month).append("-");
		if (year == 0) {
			nextDate.append("2000");
		} else if (year > 0 && year < 10) {
			nextDate.append("200").append(year);
		} else {
			nextDate.append("20").append(year);
		}
		return nextDate.toString();
	}
	private static final boolean isLeap(int year) {
		return year % 4 == 0 || year % 100 == 0 && year % 400 == 0;
	}
}