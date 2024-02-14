package com.enivironmentalchange.entities.countries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "yearly_natural_disaster")
public class YearlyNaturalDisaster {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "natural_disaster")
    private int naturalDisaster;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;


    public YearlyNaturalDisaster () {

    }

    public YearlyNaturalDisaster(int year, int naturalDisaster) {
        this.year = year;
        this.naturalDisaster = naturalDisaster;
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

    public int getNaturalDisaster() {
        return naturalDisaster;
    }

    public void setNaturalDisaster(int naturalDisaster) {
        this.naturalDisaster = naturalDisaster;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "YearlyNaturalDisaster{" +
                "id=" + id +
                ", year=" + year +
                ", naturalDisaster=" + naturalDisaster +
                ", country=" + country +
                '}';
    }
}
