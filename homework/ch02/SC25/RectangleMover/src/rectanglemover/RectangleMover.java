/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package rectanglemover;
import java.awt.Rectangle;

/**
 *
 * @author kcb
 */
public class RectangleMover {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Move a rectangle around.
        
        // Initial state of rectangle.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("X before: " + box.getX());
        System.out.println("Y before: " + box.getY());
        System.out.println("Width before: " + box.getWidth());
        System.out.println("Height before: " + box.getHeight());
        
        // Translate rectangle.
        box.translate(25, 40);
        
        // Final state of rectangle.
        System.out.println("X after: " + box.getX());
        System.out.println("Y after: " + box.getY());
        System.out.println("Width after: " + box.getWidth());
        System.out.println("Height after: " + box.getHeight());
    }
    
}
