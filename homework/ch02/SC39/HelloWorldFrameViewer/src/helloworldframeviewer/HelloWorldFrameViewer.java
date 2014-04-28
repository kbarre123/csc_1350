/*
 * Explore SC39-43.
 */

package helloworldframeviewer;
import javax.swing.JFrame;

/**
 *
 * @author kcb
 */
public class HelloWorldFrameViewer {
    
    public static void main(String[] args) {
        JFrame frame1 = new JFrame();
        frame1.setSize(300, 400);
        frame1.setTitle("Hello, World!");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create new RectangleComponent.
        RectangleComponent component = new RectangleComponent();
        frame1.add(component);
        
        frame1.setVisible(true);
        
        /*
        *JFrame frame2 = new JFrame();
        *frame2.setSize(300, 400);
        *frame2.setTitle("Hello, World!");
        *frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        *frame2.setVisible(true);
        */
    }
    
}
