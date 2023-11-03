package Assesment_1;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int a=22,b=33;
		int res=0;
		
		char op=sc.next().charAt(0);
		
		
		
	switch(op)
	
	{
	 
	case '+':
	res =a+b;
	break;
	
	case '-':
	res = a-b;
	break;
	
	case '*':
	res=a*b;
	break;
		
	case '/':
	res =a/b;
	break;
	
	default:
		System.out.println("Enter a correct operator");
	
	}
	
System.out.println(res);
	
	
}
}