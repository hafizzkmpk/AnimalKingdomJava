import java.awt.*;

public class WhiteTiger extends Critter{
    private int moveCount;
    private boolean infected=false;
    public WhiteTiger(){
        moveCount=0;
        getColor();
    }//end Constructor
    public Action getMove(CritterInfo info) {
        if(info.getFront()==Neighbor.OTHER){
            moveCount++;
            infected=true;
            return Action.INFECT;
        }
        else if(info.getFront()==Neighbor.WALL || info.getRight()==Neighbor.WALL ){
            moveCount++;
            return Action.LEFT;
        }
        else if(info.getFront()==Neighbor.SAME){
            moveCount++;
            return Action.RIGHT;
        }
        else{
            moveCount++;
            return Action.HOP;
        }
    }
    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        if (infected){return "TGR";}
        else{return "tgr";}
    }//end toString
}//end WhiteTiger
