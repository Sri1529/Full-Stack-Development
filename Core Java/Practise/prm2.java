package Practise;
import java.util.*;
public class prm2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
	 int count=0;
	 
          for(int i=1;i<n;i++)
          {
        	    
        	  count=0;
        		for(int j=1;j<=i;j++)
        		{
        			if(i%j==0)
            		{
            			count++;
            		}
        		}
        	  
        	  
        	  if(count==2)
        	  {
        		  System.out.println(i);
        		  
        		 
        	  }
          }
	}

}
