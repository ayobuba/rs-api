package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Colors;
import com.infocell.barksforte.irsapi.repositories.ColorsRepository;

@Service
public class ColorsDao {
	
	@Autowired
	private ColorsRepository repo;
	
	
	
	public Colors save(Colors obj) {
		
		return repo.save(obj);
	}
	
	public List<Colors> findAll(){
		return repo.findAll();
	}

	public Colors findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Colors obj) {
		repo.delete(obj);
		
		
	}
}
