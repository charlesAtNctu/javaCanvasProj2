package edu.wwu.cs.java;

/**
 * Created by aime1 on 7/1/18.
 */
public class TestRunable implements Runnable {

    private final int id;
    private int count;

    public TestRunable(int id, int count){
        this.id = id;
        this.count = count;
    }

    public void run(){

        // JOB TO DO
        for(int i = 0; i < count; i++){
            System.out.println("Thread " + id + " is counting " + (i+1));
        }
    }

}
