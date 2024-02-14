package com.enivironmentalchange.entities.countries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "yearly_greenhouse_gas_emission")
public class YearlyGreenhouseGasEmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    public int id;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;


    @OneToMany(mappedBy = "gasEmission",
              cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<CountryCh4Emission> countryCh4Emissions;

    @OneToMany(mappedBy = "gasEmission",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<CountryCo2Emission> countryCo2Emissions;

    @OneToMany(mappedBy = "gasEmission",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<CountryN2oEmission> countryN2oEmissions;

    public YearlyGreenhouseGasEmission () {

    }

    // utility method to add ch4 emission
    public void add(CountryCh4Emission tempCh4Emission) {

        if (this.countryCh4Emissions == null) {
            this.countryCh4Emissions = new ArrayList<>();
        }

        this.countryCh4Emissions.add(tempCh4Emission);
        tempCh4Emission.setGasEmission(this);
    }

    // utility method to add co2 emission
    public void add(CountryCo2Emission tempCo2Emission) {

        if (this.countryCo2Emissions == null) {
            this.countryCo2Emissions = new ArrayList<>();
        }

        this.countryCo2Emissions.add(tempCo2Emission);
        tempCo2Emission.setGasEmission(this);
    }

    // utility method to add n2o emission
    public void add(CountryN2oEmission tempN2oEmission) {

        if (this.countryN2oEmissions == null) {
            this.countryN2oEmissions = new ArrayList<>();
        }

        this.countryN2oEmissions.add(tempN2oEmission);
        tempN2oEmission.setGasEmission(this);
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "YearlyGreenhouseGasEmission{" +
                "id=" + id +
                ", country=" + country +
                '}';
    }
}
