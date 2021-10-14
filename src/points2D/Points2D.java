package points2D;

public class Points2D {

    //attributes
    int x, y;
    static int pointsCounter = 0;

    //constructors
    public Points2D(){
        this.x = 0;
        this.y = 0;
        pointsCounter +=2;
    }
    public Points2D(int x, int y) {
        this.x = x;
        this.y = y;
        pointsCounter +=2;
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
    public void translate(int dX, int dY){
        this.x += dX;
        this.y += dY;
    }
    public static int displayCounter(){
        System.out.println("we have created " + pointsCounter + " points.");
        return pointsCounter;
    }
}
