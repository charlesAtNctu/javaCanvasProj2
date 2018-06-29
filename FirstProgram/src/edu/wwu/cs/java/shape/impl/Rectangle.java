package edu.wwu.cs.java.shape.impl;

import edu.wwu.cs.java.shape.Shape;

/**
* Created by aime1 on 6/24/18.
*/
public class Rectangle extends Shape {

    Point topLeftCorner;
    int height;
    int width;

    public Rectangle(Point topLeftCorner, int height, int width, char color){
        super(color);
        this.topLeftCorner = topLeftCorner;
        this.height = height;
        this.width = width;
    }

    public boolean overlap(int x, int y){

        return  x > topLeftCorner.getX()          &&
                x < topLeftCorner.getX() + height &&
                y > topLeftCorner.getY()          &&
                y < topLeftCorner.getY() + width;

        // LOGIC OPERATOR, ADD,
        // true  && true  -> true
        // true  && false -> false
        // false && true -> false
        // false && false -> false

        // OR
        // true || true -> true
        // true || false -> true
        // false || true -> true
        // false || false -> false

        // XOR

        //


    }

}
