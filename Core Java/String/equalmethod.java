package String;
import java.util.*;
public class equalmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub\
          String s1="JAVA POINT";
          String s2="JAVA POINT";
          String s3="java point";
          String s4="python";
          
          Object st=s1.equals(s2);
System.out.println(s1.equals(s2));
System.out.println(s1.equals(s3));
System.out.println(s1.equals(s4));
System.out.println("with object :"+st);

	}

}
