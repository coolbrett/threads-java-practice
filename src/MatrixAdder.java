<<<<<<< HEAD
import java.util.ArrayList;
import java.util.Random;

/**
 * Matrix Adder class
 *
 * @author Brett Dale
 * @author Katherine Blanton
 */
public class MatrixAdder{

    /**
     * Main method for Matrix Adder
     * @param args command line args
     */
    public static void main(String[] args){

        int [][] matrix0 = new int[25][];

        Random r = new Random();

        for(int i = 0; i < matrix0.length; i++){
            matrix0[i] = new int[r.nextInt(50000)];
        }

        for(int i = 0; i < matrix0.length; i++){
            for(int j = 0; j < matrix0[i].length; j++){
                matrix0[i][j] = 1;
            }
        }

        ArrayList<Thread> threads = new ArrayList<>();
        SumAccumulator sumAccumulator = new SumAccumulator();
        for (int i = 0; i < matrix0.length; i++){
            Thread thread = new Thread(new AdderWorker(sumAccumulator, matrix0[i], i));
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try{
            for (Thread thread : threads) {
                thread.join();
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("SUM ----> " + sumAccumulator.getSum());

    }
}

=======
import java.util.ArrayList;
import java.util.Random;

/**
 * Matrix Adder class
 *
 * @author Brett Dale
 * @author Katherine Blanton
 */
public class MatrixAdder{

    /**
     * Main method for Matrix Adder
     * @param args command line args
     */
    public static void main(String[] args){

        int [][] matrix0 = new int[25][];

        Random r = new Random();

        for(int i = 0; i < matrix0.length; i++){
            matrix0[i] = new int[r.nextInt(50000)];
        }

        for(int i = 0; i < matrix0.length; i++){
            for(int j = 0; j < matrix0[i].length; j++){
                matrix0[i][j] = 1;
            }
        }

        ArrayList<Thread> threads = new ArrayList<>();
        SumAccumulator sumAccumulator = new SumAccumulator();
        for (int i = 0; i < matrix0.length; i++){
            Thread thread = new Thread(new AdderWorker(sumAccumulator, matrix0[i], i));
            threads.add(thread);
        }

        for (Thread thread : threads) {
            thread.start();
        }

        try{
            for (Thread thread : threads) {
                thread.join();
            }
        }
        catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        System.out.println("SUM ----> " + sumAccumulator.getSum());

    }
}

>>>>>>> b9f4b8f9412e6395de5d062c3972884b022ed4ba
