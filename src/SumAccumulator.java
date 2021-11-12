/**
 * Support file inspired by https://www.cs-book.com/OS9/java-dir/4.pdf
 *
 * @author Brett Dale
 * @author Katherine Blanton
 */

public class SumAccumulator{

    /**Sum field */
    private int sum;

    /**
     * Getter method for sum field
     * @return sum field
     */
    public int getSum(){
        return sum;
    }

    /**
     * Setter method for sum field
     * @param sum sum to be set
     */
    public void setSum(int sum){
        this.sum += sum;
    }
}
