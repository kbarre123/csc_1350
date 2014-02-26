package cartester;

/**
 *
 * @author kbarr17
 */
public class CarTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Construct a car
        Car myHybrid = new Car(50);
        
        myHybrid.addGas(20);
        System.out.printf("Gas in tank: %.2f\n", myHybrid.gasLeft());
        
        myHybrid.drive(100);
        
        System.out.printf("Gas left: %.2f\n", myHybrid.gasLeft());
    }
}
