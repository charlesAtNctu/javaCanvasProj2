package edu.wwu.cs.java.painting.shape.impl.character;

import edu.wwu.cs.java.painting.shape.Shape;
import edu.wwu.cs.java.painting.shape.impl.shape.Circle;
import edu.wwu.cs.java.painting.shape.impl.shape.Point;

/**
 * Created by aime1 on 5/18/18.
 */
public class O extends Shape {

    private final Point topLeftCorner;

    private final Circle innerCircle;

    private final Circle outerCircle;

    public O(Point topLeftCorner, int size, char color){
        super(color);
        this.topLeftCorner = topLeftCorner;
        this.outerCircle   = new Circle(new Point(topLeftCorner.getX()+size/2,topLeftCorner.getY()+size/2),size/2,color);
        this.innerCircle   = new Circle(new Point(topLeftCorner.getX()+size/2,topLeftCorner.getY()+size/2),size/3,color);
    }

    public boolean contains(int x, int y)
    {
        boolean rtn = outerCircle.contains(x,y) && !innerCircle.contains(x,y);
        if(rtn){
            return rtn;
        }
        return rtn;
    }
}
