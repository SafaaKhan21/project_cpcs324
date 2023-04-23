package GraphFramework;

public class linklist  {
    private Edge head;
 
    // Constructor
    public linklist() {
       head = null;
    }
 
    // Example Method to check if list is empty
    public boolean isEmpty() {
       return head == null;
    }
    
   public void printAllNodes() {
       Edge hPointer =head;
 while (hPointer != null) {
      hPointer .display();
      hPointer = hPointer.getNext();
   }
   }

   public void addEdge(Edge e) {
   // Insertion as First node, Empty or non-empty list
 	 if (head ==null)
      head = new Edge(e.getEnd(),e.getWeight(),head);
   	
   // Insertion anywhere else even at last
         else{
      Edge  helpPtr = head;
      while (helpPtr.next != null) {
           // we found our spot and stop traversal 
         helpPtr = helpPtr.next;
      }
      // Now make new node and insert
      helpPtr.next =  new Edge(e.getEnd(),e.getWeight(),helpPtr.next);
      
   }
   }

 
}
 