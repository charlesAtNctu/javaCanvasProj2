package edu.wwu.cs.java.shape;

/**
 * Created by aime1 on 6/24/18.
 */
public abstract class Shape {

    private char color;// 1. use setter or getter to access the data member, color.

    public char getColor() {
        return color;
    }

    public void setColor(char color) {
        this.color = color;
    }

    public abstract boolean overlap(int x, int y);// 2. use abstract to enforce subclasses to implement overlay mehtod

    public abstract double area();

    public Shape(char color){
        this.color = color;
    }

}
