package Task;
import java.util.*;
public class Swapping_two_numbers {

	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter the A value:");
		
		int a=sc.nextInt();
		System.out.println("Enter the B value:");
		int b=sc.nextInt();
		int temp=0;
		
//		 temp=a;
//		 a=b;
//		 b=temp;  2 ways r there to swap....mentioned below
		
		 a=a+b;
		 b=a-b;
		 a=a-b;

		 
		 System.out.println("Now A=:"+a);
		 System.out.println("Now B=:"+b);
		 
		 		 

	}

}
