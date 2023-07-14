import java.awt.*;

public class NinjaCat extends Critter{
    int moveCount;
    public Action getMove(CritterInfo info) {
        return Action.LEFT;
    }
    public Color getColor() {
        return Color.CYAN;
    }

    public String toString() {
        return "MEOW";
    }
}
