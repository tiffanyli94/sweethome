import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class GraphNode {
    int value;
    Map<Integer, GraphNode> neighbors = new HashMap<>();

    public GraphNode (int value) {
        this.value = value;
    }

    public void printNeighbors() {
        for (Map.Entry<Integer, GraphNode> entry : neighbors.entrySet()){
            System.out.println("Key =" + entry.getKey() + ", Value =" + entry.getValue().value);
        }
    }

    public int getNeighborCount() {
        return neighbors.size();
    }

    public boolean hasNeighbor(int n) {
        return neighbors.containsKey(n);
    }
}
