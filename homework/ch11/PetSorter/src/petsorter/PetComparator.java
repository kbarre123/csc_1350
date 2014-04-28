/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package petsorter;

import java.util.*;
/**
 * @author Duncan
 * purpose: compares the specified objects of the Pet class using
 * age (descending order) as the primary key and name
 * ascending order as the secondary key; that is,
 * -age+name order
 * @param p1 an object of the pet class
 * @param p2 an object of the pet class
 * @return -1 when p1 comes before p2 in the order -age+name; 1 
 * when p1 comes after p2 in the order -age+name; otherwise, 0
 */
public class PetComparator implements Comparator<Pet>
{
    @Override
    public int compare(Pet p1, Pet p2)
    {
        if (p1.getAge() < p2.getAge())
            return 1;
        if (p1.getAge() > p2.getAge())
            return -1;
        if (p1.getName().compareToIgnoreCase(p2.getName()) < 0)
            return -1;
        if (p1.getName().compareToIgnoreCase(p2.getName()) > 0)
            return 1;
        return 0;
    }
}
