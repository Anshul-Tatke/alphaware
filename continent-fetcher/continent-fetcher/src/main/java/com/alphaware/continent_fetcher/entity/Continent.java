package com.alphaware.continent_fetcher.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class Continent {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String code;
    private String name;
    private String areaSqKm;
    private String population;
    private String countries;
    @ElementCollection
    private List<String> lines;
    @ElementCollection
    private List<String> oceans;
    @ElementCollection
    private List<String> developedCountries;
}
