package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Months;
import com.infocell.barksforte.irsapi.repositories.MonthsRepository;

@Service
public class MonthsDao {
	
	@Autowired
	private MonthsRepository repo;
	
	
	
	public Months save(Months obj) {
		
		return repo.save(obj);
	}
	
	public List<Months> findAll(){
		return repo.findAll();
	}

	public Months findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Months obj) {
		repo.delete(obj);
		
		
	}
}
