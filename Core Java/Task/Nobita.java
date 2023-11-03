package Task;
import java.util.*;
public class Nobita {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the purchased price: ");
		int c=sc.nextInt();
		System.out.println("Enter the selling price: ");
		int s=sc.nextInt();
		int res=c-s;
		System.out.println("The profit is: "+Math.abs(res));
	}

}
