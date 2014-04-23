/*
 * How to convert an array to an array list, vice versa:
 */
package convertarraytoarraylist;
import java.util.*;

public class ConvertArrayToArrayList 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // ARRAY -> ARRAYLIST:
        // creating an Array with three names
        String[] namesArray = {"Joie", "Sue", "Sara"};
        // print the Array
        System.out.println(Arrays.toString(namesArray));
        // creating an ArrayList using the contents of original Array
        ArrayList<String> namesArrayList = new ArrayList<>(Arrays.asList(namesArray));
        // print the ArrayList
        for (int i = 0; i < namesArrayList.size(); i++) 
        {
            System.out.print(namesArrayList.get(i) + " ");
        }
        System.out.println();
        
        // ARRAYLIST -> ARRAY:
        String[] namesArray2 = namesArrayList.toArray(new String[namesArrayList.size()]);
        // print the new Array
        System.out.println(Arrays.toString(namesArray2));
    }
}
