package networksapp;

import java.util.ArrayList;

/**
 *
 * @author GHAMRY, HAZEM, and ALY
 */
public class Message{
    //MSG format: "Counter (3 letter)""ID (2 letter)""content"

    public ArrayList<Node> path;
    private Node destination;
    private String content;
    private boolean received;

    public Message (Node Target, Node source, String content, boolean received){
        path = new ArrayList<>();
        path.add(source);
        this.destination = Target;
        this.content = content;
        this.received = received;
    }

    public String getID (){
        return content.substring(3, 5);
    }

    public Node getsource (){
        return path.get(0);
    }

    public Node getDestination (){
        return this.destination;
    }

    public void setDestination (Node destination){
        this.destination = destination;
    }

    public ArrayList<Node> getPath (){
        return path;
    }

    public void setPath (ArrayList<Node> path){
        this.path = path;
    }

    public String getContent (){
        return content;
    }

    public void setContent (String content){
        this.content = content;
    }

    public boolean isReceived (){
        return received;
    }

    public void setReceived (boolean received){
        this.received = received;
    }

    public void ack (){
        //fel main aw makan ma hn3mel check hnshoof el destination hwa hwa el node el ehna
        //w2feen 3ndaha wla la2, lw la2 kamel, lw ahh khali el received b true wel method de
        //tshtghal enaha tb3at msg tanya lel source 3la nafs el path el mshyet fe wheya ryha
    }

}
