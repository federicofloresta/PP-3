package com.techelevator.crm;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;


public class PetTests {


    @Test
    public void listVaccinationsTest() {
        Pet pet1 = new Pet("Parry", "Platypus");
        List<String> vaccinationsGiven = new ArrayList<>();
        vaccinationsGiven.add("Rabies");
        vaccinationsGiven.add("Parvo");
        vaccinationsGiven.add("Distemper");
        pet1.setVaccinations(vaccinationsGiven);
        Assert.assertEquals("Rabies, Parvo, Distemper", pet1.listVaccinations());
    }

}
