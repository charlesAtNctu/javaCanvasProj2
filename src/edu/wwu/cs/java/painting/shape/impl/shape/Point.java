package edu.wwu.cs.java.painting.shape.impl.shape;

import edu.wwu.cs.java.painting.shape.Shape;

/**
 * Created by aime1 on 5/17/18.
 */
public class Point extends Shape {

    private final int x;
    private final int y;

    public Point(int x, int y){
        this(x, y, ' ');
    }

    public Point(int x, int y, char color){
        super(color);
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public boolean contains(int x, int y){
        return x == this.x && y == this.y;
    }
}
