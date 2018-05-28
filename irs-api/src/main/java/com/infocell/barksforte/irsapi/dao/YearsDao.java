package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Years;
import com.infocell.barksforte.irsapi.repositories.YearsRepository;

@Service
public class YearsDao {
	
	@Autowired
	private YearsRepository repo;
	
	
	
	public Years save(Years obj) {
		
		return repo.save(obj);
	}
	
	public List<Years> findAll(){
		return repo.findAll();
	}

	public Years findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Years obj) {
		repo.delete(obj);
		
		
	}
}
