/*
 * Models an employee.
 */
package employeetester;

/**
 *
 * @author kbarr17
 */
public class Employee {
    
    private String name = "null";
    private double salary = 0;
    
    /** 
     * Constructs an employee 
     */
    public Employee(String eName, double eSalary)
    {
        name = eName;
        salary = eSalary;
    }
    
    /** 
     * @return employee name 
     */
    public String getName()
    {
        return this.name;
    }
    
    /** 
     * @return employee salary
     */
    public double getSalary()
    {
        return this.salary;
    }
    
    /**
     * @param percent increases employee salary by this percentage
     */
    public void raiseSalary(double byPercent)
    {
        this.salary = this.salary * (1 + (byPercent / 100));
    }
}
