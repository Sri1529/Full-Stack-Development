package Operators;
import java.util.*;
public class Ternary_operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int a,b,c,d;
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter the 3 numbers:");
    a=sc.nextInt();
    b=sc.nextInt();
    c=sc.nextInt();
    
    d=c>(a>b?a:b)?c:((a>b)?a:b);
    System.out.println("Largest number:"+d);
    
	}

}
