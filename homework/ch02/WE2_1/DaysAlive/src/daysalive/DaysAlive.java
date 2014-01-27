/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package daysalive;

/**
 *
 * @author kbarr17
 */
public class DaysAlive {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Calculate how many days you've been alive.
        
        Day myBirthDay = new Day(1981, 1, 16);
        Day today = new Day();
        
        System.out.println("Today: ");
        System.out.println(today.toString());
        
        int daysAlive = today.daysFrom(myBirthDay);
        
        System.out.print("Days alive: ");
        System.out.println(daysAlive);
    }
}
