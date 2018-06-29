package edu.wwu.cs.java.painting.shape.impl.shape;

import edu.wwu.cs.java.painting.shape.Shape;

/**
 * Created by aime1 on 5/18/18.
 */
public class Circle extends Shape {
    private final Point center;
    private final int   radius;

    public Circle(Point center, int radius)
    {
        this(center, radius, ' ');
    }

    public Circle(Point center, int radius, char color)
    {
        super(color);
        this.center = center;
        this.radius = radius;
    }

    public boolean contains(int x, int y)
    {
        return Math.sqrt(Math.pow(1.0*center.getX()-x,2)+Math.pow(1.0*center.getY()-y,2)) <= radius;
    }
}
