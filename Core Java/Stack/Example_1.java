package Stack;
import java.util.*;
public class Example_1 
{
     public static void main(String args[])
     {
    	 Stack<Integer>stk=new Stack<Integer>();
    	 boolean result=stk.empty();
    	 System.out.println("Whether the stack is empty or not?"+result);
    	  
    	 stk.push(66);  
    	 stk.push(78);
    	 stk.push(45);
    	 stk.push(90);
    	 stk.push(1);
   	 stk.pop();
   	 stk.pop();
    	 
    	 System.out.println("elements in the stack:"+stk);
    	 result=stk.empty();
    	 System.out.println("Whether the stack is empty or not?"+result);
    	 System.out.println("Elements in the stack are: ");
//    	 for(Integer str:stk)
//    	 {
//    		 System.out.print(str+" ");
//    	 }
    	 System.out.println(stk);
     	 
    	 
    	 
     }
}
