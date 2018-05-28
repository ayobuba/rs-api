package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Gender;
import com.infocell.barksforte.irsapi.repositories.GenderRepository;

@Service
public class GenderDao {
	
	@Autowired
	private GenderRepository repo;
	
	
	
	public Gender save(Gender obj) {
		
		return repo.save(obj);
	}
	
	public List<Gender> findAll(){
		return repo.findAll();
	}

	public Gender findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Gender obj) {
		repo.delete(obj);
		
		
	}
}
