/*
 * Sort pets using File I/O. Need to bring in the PetSorter class from previous
 * example.
 */
package petsorter;
import java.util.*;
import java.io.*;

public class PetSorter 
{
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        try
        {
            String name;
            int age;
            ArrayList<Pet> zoo2 = new ArrayList<Pet>();
            Scanner cin = new Scanner(System.in);
            System.out.print("Enter the input file name -> ");
            Scanner fileIn = new Scanner(new File(cin.next()));
            while(fileIn.hasNext())
            {
                name = fileIn.next();
                age = fileIn.nextInt();
                zoo2.add(new Pet(name,age));
            }
            fileIn.close();
            // create an array containing five pet objects
            Pet[] zoo = zoo2.toArray(new Pet[zoo2.size()]);
            int i;
            // print the unsorted array
            System.out.println("Unsorted Array of Pets");
            for (i=0; i<zoo.length; i++)
                System.out.println(zoo[i]);
            // sort the array using the comparable interface
            Arrays.sort(zoo);
            System.out.print("Enter the output file name (array +name+age) -> ");
            PrintWriter fileOut = new PrintWriter(new File(cin.next()));
            // print the sorted array after sorting using the comparable interface   
            System.out.println("Sorted Array of Pets After Sorting Using the Comparable Interface");
            for (i=0; i<zoo.length; i++)
            {
                System.out.println(zoo[i]);             
                fileOut.println(zoo[i]);             
            }
            fileOut.close();

            // print the unsorted array array list		   
            System.out.println("Unsorted Array List of Pets");
            for (i=0; i<zoo2.size(); i++)
                System.out.println(zoo2.get(i));   

            // sort the array list using the comparable interface		   
            Collections.sort(zoo2);
            System.out.print("Enter the output file name (array list +name+age) -> ");
            fileOut = new PrintWriter(new File(cin.next()));
            // print the sorted array  list after sorting using the comparable interface  
            System.out.println("Sorted Array List of Pets After Sorting Using the Comparable Interface");
            for (i=0; i<zoo2.size(); i++)
            {
                System.out.println(zoo2.get(i));   
                fileOut.println(zoo2.get(i));   
            }
            fileOut.close();
            // Sort the array using a comparator and then
            // print the sorted array after sorting using the Comparator interface   
            Arrays.sort(zoo,new PetComparator());
            System.out.print("Enter the output file name (array  -age+name) -> ");
            fileOut = new PrintWriter(new File(cin.next()));            
            System.out.println("Sorted Array of Pets After Sorting Using a Comparator");
            for (i=0; i<zoo.length; i++)
            {
                System.out.println(zoo[i]);      
                fileOut.println(zoo[i]);
            }
            fileOut.close();

            // Sort the array list using a comparator and then
            // print the sorted array list after sorting using the Comparator interface   
            Collections.sort(zoo2,new PetComparator());
            System.out.print("Enter the output file name (array list -age+name) -> ");
            fileOut = new PrintWriter(new File(cin.next()));         
            System.out.println("Sorted Array List of Pets After Sorting Using a Comparator");
            for (i=0; i<zoo2.size(); i++)
            {
                System.out.println(zoo2.get(i));   
                fileOut.println(zoo2.get(i));   
            }
            fileOut.close();
        }
        catch(IOException e)
        {
            System.out.println(e);
            System.exit(3);
        }
    }
}
