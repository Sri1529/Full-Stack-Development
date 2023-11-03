package homeassesment1;
import java.util.*;
public class Digit_to_word {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number");
		int n=sc.nextInt();
		
		int split=0,split1;
		String s="";
		String str=Integer.toString(n);
		int len=str.length();
		
         while(n>0)
         {
        	 split=n%10;
        	 s=s+split;
        	 n=n/10;
         }
        
         //System.out.println(s);
		int n1=Integer.parseInt(s);
		for(int i=0;i<len;i++)
		{
			split1=n1%10;
			
            n1=n1/10;
			
		
			
			
				if(split1==0)
				{
					System.out.print("Zero ");
				}
			
				 if(split1==1)
				{
					System.out.print("one ");
				}
			
				 if(split1==2)
				{
					System.out.print("two ");
				}
			
				 if(split1==3)
				{
					System.out.print("three ");
				}
			
			 if(split1==4)
				{
					System.out.println("four ");
				}
			
				 if(split1==5)
				{
					System.out.print("five ");
				}
			
				if(split1==6)
				{
					System.out.print("six ");
				}
			
				 if(split1==7)
				{
					System.out.print("seven ");
				}
			
				 if(split1==8)
				{
					System.out.print("eight ");
				}
			
				 if(split1==9)
				{
					System.out.print("nine ");
				}
		}
		}
		

	}


