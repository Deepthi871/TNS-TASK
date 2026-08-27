package com.deepthi.assignment.utilities;

import com.deepthi.assignment.employees.Employee;

/**
 * EmployeeUtilities class is used to perform operations on Employee objects.
 * It shows how to access private members using public getters/setters
 * from a different package.
 * 
 * @author Your Name
 */
public class EmployeeUtilities {

    /**
     * Prints the details of the given employee.
     * Demonstrates accessing private fields via public getters.
     * 
     * @param emp The Employee object whose details are to be printed
     */
    public void printEmployeeDetails(Employee emp) {
        System.out.println("Employee ID: " + emp.getEmployeeId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());
        
        // emp.name is not accessible because it is private
        // We must use getters - This is proper encapsulation
    }

    /**
     * Gives a salary hike to the employee.
     * 
     * @param emp The Employee object
     * @param percentage The percentage of hike to be given
     */
    public void giveHike(Employee emp, double percentage) {
        double currentSalary = emp.getSalary();
        double newSalary = currentSalary + (currentSalary * percentage / 100);
        emp.setSalary(newSalary);
        
        System.out.println("Salary hiked by " + percentage + "% for " + emp.getName());
        System.out.println("New Salary: " + emp.getSalary());
    }
}