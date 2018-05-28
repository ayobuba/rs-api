package com.infocell.barksforte.irsapi.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infocell.barksforte.irsapi.entities.Bill;
import com.infocell.barksforte.irsapi.entities.Parastatal;
import com.infocell.barksforte.irsapi.repositories.ParastatalRepository;

@Service
public class ParastatalDao {
	
	@Autowired
	private ParastatalRepository repo;
	
	
	
	public Parastatal save(Parastatal obj) {
		
		return repo.save(obj);
	}
	
	public List<Parastatal> findAll(){
		return repo.findAll();
	}

	public Parastatal findOne(Integer id) {
		return repo.findOne(id);
		
	}
	
	public void delete(Parastatal obj) {
		repo.delete(obj);
		
		
	}
}
