package constructors;

class Employee {
    String name;
    int id;
    double salary;

    // 1. Default Constructor
    Employee() {
        name = "Not Assigned";
        id = 0;
        salary = 0.0;
        System.out.println("Default Constructor Called");
    }

    // 2. Parameterized Constructor
    Employee(String empName, int empId, double empSalary) {
        name = empName;
        id = empId;
        salary = empSalary;
        System.out.println("Parameterized Constructor Called");
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Salary: " + salary);
        System.out.println("----------------------");
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        // Calls Default Constructor
        Employee e1 = new Employee();
        e1.display();

        // Calls Parameterized Constructor
        Employee e2 = new Employee("Deepthi", 101, 50000);
        e2.display();

        Employee e3 = new Employee("Beth", 2192889, 75000);
        e3.display();
    }
}