package Assignment;
import java.util.*;
public class Area_of_circle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the radius of the circle:");
		float a =sc.nextFloat();
		double b=3.14*Math.pow(a,2);
		if(a==0)
		{
			System.out.println("The area of the circle is 0");
		}
		else 
		{
			System.out.println("The area of the circle is:"+b);
		}
		
		
//System.out.printf("b=%.2f",b);gives nly 2 decimal points in output
	}

}
