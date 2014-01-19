/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package haltron;
import javax.swing.JOptionPane;

/**
 *
 * @author kcb
 */
public class HalTron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Emulate Hal 3000.
        
        String instructions = JOptionPane.showInputDialog("My name is Hal. What would"
                + " you like me to do?");
        System.out.println("I'm sorry, Dave. I'm afraid I can't do that.");
        
        System.out.println(" ");
        
    }
    
}
