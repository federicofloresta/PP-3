package com.techelevator.crm;

import com.techelevator.hr.Employee;
import junit.framework.TestCase;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class CustomerTest extends TestCase {

    public void testGetBalanceDue() {

        }
//    @Override

    public void getBalanceDue() {
        double totalCost = 0.0;
        Employee Employee1 = new Employee("John", "Doe");
        Map<String, Double> servicesRendered = new HashMap<>();
        servicesRendered.put("Walking", 20.00);
        servicesRendered.put("Grooming", 50.00);
        servicesRendered.put("Nail Trimming", 15.00);
        servicesRendered.put("Sitting", 10.00);
        Assert.assertEquals(95.00, Employee1.getBalanceDue(servicesRendered));
    }


}
