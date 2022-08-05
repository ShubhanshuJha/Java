import java.util.LinkedList;
import java.util.List;
import java.util.*;
import java.util.ArrayList;

public class LinkedList_Example{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Integer> linked_lst = new LinkedList<>();
		linked_lst.add(32);
		linked_lst.add(55);
		linked_lst.add(9);
		linked_lst.add(15);
		System.out.println("Displaying the current LinkedList:\n"+linked_lst);

		// We want to observe the diff. b/w ArrayList and LinkedList, so we implemented
		// a method getTimeDiff()
		// But, before that I'm creating a new ArrayList, and removing all elements from 
		// the LinkedList.
		List<Integer> array_lst = new ArrayList<>();
		linked_lst.clear();

		getTimeDiff(linked_lst);
		getTimeDiff(array_lst);

		System.out.println("When inserting elements at 0th index.");
		getTimeDiff_InsertAtZero(array_lst);
		getTimeDiff_InsertAtZero(linked_lst);
	}

	static void getTimeDiff(List<Integer> lst){
		long start_Time = System.currentTimeMillis();
		for (int i = 1; i <= 10000; i++) {
			lst.add(i);
		}
		long end_Time = System.currentTimeMillis();
		System.out.println("The list is of type : "+lst.getClass().getName()+
			"\nTook ---> "+(end_Time - start_Time)+" seconds");
	}

	static void getTimeDiff_InsertAtZero(List<Integer> lst){
		long start_Time = System.currentTimeMillis();
		for (int i = 1; i <= 10000; i++) {
			lst.add(0,i);
		}
		long end_Time = System.currentTimeMillis();
		System.out.println(lst.getClass().getName()+
			" ---> "+(end_Time - start_Time));
	}
}