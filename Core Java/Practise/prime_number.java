package Practise;
import java.util.Scanner;
public class prime_number{
   public static void main(String arg[]){
      int count,flag=0;
      Scanner scanner = new Scanner(System.in);
     
      
     
     System.out.print("Enter the range : ");
     int  s=scanner.nextInt();
     System.out.print("Enter the value : ");
     int  n=scanner.nextInt();
     
     
      if(n<s)
      {
      for(int j=2;j<=s;j++)
      {
    	  
    	  count=0;
         
         for(int i=1;i<=j;i++)
         {
            if(j%i==0)
            {
            	count++;
            }
         }
         
       if(flag<n)
       {
         if(count==2)
         {
        	 
         System.out.print(j+" ");
         flag++;
        	 
         }
         }
      }
      
      
      }
      else
      {
    	  System.out.println("Invalid input...");
      }
   }
       
   }
