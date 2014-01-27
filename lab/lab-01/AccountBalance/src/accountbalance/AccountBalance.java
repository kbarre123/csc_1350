package accountbalance;

/** 
 * Print the account balance after 1st, 2nd & 3rd year given starting balance
 * of $1,000 @ 5% interest per year.
*/
/**
 * @author Kenneth C. Barrett
 */
public class AccountBalance 
{
    public static void main(String[] args) 
    {
        int balance = 1000;
        double interest = 0.05;
        
        double year_1 = balance + (balance * interest);
        System.out.println(year_1);
        
        double year_2 = year_1 + (year_1 * interest);
        System.out.println(year_2);
        
        double year_3 = year_2 + (year_2 * interest);
        System.out.println(year_3);
    }
}
