/*
 * Sorts an array using Selection Sort.
 */
package selectionsort;

public class SelectionSorter 
{
    /**
     * Sorts an array using Selection Sort.
     *
     * @param a the array to sort.
     */
    public static void sort(int[] a)
    {
        for (int i = 0; i < a.length - 1; i++)
        {
            int minPos = minPos(a, i);
            ArrayUtilities.swap(a, minPos, i);
        }
    }
    
    /**
     * Finds the smallest element n a tail range of the array
     * @param a the array to sort
     * @param from the first position in a to compare
     * @return the position of the smallest element in the range:
     * a[from]...a[a.length-1]
     */
    private static int minPos(int[] a, int from)
    {
        int minPos = from;
        for (int i = from + 1; i < a.length; i++)
        {
            if (a[i] < a[minPos])
            {
                minPos = i;
            }
        }
        return minPos;
    }
}
