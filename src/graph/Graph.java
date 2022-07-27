package graph;

import java.util.LinkedList;

public class Graph {
    private LinkedList<Vertex> vertices;

    public Graph() {
        vertices = new LinkedList<>();
    }

    public boolean addVertex(String name) {
        Vertex vertex = getVertex(name);
        if(vertex == null) {
            vertex = new Vertex(name);
            vertices.add(vertex);
            return true;
        }
        return false;
    }

    public Vertex getVertex(String name) {
        Vertex vertex = null;
        for(Vertex v : vertices) {
            if(v.getName().equals(name)) {
                vertex = v;
                break;
            }
        }
        return vertex;
    }

    public boolean connect(String v1, String v2, boolean directed, double weight) {
        Vertex vertex1 = getVertex(v1);
        Vertex vertex2 = getVertex(v2);

        if(vertex1 != null && vertex2 != null) {
            if(directed) {
                if (vertex1.addEdge(vertex2, weight)) {
                    return true;
                } else {
                    return false;
                }
            }
            else {
                if (vertex1.addEdge(vertex2, weight) && vertex2.addEdge(vertex1, weight)) {
                    return true;
                } else {
                    return false;
                }
            }
        }

        return false;
    }

    public boolean connect(String v1, String v2, boolean directed) {
        return this.connect(v1, v2, directed,1);
    }

    public void print() {
        for(Vertex v : vertices) {
            System.out.println(v);
        }
    }

    public void initBfs() {
        // Make all vertices WHITE (non visited)
        // Make all parents null
        // Make all distances zero
    }

    public void bfs(String startingVertex) {
        initBfs();
        // TODO: Implement
    }

    public void printPath(String start, String end) {
        // Find vertices
        // Print the shortest path
    }
}
