package censusdataapp;
import java.util.*;
import java.io.*;

public class CensusDataSorter 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try 
        {
            /* Write code to define an empty ArrayList whose contents will be
               Census objects;
            */
            ArrayList<CensusData> census = new ArrayList<>();
            
            /* Write code to prompt the use for the data file name; define a Scanner
            to read data from the file; define a while loop to read the data from the
            file and create CensusData objects and insert them into the ArrayList
            and then close the input file
            */
            Scanner keyIn = new Scanner(System.in);
            System.out.print("Enter name of input file -> ");
            Scanner fileIn = new Scanner(new File(keyIn.next()));
            while (fileIn.hasNext()) 
            {                
                census.add(new CensusData(fileIn.next(), fileIn.nextDouble()));
            }
            fileIn.close();
            
            /* Create an Array whose contents is the same as the ArrayList */
            CensusData[] dataArray = census.toArray(new CensusData[census.size()]);
            
            /* Sort the ArrayList using the Comparable interface and print the sorted
            data on the screen
            */
            Collections.sort(census);
            System.out.println("Census data sorted by State and Population:");
            int i;
            for (i = 0; i < census.size(); i++)
                System.out.println(census.get(i));
            
            /* Sort the Array using a Comparator of the CensusDataComp class */
            Arrays.sort(dataArray, new CensusDataComp());
            
            /* Write code to prompt the user for an output file name; write the 
            sorted data from the Array to the output file; close the output file
            */
            System.out.println("Enter the name of the output file -> ");
            PrintWriter fileOut = new PrintWriter(new File(keyIn.next()));
            for (int j = 0; j < dataArray.length; j++)
                fileOut.printf("[%s, %.3fM]%n", dataArray[j].getState(), dataArray[j].getPopInMil());
            fileOut.close();
            
            /* Write code to catch any IOException, print a message about the 
            exception; exit the program
            */
        } catch (FileNotFoundException e) 
        {
            System.out.println(e);
            System.exit(1);
        }
    }
}
