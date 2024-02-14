package com.enivironmentalchange.entities.countries;


import jakarta.persistence.*;

@Entity
@Table(name = "greenhouse_gas")
public class GreenhouseGas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "gas_name")
    private String GasName;

    @OneToOne( mappedBy = "gasName",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private CountryCh4Emission ch4Emission;

    @OneToOne( mappedBy = "gasName",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private CountryCo2Emission co2Emission;

    @OneToOne( mappedBy = "gasName",
            cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH},
            fetch = FetchType.LAZY)
    private CountryN2oEmission n2oEmission;

    public GreenhouseGas () {

    }

    public GreenhouseGas(String gasName) {
        GasName = gasName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGasName() {
        return GasName;
    }

    public void setGasName(String gasName) {
        GasName = gasName;
    }

    public CountryCh4Emission getCh4Emission() {
        return ch4Emission;
    }

    public void setCh4Emission(CountryCh4Emission ch4Emission) {
        this.ch4Emission = ch4Emission;
    }

    public CountryCo2Emission getCo2Emission() {
        return co2Emission;
    }

    public void setCo2Emission(CountryCo2Emission co2Emission) {
        this.co2Emission = co2Emission;
    }

    public CountryN2oEmission getN2oEmission() {
        return n2oEmission;
    }

    public void setN2oEmission(CountryN2oEmission n2oEmission) {
        this.n2oEmission = n2oEmission;
    }

    @Override
    public String toString() {
        return "GreenhouseGas{" +
                "id=" + id +
                ", GasName='" + GasName + '\'' +
                ", ch4Emission=" + ch4Emission +
                ", co2Emission=" + co2Emission +
                ", n2oEmission=" + n2oEmission +
                '}';
    }
}
