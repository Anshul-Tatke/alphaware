package com.alphaware.continent_fetcher.controller;

import com.alphaware.continent_fetcher.entity.Continent;
import com.alphaware.continent_fetcher.service.ContinentService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/continent/")
public class ContinentController {

    private static final Logger log = LoggerFactory.getLogger(ContinentController.class);
    @Autowired
    private ContinentService continentService;

    /*
    * This API will fetch data and save it into the H2 Database from the given Test URL.
    */
    @GetMapping("/get-data-from-url")
    public String fetchAndSaveAllDataFromURL(){
        log.info("FetchAndSaveAllDataFromURL Started");
        continentService.fetchAndSaveAllDataFromURL();
        return "Data is fetch and save Successfully.";
    }

    /*
    * This API will help to get the list of all the data present in out database
    */
    @GetMapping("/getAllData")
    public List<Continent> getContinentList(){
        return continentService.getContinentList();
    }

    /*
    * This API will help to fetch the Data on the basis of there respective ID
    */
    @GetMapping("/getById/{id}")
    public Continent getContinentById(@PathVariable long id){
        return continentService.getContinentById(id);
    }
}
