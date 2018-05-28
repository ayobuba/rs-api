package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.States;
import com.infocell.barksforte.irsapi.repositories.StatesRepository;

@Service
public class StatesDao {
	
	@Autowired
	private StatesRepository repo;
	
	
	
	public States save(States obj) {
		
		return repo.save(obj);
	}
	
	public List<States> findAll(){
		return repo.findAll();
	}

	public States findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(States obj) {
		repo.delete(obj);
		
		
	}
}
