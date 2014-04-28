package petsorter;

/**
 * @author Duncan
 * purpose: model basic information about a pet
 * date: April 21, 2013
 * course: CSC 1350 Section 1
 */
 
public class Pet implements Comparable<Pet>
{
   /**
    * the pet's name
    */
    private String name;

   /**
    * the pet's age
    */	
    private int age;

   /**
    * creates an object of this class
    * @param pName the pet's name
    * @param pAge the pet's age
    * @throw IllegalArgumentException when <br>
    * 1. the pet's name is not at least one character<br>
    * 2. the pet's age is a negative number	<br>
    */	
    public Pet(String pName, int pAge)
    {
        if (pName.length() < 1 || pAge < 0)
            throw new IllegalArgumentException("Invalid pet info");
        age = pAge;
        name = pName;
    }
    
   /**
    * gives the pet's name
    * @return the name of the pet
    */	
    public String getName()
    {
        return name;
    }
    
   /**
    * gives the pet's age
    * @return the age of the pet
    */	
    public int getAge()
    {
        return age;
    }
   
   /**
    * compares this pet and the specified pet using the order
    * name (ascending order) as the primary key and age (ascending)
    * as the secondary key; that is, (+name+age order)
    * @param p an object of the pet class
    * @return -1 when this pet comes before the specified pet in
    * the +name+age order; +1 when this pet comes after the specified
    * pet in +name+age order; otherwise 0
    */	
    @Override
    public int compareTo(Pet p)
    {
        if (name.compareToIgnoreCase(p.name) < 0)
            return -1;
        if (name.compareToIgnoreCase(p.name) > 0)
            return 1;
        if (age < p.age)
            return -1;
        if (age > p.age)
            return 1;
        return 0;
    }
    
   /**
    * gives a string representation of this pet in the format
    * [pet's name, age]
    * @return a string represent this pet in the format
    * [pet's name, age]
    */	
    @Override
    public String toString()
    {
        return String.format("[%s, %d]",name,age);
    }
       
}