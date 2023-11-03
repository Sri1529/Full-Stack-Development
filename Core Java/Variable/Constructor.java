package Variable;

public class Constructor {
	int stud_id;//instance variable or global variable
	String Stud_name;
	String college_name;
	
	public Constructor()//default constructor //same class name is called constructor
	{
		stud_id=135;
		Stud_name="Sri";
		college_name="JIT";
		System.out.println(stud_id);
		
	}
	
	public Constructor(int num,String name,String coll)//parameterized constructor
	{
		System.out.println(num);
		System.out.println(name);
		System.out.println(coll);
	}
	
	

	public static void main(String[] args)
	{
		
		Constructor sc =new Constructor();//calls automatically
		System.out.println(sc.Stud_name);
		System.out.println(sc.college_name);
		
		Constructor sc1=new Constructor(122,"Hari","JIT");//calls parameterized constructor
		
	}

}
