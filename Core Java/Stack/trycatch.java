package Stack;
import java.util.*;
public class trycatch {
	

	static void pushelmnt(Stack<Integer>stk,int x)
	{
		stk.push(x);
		System.out.println("Push -> "+x);
		
		System.out.println("Stack "+x);
		
	}
	
	static void popelmnt(Stack<Integer>stk)
	{
		if(stk.isEmpty())
		{
			System.out.println("Stack is empty..");
		}
		else
		{
		System.out.print("pop ->");
		
		Integer x= stk.pop();
		System.out.println(x);
		System.out.println("Stack:"+stk);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<Integer>stk=new Stack<Integer>();
		System.out.println("Stack: "+stk);
		//try
		//{
			popelmnt(stk);
	//	}
		//catch(EmptyStackException e)
		//{
		//	System.out.println("empty stack");
		//}
		pushelmnt(stk,55);
		pushelmnt(stk,98);
		pushelmnt(stk,34);
		pushelmnt(stk,54);
		pushelmnt(stk,28);
		pushelmnt(stk,90);
		pushelmnt(stk,73);
		pushelmnt(stk,21);
		pushelmnt(stk,9);
		
		popelmnt(stk);
		popelmnt(stk);
		
		System.out.println(stk.peek());//prints the top of the element in stack that is last element....
		int loc=stk.search(55);
		System.out.println("Position of the element in stack: "+loc);
		
		

	}

}
