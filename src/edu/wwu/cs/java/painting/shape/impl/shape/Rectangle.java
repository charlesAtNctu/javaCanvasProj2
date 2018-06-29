package edu.wwu.cs.java.painting.shape.impl.shape;

import edu.wwu.cs.java.painting.shape.Shape;

/**
 * Created by aime1 on 5/17/18.
 */
public class Rectangle extends Shape {

    private final Point point;
    private final int   height;
    private final int   width;

    public Rectangle(Point point, int width, int height)
    {
        this(point, width, height, ' ');
    }

    public Rectangle(Point point, int width, int height, char color)
    {
        super(color);
        this.point = point;
        this.width = width;
        this.height = height;
    }

    public boolean contains(int x, int y)
    {
        return x >= point.getX() && x <= point.getX() + width && y >= point.getY() && y <= point.getY() + height;
    }
}
