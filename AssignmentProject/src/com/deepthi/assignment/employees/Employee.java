package com.deepthi.assignment.employees;

/**
 * Represents a general Employee.
 * Demonstrates use of private and protected access modifiers.
 */
public class Employee {
    /** private - accessible only within this class */
    private String name;
    private int employeeId;
    /** protected - accessible in same package and subclasses */
    protected double salary;

    public Employee(String name, int employeeId, double salary) {
        this.name = name;
        this.employeeId = employeeId;
        this.salary = salary;
    }

    /** Getter and Setter for private attributes */
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getEmployeeId() { return employeeId; }
    public void setEmployeeId(int employeeId) { this.employeeId = employeeId; }

    public double getSalary() { return salary; }
    public void setSalary(double salary) { this.salary = salary; }
}