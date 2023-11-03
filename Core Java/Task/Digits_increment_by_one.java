package Task;
import java.util.*;
public class Digits_increment_by_one {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        String x="";
        
        
        while(n>0)
        {
        	int nb=n%10;
        	nb=nb+1;
        	x=nb+x;
        	n=n/10;
        	
        	
        	
        	
        }
        System.out.print(x);
        
        
	}

}
