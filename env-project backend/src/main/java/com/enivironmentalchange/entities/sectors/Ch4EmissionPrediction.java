package com.enivironmentalchange.entities.sectors;

import jakarta.persistence.*;

@Entity
@Table(name = "ch4_emission_prediction")
public class Ch4EmissionPrediction {

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

    public Ch4EmissionPrediction () {

    }

    public Ch4EmissionPrediction(int timePeriod, int emission) {
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
        return "Ch4EmissionPrediction{" +
                "id=" + id +
                ", timePeriod=" + timePeriod +
                ", emission=" + emission +
                '}';
    }
}
