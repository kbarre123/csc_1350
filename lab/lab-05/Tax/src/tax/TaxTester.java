/**
 * Calculate taxes based on schedule in Tax.java
 */

package tax;
import java.util.Scanner;

/**
 * Assignment 5C
 * @author kbarr17
 */
public class TaxTester 
{

    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter marital status (single or married): ");
        String sStatus = s.next();
        String status = sStatus.toUpperCase();
        
        System.out.println("Enter your income: ");
        double income = s.nextDouble();
        
        Tax t = new Tax(status, income);
        
        System.out.printf("Tax: $%.2f\n", t.getTax());
    }
    
}
