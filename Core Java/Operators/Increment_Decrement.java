package Operators;

public class Increment_Decrement {
	public static void main(String args[])
	{
		int a=12,b=12;
		int res1,res2;
		System.out.println("Value of a :"+a);
		
		res1 = a++;//12++
		System.out.println("Value of a :"+res1);
		
		
		System.out.println("Value of a after increment :"+a);//a got incremented
		
		
		System.out.println("Value of b :"+b);
		res2= --b;//--12 =11
		System.out.println("Value of b :"+res2);
		
		
	}

}
