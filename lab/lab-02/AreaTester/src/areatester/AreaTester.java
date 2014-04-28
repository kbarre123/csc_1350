/*
 * Assignment 2a. Construct a rectangle, then compute and print its area.
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
        Rectangle box = new Rectangle(10, 20, 50, 70);
        
        // Calculate the area.
        double width = box.getWidth();
        double height = box.getHeight();
        double area = width * height;
        
        // TODO: Answer should be cast as an integer, not a double.
        System.out.print("Area = ");
        System.out.println((int)area);
        
        System.out.print("Expected: ");
        System.out.println(50 * 70);
    }
}
