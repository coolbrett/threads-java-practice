/**
 * Adder Worker class
 *
 * @author Brett Dale
 * @author Katherine Blanton
 */
public class AdderWorker implements Runnable {

    /**Sum accumulator field */
    private SumAccumulator sumAccumulators;

    /**Matrix field */
    private int[] matrix;

    /**ID field */
    private int id;

    /**
     * Default constructor for Adder Worker
     * @param sumAccumulators sumAccumulator to be set
     * @param matrix matrix to be set
     * @param id id to be set
     */
    public AdderWorker(SumAccumulator sumAccumulators, int[] matrix, int id){
        this.sumAccumulators = sumAccumulators;
        this.matrix = matrix;
        this.id = id;
    }


    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++){
            sum += matrix[i];
        }
        System.out.println("Thread " + id + " added " + sum + " nums");
        sumAccumulators.setSum(sum);
    }
}
