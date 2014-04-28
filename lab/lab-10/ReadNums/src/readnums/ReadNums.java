/**
 * @author kbarr17
 * Purpose: Assignment 11a; read a text file and average the two columns of floats.
 */

package readnums;
import java.io.*;
import java.util.*;

public class ReadNums {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       try 
        {
            File fileName = new File("twoColumns.dat.txt");
            double sum1 = 0, sum2 = 0, avg1 = 0, avg2 = 0;
            int i = 0;
            Scanner fileIn = new Scanner(fileName);
            
            // Read data & increment counter.
            while (fileIn.hasNextDouble()) 
            {                
                sum1 += fileIn.nextDouble();
                sum2 += fileIn.nextDouble();
                i++;
            }
            avg1 = sum1 / i;
            avg2 = sum2 / i;
            System.out.printf("Average1 = %.2f%n", avg1);
            System.out.printf("Average2 = %.2f%n", avg2);
            //Close all the file streams before quitting the program.
            fileIn.close();
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File twoColumns.dat not found.");
            System.exit(2);
        }
    }
}
