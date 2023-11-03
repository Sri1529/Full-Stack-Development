package Task;
import java.util.*;
public class Perimeter_of_cuboid {

	public static void main(String[] args) {
		//4*l+b+h formula
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the length,breath,height: ");
		int a =sc.nextInt();
		int b =sc.nextInt();
		int c =sc.nextInt();
		int res=4*(a+b+c);
		
		System.out.println("The perimeter of the cuboid is: "+res);

	}

}
