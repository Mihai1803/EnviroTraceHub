package com.enivironmentalchange.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "future_prediction")
public class FuturePrediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "time_period")
    private int timePeriod;

    @Column(name = "average_greenhouse_gas")
    private int averageGreenhouseGas;

    @Column(name = "average_temperature")
    private int averageTemperature;

    @Column(name = "average_wildfire")
    private int averageWildfire;

    @Column(name = "average_natural_disaster")
    private int averageNaturalDisaster;


    public FuturePrediction () {

    }

    public FuturePrediction(int timePeriod, int averageGreenhouseGas, int averageTemperature, int averageWildfire, int averageNaturalDisaster) {
        this.timePeriod = timePeriod;
        this.averageGreenhouseGas = averageGreenhouseGas;
        this.averageTemperature = averageTemperature;
        this.averageWildfire = averageWildfire;
        this.averageNaturalDisaster = averageNaturalDisaster;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(int timePeriod) {
        this.timePeriod = timePeriod;
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

    @Override
    public String toString() {
        return "FuturePrediction{" +
                "id=" + id +
                ", timePeriod=" + timePeriod +
                ", averageGreenhouseGas=" + averageGreenhouseGas +
                ", averageTemperature=" + averageTemperature +
                ", averageWildfire=" + averageWildfire +
                ", averageNaturalDisaster=" + averageNaturalDisaster +
                '}';
    }
}
