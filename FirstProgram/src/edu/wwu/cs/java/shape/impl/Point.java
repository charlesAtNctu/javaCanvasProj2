package edu.wwu.cs.java.shape.impl;

import edu.wwu.cs.java.shape.Shape;

/**
 * Created by aime1 on 6/24/18.
 */
public class Point extends Shape {

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    private int x;
    private int y;

    public Point(int x, int y, char color){
        super(color);
        this.x = x;
        this.y = y;
    }

    public boolean overlap(int x, int y){
        return this.x == x && this.y == y;
    }
}
