import java.awt.*;

public class Bear extends Critter{
    int moveCount;
    boolean polar;
    public Bear(boolean polar){
        this.polar=polar;
        moveCount=0;
    }//end Bear Constructor
    public Action getMove(CritterInfo info) {
        if(info.getFront()==Neighbor.OTHER){
            moveCount++;
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.EMPTY){
            moveCount++;
            return Action.HOP;
        }
        else{
            moveCount++;
            return Action.LEFT ;
        }
    }//end getMove

    public Color getColor() {
        if(!polar){
            return Color.BLACK;
        }
        else{return Color.WHITE;}
    }

    public String toString() {
        if(moveCount%2==0||moveCount==0){
            return "/";
        }
        else{
            return "\\";
        }
    }//end toString
}
