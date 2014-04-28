/*
 * A component that draws circles and lines and stuff.
 */

package circleviewer;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import javax.swing.JComponent;

/**
 *
 * @author kcb
 */
public class CircleComponent extends JComponent {
    
    public void paintComponent(Graphics g) {
        // Recover Graphics2D and create a graphics object named g2.
        Graphics2D g2 = (Graphics2D) g;
        
        // Construct new circle object and draw it.
        Ellipse2D.Double circle = new Ellipse2D.Double(100, 100, 25, 25);
        g2.draw(circle);
        
        // Draw a V using lines.
        // Construct new line and draw it.
        Line2D.Double myV1 = new Line2D.Double(75, 50, 100, 75);
        g2.draw(myV1);
        
        // Construct a second line and draw it.
        Line2D.Double myV2 = new Line2D.Double(100, 75, 125, 50);
        g2.draw(myV2);
        
        // Draw a sting consisting of the letter "V".
        g2.drawString("The letter V", 25, 25);
        
        // Construct and draw a yellow square with red background.
        g2.setColor(Color.yellow);
        Rectangle box = new Rectangle(25, 50, 25, 25);
        g2.draw(box);
        g2.setColor(Color.red);
        g2.fill(box);
    }
}
