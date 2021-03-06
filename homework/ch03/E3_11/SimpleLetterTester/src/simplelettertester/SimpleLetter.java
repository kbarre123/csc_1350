package simplelettertester;

/**
 *
 * @author tomservo
 */
public class SimpleLetter 
{
    // Class variables
    private String from;
    private String to;
    private String text;
    
    // Constructs a letter
    public SimpleLetter(String sFrom, String sTo)
    {
        to = sTo;
        from = sFrom;
        text = "";
    }
    
    public void addLine(String line)
    {
        text = text.concat(line).concat("\n");
    }
    
    public String getFrom()
    {
        return from;
    }
    
    public String getTo()
    {
        return to;
    }
    
    public String getText()
    {
        return text;
    }
    
}
