/*
 * Explore SC44-48.
 */

package circleviewer;
import javax.swing.JFrame;

/**
 *
 * @author kcb
 */
public class CircleViewer {
    public static void main(String[] args) {
        // Construct new JFrame and set parameters.
        JFrame frame = new JFrame();
        frame.setSize(200, 200);
        frame.setTitle("Construct a circle");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Add CircleComponent to frame.
        CircleComponent component = new CircleComponent();
        frame.add(component);
        
        // Make frame visible.
        frame.setVisible(true);
        
    }
    
}
