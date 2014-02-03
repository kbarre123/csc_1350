/*
 * Construct a color object w/ RGB(50, 100, 150). Then apply .brighter() method
 * and print the RGB values.
 */
package brighterdemo;
import java.awt.Color;

/**
 *
 * @author kbarr17
 */
public class BrighterDemo {

    public static void main(String[] args) {
        // Construct color object.
        Color red = new Color(50, 100, 150);
        
        // Print original RGB values.
        System.out.print("Original R value: ");
        System.out.println(red.getRed());
        
        System.out.print("Original G value: ");
        System.out.println(red.getGreen());
        
        System.out.print("Original B value: ");
        System.out.println(red.getBlue());
        
        // Run .brighter method.
        Color redBrighter = red.brighter();
        
        // Print new RGB values.
        System.out.print("New R value: ");
        System.out.println(redBrighter.getRed());
        
        System.out.print("New G value: ");
        System.out.println(redBrighter.getGreen());
        
        System.out.print("New B value: ");
        System.out.println(redBrighter.getBlue());
    }
}
