import GraphFramework.Graph;
 
import java.io.FileNotFoundException;

public class A {
    public static void main (String [] args) throws FileNotFoundException {
        Graph g =new Graph ( false ,false  );
      g.readFromFile("Graph.txt");
       g.printGraph();

    }
    
}
