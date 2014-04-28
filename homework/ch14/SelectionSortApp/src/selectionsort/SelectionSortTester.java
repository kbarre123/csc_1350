/*
 * Tests the Selection Sort algorithm by sorting an array filled
 * with random numbers.
 */
package selectionsort;

import java.util.Arrays;

public class SelectionSortTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Generate array filled with random numbers.
        int[] a = ArrayUtilities.randomIntArray(10, 100);
        System.out.println(Arrays.toString(a));
        
        // Sort that shit.
        SelectionSorter.sort(a);
        System.out.println(Arrays.toString(a));
    }
}
