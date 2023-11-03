package Assignment;
import java.util.*;
public class Tech_number {

	public static void main(String[] args) {
		
	int nb,count=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the number:");
		int nbr=sc.nextInt();
		int temp=nbr;
		
			nb=nbr%100;
			nbr=nbr/100;
			
			int one=nb;
			int two=nbr;
			
			int fin=one+two;
			//System.out.println(fin);
			int sqr=(int) Math.pow(fin,2);
			
			if(temp==sqr)
			{
				System.out.println(sqr+" is a tech nbr");
			}
			else
			{
				System.out.println(sqr+" is not a tech nbr");
			}
			
			
			
			
			
			
	
	
		
		
		
		
		
		
		
		
				
		
		
		
	    

	}

}
