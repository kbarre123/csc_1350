package sodacan;

/**
 *
 * @author kbarr17
 */
public class SodaCanTester 
{
    public static void main(String[] args) 
    {
        // Generate a SodaCan object.
        SodaCan can = new SodaCan(18.0, 6.0);
        
        // Get the volume of the can.
        //double volume = can.getVolume();
        System.out.printf("The volume of the can is: %.5f.\n", can.getVolume());
        
        // Get the surface area of the can.
        System.out.printf("The surface-area of the can is: %.5f.\n", can.getSurfaceArea());
    }
}
