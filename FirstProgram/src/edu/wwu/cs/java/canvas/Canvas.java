package edu.wwu.cs.java.canvas;

import edu.wwu.cs.java.shape.Shape;

import java.util.ArrayList;

/**
 * Created by aime1 on 6/3/18.
 */
public class Canvas {

    private int rowCount;// these 3 things are called data members.
    private int colCount;
    private char[][] pixels;// although all lower cases, but once putting [] becomes reference type

    private ArrayList<Shape> shapes = new ArrayList<Shape>();

    public Canvas(){// entry point for the class creation. called constructor. constructor has no return type.
        rowCount = 50;
        colCount = 100;
        pixels = new char[rowCount][colCount];// whenever new is used, garbage collector is responsible to remove the memory for you later ...


    }

    // alternatively, you can let your user to specify rowCount, colCount
    public Canvas(int rCount, int cCount){// another entry point for the object creation

        rowCount = rCount;
        colCount = cCount;
        pixels = new char[rowCount][colCount];


    }

    public Canvas(int rCount, int cCount, char color){// another entry point for the object creation

        rowCount = rCount;
        colCount = cCount;
        pixels = new char[rowCount][colCount];

        for(int r = 0; r < rowCount; r++){// memorize
            for(int c = 0; c < colCount; c++){
                pixels[r][c] = color;
            }
        }


    }

    public void render(){
        for(int r = 0; r < rowCount; r++){// memorize
            for(int c = 0; c < colCount; c++){

                int x = r;
                int y = c;

                boolean isTheColorFromShape = false;

                for(Shape s : shapes) {
                    if(s.overlap(x, y)){// polymorphism !!!
                        System.out.print(s.getColor());
                        isTheColorFromShape = true;
                        break;// jump out of the nearest for loop ...
                    }
                }

                if(!isTheColorFromShape) {
                    System.out.print(pixels[r][c]);
                }

                try {
                    Thread.sleep(10);
                } catch (Exception e){
                    System.out.println("cannot sleep");
                }


            }
            System.out.println();
        }
    }

    public void insert(Shape s){
        shapes.add(s);
    }
}
