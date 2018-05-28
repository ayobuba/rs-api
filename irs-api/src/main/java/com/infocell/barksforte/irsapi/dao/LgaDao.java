package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Lga;
import com.infocell.barksforte.irsapi.repositories.LgaRepository;

@Service
public class LgaDao {
	
	@Autowired
	private LgaRepository repo;
	
	
	
	public Lga save(Lga obj) {
		
		return repo.save(obj);
	}
	
	public List<Lga> findAll(){
		return repo.findAll();
	}

	public Lga findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Lga obj) {
		repo.delete(obj);
		
		
	}
}
