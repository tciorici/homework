package com.company;

public class Main {

    public static void main(String[] args) {

        MyPoint point1 = new MyPoint(0,4);
        MyPoint point2 = new MyPoint(4,0);
        MyPoint point3 = new MyPoint(0,0);
        MyTriangle triangle = new MyTriangle(point1,point2,point3);

        System.out.println(point1);
        System.out.println(point1.distance(0,0));

        System.out.println("Test distance between 2 point");
        System.out.println(point1.distance(point2));
        System.out.println(point2.distance(point1));
        System.out.println("Distance between a point and (0,0) is " + point1.distance());

        System.out.println(triangle);
        System.out.println("Perimeter of my triangle is " + triangle.getPerimeter());
        System.out.println("Type of my triangle is " + triangle.getType());

    }
}
