package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.City;
import com.example.entity.CityRepository;

@RestController
@RequestMapping("/city")
public class MyController {

	@Autowired
	CityRepository cityRepo;

	@RequestMapping(method = RequestMethod.GET)
	public List<City> listCity() {
		return (List<City>) cityRepo.findAll();
	}

	@RequestMapping(params = { "state" }, method = RequestMethod.GET)
	public City getCity(@RequestParam String state) {
		return cityRepo.getCityByState(state);
	}

}
