package Sorting;
import java.util.*;
public class Stack_practise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Stack<Integer>stack=new Stack<Integer>();
		
		stack.push(2);
		stack.push(4);
		stack.push(5);
		stack.push(6);
		boolean res=stack.isEmpty();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		stack.pop();
//		//boolean res=stack.isEmpty();
		int ss=stack.peek();
		int src=stack.search(4);
		int x=stack.size();  
		
		System.out.println(stack);
		System.out.println(res);
		System.out.println(ss);
		System.out.println(src);
		System.out.println("The stack size is: "+x); 
		
		for(int sr:stack)
		{
			System.out.print(sr+" ");
		}
		

	}

}
