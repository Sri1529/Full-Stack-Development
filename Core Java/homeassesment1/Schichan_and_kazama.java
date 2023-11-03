package homeassesment1;
import java.util.*;
public class Schichan_and_kazama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the standing point of Shinchan:");
		int a=sc.nextInt();
		System.out.println("Enter the standing point of Kazama:");
		int b=sc.nextInt();
		int distance=a-b;
		System.out.println("Enter the speed:");
		int speed=sc.nextInt();
		int time=distance/speed;
		
		if(a>1&&b>1&&distance<=1000)
		{
		
		System.out.println("THe time taken to reach Shinchan is: "+time);
		}
		else
		{
			System.out.println("Invalid input");
			
		}
			

	}

}
