/*
 * Reads three integers and prints "in order" if they are sorted in ascending
 * or descending order, or "not in order" otherwise.
 */

package e5_07;
import java.util.Scanner;

/**
 *
 * @author kbarr17
 */
public class E5_07 
{

    public static void main(String[] args) 
    {
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter three integers: ");
        
        int int1 = s.nextInt();
        int int2 = s.nextInt();
        int int3 = s.nextInt();
        
        if (int1 >= int2 && int2 >= int3) 
        {
            System.out.println("in decreasing order");
        }
        else if (int1 <= int2 && int2 <= int3)
        {
            System.out.println("in increasing order");
        }
        else
        {
            System.out.println("not in order");
        }
    
    }
    
}
