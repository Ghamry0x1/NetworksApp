package networksapp;

import java.util.ArrayList;

/**
 *
 * @author GHAMRY, HAZEM, and ALY
 */
public class Message {
    private int ID;
    private Node source;
    private Node destination;
    private ArrayList<Node> path;
    private String content;
    private boolean received;

    public Message(int ID, Node source, Node destination, String content, boolean received) {
        this.ID = ID;
        this.source = source;
        this.destination = destination;
        this.content = content;
        this.received = received;
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

    public ArrayList<Node> getPath() {
        return path;
    }

    public void setPath(ArrayList<Node> path) {
        this.path = path;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public boolean isReceived() {
        return received;
    }

    public void setReceived(boolean received) {
        this.received = received;
    }
    
    public void ack() {
        //fel main aw makan ma hn3mel check hnshoof el destination hwa hwa el node el ehna
        //w2feen 3ndaha wla la2, lw la2 kamel, lw ahh khali el received b true wel method de
        //tshtghal enaha tb3at msg tanya lel source 3la nafs el path el mshyet fe wheya ryha
    }
    
}
