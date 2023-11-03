package Assesment_2;

public class Seperate_odd_even {

	public static void main(String[] args) {
		int even=0,odd=0;
        int arr[]= {1,2,3,4,5,6,7,8};
       System.out.println("Even numbers:");
        for(int i=0;i<arr.length;i++)
        {
        	
        	if(arr[i]%2==0)
        	{
        		even=arr[i];
        		System.out.print(arr[i]+" ");
        	}
        	
        }
        
        System.out.println("");
        
        System.out.println("Odd numbers:");
        for(int i=0;i<arr.length;i++)
        {
        	if(arr[i]%2!=0)
        	{
        		odd=arr[i];
        		System.out.print(arr[i]+" ");
        	}
        }
        
        
        //System.out.println("Even numbers:"+even);
        //System.out.println("odd numbers:"+odd);
	}

}
