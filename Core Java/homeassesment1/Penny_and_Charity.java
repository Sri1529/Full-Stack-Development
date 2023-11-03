package homeassesment1;
import java.util.*;
public class Penny_and_Charity {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of peoples:");
        int people=sc.nextInt();
        System.out.println("Enter the no of clothes:");
        int clothes=sc.nextInt();
       int max=clothes/people;
       
        if(clothes>1&&people<1000)
        {
        	System.out.println(max);
        }
        else
        {
        	System.out.println("-1");
        }
        
        
	}

}
