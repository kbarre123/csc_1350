/**
 * @author kbarr17
 * Purpose: read a text file and average the two columns of floats
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
            String fileName = "C:\\Users\\kbarr17\\Documents\\twoColumns.dat.txt";
            double column1, column2, sum1 = 0, sum2 = 0, avg1, avg2;
            Scanner cin = new Scanner(System.in);
            
            // Getting the name of the input file and creating
            // a scanner object to read the data from the file.
            Scanner fileIn = new Scanner(new File(fileName));
            
            
            // Getting the name of the output file and creating
            // a PrintWriter object to write data to the output
            // file.
            // System.out.print("Enter the output file name -> ");
            // PrintWriter fileOut = new PrintWriter(new File(cin.next()));
            
            // A while not-end-of-file loop that gets the data from the 
            // input file.
            while (fileIn.hasNextDouble()) 
            {                
                column1 = fileIn.nextDouble();
                column2 = fileIn.nextDouble();
                sum1 += column1;
                sum2 += column1;
                //System.out.printf("%s,\t %s\t %.2f%n", lastName, firstName, avg);
                
                // Writing the output to the file.
                //fileOut.printf("%s,\t %s\t %.2f%n", lastName, firstName, avg);
            }
            avg1 = sum1 / 9;
            avg2 = sum2 / 9;
            System.out.printf("%.2f,\t %.2f%n", avg1, avg2);
            //Close all the file streams before quitting the program.
            fileIn.close();
            //fileOut.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            System.exit(2);
        }
    }
    
}
