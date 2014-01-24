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
        
        // Is row even or odd?
        // Row is even.
        if (row % 2 == 0) {
            // Is col even or odd?
            // Col is even.
            if (col % 2 == 0) {
                // Is row first or last row?
                // Is row middle row?
                // Is row neither?
            } 
            // Col is odd.
            else {
                // Is row first or last row?
                // Is row middle row?
                // Is row neither?
            }
        } 
        
        // Row is odd.
        else {
            // Is col even or odd?
            // Col is even.
            if (col % 2 == 0) {
                // Is row first or last row?
                // Is row middle row?
                // Is row neither?
            } 
            // Col is odd.
            else {
                // Is row first or last row?
                // Is row middle row?
                // Is row neither?
            }
        }
    }
}
