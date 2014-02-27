package bugtester;

/**
 *
 * @author tomservo
 */
public class Bug 
{
    
    private int initialPosition = 0;
    private int position = 0;
    private boolean directionRight = true;
    
    
    public Bug(int bPosition)
    {
        initialPosition = bPosition;
        directionRight = true;
    }
    
    public void move(int bMove)
    {
        position += initialPosition + bMove;
    }
    
    public void turn()
    {
        if (directionRight == true)
        {
            directionRight = false;
        }
        else if (directionRight == false)
        {
            directionRight = true;
        }
    }
    
    public int getPosition()
    {
        return position;
    }
    
    public boolean getDirection()
    {
        return directionRight;
    }
}
