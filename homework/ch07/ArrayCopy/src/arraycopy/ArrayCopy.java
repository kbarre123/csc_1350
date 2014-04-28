/*
 * purpose: This program illustrates the use of the following methods:
 *          1. newArrayRef = Arrays.copyOf(srcArray, lengthOfNewArray)
 *          2. newArrayRef = Arrays.copyOfRange(srcArray, begIndex,endIndxPlusOne);
 *          3. System.arraycopy(srcArray,srcStartIndx,destArray,destStartIndx, numElems);
 *          4. Arrays.toString(someArray);
 */
package arraycopy;
import java.util.*;

/**
 *
 * @author kbarr17
 */
public class ArrayCopy 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // #1
        int[] list1 = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(Arrays.toString(list1));
        
        int[] list2 = Arrays.copyOf(list1,list1.length-5);
        System.out.println(Arrays.toString(list2));
        
        // #2
        int[] list3 = Arrays.copyOfRange(list1,2,6);
        System.out.println(Arrays.toString(list3));
        
        // #3
        int[] list4 = new int[7];
        System.arraycopy(list1,5,list4,1,5);
        System.out.println(Arrays.toString(list4));
    }
}
