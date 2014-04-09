package reverse;
import java.util.Arrays;

/**
 *
 * @author kbarr17
 */
public class Reverse 
{

    public static void main(String[] args) 
    {
        final int LENGTH = 10;
        int[] random = new int[LENGTH];
        
        for (int i = 0; i < LENGTH ; i++)
        {
             random[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(random));
        reverse(random);
        System.out.println(Arrays.toString(random));
    }
    
    public static void reverse(int[] array)
    {   
        for (int i = 0; i < array.length/2; i++)
        {   
            int front = i;
            int back = array.length - 1;
            int tempA = array[front];
            int tempB = array[back-i];
            array[front] = tempB;
            array[back-i] = tempA;
        }
    }
    
}
