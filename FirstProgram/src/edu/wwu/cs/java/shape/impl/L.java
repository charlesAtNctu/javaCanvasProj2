package edu.wwu.cs.java.shape.impl;

import edu.wwu.cs.java.shape.Shape;

/**
 * Created by aime1 on 7/1/18.
 */
public class L extends Shape {

    private Rectangle topRectangle;
    private Rectangle bottomRecetangle;

    public L(Point p, int h, int w, char color){
        super(color);
        topRectangle = new Rectangle(
                p, (int) (2/3.0 * h), (int) (1/3.0 * w), color);
        bottomRecetangle = new Rectangle(
                new Point(p.getX(), p.getY() + (int) (2/3.0 * h), ' ')
                , (int) (1/3.0 * h), w, color);
    }

    public boolean overlap(int x, int y){
        return topRectangle.overlap(x,y) || bottomRecetangle.overlap(x,y);
    }

    public double area(){
        return topRectangle.area() + bottomRecetangle.area();
    }

}
