/*
 * Explore SC39-43.
 */

package helloworldframeviewer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author kcb
 */
public class RectangleComponent extends JComponent {
    
    public void paintComponent(Graphics g){
        // Recover Graphics2D
        Graphics2D g2 = (Graphics2D) g;
        
        // Construct a square and draw it.
        g2.setColor(Color.red);
        Rectangle box = new Rectangle(10, 20, 30, 30);
        g2.fill(box);
        
        // Construct a rectangle and draw it.
        g2.setColor(Color.blue);
        box.translate(20, 20);
        box.setSize(40, 30);
        g2.fill(box);
    }
}
