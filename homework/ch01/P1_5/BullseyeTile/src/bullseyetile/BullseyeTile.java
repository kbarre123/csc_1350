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
        int col;
        int row;
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
            // Print rows.
            for (int i = 0; i < row; i++) {
                // Is row first or last row?
                // Row is first or last row.
                if (i == 0 || i == (row - 1)) {
                    // Print black for each column.
                    for (int j = 0; j < col; j++) {
                        System.out.print(b);
                    }
                    System.out.println();
                }
                // Row is not a first or last row.
                else {
                    // Is row a middle row?
                    // Row is a middle row.
                    if (i == ((row/2)-1) || i == (row/2)) {
                        // Is col even or odd?
                        // Col is even.
                        if (col % 2 == 0) {
                            for (int k = 0; k < col; k++) {
                                if (k == 0 || k == (col - 1)) {
                                    System.out.print(b);
                                } else if (k == ((col/2)-1) || k == (col/2)) {
                                    System.out.print(b);
                                } else {
                                    System.out.print(w);
                                }
                            }
                            System.out.println();
                        }
                        // Col is odd.
                        else {
                            for (int l = 0; l < col; l++) {
                                if (l == 0 || l == (col - 1)) {
                                    System.out.print(b);
                                } else if (l == (col/2)) {
                                    System.out.print(b);
                                } else {
                                    System.out.print(w);
                                }
                            }
                            System.out.println();
                        }
                    }
                    // Row is not a middle row.
                    else {
                        for (int m = 0; m < col; m++) {
                            if (m == 0 || m == (col-1)) {
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
        
        // Row is odd.
        else {
            System.out.println("Slow your roll. I'm still on even columns!");
        }
    }
}
