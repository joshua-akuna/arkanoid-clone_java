/**
 * TASK 16: Setting up the paddle class
 * add the following fields
 * 1. double speed (paddle speed)
 * 2. direction (moves only in the x-axis.
 *  a. value 1: to the right
 *  b. value -1: to the left
 *  c. value 0: no motion, initial value.
 *  d. initialize the class with a consructor
 *  e. add getters for the field.
 */
public class Paddle extends BaseObject{
    private double speed;
    private double direction;

    public Paddle (double x, double y, double radius) {
        super(x, y, radius);
    }

    public Paddle (double x, double y){
        this(x, y, 3);
        this.speed = 1;
        this.direction = 0;
    }

    @Override
    void move() {

    }

    @Override
    void draw(Canvas canvas) {
    }

    public double getSpeed() { return speed; }

    public double getDirection() { return direction;}
}
