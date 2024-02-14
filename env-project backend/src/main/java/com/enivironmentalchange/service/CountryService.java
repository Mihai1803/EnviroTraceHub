package com.enivironmentalchange.service;

import com.enivironmentalchange.dao.AppDao;
import com.enivironmentalchange.entities.countries.Country;

public interface CountryService {

    Country findById(int theId);
    void save(Country theCountry);
    void update(Country theCountry);
    void delete(int theId);



}
