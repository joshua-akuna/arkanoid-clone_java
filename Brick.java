import java.awt.*;

public class Brick extends BaseObject{
    public Brick(double x, double y, double radius) {
        super(x, y, radius);
    }

    public Brick (double x, double y){
        this(x, y, 3);
    }
    //TASK 12
    // overrides the move method.
    @Override
    void move() {
        // This method does nothing because the Brick
        // instances does not move.
    }
    // overrides and implements the draw method.
    @Override
    void draw(Canvas canvas) {
    }
}
