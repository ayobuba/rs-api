package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Tcc;
import com.infocell.barksforte.irsapi.repositories.TccRepository;

@Service
public class TccDao {
	
	@Autowired
	private TccRepository repo;
	
	
	
	public Tcc save(Tcc obj) {
		
		return repo.save(obj);
	}
	
	public List<Tcc> findAll(){
		return repo.findAll();
	}

	public Tcc findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Tcc obj) {
		repo.delete(obj);
		
		
	}
}
