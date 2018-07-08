package edu.wwu.cs.java.shape.impl;

import edu.wwu.cs.java.shape.Shape;

/**
* Created by aime1 on 6/24/18.
*/
public class Circle extends Shape {

    private Point center;
    private int   radius;

    public Circle(Point center, int radius, char color){
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public boolean overlap(int x, int y){

        double input_x = x;
        double input_y = y;

        double center_x = center.getX();
        double center_y = center.getY();

        double distance = Math.sqrt(
          Math.pow((input_x - center_x),2) +
          Math.pow((input_y - center_y),2)
        );// Math util from java ...

        return distance < radius;

    }

    public double area(){
        return radius*radius*Math.PI;
    }
}
