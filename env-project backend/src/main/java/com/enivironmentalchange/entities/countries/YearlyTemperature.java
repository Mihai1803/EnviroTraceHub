package com.enivironmentalchange.entities.countries;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "yearly_temperature")
public class YearlyTemperature {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "temperature")
    private int temperature;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;


    public YearlyTemperature () {

    }

    public YearlyTemperature(int year, int temperature) {
        this.year = year;
        this.temperature = temperature;
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

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "YearlyTemperature{" +
                "id=" + id +
                ", year=" + year +
                ", temperature=" + temperature +
                ", country=" + country +
                '}';
    }
}
