package DataStructure;

public class graph_imp2 {
	class edge
	{
		int src,dest;
		
	}
	int vertices,edges;
	
	edge[] arr;
	
	graph_imp2(int v,int e)
	{
		vertices=v;
		edges=e;
		
		arr=new edge[e];
		for(int i=0;i<e;i++)
		{
			arr[i]=new edge();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int noVertices = 4;
		    int noEdges = 6;
		    graph_imp2 s = new graph_imp2(noVertices,noEdges);
		    
		    s.arr[0].src=1;
		    s.arr[0].dest=2;

		    s.arr[1].src=1;
		    s.arr[1].dest=3;
		    
		    s.arr[2].src=1;
		    s.arr[2].dest=4;
		    
		    s.arr[3].src=2;
		    s.arr[3].dest=3;
		    
		    s.arr[4].src=2;
		    s.arr[4].dest=4;
		    
		    s.arr[5].src=3;
		    s.arr[5].dest=4;
		    
		    for(int i=0;i<noEdges;i++)
		    {
		    	System.out.println(s.arr[i].src + "-"+s.arr[i].dest);
		    }
		    		
		    		
		    
		    
		    

	}

}
