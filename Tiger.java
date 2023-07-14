import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Tiger extends Critter{
//    public static void main(String[] args){
//        Tiger tiger = new Tiger();
//        int i=0 ;
//        while(i<12){
//            tiger.getColor();
//            i++;
//        }
//
//    }
    private int moveCount;
    private Color tigerColor;
    private Color[] colors={Color.RED,Color.GREEN,Color.BLUE};

    public Tiger(){
        moveCount=0;
        getColor();
    }//end tiger Constructor

    public Action getMove(CritterInfo info) {
        if(info.getFront()==Neighbor.OTHER){
            moveCount++;
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
    }//end getMove
    public Color getColor() {
        if(moveCount%3==0 || moveCount==0){
            int colorIndex= ((int)(Math.random()*3)); // randomly generate an integer value between 0-2
            tigerColor=colors[colorIndex];
        }
        else{
            tigerColor=tigerColor;
        }
        return tigerColor;
    }//end getColor

    public String toString() {
        return "TGR";
    }//end toString
}
