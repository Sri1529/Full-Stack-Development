package Datatypes;
import java.util.*;

public class Test01 {
	
	public static void main(String args[])
	{
		Scanner sc =new Scanner(System.in);
		
		System.out.print("Enter the Stud ID");
		int Stud_ID =sc.nextInt();
		
		System.out.print("Enter the Student name");
		String Student_Name =sc.next();
		
		System.out.print("Enter the Mark 1");
		int Mark_1 =sc.nextInt();
		
		System.out.print("Enter the Mark 2");
		int Mark_2 =sc.nextInt();
		
		System.out.print("Enter the Mark 3");
		int Mark_3 =sc.nextInt();
		
		
		int total =Mark_1+Mark_2+Mark_3;
		float average =total/3;
		
		System.out.println("Total Marks:"+total);
		System.out.println("Average:"+average);
		
		
		
		
	}

}
