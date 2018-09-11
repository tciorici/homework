package com.company;

public class TestCircle {

    public static void main(String[] args) {


        Circle o = new Circle();
        Circle o1 = new Circle();
        Circle o2 = new Circle();
        Circle o3 = new Circle(7);

        o1.setRadius(3);
        o2.setRadius(5);


        System.out.println(o.area);
        System.out.println(o.diameter);
        System.out.println(o1.area);
        System.out.println(o1.diameter);
        System.out.println(o2.area);
        System.out.println(o2.diameter);
        System.out.println(o3.area);
        System.out.println(o3.diameter);

    }
}
