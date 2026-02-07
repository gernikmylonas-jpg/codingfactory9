package gr.aueb.cf.cf9.solutions.ch12;

public class Main {
    public static void main(String[] args) {
        PointXYZ pointXYZ = new PointXYZ(1,1,1);

        System.out.println("Distance XY: " + pointXYZ.getXYDistance());
        System.out.println("Distance YZ: " + pointXYZ.getYZDistance());
        System.out.println("Distance XZ: " + pointXYZ.getXZDistance());
        System.out.println("Distance XYZ: " + pointXYZ.getXYZDistance());


    }

}
