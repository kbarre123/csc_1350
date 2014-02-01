/*
 * Counter class for the ConcertCounter program.
 */

package concertcounter;

/**
 *
 * @author kcb
 */
public class Counter {
    
    int value = 0;
    
    public int count() {
        return value;
    }
    
    public void click() {
        value = value + 1;
    }
    
}
