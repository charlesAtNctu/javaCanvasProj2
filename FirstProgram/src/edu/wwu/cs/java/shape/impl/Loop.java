package edu.wwu.cs.java.shape.impl;

import edu.wwu.cs.java.shape.Shape;

/**
 * Created by aime1 on 6/24/18.
 */
public class Loop extends Shape {

    private Circle innerCircle;
    private Circle outerCircle;

    public Loop(Point center, int innerR, int outerR, char color){
        super(color);
        innerCircle = new Circle(center, innerR, ' ');
        outerCircle = new Circle(center, outerR, ' ');
    }

    public boolean overlap(int x, int y){
        return outerCircle.overlap(x, y) && !innerCircle.overlap(x, y);
    }

}
