/*
 * Set the background of a JFrame to pink.
 */

package framebackgroundviewer;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

/**
 *
 * @author kcb
 */
public class FrameBackgroundViewer {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        
        frame.setSize(500, 500);
        
        JLabel label = new JLabel("Hello, world!");
        label.setOpaque(true);
        label.setBackground(Color.PINK);
        
        frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
