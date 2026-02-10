package collections;
import java.util.*;

public class Stack_BalancedParenthesis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str = "[[[]]]]";
		Stack<Character> stack = new Stack<Character>();
		boolean flag = false;
		
		for(int i = 0; i<= str.length()-1; i++) {
			if(str.charAt(i) == '[') 
				stack.push('[');
			
			else {
				if(stack.isEmpty()) {
					flag = true;
					System.out.println("Not balanced");
					break;
				}
				stack.pop();
			}
		}
		
		if(stack.isEmpty() && !flag) System.out.println("Balanced");
		
		else if(!flag) System.out.println("Not Balanced");
	}

}
