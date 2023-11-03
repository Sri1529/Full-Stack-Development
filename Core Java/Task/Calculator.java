package Task;
import java.util.*;
public class Calculator {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number : ");
		
		double one=sc.nextDouble();
		double two =sc.nextDouble();
		
		System.out.println("Choose the operation (+,-,*,/):");
		
		char op=sc.next().charAt(0);
		double res=0;
		
		switch(op)
		{
		case '+':
			res=one+two;
			break;
			
		case '-':
			res=one-two;
			break;
			
		case '*':
			res=one*two;
			break;
			
		case '/':
			res=one/two;
			break;
			
			default:
				System.out.println("Enter a correct operator");
				
		}
		System.out.printf("%.2f,%c,%.2f = %.2f",one,op,two,res);
	}

}
