/*
 * Implements selection sort.
 */

package sorttimer;

/**
 *
 * @author kbarr17
 */
public class SelectionSorter 
{
    /**
     * Sorts an array, named a, into increasing order using
     * selection sort.
     * @param a 
     */
    public static void selectionSort(int[] a) 
    {
        for (int i = 0; i < a.length; i++) 
        {
            int minPos = minimumPosition(a, i);
            swap(a, minPos, i);
        }
    }
    
    /**
     * Finds the smallest element in a tail range of the array.
     * @param a the array to sort
     * @param from the first position in a to compare
     * @return the position of the smallest element in the range
     */
    private static int minimumPosition(int[] a, int from)
    {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++) 
        {
            if (a[i] < a[minPos]) { minPos = i; }
        }
        return minPos;
    }
    
    /**
     * Swaps two entries of an array.
     * @param a the array
     * @param i the first position to swap
     * @param j the second position to swap
     */
    public static void swap(int[] a, int i, int j)
    {
        int temp = a[i];
        a[i] = a[j];
        a[j] = temp;
    }
}
