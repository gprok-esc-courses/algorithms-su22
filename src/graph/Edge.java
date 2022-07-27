package graph;

public class Edge {
    private Vertex connection;
    private double weight;

    public Edge(Vertex connection) {
        this.connection = connection;
        weight = 1;
    }

    public Edge(Vertex connection, double weight) {
        this(connection);
        this.weight = weight;
    }

    public Vertex getConnection() {
        return connection;
    }
}
