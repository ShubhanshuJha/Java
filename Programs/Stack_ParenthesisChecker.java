/***	GFG Problem: Given an expression string x. Examine whether the pairs and the orders of “{“,”}”,”(“,”)”,”[“,”]” are
correct in exp. For example, the function should return 'true' for exp = “[()]{}{[()()]()}” and 'false' for exp = “[(])”.
Your Task:
This is a function problem. You only need to complete the function ispar() that takes a string as a parameter and returns a
boolean value true if brackets are balanced else returns false. The printing is done automatically by the driver code.	***/
import java.util.Scanner;
import java.util.Stack;

public class Stack_ParenthesisChecker{

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		// Number of test cases
		System.out.println("Enter the number of test cases:");
		int test = sc.nextInt();

		// Flushing input required taken int input, & now gonna take String input
		// So, we use
        
        while(test-- >0){
            //reading the string
            String st = sc.next();
            
            //calling ispar method of Paranthesis class 
            //and printing "balanced" if it returns true
            //else printing "not balanced"
            if(new Solution().ispar(st) == true)
                System.out.println("balanced");
            else
                System.out.println("not balanced");
        
        }
		
	}
}

class Solution{
    // Function to return if the paranthesis are balanced or not
    static boolean ispar(String x){
        Stack<Character> stack = new Stack<>();
        boolean isBalan = true;
        for(int i = 0; i < x.length(); i++){
            char ch = x.charAt(i);
            if(ch == '{' || ch == '(' || ch == '['){
                stack.push(ch);
                continue;
            }
            if(stack.isEmpty()){
                if(ch == ')' || ch == '}' || ch == ']'){
                    isBalan = false;
                    break;
                }
            }
            try{
                if(ch == '}'){
                    if(stack.peek() == '{')
                        stack.pop();
                    else{
                        isBalan = false;
                        break;
                    }
                }
                if(ch == ')'){
                    if(stack.peek() == '(')
                        stack.pop();
                    else{
                        isBalan = false;
                        break;
                    }
                }
                if(ch == ']'){
                    if(stack.peek() == '[')
                        stack.pop();
                    else{
                        isBalan = false;
                        break;
                    }
                }
            }catch(Exception e){}
        }
        if(!stack.isEmpty())
            isBalan = false;
        if(isBalan == true)
            return true;
        return isBalan;
    }
}