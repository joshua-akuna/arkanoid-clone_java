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
     *
     * TASK 14:
     * a. Implement the move method, x increase by dx and
     *  y increases by dy. (if ball isFrozen, x and y
     *  should not change.)
     * b. Implement the draw(Canvas canvas).
     *  call the setPoint(x, y, 'O') method.
     * c. Implements the start method which thaws the ball.
     *
     * TASK 15:
     * a. Implement the setDirection methods whic also
     *  calculates dx, dy.
     *  - dx = Math.cos(angle in rads) * speed
     *  - dy = -Math.sin(angle in rads) * speed
     *
     * b. Implement the
     *  void checkRebound(int minx, int maxx, int miny, int maxy)
     *  method to determine when the ball hit the wall. And bounces
     *  off if it does.
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
        if(!isFrozen){
            x += dx;
            y += dy;
        }
    }

    @Override
    void draw(Canvas canvas) { canvas.setPoint(x, y, 'O'); }

    public void start(){ isFrozen = false; }

    //TASK 15a
    public void setDirection(double direction) {
        //Check that the direction ranges from 0-360 degrees
        if(direction >= 0 && direction <= 360){
            this.direction = direction;
            //calculate the direction in radians
            double rads = Math.toRadians(direction);
            //calculate dx, dy with rads
            this.dx = Math.cos(rads) * speed;
            this.dy = -Math.sin(rads) * speed;
        }
    }

    //TASK 15b
    void checkRebound (int minx, int maxx, int miny, int maxy){

    }

    public double getDx() { return dx; }

    public double getDy() { return dy; }

    public double getSpeed() { return speed; }

    public double getDirection() { return direction; }
}
