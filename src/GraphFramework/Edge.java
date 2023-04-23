package GraphFramework;

public class Edge {
    private Vertex source;
    private Vertex target;
    private Integer weight;
    private Vertex parent;
    Edge next;

    public Edge() {
        this(null ,null,0);
    }
      
    
    public Edge(Vertex source, Vertex target, Integer inputWeight) {
      this.source = source;
      this.target = target;
      this.weight = inputWeight;
    }
     public Edge( Vertex target, Integer inputWeight,Edge next) {
        
      this.target = target;
      this.weight = inputWeight;
      this.next =next;
    }
     
     
     public Edge( Vertex target, Integer inputWeight) { 
      this.target = target;
      this.weight = inputWeight;
    }
      
    public Vertex getStart() {
      return this.source;
    }
      
    public Vertex getEnd() {
      return this.target;
    }
      
    public Integer getWeight() {
      return this.weight;
    }
     //not completed 
    public void display(){
        System.out.print(target.getLabel() +" ---> "+"( Wieght: "+weight+ " ) ");
    }

   

   

    public Vertex getParent() {
        return parent;
    }

    public void setParent(Vertex parent) {
        this.parent = parent;
    }

    public Vertex getSource() {
        return source;
    }

    public void setSource(Vertex source) {
        this.source = source;
    }

    public Vertex getTarget() {
        return target;
    }

    public void setTarget(Vertex target) {
        this.target = target;
    }

    public Edge getNext() {
        return next;
    }

    public void setNext(Edge next) {
        this.next = next;
    }
    
      
  }