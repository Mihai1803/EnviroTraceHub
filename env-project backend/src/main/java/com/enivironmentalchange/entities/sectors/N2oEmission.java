package com.enivironmentalchange.entities.sectors;


import jakarta.persistence.*;

@Entity
@Table(name = "n2o_emissions")
public class N2oEmission {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "year")
    private int year;

    @Column(name = "emission")
    private int emission;

    @ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.DETACH, CascadeType.REFRESH})
    @JoinColumn(name = "sector_id")
    private Sector sector;

    public N2oEmission () {

    }


    public N2oEmission(int year, int emission) {
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

    public Sector getSector() {
        return sector;
    }

    public void setSector(Sector sector) {
        this.sector = sector;
    }

    @Override
    public String toString() {
        return "N2oEmission{" +
                "id=" + id +
                ", year=" + year +
                ", emission=" + emission +
                '}';
    }
}
