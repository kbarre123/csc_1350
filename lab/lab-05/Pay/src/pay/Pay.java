/**
 * Reads in a name and salary of employee, calcs paycheck. Ask how many hours 
 * the employee worked last week (accept fractional hours). Compute pay. 
 * Overtime (40+ hrs) is paid time-and-a-half. Print paycheck. Implement a 
 * class "Paycheck".
 */

package pay;
import java.util.Scanner;

/**
 * Assignment 5b
 * @author kbarr17
 */
public class Pay 
{

    public static void main(String[] args) 
    {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Enter employee's name: ");
        String name = s.next();
        
        System.out.println("Enter employee's hourly wage: ");
        double wage = s.nextDouble();
        
        Paycheck paycheck = new Paycheck(name, wage);
        
        System.out.printf("How many hours did %s work?\n", paycheck.getName());
        
        double hours = s.nextDouble();
        
        System.out.printf("Pay: $%.2f\n", paycheck.calcPaycheck(hours));
        
    }
    
}
