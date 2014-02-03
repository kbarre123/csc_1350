/*
 * Implement a method unclick() that undoes an unwanted button click.
 */
package concertcounterunclick;

/**
 *
 * @author kbarr17
 */
public class ConcertCounterUnclick {

    public static void main(String[] args) {
        // Create a CounterFunctions object.
        CounterFunctions counter = new CounterFunctions();
        
        // Print current value of clicks.
        System.out.print("Initial value of clicks: ");
        System.out.println(counter.getValue());
        
        // Advance the counter by 1 click.
        counter.click();
        
        // Print updated value of clicks.
        System.out.print("Value of clicks after click(): ");
        System.out.println(counter.getValue());
        
        // Unclick.
        counter.unclick();
        
        // Print current value of clicks.
        System.out.print("Value of clicks after unclick(): ");
        System.out.println(counter.getValue());
    }
}
