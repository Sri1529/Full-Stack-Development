package Exam_2;
import java.util.*;
public class maths {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int a=sc.nextInt();
		int b=sc.nextInt();
		int difference=a-b;
		System.out.println("Enter the decimal number:");
		float c=sc.nextFloat();
		
		System.out.println("Difference:"+Math.abs(difference));
		System.out.println("Round:"+Math.round(c));
		System.out.println("Ceil:"+Math.ceil(c));
		System.out.println("floor:"+Math.floor(c));
		
		

	}

}
