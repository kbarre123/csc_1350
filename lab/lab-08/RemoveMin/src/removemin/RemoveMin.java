package removemin;
import java.util.Arrays;

/**
 *
 * @author kbarr17
 */
public class RemoveMin 
{

    public static void main(String[] args) 
    {
        final int LENGTH = 10;
        int[] random = new int[LENGTH];
        
        for (int i = 0; i < LENGTH ; i++)
        {
             random[i] = (int)(Math.random()*100);
        }
        System.out.print("Array: ");
        System.out.println(Arrays.toString(random));
        removeMin(random);
        
        System.out.printf("Array with minimum removed: [%d", random[0]);
        for (int i = 1; i < random.length-1; i++) 
        {
            System.out.printf(", %d", random[i]);
        }
        System.out.println("]");
        
    }
    
    public static void removeMin(int[] array)
    {
        int min = array[0];
        int minIndex = 0;
        for (int i = 1; i < array.length; i++)
        {
            if (array[i] < min) 
            {
                min = array[i];
                minIndex = i;
            }
        }
        
        for (int i = minIndex; i < array.length-1; i++) 
        {
            array[i] = array[i + 1];
        }
    }
    
}
