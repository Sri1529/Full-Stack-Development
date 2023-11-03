package Logical_practise;
import java.util.*;
public class String_buffer 
{
   public static void main(String args[])
     {
	   Scanner sc= new Scanner(System.in);
	   
	   System.out.println("Enter the string");
	   String rev= sc.next();
	   StringBuffer s= new StringBuffer(rev);
	   s.reverse();
	   String r= s.toString();
	   System.out.println(r);
	   if(r==rev)
	   {
		   System.out.println("Yes");
	   }
	   else
	   {
		   System.out.println("No");
	   }
	  
	   
     }
}
