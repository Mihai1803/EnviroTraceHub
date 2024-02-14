package com.enivironmentalchange.rest;
import com.enivironmentalchange.entities.countries.Country;
import com.enivironmentalchange.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins = "http://localhost:3000")
public class CountryRestController {

    private CountryService countryService;

    @Autowired
    public CountryRestController(CountryService countryService) {
        this.countryService = countryService;
    }

    @GetMapping("/country/{countryId}")
    public ResponseEntity<Country> getCountry(@PathVariable int countryId) {
        Country theCountry = countryService.findById(countryId);

       if (theCountry == null) {
           throw new RuntimeException("Country id not found - " + countryId);
       }

        return ResponseEntity.ok(theCountry);
    }

    @PostMapping("/country")
    public ResponseEntity<Country> addCountry(@RequestBody Country theCountry) {
        theCountry.setId(0);
        try {
            countryService.save(theCountry);
            return ResponseEntity.ok(theCountry);
        } catch (RuntimeException exception) {
            throw new RuntimeException("Could not create country");
        }
    }

    @PutMapping("/country/{countryId}")
    public ResponseEntity<Country> updateCountry(@RequestBody Country updatedCountry, @PathVariable("countryId") int theId) {
        Country theCountry = countryService.findById(theId);
        if (theCountry == null) {
            throw new RuntimeException("Country id not found - " + theId);
        }
        theCountry.setName(updatedCountry.getName());
        theCountry.setAverageGreenhouseGas(updatedCountry.getAverageGreenhouseGas());
        theCountry.setAverageTemperature(updatedCountry.getAverageTemperature());
        theCountry.setAverageWildfire(updatedCountry.getAverageWildfire());
        theCountry.setAverageNaturalDisaster(updatedCountry.getAverageNaturalDisaster());

        try {
            countryService.update(theCountry);
        } catch (RuntimeException exception) {
            exception.printStackTrace();
        }

        return ResponseEntity.ok(theCountry);
    }

    @DeleteMapping("/country/{countryId}")
    public ResponseEntity<String> deleteCountry(@PathVariable("countryId")  int theId) {
        try {
            countryService.delete(theId);
            return  ResponseEntity.ok("Country deleted");
        } catch (RuntimeException exception) {
            exception.printStackTrace();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Country not found");
        }
    }
}
