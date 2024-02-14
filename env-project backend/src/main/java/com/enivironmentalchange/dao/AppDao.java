package com.enivironmentalchange.dao;

import com.enivironmentalchange.entities.FuturePrediction;
import com.enivironmentalchange.entities.Project;
import com.enivironmentalchange.entities.countries.*;
import com.enivironmentalchange.entities.sectors.*;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AppDao {

    // country methods
    void save(Country theCountry);
    void update(Country theCountry);
    void delete(int theId);
    Country findCountryById(int theId);


    // yearly wildfire methods
    void update(YearlyWildfire tempWildfire);
    void deleteYearlyWildfire(int theId);
    YearlyWildfire findYearlyWildfireById(int theId);


    // yearly temperature methods
    void update(YearlyTemperature tempTemperature);
    void deleteYearlyTemperature(int theId);
    YearlyTemperature findYearlyTemperature(int theId);


    // yearly natural disaster methods
    void update(YearlyNaturalDisaster tempNaturalDisaster);
    void deleteYearlyNaturalDisaster(int theId);
    YearlyNaturalDisaster findYearlyNaturalDisasterById(int theId);


    // yearly greenhouse gas methods
    void deleteYearlyGreenhouseGas(int theId);
    YearlyGreenhouseGasEmission findYearlyGreenhouseGasById(int theId);


    //sector methods
    void save(Sector theSector);
    void update(Sector tempSector);
    void deleteSector(int theId);
    Sector findSectorById(int theId);

    //sector co2 emissions
    void update(Co2Emission tempCo2Emission);
    void deleteCo2Emission(int theId);
    Co2Emission findCo2EmissionById(int theId);

    // sector ch4 emissions
    void update(Ch4Emission tempCh4Emission);
    void deleteCh4Emission(int theId);
    Ch4Emission findCh4EmissionById(int theId);

    // sector n2o emissions
    void update(N2oEmission tempN2oEmission);
    void deleteN2oEmission(int theId);
    N2oEmission findN2oEmissionById(int theId);


    // sector co2 emissions prediction
    void update(Co2EmissionPrediction tempCo2EmissionPrediction);
    void deleteCo2EmissionPrediction(int theId);
    Co2EmissionPrediction findCo2EmissionPredictionById(int theId);


    // sector ch4 emissions prediction
    void update(Ch4EmissionPrediction tempCh4EmissionPrediction );
    void deleteCh4EmissionPrediction(int theId);
    Ch4EmissionPrediction findCh4EmissionPredictionById (int theId);


    // sector n2o emissions prediction
    void update(N2oEmissionPrediction tempN2oEmissionPrediction);
    void deleteN2oEmissionPrediction(int theId);
    N2oEmissionPrediction findN2oEmissionPredictionById (int theId);


    // project methods
    void save(Project theProject);
    void update(Project tempProject);
    void deleteProject(int theId);
    Project findProjectById(int theId);

    // future prediction methods
    void save(FuturePrediction theFuturePrediction);
    void update(FuturePrediction tempFuturePrediction);
    void deleteFuturePrediction(int theId);
    FuturePrediction findFuturePredictionById(int theId);





}
