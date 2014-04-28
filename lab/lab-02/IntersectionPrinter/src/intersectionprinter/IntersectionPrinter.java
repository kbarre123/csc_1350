/*
 * Assignment 2c.
 */

package intersectionprinter;
import java.awt.Rectangle;

/**
 *
 * @author kbarr17
 */
public class IntersectionPrinter {

    public static void main(String[] args) {
        // Construct first two rectangles.
        Rectangle r1 = new Rectangle(10, 10, 50, 70);
        Rectangle r2 = new Rectangle(30, 30, 70, 50);
        
        // Calculate the intersection of r1 & r2.
        Rectangle r3 = r1.intersection(r2);
        
        // Print out results.
        System.out.println(r1);
        System.out.println(r2);
        System.out.println("Intersection: " + r3);
        System.out.println("");
        
        // Construct fourth rectangle.
        Rectangle r4 = new Rectangle(100, 100, 70, 50);
        
        // Calculate the intersection of r1 & r4.
        Rectangle r5 = r1.intersection(r4);
        
        // Print out results.
        System.out.println(r1);
        System.out.println(r4);
        System.out.println("Intersection: " + r5);
    }
    
}
