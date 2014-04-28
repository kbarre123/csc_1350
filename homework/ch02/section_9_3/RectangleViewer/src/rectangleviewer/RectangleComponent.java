/*
 * Construct a component that draws two rectangles.
 */

package rectangleviewer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author kcb
 */
public class RectangleComponent extends JComponent
{
    
    public void paintComponent(Graphics g)
    {
        // Recover Graphics2d.
        Graphics2D g2 = (Graphics2D) g;
        
        // Construct a rectangle and draw it.
        Rectangle box = new Rectangle(5, 10, 20, 30);
        g2.draw(box);
        
        // Move rectangle.
        box.translate(15, 25);
        
        // Draw moved rectangle.
        g2.draw(box);
    }
    
}
