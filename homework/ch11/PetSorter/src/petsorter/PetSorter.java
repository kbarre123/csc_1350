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
            ArrayList<Pet> zoo2 = new ArrayList<>();
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
            
            /* COMPARABLE SORT OF ARRAY */
            // sort the array using the comparable interface
            Arrays.sort(zoo);
            System.out.print("Enter the output file name (comparable_interface) -> ");
            PrintWriter fileOut = new PrintWriter(new File(cin.next()));
            // print the sorted array after sorting using the comparable interface   
            System.out.println("Sorted Array of Pets After Sorting Using the Comparable Interface (Arrays.sort(zoo))");
            for (i=0; i<zoo.length; i++)
            {
                System.out.println(zoo[i]);             
                fileOut.println(zoo[i]);             
            }
            fileOut.close();
            
            /* COMPARABLE SORT OF ARRAY LIST */
            // print the unsorted array list		   
            System.out.println("Unsorted Array List of Pets (zoo2.get(i))");
            for (i=0; i<zoo2.size(); i++)
                System.out.println(zoo2.get(i));   
            
            
            // sort the array list using the comparable interface		   
            Collections.sort(zoo2);
            System.out.print("Enter the output file name (Collections.sort(zoo2)) -> ");
            fileOut = new PrintWriter(new File(cin.next()));
            // print the sorted array list after sorting using the comparable interface  
            System.out.println("Sorted Array List of Pets After Sorting Using the Comparable Interface");
            for (i=0; i<zoo2.size(); i++)
            {
                System.out.println(zoo2.get(i));   
                fileOut.println(zoo2.get(i));   
            }
            fileOut.close();
            
            /* COMPARATOR SORT OF ARRAY */
            // Sort the array using a comparator and then
            // print the sorted array after sorting using the Comparator interface   
            Arrays.sort(zoo,new PetComparator());
            System.out.print("Enter the output file name (Arrays.sort(zoo,new PetComparator()) -> ");
            fileOut = new PrintWriter(new File(cin.next()));            
            System.out.println("Sorted Array of Pets After Sorting Using a Comparator");
            for (i=0; i<zoo.length; i++)
            {
                System.out.println(zoo[i]);      
                fileOut.println(zoo[i]);
            }
            fileOut.close();

            /* COMPARATOR SORT OF ARRAY LIST */
            // Sort the array list using a comparator and then
            // print the sorted array list after sorting using the Comparator interface   
            Collections.sort(zoo2,new PetComparator());
            System.out.print("Enter the output file name (Collections.sort(zoo2,new PetComparator()) -> ");
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
