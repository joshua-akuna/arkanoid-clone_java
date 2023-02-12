/**
 * TASK 9
 * The Canvas class will define an instance on which
 * all the objects will be drawn.
 */
public class Canvas {
    // Define the dimensions of the Canvas.
    private int width;
    private int height;
    // Add a matrix that will define the cell
    // positions for each object drawn on the
    // Canvas.
    private char [][]matrix;

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

    /*
     * TASK 10
     * Implement the
     * 1. void setPoint (double x, double y, char c)
     * 2. void drawMatrix (double x, double y, int[][] matrix, char c)
     */
    public void setPoint (double x, double y, char c){
        // sets the element of index x and y in the matrix to c.
        // if x and y is within the range of the canvas width and height.
        if(x >= 0 && x < matrix[0].length && y >= 0 && y < matrix.length){
            matrix[(int)Math.round(x)][(int)Math.round(y)] = c;
        }
    }

    public void drawMatrix (double x, double y, int[][] matrixParam, char c){
        // Copies the matrix argument to the Canvas matrix starting at
        // coordinate(x, y). Using nested loops paint the value of
        // matrix[x+j][y+i] as c if matrixParam[i][j] is not equal to 0.
        // Using setPoint(x + j, y + i)

        for (int i = 0; i < matrixParam.length; i++){
            for (int j = 0; j < matrixParam[0].length; j++){
                if(matrixParam[i][j] != 0) setPoint(x + j, y + i, c);
            }
        }
    }

    // TASK 11: add the clear() and print()
    public void clear(){
        // clears the matrix
        matrix = new char[height + 2][width + 2];
    }

    public void print(){
        // prints the matrix
        for (char[] row : matrix) {
            for (char element : row) {
                System.out.printf("%c\t", element);
            }
            System.out.println();
        }
    }
}
