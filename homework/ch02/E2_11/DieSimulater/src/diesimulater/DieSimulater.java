/*
 * Simulate a die being tossed using the Random class of java.util.
 */
package diesimulater;
import java.util.Random;

/**
 *
 * @author kbarr17
 */
public class DieSimulater {

    public static void main(String[] args) {
        // Construct an object of class Random.
        Random generator = new Random();
        
        // Run .nextInt(n) on object, returning one of the possible
        // six results from a die.
        int results = generator.nextInt(6);
        
        // Print results.
        System.out.println(results);
    }
}
