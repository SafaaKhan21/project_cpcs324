package GraphFramework;
//+++++
import java.util.*;
import java.io.FileNotFoundException;

public class Graph {
  private  int verticesNo;
  private  int edgeNo;
    Vertex[] vertex ;
  private ArrayList<LinkedList<Edge>> adjlist = new ArrayList<LinkedList<Edge>>();
  private boolean isDigraph;
  private boolean isWeighted;

//-------------------------------------------------------------

  public Graph( boolean isDigraph,boolean isWeighted ) {
    this.isWeighted =  isWeighted;
    this.adjlist = new  ArrayList<LinkedList<Edge>>();
    this.isDigraph= isDigraph;
    
    // by default 
     vertex=new Vertex[20];
    
  }
  

//-------------------------------------------------------------

  public void addVertex(Vertex v ,int index) {
    // creat obj of vertex type
    vertex[index]=v; 
    // increament by one 
    verticesNo++;
    //return newVertex;
 
    
  }

//-------------------------------------------------------------


// method to remove  edge from the graph 
//  public void removeEdge(Vertex vertex1, Vertex vertex2) {
//    vertex1.removeEdge(vertex2);
//
//    if (!this.isDigraph) {
//      vertex2.removeEdge(vertex1);
//    }
//  }

//-------------------------------------------------------------

  /*public void removeVertex(Vertex vertex) {
    this.adjlist.remove(vertex);
  }*/

//-------------------------------------------------------------

// this method return   all vertices in graph 
  public ArrayList<LinkedList<Edge>> getVertices() {
    return this.adjlist;
  }
  
//-------------------------------------------------------------

// this method  check if the edge is weighted or not 
  public boolean isWeighted() {
    return this.isWeighted;
  }
  
//-------------------------------------------------------------

// this method  check if the graph is directed or not 
  public boolean isDirected() {
    return this.isDigraph;
  }

  //----------------------------------------------------------
  public void  setisDirected(boolean v) {
    isDigraph=v;
  }

//-------------------------------------------------------------

  
  public int  getVerticesNo() {
    return verticesNo;
}
//-------------------------------------------------------------
public void setVerticesNo(int NoOfVertices) {
    this.verticesNo =NoOfVertices ;
}

//-------------------------------------------------------------
public int  getEdgeNo() {
    return edgeNo;
}
//-------------------------------------------------------------
public void setEdgeNo(int NoOFEdge) {
    this.edgeNo = NoOFEdge;
}

//-----------------------
public void readFromFile(String fileName) throws FileNotFoundException, java.util.NoSuchElementException{
    
    //creat file objto read from file 
   java.io.File fileGraph=new java.io.File(fileName);
   // creat Scanner obj to read from file         
  Scanner input =new Scanner(fileGraph);
  
  // read first String 
   String str =input.next();
  
   
   int value =input.nextInt();
   /* if the value thar has been read it = zero that mean the graph is undircted(false)
   if the value = 1 that mean the graph is dircted (true)*/
   if (value==1&&str=="digraph" )
   setisDirected(true);
   
   //read number of the vertcies and number of edges in graph 
  int vertices=input.nextInt();
  //delete-===========================
  System.out.println(vertices);
  int edge=input.nextInt();

  // for loop is used to read itratively all vertices and costs of each edge
  for (int i=0;i<edge;i++){

      
    Vertex v1=new Vertex (input.next()) ;
 
    Vertex v2=new Vertex(input.next()) ;

    int w =input.nextInt();

    // add the edg to adjency list 
     addEdge( v1 ,v2, w);
     //addEdge( v2 ,v1, w);
    
     
     
   
  }
      
 
input.close();


}
//--------------------------------------------------------------------------------
public void printGraph( )
   {
       System.out.println(verticesNo);
        for (int i = 0; i < verticesNo; ++i){
            // Printing the head
           // System.out.print(vertex[i].getLabel() + "->");            
            vertex[i].displayInfo();
            System.out.println();
               
               
                }

        
    } 
        


        
       
      
          

   

 public void addEdge(Vertex v1, Vertex v2 ,Integer w){
     // calculate the index that vthe vertex insert in vertex array 
       int index =v1.getLabel().charAt(0)-'A';
     // add vertex to the vertex array  
      if (vertex[index]==null){
        //vertex[index ]=v1;
          addVertex(v1,index);
      }
    // add edge to the vertex
            //vertex[index].addEdge(v1,v2, w);
          vertex[index].addEdge( v2, w);
     // add eges of vertex to adjecy list

    
    // calculate the index that vthe vertex insert in vertex array 
    index =v2.getLabel().charAt(0)-'A';
    // add vertex to the vertex array
    if (vertex[index]==null){
       addVertex(v2,index);
    //vertex[index]=v2 ;
    // add edge to the vertex 
    }
    vertex[index].addEdge( v1, w);
     // add eges of vertex to adjecy list
     if (!isDigraph)
      edgeNo=edgeNo+2;
     else
          edgeNo++;
         
     
    
    
    
    
    
      
     
 }
 

}
