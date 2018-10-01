package com.company;

public class Main {

    public static void main(String[] args) {

        Point2D myPoint2D = new Point2D(4,7);
        System.out.println("Coordinates are: " + myPoint2D.toString());

        Point3D myPoint3D = new Point3D(myPoint2D.getX(),myPoint2D.getY(), 9);
        System.out.println("Coordinates are: " + myPoint3D.toString());

    }
}
