package com.company;

import java.lang.Math;

public class Circle {

    public int radius;
    public int diameter;
    public double area;

    public Circle() {
        setRadius(1);
    }

    public Circle(int radius) {
        setRadius(1);
        this.diameter = radius * 2;
        this.area = diameter * Math.PI;

    }

    public void setRadius(int radius) {
        this.radius = radius;
        this.diameter = radius * 2;
        this.area = diameter * Math.PI;
    }

    public int getRadius() {
        return this.radius;
    }
}
