package OOPS;

class Person1
{
	String Studen_name;
	int Age;
	void getperinfo(String str ,int ag)
	{
		Studen_name=str;
		Age=ag;
	}
	
	void putperingo()
	{
		System.out.println("Name: "+Studen_name);
		System.out.println("Age: "+Age);
		
	}
}

class Student extends Person1
{ 
	int total;
	char grade;
 	void getstudinfo(String n,int ag,int tot,char gr)
	{
		getperinfo(n,ag);
		total=tot;
		grade=gr;
		
	}
 	
 	void putstudinfo()
 	{
 		putperingo();
 		System.out.println("Total: "+total);
 		System.out.println("Grade: "+grade);
 	}
}



public class Single_inheritence {

	public static void main(String[] args) {
		Student s=new Student();
		s.getstudinfo("Sri", 21, 4710, 'A');
		s.putstudinfo();
		

	}

}
