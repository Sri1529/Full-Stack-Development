package homeassesment1;
import java.util.*;
public class Leap_years {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the year:");
		int yr=sc.nextInt();
		if(yr>1&&yr<5000)
		{
		if(yr%4==0)
		{
			System.out.println("Leap year");
			
		}
		else
		{
			System.out.println("not leap year");
		}
		}
		else
		{
			System.out.println("Invalid input");
		}
	}

}
