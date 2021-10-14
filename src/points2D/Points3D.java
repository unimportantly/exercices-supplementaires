package points2D;

public class Points3D extends Points2D{

    //attributes
    int z;

    //constructors
    public Points3D(){
        super();
        pointsCounter++;
    }
    public Points3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        pointsCounter++;
    }

    //methods
    public void display() {
        System.out.println("x is " + x + " y is " + y + " and z is " + z + ".");
    }
    public void translate(int dX, int dY, int dZ) {
        super.translate(dX, dY);
        this.z += dZ;
    }

    //g&s
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
}
