/**
 * purpose: This program is a classroom demo program that illustrates how to do
 * file input and output in Java. This program reads data in the format,
 * firstName lastName Test1 Test2 from a text file and computes the test
 * average. The output is in the following format: lastName, firstName average
 * note: The output is written to the screen and the output file date: April 23,
 * 2014 course: CSC 1350
 */
package gradeprocessor;

import java.io.*;
import java.util.*;

public class GradeProcessor 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            String firstName, lastName, fileName;
            double test1, test2, avg;
            Scanner cin = new Scanner(System.in);
            //fileName = "C:\\Users\\kbarr17\\Documents\\GitHub\\csc_1350\\homework\\ch11\\GradeProcessor\\gradesIn.txt.txt";
            
            // Getting the name of the input file and creating
            // a scanner object to read the data from the file.
            System.out.print("Enter the input file name -> ");
            Scanner fileIn = new Scanner(new File(cin.next()));
            
            
            // Getting the name of the output file and creating
            // a PrintWriter object to write data to the output
            // file.
            System.out.print("Enter the output file name -> ");
            PrintWriter fileOut = new PrintWriter(new File(cin.next()));
            
            // A while not-end-of-file loop that gets the data from the 
            // input file.
            while (fileIn.hasNext()) 
            {                
                lastName = fileIn.next();
                firstName = fileIn.next();
                test1 = fileIn.nextDouble();
                test2 = fileIn.nextDouble();
                avg = (test1 + test2) / 2;
                System.out.printf("%s,\t %s\t %.2f%n", lastName, firstName, avg);
                
                // Writing the output to the file.
                fileOut.printf("%s,\t %s\t %.2f%n", lastName, firstName, avg);
            }
            //Close all the file streams before quitting the program.
            fileIn.close();
            fileOut.close();
        } 
        catch (Exception e) 
        {
            System.out.println(e);
            System.exit(2);
        }
    }
}
