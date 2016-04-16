package com.example.entity;

import org.springframework.data.repository.*;

public interface CityRepository extends CrudRepository<City, Long> {

	City getCityByState(String state);
}
