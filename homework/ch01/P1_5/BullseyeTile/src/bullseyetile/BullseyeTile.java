/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bullseyetile;
import java.util.Scanner;

/**
 *
 * @author kcb
 */
public class BullseyeTile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /** 
         * Create a pattern composed of black & white tiles, with a fringe of
         * black tiles around and two/three black tiles in the center, equally 
         * spaced from the boundary. The inputs are total # of rows and columns.
         */
        
        // Declare variables.
        int row = 0;
        int col = 0;
        char b = 'b';
        char w = 'w';
        int previous_row = 0;
        int previous_col = 0;
        
        // Take inputs.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many rows?");
        row = keyboard.nextInt();
        System.out.println("How many columns?");
        col = keyboard.nextInt();
        
        // Print rows.
        for (int i = 0; i < row; i++) {
            // If its the first or last row, print a solid row of black.
            if (i == 0 || i == (row-1)) {
                for (int j = 0; j < col; j++) {
                    System.out.print(b);
                }
                System.out.println();
            }
            // Else, print first & last col black.
            else {
                for (int k = 0; k < col; k++) {
                    if (k == 0 || k == (col-1)) {
                        System.out.print(b);
                    }
                    else {
                        System.out.print(w);
                    }
                }
                System.out.println();
            }
        }
    }
}
