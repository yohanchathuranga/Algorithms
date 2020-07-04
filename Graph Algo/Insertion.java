import java.util.*; 

public class Graph { 
	
	public static void main(String[] args) 
	{ 
		// initialiae graph with 5 nodes
		int V = 5; 
		ArrayList<ArrayList<Integer> > adj 
					= new ArrayList<ArrayList<Integer> >(V); 
		
		for (int i = 0; i < V; i++) 
			adj.add(new ArrayList<Integer>()); 

		// Add nodes
		addNode(adj, 0, 1); 
		addNode(adj, 0, 4); 
		addNode(adj, 1, 2); 
		addNode(adj, 1, 3); 
		addNode(adj, 1, 4); 
		addNode(adj, 2, 3); 
		addNode(adj, 3, 4); 
		
		print(adj); 
	}
	
	static void addNode(ArrayList<ArrayList<Integer> > adj, 
						int u, int v) 
	{ 
		adj.get(u).add(v); 
		adj.get(v).add(u); 
	} 

	static void print(ArrayList<ArrayList<Integer> > adj) 
	{ 
		for (int i = 0; i < adj.size(); i++) { 
			System.out.println("Graph with list of vertices" + i); 
			System.out.print("head"); 
			for (int j = 0; j < adj.get(i).size(); j++) { 
				System.out.print(" -> "+adj.get(i).get(j)); 
			} 
			System.out.println(); 
		} 
	} 

	 
} 
