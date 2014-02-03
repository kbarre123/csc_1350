/*
 * Draw two squares, both with the same center.
 */

package twosquareviewer;
import javax.swing.JFrame;

/**
 *
 * @author kcb
 */
public class TwoSquareViewer {

    public static void main(String[] args) {
        // Create new JFrame object.
        JFrame frame = new JFrame();
        
        // Set up object.
        frame.setSize(300, 400);
        frame.setTitle("Two squares, same center.");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create new RectangleComponent.
        TwoSquareComponent component = new TwoSquareComponent();
        frame.add(component);
        
        // Make frame visible.
        frame.setVisible(true); 
    }
    
}
