/*
 * Create and move rectangles around.
 */

package movetester;
import java.awt.Rectangle;

/**
 *
 * @author kcb
 */
public class MoveTester 
{
    
    public static void main(String[] args) 
    {
        // Construct rectangle object.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        
        // Move box.
        box.translate(25, 15);
        
        // Print info about the moved box.
        System.out.print("x: ");
        System.out.println(box.getX());
        System.out.println("Expected: 30");
        
        System.out.print("y: ");
        System.out.println(box.getY());
        System.out.println("Expected: 25");
    }
    
}
