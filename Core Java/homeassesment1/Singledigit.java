package homeassesment1;
import java.util.*;
public class Singledigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,count=0;
         Scanner sc=new Scanner(System.in);
         System.out.println("Enter the number:");
         int n=sc.nextInt();
        
         while(n>0||sum>9)
         {
        	 int ld=n%10;
        	 sum=ld+sum;
        	 n=n/10;
        	// System.out.println(ld);
        	 
        	 
         }
         
         //System.out.println(sum);
                 
        
         
         
         System.out.println(sum);
	}

}
