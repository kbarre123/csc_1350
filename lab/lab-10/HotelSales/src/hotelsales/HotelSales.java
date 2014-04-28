/**
 * @author kbarr17
 * Purpose: Sum sales by service and export to separate files.
 */

package hotelsales;
import java.io.*;
import java.util.*;

public class HotelSales 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            File fileName = new File("hotelServices.txt");
            Scanner fileIn = new Scanner(fileName);
            String name, service;
            int amount, sumDinner = 0, sumLodge = 0, sumConf = 0;
            
            // A while not-end-of-file loop that gets the data from the 
            // input file.
            while (fileIn.hasNext())
            {                
                name = fileIn.next();
                service = fileIn.next();
                amount = fileIn.nextInt();
                if (service.equals("Dinner")) 
                {
                    sumDinner += amount;
                }
                else if (service.equals("Conference")) 
                {
                    sumConf += amount;
                }
                else
                {
                    sumLodge += amount;
                }
            }
            //Close all the file streams before quitting the program.
            fileIn.close();
            System.out.printf("Total Dinner Sales = $%d%n", sumDinner);
            System.out.printf("Total Conference Sales = $%d%n", sumConf);
            System.out.printf("Total Lodging Sales = $%d%n", sumLodge);
        } 
        catch (FileNotFoundException e) 
        {
            System.out.println("File 'hotelServices.txt' not found.");
            System.exit(2);
        }
    }
    
}
