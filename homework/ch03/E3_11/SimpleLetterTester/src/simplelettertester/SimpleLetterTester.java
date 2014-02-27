package simplelettertester;

/**
 *
 * @author tomservo
 */
public class SimpleLetterTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        // Construct a letter object
        SimpleLetter letter = new SimpleLetter("Sally", "Billy");
        
        // Add some lines
        letter.addLine("Dear " + letter.getTo());
        letter.addLine("");
        letter.addLine("I am sorry we must part.");
        letter.addLine("I wish you all the best");
        letter.addLine("");
        letter.addLine("Sincerly,");
        letter.addLine(letter.getFrom());
        
        System.out.printf("%s", letter.getText());
        
    }
    
}
