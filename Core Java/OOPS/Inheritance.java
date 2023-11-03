package OOPS;

class Base{
	int emp_id;
	String emp_name;
	void getInfo(int id,String name)
	{
		emp_id=id;
		emp_name=name;
	}
	void putInfo()
	{
		System.out.println("Employee ID: "+emp_id);
		System.out.println("Employee Name: "+emp_name);
		
	}
}

class Derived extends Base
{
	String Designation;
	int salary;
	void getInfo1(String desig,int sal)
	{
		getInfo(101,"malar");
		Designation=desig;
		salary=sal;
		
	}
	
	void putInfo1()
	{
		putInfo();
		System.out.println("Designation: "+Designation);
		System.out.println("Salary : "+salary);
		
	}
}

public class Inheritance {

	public static void main(String[] args) {
		
		Derived d =new Derived();
		d.getInfo1("HR",2000);
		d.putInfo1();
		
		

	}

}
