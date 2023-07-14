import java.awt.*;

public class Giant extends Critter {
    private int moveCount;
    private String giantString;
    public Giant(){
        moveCount=0;
        getColor();
    }//end Giant Constructor
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
            return Action.RIGHT;
        }
    }
    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        if(moveCount%6==0 || moveCount==0){ // only on on the 0,6,12,18,24,30... the program will enter the if statement
            if(giantString==null){          // at moveCount 0, it will set the string to fee
                giantString="fee";          // moveCount= 1, it will go into the else clause
                                            // when, moveCount==6, it enters the top if clause again,
            }                               // now it will go to the
            else if(giantString=="fee"){    // first nested else if loops, it will set the string to fie
                giantString="fie";          // on moveCount 7,it will not enter the top  if statement but goes straight
                                            // to the else-if clause out-side of the top if.
            } else if (giantString=="fie") {// on the 12 moveCount, it will enter gain the top if clause,
                giantString ="foe";         // it compares it current string to the else-if condition inside-of the top if.
                                            // it is changing the string from fie to foe and then on the next move count
            }                               // it will go back again to the outside else statement until the moveCount
            else if (giantString=="foe") {  // is divisible by 6 again. the next time it will be changing the string
                giantString="fum";          // from foe-->fum and then on the next divisible-by-6 move count

            }
            else if (giantString=="fum") {  // it goes back and changing from fum back to fee and the process continue
                giantString="fee";

            }
        }
        else{
           giantString=giantString; // if the moveCount is not 0 and not divisible by 6, it will just going to
        }                           // set the current string to the variable giantString.
        return giantString;
    }//end toString
}
