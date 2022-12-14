package com.techelevator.hr;

import org.junit.Test;
import org.testng.Assert;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

public class EmployeeTests {

    @Test
    public void getFullNameReturnsCorrectFormat() {
        Employee employee = new Employee("Test", "Testerson");
        String fullName = employee.getFullName();

        assertEquals("The employee full name is not in the correct format.", "Testerson, Test", fullName);
    }

    @Test
    public void raiseSalaryTest_Positive() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(5);

        assertEquals("The employee raise of 5% was not computed correctly.",employee.getSalary(), 100 * 1.05, 0.0);
    }

    @Test
    public void raiseSalaryTest_Negative() {
        Employee employee = new Employee("Test", "Testerson");
        employee.setSalary(100);
        employee.raiseSalary(-10); //"raise" by negative 10%

        assertEquals("Salary should remain the same when raise percentage is negative.",100, employee.getSalary(),0.0);
    }
    @Test
    public void getBalanceDue() {
        double totalCost = 0.0;
        Employee Employee1 = new Employee("John", "Doe");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Nail Trimming", 15.00);
        servicesRendered.put("Sitting", 10.00);
        Assert.assertEquals(85.00, Employee1.getBalanceDue(servicesRendered));
    }
}
