/**
 * The Canvas class will define an instance on which
 * all the objects will be drawn.
 */
public class Canvas {
    // Define the dimensions of the Canvas.
    private int width;
    private int height;
    // Add a matrix that will define the cell
    // positions for each object drawwn on the
    // Canvas.
    private char matrix[][];

    //defne the constructor
    public Canvas (int width, int height){
        this.matrix = new char[height + 2][width + 2];
    }

    //define the getters/setters for the fields

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public char[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(char[][] matrix) {
        this.matrix = matrix;
    }
}
