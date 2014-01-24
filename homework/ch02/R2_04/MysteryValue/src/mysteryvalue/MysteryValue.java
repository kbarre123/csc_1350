/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mysteryvalue;

/**
 *
 * @author kcb
 */
public class MysteryValue {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // What is the value of mystery after the sequence of statements?
        
        // Declare variables.
        int mystery = 1;
        
        // Perform assignments.
        mystery = 1 - 2 * mystery;
        mystery = mystery + 1;
        
        // Print
        System.out.println(mystery);
    }
    
}
