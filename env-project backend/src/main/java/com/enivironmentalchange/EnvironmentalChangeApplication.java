package com.enivironmentalchange;

import com.enivironmentalchange.dao.AppDao;
import com.enivironmentalchange.entities.FuturePrediction;
import com.enivironmentalchange.entities.Project;
import com.enivironmentalchange.entities.countries.*;
import com.enivironmentalchange.entities.sectors.*;
import org.hibernate.Hibernate;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EnvironmentalChangeApplication {

	public static void main(String[] args) {
		SpringApplication.run(EnvironmentalChangeApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(AppDao appDao) {
		return runner -> {
			//createCountry(appDao);
			//updateCountry(appDao);
			//deleteCountry(appDao);
			//findCountryById(appDao);


			//createCountryWithYearlyWildfire(appDao);
			//updateYearlyWildfire(appDao);
			//deleteYearlyWildfire(appDao);
			//findYearlyWildfireById(appDao);


			//createCountryWithYearlyTemperature(appDao);
			//updateYearlyTemperature(appDao);
			//deleteYearlyTemperature(appDao);
			//findYearlyTemperatureById(appDao);


			//createCountryWithYearlyNaturalDisaster(appDao);
			//updateYearlyNaturalDisaster(appDao);
			//deleteYearlyNaturalDisaster(appDao);
			//findYearlyNaturalDisasterById(appDao);


			//createCountryWithYearlyGreenhouseGas(appDao);
			//deleteYearlyGreenhouseGas(appDao);
			//findYearlyGreenhouseGasById(appDao);


			//createSector(appDao);
			//updateSector(appDao);
			//deleteSector(appDao);
			//findSectorById(appDao);


			//createSectorWithCo2Emission(appDao);
			//updateCo2Emission(appDao);
			//deleteCo2Emission(appDao);
			//findCo2EmissionById(appDao);


			//createSectorWithCh4Emission(appDao);
			//updateCh4Emission(appDao);
			//deleteCh4Emission(appDao);
			//findCh4EmissionById(appDao);


			//createSectorWithN2oEmission(appDao);
			//updateN2oEmission(appDao);
			//deleteN2oEmission(appDao);
			//findN2oEmissionById(appDao);


			//createSectorWithCo2EmissionPrediction(appDao);
			//updateCo2EmissionPrediction(appDao);
			//deleteCo2EmissionPrediction(appDao);
			//findCo2EmissionPredictionById(appDao);


			//createSectorWithCh4EMissionPrediction(appDao);
			//updateCh4EmissionPrediction(appDao);
			//deleteCh4EmissionPrediction(appDao);
			//findCh4EmissionPredictionById(appDao);


			//createSectorWithN2oEMissionPrediction(appDao);
			//updateN2oEmissionPrediction(appDao);
			//deleteN2oEmissionPrediction(appDao);
			//findN2oEmissionPrediction(appDao);


			//createSectorWithEmissions(appDao);
			//createSectorWithEmissionPredictions(appDao);


			//createProject(appDao);
			//updateProject(appDao);
			//deleteProject(appDao);
			//findProjectById(appDao);


			//createFuturePrediction(appDao);
			//updateFuturePrediction(appDao);
			//deleteFuturePrediction(appDao);
			//findFuturePredictionById(appDao);


		};
	}




	// country methods
	private void createCountry(AppDao appDao) {

		// create country
		Country tempCountry = new Country("TestCountry", 0, 0, 0,0);

		// save country
		appDao.save(tempCountry);

		System.out.println("Country saved: " + tempCountry);
	}

	private void updateCountry(AppDao appDao) {

		// country that needs to be updated
		int theId = 6;
		Country tempCountry = appDao.findCountryById(theId);

		// update country
		tempCountry.setName("updateName");

		// committing the changes
		appDao.update(tempCountry);

		System.out.println("Country updated: " + tempCountry);

	}

	private void deleteCountry(AppDao appDao) {

		// country that needs to be deleted
		int theId = 8;

		// delete country
		appDao.delete(theId);

		System.out.println("Country deleted");

	}

	private void findCountryById(AppDao appDao) {

		// country that needs to be found
		int theId = 1;
		Country tempCountry = appDao.findCountryById(theId);

		System.out.println("Country: " + tempCountry);
	}

	// yearly wildfire methods
	private void createCountryWithYearlyWildfire(AppDao appDao) {

		//create country
		Country tempCountry = new Country("Test", 0, 0, 0, 0);

		// create wildfires
		YearlyWildfire tempWildfire1 = new YearlyWildfire(2021, 402);
		YearlyWildfire tempWildfire2 = new YearlyWildfire(2022, 502);

		// add wildfires to the country
		tempCountry.add(tempWildfire1);
		tempCountry.add(tempWildfire2);

		// save country with wildfire
		appDao.save(tempCountry);

		System.out.println("Country + Wildfire saved");
	}

	private void findYearlyWildfireById(AppDao appDao) {

		// wildfire that needs to be found
		int theId = 8;
		YearlyWildfire tempWildfire = appDao.findYearlyWildfireById(theId);

		System.out.println("Wildfire: " + tempWildfire);

	}

	private void updateYearlyWildfire(AppDao appDao) {

		// wildfire that needs to be updated
		int theId = 8;
		YearlyWildfire tempWildfire = appDao.findYearlyWildfireById(theId);

		// update wildfire
		tempWildfire.setYear(20000);

		// committing the changes
		appDao.update(tempWildfire);

		System.out.println("Country wildfire: " + tempWildfire);

	}

	private void deleteYearlyWildfire(AppDao appDao) {

		// wildfire that needs to be deleted
		int theId = 8;

		// delete wildfire
		appDao.deleteYearlyWildfire(theId);

		System.out.println("Wildfire deleted");

	}

	// yearly temperature methods

	private void createCountryWithYearlyTemperature(AppDao appDao) {

		// create country
		Country tempCountry = new Country("Test", 0, 0, 0, 0);

		// create temperatures
		YearlyTemperature tempTemperature1 = new YearlyTemperature(2040, 50);
		YearlyTemperature tempTemperature2 = new YearlyTemperature(2050, 60);

		tempCountry.add(tempTemperature1);
		tempCountry.add(tempTemperature2);

		// save country with temperature
		appDao.save(tempCountry);

		System.out.println("Country + Temperature saved");

	}

	private void findYearlyTemperatureById(AppDao appDao) {

		// temperature that needs to be found
		int theId = 5;
		YearlyTemperature tempTemperature = appDao.findYearlyTemperature(theId);

		System.out.println("Temperature: " + tempTemperature);
	}

	private void updateYearlyTemperature(AppDao appDao) {

		// temperature that needs to be updated
		int theId = 5;
		YearlyTemperature tempTemperature = appDao.findYearlyTemperature(theId);

		// update temperature
		tempTemperature.setTemperature(100);

		// committing the changes
		appDao.update(tempTemperature);

		System.out.println("Country temperature: " + tempTemperature);

	}

	private void deleteYearlyTemperature(AppDao appDao) {

		// temperature that needs to be deleted
		int theId = 5;

		// delete temperature
		appDao.deleteYearlyTemperature(theId);

		System.out.println("Temperature deleted");

	}


	// natural disaster methods

	private void createCountryWithYearlyNaturalDisaster(AppDao appDao) {

		// create country
		Country tempCountry = new Country("Testing", 0, 0, 0,0);

		// create natural disaster
		YearlyNaturalDisaster tempNaturalDisaster1 = new YearlyNaturalDisaster(2000, 100);
		YearlyNaturalDisaster tempNaturalDisaster2 = new YearlyNaturalDisaster(300, 200);

		tempCountry.add(tempNaturalDisaster1);
		tempCountry.add(tempNaturalDisaster2);

		// save country with natural disaster
		appDao.save(tempCountry);

		System.out.println("Country + Natural Disaster saved");

	}

	private void findYearlyNaturalDisasterById(AppDao appDao) {

		// natural disaster that needs to be found
		int theId = 2;
		YearlyNaturalDisaster tempNaturalDisaster = appDao.findYearlyNaturalDisasterById(theId);

		System.out.println("Natural disaster: " + tempNaturalDisaster);
	}

	private void updateYearlyNaturalDisaster(AppDao appDao) {

		// natural disaster that needs to updated
		int theId = 2;
		YearlyNaturalDisaster tempNaturalDisaster = appDao.findYearlyNaturalDisasterById(theId);

		// update the natural disaster
		tempNaturalDisaster.setYear(10);

		// committing the changes
		appDao.update(tempNaturalDisaster);

		System.out.println("Country natural disaster: " + tempNaturalDisaster);
	}

	private void deleteYearlyNaturalDisaster(AppDao appDao) {

		// natural disaster that needs to be deleted
		int theId = 2;

		// delete natural disaster
		appDao.deleteYearlyNaturalDisaster(theId);

		System.out.println("Natural disaster deleted");
	}


	// greenhouse gas methods
	private void createCountryWithYearlyGreenhouseGas(AppDao appDao) {

		// create country
		Country tempCountry = new Country("Test100", 0, 0, 0,0);

		// create greenhouse gas
		YearlyGreenhouseGasEmission tempGreenhouseGas = new YearlyGreenhouseGasEmission();

		CountryCh4Emission tempCh4Emission = new CountryCh4Emission(2040,100);
		CountryCo2Emission tempCo2Emission = new CountryCo2Emission(2060, 200);
		CountryN2oEmission tempN2oEmission = new CountryN2oEmission(2070, 300);

		GreenhouseGas ch4 = new GreenhouseGas("CH4");
		GreenhouseGas co2 = new GreenhouseGas("CO2");
		GreenhouseGas n2o = new GreenhouseGas("N2O");


		tempCh4Emission.setGasName(ch4);
		tempCo2Emission.setGasName(co2);
		tempN2oEmission.setGasName(n2o);

		tempGreenhouseGas.add(tempCh4Emission);
		tempGreenhouseGas.add(tempCo2Emission);
		tempGreenhouseGas.add(tempN2oEmission);



		tempCountry.add(tempGreenhouseGas);

		// save country greenhouse gas
		appDao.save(tempCountry);

		System.out.println("Country + Greenhouse gas saved");

	}

	private void deleteYearlyGreenhouseGas(AppDao appDao) {

		// greenhouse gas that needs to be deleted
		int theId = 5;

		// delete greenhouse gas
		appDao.deleteYearlyGreenhouseGas(theId);

		System.out.println("Greenhouse gas deleted");
	}

	private void findYearlyGreenhouseGasById(AppDao appDao) {

		// yearly greenhouse gas that need to be found
		int theId = 14;
		YearlyGreenhouseGasEmission tempGreenhouseGas = appDao.findYearlyGreenhouseGasById(theId);

		System.out.println("Yearly greenhouse gas: " + tempGreenhouseGas);

	}

	// sector methods

	private void createSector(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);

		appDao.save(tempSector);

		System.out.println("Sector saved: " + tempSector);
	}

	private void updateSector(AppDao appDao) {

		// sector that need to be updated
		int theId = 5;
		Sector tempSector = appDao.findSectorById(theId);

		// update the sector
		tempSector.setCh4Emission(19);

		// committing the changes
		appDao.update(tempSector);

		System.out.println("Sector: " + tempSector);
	}

	private void deleteSector(AppDao appDao) {

		// sector that needs to be deleted
		int theId = 5;

		// delete sector
		appDao.deleteSector(theId);

		System.out.println("Sector deleted");
	}


	private void findSectorById(AppDao appDao) {
		// the sector that needs to be found
		int theId = 5;
		Sector tempSector = appDao.findSectorById(theId);

		System.out.println("Sector: " + tempSector);
	}



	// sector co2 emission methods

	private void createSectorWithCo2Emission(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);


		// create emission
		Co2Emission tempCo2Emission = new Co2Emission(500, 500);

		tempSector.add(tempCo2Emission);

		// save country with co2 emission
		appDao.save(tempSector);

		System.out.println("Sector with co2 emission: " + tempSector);

	}
	private void updateCo2Emission(AppDao appDao) {

		// co2 emission that needs to be updated
		int theId = 8;
		Co2Emission tempCo2Emission = appDao.findCo2EmissionById(theId);

		// update the emission
		tempCo2Emission.setEmission(503);

		// committing the changes
		appDao.update(tempCo2Emission);

		System.out.println("Co2 emission: " + tempCo2Emission);

	}

	private void deleteCo2Emission(AppDao appDao) {

		// co2 emission that need to be deleted
		int theId = 1;

		// delete the emission
		appDao.deleteCo2Emission(theId);

		System.out.println("Emission deleted");

	}
	private void findCo2EmissionById(AppDao appDao) {

		// co2 emissions that needs to be found
		int theId = 1;
		Co2Emission tempCo2Emission = appDao.findCo2EmissionById(theId);

		System.out.println("Co2 emission: " + tempCo2Emission);
	}

	// sector ch4 emissions

	private void createSectorWithCh4Emission(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);

		// create emission
		Ch4Emission tempCh4Emission = new Ch4Emission(500, 500);

		tempSector.add(tempCh4Emission);

		// save country with ch4 emission
		appDao.save(tempSector);

		System.out.println("Sector with ch4 emission: " + tempSector);


	}

	private void updateCh4Emission(AppDao appDao) {
		// ch4 emission that needs to be updated
		int theId = 6;
		Ch4Emission tempCh4Emission = appDao.findCh4EmissionById(theId);

		// update the emission
		tempCh4Emission.setEmission(1000);

		// committing the changes
		appDao.update(tempCh4Emission);

		System.out.println("Ch4 emission: " + tempCh4Emission);
	}

	private void deleteCh4Emission(AppDao appDao) {

		// ch4 emission that needs to be deleted
		int theId = 1;
		Ch4Emission tempCh4Emission = appDao.findCh4EmissionById(theId);

		// delete the emission
		appDao.deleteCh4Emission(theId);

		System.out.println("Emission deleted");

	}
	private void findCh4EmissionById(AppDao appDao) {

		// ch4 emission that needs to be found
		int theId = 6;
		Co2Emission tempCo2Emission = appDao.findCo2EmissionById(theId);

		System.out.println("Ch4 emission: " + tempCo2Emission);
	}

	// sector n2o emission


	private void createSectorWithN2oEmission(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);

		// create emission
		N2oEmission tempN2oEmission = new N2oEmission(100, 100);

		tempSector.add(tempN2oEmission);

		// save country with n2o emission
		appDao.save(tempSector);

		System.out.println("Sector with n2o emission: " + tempSector);

	}

	private void updateN2oEmission(AppDao appDao) {

		// n2o emission that needs to be updated
		int theId = 1;
		N2oEmission tempN2oEmission = appDao.findN2oEmissionById(theId);

		// update the emission
		tempN2oEmission.setEmission(1999);

		// committing the changes
		appDao.update(tempN2oEmission);

		System.out.println("N2o emission: " + tempN2oEmission);
	}

	private void deleteN2oEmission(AppDao appDao) {

		// n2o emission that needs to be deleted
		int theId = 1;

		// delete the emission
		appDao.deleteN2oEmission(theId);

		System.out.println("Emission deleted");
	}

	private void findN2oEmissionById(AppDao appDao) {

		// n2o emission that needs to be found
		int theId = 1;
		N2oEmission tempN2oEmission = appDao.findN2oEmissionById(theId);

		System.out.println("N2o emission: " + tempN2oEmission);

	}

	// sector co2 emission prediction methods

	private void createSectorWithCo2EmissionPrediction(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);

		// create emission prediction
		Co2EmissionPrediction tempCo2EmissionPrediction = new Co2EmissionPrediction(200, 200);

		tempSector.add(tempCo2EmissionPrediction);

		// save country with co2 emission prediction
		appDao.save(tempSector);

		System.out.println("Sector with co2 emission prediction: " + tempSector);

	}

	private void updateCo2EmissionPrediction(AppDao appDao) {

		// co2 emission prediction that needs to be updated
		int theId = 1;
		Co2EmissionPrediction tempCo2EmissionPrediction = appDao.findCo2EmissionPredictionById(theId);

		// update the emission
		tempCo2EmissionPrediction.setEmission(1000);

		// committing the changes
		appDao.update(tempCo2EmissionPrediction);

		System.out.println("Co2 emission prediction: " + tempCo2EmissionPrediction);

	}


	private void deleteCo2EmissionPrediction(AppDao appDao) {

		// co2 emission prediction that needs to be deleted
		int theId = 1;

		// delete the emission
		appDao.deleteCo2EmissionPrediction(theId);

		System.out.println("Emission prediction deleted");

	}

	private void findCo2EmissionPredictionById(AppDao appDao) {

		// co2 emission prediction that needs to be found
		int theId = 1;
		Co2EmissionPrediction tempCo2EmissionPrediction = appDao.findCo2EmissionPredictionById(theId);

		System.out.println("Co2 emission prediction: " + tempCo2EmissionPrediction);
	}


	// sector ch4 emission prediction methods

	private void createSectorWithCh4EMissionPrediction(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);

		// create emission prediction
		Ch4EmissionPrediction tempCh4EmissionPrediction = new Ch4EmissionPrediction(100, 100);

		tempSector.add(tempCh4EmissionPrediction);

		// save country with ch4 emission prediction
		appDao.save(tempSector);

		System.out.println("Sector with ch4 emission prediction: " + tempSector);
	}

	private void updateCh4EmissionPrediction(AppDao appDao) {
		// ch4 emission prediction that needs to be updated
		int theId = 1;
		Ch4EmissionPrediction tempCh4EmissionPrediction = appDao.findCh4EmissionPredictionById(theId);

		// update the emission
		tempCh4EmissionPrediction.setEmission(1200);

		// committing the changes
		appDao.update(tempCh4EmissionPrediction);

		System.out.println("Co2 emission prediction: " + tempCh4EmissionPrediction);
	}

	private void deleteCh4EmissionPrediction(AppDao appDao) {

		// ch4 emission prediction that needs to be deleted
		int theId = 1;

		// delete the emission
		appDao.deleteCh4EmissionPrediction(theId);

		System.out.println("Emission prediction deleted");


	}
	private void findCh4EmissionPredictionById(AppDao appDao) {
		// co2 emission prediction that needs to be found
		int theId = 1;
		Ch4EmissionPrediction tempCh4EmissionPrediction = appDao.findCh4EmissionPredictionById(theId);

		System.out.println("Co2 emission prediction: " + tempCh4EmissionPrediction);
	}


	// sector n2o emission prediction methods

	private void createSectorWithN2oEMissionPrediction(AppDao appDao) {

		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// sector name
		SectorName tempSectorName = new SectorName("RO");
		tempSector.setSectorName(tempSectorName);

		// create emission prediction
		N2oEmissionPrediction tempN2oEmissionPrediction = new N2oEmissionPrediction(100,100);

		tempSector.add(tempN2oEmissionPrediction);

		// save sector with n2o emission prediction
		appDao.save(tempSector);

		System.out.println("Sector with n2o emission prediction: " + tempSector);
	}
	private void updateN2oEmissionPrediction(AppDao appDao) {
		// n2o emission prediction that needs to be updated
		int theId = 1;
		N2oEmissionPrediction tempN2oEmissionPrediction = appDao.findN2oEmissionPredictionById(theId);

		// update the emission
		tempN2oEmissionPrediction.setEmission(1234);

		// committing the changes
		appDao.update(tempN2oEmissionPrediction);

		System.out.println("N2o emission prediction: " + tempN2oEmissionPrediction);
	}

	private void deleteN2oEmissionPrediction(AppDao appDao) {
		// n2o emission prediction that needs to be deleted
		int theId = 1;

		// delete the emission
		appDao.deleteN2oEmissionPrediction(theId);

		System.out.println("Emission prediction deleted");
	}
	private void findN2oEmissionPrediction(AppDao appDao) {
		// n2o emission prediction that needs to be found
		int theId = 1;
		N2oEmissionPrediction tempN2oEmissionPrediction = appDao.findN2oEmissionPredictionById(theId);

		System.out.println("N2o emission prediction: " + tempN2oEmissionPrediction);
	}


	// create sector with multiple emissions
	private void createSectorWithEmissions(AppDao appDao) {
		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// create emissions
		Co2Emission tempCo2Emission = new Co2Emission(200, 200);
		Ch4Emission tempCh4Emission = new Ch4Emission(300, 300);
		N2oEmission tempN2oEmission = new N2oEmission(400,400);

		// sectorName
		SectorName tempSectorName = new SectorName("RO");

		// add emissions
		tempSector.add(tempCo2Emission);
		tempSector.add(tempCh4Emission);
		tempSector.add(tempN2oEmission);

		// add sector name
		tempSector.setSectorName(tempSectorName);

		appDao.save(tempSector);

		System.out.println("Sector created: " + tempSector);
	}


	// create sector with multiple emission predictions
	private void createSectorWithEmissionPredictions(AppDao appDao) {
		// create sector
		Sector tempSector = new Sector(1, 1, 1,1,1,1);

		// create emissions
		Co2EmissionPrediction tempCo2EmissionPrediction = new Co2EmissionPrediction(100, 100);
		Ch4EmissionPrediction tempCh4EmissionPrediction = new Ch4EmissionPrediction(200, 200);
		N2oEmissionPrediction tempN2oEmissionPrediction = new N2oEmissionPrediction(300, 300);

		// sectorName
		SectorName tempSectorName = new SectorName("RO");

		// add emissions
		tempSector.add(tempCo2EmissionPrediction);
		tempSector.add(tempCh4EmissionPrediction);
		tempSector.add(tempN2oEmissionPrediction);

		// add sector name
		tempSector.setSectorName(tempSectorName);

		appDao.save(tempSector);

		System.out.println("Sector created: " + tempSector);
	}

	// project methods
	private void createProject(AppDao appDao) {
		// create project
		Project tempProject = new Project("Project",200,"Project desc");

		// save project
		appDao.save(tempProject);

		System.out.println("Project created: " + tempProject);

	}
	private void updateProject(AppDao appDao) {

		// project that needs to be updated
		int theId = 1;
		Project tempProject = appDao.findProjectById(theId);

		// update the project
		tempProject.setName("Updated");

		// commit the changes
		appDao.update(tempProject);

		System.out.println("Project: " + tempProject);

	}
	private void deleteProject(AppDao appDao) {

		// project that needs to be deleted
		int theId = 1;
		Project tempProject = appDao.findProjectById(theId);

		// delete the project
		appDao.deleteProject(theId);

		System.out.println("Project deleted");


	}
	private void findProjectById(AppDao appDao) {

		// project that needs to be found
		int theId = 1;
		Project tempProject = appDao.findProjectById(theId);

		System.out.println("Project: " + tempProject);
	}

	// future prediction methods
	private void createFuturePrediction(AppDao appDao) {
		// create future prediction
		FuturePrediction tempFuturePrediction = new FuturePrediction(200,1, 1,1,1);

		// save future prediction
		appDao.save(tempFuturePrediction);

		System.out.println("Future prediction created: " + tempFuturePrediction);

	}
	private void updateFuturePrediction(AppDao appDao) {

		// future prediction that needs to be updated
		int theId = 1;
		FuturePrediction tempFuturePrediction = appDao.findFuturePredictionById(theId);

		// update the future prediction
		tempFuturePrediction.setTimePeriod(10000);

		// commit the changes
		appDao.update(tempFuturePrediction);

		System.out.println("Future prediction: " + tempFuturePrediction);
	}
	private void deleteFuturePrediction(AppDao appDao) {

		// future prediction that needs to be deleted
		int theId = 1;

		// delete the future prediction
		appDao.deleteFuturePrediction(theId);

		System.out.println("Future Prediction deleted");

	}

	private void findFuturePredictionById(AppDao appDao) {

		// future prediction that needs to be found
		int theId = 1;
		FuturePrediction tempFuturePrediction = appDao.findFuturePredictionById(theId);

		System.out.println("Future prediction: " + tempFuturePrediction);

	}


}
