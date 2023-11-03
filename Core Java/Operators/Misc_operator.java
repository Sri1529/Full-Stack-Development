package Operators;
import java.util.*;
public class Misc_operator 
{
public static void main(String args[])
{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the number: ");
	int a =sc.nextInt();
	
	String rs=(a%2==0)?"Even Number" : "Odd Number";//misc operator
	System.out.println(rs);	
	sc.close();
}
}
