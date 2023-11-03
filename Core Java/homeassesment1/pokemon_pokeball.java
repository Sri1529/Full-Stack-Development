package homeassesment1;
import java.util.*;
public class pokemon_pokeball {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the no.of.pokeball:");
		int pball=sc.nextInt();
		System.out.println("Enter the no.of.pokemon:");
		int pmon=sc.nextInt();
		
		if(pball>=1&&pmon<=8)
		{
			if(pball>=pmon) {
				System.out.println("1");
			}
			else
			{
				System.out.println("0");
			}
			
		
		}
		else
		{
			
				System.out.println("Invalid input");
			
		}
		
		
	}

}
