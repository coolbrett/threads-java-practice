/**
 * Scott Barlowe
 * Additional AdderWorker for thread exercise.
 *
 * @author Brett Dale
 * @author Katherine Blanton
 */
public class AnotherAdderWorker implements Runnable{

    /**Sum field */
    private int sum;

    /**ID field */
    private int ID;

    /**Thread field */
    private Thread thread;

    /**
     * Constructor for AnotherAdderWorker
     * @param id id to be set
     */
    public AnotherAdderWorker(int id){
        this.ID = id;
        sum = 0;
    }

    /**
     * Run method for AnotherAdderWorker
     */
    public void run(){
        thread = Thread.currentThread();
        while (!thread.isInterrupted()){
            sum += 1;
        }
        System.out.println("Sum is " + sum);
    }
}