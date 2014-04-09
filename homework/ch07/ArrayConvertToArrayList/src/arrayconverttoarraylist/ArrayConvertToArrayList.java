/*
 * How to convert an array to an array list, vice versa:
 */
package arrayconverttoarraylist;
import java.util.*;

public class ArrayConvertToArrayList 
{    
    public static void main(String[] args) 
    {
        // Array -> Array List
        // Create an array
        String[] namesArray = {"Amy", "Bobby", "Carly", "Danny", "Eric", "Fred"};
        
        // Print array
        System.out.println(Arrays.toString(namesArray));
        
        // Create an array list from the first array
        ArrayList<String> namesArrayList = new ArrayList<>(Arrays.asList(namesArray));
        
        // Print array list
        for (int i = 0; i < namesArrayList.size(); i++) 
        {
            if (i == 0) System.out.print("[");
            System.out.print(namesArrayList.get(i));
            if (i < namesArrayList.size()-1) System.out.print(", ");
            if (i == namesArrayList.size()-1) System.out.println("]");
        }
        
        // Array List -> Array
        
        // Create second array list
        ArrayList<String> namesArrayList2 = new ArrayList<>();
        namesArrayList2.add("George");
        namesArrayList2.add("Harrison");
        namesArrayList2.add("Ingrid");
        namesArrayList2.add("Jackie");
        namesArrayList2.add("Kyle");
        
        // Print second array list
        for (int i = 0; i < namesArrayList2.size(); i++) 
        {
            if (i == 0) System.out.print("[");
            System.out.print(namesArrayList2.get(i));
            if (i < namesArrayList2.size()-1) System.out.print(", ");
            if (i == namesArrayList2.size()-1) System.out.println("]");
        }
        
        // Convert second array list to second array
        String[] namesArray2 = namesArrayList2.toArray(new String[namesArrayList2.size()]);
        
        // Print second array
        System.out.println(Arrays.toString(namesArray2));
    }
}
   
