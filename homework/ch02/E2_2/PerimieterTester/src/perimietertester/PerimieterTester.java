/*
 * Construct a rectangle and compute/print its perimeter.
 */
package perimietertester;
import java.awt.Rectangle;

/**
 *
 * @author kbarr17
 */
public class PerimieterTester {

    public static void main(String[] args) {
        // Construct rectangle.
        Rectangle box = new Rectangle(10, 10, 20, 40);
        
        // Calculate the perimeter.
        double perimeter = (box.getHeight()*2)+(box.getWidth()*2);
        
        // Print the perimeter.
        System.out.println(perimeter);
        
        // Print the expected results.
        System.out.println("Expected preimeter: 120.0");
    }
}
