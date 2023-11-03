package DataStructure;

public class Adjecency_matrix2 {
	public boolean adjmat[][];
	public int vertices;
	
	
	public Adjecency_matrix2(int v)
	{
		vertices = v;
		adjmat = new boolean[v][v];
	}
	
	public void addedge(int i,int j)
	{
		adjmat[i][j]=true;
		adjmat[j][i]=true;
	}
	
	public  String str()

	{
		StringBuilder r = new StringBuilder();
		for(int i=0;i<vertices;i++)
		{
			r.append(i +":");
			for(boolean j :adjmat[i])
			{
				 r.append((j ? 1 : 0) + " ");
			}
			r.append("\n");
			//System.out.println();
		}
		return r.toString();
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Adjecency_matrix2 sc = new  Adjecency_matrix2(5);
		
		sc.addedge(0, 1);
		sc.addedge(0, 2);
		sc.addedge(1, 1);
		sc.addedge(1, 3);
		sc.addedge(1, 4);
		sc.addedge(2, 0);
		sc.addedge(2, 3);
		sc.addedge(3, 1);
		sc.addedge(3, 2);
		sc.addedge(3, 4);
		sc.addedge(4, 1);
		sc.addedge(4, 3);
		
		System.out.print(sc.str());

	}

}
