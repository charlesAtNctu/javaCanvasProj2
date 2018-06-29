package edu.wwu.cs.java.painting.canvas;

import edu.wwu.cs.java.painting.shape.Shape;

import java.util.ArrayList;

/**
 * Created by aime1 on 5/17/18.
 */
public class Canvas {

    private final char DEFAULT_COLOR = 'X';
    private final char SHAPE_COLOR = ' ';

    private final int COL_COUNT = 100;
    private final int ROW_COUNT = 40;

    private final char[][] PIXELS = new char[ROW_COUNT][COL_COUNT];

    private final ArrayList<Shape> SHAPES = new ArrayList<Shape>();

    public Canvas(){
        for(int row = 0; row < PIXELS.length; row++){
            for(int col = 0; col < PIXELS[0].length; col++){
                PIXELS[row][col] = DEFAULT_COLOR;
            }
        }
    }

    public void fill(Shape shape){
        SHAPES.add(shape);
    }

    private void prepare() {
        for(int row = 0; row < PIXELS.length; row++){
            for(int col = 0; col < PIXELS[0].length; col++){
                for(Shape shape : SHAPES) {
                    if(shape.contains(col, row)){
                        PIXELS[row][col] = shape.getColor();
                    }
                }
            }
            System.out.println();
        }
    }

    public void render(){
        prepare();
        for(int row = 0; row < PIXELS.length; row++){
            for(int col = 0; col < PIXELS[0].length; col++){
                System.out.print(PIXELS[row][col]);
            }
            System.out.println();
        }
    }
}
