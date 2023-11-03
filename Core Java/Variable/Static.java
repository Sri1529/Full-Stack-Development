package Variable;

public class Static {
public static int nbr=122;//static variable
String name="Sri";
	public static void main(String[] args) {
		
		Static cv =new Static();
		System.out.println(Static.nbr);//can call without object //can call class name+variable name
		System.out.println(cv.name);

	}

}
