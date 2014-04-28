/*
 * @author KC Barrett
 */

package sorttimer;
import java.util.Random;
import java.util.Scanner;

public class SortTimer 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Seed for the RNG.
        int seed = 0;
        
        // Maximum value that the RNG returns.
        int maxRandomValue = 100000;
        int numRuns = 5;
        
        // RNG object
        Random rand = new Random(seed);
        
        // Take user input
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the starting value for the length n of the"
                + "array to be sorted, the stepsize by which n is increased,"
                + "and the number of steps:");
        
        int start = scan.nextInt();
        int stepSize = scan.nextInt();
        int stepNum = scan.nextInt();
        int end = stepSize * stepNum;
        
        // Place to store millis taken during sorting
        int selectionSum = 0;
        int insertionSum = 0;
        
        int m;

        long selectionSartTime = 0;
        long insertionSartTime = 0;
        long selectionEndTime = 0;
        long insertionEndTime = 0;
        long selectionSortTime = 0;
        long insertionSortTime = 0;
        
        // Execute sort operations and calculate time
        for (int n = start; n < end; n+= stepSize)
        {
            int[] nums1 = new int[n];
            int[] nums2 = new int[n];
            
            for (int i = 0; i < numRuns; i++) 
            {
                for (int j = 0; j < n; j++) {
                    m = rand.nextInt(maxRandomValue) + 1;
                    nums1[j] = m;
                    nums2[j] = m;
                }
                selectionSartTime = System.currentTimeMillis();
                SelectionSorter.selectionSort(nums1);
                selectionEndTime = System.currentTimeMillis();
                selectionSortTime = selectionEndTime - selectionSartTime;
                selectionSum += selectionSortTime;

                insertionSartTime = System.currentTimeMillis();
                InsertionSort.insertionSort(nums2);
                insertionEndTime = System.currentTimeMillis();
                insertionSortTime = insertionEndTime - insertionSartTime;
                insertionSum += insertionSortTime;
            
                int selectionAverageTime = selectionSum / numRuns;
                int insertionAverageTime = insertionSum / numRuns;
        
                System.out.printf("n = %d  Sort Run Time (milliseconds):  Selection: %d  Insertion: %d%n", n, selectionAverageTime, insertionAverageTime);
                
            }
            n += stepSize;
        }
    }
}
