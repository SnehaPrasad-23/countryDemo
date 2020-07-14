package com.learning.aws.country.persistence.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class CountryCapital {
    @Id
    private String countryName;
    private String countryCapital;

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getCountryCapital() {
        return countryCapital;
    }

    public void setCountryCapital(String countryCapital) {
        this.countryCapital = countryCapital;
    }
}
