import java.util.List;

public class Arkanoid {
    // the main method which serves as the entry point
    public static void main(String args[]){
        System.out.println("Hello World");
    }

    // TASK 5d: define a non-private static Arkanoid variable
    static Arkanoid game;

    // TASK 2a
    // the width and height specifies the dimensions of the game
    private int width;
    private int height;

    // TASK 4a
    // define reference fields for the paddle, ball and list of bricks.
    // and add their setters and getters
    private Ball ball;
    private Paddle paddle;
    private List<Brick> bricks;

    // TASK 2b
    // add setters and getters
    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    // TASK 4b
    public void setBall(Ball ball) {
        this.ball = ball;
    }

    public Ball getBall() {
        return ball;
    }

    public void setPaddle(Paddle paddle) {
        this.paddle = paddle;
    }

    public Paddle getPaddle() {
        return paddle;
    }

    public void setBricks(List<Brick> bricks) {
        this.bricks = bricks;
    }

    public List<Brick> getBricks() {
        return bricks;
    }

    // TASK 3
    // add a constructor
    public Arkanoid (int width, int height){
        this.height = height;
        this.width = width;
    }

    //TASK 5a: define an empty param run().
    public void run(){

    }

    //TASK 5b: define an empty param move().
    public void move(){

    }
}
