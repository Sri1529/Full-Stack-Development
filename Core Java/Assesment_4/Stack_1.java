package Assesment_4;
import java.util.*;


public class Stack_1 {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		
		Stack<Integer>stack=new Stack<Integer>();
		
		stack.push(1);
		stack.push(2);
		stack.push(4);
		stack.push(0);
		stack.push(3);
		
		int n=stack.size();
		
		stack.pop();
		//stack.pop();
		//stack.pop();
		
		
		
		System.out.println("Size of the stack:"+n);
		System.out.println(stack);
		
		boolean result=stack.isEmpty();
		
		if(result==true)
		{
			
			System.out.println("The stack is empty");
		}
		else if(n>stack.size())
		{
			System.out.println("The stack is not full");
		}
		else
		{
			System.out.println("The stack is full");
		}
		
		
		
		

	}

}
