/*
 * Tests whether an integer is positive, zero, or negative.
 */

package integersigntester;
import java.util.Scanner;

/**
 *
 * @author tomservo
 */
public class IntegerSignTester 
{

    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter an integer: ");
        int testInt = s.nextInt();
        
        if (testInt > 0) 
        {
            System.out.printf("%d is a positive integer.\n", testInt);
        }
        else if (testInt < 0) 
        {
            System.out.printf("%d is a negative integer.\n", testInt);
        }
        else
            System.out.printf("%d is zero.\n", testInt);
    }
    
}
