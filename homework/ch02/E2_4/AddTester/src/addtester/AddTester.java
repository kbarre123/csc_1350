/*
 * Experiment with Rectangle.add(int newx, int newy). Print expected results
 * given the params in the excercise.
 */
package addtester;
import java.awt.Rectangle;

/**
 *
 * @author kbarr17
 */
public class AddTester {

    public static void main(String[] args) {
        // Construct rectangle object.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        // Call .add method.
        box.add(0, 0);
        
        // Print expected results.
        System.out.println("Expected results:");
        System.out.println("New X: 0");
        System.out.println("New Y: 0");
        System.out.println("New width: 25");
        System.out.println("New Height: 40");
        
        // Print actual results.
        System.out.println("Actual results:");
        System.out.print("New X: ");
        System.out.println(box.getX());
        System.out.print("New Y: ");
        System.out.println(box.getY());
        System.out.print("New width: ");
        System.out.println(box.getWidth());
        System.out.print("New Height: ");
        System.out.println(box.getHeight());
        
    }
}
