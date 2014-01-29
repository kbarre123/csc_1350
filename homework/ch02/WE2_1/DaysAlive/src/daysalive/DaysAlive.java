/*
 * Calculate the # of days you've been alive using the supplied class 'Day',
 * which is located on the textbook's website. Import class into main and
 * calculate.
 */

package daysalive;

/**
 *
 * @author kcb
 */
public class DaysAlive 
{
    public static void main(String[] args) 
    {
        Day today = new Day();
        Day birthday = new Day(1956, 10, 12);
        
        int daysAlive = today.daysFrom(birthday);
        System.out.println("Days alive: ");
        System.out.println(daysAlive);
    }
    
}
