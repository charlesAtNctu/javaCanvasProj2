package edu.wwu.cs.java.painting.shape.impl.shape;

/**
 * Created by aime1 on 5/17/18.
 */
public class Square extends Rectangle {

    public Square(Point point, int size){
        super(point, size, size, ' ');
    }

    public Square(Point point, int size, char color){
        super(point, size, size, color);
    }
}
