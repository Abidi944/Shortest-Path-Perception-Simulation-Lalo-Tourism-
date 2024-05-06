public class Vertex {
    String daerah;
    Vertex next;
    boolean visited = false;
    boolean wisata = false;
    Vertex previousVertex;
    int distance;

    Vertex(String daerah, boolean wisata) {
        this.daerah = daerah;
        this.wisata = wisata;
    }
    
    edgeList edge = new edgeList();
    public void addEdge(Vertex destination, int jarak) {
        edge.addEdge(destination, jarak);
    }
}