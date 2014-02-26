package sodacan;

/**
 *
 * @author kbarr17
 */
public class SodaCan 
{
    private double height;
    private double diameter;
    
    public SodaCan()
    {
        height = 0;
        diameter = 0;
    }
    
    public SodaCan(double height, double diameter)
    {
        this.height = height;
        this.diameter = diameter;
    }
    
    public double getVolume()
    {
        double volume = Math.PI * (Math.pow(this.diameter / 2, 2)) * this.height;
        return volume;
    }
    
    public double getSurfaceArea()
    {
        double surfaceArea = (2 * Math.PI * (Math.pow(this.diameter / 2, 2))) + 
                Math.PI * this.diameter * this.height;
        return surfaceArea;
    }
    
}
