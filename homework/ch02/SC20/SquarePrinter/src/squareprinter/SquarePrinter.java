/*
 * Construct a square with center 100,100 and side length 20.
 */

package squareprinter;
import java.awt.Rectangle;

/**
 *
 * @author kcb
 */
public class SquarePrinter {

    public static void main(String[] args) {
        //Rectangle box1 = new Rectangle(90, 90, 20, 20);
        //Rectangle box2 = new Rectangle(110, 90, 20, 20);
        
        // SC20
        //System.out.println(new Rectangle().getWidth());
        
        // SC25
        /*
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("Before: " + box.getX());
        
        box.translate(25, 40);
        System.out.println("After: " + box.getX());
        */
        
        // SC26
        /*
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("Before: " + box.getWidth());
        
        box.translate(25, 40);
        System.out.println("After: " + box.getWidth());
        
        String greeting = "Hello";
        System.out.println(greeting.toUpperCase());
        System.out.println(greeting);
        */
        
        // SC29: Move origin to 0,0.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        box.translate(-5, -10);
        System.out.println("X: " + box.getX() + ", Y: " + box.getY());
    }
    
}
