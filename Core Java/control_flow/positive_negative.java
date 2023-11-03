package control_flow;
import java.util.*;
public class positive_negative {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the number:");
		
		int a =sc.nextInt();
		
		if(a>0)
		{
			System.out.println(a+" is a positive number");
		}
		
		else if(a==0)
		{
			System.out.println(a+" is zero");
		}
		else
		{
			System.out.println(a+" is a negative number");
		}

	}

}
