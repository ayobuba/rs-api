package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Cities;
import com.infocell.barksforte.irsapi.repositories.CitiesRepository;

@Service
public class CitiesDao {
	
	@Autowired
	private CitiesRepository repo;
	
	
	
	public Cities save(Cities obj) {
		
		return repo.save(obj);
	}
	
	public List<Cities> findAll(){
		return repo.findAll();
	}

	public Cities findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Cities obj) {
		repo.delete(obj);
		
		
	}
}
