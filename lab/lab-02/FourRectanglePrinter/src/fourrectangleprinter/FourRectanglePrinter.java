/*
 * Assignment 2b.
 */

package fourrectangleprinter;
import java.awt.Rectangle;

/**
 *
 * @author kbarr17
 */
public class FourRectanglePrinter {

    public static void main(String[] args) {
        // Create Rectangle object.
        Rectangle box = new Rectangle(10, 20, 50, 70);
        
        // Print original box.
        System.out.println(box);
        
        // Translate box to the right.
        box.translate((int)box.getWidth(), 0);
        // Print first translation of box.
        System.out.println(box);
        
        // Translate box to bottom right.
        box.translate(0, (int)box.getHeight());
        // Print second translation of box.
        System.out.println(box);
        
        // Translate box to bottom left.
        box.translate(-(int)box.getWidth(), 0);
        // Print third translation of box.
        System.out.println(box);
    }
}
