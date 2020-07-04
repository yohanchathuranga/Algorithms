import java.io.*; 
import java.util.*; 
  
public class BFSTraversal 
{ 
    private int V;   // No. of vertices 
    private LinkedList<Integer> adj[]; //Adjacency Lists 
    
    BFSTraversal(int v) //initialize
    { 
        V = v; 
        adj = new LinkedList[v]; 
        for (int i=0; i<v; ++i) 
            adj[i] = new LinkedList(); 
    } 
    
    public static void main(String args[]) 
    { 
        Graph g = new Graph(4); 
  
        g.addNode(0, 1); 
        g.addNode(0, 2); 
        g.addNode(1, 2); 
        g.addNode(2, 0); 
        g.addNode(2, 3); 
        g.addNode(3, 3); 
  
        System.out.println("Breadth First Traversal "+ 
                           "(starting from vertex 1)"); 
  
        g.BFS(1); 
    } 
  
    
  
    // Function to add an Node into the graph 
    void addNode(int v,int w) 
    { 
        adj[v].add(w); 
    } 
  
    // prints BFS traversal from a given source s 
    void BFS(int s) 
    { 
    
        boolean visited[] = new boolean[V]; 
  
        // Create a queue for BFS 
        LinkedList<Integer> queue = new LinkedList<Integer>(); 
  
        // Mark the current node as visited and enqueue it 
        visited[s]=true; 
        queue.add(s); 
  
        while (queue.size() != 0) 
        { 
            // Dequeue a vertex from queue and print it 
            s = queue.poll(); 
            System.out.print(s+" "); 
  
            
            Iterator<Integer> i = adj[s].listIterator(); 
            while (i.hasNext()) 
            { 
                int n = i.next(); 
                if (!visited[n]) 
                { 
                    visited[n] = true; 
                    queue.add(n); 
                } 
            } 
        } 
    } 
  
    
} 
