package balloon;

/**
 *
 * @author kbarr17
 */
public class Balloon 
{
    // Instance variables.
    private double volume;
    
    // Construct an empty balloon.
    public Balloon()
    {
        volume = 0;
    }
    
    public void addAir(double amount)
    {
        this.volume += amount;
    }
    
    public double getRadius()
    {
        double r = Math.pow((this.volume * 3.0)/(Math.PI * 4.0), (1.0/3.0));
        return r;
    }
    
    public double getSurfaceArea()
    {
        double area = (3.0 * this.getVolume()) / this.getRadius();
        return area;
    }
    
    public double getVolume()
    {
        return this.volume;
    }
    
}
