import com.deepthi.assignment.employees.Manager;
import com.deepthi.assignment.employees.Developer;
import com.deepthi.assignment.utilities.EmployeeUtilities;

/**
 * Main class outside any package to test all functionality.
 */
public class AssignmentMain {
    public static void main(String[] args) {
        Manager mgr = new Manager("Deepthi", 101, 75000, "HR");
        Developer dev = new Developer("Sushmitha", 102, 60000, "Java");

        EmployeeUtilities utils = new EmployeeUtilities();

        System.out.println("--- Manager Details ---");
        utils.printEmployeeDetails(mgr);
        System.out.println("Department: " + mgr.getDepartment());
        
        System.out.println("\n--- Developer Details ---");
        utils.printEmployeeDetails(dev);
        System.out.println("Language: " + dev.getProgrammingLanguage());

        System.out.println("\n--- After Hike ---");
        utils.giveHike(mgr, 10);
        utils.giveHike(dev, 15);
    }
}
