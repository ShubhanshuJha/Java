/*An enum is a type that has a fixed list of possible values, which is specified when the enum is created.
In some ways, an enum is similar to the boolean data type, which has true and false as its only possible values.
However, boolean is a primitive type, while an enum is not. The definition of an enum types has the (simplified) form:
enum <enum-type-name> { <list-of-enum-values> } This definition cannot be inside a subroutine.
You can place it outside the main() routine of the program. The henum-type-namei can be any simple identifier.
enum Season { SPRING, SUMMER, FALL, WINTER }
By convention, enum values are given names that are made up of upper case letters, but that is a style guideline and not
a syntax rule. Enum values are not variables. Each value is a constant that always has the same value. In fact, the
possible values of an enum type are usually referred to as enum constants.*/

public class EnumExample{
	enum Day { SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY }
	enum Month { JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC }

	public static void main(String[] args) {
		Day day; // Declare a variable of type Day.
		Month mon; // Declare a variable of type Month.
		day = Day.SUNDAY; // Assign a value of type Day to day.
		mon = Month.MAY; // Assign a value of type Month to mon.

		System.out.print("Enter a string: ");
		System.out.print("My name is Shubhanshu, I was born in ");
		System.out.println(mon+"."); // Output value will be: MAY
		System.out.print("That’s the ");
		System.out.print(mon.ordinal());
		System.out.print("-th month of the year.");
		System.out.println("\t(Counting from 0, of course!)");
		System.out.print("Isn’t it nice to get to ");
		System.out.println(day); // Output value will be: SUNDAY
		System.out.println(day + " is the " + day.ordinal() + "-th day of the week.");
		// You can concatenate enum values onto Strings!
	}
}