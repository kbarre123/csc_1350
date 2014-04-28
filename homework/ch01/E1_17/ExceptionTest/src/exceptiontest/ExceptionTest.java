/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exceptiontest;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

/**
 *
 * @author kcb
 */
public class ExceptionTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception 
    {
        // Display error message.
        
        URL imageLocation = new URL (
            "http://horstmann.com/java4everyone/duke.gif");
        JOptionPane.showMessageDialog(null, "Hello, my name is Duke.", "Duke...",
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
    
}
