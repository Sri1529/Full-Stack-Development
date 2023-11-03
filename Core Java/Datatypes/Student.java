package Datatypes;
import java.util.*;
public class Student {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int Roll_No,Age;
		long Contact;
		String Name;
		char Gender;
		
		
		
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the Roll NO:");
		Roll_No =sc.nextInt();
		
		System.out.println("Enter the Age:");
		Age =sc.nextInt();
		
		System.out.println("Enter the Contact:");
		Contact =sc.nextLong();
		
		System.out.println("Enter the Name:");
		Name =sc.next();
		
		System.out.println("Enter the Gender:");
		Gender =sc.next().charAt(0);
		
		
		System.out.println("Student Information:");
		System.out.println("Roll_No:"+Roll_No);
		System.out.println("Age:"+Age);
		System.out.println("Contact:"+Contact);
		System.out.println("Name:"+Name);
		System.out.println("Gender:"+Gender);
		
		
		
      
	}

}
