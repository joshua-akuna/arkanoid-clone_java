public class Ball extends BaseObject{
    /**
     *
     * @param x
     * @param y
     * @param radius
     * TASK 13
     * Define the following params
     * a. double speed (speed of the ball)
     * b. double direction (the direction of the ball
     *  in motion from 0-360 degrees)
     * c. double dx (the distance along the x-axis that
     *  the ball travels in one step) =[speed * direction].
     * d. double dy (the distance along the y-axis that the
     *  ball travels in a step) =[speed * direction]
     * e. boolean isFrozen: true if ball is not moving.
     * f. add getters for all fields except the isFrozen.
     * g. add a constructor that initializes the x, y,
     *  speed and direction properties and set isFrozen to true.
     */

    private double speed; //speed of the ball
    private double direction; //direction that the ball travels
    private double dx; //change in dx of the ball
    private double dy; //change in dy of the ball
    private boolean isFrozen; //checks if the ball is not moving

    //class constructor
    public Ball (double x, double y, double speed, double direction){
        this(x, y, 1); //initializes the constructor of the superclass
        isFrozen = true; //the ball is not moving initially.
    }

    public Ball(double x, double y, double radius) {
        super(x, y, radius);
    }

    @Override
    void move() {

    }

    @Override
    void draw(Canvas canvas) {

    }

    public double getDx() { return dx; }

    public double getDy() { return dy; }

    public double getSpeed() { return speed; }

    public double getDirection() { return direction; }
}
