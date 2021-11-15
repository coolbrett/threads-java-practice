/**
 * Scott Barlowe
 * Mostly empty file for thread exercise
 *
 * @author Brett Dale
 * @author Katherine Blanton
 *
 */

import java.util.*;

public class ThreadInterrupted{

    /**
     * Main method for ThreadInterrupted class
     * @param args command line args
     */
    public static void main(String[] args){

        AnotherAdderWorker anotherAdderWorker = new AnotherAdderWorker(0);
        AnotherAdderWorker anotherAdderWorker1 = new AnotherAdderWorker(1);

        Thread thread = new Thread(anotherAdderWorker);
        Thread thread1 = new Thread(anotherAdderWorker1);

        thread.start();
        thread1.start();

        try {
            for (int i = 0; i < 5; i++){
                Thread.sleep(10*i);
            }
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        thread.interrupt();
        thread1.interrupt();

    }
}
