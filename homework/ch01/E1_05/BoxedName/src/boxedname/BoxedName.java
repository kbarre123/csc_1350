/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package boxedname;

/**
 *
 * @author kcb
 */
public class BoxedName {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Print my name in a box.
        
        // Print top line of box.
        System.out.print("+");
        System.out.print("-");
        System.out.print("-");
        System.out.print("-");
        System.out.print("-");
        System.out.println("+");
        
        // Print sides of box & my name.
        System.out.print("|");
        System.out.print(" ");
        System.out.print("KC");
        System.out.print(" ");
        System.out.println("|");
        
        
        // Print bottom line of box.
        System.out.print("+");
        System.out.print("-");
        System.out.print("-");
        System.out.print("-");
        System.out.print("-");
        System.out.println("+");
    }
    
}
