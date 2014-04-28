/*
 * Create a window and display a rectangle. Translate rectangle.
 */

package rectangleviewer;
import javax.swing.JFrame;

/**
 *
 * @author kcb
 */
public class RectangleViewer 
{

    public static void main(String[] args) 
    {
        // Create new JFrame object.
        JFrame frame = new JFrame();
        
        // Set up object.
        frame.setSize(300, 400);
        frame.setTitle("Two rectangles");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create new RectangleComponent.
        RectangleComponent component = new RectangleComponent();
        frame.add(component);
        
        // Make frame visible.
        frame.setVisible(true);
    }
    
}
