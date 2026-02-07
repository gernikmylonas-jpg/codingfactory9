package gr.aueb.cf.cf9.solutions.ch12;

public class PointXYZ {
    private final int x;
    private final int y;
    private final int z;

    public PointXYZ() {
        x = 0;
        y = 0;
        z = 0;
    }

    public PointXYZ(int x, int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getZ() {
        return z;
    }

    public double getXYDistance(){
        return Math.sqrt(x*x + y*y);
    }

    public double getYZDistance(){
        return Math.sqrt(y*y + z*z);
    }

    public double getXZDistance(){
        return Math.sqrt(x*x + z*z);
    }

    public double getXYZDistance(){
        return Math.sqrt(x*x + y*y + z*z);
    }
}

