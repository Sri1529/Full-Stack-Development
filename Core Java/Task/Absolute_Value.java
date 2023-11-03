package Task;

public class Absolute_Value {

	int a=10,b=20;
	
	public void one()
	{
		int add=a+b;
		System.out.println("Addition : "+add);
	}
	
	public void diff()
	{
		int sub=a-b;
		System.out.println("Difference: "+Math.abs(sub));// abs shows the +ve value 
	}
	
	public static void main(String[] args) {
		
		Absolute_Value sc=new Absolute_Value();
		sc.one();
		sc.diff();
		System.out.println(Math.max(12,33));
		System.out.println(Math.floor(12.33));
		System.out.println(Math.round(12.33));
		System.out.println(Math.min(12,33));
		System.out.println(Math.ceil(12.33));
	
	}

}
