package com.deepthi.assignment.employees;

/**
 * Manager subclass of Employee.
 * Shows inheritance and access to protected member.
 */
public class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, double salary, String department) {
        super(name, employeeId, salary);
        this.department = department;
    }

    public String getDepartment() { return department; }
    public void setDepartment(String department) { this.department = department; }
    
    // Accessing protected salary directly from parent
    public void displayManagerInfo() {
        System.out.println("Manager Salary (protected access): " + salary);
    }
}