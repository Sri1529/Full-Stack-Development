package Class_objects;

public class first {
	
	int num1=10,num2=20;  // state or attributes
	 public void add()     // behavior or function
	{
		
		
		System.out.println(num1+num2);
	}
	
	public void sub() {
		System.out.println(num2-num1);
		
	}
	
	public static void main(String atgs[])
	{
		first f1 =new first(); // do ilke same as scanner
		f1.add();//as like as sc.nextInt();
		f1.sub();
	}

}


