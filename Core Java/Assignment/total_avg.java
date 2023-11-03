package Assignment;
import java.util.*;
public class total_avg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int stud_id,mark1,mark2,mark3;
		String name;
		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter the stud ID name:");
		stud_id=sc.nextInt();
		
		System.out.println("Enter the student  name:");
		name=sc.next();
		
		System.out.println("Enter the mark1:");
		mark1=sc.nextInt();
		
		System.out.println("Enter the mark2:");
		mark2=sc.nextInt();
		
		System.out.println("Enter the mark3:");
		mark3=sc.nextInt();
		
		int total=mark1+mark2+mark3;
		double average =total/3;
		
		System.out.println("Total mark:"+total);
		System.out.println("Average:"+average);
		
		if(average>90)
		{
			System.out.println("Grade:Excellent");
		}
		else if(average>80)
		{
			System.out.println("Grade:Very good");
		}
		else if(average>70)
		{
			System.out.println("Grade:Good");
		}
		
		else if(average>60)
		{
			System.out.println("Grade:Work Hard");
		}
		else if(average>0)
		{
			System.out.println("Grade:Poor");
		}
		
		
		

	}

}
