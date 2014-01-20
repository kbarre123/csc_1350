/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interestcalculation;

/**
 *
 * @author kcb
 */
public class InterestCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculate compound interest, see when account is depleated.
        
        // Declare variables
        int principle = 20000;
        int month = 0;
        int withdrawal = 500;
        float interest = (float) 1.005;
        
        while (principle > 0){
            principle -= 500;
            principle *= interest;
            System.out.print(principle);
            System.out.print(", " + month);
            System.out.println(", " + (month/12) + ".");
            month++;
        }
    }
    
}
