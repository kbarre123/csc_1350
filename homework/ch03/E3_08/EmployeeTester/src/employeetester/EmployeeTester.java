package employeetester;

public class EmployeeTester {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        // Construct new employee
        Employee harry = new Employee("Harry", 50000);
        
        // Print initial state of harry
        System.out.printf("Employee name: %s; Salary: %.2f\n", harry.getName(), harry.getSalary());
        
        harry.raiseSalary(10.0);
        
        // Tell harry the good news
        System.out.printf("Let's give %s a raise, shall we?\n", harry.getName());
        
        // Print initial state of harry
        System.out.printf("Employee name: %s; Salary: %.2f\n", harry.getName(), harry.getSalary());
    }
}
