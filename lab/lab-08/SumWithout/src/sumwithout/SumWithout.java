package sumwithout;
import java.util.Arrays;

/**
 *
 * @author kbarr17
 */
public class SumWithout 
{

    public static void main(String[] args) 
    {
        final int LENGTH = 10;
        int[] random = new int[LENGTH];
        
        for (int i = 0; i < random.length ; i++)
        {
             random[i] = (int)(Math.random()*100);
        }
        System.out.println(Arrays.toString(random));
       
        System.out.printf("The sum of the values less the smallest & largest element: %d%n", sumWithout(random));
    }
    
    public static int sumWithout(int[] array)
    {
        int smallest = array[0];
        int largest = array[0];
        int sum = 0;
        int answer = 0;
        
        for (int i = 0; i < array.length; i++) 
        {
            if (array[i] < smallest) 
            {
                smallest = array[i];
            }
            else if (array[i] > largest) 
            {
                largest = array[i];
            }
            sum += array[i];
        }
        answer = sum - smallest - largest;
        return answer;
    }
}
