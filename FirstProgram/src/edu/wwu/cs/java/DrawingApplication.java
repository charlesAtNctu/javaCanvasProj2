package edu.wwu.cs.java;

import edu.wwu.cs.java.canvas.Canvas;
import edu.wwu.cs.java.shape.impl.Circle;
import edu.wwu.cs.java.shape.impl.L;
import edu.wwu.cs.java.shape.impl.Loop;
import edu.wwu.cs.java.shape.impl.Point;
import edu.wwu.cs.java.shape.impl.Square;

/**
 * Created by aime1 on 5/20/18.
 */
public class DrawingApplication {

    public static void main(String[] args){// entry point for the program !!!

        System.out.println("This is my canvas.");

        // type followed by varialbe name followed by = followed by new ...
        Canvas myCanvas = new Canvas(30, 100, '_');// keyword: new (i.e., create an object)

//        Point p = new Point(2, 5, 'O');
//        myCanvas.insert(p);

        //edu.wwu.cs.java.shape.impl.Rectangle r = new edu.wwu.cs.java.shape.impl.Rectangle(new edu.wwu.cs.java.shape.impl.Point(10, 10, ' '), 10, 50, 'R');
        //myCanvas.insert(r);

//        Square s = new Square(new Point(5, 5, ' '), 5, 'S');
//        myCanvas.insert(s);

//        Circle c = new Circle(new Point(10, 90, ' '), 9, 'C');
//        myCanvas.insert(c);

        Loop l = new Loop(new Point(15, 15, ' '), 5, 10, 'O');
        myCanvas.insert(l);

        L characterL = new L(new Point(5, 15, ' '), 20, 20, 'L');
        myCanvas.insert(characterL);

        long startTime = System.currentTimeMillis();
        //myCanvas.renderWithThread(5);
        myCanvas.render();
        long elapseTime = System.currentTimeMillis() - startTime;
        System.out.println("total time spent: " + elapseTime);

        myCanvas.display();



        System.out.println("This is end of my canvas.");

        System.out.println("total area is " + myCanvas.giveMeAllTheAreas());

    }



}
