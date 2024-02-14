package com.enivironmentalchange.entities.countries;


import jakarta.persistence.*;

@Entity
@Table(name = "country_n2o_emission")
public class CountryN2oEmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "emission")
    private int emission;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "gas_name")
    private GreenhouseGas gasName;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "gas_id")
    private YearlyGreenhouseGasEmission gasEmission;

    public CountryN2oEmission () {

    }

    public CountryN2oEmission(int year, int emission) {
        this.year = year;
        this.emission = emission;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEmission() {
        return emission;
    }

    public void setEmission(int emission) {
        this.emission = emission;
    }

    public GreenhouseGas getGasName() {
        return gasName;
    }

    public void setGasName(GreenhouseGas gasName) {
        this.gasName = gasName;
    }

    public YearlyGreenhouseGasEmission getGasEmission() {
        return gasEmission;
    }

    public void setGasEmission(YearlyGreenhouseGasEmission gasEmission) {
        this.gasEmission = gasEmission;
    }

    @Override
    public String toString() {
        return "CountryN2oEmission{" +
                "id=" + id +
                ", year=" + year +
                ", emission=" + emission +
                ", gasName=" + gasName +
                ", gasEmission=" + gasEmission +
                '}';
    }
}
