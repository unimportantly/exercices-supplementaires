package points2D;

public class Points3D extends Points2D{

    //attributes
    private int z;

    //constructors
    public Points3D(){
        super();
    }
    public Points3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    //methods
    public void display() {
        System.out.println("x is " + this.getX() + " y is " + this.getY() + " and z is " + this.getZ() + ".");
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
