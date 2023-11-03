package Task;
import java.util.*;
public class conver_long_values_into_byte {

	public static void main(String[] args) {
		long a;
		byte b;
		Scanner s= new Scanner(System.in);
		System.out.print("Enter any long value:");
		a=s.nextLong();
		b=(byte)a;
		System.out.println("Conversion into byte:"+b);
	}

}
//some values will get lost during conversion of longer to small....
