/** 
 * Create a pattern composed of black & white tiles, with a fringe of
 * black tiles around the edge and two/three black tiles in the center, equally 
 * spaced from the boundary. The inputs are total # of rows and columns. 
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
        
        // Declare variables.
        int row = 0;
        int col = 0;
        String b = "b ";
        String w = "w ";
        
        // Take inputs.
        Scanner keyboard = new Scanner(System.in);
        System.out.println("How many rows would you like?");
        row = keyboard.nextInt();
        System.out.println("How many columns would you like?");
        col = keyboard.nextInt();
        
        // Print rows.
        for (int i = 0; i < row; i++) {
            
            // If its the first or last row, print each column black.
            if (i == 0 || i == (row-1)) {
                for (int j = 0; j < col; j++) {
                    System.out.print(b);
                }
                System.out.println();
            }
            
            // If middle row and even, print center columns black.
            else if (row % 2 == 0) {
                if (i == ((row/2)-1) || i == (row/2)) {
                    System.out.print(b);
                } else {
                
                }
                
            }
            
            // If midde row and odd, print center columns black.
            else if (i % 2 != 0) {
                
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
