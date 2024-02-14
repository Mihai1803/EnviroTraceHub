package com.enivironmentalchange.dao;


import com.enivironmentalchange.entities.FuturePrediction;
import com.enivironmentalchange.entities.Project;
import com.enivironmentalchange.entities.countries.*;
import com.enivironmentalchange.entities.sectors.*;
import jakarta.persistence.Entity;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.swing.*;

@Repository
public class AppDaoImplementation implements AppDao {


    private EntityManager entityManager;


    @Autowired
    public AppDaoImplementation(EntityManager entityManager) {
        this.entityManager = entityManager;
    }


    // country methods
    @Override
    @Transactional
    public void save(Country theCountry) {
        entityManager.persist(theCountry);
    }

    @Override
    @Transactional
    public void update(Country theCountry) {
        entityManager.merge(theCountry);
    }

    @Override
    @Transactional
    public void delete(int theId) {
        Country tempCountry = entityManager.find(Country.class, theId);
        entityManager.remove(tempCountry);

    }

    @Override
    public Country findCountryById(int theId) {
        return entityManager.find(Country.class, theId);
    }


    // yearly wildfire methods

    @Override
    @Transactional
    public void update(YearlyWildfire tempWildfire) {
        entityManager.merge(tempWildfire);
    }

    @Override
    @Transactional
    public void deleteYearlyWildfire(int theId) {
        YearlyWildfire tempWildfire = entityManager.find(YearlyWildfire.class, theId);
        entityManager.remove(tempWildfire);
    }

    @Override
    public YearlyWildfire findYearlyWildfireById(int theId) {
         return entityManager.find(YearlyWildfire.class, theId);
    }


    // yearly temperature methods
    @Override
    @Transactional
    public void update(YearlyTemperature tempTemperature) {
        entityManager.merge(tempTemperature);
    }

    @Override
    @Transactional
    public void deleteYearlyTemperature(int theId) {
        YearlyTemperature tempTemperature = entityManager.find(YearlyTemperature.class, theId);
        entityManager.remove(tempTemperature);
    }

    @Override
    public YearlyTemperature findYearlyTemperature(int theId) {
        return entityManager.find(YearlyTemperature.class, theId);
    }


    // yearly natural disaster methods
    @Override
    @Transactional
    public void update(YearlyNaturalDisaster tempNaturalDisaster) {
        entityManager.merge(tempNaturalDisaster);
    }

    @Override
    @Transactional
    public void deleteYearlyNaturalDisaster(int theId) {
        YearlyNaturalDisaster tempNaturalDisaster = entityManager.find(YearlyNaturalDisaster.class, theId);
        entityManager.remove(tempNaturalDisaster);
    }

    @Override
    public YearlyNaturalDisaster findYearlyNaturalDisasterById(int theId) {
        return entityManager.find(YearlyNaturalDisaster.class, theId);
    }


    // yearly greenhouse gas methods
    @Override
    @Transactional
    public void deleteYearlyGreenhouseGas(int theId) {
        YearlyGreenhouseGasEmission tempGreenhouseGas = entityManager.find(YearlyGreenhouseGasEmission.class, theId);
        entityManager.remove(tempGreenhouseGas);
    }

    @Override
    public YearlyGreenhouseGasEmission findYearlyGreenhouseGasById(int theId) {
        return entityManager.find(YearlyGreenhouseGasEmission.class, theId);
    }


    // sector methods
    @Override
    @Transactional
    public void save(Sector theSector) {
        entityManager.persist(theSector);
    }
    @Override
    @Transactional
    public void update(Sector tempSector) {
        entityManager.merge(tempSector);
    }
    @Override
    @Transactional
    public void deleteSector(int theId) {
        Sector tempSector = entityManager.find(Sector.class, theId);
        entityManager.remove(tempSector);
    }
    @Override
    public Sector findSectorById(int theId) {
        return entityManager.find(Sector.class, theId);
    }


    // sector co2 methods
    @Override
    @Transactional
    public void update(Co2Emission tempCo2Emission) {
        entityManager.merge(tempCo2Emission);
    }

    @Override
    @Transactional
    public void deleteCo2Emission(int theId) {
        Co2Emission tempCo2Emission = entityManager.find(Co2Emission.class, theId);
        entityManager.remove(tempCo2Emission);
    }

    @Override
    public Co2Emission findCo2EmissionById(int theId) {
        return entityManager.find(Co2Emission.class, theId);
    }

