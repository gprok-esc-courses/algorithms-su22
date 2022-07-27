package graph;

public class GraphTester {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex("A");
        graph.addVertex("B");
        graph.addVertex("C");
        graph.addVertex("A");
        graph.addVertex("D");
        graph.addVertex("E");
        graph.addVertex("F");

        graph.connect("A", "B", false);
        graph.connect("A", "C", false);
        graph.connect("B", "D", false);
        graph.connect("E", "F", false);
        graph.connect("A", "E", false );

        graph.print();


        graph.bfs("A");
        graph.printPath("A", "D");
    }
}
