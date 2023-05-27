import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class WeightedGraph<Vertex> {
    private Map<Vertex, List<Edge<Vertex>>> adjacencyList;

    public WeightedGraph() {
        adjacencyList = new HashMap<>();
    }


}
