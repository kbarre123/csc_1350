/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inputdialog;
import javax.swing.JOptionPane;

/**
 *
 * @author kcb
 */
public class InputDialog {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Promt user for name, print to screen.
        String name = JOptionPane.showInputDialog("What is your name?");
        System.out.print(name);
        
        System.out.println(" ");
    }
    
}
