import java.util.Scanner;
import java.util.LinkedList;

// public class JavaList {
//     public static void main(String[] args) {
//         /* Create and fill Linked List of Integers */
//         Scanner scan = new Scanner(System.in);
//         int N = scan.nextInt();
//         LinkedList<Integer> list = new LinkedList();
//         for (int i = 0; i < N; i++) {
//             int value = scan.nextInt();
//             list.add(value);
//         }
        
//         /* Perform queries on Linked List */
//         int Q = scan.nextInt();
//         for (int i = 0; i < Q; i++) {
//             String action = scan.next();
//             if (action.equals("Insert")) {
//                 int index = scan.nextInt();
//                 int value = scan.nextInt();
//                 list.add(index, value);
//             } else { // "Delete"
//                 int index = scan.nextInt();
//                 list.remove(index);
//             }
//         }
//         scan.close();
        
//         /* Print our updated Linked List */
//         for (Integer num : list) {
//             System.out.print(num + " ");
//         }
//     }
// }
public class JavaList{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of elements:");
        int N = sc.nextInt();
        System.out.println("Enter the elements:");
        LinkedList<Integer> list = new LinkedList();
        for (int i = 0; i < N; i++) {
            int value = sc.nextInt();
            list.add(value);
        }
        System.out.println("Enter the number of operations: ");
        int Op=sc.nextInt();
        for (int i=0;i<Op;i++) {
        	System.out.println("Enter the name of operation: ");
        	String action=sc.next();		
        	if(action.equals("Insert")){
        		System.out.println("Enter index and value saparated by space: ");
        		int index=sc.nextInt();
        		int insert=sc.nextInt();
        		list.add(index,insert);
        	}
        	else /*if (action.equals("Delete")) */{
        		System.out.println("Enter the index of element to be deleted: ");
        		int delete=sc.nextInt();
        		list.remove(delete);
        	}
        }
        	// else{
        	// 	System.out.println("Wrong Operation!!!");
        	// 	System.exit(1);
        	// }
        sc.close();
        System.out.println("The new list is: ");
        for (Integer element:list ) {
        	System.out.print(element+" ");	
        }
	}
}