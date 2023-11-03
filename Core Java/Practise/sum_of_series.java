package Practise;
import java.util.*;
public class sum_of_series {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
          Scanner sc= new Scanner(System.in);
          System.out.println("Enter the total number size");
          int n=sc.nextInt();
          
         double sum=0.0,i;
         for(i=1;i<n;i++)
         {
        	 sum=sum+1/Math.pow(i, 2);;
        	 
         }
         System.out.println(sum);
          
          
	}

}
