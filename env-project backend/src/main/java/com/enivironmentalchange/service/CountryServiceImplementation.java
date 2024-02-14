package com.enivironmentalchange.service;

import com.enivironmentalchange.dao.AppDao;
import com.enivironmentalchange.entities.countries.Country;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CountryServiceImplementation implements CountryService {

    private AppDao appDao;
    @Autowired
    public CountryServiceImplementation(AppDao appDao) {
        this.appDao = appDao;
    }

    @Override
    public Country findById(int theId) {
        return appDao.findCountryById(theId);
    }

    @Override
    public void save(Country theCountry) {
        appDao.save(theCountry);
    }

    @Override
    public void update(Country theCountry) {
        appDao.update(theCountry);
    }

    @Override
    public void delete(int theId) {
        appDao.delete(theId);
    }
}