    // sector ch4 methods
    @Override
    @Transactional
    public void update(Ch4Emission tempCh4Emission) {
        entityManager.merge(tempCh4Emission);
    }

    @Override
    @Transactional
    public void deleteCh4Emission(int theId) {
        Ch4Emission tempCh4Emission = entityManager.find(Ch4Emission.class, theId);
        entityManager.remove(tempCh4Emission);
    }

    @Override
    public Ch4Emission findCh4EmissionById(int theId) {
        return entityManager.find(Ch4Emission.class, theId);
    }


    // sector n2o methods
    @Override
    @Transactional
    public void update(N2oEmission tempN2oEmission) {
        entityManager.merge(tempN2oEmission);
    }

    @Override
    @Transactional
    public void deleteN2oEmission(int theId) {
        N2oEmission tempN2oEmission = entityManager.find(N2oEmission.class, theId);
        entityManager.remove(tempN2oEmission);
    }

    @Override
    public N2oEmission findN2oEmissionById(int theId) {
        return entityManager.find(N2oEmission.class, theId);
    }

    // sector co2 prediction methods
    @Override
    @Transactional
    public void update(Co2EmissionPrediction tempCo2EmissionPrediction) {
        entityManager.merge(tempCo2EmissionPrediction);
    }

    @Override
    @Transactional
    public void deleteCo2EmissionPrediction(int theId) {
        Co2EmissionPrediction tempCo2EmissionPrediction = entityManager.find(Co2EmissionPrediction.class, theId);
        entityManager.remove(tempCo2EmissionPrediction);
    }

    @Override
    public Co2EmissionPrediction findCo2EmissionPredictionById(int theId) {
        return entityManager.find(Co2EmissionPrediction.class, theId);
    }

    // sector ch4 prediction methods
    @Override
    @Transactional
    public void update(Ch4EmissionPrediction tempCh4EmissionPrediction) {
        entityManager.merge(tempCh4EmissionPrediction);
    }

    @Override
    @Transactional
    public void deleteCh4EmissionPrediction(int theId) {
        Ch4EmissionPrediction tempCh4EmissionPrediction = entityManager.find(Ch4EmissionPrediction.class, theId);
        entityManager.remove(tempCh4EmissionPrediction);
    }

    @Override
    public Ch4EmissionPrediction findCh4EmissionPredictionById(int theId) {
        return entityManager.find(Ch4EmissionPrediction.class, theId);
    }

    // sector n2o prediction methods

    @Override
    @Transactional
    public void update(N2oEmissionPrediction tempN2oEmissionPrediction) {
        entityManager.merge(tempN2oEmissionPrediction);
    }

    @Override
    @Transactional
    public void deleteN2oEmissionPrediction(int theId) {
        N2oEmissionPrediction tempN2oEmissionPrediction = entityManager.find(N2oEmissionPrediction.class, theId);
        entityManager.remove(tempN2oEmissionPrediction);
    }

    @Override
    public N2oEmissionPrediction findN2oEmissionPredictionById(int theId) {
        return entityManager.find(N2oEmissionPrediction.class, theId);
    }


    // project methods
    @Override
    @Transactional
    public void save(Project theProject) {
        entityManager.persist(theProject);
    }

    @Override
    @Transactional
    public void update(Project tempProject) {
        entityManager.merge(tempProject);
    }

    @Override
    @Transactional
    public void deleteProject(int theId) {
        Project tempProject = entityManager.find(Project.class, theId);
        entityManager.remove(tempProject);
    }

    @Override
    public Project findProjectById(int theId) {
        return entityManager.find(Project.class, theId);
    }

    // future prediction methods


    @Override
    @Transactional
    public void save(FuturePrediction theFuturePrediction) {
        entityManager.persist(theFuturePrediction);
    }

    @Override
    @Transactional
    public void update(FuturePrediction tempFuturePrediction) {
        entityManager.merge(tempFuturePrediction);
    }

    @Override
    @Transactional
    public void deleteFuturePrediction(int theId) {
        FuturePrediction tempFuturePrediction = entityManager.find(FuturePrediction.class, theId);
        entityManager.remove(tempFuturePrediction);
    }

    @Override
    public FuturePrediction findFuturePredictionById(int theId) {
        return entityManager.find(FuturePrediction.class, theId);
    }
}
