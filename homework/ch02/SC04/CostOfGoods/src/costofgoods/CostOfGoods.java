/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package costofgoods;

/**
 *
 * @author kcb
 */
public class CostOfGoods {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declare variables;
        double unitPrice = 1.5; 
        int quantity = 5;
        double total = unitPrice * quantity;
        
        // Print the total cost of items.
        System.out.println(total);
    }
    
}
