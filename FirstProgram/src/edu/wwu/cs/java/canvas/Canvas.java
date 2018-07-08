package edu.wwu.cs.java.canvas;

import edu.wwu.cs.java.shape.Shape;

import java.util.ArrayList;

/**
 * Created by aime1 on 6/3/18.
 */
public class Canvas {

    private static int rowCount;// these 3 things are called data members.
    private static int colCount;
    private static char[][] pixels;// although all lower cases, but once putting [] becomes reference type

    private static ArrayList<Shape> shapes = new ArrayList<Shape>();

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
                for(Shape s : shapes) {
                    if(s.overlap(x, y)){// polymorphism !!!
                        pixels[r][c] = s.getColor();
                        break;// jump out of the nearest for loop ...
                    }
                }
                try {
                    Thread.sleep(10);
                } catch (Exception e){
                    System.out.println("cannot sleep");
                }
            }

            // for visualizing purpose
            String whatsbeenprepared = "";
            for(int c = 0; c < colCount; c++){
                whatsbeenprepared += pixels[r][c];
            }
            System.out.println("Thread " + Thread.currentThread().getId() + " is preparing " + whatsbeenprepared);
        }
    }

    public void renderWithThread(int numberOfThreads){
        int startRow = 0;
        int range = rowCount / numberOfThreads;// 100 / 5 = 20

        Thread[] allThreads = new Thread[numberOfThreads];

        for(int i = 0; i < numberOfThreads; i++){
            int endRow = startRow + range;
            System.out.println("start " + startRow);
            System.out.println("end   " + endRow);
            ////////////////////////// begin thread part
            allThreads[i] = new Thread(new RenderHelper(startRow, endRow));
            allThreads[i].start();
            ////////////////////////// end thread part
            startRow = endRow;
        }

        for(int i = 0; i < numberOfThreads; i++){
            try {
                allThreads[i].join();
            } catch (InterruptedException ie){
                // TODO: ...
            }
        }
    }

    public void display(){
        for(int r = 0; r < rowCount; r++) {// memorize
            for (int c = 0; c < colCount; c++) {
                System.out.print(pixels[r][c]);
            }
            System.out.println();
        }
    }

    public void insert(Shape s){
        shapes.add(s);
    }

    public class RenderHelper implements Runnable {

        private int startingRow;
        private int endingRow;

        public RenderHelper(int startingRow, int endingRow){
            this.startingRow = startingRow;// inclusive
            this.endingRow = endingRow;// exclusive
        }

        public void run(){
            for(int r = startingRow; r < endingRow; r++){// memorize
                for(int c = 0; c < colCount; c++){
                    int x = r;
                    int y = c;
                    for(Shape s : shapes) {
                        if(s.overlap(x, y)){// polymorphism !!!
                            pixels[r][c] = s.getColor();
                            break;// jump out of the nearest for loop ...
                        }
                    }
                    try {
                        Thread.sleep(10);
                    } catch (Exception e){
                        System.out.println("cannot sleep");
                    }
                }

                // for visualizing purpose
                String whatsbeenprepared = "";
                for(int c = 0; c < colCount; c++){
                    whatsbeenprepared += pixels[r][c];
                }
                System.out.println("Thread " + Thread.currentThread().getId() + " is preparing " + whatsbeenprepared);
            }
        }

    }

    public double giveMeAllTheAreas(){
        double rtn = 0.0;
        for(Shape s : shapes){
            rtn += s.area();
        }
        return rtn;
    }
}
