package graph;

import java.util.LinkedList;

public class Vertex {
    private String name;
    private LinkedList<Edge> edges;

    // utility vars for BFS
    public static final int NOT_VISITED = 0;
    public static final int IN_QUEUE = 1;
    public static final int COMPLETED = 2;
    private int distance;
    private Vertex parent;
    private int state;  // not visited, in queue, completed

    public Vertex(String name) {
        this.name = name;
        edges = new LinkedList<>();
    }

    public String getName() {
        return name;
    }

    public Edge getEdge(Vertex v) {
        Edge edge = null;
        for(Edge e : edges) {
            if(e.getConnection().getName().equals(v.getName())) {
                edge = e;
                break;
            }
        }
        return edge;
    }

    public boolean addEdge(Vertex v, double weight) {
        Edge edge = getEdge(v);
        if(edge == null) {
            edge = new Edge(v, weight);
            edges.add(edge);
            return true;
        }
        return false;
    }

    public String toString() {
        String str = "[" + name + "] -> ";
        for(Edge e : edges) {
            str += e.getConnection().getName() + " ";
        }
        return str;
    }
}
