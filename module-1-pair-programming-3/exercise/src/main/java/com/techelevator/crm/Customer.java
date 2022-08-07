package com.techelevator.crm;

import com.techelevator.Billable;
import com.techelevator.Person;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Customer extends Person implements Billable {
    private String phoneNumber;
    private List pets = new ArrayList<>();

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public List getPets() {
        return pets;
    }

    public void setPets(List pets) {
        this.pets = pets;
    }

    public Customer(String firstName, String lastName, String phoneNumber) {
        super(firstName, lastName);
        this.phoneNumber = phoneNumber;
    }

    public Customer(String firstName, String lastName){
        super(firstName, lastName);
    }


    private double getBalanceDue() {
        return 0;
    }
//pulled the value and added the balance
    @Override
    public double getBalanceDue(Map<String, Double> servicesRendered) {
        double totalCost = 0;
        for(Map.Entry<String, Double> entry :servicesRendered.entrySet()){
            totalCost += entry.getValue();
        }
        return totalCost;
    }

}
