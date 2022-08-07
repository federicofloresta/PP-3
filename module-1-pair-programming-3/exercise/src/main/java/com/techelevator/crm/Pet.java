package com.techelevator.crm;

import java.util.ArrayList;
import java.util.List;

public class Pet {
    private String name;
    private String species;
    private List vaccinations = new ArrayList<>();

    public Pet(String name, String species) {
        this.name = name;
        this.species = species;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public List getVaccinations() {
        return vaccinations;
    }

    public void setVaccinations(List vaccinations) {
        this.vaccinations = vaccinations;
    }

    // This method is used to pull the list vaccinations
    public String listVaccinations() {
        String vaccineCommaSeperator = String.join(", " , vaccinations);
        return vaccineCommaSeperator;
    }
}
