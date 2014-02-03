/*
 * Define methods of the ConcertCounterUnclick program.
 */
package concertcounterunclick;

/**
 *
 * @author kbarr17
 */
public class CounterFunctions {
    
    // Create private instance variable.
    private int value;
    
    // Current count of counter.
    public int getValue() {
        return value;
    }
    
    // Advance the counter by 1.
    public void click() {
        value++;
    }
    
    // Undo an unwanted click.
    public void unclick() {
        value--;
    }
}
