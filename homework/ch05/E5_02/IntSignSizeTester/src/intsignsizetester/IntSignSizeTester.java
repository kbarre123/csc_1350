/*
 * Test whether an integer is positive, negative, or zero. If it's non-zero and
 * less than 1 and greater than -1, say that it's small. Otherwise, state that
 * it's large.
 */

package intsignsizetester;
import java.util.Scanner;

public class IntSignSizeTester 
{

    public static void main(String[] args) 
    {
    
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter a double: ");
        
        double testDouble = s.nextDouble();
        
        if (testDouble == 0)
        {
            System.out.println("zero");
        }
        else
        {
            if (testDouble > 0)
            {
                if (testDouble < 1) 
                {
                    System.out.println("positive small");
                }
                else
                {
                    System.out.println("positive large");
                }
            }
            else
            {
                if (testDouble > -1)
                {
                    System.out.println("negative small");
                }
                else
                {
                    System.out.println("negative large");
                }
            }
        }

    }
    
}
