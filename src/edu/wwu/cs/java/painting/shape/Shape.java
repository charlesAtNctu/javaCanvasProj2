package edu.wwu.cs.java.painting.shape;

/**
 * Created by aime1 on 5/17/18.
 */
public abstract class Shape {

    private final char color;

    public Shape(char color){
        this.color = color;
    }

    public abstract boolean contains(int x, int y);

    public char getColor() {
        return color;
    }
}
