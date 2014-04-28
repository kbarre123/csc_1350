package cartester;

/**
 *
 * @author kbarr17
 */
public class Car 
{   
    // MPG of vehicle
    private double fuelEfficiency = 0;
    
    // Initial amount of gas in tank
    private double gasVolume = 0;
    
    /**
     * Construct a car
     */
    public Car(double fuelEff)
    {
        // gas tank volume
        fuelEfficiency = fuelEff;
        
        // initial fuel level is 0
        gasVolume = 0;
    }
    
    /**
     * @param gas adds a given volume of gas to the tank
     */
    public void addGas(double gas)
    {
        gasVolume += gas;
    }
    
    /**
     * @return tells how much gas is left in the tank
     */
    public double gasLeft()
    {
        return gasVolume;
    }
    
    /**
     * @param miles drive the car a certain distance, reducing the gas in the tank
     */
    public void drive(double miles)
    {
        gasVolume -= miles / fuelEfficiency;
    }
    
}
