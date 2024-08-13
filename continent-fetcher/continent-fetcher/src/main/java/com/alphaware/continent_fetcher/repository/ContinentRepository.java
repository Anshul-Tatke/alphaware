package com.alphaware.continent_fetcher.repository;

import com.alphaware.continent_fetcher.entity.Continent;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContinentRepository extends JpaRepository<Continent,Long> {
}
