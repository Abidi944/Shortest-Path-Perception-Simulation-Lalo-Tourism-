public class edgeList {
    public class Edge{
        Edge next;
        Edge prev;
        int jarak;
        Vertex destination;
        Edge(Vertex destination, int jarak){
            this.destination=destination;
            this.jarak = jarak;
        }
    }
    Edge head;
    Edge tail;
    
    public void addEdge(Vertex destination, int jarak){
        Edge newEdge = new Edge(destination, jarak);
        if (head==null){
            head=newEdge;
            tail=newEdge;
        }else{
            newEdge.prev=tail;
            tail.next=newEdge;
            tail=newEdge;
        }
    }
}
