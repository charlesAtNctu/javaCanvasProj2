package edu.wwu.cs.java;

/**
 * Created by aime1 on 7/1/18.
 */
public class TestTreads {
    public static void main(String[] args){

        Thread thread1 = new Thread(new TestRunable(1, 100));
        thread1.start();

        Thread thread2 = new Thread(new TestRunable(2, 100));
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException ie){
            // TODO: ... STILL THINKING ABOUT IT LATER ...
        }

        Thread thread3 = new Thread(new TestRunable(3, 100));
        thread3.start();
    }
}
