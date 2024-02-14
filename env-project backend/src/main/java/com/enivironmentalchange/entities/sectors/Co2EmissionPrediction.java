package com.enivironmentalchange.entities.sectors;

import jakarta.persistence.*;

@Entity
@Table(name = "co2_emission_prediction")
public class Co2EmissionPrediction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "time_period")
    private int timePeriod;

    @Column(name = "emission")
    private int emission;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "sector_id")
    private Sector sector;

    public Co2EmissionPrediction () {

    }

    public Co2EmissionPrediction(int timePeriod, int emission) {
        this.timePeriod = timePeriod;
        this.emission = emission;
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

    public int getEmission() {
        return emission;
    }

    public void setEmission(int emission) {
        this.emission = emission;
    }

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "Co2EmissionPrediction{" +
                "id=" + id +
                ", timePeriod=" + timePeriod +
                ", emission=" + emission +
                '}';
    }
}
