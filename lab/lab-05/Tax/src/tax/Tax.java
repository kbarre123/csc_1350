/*
 * Tax schedule. See client program at TaxTester.java.
 */

package tax;

/**
 * Assignment 5C
 * @author kbarr17
 */
public class Tax 
{
    private String status;
    private double income;
    private double tax;
    
    public Tax()
    {
        status = "";
        income = 0;
        tax = 0;
    }
    
    public Tax(String sStatus, double iIncome)
    {
        status = sStatus;
        income = iIncome;
        tax = 0;
    }
    
    public String getStatus()
    {
        return this.status;
    }
    
    public double getIncome()
    {
        return this.income;
    }
    
    public double getTax()
    {
        if (this.status.equals("SINGLE")) 
        {
            if (this.income > 32000)
            {
                this.tax = 4400 + ((this.income - 32000) * 0.25);
                return this.tax;
            }
            else if (this.income > 8000)
            {
                this.tax = 800 + ((this.income - 8000) * 0.15);
                return this.tax;
            }
            else
            {
                this.tax = (this.income * 0.1);
                return this.tax;
            }
        }
        else if (this.status.equals("MARRIED")) 
        {
            if (this.income > 64000)
            {
                this.tax = 8800 + ((this.income - 64000) * 0.25);
                return this.tax;
            }
            else if (this.income > 16000)
            {
                this.tax = 1600 + ((this.income - 16000) * 0.15);
                return this.tax;
            }
            else
            {
                this.tax = (this.income * 0.1);
                return this.tax;
            }
        }
        else
        {
            System.out.println("Invalid status provided.\n");
            return 0;
        }
    }
}
