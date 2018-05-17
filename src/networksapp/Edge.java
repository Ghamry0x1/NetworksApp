package networksapp;

/**
 *
 * @author GHAMRY, HAZEM, and ALY
 */
public class Edge {
    private int ID;
    private Node source;
    private Node destination;
    private int weight;

    public Edge(int ID, Node source, Node destination, int weight) {
        this.ID = ID;
        this.source = source;
        this.destination = destination;
        this.weight = weight;
    }

    public int getID() {
        return ID;
    }

    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getDestination() {
        return destination;
    }

    public void setDestination(Node destination) {
        this.destination = destination;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
    
}
