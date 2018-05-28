package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Ministry;
import com.infocell.barksforte.irsapi.repositories.MinistryRepository;

@Service
public class MinistryDao {
	
	@Autowired
	private MinistryRepository repo;
	
	
	
	public Ministry save(Ministry obj) {
		
		return repo.save(obj);
	}
	
	public List<Ministry> findAll(){
		return repo.findAll();
	}

	public Ministry findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Ministry obj) {
		repo.delete(obj);
		
		
	}
}
