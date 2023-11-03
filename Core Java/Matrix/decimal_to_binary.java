package Matrix;
import java.util.*;
public class decimal_to_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int nbr=sc.nextInt();
		int div;
		int res;
		while(nbr!=0)
		{
			div=nbr%10;
			nbr=nbr/10;
			res=div;
			System.out.println(res);
			
		}

	}

}
