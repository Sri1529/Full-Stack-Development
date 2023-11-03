package Exam_2;
import java.util.*;
public class Reverse_the_string 
{
	public static String reverseString(String str){  
	    StringBuilder sb=new StringBuilder(str);  
	    sb.reverse();  
	    System.out.println(sb);
	    return sb.toString(); 
	    
	}  
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string:");
		String str=sc.nextLine();
		
		reverseString(str);
		
		
		
		

	}

}
