/*
 * Create a counter for a concert venue.
 */

package concertcounter;

/**
 *
 * @author kcb
 */
public class ConcertCounter {

    public static void main(String[] args) {
        
        Counter myCounter = new Counter();
        
        // Print the initial status of count.
        System.out.println("Initial value of counter: " + myCounter.count());
        
        // Advance counter by one.
        myCounter.click();
        
        // Print the new status of count.
        System.out.println("Updated value of counter: " + myCounter.count());
    }
    
}
