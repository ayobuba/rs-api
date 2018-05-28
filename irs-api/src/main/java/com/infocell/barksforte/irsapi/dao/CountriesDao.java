package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Countries;
import com.infocell.barksforte.irsapi.repositories.CountriesRepository;

@Service
public class CountriesDao {
	
	@Autowired
	private CountriesRepository repo;
	
	
	
	public Countries save(Countries obj) {
		
		return repo.save(obj);
	}
	
	public List<Countries> findAll(){
		return repo.findAll();
	}

	public Countries findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Countries obj) {
		repo.delete(obj);
		
		
	}
}
