import java.awt.*;

/**
 * TASK 6
 * Because the bricks, paddle and ball classes will have a lot
 * in common, such as moving about the field and be drawn, ie.
 * will have coordinates and sizes, and a move() and draw(), a
 * base class will be defined for all 3 classes to inherit from.
 *
 * TASK 7
 * For simplicity, we will treat all objects as circle. Although,
 * we will draw them as shapes, when calculating collisions, we
 * will assume that they are round.
 *
 * Secondly, the coordinates and radius will be real numbers. This
 * will ensure smooth motion and accurate calculations.
 *
 * Add a private double x, y, radius properties.
 * Add a constructor to initialize them.
 * Add setters and getters for each.
 */

public abstract class BaseObject {
    private double x;
    private double y;
    private double radius;

    public BaseObject (double x, double y, double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getX() {
        return x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getY() {
        return y;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    /*
     *  TASK 8
     * Define abstract draw(Canvas canvas) and the move() methods.
     * The subclasses will override and implement the
     * necessary functionality.
     *
     * We will also need to determine whether there's a collision
     * between the ball and the paddle or brick. We will define
     * the boolean intersects (BaseObject o) for this.
     *
     * Because all instances of the BaseObject class will be treated
     * as circles for convenience, the following collision-detection
     * algorithm is proposed: If the center of the circle of one
     * lies within the circle of another, then there's a collision.
     *
     * i.e. distance between objects <=
     * max(radius of first object, radius of second object)
     */

    public boolean intersect (BaseObject object){
        // calculates the distance between objects using pythagoras.
        double distanceApart = Math
                .sqrt(Math.pow(getX() - object.getX(), 2)
                        + Math.pow(getY() - object.getY(), 2));
        //determines when a collision occurs
        return distanceApart <= Math.max(getRadius(), object.getRadius());
    }

    abstract void move();

    abstract void draw (Canvas canvas);
}
