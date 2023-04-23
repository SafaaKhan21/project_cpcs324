package GraphFramework;


public class Vertex {
  private String  label;
 private linklist  adjlist;
  ///private linklist edges;
  private boolean isVisited;



//-------------------------------------------------------------
public Vertex(){
  this(null);
}

  public Vertex(String inputData) {
    this.label = inputData;
    adjlist =new linklist();
   
    
  }

  
//-------------------------------------------------------------
  public void addEdge(Vertex endVertex, Integer weight) {
   adjlist.addEdge(new Edge( endVertex, weight));
   
  }

//-------------------------------------------------------------

//  public void removeEdge(Vertex endVertex) {
//    this.edges.removeIf(edge -> edge.getEnd().equals(endVertex));
//  }

  public linklist  getEdges(){
    return this.adjlist;
  }

  //-------------------------------------------------------------
  public boolean isIsVisited() {
    return isVisited;
}
//-------------------------------------------------------------
public void setIsVisited(boolean isVisited) {
    this.isVisited = isVisited;
}
//-------------------------------------------------------------
  //not completed 
  public static void display(){
        
  }

  public String  getLabel() {
    return label;
}
//-------------------------------------------------------------
public void setLabel(String  label) {
    this.label = label;
}
//public void  displayInfo (){
//  adjlist.printAllNodes();
//
//}
    

    public void setEdges(linklist edges) {
        this.adjlist = edges;
    }

    
    public  void displayInfo() {
        System.out.print("Vertex{" + "label=" + label + ", adjlist= " ) ;
        adjlist.printAllNodes();
        System.out.println( " isVisited=" + isVisited + '}');
    }
    
     

}