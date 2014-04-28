package balloon;

/**
 *
 * @author kbarr17
 */
public class BalloonTester 
{
    public static void main(String[] args) 
    {
        // Construct an empty balloon.
        Balloon balloon = new Balloon();
        
        // Fill balloon with 100cm3 of air.
        balloon.addAir(100.0);
        
        // Get the volume of the balloon.
        System.out.printf("The volume is: %.2f.\n", balloon.getVolume());
        
        // Get the surface area of the balloon.
        System.out.printf("The surface-area is: %.2f.\n", balloon.getSurfaceArea());
        
        // Get the radius of the balloon.
        System.out.printf("The radius is: %.2f.\n", balloon.getRadius());
        
        // Add another 100cm3 of air.
        balloon.addAir(100.0);
        
        // Get the volume of the balloon.
        System.out.printf("The volume is: %.2f.\n", balloon.getVolume());
        
        // Get the surface area of the balloon.
        System.out.printf("The surface-area is: %.2f.\n", balloon.getSurfaceArea());
        
        // Get the radius of the balloon.
        System.out.printf("The radius is: %.2f.\n", balloon.getRadius());
    }
}
