package points2D;

public class Points2D {

    //attributes
    int x, y;

    //constructors
    public Points2D(){}
    public Points2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    //g&s
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    //methods
    public void display(){
        System.out.println("x is " + x + " and y is " + y + ".");
    }

}
