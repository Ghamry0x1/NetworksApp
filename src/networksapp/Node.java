package networksapp;

/**
 *
 * @author GHAMRY, HAZEM, and ALY
 */
public class Node {
    private int ID;
    private float power;
    private int x;
    private int y;
    
    public Node(int ID, float power, int x, int y) {
        this.ID = ID;
        this.power = power;
        this.x = x;
        this.y = y;
    }

    public int getID() {
        return ID;
    }

    public float getPower() {
        return power;
    }

    public void setPower(float power) {
        this.power = power;
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
