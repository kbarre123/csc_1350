/**
 * Paycheck class. See client program at Pay.java.
 */

package pay;

/**
 * Assignment 5b
 * @author kbarr17
 */
public class Paycheck 
{
    
    private String name;
    private double wage;

    public Paycheck()
    {
        name = "";
        wage = 0;
    }
    
    public Paycheck(String eName, double eWage)
    {
        name = eName;
        wage = eWage;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public double getWage()
    {
        return this.wage;
    }
    
    public double calcPaycheck(double hours)
    {
        double paycheck = 0;
        
        if (hours <= 40)
        {
            paycheck = this.wage * hours;
            return paycheck;
        }
        else
        {
            paycheck = (this.wage * 1.5) * hours;
            return paycheck;
        }
        
    }
    
}
