/*
 * Generate a random price b/t $10.00 and $19.95.
 */
package randompricegenerator;
import java.util.Random;

/**
 *
 * @author kbarr17
 */
public class RandomPriceGenerator {

    public static void main(String[] args) {
        // Construct Random object.
        Random obj = new Random();
        
        // Pull a Random double from the object.
        double result = obj.nextDouble();
        
        // Print results.
        System.out.println(result);
    }
}
