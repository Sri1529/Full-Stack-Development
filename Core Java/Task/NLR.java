package Task;
import java.util.*;
public class NLR {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the 3 number:");
		int N,L,R;
		 N=sc.nextInt();
		 L=sc.nextInt();
		 R=sc.nextInt();
		 
		 if(N>L&&N<R)
		 {
			 System.out.println("Yes "+N+ " lies between "+L+" and "+R);
		 }
		 else
		 {
			 System.out.println("No");
		 }

	}

}
