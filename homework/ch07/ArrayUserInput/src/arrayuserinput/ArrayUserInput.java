/*
 * Take user input and assign values to nodes of an array.
 */
package arrayuserinput;
import java.util.Scanner;
import java.util.Arrays;

public class ArrayUserInput 
{
    public static void main(String[] args) 
    {
        final int LENGTH = 10;
        double[] values = new double[LENGTH];
        int currentSize = 0;
        
        // Read inputs
        Scanner s = new Scanner(System.in);
        System.out.print("Enter values; Q to quit: ");
        while (s.hasNextDouble() && currentSize < values.length) 
        {            
            values[currentSize] = s.nextDouble();
            currentSize++;
        }
        
        System.out.printf("Size of array: %d%n", values.length);
        System.out.printf("Elements in array: %d%n", currentSize);
        System.out.println();
        
        // Find largest and smallest element
        double largest = values[0];
        double smallest = values[0];
        for (int i = 1; i < currentSize; i++) 
        {
            if (values[i] > largest) 
            {
                largest = values[i];
            }
        }
        for (int i = 1; i < currentSize; i++) 
        {
            if (values[i] < smallest) 
            {
                smallest = values[i];
            }
        }
        System.out.printf("Largest element in array: %f%n", largest);
        System.out.printf("Smallest element in array: %f%n", smallest);
        
        // Find the average
        double total = 0;
        double count = currentSize;
        double average = total / count;
        for (int i = 0; i < currentSize; i++) 
        {
          total += values[i];    
        }
        System.out.printf("Total: %f%n", total);
        System.out.printf("Average: %f%n", average);
        System.out.printf("currentSize: %d%n", currentSize);
        System.out.printf("count: %f%n", count);
    }
}
