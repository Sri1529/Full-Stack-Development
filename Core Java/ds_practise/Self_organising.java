package ds_practise;
import java.util.*;
public class Self_organising {
	public ArrayList<Integer>list;
	public ArrayList<Integer>count;
	
	public Self_organising()
	{
		list = new ArrayList<Integer>();
		count = new ArrayList<Integer>();
		
	}
	
	public void add(int a)
	{ 
		
		list.add(a);
		count.add(0);
		//count.set(0, 0);
//		while(size>0&&a<list.get(size-1))
//		{
//			list.set(size, list.get(size - 1));
//            size--;
//		}
//		list.set(size, a);
		//System.out.println("size:"+list.size());
		
		
	}
	
	
	
	public void delete(int del)
	{
		list.remove(del-1);
	}
	public void search(int search)
	{
		Collections.binarySearch(list, search);
		
	}
	public void getsize()
	{
		System.out.println(list.size());
	}
	public void display()
	{
		
		System.out.println(list);
		System.out.println(count);
		
	}
	public boolean chechempty()
	{
		return list.size() == 0 || list == null;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		Self_organising a = new Self_organising();
		 System.out.println("Self_organising Test\n");          
	        char ch;
	        do
	        {
	        	
	        	System.out.println("Self Organising List Operations");
	        	System.out.println("1. Insert");
	        	System.out.println("2. Delete");
	        	System.out.println("3. Search");
	        	System.out.println("4. Check Empty");
	        	System.out.println("5. Check Full");
	        	System.out.println("6. get size");
	        	int choice=sc.nextInt();
	        	
	        	switch(choice)
	        	{
	        		
	        	case 1:
	        		System.out.println("Enter the element to insert:");
	        		a.add(sc.nextInt());
	        		
	        		
	        		break;
	        	case 2:
	        		System.out.println("Enter the element to Delete:");
	        		a.delete(sc.nextInt());
	        		break;
	        	case 3:
	        		System.out.println("Enter the element to Search:");
	        		a.search(sc.nextInt());
	        		break;
	        	case 4:
	        		System.out.println("Empty Status:");
	        		a.chechempty();
	        		break;
	        	case 5:
	        		System.out.println("Enter the element to Check_full:");
	        		
	        		break;
	        	case 6:
	        		System.out.println("Enter the element to Get size:");
	        		a.getsize();
	        		break;
	        	default : 
	                System.out.println("Wrong Entry \n ");
	                break;  
	        		
	        	}
	        	 a.display();
	        	
	        	  System.out.println("\nDo you want to continue (Type y or n) \n");
	              ch = sc.next().charAt(0);       
	        }while (ch == 'Y'|| ch == 'y'); 

	}

}
