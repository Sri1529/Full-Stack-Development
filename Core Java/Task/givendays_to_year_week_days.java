package Task;
import java.util.*;
public class givendays_to_year_week_days {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int year=0,weeks=0,days=0;
           Scanner sc= new Scanner(System.in);
           System.out.println("Enter the number of days:");
           int n=sc.nextInt();
           
           if(n>=365)
           {
        	    year=n/365;//to find years....
        	   n=n%365;//calculating reminder to get weeks and days
        	   weeks=n/7;
        	    days=n%7;
           }
           else
           {
        	   System.out.println("No of days is less than a year..");
           }
           System.out.println("No of year:"+year+" "+"No of weeks:"+" "+weeks+" "+"No of days: "+days);
	}

}
