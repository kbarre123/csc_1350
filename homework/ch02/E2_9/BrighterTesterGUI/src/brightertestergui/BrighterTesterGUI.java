/*
 * Repeat E2.8, but view as the background color of a JFrame. For fun,
 * create two JFrames and make the second brighter than the first using the
 * .brighter() method of the Color class.
 */
package brightertestergui;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author kbarr17
 */
public class BrighterTesterGUI {

    public static void main(String[] args) {
        // Construct new JFrames.
        JFrame frame1 = new JFrame();
        JFrame frame2 = new JFrame();
        
        // Set size of JFrame.
        frame1.setSize(200, 200);
        frame2.setSize(200, 200);
        
        // Set Title.
        frame1.setTitle("JFrame background color");
        frame2.setTitle("JFrame background color");
        
        // Set default close option.
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Set to visible.
        frame1.setVisible(true);
        frame2.setVisible(true);
        
        // Construct new color object.
        Color color = new Color(50, 100, 150);
        
        // Set background color.
        frame1.getContentPane().setBackground(color);
        frame2.getContentPane().setBackground(color.brighter());
    }
}
