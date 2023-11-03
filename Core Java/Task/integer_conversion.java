package Task;
import java.util.*;
public class integer_conversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      int a;
      byte b;
      char c;
      float d;
      Scanner sc=new Scanner(System.in);
      System.out.println("Enter the number:");
      a=sc.nextInt();
      b=(byte)a;
      System.out.println("Conversion into byte:"+b);
      c=(char)a;//99=c,97=a,98=b,99=c,100=d.......
      System.out.println("Conversion into char:"+c);
      d=a;//float is higher range than integer...
      System.out.println("Conversion into float:"+d);
      
	}

}
