/*
 * Construct a rectangle, then compute and print its area.
 */

package areatester;
import java.awt.Rectangle;

/**
 *
 * @author kcb
 */
public class AreaTester 
{
    public static void main(String[] args) 
    {
        // Construct rectangle object.
        Rectangle box = new Rectangle(10, 20, 10, 10);
        
        // Calculate the area.
        double width = box.getWidth();
        double height = box.getHeight();
        double area = width * height;
        System.out.println(area);
        
        // Print the expected area.
        System.out.println("Expected area: 100");
    }
    
}
