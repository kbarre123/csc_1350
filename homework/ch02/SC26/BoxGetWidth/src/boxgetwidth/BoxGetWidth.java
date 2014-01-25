/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boxgetwidth;

import java.awt.Rectangle;

/**
 *
 * @author kcb
 */
public class BoxGetWidth {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Get the width of a box.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println("Before: " + box.getWidth());
        box.translate(25, 40);
        System.out.println("After: " + box.getWidth());
    }
    
}
