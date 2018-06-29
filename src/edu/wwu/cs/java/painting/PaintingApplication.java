package edu.wwu.cs.java.painting;

import edu.wwu.cs.java.painting.canvas.Canvas;
import edu.wwu.cs.java.painting.shape.impl.character.O;
import edu.wwu.cs.java.painting.shape.impl.shape.Circle;
import edu.wwu.cs.java.painting.shape.impl.shape.Point;
import edu.wwu.cs.java.painting.shape.impl.shape.Rectangle;

/**
 * Created by aime1 on 5/18/18.
 */
public class PaintingApplication {

    public static void main(String[] args) throws Throwable {

        Canvas canvas = new Canvas();
        canvas.render();


        //canvas.fill(new Rectangle(new Point(10, 10), 10, 10, ' '));
        //canvas.fill(new Rectangle(new Point(70, 10), 10, 10, ' '));
        //canvas.fill(new Rectangle(new Point(10, 30), 70, 5, ' '));

       // canvas.fill(new Point(50,20,' '));

        //canvas.fill(new Circle(new Point(40, 20), 5, '#'));
        //canvas.fill(new O(new Point(0, 0), 40, ' '));
//        canvas.fill(new O(new Point(10, 10), 15, '/'));
//        canvas.fill(new O(new Point(50, 20), 10, '/'));
   //     canvas.fill(new O(new Point(50, 20),  5, '/').);

    }
}
