package edu.wwu.cs.java.shape.impl;

import edu.wwu.cs.java.shape.impl.Point;
import edu.wwu.cs.java.shape.impl.Rectangle;

/**
* Created by aime1 on 6/24/18.
*/
public class Square extends Rectangle {

    public Square(Point topLeftCorner, int side, char color){
        super(topLeftCorner, side, side, color);
    }
}
