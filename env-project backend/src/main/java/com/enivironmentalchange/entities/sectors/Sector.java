package com.enivironmentalchange.entities.sectors;


import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "sector")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "name")
    private SectorName sectorName;

    @Column(name = "co2_emission")
    private int co2Emission;

    @Column(name = "ch4_emission")
    private int ch4Emission;

    @Column(name = "n2o_emission")
    private int n2oEmission;

    @Column(name = "co2_emission_prediction")
    private int co2EmissionPrediction;

    @Column(name = "ch4_emission_prediction")
    private int ch4EmissionPrediction;

    @Column(name = "n2o_emission_prediction")
    private int n2oEmissionPrediction;

    @OneToMany(mappedBy = "sector",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Co2Emission> co2Emissions;

    @OneToMany(mappedBy = "sector",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Ch4Emission> ch4Emissions;

    @OneToMany(mappedBy = "sector",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<N2oEmission> n2oEmissions;

    @OneToMany(mappedBy = "sector",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Co2EmissionPrediction> co2EmissionPredictions;

    @OneToMany(mappedBy = "sector",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<Ch4EmissionPrediction> ch4EmissionPredictions;

    @OneToMany(mappedBy = "sector",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    private List<N2oEmissionPrediction> n2oEmissionPredictions;


    public Sector() {

    }

    public Sector(int co2Emission, int ch4Emission, int n2oEmission, int co2EmissionPrediction, int ch4EmissionPrediction, int n2oEmissionPrediction) {
        this.co2Emission = co2Emission;
        this.ch4Emission = ch4Emission;
        this.n2oEmission = n2oEmission;
        this.co2EmissionPrediction = co2EmissionPrediction;
        this.ch4EmissionPrediction = ch4EmissionPrediction;
        this.n2oEmissionPrediction = n2oEmissionPrediction;
    }

    // utility method to add co2 emissions
    public void add(Co2Emission tempCo2Emission) {

        if (this.co2Emissions == null) {
            this.co2Emissions = new ArrayList<>();
        }

        this.co2Emissions.add(tempCo2Emission);
        tempCo2Emission.setSector(this);
    }

    // utility method to add ch4 emissions
    public void add(Ch4Emission tempCh4Emission) {

        if (this.ch4Emissions == null) {
            this.ch4Emissions = new ArrayList<>();
        }

        this.ch4Emissions.add(tempCh4Emission);
        tempCh4Emission.setSector(this);
    }

    // utility method to add n2o emissions
    public void add(N2oEmission tempN2oEmission) {

        if (this.n2oEmissions == null) {
            this.n2oEmissions = new ArrayList<>();
        }

        this.n2oEmissions.add(tempN2oEmission);
        tempN2oEmission.setSector(this);
    }

    // utility method to add co2 emission predictions
    public void add(Co2EmissionPrediction tempCo2EmissionPrediction) {

        if (this.co2EmissionPredictions == null) {
            this.co2EmissionPredictions = new ArrayList<>();
        }

        this.co2EmissionPredictions.add(tempCo2EmissionPrediction);
        tempCo2EmissionPrediction.setSector(this);
    }

    // utility method to add ch4 emission predictions
    public void add(Ch4EmissionPrediction tempCh4EmissionPrediction) {

        if (this.ch4EmissionPredictions == null) {
            this.ch4EmissionPredictions = new ArrayList<>();
        }

        this.ch4EmissionPredictions.add(tempCh4EmissionPrediction);
        tempCh4EmissionPrediction.setSector(this);
    }

    // utility method to add n2o emission predictions
    public void add(N2oEmissionPrediction tempN2oEmissionPrediction) {

        if (this.n2oEmissionPredictions == null) {
            this.n2oEmissionPredictions = new ArrayList<>();
        }

        this.n2oEmissionPredictions.add(tempN2oEmissionPrediction);
        tempN2oEmissionPrediction.setSector(this);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public SectorName getSectorName() {
        return sectorName;
    }

    public void setSectorName(SectorName sectorName) {
        this.sectorName = sectorName;
    }

    public List<Co2Emission> getCo2Emissions() {
        return co2Emissions;
    }

    public void setCo2Emissions(List<Co2Emission> co2Emissions) {
        this.co2Emissions = co2Emissions;
    }

    public List<Ch4Emission> getCh4Emissions() {
        return ch4Emissions;
    }

    public void setCh4Emissions(List<Ch4Emission> ch4Emissions) {
        this.ch4Emissions = ch4Emissions;
    }

    public List<N2oEmission> getN2oEmissions() {
        return n2oEmissions;
    }

    public void setN2oEmissions(List<N2oEmission> n2oEmissions) {
        this.n2oEmissions = n2oEmissions;
    }

    public int getCo2EmissionPrediction() {
        return co2EmissionPrediction;
    }

    public void setCo2EmissionPrediction(int co2EmissionPrediction) {
        this.co2EmissionPrediction = co2EmissionPrediction;
    }

    public int getCh4EmissionPrediction() {
        return ch4EmissionPrediction;
    }

    public void setCh4EmissionPrediction(int ch4EmissionPrediction) {
        this.ch4EmissionPrediction = ch4EmissionPrediction;
    }

    public int getN2oEmissionPrediction() {
        return n2oEmissionPrediction;
    }

    public void setN2oEmissionPrediction(int n2oEmissionPrediction) {
        this.n2oEmissionPrediction = n2oEmissionPrediction;
    }

    public int getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(int co2Emission) {
        this.co2Emission = co2Emission;
    }

    public int getCh4Emission() {
        return ch4Emission;
    }

    public void setCh4Emission(int ch4Emission) {
        this.ch4Emission = ch4Emission;
    }

    public int getN2oEmission() {
        return n2oEmission;
    }

    public void setN2oEmission(int n2oEmission) {
        this.n2oEmission = n2oEmission;
    }

    public List<Co2EmissionPrediction> getCo2EmissionPredictions() {
        return co2EmissionPredictions;
    }

    public void setCo2EmissionPredictions(List<Co2EmissionPrediction> co2EmissionPredictions) {
        this.co2EmissionPredictions = co2EmissionPredictions;
    }

    public List<Ch4EmissionPrediction> getCh4EmissionPredictions() {
        return ch4EmissionPredictions;
    }

    public void setCh4EmissionPredictions(List<Ch4EmissionPrediction> ch4EmissionPredictions) {
        this.ch4EmissionPredictions = ch4EmissionPredictions;
    }

    public List<N2oEmissionPrediction> getN2oEmissionPredictions() {
        return n2oEmissionPredictions;
    }

    public void setN2oEmissionPredictions(List<N2oEmissionPrediction> n2oEmissionPredictions) {
        this.n2oEmissionPredictions = n2oEmissionPredictions;
    }

    @Override
    public String toString() {
        return "Sector{" +
                "id=" + id +
                ", sectorName=" + sectorName +
                ", co2Emissions=" + co2Emissions +
                ", ch4Emissions=" + ch4Emissions +
                ", n2oEmissions=" + n2oEmissions +
                ", co2Emission=" + co2Emission +
                ", ch4Emission=" + ch4Emission +
                ", n2oEmission=" + n2oEmission +
                ", co2EmissionPrediction=" + co2EmissionPrediction +
                ", ch4EmissionPrediction=" + ch4EmissionPrediction +
                ", n2oEmissionPrediction=" + n2oEmissionPrediction +
                '}';
    }
}
