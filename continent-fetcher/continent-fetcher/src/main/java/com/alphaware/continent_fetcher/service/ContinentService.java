package com.alphaware.continent_fetcher.service;

import com.alphaware.continent_fetcher.entity.Continent;
import com.alphaware.continent_fetcher.repository.ContinentRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;
import java.util.List;

@Service
public class ContinentService {

    @Autowired
    private ContinentRepository continentRepository;

    @Value("${dummy.content.url}")
    String apiUrl;

    private static final Logger log = LoggerFactory.getLogger(ContinentService.class);

    /*
    * This service will fetch the data from URL and save it into our database
    */
    public void fetchAndSaveAllDataFromURL(){
        log.info("Fetching data from URL.");
        try {
            RestTemplate restTemplate = new RestTemplate();
            Continent[] continents = restTemplate.getForObject(apiUrl, Continent[].class);
            log.info("RestAPI Call Successful.");
            if (continents != null) {
                continentRepository.saveAll(Arrays.asList(continents));
                log.info("Saved Successfully.");
            }
        }catch (RestClientException rexc){
            log.error("Exception occurred");
            throw new RestClientException("Given URL is not Reachable");
        }
    }
    public List<Continent> getContinentList(){
        log.info("Fetching All data.");
        return continentRepository.findAll();
    }
    public Continent getContinentById(Long id){
        log.info("Fetching data according to ID.");
        return continentRepository.findById(id).orElseThrow(()-> new NullPointerException("Data not available with the given ID"));
    }
}
