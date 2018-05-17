package networksapp;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author GHAMRY, HAZEM, and ALY
 */
public class Node {
    private int ID;
    private int x;
    private int y;
    private List<String> MessageID;
    
    public Node(int ID, int x, int y) {
        this.ID = ID;
        this.x = x;
        this.y = y;
        MessageID = new ArrayList<>();
    }

    public int getID() {
        return ID;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
