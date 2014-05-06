package fractionapp;

/**
 *
 * @author Kenneth C. Barrett
 */
public class Fraction 
{
    private int top;
    private int bottom;
    
    /**
     * Constructs a new Fraction, initialized so that its numerator and 
     * denominator are 0 and 1, respectively.
     */
    public Fraction()
    {
        top = 0;
        bottom = 1;
    }
    
    /**
     * Constructs and initializes a Fraction from the specified numerator, n,
     * and denominator, d. Throws an IllegalArgumentException when the denominator is 0.
     * @param n
     * @param d
     */
    public Fraction(int n, int d)
    {
        if (d == 0)
        {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }
        else
        {
            top = n;
            bottom = d;
        }
    }
    
    /**
     * Returns the product of this fraction and the specified fraction.
     * @param f 
     * @return  
     */
    public Fraction multiply (Fraction f)
    {
        Fraction newFract = new Fraction(
                (this.top * f.top),
                (this.bottom * f.bottom)
        );
        return newFract;
    }
    
    /**
     * Returns the reciprocal of this fraction, or, when the numerator of this
     * fraction is 0, throws an IllegalArgumentException.
     * @throws IllegalArgumentException("Denominator can't be zero");
     * @return 
     */
    public Fraction reciprocal()
    {
        if (this.top == 0)
        {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }
        else
        {
            Fraction newFract = new Fraction (
                this.bottom, this.top
            );
            return newFract;
        }
    }
    
    /**
     * Sets the numerator and denominator of this Fraction to the specified
     * integers or throws an IllegalArgumentException when the specified
     * denominator, d, is 0.
     * @param n
     * @param d
     */
    public void setFract(int n, int d)
    {
        if (d == 0)
        {
            throw new IllegalArgumentException("Denominator can't be zero.");
        }
        else
        {
            this.top = n;
            this.bottom = d;
        }
    }
    
    /**
     * Returns the difference of this Fraction and the specified fraction.
     * @param f
     * @return 
     */
    public Fraction subtract(Fraction f)
    {
        Fraction newFract = new Fraction (
                (this.top * f.bottom) - (f.top * this.bottom),
                (this.bottom * f.bottom)
        );
        return newFract;
    }
    
    /**
     * Returns the String representation of this Fraction in inline notation
     * (numerator/denominator).
     * @return 
     */
    public String toString()
    {
        return String.format("%d/%d", this.top, this.bottom);
    }
    
    
    
}
