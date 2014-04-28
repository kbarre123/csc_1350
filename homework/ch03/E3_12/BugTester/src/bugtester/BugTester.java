package bugtester;

/**
 *
 * @author tomservo
 */
public class BugTester 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Construct a bug
        Bug bug = new Bug(0);
        
        // Move bug
        bug.move(1);
        
        // Return bug's position
        System.out.printf("[%d, %b]\n", bug.getPosition(), bug.getDirection());
        
        // Move bug again and turn
        bug.move(1);
        bug.turn();
        
        // Return bug's position
        System.out.printf("[%d, %b]\n", bug.getPosition(), bug.getDirection());
        
        // Move bug again and turn
        bug.move(1);
        bug.turn();
        
        // Return bug's position
        System.out.printf("[%d, %b]\n", bug.getPosition(), bug.getDirection());
        
        // Move bug again and turn
        bug.move(1);
        bug.turn();
        
        // Return bug's position
        System.out.printf("[%d, %b]\n", bug.getPosition(), bug.getDirection());
    }
    
}
