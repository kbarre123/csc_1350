/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package touppercase;

/**
 *
 * @author kcb
 */
public class ToUpperCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Change a string to upper case.
        
        // Declare string.
        String greeting = "Hello";
        
        // Mutate, which is not permanent.
        System.out.println(greeting.toUpperCase());
        // Prove that it's not permanent.
        System.out.println(greeting);
        
        // Make permanent.
        greeting = greeting.toUpperCase();
        
        // Prove that it's now permanent.
        System.out.println(greeting);
    }
    
}
