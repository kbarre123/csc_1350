package practiceexam01;

/**
 *
 * @author kcb
 */
public class PracticeExam01 {

    public static void main(String[] args) {
        /* #4b */
        
        // Declare some variables to play with.
        double FV = 0;
        double PV = 100;
        double INT = 1;
        double YRS = 1;
        
        // Set up equation to test.
        FV = PV * (Math.pow((1 + (INT/100)), YRS));
        
        System.out.println("The future value of the loan is $" + FV + ".");
        System.out.println("The expected value is $101.0.");
        /* End #4b */
        
        
    }
    
}
