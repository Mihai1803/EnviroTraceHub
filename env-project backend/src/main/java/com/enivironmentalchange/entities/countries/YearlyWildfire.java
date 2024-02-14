package com.enivironmentalchange.entities.countries;


import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;

@Entity
@Table(name = "yearly_wildfire")
public class YearlyWildfire {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "wildfires")
    private int wildfire;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "country_id")
    @JsonIgnore
    private Country country;

    public YearlyWildfire () {

    }

    public YearlyWildfire(int year, int wildfire) {
        this.year = year;
        this.wildfire = wildfire;
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

    public int getWildfire() {
        return wildfire;
    }

    public void setWildfire(int wildfire) {
        this.wildfire = wildfire;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "YearlyWildfire{" +
                "id=" + id +
                ", year=" + year +
                ", wildfire=" + wildfire +
                '}';
    }
}
