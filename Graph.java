public class Graph {
    Vertex head=null;
    Vertex tail=null;

    public void addVertex(String daerah, boolean wisata) {
        Vertex newVertex = new Vertex(daerah, wisata);
        if (head == null) {
            head = newVertex;
            tail = newVertex;
        } else {
            tail.next = newVertex;
            tail = newVertex;
        }
    }

    public void insertEdge(String sourceCity, String destinationCity, int jarak){
        Vertex source = searchVertex(sourceCity);
        Vertex destination = searchVertex(destinationCity);
        if (source!=null&&destination!=null){
            source.addEdge(destination, jarak);
            destination.addEdge(source, jarak);
        }
    }

    Vertex searchVertex(String daerah){
        Vertex current = head;
        while(current!=null){
            if(current.daerah.equals(daerah)){
                return current;
            }
            current=current.next;
        }
        return null;
    }

    public void dfsTraversal() {
        Stack stack = new Stack();
        Vertex current = head;
        int count = 0;
        System.out.println("================================================================================= DAFTAR LOKASI ===============================================================================");

        while (current != null) {
            if (!current.visited && current.wisata) {
                stack.push(current);

                while (!stack.isEmpty()) {
                    Vertex vertex = stack.pop();
                    if (!vertex.visited) {
                        System.out.printf("%-35s"," < " + vertex.daerah + " > ");
                        vertex.visited = true;               
                        count ++;
                        if (count % 5 == 0) {
                            System.out.println();
                        }
                        edgeList.Edge neighbor = vertex.edge.head;
                        while (neighbor != null) {
                            if (!neighbor.destination.visited && neighbor.destination.wisata) {
                                stack.push(neighbor.destination);
                            }
                            neighbor = neighbor.next;
                        }
                    }
                }
            }
            current = current.next;
        }
        resetGraph();
    }

    public void resetGraph() {
        Vertex current = head;
        while (current != null) {
            current.visited = false;
            current.previousVertex = null;
            current.distance = Integer.MAX_VALUE;
            current = current.next;
        }
    }

    public void resetDistances() {
        Vertex current = head;
        while (current != null) {
            current.distance = Integer.MAX_VALUE;
            current = current.next;
        }
    }

    public void dijkstra(Vertex startVertex, Vertex destinationVertex) {
        if (startVertex == null || destinationVertex == null) {
            return;
        }

        resetDistances();

        startVertex.distance = 0;

        Vertex[] unvisitedVertices = getAllVertices();

        while (true) {
            Vertex current = findMinDistance(unvisitedVertices);
            if (current == destinationVertex || current == null) {
                break;
            }
            current.visited = true;

            edgeList.Edge neighbor = current.edge.head;
            while (neighbor != null) {
                if (!neighbor.destination.visited) {
                    int newDistance = current.distance + neighbor.jarak;
                    if (newDistance < neighbor.destination.distance) {
                        neighbor.destination.distance = newDistance;
                        neighbor.destination.previousVertex = current;
                    }
                }
                neighbor = neighbor.next;
            }
        }
        printPath(startVertex, destinationVertex);
    }
    
    private Vertex findMinDistance(Vertex[] unvisitedVertices) {
        Vertex minVertex = null;
        int minDistance = Integer.MAX_VALUE;

        for (Vertex vertex : unvisitedVertices) {
            if (!vertex.visited && vertex.distance < minDistance) {
                minDistance = vertex.distance;
                minVertex = vertex;
            }
        }
        return minVertex;
    }
    
    private Vertex[] getAllVertices() {
        int vertexCount = 0;
        Vertex currentCount = head;
        while (currentCount != null) {
            vertexCount++;
            currentCount = currentCount.next;
        }
    
        Vertex[] verticesArray = new Vertex[vertexCount];
    
        Vertex currentPopulate = head;
        for (int i = 0; i < vertexCount; i++) {
            verticesArray[i] = currentPopulate;
            currentPopulate = currentPopulate.next;
        }
        return verticesArray;
    }

    private void printPath(Vertex startVertex, Vertex destinationVertex) {
        System.out.println("Jalur Tercepat Dari " + startVertex.daerah + " Menuju " + destinationVertex.daerah + ":");
    
        int pathLength = 0;
        Vertex current = destinationVertex;
        while (current != null) {
            pathLength++;
            current = current.previousVertex;
        }
    
        String[] pathArray = new String[pathLength];
    
        current = destinationVertex;
        for (int i = pathLength - 1; i >= 0; i--) {
            pathArray[i] = current.daerah;
            current = current.previousVertex;
        }
    
        for (int i = 0; i < pathLength; i++) {
            System.out.print(pathArray[i]);
            if (i < pathLength - 1) {
                System.out.print(" -> ");
            }
        }
        System.out.println(" -> Sampai");
    } 
}


