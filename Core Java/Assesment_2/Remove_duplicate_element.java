package Assesment_2;

public class Remove_duplicate_element {

	public static void main(String[] args) {
		int arr[]= {1,2,3,5,3,4};
		
		
        
        for(int j=0;j<arr.length;j++)
        {
        	
        for(int i=j+1;i<arr.length;i++)
        {
        	if(arr[j]==arr[i])
        	{
        		System.out.println(arr[j]);
        	}
        	
        	
        }
        
        }
        
        
		
		
	}

}
