/*
 * Component for TwoSquareViewer.
 */

package twosquareviewer;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import javax.swing.JComponent;

/**
 *
 * @author kcb
 */
public class TwoSquareComponent extends JComponent {
    
    public void paintComponent(Graphics g) {
        // Recover Graphics2d.
        Graphics2D g2 = (Graphics2D) g;
        
        // Construct a square and draw it.
        Rectangle box1 = new Rectangle(30, 30, 40, 40);
        g2.draw(box1);
        
        // Construct a second square and draw it.
        Rectangle box2 = new Rectangle(40, 40, 20, 20);
        g2.draw(box2);
    }
}
