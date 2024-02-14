package com.enivironmentalchange.entities.countries;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "country")
public class Country {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;


    @Column(name = "name")
    private String name;


    @Column(name = "average_greenhouse_gas")
    private int averageGreenhouseGas;


    @Column(name = "average_temperature")
    private int averageTemperature;


    @Column(name = "average_wildfire")
    private int averageWildfire;


    @Column(name = "average_natural_disaster")
    private int averageNaturalDisaster;

    @OneToMany(mappedBy = "country",
               cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<YearlyWildfire> wildfires;

    @OneToMany(mappedBy = "country",
               cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<YearlyTemperature> temperatures;

    @OneToMany(mappedBy = "country",
                cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<YearlyNaturalDisaster> naturalDisasters;

    @OneToMany(mappedBy = "country",
                cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<YearlyGreenhouseGasEmission> greenhouseGasEmissions;

    public Country () {

    }

    public Country(String name, int averageGreenhouseGas, int averageTemperature, int averageWildfire, int averageNaturalDisaster) {
        this.name = name;
        this.averageGreenhouseGas = averageGreenhouseGas;
        this.averageTemperature = averageTemperature;
        this.averageWildfire = averageWildfire;
        this.averageNaturalDisaster = averageNaturalDisaster;
    }


    // utility method to add yearly wildfire
    public void add(YearlyWildfire tempWildfire) {

        if (this.wildfires == null) {
            this.wildfires = new ArrayList<>();
        }

        this.wildfires.add(tempWildfire);
        tempWildfire.setCountry(this);
    }

    // utility method to add yearly temperature
    public void add(YearlyTemperature tempTemperature) {

        if (this.temperatures == null) {
            this.temperatures = new ArrayList<>();
        }

        this.temperatures.add(tempTemperature);
        tempTemperature.setCountry(this);
    }

    // utility method to add yearly natural disaster
    public void add(YearlyNaturalDisaster tempNaturalDisaster) {

        if (this.naturalDisasters == null) {
            this.naturalDisasters = new ArrayList<>();
        }

        this.naturalDisasters.add(tempNaturalDisaster);
        tempNaturalDisaster.setCountry(this);
    }

    // utility method to add yearly greenhouse gas
    public void add(YearlyGreenhouseGasEmission tempGreenhouseGas) {

        if (this.greenhouseGasEmissions == null) {
            this.greenhouseGasEmissions = new ArrayList<>();
        }

        this.greenhouseGasEmissions.add(tempGreenhouseGas);
        tempGreenhouseGas.setCountry(this);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAverageGreenhouseGas() {
        return averageGreenhouseGas;
    }

    public void setAverageGreenhouseGas(int averageGreenhouseGas) {
        this.averageGreenhouseGas = averageGreenhouseGas;
    }

    public int getAverageTemperature() {
        return averageTemperature;
    }

    public void setAverageTemperature(int averageTemperature) {
        this.averageTemperature = averageTemperature;
    }

    public int getAverageWildfire() {
        return averageWildfire;
    }

    public void setAverageWildfire(int averageWildfire) {
        this.averageWildfire = averageWildfire;
    }

    public int getAverageNaturalDisaster() {
        return averageNaturalDisaster;
    }

    public void setAverageNaturalDisaster(int averageNaturalDisaster) {
        this.averageNaturalDisaster = averageNaturalDisaster;
    }

    public List<YearlyWildfire> getWildfires() {
        return wildfires;
    }

    public void setWildfires(List<YearlyWildfire> wildfires) {
        this.wildfires = wildfires;
    }

    public List<YearlyTemperature> getTemperatures() {
        return temperatures;
    }

    public void setTemperatures(List<YearlyTemperature> temperatures) {
        this.temperatures = temperatures;
    }

    public List<YearlyNaturalDisaster> getNaturalDisasters() {
        return naturalDisasters;
    }

    public void setNaturalDisasters(List<YearlyNaturalDisaster> naturalDisasters) {
        this.naturalDisasters = naturalDisasters;
    }

    public List<YearlyGreenhouseGasEmission> getGreenhouseGasEmissions() {
        return greenhouseGasEmissions;
    }

    public void setGreenhouseGasEmissions(List<YearlyGreenhouseGasEmission> greenhouseGasEmissions) {
        this.greenhouseGasEmissions = greenhouseGasEmissions;
    }

    @Override
    public String toString() {
        return "Country{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", averageGreenhouseGas=" + averageGreenhouseGas +
                ", averageTemperature=" + averageTemperature +
                ", averageWildfire=" + averageWildfire +
                ", averageNaturalDisaster=" + averageNaturalDisaster +
                '}';
    }
}
